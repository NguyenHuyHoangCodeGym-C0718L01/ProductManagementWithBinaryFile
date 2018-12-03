package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
//            oos = new ObjectOutputStream(new FileOutputStream("/home/hoangnhb/IdeaProjects/ProductManagementWithBinaryFile/test"));
//            // create student
//            Product product1 = new Product(1, "sua", "vinamilk", 20000);
//            Product product2 = new Product(2, "che", "ThaiNguyen", 25000);
//            Product product3 = new Product(3, "gao", "TanTao", 50000);
//            // write student
//            oos.writeObject(product1);
//            oos.writeObject(product2);
//            oos.writeObject(product3);
//            System.out.println("Success...");
            ois = new ObjectInputStream(new FileInputStream("/home/hoangnhb/IdeaProjects/ProductManagementWithBinaryFile/test"));
            // read student
            while(true) {
                Product student = (Product) ois.readObject();
                // show student
                System.out.println(student.toString());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            oos.close();
            ois.close();
        }

    }
}
