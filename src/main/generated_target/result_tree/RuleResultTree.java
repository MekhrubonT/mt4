package result_tree;

public class RuleResultTree implements ResultTree {
    final String currentRule;
    final ResultTree[] children;

    public RuleResultTree(String currentRule, ResultTree[] children) {
        this.currentRule = currentRule;
        this.children = children;
    }
}
