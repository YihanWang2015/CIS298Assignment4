package edu.kvcc.cis298.cis298assignment4.database;

/**
 * Created by bigy on 12/9/15.
 */
public class BeverageDBSchema {


    public static final class BeverageTable{
        public static final String NAME= "Beverage";


        public static final class Cols {
            public static final String BEVERAGEID = "id";
            public static final String BEVERAGENAME = "name";
            public static final String BEVERAGEPACK = "pack";
            public static final String BEVERAGEPRICE = "price";
            public static final String BEVERAGEACTIVE = "active";
        }
    }
}
