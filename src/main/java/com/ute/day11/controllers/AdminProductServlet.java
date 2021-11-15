package com.ute.day11.controllers;

import com.ute.day11.beans.Product;
import com.ute.day11.models.ProductModel;
import com.ute.day11.utils.ServletUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdminProductServlet", value = "/Admin/Product/*")
public class AdminProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();
        if(path == null || path=="/")
        {
            path="/Index";
        }
        switch (path) {
            case "/Index":
                List<Product> list = ProductModel.findAll();
                request.setAttribute("products",list);
                ServletUtils.forward("/views/vwProduct/Index.jsp",request,response);
                break;
//            case "/Add":
//                ServletUtils.forward("/views/vwCategory/Add.jsp",request,response);
//                break;
//            case "/Edit":
//                int id=0;
//                try{
//                    id = Integer.parseInt(request.getParameter("id"));
//                }
//                catch (NumberFormatException e){
//
//                }
//                Category c = CategoryModel.findByID(id);
//                if(c!=null)
//                {
//                    request.setAttribute("category",c);
//                    ServletUtils.forward("/views/vwCategory/Edit.jsp",request,response);
//                    break;
//                }
//                else{
//                    //ServletUtils.redirect("/Admin/Category",request,response);
//                    ServletUtils.forward("/views/204.jsp",request,response);
//                }
            default:
                ServletUtils.forward("/views/404.jsp",request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String path = request.getPathInfo();
//        if(path == null || path=="/")
//        {
//            path="/Index";
//        }
//        switch (path) {
//            case "/Add":
//                addCategory(request, response);
//            case"/Delete":
//                deleteCategory(request,response);
//                break;
//            case"/Update":
//                updateCategory(request,response);
//                break;
//            default:
//                ServletUtils.forward("/views/404.jsp",request,response);
//                break;
//        }
    }

//    private void addCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("CatName");
//        Category c = new Category(name);
//        CategoryModel.add(c);
//        ServletUtils.forward("/views/vwCategory/Add.jsp", request, response);
//    }
//    private void updateCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("CatID"));
//        String name = request.getParameter("CatName");
//        Category c = new Category(id,name);
//        CategoryModel.update(c);
//        ServletUtils.redirect("/Admin/Category",request,response);
//    }
//    private void deleteCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("CatID"));
//        CategoryModel.delete(id);
//        ServletUtils.redirect("/Admin/Category",request,response);
//    }
}
