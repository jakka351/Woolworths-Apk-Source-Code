package org.commonmark.node;

/* loaded from: classes8.dex */
public abstract class CustomNode extends Node {
    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.j(this);
    }
}
