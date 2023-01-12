package com.test.restAssuredPrac;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Given below JSON array, fetch all nested keys and values.
 * Store the keys in an array list.
 * Store the values in an array list.
 * Final output should be,
 * keys = [k, k10, k11, k121, k120, k12, k14, k1, k221, k22]
 * values = [[1, 3, 5], 4, [4, 7, 9], v121, 6, v122]
 * <p>
 * This should work even if the number of nested objects vary.
 * Note: Feel free to take help from internet as this is quite complex. But make sure that you understand the code, you are able to execute it and then optimize it.
 * Hint: Use recursion logic.
 * Once you are done, feel free to download the solution code from the resources section.
 */
public class assignmnet1 {

    public static List<String> keysAL = new ArrayList<>();
    public static List<Object> valuesAL = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/assignmnet1.json");
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> expectedArray = objectMapper.readValue(file, new TypeReference<List<Map<String,Object>>>() {});
        for(Map<String,Object> map1 :expectedArray ){
            find(map1);
        }
        System.out.println(keysAL);
        System.out.println(valuesAL);

    }

    public static void find(Map<String, Object> maps) {
        for (Map.Entry<String, Object> entry : maps.entrySet()) {
            String k = entry.getKey();
            Object v = entry.getValue();
            if (v instanceof LinkedHashMap) {
                find((LinkedHashMap)v);
            } else {
                valuesAL.add(v);
            }
            keysAL.add(k);
        }

    }

}
