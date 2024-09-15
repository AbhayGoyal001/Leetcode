

class Solution {
    static class Trie {
        List<int[]> a;

        Trie() {
            a = new ArrayList<>();
            a.add(new int[26]);
            Arrays.fill(a.get(0), -1);
        }

        void insertWord(String b) {
            int c = 0;
            for (char d : b.toCharArray()) {
                int e = d - 'a';
                if (a.get(c)[e] == -1) {
                    a.add(new int[26]);
                    Arrays.fill(a.get(a.size() - 1), -1);
                    a.get(c)[e] = a.size() - 1;
                }
                c = a.get(c)[e];
            }
        }

        void findPrefixes(String f, int g, int[] h) {
            int c = 0;
            for (int i = g; i < f.length(); ++i) {
                int e = f.charAt(i) - 'a';
                if (a.get(c)[e] == -1) {
                    return;
                }
                c = a.get(c)[e];
                h[i + 1] = Math.min(h[i + 1], h[g] + 1);
            }
        }
    }

    public int minValidStrings(String[] words, String target) {
        Trie a = new Trie();

        for (String b : words) {
            a.insertWord(b);
        }

        int c = target.length();
        int[] d = new int[c + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[0] = 0;

        for (int i = 0; i < c; ++i) {
            if (d[i] != Integer.MAX_VALUE) {
                a.findPrefixes(target, i, d);
            }
        }

        return d[c] == Integer.MAX_VALUE ? -1 : d[c];
    }
}
