package memento;

public class TextEditor {
    private TextCareTaker savedText = new TextCareTaker();
    private String text;

    public TextEditor() {
        this.text = "";
    }


    public TextCareTaker getSavedText() {
        return savedText;
    }

    public void setSavedText(TextCareTaker savedText) {
        this.savedText = savedText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String text) {
        modifyText(this.text + text);
    }

    public void modifyText(String newText) {
        savedText.AddMomento(new TextMemento(this.text));
        this.text = newText;
    }

    public void undo() {
        this.text = savedText.undo(new TextMemento(this.text)).getText();
    }

    public void redo() {
        this.text = savedText.redo(new TextMemento(this.text)).getText();
    }
}
