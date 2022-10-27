import controller.ManagerProduct;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        for (int i = 0;i < ManagerProduct.products.size();i++) {
            if (ManagerProduct.products.get(i).getId() == id){
                ManagerProduct.products.remove(i);
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/products");
        dispatcher.forward(req,resp);
    }
}
