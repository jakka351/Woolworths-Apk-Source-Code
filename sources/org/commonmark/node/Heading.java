package org.commonmark.node;

/* loaded from: classes8.dex */
public class Heading extends Block {
    public int g;

    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.d(this);
    }
}
