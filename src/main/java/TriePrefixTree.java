import java.util.HashMap;
import java.util.Map;

class TrieNode {
    public char c;
    public boolean isWord;
    public TrieNode[] children;
    public TrieNode(char c) {
        this.c = c;
        isWord = false;
        children = new TrieNode[26];
    }
}
class Trie {

    TrieNode root;
    public Trie() {
        root = new TrieNode('\0');
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(current.children[c - 'a'] == null) {
                current.children[c - 'a'] = new TrieNode(c);
            }
            current = current.children[c - 'a'];
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        TrieNode node = getNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    private TrieNode getNode (String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (current.children[c - 'a'] == null) {
                return null;
            }
            current = current.children[c - 'a'];
        }
        return current;
    }
}

public class TriePrefixTree {


}
