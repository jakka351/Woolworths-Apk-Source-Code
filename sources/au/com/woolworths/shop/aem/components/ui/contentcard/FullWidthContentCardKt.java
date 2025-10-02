package au.com.woolworths.shop.aem.components.ui.contentcard;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRightKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.ui.ImagePlaceholderHelperKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FullWidthContentCardKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(Orientation orientation, final FullWidthContentCardData fullWidthContentCardData, final Function1 onCardClick, Modifier modifier, Composer composer, int i, int i2) {
        final Modifier modifier2;
        Intrinsics.h(onCardClick, "onCardClick");
        ComposerImpl composerImplV = composer.v(-195340141);
        int i3 = (composerImplV.I(fullWidthContentCardData) ? 32 : 16) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onCardClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = i4 != 0 ? Modifier.Companion.d : modifier;
            int iOrdinal = orientation.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(1256694055);
                c(fullWidthContentCardData, onCardClick, modifier2, composerImplV, (i3 >> 3) & 1022);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(1256692588, composerImplV, false);
                }
                composerImplV.o(1256697945);
                CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1088515752, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthContentCardKt$FullWidthContentCard$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            FullWidthContentCardKt.b(fullWidthContentCardData, onCardClick, modifier2, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV));
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b((Object) orientation, (Object) fullWidthContentCardData, (Object) onCardClick, modifier2, i, i2, 15);
        }
    }

    public static final void b(FullWidthContentCardData fullWidthContentCardData, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier.Companion companion;
        boolean z;
        Modifier.Companion companion2;
        ComposerImpl composerImplV = composer.v(-1152872493);
        int i2 = i | (composerImplV.I(fullWidthContentCardData) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierG = SizeKt.g(SizeKt.e(modifier, 1.0f), 114);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(fullWidthContentCardData);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new b(function1, fullWidthContentCardData, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            float f = 16;
            Modifier modifierF = PaddingKt.f(ClickableKt.d(modifierG, false, null, null, (Function0) objG, 7), f);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(12);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierF, true, (Function1) objG2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$SpaceBetween$1, vertical, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier.Companion companion3 = Modifier.Companion.d;
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            Painter painterA = ImagePlaceholderHelperKt.a(44, 6, 2, composerImplV);
            float f2 = 8;
            SingletonAsyncImageKt.b(fullWidthContentCardData.b, null, BackgroundKt.b(ClipKt.a(AspectRatioKt.a(SizeKt.c(companion3, 1.0f), 1.5f), RoundedCornerShapeKt.b(f2)), CoreTheme.b(composerImplV).e.f4848a.d, RectangleShapeKt.f1779a), null, painterA, painterA, null, null, null, null, ContentScale.Companion.f1880a, null, composerImplV, 48, 6, 31688);
            composerImplV = composerImplV;
            composerImplV.o(662006671);
            if (Intrinsics.c(fullWidthContentCardData.e, Boolean.TRUE)) {
                companion = companion3;
                Modifier modifierG2 = BoxScopeInstance.f944a.g(PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f2, 3), Alignment.Companion.i);
                composerImplV.o(1849434622);
                Object objG3 = composerImplV.G();
                if (objG3 == composer$Companion$Empty$1) {
                    objG3 = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(13);
                    composerImplV.A(objG3);
                }
                z = false;
                composerImplV.V(false);
                VideoTagKt.a(0, 0, composerImplV, SemanticsModifierKt.b(modifierG2, false, (Function1) objG3));
            } else {
                companion = companion3;
                z = false;
            }
            composerImplV.V(z);
            composerImplV.V(true);
            Modifier modifierC = SizeKt.c(RowScopeInstance.f974a.a(PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), 1.0f, true), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.i(4, vertical), Alignment.Companion.m, composerImplV, 6);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierC);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            composerImplV.o(1120742092);
            String str = fullWidthContentCardData.c;
            if (str == null || str.length() == 0) {
                companion2 = companion;
            } else {
                companion2 = companion;
                TextKt.b(fullWidthContentCardData.c, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composerImplV).m, composerImplV, 0, 3120, 55294);
                composerImplV = composerImplV;
            }
            composerImplV.V(z);
            composerImplV.o(1120751782);
            String str2 = fullWidthContentCardData.d;
            if (str2 != null && str2.length() != 0) {
                ComposerImpl composerImpl = composerImplV;
                TextKt.b(fullWidthContentCardData.d, null, WxTheme.a(composerImplV).c(), 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composerImplV).n, composerImpl, 0, 3120, 55290);
                composerImplV = composerImpl;
            }
            composerImplV.V(z);
            composerImplV.V(true);
            IconKt.b(KeyboardArrowRightKt.a(), null, SizeKt.c(companion2, 1.0f), ToneColors.f, composerImplV, 432, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(fullWidthContentCardData, function1, modifier, i, 23);
        }
    }

    public static final void c(final FullWidthContentCardData fullWidthContentCardData, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1387745855);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(fullWidthContentCardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
            float f = 0;
            BorderStroke borderStrokeA = BorderStrokeKt.a(ToneColors.i, 1);
            Modifier modifierX = SizeKt.x(SizeKt.e(modifier, 1.0f), Alignment.Companion.k, false);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(14);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierX, true, (Function1) objG);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(fullWidthContentCardData) | ((i2 & 112) == 32);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new b(function1, fullWidthContentCardData, 1);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            CardKt.b((Function0) objG2, modifierB, false, roundedCornerShapeB, 0L, 0L, borderStrokeA, f, null, ComposableLambdaKt.c(-325165785, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthContentCardKt$VerticalFullWidthContentCard$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Modifier.Companion companion;
                    FullWidthContentCardData fullWidthContentCardData2;
                    Composer composer2;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierX2 = SizeKt.x(SizeKt.e(companion2, 1.0f), Alignment.Companion.k, false);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer3, 0);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierX2);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer3, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer3, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer3, modifierD, function24);
                        Painter painterA = ImagePlaceholderHelperKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, composer3);
                        FullWidthContentCardData fullWidthContentCardData3 = fullWidthContentCardData;
                        SingletonAsyncImageKt.b(fullWidthContentCardData3.b, null, BackgroundKt.b(AspectRatioKt.a(SizeKt.e(companion2, 1.0f), 1.5f), ToneColors.i, RectangleShapeKt.f1779a), null, painterA, painterA, null, null, null, null, ContentScale.Companion.b, null, composer3, 48, 6, 31688);
                        Modifier modifierF = PaddingKt.f(SizeKt.x(SizeKt.e(companion2, 1.0f), Alignment.Companion.k, false), 16);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g(8), horizontal, composer3, 6);
                        int p2 = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierF);
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
                        Updater.b(composer3, columnMeasurePolicyA2, function2);
                        Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer3, p2, function23);
                        }
                        Updater.b(composer3, modifierD2, function24);
                        composer3.o(-104133110);
                        String str = fullWidthContentCardData3.c;
                        if (str == null || str.length() == 0) {
                            companion = companion2;
                            fullWidthContentCardData2 = fullWidthContentCardData3;
                        } else {
                            companion = companion2;
                            fullWidthContentCardData2 = fullWidthContentCardData3;
                            TextKt.b(fullWidthContentCardData3.c, SizeKt.e(companion2, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer3).m, composer3, 48, 3120, 55292);
                            composer3 = composer3;
                        }
                        composer3.l();
                        composer3.o(-104120472);
                        FullWidthContentCardData fullWidthContentCardData4 = fullWidthContentCardData2;
                        String str2 = fullWidthContentCardData4.d;
                        if (str2 == null || str2.length() == 0) {
                            composer2 = composer3;
                        } else {
                            composer2 = composer3;
                            TextKt.b(fullWidthContentCardData4.d, SizeKt.e(companion, 1.0f), WxTheme.a(composer3).c(), 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer3).n, composer2, 48, 3120, 55288);
                        }
                        composer2.l();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 817889280, 308);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 12, fullWidthContentCardData, function1, modifier, false);
        }
    }
}
