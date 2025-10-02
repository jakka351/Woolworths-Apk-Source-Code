package org.commonmark.node;

/* loaded from: classes8.dex */
public class BulletList extends ListBlock {
    public String h;

    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.l(this);
    }
}
