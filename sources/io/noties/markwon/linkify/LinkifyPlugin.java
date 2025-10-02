package io.noties.markwon.linkify;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.SpannableBuilder;
import io.noties.markwon.core.CorePlugin;
import io.noties.markwon.core.CoreProps;
import org.commonmark.node.Link;

/* loaded from: classes7.dex */
public class LinkifyPlugin extends AbstractMarkwonPlugin {

    /* renamed from: io.noties.markwon.linkify.LinkifyPlugin$1, reason: invalid class name */
    class AnonymousClass1 implements MarkwonPlugin.Action<CorePlugin> {
        @Override // io.noties.markwon.MarkwonPlugin.Action
        public final void a(MarkwonPlugin markwonPlugin) {
            ((CorePlugin) markwonPlugin).f24199a.add(new LinkifyTextAddedListener());
        }
    }

    public static class LinkifyCompatTextAddedListener extends LinkifyTextAddedListener {
        @Override // io.noties.markwon.linkify.LinkifyPlugin.LinkifyTextAddedListener
        public final boolean b(SpannableStringBuilder spannableStringBuilder) {
            return Linkify.addLinks(spannableStringBuilder, 7);
        }
    }

    public static class LinkifyTextAddedListener implements CorePlugin.OnTextAddedListener {
        @Override // io.noties.markwon.core.CorePlugin.OnTextAddedListener
        public final void a(MarkwonVisitor markwonVisitor, String str, int i) {
            SpanFactory spanFactoryA = markwonVisitor.k().g.a(Link.class);
            if (spanFactoryA == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (b(spannableStringBuilder)) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
                    return;
                }
                RenderProps renderPropsG = markwonVisitor.g();
                SpannableBuilder spannableBuilderBuilder = markwonVisitor.builder();
                for (URLSpan uRLSpan : uRLSpanArr) {
                    renderPropsG.a(CoreProps.e, uRLSpan.getURL());
                    SpannableBuilder.c(spannableBuilderBuilder, spanFactoryA.a(markwonVisitor.k(), renderPropsG), spannableStringBuilder.getSpanStart(uRLSpan) + i, spannableStringBuilder.getSpanEnd(uRLSpan) + i);
                }
            }
        }

        public boolean b(SpannableStringBuilder spannableStringBuilder) {
            return Linkify.addLinks(spannableStringBuilder, 7);
        }
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void a(MarkwonPlugin.Registry registry) {
        registry.b(new AnonymousClass1());
    }
}
