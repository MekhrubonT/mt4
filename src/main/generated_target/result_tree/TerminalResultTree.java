package result_tree;

public class TerminalResultTree implements ResultTree {
    private final String value;

    public TerminalResultTree(String tokenValue) {
        this.value = tokenValue;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
