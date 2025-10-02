package io.noties.markwon.html;

import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonVisitor;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Node;

/* loaded from: classes7.dex */
public class HtmlPlugin extends AbstractMarkwonPlugin {

    /* renamed from: io.noties.markwon.html.HtmlPlugin$1, reason: invalid class name */
    class AnonymousClass1 implements MarkwonVisitor.NodeVisitor<HtmlInline> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            if (((HtmlInline) node).g != null) {
                throw null;
            }
        }
    }

    /* renamed from: io.noties.markwon.html.HtmlPlugin$2, reason: invalid class name */
    class AnonymousClass2 implements MarkwonVisitor.NodeVisitor<HtmlBlock> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            if (((HtmlBlock) node).g != null) {
                throw null;
            }
        }
    }

    public interface HtmlConfigure {
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void c(MarkwonVisitor.Builder builder) {
        builder.a(HtmlBlock.class, new AnonymousClass2());
        builder.a(HtmlInline.class, new AnonymousClass1());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void f(MarkwonConfiguration.Builder builder) {
        throw null;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void h() {
        throw new IllegalStateException("Unexpected state, html-renderer is not defined");
    }
}
