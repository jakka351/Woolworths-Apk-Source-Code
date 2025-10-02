package org.commonmark.node;

/* loaded from: classes8.dex */
public abstract class CustomBlock extends Block {
    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.p(this);
    }
}
