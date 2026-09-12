class PrefixTree {
    private Node root;
    public PrefixTree() {
        this.root = new Node();
    }

    public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            if (!current.getChildren().containsKey(word.charAt(i))) {
                current.getChildren().put(word.charAt(i), new Node());
            }
            current = current.getChildren().get(word.charAt(i));
        }
        current.setIsWord(true);
    }

    public boolean search(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            if (current.getChildren().containsKey(word.charAt(i))) {
                current = current.getChildren().get(word.charAt(i));
            } else {
                return false;
            }
        }
        return current.getIsWord();
    }

    public boolean startsWith(String prefix) {
        Node current = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (current.getChildren().containsKey(prefix.charAt(i))) {
                current = current.getChildren().get(prefix.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

    static class Node {
        private Map<Character, Node> children;
        private boolean isWord;
        
        public Node() {
            this.children = new HashMap<>();
        }

        public Map<Character, Node> getChildren() {
            return this.children;
        }

        public boolean getIsWord() {
            return this.isWord;
        }

        public void setIsWord(boolean isWord) {
            this.isWord = isWord;
        }
    }
}
