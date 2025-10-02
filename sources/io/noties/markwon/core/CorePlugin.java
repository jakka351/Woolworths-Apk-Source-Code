package io.noties.markwon.core;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.Prop;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.SpannableBuilder;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.factory.BlockQuoteSpanFactory;
import io.noties.markwon.core.factory.CodeBlockSpanFactory;
import io.noties.markwon.core.factory.CodeSpanFactory;
import io.noties.markwon.core.factory.EmphasisSpanFactory;
import io.noties.markwon.core.factory.HeadingSpanFactory;
import io.noties.markwon.core.factory.LinkSpanFactory;
import io.noties.markwon.core.factory.ListItemSpanFactory;
import io.noties.markwon.core.factory.StrongEmphasisSpanFactory;
import io.noties.markwon.core.factory.ThematicBreakSpanFactory;
import io.noties.markwon.core.spans.OrderedListItemSpan;
import io.noties.markwon.core.spans.TextViewSpan;
import io.noties.markwon.image.ImageProps;
import io.noties.markwon.image.destination.ImageDestinationProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.Emphasis;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Heading;
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

/* loaded from: classes7.dex */
public class CorePlugin extends AbstractMarkwonPlugin {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24199a = new ArrayList(0);
    public boolean b;

    /* renamed from: io.noties.markwon.core.CorePlugin$10, reason: invalid class name */
    class AnonymousClass10 implements MarkwonVisitor.NodeVisitor<ThematicBreak> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            ThematicBreak thematicBreak = (ThematicBreak) node;
            markwonVisitor.f(thematicBreak);
            int length = markwonVisitor.length();
            markwonVisitor.builder().a((char) 160);
            markwonVisitor.h(thematicBreak, length);
            markwonVisitor.E(thematicBreak);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$11, reason: invalid class name */
    class AnonymousClass11 implements MarkwonVisitor.NodeVisitor<Heading> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            Heading heading = (Heading) node;
            markwonVisitor.f(heading);
            int length = markwonVisitor.length();
            markwonVisitor.c(heading);
            markwonVisitor.g().a(CoreProps.d, Integer.valueOf(heading.g));
            markwonVisitor.h(heading, length);
            markwonVisitor.E(heading);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$12, reason: invalid class name */
    class AnonymousClass12 implements MarkwonVisitor.NodeVisitor<SoftLineBreak> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            markwonVisitor.builder().a(' ');
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$13, reason: invalid class name */
    class AnonymousClass13 implements MarkwonVisitor.NodeVisitor<HardLineBreak> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            markwonVisitor.m();
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$14, reason: invalid class name */
    class AnonymousClass14 implements MarkwonVisitor.NodeVisitor<Paragraph> {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(io.noties.markwon.MarkwonVisitor r6, org.commonmark.node.Node r7) {
            /*
                r5 = this;
                org.commonmark.node.Paragraph r7 = (org.commonmark.node.Paragraph) r7
                org.commonmark.node.Node r0 = r7.f26855a
                org.commonmark.node.Block r0 = (org.commonmark.node.Block) r0
                if (r0 == 0) goto L15
                org.commonmark.node.Node r0 = r0.f26855a
                org.commonmark.node.Block r0 = (org.commonmark.node.Block) r0
                boolean r1 = r0 instanceof org.commonmark.node.ListBlock
                if (r1 == 0) goto L15
                org.commonmark.node.ListBlock r0 = (org.commonmark.node.ListBlock) r0
                boolean r0 = r0.g
                goto L16
            L15:
                r0 = 0
            L16:
                if (r0 != 0) goto L1b
                r6.f(r7)
            L1b:
                int r1 = r6.length()
                r6.c(r7)
                io.noties.markwon.RenderProps r2 = r6.g()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                io.noties.markwon.Prop r4 = io.noties.markwon.core.CoreProps.f
                r2.a(r4, r3)
                r6.h(r7, r1)
                if (r0 != 0) goto L37
                r6.E(r7)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.core.CorePlugin.AnonymousClass14.a(io.noties.markwon.MarkwonVisitor, org.commonmark.node.Node):void");
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$15, reason: invalid class name */
    class AnonymousClass15 implements MarkwonVisitor.NodeVisitor<Link> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            Link link = (Link) node;
            int length = markwonVisitor.length();
            markwonVisitor.c(link);
            Object obj = link.g;
            markwonVisitor.g().a(CoreProps.e, obj);
            markwonVisitor.h(link, length);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$2, reason: invalid class name */
    class AnonymousClass2 implements MarkwonVisitor.NodeVisitor<StrongEmphasis> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            StrongEmphasis strongEmphasis = (StrongEmphasis) node;
            int length = markwonVisitor.length();
            markwonVisitor.c(strongEmphasis);
            markwonVisitor.h(strongEmphasis, length);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$3, reason: invalid class name */
    class AnonymousClass3 implements MarkwonVisitor.NodeVisitor<Emphasis> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            Emphasis emphasis = (Emphasis) node;
            int length = markwonVisitor.length();
            markwonVisitor.c(emphasis);
            markwonVisitor.h(emphasis, length);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$4, reason: invalid class name */
    class AnonymousClass4 implements MarkwonVisitor.NodeVisitor<BlockQuote> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            BlockQuote blockQuote = (BlockQuote) node;
            markwonVisitor.f(blockQuote);
            int length = markwonVisitor.length();
            markwonVisitor.c(blockQuote);
            markwonVisitor.h(blockQuote, length);
            markwonVisitor.E(blockQuote);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$5, reason: invalid class name */
    class AnonymousClass5 implements MarkwonVisitor.NodeVisitor<Code> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            Code code = (Code) node;
            int length = markwonVisitor.length();
            SpannableBuilder spannableBuilderBuilder = markwonVisitor.builder();
            spannableBuilderBuilder.d.append((char) 160);
            spannableBuilderBuilder.d.append(code.g);
            spannableBuilderBuilder.a((char) 160);
            markwonVisitor.h(code, length);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$6, reason: invalid class name */
    class AnonymousClass6 implements MarkwonVisitor.NodeVisitor<FencedCodeBlock> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
            CorePlugin.k(markwonVisitor, fencedCodeBlock.k, fencedCodeBlock.l, fencedCodeBlock);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$7, reason: invalid class name */
    class AnonymousClass7 implements MarkwonVisitor.NodeVisitor<IndentedCodeBlock> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
            CorePlugin.k(markwonVisitor, null, indentedCodeBlock.g, indentedCodeBlock);
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$8, reason: invalid class name */
    class AnonymousClass8 implements MarkwonVisitor.NodeVisitor<Image> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            Image image = (Image) node;
            SpanFactory spanFactoryA = markwonVisitor.k().g.a(Image.class);
            if (spanFactoryA == null) {
                markwonVisitor.c(image);
                return;
            }
            int length = markwonVisitor.length();
            markwonVisitor.c(image);
            if (length == markwonVisitor.length()) {
                markwonVisitor.builder().a((char) 65532);
            }
            MarkwonConfiguration markwonConfigurationK = markwonVisitor.k();
            boolean z = image.f26855a instanceof Link;
            ImageDestinationProcessor imageDestinationProcessor = markwonConfigurationK.e;
            String str = image.g;
            imageDestinationProcessor.b(str);
            RenderProps renderPropsG = markwonVisitor.g();
            renderPropsG.a(ImageProps.f24211a, str);
            renderPropsG.a(ImageProps.b, Boolean.valueOf(z));
            renderPropsG.a(ImageProps.c, null);
            markwonVisitor.a(length, spanFactoryA.a(markwonConfigurationK, renderPropsG));
        }
    }

    /* renamed from: io.noties.markwon.core.CorePlugin$9, reason: invalid class name */
    class AnonymousClass9 implements MarkwonVisitor.NodeVisitor<ListItem> {
        @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
        public final void a(MarkwonVisitor markwonVisitor, Node node) {
            ListItem listItem = (ListItem) node;
            int length = markwonVisitor.length();
            markwonVisitor.c(listItem);
            Block block = (Block) listItem.f26855a;
            boolean z = block instanceof OrderedList;
            Prop prop = CoreProps.f24201a;
            if (z) {
                OrderedList orderedList = (OrderedList) block;
                Integer num = orderedList.i;
                int iIntValue = num != null ? num.intValue() : 0;
                markwonVisitor.g().a(prop, CoreProps.ListItemType.e);
                markwonVisitor.g().a(CoreProps.c, Integer.valueOf(iIntValue));
                Integer num2 = orderedList.i;
                int iIntValue2 = (num2 != null ? num2.intValue() : 0) + 1;
                orderedList.i = iIntValue2 != 0 ? Integer.valueOf(iIntValue2) : null;
            } else {
                markwonVisitor.g().a(prop, CoreProps.ListItemType.d);
                RenderProps renderPropsG = markwonVisitor.g();
                for (Node nodeD = (Block) listItem.f26855a; nodeD != null; nodeD = nodeD.d()) {
                    if (nodeD instanceof ListItem) {
                        i++;
                    }
                }
                renderPropsG.a(CoreProps.b, Integer.valueOf(i));
            }
            markwonVisitor.h(listItem, length);
            if (markwonVisitor.u(listItem)) {
                markwonVisitor.m();
            }
        }
    }

    public interface OnTextAddedListener {
        void a(MarkwonVisitor markwonVisitor, String str, int i);
    }

    public static void k(MarkwonVisitor markwonVisitor, String str, String str2, Block block) {
        markwonVisitor.f(block);
        int length = markwonVisitor.length();
        SpannableBuilder spannableBuilderBuilder = markwonVisitor.builder();
        spannableBuilderBuilder.d.append((char) 160);
        StringBuilder sb = spannableBuilderBuilder.d;
        sb.append('\n');
        markwonVisitor.k().c.getClass();
        spannableBuilderBuilder.b(sb.length(), str2);
        sb.append((CharSequence) str2);
        markwonVisitor.m();
        markwonVisitor.builder().a((char) 160);
        markwonVisitor.g().a(CoreProps.g, str);
        markwonVisitor.h(block, length);
        markwonVisitor.E(block);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void b(TextView textView) {
        if (this.b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void c(MarkwonVisitor.Builder builder) {
        builder.a(Text.class, new MarkwonVisitor.NodeVisitor<Text>() { // from class: io.noties.markwon.core.CorePlugin.1
            @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
            public final void a(MarkwonVisitor markwonVisitor, Node node) {
                String str = ((Text) node).g;
                markwonVisitor.builder().d.append(str);
                ArrayList arrayList = CorePlugin.this.f24199a;
                if (arrayList.isEmpty()) {
                    return;
                }
                int length = markwonVisitor.length() - str.length();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OnTextAddedListener) it.next()).a(markwonVisitor, str, length);
                }
            }
        });
        builder.a(StrongEmphasis.class, new AnonymousClass2());
        builder.a(Emphasis.class, new AnonymousClass3());
        builder.a(BlockQuote.class, new AnonymousClass4());
        builder.a(Code.class, new AnonymousClass5());
        builder.a(FencedCodeBlock.class, new AnonymousClass6());
        builder.a(IndentedCodeBlock.class, new AnonymousClass7());
        builder.a(Image.class, new AnonymousClass8());
        builder.a(BulletList.class, new SimpleBlockNodeVisitor());
        builder.a(OrderedList.class, new SimpleBlockNodeVisitor());
        builder.a(ListItem.class, new AnonymousClass9());
        builder.a(ThematicBreak.class, new AnonymousClass10());
        builder.a(Heading.class, new AnonymousClass11());
        builder.a(SoftLineBreak.class, new AnonymousClass12());
        builder.a(HardLineBreak.class, new AnonymousClass13());
        builder.a(Paragraph.class, new AnonymousClass14());
        builder.a(Link.class, new AnonymousClass15());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void d(MarkwonSpansFactory.Builder builder) {
        CodeBlockSpanFactory codeBlockSpanFactory = new CodeBlockSpanFactory();
        builder.b(StrongEmphasis.class, new StrongEmphasisSpanFactory());
        builder.b(Emphasis.class, new EmphasisSpanFactory());
        builder.b(BlockQuote.class, new BlockQuoteSpanFactory());
        builder.b(Code.class, new CodeSpanFactory());
        builder.b(FencedCodeBlock.class, codeBlockSpanFactory);
        builder.b(IndentedCodeBlock.class, codeBlockSpanFactory);
        builder.b(ListItem.class, new ListItemSpanFactory());
        builder.b(Heading.class, new HeadingSpanFactory());
        builder.b(Link.class, new LinkSpanFactory());
        builder.b(ThematicBreak.class, new ThematicBreakSpanFactory());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void g(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        OrderedListItemSpan[] orderedListItemSpanArr = (OrderedListItemSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), OrderedListItemSpan.class);
        if (orderedListItemSpanArr != null) {
            TextPaint paint = textView.getPaint();
            for (OrderedListItemSpan orderedListItemSpan : orderedListItemSpanArr) {
                orderedListItemSpan.g = (int) (paint.measureText(orderedListItemSpan.e) + 0.5f);
            }
        }
        TextViewSpan[] textViewSpanArr = (TextViewSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), TextViewSpan.class);
        if (textViewSpanArr != null) {
            for (TextViewSpan textViewSpan : textViewSpanArr) {
                spannableStringBuilder.removeSpan(textViewSpan);
            }
        }
        spannableStringBuilder.setSpan(new TextViewSpan(textView), 0, spannableStringBuilder.length(), 18);
    }
}
