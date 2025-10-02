package org.commonmark.node;

/* loaded from: classes8.dex */
public interface Visitor {
    void A(ThematicBreak thematicBreak);

    void B(Paragraph paragraph);

    void C(StrongEmphasis strongEmphasis);

    void D(ListItem listItem);

    void F(Emphasis emphasis);

    void b(Code code);

    void d(Heading heading);

    void e(OrderedList orderedList);

    void i(HardLineBreak hardLineBreak);

    void j(CustomNode customNode);

    void l(BulletList bulletList);

    void n(Link link);

    void o(IndentedCodeBlock indentedCodeBlock);

    void p(CustomBlock customBlock);

    void q(SoftLineBreak softLineBreak);

    void r(Document document);

    void s(BlockQuote blockQuote);

    void t(FencedCodeBlock fencedCodeBlock);

    void v(HtmlBlock htmlBlock);

    void w(Text text);

    void x(HtmlInline htmlInline);

    void y(Image image);

    void z(LinkReferenceDefinition linkReferenceDefinition);
}
