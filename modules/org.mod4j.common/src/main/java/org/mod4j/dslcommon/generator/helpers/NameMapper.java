package org.mod4j.dslcommon.generator.helpers;

public class NameMapper {
    
    private static final String IMPL_POSTFIX = "ImplBase";

    private static final String DAO_INTERFACE_POSTFIX = "Dao";
    private static final String DAO_CLASS_POSTFIX = "DaoImpl";
    private static final String DAO_BASE_INTERFACE_POSTFIX = "DaoBase";
    private static final String DAO_BASE_CLASS_POSTFIX = "DaoImplBase";
    
    private static final String LOCAL_SERVICE_INTERFACE_POSTFIX = "LocalService";
    private static final String LOCAL_SERVICE_CLASS_POSTFIX = "LocalServiceImpl";
    private static final String LOCAL_SERVICE_BASE_CLASS_POSTFIX = "LocalServiceImplBase";

    private static final String DOMAIN_SERVICE_INTERFACE_POSTFIX = "BusinessService";
    private static final String DOMAIN_SERVICE_CLASS_POSTFIX = "BusinessServiceImpl";

    private static final String TRANSLATOR_CLASS_POSTFIX = "Translator";
    
    public static final String BUSINESSRULES_PACKAGE = "businessrules";
    
    public static final String IMPLBASE_SUFFIX = "ImplBase";


    
    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainClass(String cls) {
        return StringHelpers.firstCharToUpper(cls);
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainClassPath(String cls) {
        String packageName = ProjectProperties.getDomainRootPackage();
        return packageName + "." + javaDomainClass(cls);
    }

    public static String javaDomainClassFolder(String cls) {
        String packageName = ProjectProperties.getDomainRootPackage();
        return packageName + "." + javaDomainClass(cls);
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainBaseClass(String cls) {
        return javaDomainClass(cls) + IMPL_POSTFIX;
    }
    /**
     * @param cls
     * @return The name of the Java class for name cls
     */

    public static String javaDomainBaseClassPath(String cls) {
        String packageName = ProjectProperties.getDomainRootPackage();
        return packageName + "." + javaDomainBaseClass(cls);
    }

    public static String javaDaoInterface(String cls) {
        return javaDomainClass(cls) + DAO_INTERFACE_POSTFIX;
    }

    public static String javaDaoInterfacePath(String cls) {
        String packageName = ProjectProperties.getDaoPackage();
        return packageName + "." + javaDaoInterface(cls);
    }

    public static String javaDaoClass(String cls) {
        return javaDomainClass(cls) + DAO_CLASS_POSTFIX;
    }

    public static String javaDaoClassPath(String cls) {
        String packageName = ProjectProperties.getDaoPackage();
        return packageName + "." + javaDaoClass(cls);
    }

    public static String javaGenericEnumClass() {
        return "GenericEnumUserType";
    }

    public static String javaGenericEnumClassPath() {
        String packageName = ProjectProperties.getDataRootPackage();
        return packageName + "." + javaGenericEnumClass();
    }

    public static String javaDaoBaseInterface(String cls) {
        return javaDomainClass(cls) + DAO_BASE_INTERFACE_POSTFIX;
    }

    public static String javaDaoBaseInterfacePath(String cls) {
        String packageName = ProjectProperties.getDaoPackage();
        return packageName + "." + javaDaoBaseInterface(cls);
    }

    public static String javaDaoBaseClass(String cls) {
        return javaDomainClass(cls) + DAO_BASE_CLASS_POSTFIX;
    }

    public static String javaDaoBaseClassPath(String cls) {
        String packageName = ProjectProperties.getDaoPackage();
        return packageName + "." + javaDaoBaseClass(cls);
    }

//  LOCAL SERVICES
    public static String javaLocalServiceInterface(String model) {
        return StringHelpers.firstCharToUpper(model) + LOCAL_SERVICE_INTERFACE_POSTFIX;
    }

    public static String javaLocalServiceInterfacePath(String model) {
        String packageName = ProjectProperties.getServiceRootPackage();
        return packageName + "." + javaLocalServiceInterface(model);
    }

    public static String javaLocalServiceClass(String model) {
        return StringHelpers.firstCharToUpper(model) + LOCAL_SERVICE_CLASS_POSTFIX;
    }

    public static String javaLocalServiceClassPath(String model) {
        String packageName = ProjectProperties.getServiceRootPackage();
        return packageName + "." + javaLocalServiceClass(model);
    }

    public static String javaLocalServiceBaseClass(String model) {
        return StringHelpers.firstCharToUpper(model) + LOCAL_SERVICE_BASE_CLASS_POSTFIX;
    }

    public static String javaLocalServiceBaseClassPath(String model) {
        String packageName = ProjectProperties.getServiceRootPackage();
        return packageName + "." + javaLocalServiceBaseClass(model);
    }

// DOMAIN SERVICES
    public static String javaDomainServiceInterface(String model) {
        return StringHelpers.firstCharToUpper(model) + DOMAIN_SERVICE_INTERFACE_POSTFIX;
    }

    public static String javaDomainServiceInterfacePath(String model) {
        String packageName = ProjectProperties.getBusinessRootPackage();
        return packageName + "." + javaDomainServiceInterface(model);
    }

    public static String javaDomainServiceClass(String model) {
        return StringHelpers.firstCharToUpper(model) + DOMAIN_SERVICE_CLASS_POSTFIX;
    }

    public static String javaDomainServiceClassPath(String model) {
        String packageName = ProjectProperties.getBusinessRootPackage();
        return packageName + "." + javaDomainServiceClass(model);
    }

    public static String javaTranslatorClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + TRANSLATOR_CLASS_POSTFIX;
    }

    public static String javaTranslatorClassPath(String classname) {
        String packageName = ProjectProperties.getDtoPackage() + ".translators";
        return packageName + "." + javaTranslatorClass(classname);
    }

    public static String hibernateMappingFile(String classname) {
        return javaDomainClass(classname) + ".hbm.xml";
    }

    /**
     * 
     * @return The full packagename of business rules
     */
    public static String getBusinessRulesPackage() {
        return ProjectProperties.getDomainRootPackage() + "." + BUSINESSRULES_PACKAGE;
    }
    
    public static String javaBusinessRuleBaseClass(String classname) {
        return javaDomainClass(classname) + IMPLBASE_SUFFIX;
    }

    public static String javaBusinessRuleBaseClassPath(String classname) {
        String packageName = ProjectProperties.getDomainRootPackage() + "." + BUSINESSRULES_PACKAGE;
        return packageName + "." + javaBusinessRuleBaseClass(classname);
    }

    public static String javaBusinessRuleClass(String classname) {
        return javaDomainClass(classname);
    }

    public static String javaBusinessRuleClassPath(String classname) {
        String packageName = ProjectProperties.getDomainRootPackage() + "." + BUSINESSRULES_PACKAGE;
        return packageName + "." + javaBusinessRuleClass(classname);
    }

    


}
