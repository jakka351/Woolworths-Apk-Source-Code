package io.noties.markwon.core;

import io.noties.markwon.MarkwonVisitor;
import org.commonmark.node.Node;

/* loaded from: classes7.dex */
public class SimpleBlockNodeVisitor implements MarkwonVisitor.NodeVisitor<Node> {
    @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
    public final void a(MarkwonVisitor markwonVisitor, Node node) {
        markwonVisitor.f(node);
        int length = markwonVisitor.length();
        markwonVisitor.c(node);
        markwonVisitor.h(node, length);
        markwonVisitor.E(node);
    }
}
