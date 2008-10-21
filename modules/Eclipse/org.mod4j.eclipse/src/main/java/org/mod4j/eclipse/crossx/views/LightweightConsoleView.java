package org.mod4j.eclipse.crossx.views;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.swt.widgets.Display;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

/**
 * Try to connect standard out to the console
 * 
 * @author jwa11799
 * 
 */
public class LightweightConsoleView extends ViewPart {
    private Text text;

    public void createPartControl(Composite parent) {
        text = new Text(parent, SWT.READ_ONLY | SWT.MULTI);
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                if (text.isDisposed())
                    return;
                final String toAppend = String.valueOf((char) b);

                Display.getCurrent().asyncExec(new Runnable() {
                    public void run() {
                        if (text.isDisposed())
                            return;
                        text.append(toAppend);
                    }
                });
            }
        };
        final PrintStream oldOut = System.out;
        System.setOut(new PrintStream(out));
        text.addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                System.setOut(oldOut);
            }
        });
    }

    public void setFocus() {
        text.setFocus();
    }
}