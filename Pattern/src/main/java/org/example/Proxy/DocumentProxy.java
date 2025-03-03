package org.example.Proxy;

public class DocumentProxy implements Document {
    private ReadDocument readDocument;
    private String filename;
    private String userRole;

    public DocumentProxy( String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }


    @Override
    public void Display() {
        if (!userRole.equals("admin")) {
            System.out.println("your acccess to document id denied");
        }

        if(readDocument == null) {
            readDocument = new ReadDocument(filename);
        }
        readDocument.Display();
    }
}
