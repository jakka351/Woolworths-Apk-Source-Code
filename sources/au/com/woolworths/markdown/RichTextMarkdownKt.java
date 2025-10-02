package au.com.woolworths.markdown;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyTokens;
import com.halilibo.richtext.commonmark.AstNodeConvertKt;
import com.halilibo.richtext.commonmark.CommonMarkdownParseOptions;
import com.halilibo.richtext.commonmark.CommonmarkAstNodeParser;
import com.halilibo.richtext.markdown.BasicMarkdownKt;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.RichTextScope;
import com.halilibo.richtext.ui.RichTextStyle;
import com.halilibo.richtext.ui.material.RichTextKt;
import com.halilibo.richtext.ui.string.RichTextStringStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"markdown_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RichTextMarkdownKt {
    public static final void a(final AstNode astNode, TextStyle textStyle, final Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1582240245);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(astNode) : composerImplV.I(astNode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(textStyle) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            TextKt.a(textStyle, ComposableLambdaKt.c(880368100, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.markdown.RichTextMarkdownKt$RichTextMarkdown$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        CoreTypographyTokens coreTypographyTokensF = CoreTheme.f(composer2);
                        long jC = TextUnitKt.c(12);
                        RichTextStringStyle richTextStringStyle = new RichTextStringStyle(new TextLinkStyles(SpanStyle.a(((TextStyle) composer2.x(TextKt.f1345a)).f2068a, CoreTheme.b(composer2).f4782a.d.b.f4798a, 65534), null, 14), 127);
                        TextUnit textUnit = new TextUnit(jC);
                        composer2.o(5004770);
                        boolean zN = composer2.n(coreTypographyTokensF);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(coreTypographyTokensF, 19);
                            composer2.A(objG);
                        }
                        composer2.l();
                        RichTextStyle richTextStyleA = RichTextStyle.a(RichTextStyle.i, textUnit, (Function2) objG, richTextStringStyle, 124);
                        final AstNode astNode2 = astNode;
                        RichTextKt.a(modifier, richTextStyleA, ComposableLambdaKt.c(-420580689, new Function3<RichTextScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.markdown.RichTextMarkdownKt$RichTextMarkdown$2.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RichTextScope RichText = (RichTextScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(RichText, "$this$RichText");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(RichText) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    BasicMarkdownKt.a(RichText, astNode2, new CoreAstBlockNodeComposer(), composer3, iIntValue & 14);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, KyberEngine.KyberPolyBytes);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 7, astNode, textStyle, modifier, false);
        }
    }

    public static final void b(String markdown, Modifier modifier, TextStyle textStyle, boolean z, Composer composer, int i, int i2) {
        int i3;
        int i4;
        TextStyle textStyle2;
        int i5;
        boolean z2;
        TextStyle textStyle3;
        Modifier modifier2;
        boolean z3;
        Modifier modifier3;
        TextStyle textStyle4;
        Intrinsics.h(markdown, "markdown");
        ComposerImpl composerImplV = composer.v(1276380634);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.n(markdown) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (composerImplV.n(modifier) ? 32 : 16);
        }
        int i7 = i4 | (((i2 & 4) == 0 && composerImplV.n(textStyle)) ? 256 : 128) | 3072;
        if ((i7 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            textStyle4 = textStyle;
            z3 = z;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                Modifier modifier4 = i6 != 0 ? Modifier.Companion.d : modifier;
                if ((i2 & 4) != 0) {
                    textStyle2 = CoreTheme.f(composerImplV).f5120a.b.f5123a;
                    i7 &= -897;
                } else {
                    textStyle2 = textStyle;
                }
                Modifier modifier5 = modifier4;
                i5 = i7;
                z2 = true;
                textStyle3 = textStyle2;
                modifier2 = modifier5;
            } else {
                composerImplV.j();
                if ((i2 & 4) != 0) {
                    i7 &= -897;
                }
                modifier2 = modifier;
                textStyle3 = textStyle;
                i5 = i7;
                z2 = z;
            }
            composerImplV.W();
            composerImplV.o(5004770);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new CommonmarkAstNodeParser(new CommonMarkdownParseOptions(z2));
                composerImplV.A(objG);
            }
            CommonmarkAstNodeParser commonmarkAstNodeParser = (CommonmarkAstNodeParser) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(commonmarkAstNodeParser);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                commonmarkAstNodeParser.getClass();
                objG2 = AstNodeConvertKt.a(commonmarkAstNodeParser.f16242a.a(markdown), null, null);
                if (objG2 == null) {
                    throw new IllegalArgumentException("Could not convert the generated Commonmark Node into an ASTNode!");
                }
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            a((AstNode) objG2, textStyle3, modifier2, composerImplV, ((i5 << 3) & 896) | ((i5 >> 3) & 112));
            Modifier modifier6 = modifier2;
            z3 = z2;
            modifier3 = modifier6;
            textStyle4 = textStyle3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.a(markdown, modifier3, textStyle4, z3, i, i2);
        }
    }
}
