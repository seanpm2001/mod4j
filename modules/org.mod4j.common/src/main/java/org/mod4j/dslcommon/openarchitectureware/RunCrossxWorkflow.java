package org.mod4j.dslcommon.openarchitectureware;

import java.util.HashMap;
import java.util.Map;

import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

public class RunCrossxWorkflow {

    public ModelInfo crossxModel = null;
    /**
     * @param wfFile
     * @param modelfile
     * @param crossxfile
     * @throws Mod4jWorkflowException 
     */
    public void runWorkflow(String wfFile, String project, String modelfile, String crossxfile) throws Mod4jWorkflowException {
        System.err.println("Run [" + wfFile + "] on:");
        System.err.println("    modelfile  [" + modelfile + "]");
        System.err.println("    crossxfile [" + crossxfile + "]");

        Map<String, Object> slotContents = new HashMap<String, Object>();
        Map<String, String> properties = new HashMap<String, String>();

        properties.put("modelfile", modelfile);
        properties.put("crossxfile", "file:/"+ crossxfile);
        properties.put("project", project);

        WorkflowRunner runner = new WorkflowRunner();
        if (!runner.run(wfFile, new NullProgressMonitor(), properties, slotContents)){
            throw new Mod4jWorkflowException("ERROR(S) detected while running crossx workflow on "
                    + properties.get("modelfile") + "! See logging.");
        }
        
        Object tmp = properties.get("crossxModel");
        if( (tmp != null)  ) {
            if( (tmp instanceof ModelInfo ) ){
                crossxModel = (ModelInfo) tmp;
                System.err.println("Crossx Model of [" + crossxModel.getResource() + "]");
            } else {
                System.err.println("Crossx Model not empty");
            } 
        } else {
            System.err.println("Crossx Model NULL");
        }
        System.err.println("Crossx workflow SUCCESSFUL!");
    }
}
