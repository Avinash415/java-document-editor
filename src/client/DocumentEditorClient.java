package client;

import core.*;
import persistence.*;

public class DocumentEditorClient {
    public static void main(String[] args) {
        Document document = new Document();
        Persistence persistence = new FileStorage(); // or new DBStorage();

        DocumentEditor editor = new DocumentEditor(document, persistence);

        editor.addText("Hello, world!");
        editor.addNewLine();
        editor.addText("This is a real-world document editor example.");
        editor.addNewLine();
        editor.addTabSpace();
        editor.addText("Indented text after a tab space.");
        editor.addNewLine();
        editor.addImage("picture.jpg");

        System.out.println(editor.renderDocument());

        editor.saveDocument();
    }
}
