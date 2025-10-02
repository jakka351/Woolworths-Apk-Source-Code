package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import io.noties.markwon.MarkwonVisitorFactory;
import io.noties.markwon.MarkwonVisitorImpl;
import io.noties.markwon.SpannableBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;

/* loaded from: classes7.dex */
class MarkwonImpl extends Markwon {

    /* renamed from: a, reason: collision with root package name */
    public final TextView.BufferType f24188a;
    public final Parser b;
    public final MarkwonVisitorFactory.AnonymousClass1 c;
    public final List d;
    public final boolean e;

    /* renamed from: io.noties.markwon.MarkwonImpl$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public MarkwonImpl(TextView.BufferType bufferType, Parser parser, MarkwonVisitorFactory.AnonymousClass1 anonymousClass1, List list, boolean z) {
        this.f24188a = bufferType;
        this.b = parser;
        this.c = anonymousClass1;
        this.d = list;
        this.e = z;
    }

    @Override // io.noties.markwon.Markwon
    public final void c(TextView textView, String str) {
        SpannableStringBuilder spannableStringBuilderD = d(str);
        List list = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((MarkwonPlugin) it.next()).g(textView, spannableStringBuilderD);
        }
        textView.setText(spannableStringBuilderD, this.f24188a);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((MarkwonPlugin) it2.next()).b(textView);
        }
    }

    @Override // io.noties.markwon.Markwon
    public final SpannableStringBuilder d(String str) {
        List list = this.d;
        Iterator it = list.iterator();
        String strI = str;
        while (it.hasNext()) {
            strI = ((MarkwonPlugin) it.next()).i(strI);
        }
        Node nodeA = this.b.a(strI);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((MarkwonPlugin) it2.next()).getClass();
        }
        MarkwonVisitorFactory.AnonymousClass1 anonymousClass1 = this.c;
        MarkwonVisitorImpl markwonVisitorImpl = new MarkwonVisitorImpl(anonymousClass1.b, new RenderPropsImpl(), new SpannableBuilder(), Collections.unmodifiableMap(((MarkwonVisitorImpl.BuilderImpl) anonymousClass1.f24192a).f24194a), new BlockHandlerDef());
        nodeA.a(markwonVisitorImpl);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((MarkwonPlugin) it3.next()).h();
        }
        SpannableBuilder spannableBuilder = markwonVisitorImpl.c;
        SpannableBuilder.SpannableStringBuilderReversed spannableStringBuilderReversed = new SpannableBuilder.SpannableStringBuilderReversed(spannableBuilder.d);
        Iterator it4 = spannableBuilder.e.iterator();
        while (it4.hasNext()) {
            SpannableBuilder.Span span = (SpannableBuilder.Span) it4.next();
            spannableStringBuilderReversed.setSpan(span.f24198a, span.b, span.c, span.d);
        }
        return (TextUtils.isEmpty(spannableStringBuilderReversed) && this.e && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannableStringBuilderReversed;
    }
}
