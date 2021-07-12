package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void printFieldsNamesTest() {
        SimpleData simpleData = new SimpleData();
        Field[] fields = simpleData.getClass().getDeclaredFields();
        int i = 0;

        for (Field f : fields) {
            assertEquals(f,fields[i]);
            i++;
            System.out.println(f.getName() + " as " + f.getType().getCanonicalName());
        }
        fields = simpleData.getClass().getSuperclass().getDeclaredFields();
        for (Field f : fields) {
            assertEquals(f,fields[i]);
            i++;
            System.out.println(f.getName() + " as " + f.getType().getCanonicalName());
        }
    }
    @Test
    void printFieldsNamesTest2() {
        WithCollectionData withCollectionData = new WithCollectionData();
        Field[] fields = withCollectionData.getClass().getDeclaredFields();
        int i = 0;


        for (Field f : fields) {
            assertEquals(f,fields[i]);
            i++;
            System.out.println(f.getName() + " as " + f.getType().getCanonicalName());
        }
        i = 0;

        fields = withCollectionData.getClass().getSuperclass().getDeclaredFields();

        for (Field f : fields) {
            assertEquals(f,fields[i]);
            i++;
            System.out.println(f.getName() + " as " + f.getType().getCanonicalName());
        }
    }

}