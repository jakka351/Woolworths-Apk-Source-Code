package io.noties.markwon;

import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.MarkwonVisitorImpl;
import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;

/* loaded from: classes7.dex */
public class SoftBreakAddsNewLinePlugin extends AbstractMarkwonPlugin {

    /* renamed from: io.noties.markwon.SoftBreakAddsNewLinePlugin$1, reason: invalid class name */
    class AnonymousClass1 implements MarkwonVisitor.NodeVisitor<SoftLineBreak> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            ((MarkwonVisitorImpl) markwonVisitor).m();
        }
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void c(MarkwonVisitor.Builder builder) {
        ((MarkwonVisitorImpl.BuilderImpl) builder).a(SoftLineBreak.class, new AnonymousClass1());
    }
}
