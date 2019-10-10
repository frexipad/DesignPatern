package patternStratigy;

public class Context {

    public ITrie trie;

    public void appliquerStratigy(){
        trie.trie();
    }

    public void setTrie(ITrie trie) {
        this.trie = trie;
    }
}
