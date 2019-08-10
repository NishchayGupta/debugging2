/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugging1;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author 1895314
 */
public class Debugging1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String json = FileReader.loadFileIntoString("json/catalog.json", "UTF-8");
        System.out.println(json);
        
        JSONArray mainObject = JSONArray.fromObject(json);
        JSONObject singleBook;
        String id_json, title, author;
        double price;
        boolean available;
        int year;
        for(int i=0;i<mainObject.size(); i++)
        {
            //displaying year above or eual to 2010
//            singleBook = mainObject.getJSONObject(i);
//            year = singleBook.getInt("year");
//            if(year<=2010)
//            {
//                id_json = singleBook.getString("id");
//                title = singleBook.getString("title");
//                author = singleBook.getString("author");
//                price = singleBook.getDouble("price");
//                available = singleBook.getBoolean("available");
//                System.out.println("{\n" + id_json + ",\n" + title + ",\n" + author + ",\n" + price + ",\n" + available + ",\n" + year + "\n}");
//            } 
            
            //only available books
            singleBook = mainObject.getJSONObject(i);
            available = singleBook.getBoolean("available");
            if(available)
           {
               year = singleBook.getInt("year");
               id_json = singleBook.getString("id");
               title = singleBook.getString("title");
               author = singleBook.getString("author");
               price = singleBook.getDouble("price");
               
               System.out.println("{\n" + id_json + ",\n" + title + ",\n" + author + ",\n" + price + ",\n" + available + ",\n" + year + "\n}");
           } 
        }    
    }
    
}