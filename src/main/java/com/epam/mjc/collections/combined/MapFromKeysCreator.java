package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {

    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new LinkedHashMap<>();
        int i;
        String s;
        for (String key : sourceMap.keySet()) {
            i = key.length();
            s = key;
            if (!map.containsKey(i)) {
                Set<String> set = new HashSet<>();
                set.add(s);
                map.put(key.length(), set);
            } else {
                Set<String> set = map.get(i);
                set.add(s);
            }
        }
        return map;
    }
}
