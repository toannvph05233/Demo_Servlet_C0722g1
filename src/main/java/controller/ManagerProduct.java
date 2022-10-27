package controller;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ManagerProduct {
    public static List<Product> products = new ArrayList<>();

    static{
        products.add(new Product(1, "Toàn1", "https://znews-photo.zingcdn.me/w660/Uploaded/qhj_yvobvhfwbv/2018_07_18/Nguyen_Huy_Binh1.jpg", 2000));
        products.add(new Product(2, "Toàn2", "https://znews-photo.zingcdn.me/w660/Uploaded/qhj_yvobvhfwbv/2018_07_18/Nguyen_Huy_Binh1.jpg", 2000));
        products.add(new Product(3, "Toàn3", "https://znews-photo.zingcdn.me/w660/Uploaded/qhj_yvobvhfwbv/2018_07_18/Nguyen_Huy_Binh1.jpg", 2000));
    }
}
