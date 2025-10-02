package org.commonmark.renderer.html;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.Document;
import org.commonmark.node.Emphasis;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Image;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Link;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;
import org.commonmark.node.ThematicBreak;
import org.commonmark.renderer.NodeRenderer;

/* loaded from: classes8.dex */
public class CoreHtmlNodeRenderer extends AbstractVisitor implements NodeRenderer {

    public static class AltTextVisitor extends AbstractVisitor {

        /* renamed from: a, reason: collision with root package name */
        public final StringBuilder f26864a = new StringBuilder();

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public final void i(HardLineBreak hardLineBreak) {
            this.f26864a.append('\n');
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public final void q(SoftLineBreak softLineBreak) {
            this.f26864a.append('\n');
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public final void w(Text text) {
            this.f26864a.append(text.g);
        }
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void A(ThematicBreak thematicBreak) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(org.commonmark.node.Paragraph r3) {
        /*
            r2 = this;
            org.commonmark.node.Node r0 = r3.f26855a
            org.commonmark.node.Block r0 = (org.commonmark.node.Block) r0
            if (r0 == 0) goto L13
            org.commonmark.node.Node r0 = r0.f26855a
            org.commonmark.node.Block r0 = (org.commonmark.node.Block) r0
            boolean r1 = r0 instanceof org.commonmark.node.ListBlock
            if (r1 == 0) goto L13
            org.commonmark.node.ListBlock r0 = (org.commonmark.node.ListBlock) r0
            boolean r0 = r0.g
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 0
            if (r0 == 0) goto L1d
            org.commonmark.node.Node r3 = r3.b
            if (r3 != 0) goto L1c
            return
        L1c:
            throw r1
        L1d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.renderer.html.CoreHtmlNodeRenderer.B(org.commonmark.node.Paragraph):void");
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void C(StrongEmphasis strongEmphasis) {
        Map map = Collections.EMPTY_MAP;
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void D(ListItem listItem) {
        Map map = Collections.EMPTY_MAP;
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void F(Emphasis emphasis) {
        Map map = Collections.EMPTY_MAP;
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void b(Code code) {
        Map map = Collections.EMPTY_MAP;
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor
    public final void c(Node node) {
        if (node.b != null) {
            throw null;
        }
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void d(Heading heading) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void e(OrderedList orderedList) {
        Integer num = orderedList.i;
        int iIntValue = num != null ? num.intValue() : 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iIntValue != 1) {
            linkedHashMap.put("start", String.valueOf(iIntValue));
        }
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void i(HardLineBreak hardLineBreak) {
        Map map = Collections.EMPTY_MAP;
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void l(BulletList bulletList) {
        Map map = Collections.EMPTY_MAP;
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void n(Link link) {
        new LinkedHashMap();
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void o(IndentedCodeBlock indentedCodeBlock) {
        Map map = Collections.EMPTY_MAP;
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void q(SoftLineBreak softLineBreak) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void r(Document document) {
        if (document.b != null) {
            throw null;
        }
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void s(BlockQuote blockQuote) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void t(FencedCodeBlock fencedCodeBlock) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strSubstring = fencedCodeBlock.k;
        if (strSubstring != null && !strSubstring.isEmpty()) {
            int iIndexOf = strSubstring.indexOf(" ");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            linkedHashMap.put("class", "language-" + strSubstring);
        }
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void v(HtmlBlock htmlBlock) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void w(Text text) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void x(HtmlInline htmlInline) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void y(Image image) {
        new AltTextVisitor().y(image);
        new LinkedHashMap();
        throw null;
    }
}
