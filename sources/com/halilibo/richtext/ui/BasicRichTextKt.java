package com.halilibo.richtext.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicRichTextKt {
    public static final void a(final Modifier modifier, final RichTextStyle richTextStyle, final Function3 children, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.h(children, "children");
        ComposerImpl composerImplV = composer.v(1819794447);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(richTextStyle) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(children) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            if (i5 != 0) {
                richTextStyle = null;
            }
            FormattedListKt.c(6, composerImplV, ComposableLambdaKt.c(234074522, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.BasicRichTextKt$BasicRichText$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Modifier modifier2 = modifier;
                        final Function3 function3 = children;
                        RichTextStyleKt.a(richTextStyle, ComposableLambdaKt.c(-1594352936, new Function3<RichTextScope, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.BasicRichTextKt$BasicRichText$1$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RichTextScope WithStyle = (RichTextScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(WithStyle, "$this$WithStyle");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(WithStyle) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    int i6 = iIntValue & 14;
                                    RichTextStyle richTextStyleC = RichTextStyleKt.c(RichTextStyleKt.b(WithStyle, composer3));
                                    Density density = (Density) composer3.x(CompositionLocalsKt.h);
                                    TextUnit textUnit = richTextStyleC.f16290a;
                                    Intrinsics.e(textUnit);
                                    float fR = density.r(textUnit.f2204a);
                                    Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(fR), Alignment.Companion.m, composer3, 0);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifier2);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    function3.invoke(WithStyle, composer3, Integer.valueOf(i6));
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, KyberEngine.KyberPolyBytes);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        Modifier modifier2 = modifier;
        RichTextStyle richTextStyle2 = richTextStyle;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.checkout.ui.timeselector.compose.a(modifier2, richTextStyle2, children, i, i2);
        }
    }
}
