package org.mod4j.dsl.datacontract.xtext;

import org.mod4j.eclipse.builder.Mod4jBuilder;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class DataContractDslEditorPlugin extends AbstractXtextEditorPlugin {
   private static DataContractDslEditorPlugin plugin;
   public static DataContractDslEditorPlugin getDefault() {
      return plugin;
   }

   private DataContractDslUtilities utilities = new DataContractDslUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public DataContractDslEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
   
   protected void refreshPluginActions() {
       super.refreshPluginActions();
       System.err.println("DataContractDslEditor.refreshPluginActions");
       Mod4jBuilder.initCrossx(); 
   }

}
