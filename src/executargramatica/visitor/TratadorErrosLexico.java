package executargramatica.visitor;

import java.util.BitSet;
import javax.swing.DefaultListModel;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 *
 * @author noschang
 */
public class TratadorErrosLexico implements ANTLRErrorListener
{
    private final DefaultListModel modelo;

    public TratadorErrosLexico(DefaultListModel modelo)
    {
        this.modelo = modelo;
    }
    
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
        Lexer lexer = (Lexer) recognizer;
        String mensagem = "Erro sintático na linha " + line + ", coluna " + charPositionInLine + ": " + msg;
        
        modelo.addElement(mensagem);
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs)
    {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs)
    {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs)
    {

    }    
}
