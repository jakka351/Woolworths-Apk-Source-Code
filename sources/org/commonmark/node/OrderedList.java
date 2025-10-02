package org.commonmark.node;

/* loaded from: classes8.dex */
public class OrderedList extends ListBlock {
    public String h;
    public Integer i;

    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.e(this);
    }
}
