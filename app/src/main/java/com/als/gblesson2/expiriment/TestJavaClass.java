package com.als.gblesson2.expiriment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestJavaClass {
    public static String i;

    private void job(){
        i = "dfdfd";
        List<String> s = new ArrayList<>();
        List< ? extends Object> mask = s;
        Set<String> ss;
    }
}
