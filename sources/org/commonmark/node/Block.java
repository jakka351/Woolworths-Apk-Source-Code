package org.commonmark.node;

/* loaded from: classes8.dex */
public abstract class Block extends Node {
    @Override // org.commonmark.node.Node
    public final Node d() {
        return (Block) this.f26855a;
    }

    @Override // org.commonmark.node.Node
    public final void g(Node node) {
        if (!(node instanceof Block)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f26855a = node;
    }
}
