package com.itstep.model;

import java.util.*;

public class User implements Comparable<User> {
    private final String name;
    private final String id;

    public User() {
        name = RandomGenerator.randomNameIdentifier();
        id = RandomGenerator.randomIdGenerator();
    }

    @Override
    public String toString() {
        return "User {name-> " + name +  " id-> " + id + "}";
    }

    @Override
    public int compareTo(User o) {
        if (name.compareTo(o.name) != 0) {
            return name.compareTo(o.name);
        } else if (id.compareTo(o.id) != 0) {
            return id.compareTo(o.id);
        } else {
            return 0;
        }
    }

    /**
     * Generate random name
     */
    private static class RandomGenerator {
        // class variable
        static final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
        static final Random rand = new Random();

        // consider using a Map<String,Boolean> to say whether the identifier is being used or not
        static final Set<String> identifiers = new HashSet<>();

        static String randomNameIdentifier() {
            StringBuilder builder = new StringBuilder();
            while(builder.toString().length() == 0) {
                int length = rand.nextInt(5)+5;
                for(int i = 0; i < length; i++) {
                    builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
                }
                if(identifiers.contains(builder.toString())) {
                    builder = new StringBuilder();
                }
            }
            return builder.toString();
        }

        /**
         * Generate random id
         */
        static String randomIdGenerator() {
            int desiredLength = 5;
            String random = UUID.randomUUID()
                    .toString()
                    .substring(0, desiredLength);
            return random;
        }
    }
}
