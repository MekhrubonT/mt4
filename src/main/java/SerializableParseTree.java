import antlr.generated.GrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SerializableParseTree implements Serializable {
    private static final long serialVersionUID = 5753798495360374298L;

    private final String text;
    private final SerializableParseTree[] children;
    private final boolean ruleHelper;

    public SerializableParseTree(ParseTree tree) {
        ruleHelper = tree instanceof GrammarParser.Rule_helperContext;
        text = tree.getText();
        List<SerializableParseTree> serializableParseTrees = new ArrayList<>();
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            if (!(child instanceof TerminalNodeImpl) || !Pattern.matches("\\s+", child.getText()))
                serializableParseTrees.add(new SerializableParseTree(child));
        }
        children = serializableParseTrees.toArray(new SerializableParseTree[0]);
    }


    public String getText() {
        return text;
    }

    public int getChildCount() {
        return children.length;
    }

    public SerializableParseTree getChild(int i) {
        return children[i];
    }

    public boolean isRuleHelper() {
        return ruleHelper;
    }
}
