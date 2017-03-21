package org.kie.test;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class Invoice  implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.Double total;

    private java.lang.String client;

    private java.util.List<org.kie.test.InvoiceLine> lines;

    private java.lang.String number;

    public Invoice() {

    }

    public java.lang.Double getTotal() {
        return this.total;
    }

    public void setTotal(  java.lang.Double total ) {
        this.total = total;
    }

    public java.lang.String getClient() {
        return this.client;
    }

    public void setClient(  java.lang.String client ) {
        this.client = client;
    }

    public java.util.List<org.kie.test.InvoiceLine> getLines() {
        return this.lines;
    }

    public void setLines(  java.util.List<org.kie.test.InvoiceLine> lines ) {
        this.lines = lines;
    }

    public java.lang.String getNumber() {
        return this.number;
    }

    public void setNumber(  java.lang.String number ) {
        this.number = number;
    }

    @Override
    public String toString() {
        String result =  "Invoice{" +
                "number='" + number + '\'' +
                ", client='" + client + '\'' +
                ", total=" + total +
                ", lines=";


        if (lines != null) {
            for (InvoiceLine line : lines) {
                result += "\\n";
                result += "line: " + line;
            }
        }
        result += '}';

        return result;

    }
}

