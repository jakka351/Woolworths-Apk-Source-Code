package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*j\u0010\u0007\"2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00050\u000022\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00050\u0000¨\u0006\b"}, d2 = {"Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "level", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "HeadingStyle", "richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HeadingKt {

    /* renamed from: a, reason: collision with root package name */
    public static final f f16283a = new f();

    public static final void a(final RichTextScope richTextScope, int i, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        int i3;
        Intrinsics.h(richTextScope, "<this>");
        ComposerImpl composerImplV = composer.v(2012414922);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(richTextScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.r(i) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i < 0) {
                throw new IllegalArgumentException("Level must be at least 0");
            }
            composerImplV.o(-1881134634);
            TextStyle textStyleD = RichTextLocalsKt.d(richTextScope, composerImplV);
            composerImplV.o(-1881133554);
            long jB = textStyleD.b();
            if (jB == 16) {
                jB = RichTextLocalsKt.c(richTextScope, composerImplV);
            }
            composerImplV.V(false);
            TextStyle textStyleA = TextStyle.a(textStyleD, jB, 0L, null, null, 0L, 0L, null, null, 0, 16777214);
            composerImplV.V(false);
            TextStyle textStyleB = TextStyleKt.b(textStyleA, (LayoutDirection) composerImplV.x(CompositionLocalsKt.n));
            Function2 function2 = RichTextStyleKt.c(RichTextStyleKt.b(richTextScope, composerImplV)).b;
            Intrinsics.e(function2);
            RichTextThemeConfigurationKt.a(richTextScope, composerImplV).invoke(textStyleB.d((TextStyle) function2.invoke(Integer.valueOf(i), textStyleB)), ComposableLambdaKt.c(-969692624, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.HeadingKt$Heading$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composableLambdaImpl.invoke(richTextScope, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(richTextScope, i, composableLambdaImpl, i2, 17);
        }
    }

    public static final void b(RichTextScope richTextScope, int i, final String str, Composer composer, int i2) {
        int i3;
        Intrinsics.h(richTextScope, "<this>");
        ComposerImpl composerImplV = composer.v(-211437513);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(richTextScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.r(i) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            a(richTextScope, i, ComposableLambdaKt.c(-957209698, new Function3<RichTextScope, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.HeadingKt$Heading$1
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
                        composer2.o(279486008);
                        Object objG = composer2.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new b(7);
                            composer2.A(objG);
                        }
                        composer2.l();
                        RichTextLocalsKt.b(Heading, str, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), null, 0, false, 0, composer2, iIntValue & 14, 60);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i3 & 112) | (i3 & 14) | KyberEngine.KyberPolyBytes);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(richTextScope, i, str, i2, 16);
        }
    }
}
