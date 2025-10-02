package org.commonmark.renderer.markdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;
import org.commonmark.node.ThematicBreak;
import org.commonmark.renderer.NodeRenderer;

/* loaded from: classes8.dex */
public class CoreMarkdownNodeRenderer extends AbstractVisitor implements NodeRenderer {

    public static class BulletListHolder extends ListHolder {
    }

    public static class LineBreakVisitor extends AbstractVisitor {

        /* renamed from: a, reason: collision with root package name */
        public boolean f26866a;

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public final void i(HardLineBreak hardLineBreak) {
            c(hardLineBreak);
            this.f26866a = true;
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public final void q(SoftLineBreak softLineBreak) {
            c(softLineBreak);
            this.f26866a = true;
        }
    }

    public static class ListHolder {
    }

    public static class OrderedListHolder extends ListHolder {
    }

    public static int G(String str, String str2) {
        int iIndexOf = 0;
        int iMax = 0;
        while (iIndexOf < str2.length() && (iIndexOf = str2.indexOf(str, iIndexOf)) != -1) {
            int i = 0;
            do {
                iIndexOf += str.length();
                i++;
            } while (str2.startsWith(str, iIndexOf));
            iMax = Math.max(i, iMax);
        }
        return iMax;
    }

    public static void H(int i, String str) {
        new StringBuilder(str.length() * i);
        for (int i2 = 0; i2 < i; i2++) {
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
    public final void C(StrongEmphasis strongEmphasis) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void D(ListItem listItem) {
        throw new IllegalStateException("Unknown list holder type: null");
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void F(Emphasis emphasis) {
        emphasis.g.getClass();
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void b(Code code) {
        String str = code.g;
        if (G("`", str) + 1 > 0 || str.startsWith("`") || str.endsWith("`") || !str.startsWith(" ") || !str.endsWith(" ")) {
            throw null;
        }
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = length;
                break;
            } else if (str.charAt(i) != ' ') {
                break;
            } else {
                i++;
            }
        }
        if (i == length) {
            throw null;
        }
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
        if (heading.g <= 2) {
            LineBreakVisitor lineBreakVisitor = new LineBreakVisitor();
            lineBreakVisitor.f26866a = false;
            lineBreakVisitor.d(heading);
            if (lineBreakVisitor.f26866a) {
                heading.b.getClass();
                throw null;
            }
        }
        if (heading.g <= 0) {
            throw null;
        }
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
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void o(IndentedCodeBlock indentedCodeBlock) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void q(SoftLineBreak softLineBreak) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void r(Document document) {
        document.b.getClass();
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void s(BlockQuote blockQuote) {
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void t(FencedCodeBlock fencedCodeBlock) {
        String str = fencedCodeBlock.l;
        String str2 = fencedCodeBlock.g;
        if (str2 == null) {
            str2 = "`";
        }
        Integer num = fencedCodeBlock.h;
        int iIntValue = num != null ? num.intValue() : Math.max(G(str2, str) + 1, 3);
        Integer num2 = fencedCodeBlock.i;
        int iIntValue2 = num2 != null ? num2.intValue() : iIntValue;
        H(iIntValue, str2);
        H(iIntValue2, str2);
        int i = fencedCodeBlock.j;
        if (i <= 0) {
            throw null;
        }
        H(i, " ");
        throw null;
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public final void v(HtmlBlock htmlBlock) {
        List listUnmodifiableList;
        String[] strArrSplit = htmlBlock.g.split("\n", -1);
        if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                Objects.requireNonNull(str);
                arrayList.add(str);
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList).subList(0, strArrSplit.length - 1);
        } else {
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                Objects.requireNonNull(str2);
                arrayList2.add(str2);
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        if (listUnmodifiableList.size() <= 0) {
            throw null;
        }
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
        throw null;
    }
}
