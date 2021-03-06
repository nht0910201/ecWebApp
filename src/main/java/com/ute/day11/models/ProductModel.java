package com.ute.day11.models;

import com.ute.day11.beans.Category;
import com.ute.day11.beans.Product;
import com.ute.day11.utils.DbUtils;
import org.sql2o.Connection;

import java.util.List;

public class ProductModel {

        public static List<Product> findAll(){
            final String query = "select * from products";
            try (Connection con = DbUtils.getConnection()) {
                return con.createQuery(query)
                        .executeAndFetch(Product.class);
            }
        }

        public static void add(Product p){
            String insertSql = "insert into products(ProName,TinyDes,FullDes,Price,CatID,Quantity) values (:ProName,:TinyDes,:FullDes,:Price,:CatID,:Quantity)";
            try (Connection con = DbUtils.getConnection()) {
                con.createQuery(insertSql)
                        .addParameter("ProName", p.getProName())
                        .addParameter("TinyDes", p.getTinyDes())
                        .addParameter("FullDes",p.getFullDes())
                        .addParameter("Price", p.getPrice())
                        .addParameter("CatID", p.getCatID())
                        .addParameter("Quantity", p.getQuantity())
                        .executeUpdate();
            }
        }
    public static List<Product> findByCatId(int catId){
        final String query = "select * from products where CatID = :CatID";
        try (Connection con = DbUtils.getConnection()) {
            return con.createQuery(query)
                    .addParameter("CatID",catId)
                    .executeAndFetch(Product.class);
        }
    }
        public static Product findByID(int id){
            final String query = "select * from products where ProID=:ProID";
            try (Connection con = DbUtils.getConnection()) {
                List<Product> list = con.createQuery(query)
                        .addParameter("ProID",id)
                        .executeAndFetch(Product.class);
                if(list.size()==0)
                {
                    return null;
                }
                return list.get(0);
            }
        }
        public static void update(Product p){
            String Sql = "UPDATE products SET  ProName = :proname, TinyDes = :tinydes, FullDes = :fulldes, Price = :price, CatID = :catid, Quantity = :quantity WHERE ProID = :proid";
            try (Connection con = DbUtils.getConnection()) {
                con.createQuery(Sql)
                        .addParameter("proname", p.getProName())
                        .addParameter("tinydes", p.getTinyDes())
                        .addParameter("fulldes", p.getFullDes())
                        .addParameter("price", p.getPrice())
                        .addParameter("catid", p.getCatID())
                        .addParameter("quantity", p.getQuantity())
                        .addParameter("proid", p.getProID())
                        .executeUpdate();
            }
        }
        public static void delete(int id){
            String Sql = "delete from products where ProID=:ProID";
            try (Connection con = DbUtils.getConnection()) {
                con.createQuery(Sql)
                        .addParameter("ProID",id)
                        .executeUpdate();
            }
        }

}
