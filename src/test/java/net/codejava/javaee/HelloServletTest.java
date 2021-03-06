package net.codejava.javaee;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bmc.servelet.HelloServlet;
 
public class HelloServletTest {
 
    @Mock
    HttpServletRequest request;
 
    @Mock
    HttpServletResponse response;
 
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
 
    @Test
    public void testFullName() throws IOException, ServletException {
 
        when(request.getParameter("fn")).thenReturn("Poonam");
        when(request.getParameter("ln")).thenReturn("Maniar");
 
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
         
        when(response.getWriter()).thenReturn(pw);
 
        HelloServlet myServlet =new HelloServlet();
        myServlet.doPost(request, response);
        String result = sw.getBuffer().toString().trim();
        assertEquals(result, new String("Welcome: Poonam Maniar"));
 
    }
}