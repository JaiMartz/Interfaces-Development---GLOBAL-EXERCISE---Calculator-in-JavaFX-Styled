/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_global;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jairo Martínez
 */
public class FXMLDocumentControllerTest {
    
    public FXMLDocumentControllerTest() {
    }
    


    /**
     * Test of calculos method, of class FXMLDocumentController.
     */
    @Test
    public void testCalculos() {
        System.out.println("calculos");
        int opcion = 1;
        double input1 = 6.0;
        double input2 = 6.0;
        FXMLDocumentController instance = new FXMLDocumentController();
        double expResult = 12.0;
        double result = instance.calculos(opcion, input1, input2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
