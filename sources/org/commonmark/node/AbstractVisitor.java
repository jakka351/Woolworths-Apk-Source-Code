package org.commonmark.node;

/* loaded from: classes8.dex */
public abstract class AbstractVisitor implements Visitor {
    @Override // org.commonmark.node.Visitor
    public void A(ThematicBreak thematicBreak) {
        c(thematicBreak);
    }

    @Override // org.commonmark.node.Visitor
    public void B(Paragraph paragraph) {
        c(paragraph);
    }

    @Override // org.commonmark.node.Visitor
    public void C(StrongEmphasis strongEmphasis) {
        c(strongEmphasis);
    }

    @Override // org.commonmark.node.Visitor
    public void D(ListItem listItem) {
        c(listItem);
    }

    @Override // org.commonmark.node.Visitor
    public void F(Emphasis emphasis) {
        c(emphasis);
    }

    @Override // org.commonmark.node.Visitor
    public void b(Code code) {
        c(code);
    }

    public void c(Node node) {
        Node node2 = node.b;
        while (node2 != null) {
            Node node3 = node2.e;
            node2.a(this);
            node2 = node3;
        }
    }

    @Override // org.commonmark.node.Visitor
    public void d(Heading heading) {
        c(heading);
    }

    @Override // org.commonmark.node.Visitor
    public void e(OrderedList orderedList) {
        c(orderedList);
    }

    @Override // org.commonmark.node.Visitor
    public void i(HardLineBreak hardLineBreak) {
        c(hardLineBreak);
    }

    @Override // org.commonmark.node.Visitor
    public final void j(CustomNode customNode) {
        c(customNode);
    }

    @Override // org.commonmark.node.Visitor
    public void l(BulletList bulletList) {
        c(bulletList);
    }

    @Override // org.commonmark.node.Visitor
    public void n(Link link) {
        c(link);
    }

    @Override // org.commonmark.node.Visitor
    public void o(IndentedCodeBlock indentedCodeBlock) {
        c(indentedCodeBlock);
    }

    @Override // org.commonmark.node.Visitor
    public final void p(CustomBlock customBlock) {
        c(customBlock);
    }

    @Override // org.commonmark.node.Visitor
    public void q(SoftLineBreak softLineBreak) {
        c(softLineBreak);
    }

    @Override // org.commonmark.node.Visitor
    public void r(Document document) {
        c(document);
    }

    @Override // org.commonmark.node.Visitor
    public void s(BlockQuote blockQuote) {
        c(blockQuote);
    }

    @Override // org.commonmark.node.Visitor
    public void t(FencedCodeBlock fencedCodeBlock) {
        c(fencedCodeBlock);
    }

    @Override // org.commonmark.node.Visitor
    public void v(HtmlBlock htmlBlock) {
        c(htmlBlock);
    }

    @Override // org.commonmark.node.Visitor
    public void w(Text text) {
        c(text);
    }

    @Override // org.commonmark.node.Visitor
    public void x(HtmlInline htmlInline) {
        c(htmlInline);
    }

    @Override // org.commonmark.node.Visitor
    public void y(Image image) {
        c(image);
    }

    @Override // org.commonmark.node.Visitor
    public final void z(LinkReferenceDefinition linkReferenceDefinition) {
        c(linkReferenceDefinition);
    }
}
