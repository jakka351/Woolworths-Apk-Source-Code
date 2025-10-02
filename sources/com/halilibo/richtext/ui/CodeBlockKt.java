package com.halilibo.richtext.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CodeBlockKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TextStyle f16278a = new TextStyle(0, 0, null, null, FontFamily.g, 0, null, 0, 0, 0, null, 16777183);
    public static final long b;
    public static final Modifier c;
    public static final long d;

    static {
        long jB = Color.b(Color.e, 0.5f);
        b = jB;
        c = BackgroundKt.b(Modifier.Companion.d, jB, RectangleShapeKt.f1779a);
        d = TextUnitKt.c(16);
    }

    public static final void a(RichTextScope richTextScope, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Intrinsics.h(richTextScope, "<this>");
        ComposerImpl composerImplV = composer.v(1957181635);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(null) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CodeBlockStyle codeBlockStyle = RichTextStyleKt.c(RichTextStyleKt.b(richTextScope, composerImplV)).e;
            Intrinsics.e(codeBlockStyle);
            final TextStyle textStyleD = RichTextLocalsKt.d(richTextScope, composerImplV).d(codeBlockStyle.f16279a);
            final Modifier modifier = codeBlockStyle.b;
            Intrinsics.e(modifier);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            TextUnit textUnit = codeBlockStyle.c;
            Intrinsics.e(textUnit);
            final float fR = density.r(textUnit.f2204a);
            Boolean bool = codeBlockStyle.d;
            Intrinsics.e(bool);
            CodeBlock_androidKt.a(richTextScope, bool.booleanValue(), ComposableLambdaKt.c(1968694299, new Function4<RichTextScope, Modifier, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.CodeBlockKt$CodeBlock$3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    final RichTextScope CodeBlockLayout = (RichTextScope) obj;
                    Modifier layoutModifier = (Modifier) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(CodeBlockLayout, "$this$CodeBlockLayout");
                    Intrinsics.h(layoutModifier, "layoutModifier");
                    if ((iIntValue & 6) == 0) {
                        i3 = (composer2.n(CodeBlockLayout) ? 4 : 2) | iIntValue;
                    } else {
                        i3 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i3 |= composer2.n(layoutModifier) ? 32 : 16;
                    }
                    if ((i3 & 147) == 146 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierF = PaddingKt.f(layoutModifier.x0(modifier), fR);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Function4 function4A = RichTextThemeConfigurationKt.a(CodeBlockLayout, composer2);
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        function4A.invoke(textStyleD, ComposableLambdaKt.c(-375984849, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.CodeBlockKt$CodeBlock$3$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    composableLambdaImpl2.invoke(CodeBlockLayout, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 48);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(richTextScope, composableLambdaImpl, i, 1);
        }
    }

    public static final void b(RichTextScope richTextScope, final String text, Composer composer, int i) {
        int i2;
        Intrinsics.h(richTextScope, "<this>");
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(-1183188838);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(text) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            a(richTextScope, ComposableLambdaKt.c(1557188131, new Function3<RichTextScope, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.CodeBlockKt$CodeBlock$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RichTextScope CodeBlock = (RichTextScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(CodeBlock, "$this$CodeBlock");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(CodeBlock) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        RichTextLocalsKt.b(CodeBlock, text, null, null, 0, false, 0, composer2, iIntValue & 14, 62);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 3) & 112) | (i3 & 14) | KyberEngine.KyberPolyBytes);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(richTextScope, i, 18, text);
        }
    }
}
