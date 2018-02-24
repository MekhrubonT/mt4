package result_tree;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RuleResultTree implements ResultTree {
    private final String currentRule;
    private final ResultTree[] children;

    public RuleResultTree(String currentRule, ResultTree[] children) {
        this.currentRule = currentRule;
        this.children = children;
    }

    @Override
    public String toString() {
        return Arrays.stream(children).map(ResultTree::toString).collect(Collectors.joining());
    }
}
