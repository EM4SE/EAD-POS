package pos.combox;

import javax.swing.JComboBox;
import pos.combox.CustomComboBox;

public class ComboBoxSuggestion<E> extends JComboBox<E> {

    public ComboBoxSuggestion() {
         setUI(new ComboSuggestionUI());
    }
}
