 public static String findLongestCommonPrefix(String... values) {
        if (values == null) {
            return null;
        }
       
        int shortestIndex = 0, len = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i].length() < len) {
                len = values[i].length();
                shortestIndex = i;
            }
        }
       
        for (int i = 0; i < values.length; i++) {
            if (i == shortestIndex) {
                continue;
            }
            int newLength = len;
            while (!values[i].startsWith(values[shortestIndex].substring(0, newLength)) && newLength > 0) {
                newLength--;
                len = newLength;
            }
        }
        return values[shortestIndex].substring(0, len);

    }


    public void testFindLongestCommonPrefix() throws Exception {
        assertEquals("Hell",LongestCommonPrefix.findLongestCommonPrefix("Hello", "HelloMan", "Hellio", "Hellan","Hellooooou"));
        assertEquals("Mont",LongestCommonPrefix.findLongestCommonPrefix("Monterrey", "MonteOlivos", "Montgomery", "Montreal","Montar"));
    }
