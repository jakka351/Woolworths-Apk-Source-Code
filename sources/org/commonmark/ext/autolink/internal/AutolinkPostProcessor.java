package org.commonmark.ext.autolink.internal;

import YU.a;
import java.util.Iterator;
import java.util.List;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Link;
import org.commonmark.node.Node;
import org.commonmark.node.SourceSpan;
import org.commonmark.node.Text;
import org.commonmark.parser.PostProcessor;
import org.nibor.autolink.LinkExtractor;
import org.nibor.autolink.LinkSpan;
import org.nibor.autolink.LinkType;
import org.nibor.autolink.Span;

/* loaded from: classes8.dex */
public class AutolinkPostProcessor implements PostProcessor {

    /* renamed from: a, reason: collision with root package name */
    public LinkExtractor f26811a;

    public class AutolinkVisitor extends AbstractVisitor {

        /* renamed from: a, reason: collision with root package name */
        public int f26812a = 0;

        public AutolinkVisitor() {
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public final void n(Link link) {
            this.f26812a++;
            c(link);
            this.f26812a--;
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public final void w(Text text) {
            if (this.f26812a == 0) {
                String str = text.g;
                List listE = text.e();
                SourceSpan sourceSpan = listE.size() == 1 ? (SourceSpan) listE.get(0) : null;
                Iterator it = AutolinkPostProcessor.this.f26811a.a(str).iterator();
                Text text2 = text;
                while (it.hasNext()) {
                    Span span = (Span) it.next();
                    if (text2 == text && !it.hasNext() && !(span instanceof LinkSpan)) {
                        return;
                    }
                    int beginIndex = span.getBeginIndex();
                    int endIndex = span.getEndIndex();
                    Text text3 = new Text(str.substring(beginIndex, endIndex));
                    if (sourceSpan != null) {
                        text3.b(sourceSpan.a(beginIndex, endIndex));
                    }
                    if (span instanceof LinkSpan) {
                        String strA = text3.g;
                        if (((LinkSpan) span).getType() == LinkType.e) {
                            strA = a.A("mailto:", strA);
                        }
                        Node link = new Link(strA, null);
                        link.c(text3);
                        link.h(text3.e());
                        text2.f(link);
                        text2 = link;
                    } else {
                        text2.f(text3);
                        text2 = text3;
                    }
                }
                text.j();
            }
        }
    }

    @Override // org.commonmark.parser.PostProcessor
    public final Node a(Node node) {
        node.a(new AutolinkVisitor());
        return node;
    }
}
