package com.progdawn.criminalintent.database;

/**
 * Created by Dawn Myers on 5/6/2017.
 */

public class CrimeDbSchema {

    public static final class CrimeTable{
        public static final String NAME = "crimes";

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
