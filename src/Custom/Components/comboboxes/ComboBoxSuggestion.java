package Custom.Components.comboboxes;

import javax.swing.JComboBox;
import Custom.Components.comboboxes.CustomComboBox;

public class ComboBoxSuggestion<E> extends JComboBox<E> {

    public ComboBoxSuggestion() {
         setUI(new ComboSuggestionUI());
    }
}
