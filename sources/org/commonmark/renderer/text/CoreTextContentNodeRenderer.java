package org.commonmark.renderer.text;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.Document;
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
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.Text;
import org.commonmark.node.ThematicBreak;
import org.commonmark.renderer.NodeRenderer;

/* loaded from: classes8.dex */
public class CoreTextContentNodeRenderer extends AbstractVisitor implements NodeRenderer {
    public static void G(Node node, String str, String str2) {
        boolean z = false;
        boolean z2 = node.b != null;
        boolean z3 = (str == null || str.equals(str2)) ? false : true;
        if (str2 != null && !str2.equals("")) {
            z = true;
        }
        if (z2 || z3 || z) {
            throw null;
        }
        if (z2) {
            if (z3 || z) {
                throw null;
            }
        }
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void A(ThematicBreak thematicBreak) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void B(Paragraph paragraph) {
        paragraph.b.getClass();
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void D(ListItem listItem) {
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void b(Code code) {
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
        heading.b.getClass();
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void e(OrderedList orderedList) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void i(HardLineBreak hardLineBreak) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void l(BulletList bulletList) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void n(Link link) {
        G(link, link.h, link.g);
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void o(IndentedCodeBlock indentedCodeBlock) {
        String str = indentedCodeBlock.g;
        if (str.endsWith("\n")) {
            str.substring(0, str.length() - 1);
        }
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
        String str = fencedCodeBlock.l;
        if (str.endsWith("\n")) {
            str.substring(0, str.length() - 1);
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
        G(image, image.h, image.g);
    }
}
