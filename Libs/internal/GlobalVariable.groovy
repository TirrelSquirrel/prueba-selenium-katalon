package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object pageLoadWait
     
    /**
     * <p></p>
     */
    public static Object producto
     
    /**
     * <p></p>
     */
    public static Object emailLogin
     
    /**
     * <p></p>
     */
    public static Object passLogin
     
    /**
     * <p></p>
     */
    public static Object emailRegister
     
    /**
     * <p></p>
     */
    public static Object nameRegister
     
    /**
     * <p></p>
     */
    public static Object passRegister
     
    /**
     * <p></p>
     */
    public static Object alternativeemailRegister
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            pageLoadWait = selectedVariables['pageLoadWait']
            producto = selectedVariables['producto']
            emailLogin = selectedVariables['emailLogin']
            passLogin = selectedVariables['passLogin']
            emailRegister = selectedVariables['emailRegister']
            nameRegister = selectedVariables['nameRegister']
            passRegister = selectedVariables['passRegister']
            alternativeemailRegister = selectedVariables['alternativeemailRegister']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
