package io.noties.markwon;

import org.commonmark.node.Node;
import org.commonmark.node.Visitor;

/* loaded from: classes7.dex */
public interface MarkwonVisitor extends Visitor {

    public interface BlockHandler {
    }

    public interface Builder {
        Builder a(Class cls, NodeVisitor nodeVisitor);
    }

    public interface NodeVisitor<N extends Node> {
        void a(MarkwonVisitor markwonVisitor, Node node);
    }

    void E(Node node);

    void a(int i, Object obj);

    SpannableBuilder builder();

    void c(Node node);

    void f(Node node);

    RenderProps g();

    void h(Node node, int i);

    MarkwonConfiguration k();

    int length();

    void m();

    boolean u(Node node);
}
