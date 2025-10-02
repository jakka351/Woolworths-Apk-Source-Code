package io.noties.markwon.ext.strikethrough;

import android.text.style.StrikethroughSpan;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import java.util.Collections;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.ext.gfm.strikethrough.StrikethroughExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;

/* loaded from: classes7.dex */
public class StrikethroughPlugin extends AbstractMarkwonPlugin {

    /* renamed from: io.noties.markwon.ext.strikethrough.StrikethroughPlugin$1, reason: invalid class name */
    class AnonymousClass1 implements SpanFactory {
        @Override // io.noties.markwon.SpanFactory
        public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
            return new StrikethroughSpan();
        }
    }

    /* renamed from: io.noties.markwon.ext.strikethrough.StrikethroughPlugin$2, reason: invalid class name */
    class AnonymousClass2 implements MarkwonVisitor.NodeVisitor<Strikethrough> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            Strikethrough strikethrough = (Strikethrough) node;
            int length = markwonVisitor.length();
            markwonVisitor.c(strikethrough);
            markwonVisitor.h(strikethrough, length);
        }
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void c(MarkwonVisitor.Builder builder) {
        builder.a(Strikethrough.class, new AnonymousClass2());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void d(MarkwonSpansFactory.Builder builder) {
        builder.b(Strikethrough.class, new AnonymousClass1());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void e(Parser.Builder builder) {
        builder.a(Collections.singleton(new StrikethroughExtension()));
    }
}
