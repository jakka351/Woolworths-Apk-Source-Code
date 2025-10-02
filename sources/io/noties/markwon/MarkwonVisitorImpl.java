package io.noties.markwon;

import io.noties.markwon.MarkwonVisitor;
import java.util.HashMap;
import java.util.Map;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.CustomBlock;
import org.commonmark.node.CustomNode;
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
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;
import org.commonmark.node.ThematicBreak;

/* loaded from: classes7.dex */
class MarkwonVisitorImpl implements MarkwonVisitor {

    /* renamed from: a, reason: collision with root package name */
    public final MarkwonConfiguration f24193a;
    public final RenderProps b;
    public final SpannableBuilder c;
    public final Map d;

    public static class BuilderImpl implements MarkwonVisitor.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f24194a = new HashMap();

        @Override // io.noties.markwon.MarkwonVisitor.Builder
        public final MarkwonVisitor.Builder a(Class cls, MarkwonVisitor.NodeVisitor nodeVisitor) {
            this.f24194a.put(cls, nodeVisitor);
            return this;
        }
    }

    public MarkwonVisitorImpl(MarkwonConfiguration markwonConfiguration, RenderProps renderProps, SpannableBuilder spannableBuilder, Map map, BlockHandlerDef blockHandlerDef) {
        this.f24193a = markwonConfiguration;
        this.b = renderProps;
        this.c = spannableBuilder;
        this.d = map;
    }

    @Override // org.commonmark.node.Visitor
    public final void A(ThematicBreak thematicBreak) {
        G(thematicBreak);
    }

    @Override // org.commonmark.node.Visitor
    public final void B(Paragraph paragraph) {
        G(paragraph);
    }

    @Override // org.commonmark.node.Visitor
    public final void C(StrongEmphasis strongEmphasis) {
        G(strongEmphasis);
    }

    @Override // org.commonmark.node.Visitor
    public final void D(ListItem listItem) {
        G(listItem);
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final void E(Node node) {
        if (node.e != null) {
            m();
            this.c.a('\n');
        }
    }

    @Override // org.commonmark.node.Visitor
    public final void F(Emphasis emphasis) {
        G(emphasis);
    }

    public final void G(Node node) {
        MarkwonVisitor.NodeVisitor nodeVisitor = (MarkwonVisitor.NodeVisitor) this.d.get(node.getClass());
        if (nodeVisitor != null) {
            nodeVisitor.a(this, node);
        } else {
            c(node);
        }
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final void a(int i, Object obj) {
        SpannableBuilder spannableBuilder = this.c;
        SpannableBuilder.c(spannableBuilder, obj, i, spannableBuilder.d.length());
    }

    @Override // org.commonmark.node.Visitor
    public final void b(Code code) {
        G(code);
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final SpannableBuilder builder() {
        return this.c;
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final void c(Node node) {
        Node node2 = node.b;
        while (node2 != null) {
            Node node3 = node2.e;
            node2.a(this);
            node2 = node3;
        }
    }

    @Override // org.commonmark.node.Visitor
    public final void d(Heading heading) {
        G(heading);
    }

    @Override // org.commonmark.node.Visitor
    public final void e(OrderedList orderedList) {
        G(orderedList);
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final void f(Node node) {
        m();
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final RenderProps g() {
        return this.b;
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final void h(Node node, int i) {
        Class<?> cls = node.getClass();
        MarkwonConfiguration markwonConfiguration = this.f24193a;
        SpanFactory spanFactoryA = ((MarkwonSpansFactoryImpl) markwonConfiguration.g).a(cls);
        if (spanFactoryA != null) {
            a(i, spanFactoryA.a(markwonConfiguration, this.b));
        }
    }

    @Override // org.commonmark.node.Visitor
    public final void i(HardLineBreak hardLineBreak) {
        G(hardLineBreak);
    }

    @Override // org.commonmark.node.Visitor
    public final void j(CustomNode customNode) {
        G(customNode);
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final MarkwonConfiguration k() {
        return this.f24193a;
    }

    @Override // org.commonmark.node.Visitor
    public final void l(BulletList bulletList) {
        G(bulletList);
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final int length() {
        return this.c.d.length();
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final void m() {
        SpannableBuilder spannableBuilder = this.c;
        StringBuilder sb = spannableBuilder.d;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        spannableBuilder.a('\n');
    }

    @Override // org.commonmark.node.Visitor
    public final void n(Link link) {
        G(link);
    }

    @Override // org.commonmark.node.Visitor
    public final void o(IndentedCodeBlock indentedCodeBlock) {
        G(indentedCodeBlock);
    }

    @Override // org.commonmark.node.Visitor
    public final void p(CustomBlock customBlock) {
        G(customBlock);
    }

    @Override // org.commonmark.node.Visitor
    public final void q(SoftLineBreak softLineBreak) {
        G(softLineBreak);
    }

    @Override // org.commonmark.node.Visitor
    public final void r(Document document) {
        G(document);
    }

    @Override // org.commonmark.node.Visitor
    public final void s(BlockQuote blockQuote) {
        G(blockQuote);
    }

    @Override // org.commonmark.node.Visitor
    public final void t(FencedCodeBlock fencedCodeBlock) {
        G(fencedCodeBlock);
    }

    @Override // io.noties.markwon.MarkwonVisitor
    public final boolean u(Node node) {
        return node.e != null;
    }

    @Override // org.commonmark.node.Visitor
    public final void v(HtmlBlock htmlBlock) {
        G(htmlBlock);
    }

    @Override // org.commonmark.node.Visitor
    public final void w(Text text) {
        G(text);
    }

    @Override // org.commonmark.node.Visitor
    public final void x(HtmlInline htmlInline) {
        G(htmlInline);
    }

    @Override // org.commonmark.node.Visitor
    public final void y(Image image) {
        G(image);
    }

    @Override // org.commonmark.node.Visitor
    public final void z(LinkReferenceDefinition linkReferenceDefinition) {
        G(linkReferenceDefinition);
    }
}
