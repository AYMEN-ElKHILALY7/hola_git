import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recibir datos desde el formulario
        String tipoFicha = request.getParameter("tipoFicha");
        String posicion = request.getParameter("posicion");

        // Lógica usando las clases Java
        CrearFicha ficha = new CrearFicha(tipoFicha, "Blanca", posicion);
        MovimientoFicha movimiento = new MovimientoFicha();
        // Aquí puedes llamar a métodos de MovimientoFicha para obtener movimientos
        String resultado = "Ficha seleccionada: " + ficha.getTipoFicha() + ", Posición: " + ficha.getPosicionInicial();

        // Enviar resultado de vuelta al HTML
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
