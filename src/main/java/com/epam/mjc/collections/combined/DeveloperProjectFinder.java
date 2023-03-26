package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {

    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        Set<String> set;
        for (String str : projects.keySet()) {
            set = projects.get(str);
            if (set.contains(developer)) {
                list.add(str);
            }
        }
        list.sort((o1, o2) -> {
            if (o1.length() == o2.length()){
                return o2.compareTo(o1);
            }
            return o1.compareTo(o2);
        });
        return list;
    }
}
