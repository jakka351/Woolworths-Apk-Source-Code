package com.halilibo.richtext.markdown;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import com.halilibo.richtext.markdown.node.AstBlockNodeType;
import com.halilibo.richtext.markdown.node.AstBlockQuote;
import com.halilibo.richtext.markdown.node.AstDocument;
import com.halilibo.richtext.markdown.node.AstFencedCodeBlock;
import com.halilibo.richtext.markdown.node.AstHeading;
import com.halilibo.richtext.markdown.node.AstHtmlBlock;
import com.halilibo.richtext.markdown.node.AstIndentedCodeBlock;
import com.halilibo.richtext.markdown.node.AstInlineNodeType;
import com.halilibo.richtext.markdown.node.AstLinkReferenceDefinition;
import com.halilibo.richtext.markdown.node.AstListItem;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.markdown.node.AstNodeType;
import com.halilibo.richtext.markdown.node.AstOrderedList;
import com.halilibo.richtext.markdown.node.AstParagraph;
import com.halilibo.richtext.markdown.node.AstTableBody;
import com.halilibo.richtext.markdown.node.AstTableCell;
import com.halilibo.richtext.markdown.node.AstTableHeader;
import com.halilibo.richtext.markdown.node.AstTableRoot;
import com.halilibo.richtext.markdown.node.AstTableRow;
import com.halilibo.richtext.markdown.node.AstText;
import com.halilibo.richtext.markdown.node.AstThematicBreak;
import com.halilibo.richtext.markdown.node.AstUnorderedList;
import com.halilibo.richtext.ui.BlockQuoteKt;
import com.halilibo.richtext.ui.CodeBlockKt;
import com.halilibo.richtext.ui.FormattedListKt;
import com.halilibo.richtext.ui.HeadingKt;
import com.halilibo.richtext.ui.HorizontalRuleKt;
import com.halilibo.richtext.ui.ListType;
import com.halilibo.richtext.ui.RichTextScope;
import com.halilibo.richtext.ui.string.InlineContent;
import com.halilibo.richtext.ui.string.RichTextString;
import com.halilibo.richtext.ui.string.TextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/halilibo/richtext/markdown/BasicMarkdownKt$DefaultAstNodeComposer$1", "Lcom/halilibo/richtext/markdown/AstBlockNodeComposer;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BasicMarkdownKt$DefaultAstNodeComposer$1 implements AstBlockNodeComposer {
    @Override // com.halilibo.richtext.markdown.AstBlockNodeComposer
    public final boolean a(AstBlockNodeType astBlockNodeType) {
        return true;
    }

    @Override // com.halilibo.richtext.markdown.AstBlockNodeComposer
    public final void b(final RichTextScope richTextScope, final AstNode astNode, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Intrinsics.h(richTextScope, "<this>");
        Intrinsics.h(astNode, "astNode");
        composer.o(-1256053540);
        final AstNodeType astNodeType = astNode.f16260a;
        if (astNodeType instanceof AstDocument) {
            composer.o(2144216659);
            composableLambdaImpl.invoke(astNode, composer, Integer.valueOf((i >> 3) & 126));
            composer.l();
        } else if (astNodeType instanceof AstBlockQuote) {
            composer.o(2046257180);
            BlockQuoteKt.a(richTextScope, ComposableLambdaKt.c(301482436, new Function3<RichTextScope, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.markdown.BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RichTextScope BlockQuote = (RichTextScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(BlockQuote, "$this$BlockQuote");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composableLambdaImpl.invoke(astNode, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, (i & 14) | 48);
            composer.l();
        } else if (astNodeType instanceof AstUnorderedList) {
            composer.o(2046370857);
            FormattedListKt.a(richTextScope, ListType.e, SequencesKt.x(TraverseUtilsKt.b(astNode, BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$$inlined$filterChildrenType$1.d)), 0, ComposableLambdaKt.c(-996206079, new Function4<RichTextScope, AstNode, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.markdown.BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$2
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    RichTextScope FormattedList = (RichTextScope) obj;
                    AstNode astListItem = (AstNode) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(FormattedList, "$this$FormattedList");
                    Intrinsics.h(astListItem, "astListItem");
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= composer2.n(astListItem) ? 32 : 16;
                    }
                    if ((iIntValue & 145) == 144 && composer2.c()) {
                        composer2.j();
                    } else if (astListItem.b.b == null) {
                        composer2.o(-1162631361);
                        BasicTextKt.c("", null, null, null, 0, false, 0, 0, null, composer2, 6, 1022);
                        composer2.l();
                    } else {
                        composer2.o(-1162586318);
                        composableLambdaImpl.invoke(astListItem, composer2, Integer.valueOf((iIntValue >> 3) & 14));
                        composer2.l();
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, (i & 14) | 24624, 4);
            composer.l();
        } else if (astNodeType instanceof AstOrderedList) {
            composer.o(2046809445);
            FormattedListKt.a(richTextScope, ListType.d, SequencesKt.x(TraverseUtilsKt.a(astNode, false)), ((AstOrderedList) astNodeType).f16262a - 1, ComposableLambdaKt.c(-1232823904, new Function4<RichTextScope, AstNode, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.markdown.BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    RichTextScope FormattedList = (RichTextScope) obj;
                    AstNode astListItem = (AstNode) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(FormattedList, "$this$FormattedList");
                    Intrinsics.h(astListItem, "astListItem");
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= composer2.n(astListItem) ? 32 : 16;
                    }
                    if ((iIntValue & 145) == 144 && composer2.c()) {
                        composer2.j();
                    } else if (astListItem.b.b == null) {
                        composer2.o(-1162158177);
                        BasicTextKt.c("", null, null, null, 0, false, 0, 0, null, composer2, 6, 1022);
                        composer2.l();
                    } else {
                        composer2.o(-1162113134);
                        composableLambdaImpl.invoke(astListItem, composer2, Integer.valueOf((iIntValue >> 3) & 14));
                        composer2.l();
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, (i & 14) | 24624, 0);
            composer.l();
        } else if (astNodeType instanceof AstThematicBreak) {
            composer.o(2047271779);
            HorizontalRuleKt.a(richTextScope, composer, i & 14);
            composer.l();
        } else if (astNodeType instanceof AstHeading) {
            composer.o(2047333407);
            HeadingKt.a(richTextScope, ((AstHeading) astNodeType).f16252a, ComposableLambdaKt.c(727548192, new Function3<RichTextScope, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.markdown.BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RichTextScope Heading = (RichTextScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Heading, "$this$Heading");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(Heading) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(516710153);
                        Object objG = composer2.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(8);
                            composer2.A(objG);
                        }
                        composer2.l();
                        MarkdownRichTextKt.a(Heading, astNode, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), composer2, iIntValue & 14, 0);
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, (i & 14) | KyberEngine.KyberPolyBytes);
            composer.l();
        } else if (astNodeType instanceof AstIndentedCodeBlock) {
            composer.o(2047498823);
            CodeBlockKt.b(richTextScope, StringsKt.k0(((AstIndentedCodeBlock) astNodeType).f16256a).toString(), composer, i & 14);
            composer.l();
        } else if (astNodeType instanceof AstFencedCodeBlock) {
            composer.o(2047593063);
            CodeBlockKt.b(richTextScope, StringsKt.k0(((AstFencedCodeBlock) astNodeType).e).toString(), composer, i & 14);
            composer.l();
        } else if (astNodeType instanceof AstHtmlBlock) {
            composer.o(2047684668);
            composer.o(2144264999);
            RichTextString.Builder builder = new RichTextString.Builder();
            RichTextString.Builder.b(builder, new InlineContent(null, ComposableLambdaKt.c(-1003319804, new Function4<Density, String, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.markdown.BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$5$1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Density InlineContent = (Density) obj;
                    String it = (String) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(InlineContent, "$this$InlineContent");
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 129) == 128 && composer2.c()) {
                        composer2.j();
                    } else {
                        HtmlBlockKt.a(richTextScope, ((AstHtmlBlock) astNodeType).f16253a, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composer), 3));
            RichTextString richTextStringD = builder.d();
            composer.l();
            TextKt.a(richTextScope, richTextStringD, null, null, false, 0, 0, composer, i & 14, 62);
            composer.l();
        } else if (astNodeType instanceof AstLinkReferenceDefinition) {
            composer.o(2047889578);
            composer.l();
        } else if (astNodeType instanceof AstParagraph) {
            composer.o(2047974394);
            MarkdownRichTextKt.a(richTextScope, astNode, null, composer, i & 126, 2);
            composer.l();
        } else if (astNodeType instanceof AstTableRoot) {
            composer.o(2048043679);
            RenderTableKt.a(richTextScope, astNode, composer, i & 126);
            composer.l();
        } else if (astNodeType instanceof AstText) {
            composer.o(2048339171);
            System.out.println((Object) "Unexpected raw text while traversing the Abstract Syntax Tree.");
            RichTextString.Builder builder2 = new RichTextString.Builder();
            builder2.a(((AstText) astNodeType).f16272a);
            TextKt.a(richTextScope, builder2.d(), null, null, false, 0, 0, composer, i & 14, 62);
            composer.l();
        } else if (astNodeType instanceof AstListItem) {
            composer.o(2048585621);
            composer.l();
            System.out.println((Object) "MarkdownRichText: Unexpected AstListItem while traversing the Abstract Syntax Tree.");
        } else if (astNodeType instanceof AstInlineNodeType) {
            composer.o(2048729616);
            composer.l();
            System.out.println((Object) ("MarkdownRichText: Unexpected AstInlineNodeType " + astNodeType + " while traversing the Abstract Syntax Tree."));
        } else {
            if (!astNodeType.equals(AstTableBody.f16267a) && !astNodeType.equals(AstTableHeader.f16269a) && !astNodeType.equals(AstTableRow.f16271a) && !(astNodeType instanceof AstTableCell)) {
                throw au.com.woolworths.android.onesite.a.x(composer, 2144217546);
            }
            composer.o(2048963542);
            composer.l();
            System.out.println((Object) "MarkdownRichText: Unexpected Table node while traversing the Abstract Syntax Tree.");
        }
        composer.l();
    }
}
