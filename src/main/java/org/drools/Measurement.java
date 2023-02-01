
package org.drools;

public class Measurement {
    private String id;
    private String val;

    public Measurement(String id, String val) {
        super();
        this.id = id;
        this.val = val;
    }

    public String getId() {
        return id;
    }

    public String getVal() {
        return val;
    }

    public void setVal(final String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Measurement [");
        if (id != null)
            builder.append("id=").append(id).append(", ");
        if (val != null)
            builder.append("val=").append(val);
        builder.append("]");
        return builder.toString();
    }
}
