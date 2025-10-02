package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.CampaignCardCarouselData;
import au.com.woolworths.dynamic.page.data.CampaignCardData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CardCarouselUiKt {
    public static final void a(final CampaignCardData data, Modifier modifier, Function2 function2, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(1305219222);
        int i2 = (composerImplV.n(data) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierU = SizeKt.u(modifier, 240);
            composerImplV.o(-1633490746);
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new a(function2, data, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            CardKt.b((Function0) objG, modifierU, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-1686834448, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.CardCarouselUiKt$CardCarouselItemUi$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer3, 0);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer3, companion);
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
                        Function2 function22 = ComposeUiNode.Companion.g;
                        Updater.b(composer3, columnMeasurePolicyA, function22);
                        Function2 function23 = ComposeUiNode.Companion.f;
                        Updater.b(composer3, persistentCompositionLocalMapD, function23);
                        Function2 function24 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function24);
                        }
                        Function2 function25 = ComposeUiNode.Companion.d;
                        Updater.b(composer3, modifierD, function25);
                        ColorPainter colorPainter = new ColorPainter(ToneColors.j);
                        Modifier modifierA = AspectRatioKt.a(SizeKt.e(companion, 1.0f), 1.33f);
                        CampaignCardData campaignCardData = data;
                        SingletonAsyncImageKt.b(campaignCardData.b, campaignCardData.c, modifierA, colorPainter, colorPainter, null, null, null, null, null, ContentScale.Companion.f1880a, null, composer3, KyberEngine.KyberPolyBytes, 6, 31712);
                        float f = 16;
                        Modifier modifierI = PaddingKt.i(companion, f, 18, f, 20);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer3, 0);
                        int p2 = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierI);
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
                        Updater.b(composer3, columnMeasurePolicyA2, function22);
                        Updater.b(composer3, persistentCompositionLocalMapD2, function23);
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer3, p2, function24);
                        }
                        Updater.b(composer3, modifierD2, function25);
                        TextKt.b(campaignCardData.f5176a, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer3).l, composer3, 0, 3120, 55294);
                        composer3.o(164090707);
                        String str = campaignCardData.e;
                        if (str == null || str.length() == 0) {
                            composer2 = composer3;
                        } else {
                            composer2 = composer3;
                            TextKt.b(campaignCardData.e, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, WxTheme.b(composer3).n, composer2, 48, 3120, 55292);
                        }
                        composer2.l();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 805306368, 508);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(data, modifier, function2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final void b(final CampaignCardCarouselData data, Modifier modifier, Function2 function2, Composer composer, int i, int i2) {
        final Function2 function22;
        int i3;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        int i4;
        Modifier.Companion companion;
        ComposerImpl composerImpl;
        ?? r0;
        ComposerImpl composerImpl2;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(-216155421);
        int i5 = i | (composerImplV.I(data) ? 4 : 2);
        int i6 = i5 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i5 | 432;
            function22 = function2;
        } else {
            function22 = function2;
            i3 = i6 | (composerImplV.I(function22) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl2 = composerImplV;
        } else {
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (i7 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$12) {
                    objG = new androidx.navigation.compose.h(10, (byte) 0);
                    composerImplV.A(objG);
                }
                function22 = (Function2) objG;
                composerImplV.V(false);
            }
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(SizeKt.e(companion2, 1.0f), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i8 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(359053731);
            String str = data.f5174a;
            if (str == null || str.length() == 0) {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i4 = 1849434622;
                companion = companion2;
                composerImpl = composerImplV;
                r0 = 0;
            } else {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                String str2 = data.f5174a;
                TextStyle textStyle = WxTheme.b(composerImplV).i;
                companion = companion2;
                i4 = 1849434622;
                r0 = 0;
                TextKt.b(str2, PaddingKt.f(companion2, 16), 0L, 0L, null, 0L, null, null, 0L, 0, false, 2, 0, null, textStyle, composerImplV, 0, 3072, 57340);
                composerImpl = composerImplV;
            }
            Object objD = au.com.woolworths.android.onesite.a.d(i4, composerImpl, r0);
            if (objD == composer$Companion$Empty$1) {
                objD = d.f(composerImpl);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objD;
            composerImpl.V(r0);
            LazyListState lazyListStateA = LazyListStateKt.a(r0, r0, 3, composerImpl);
            TargetedFlingBehavior targetedFlingBehaviorB = LazyListSnapLayoutInfoProviderKt.b(lazyListStateA, composerImpl);
            float f = 16;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, 8, f, 24);
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            composerImpl.o(-1746271574);
            boolean zI = ((i3 & 896) == 256 ? true : r0) | composerImpl.I(data);
            Object objG2 = composerImpl.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1() { // from class: au.com.woolworths.dynamic.page.ui.content.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyRow = (LazyListScope) obj;
                        Intrinsics.h(LazyRow, "$this$LazyRow");
                        for (final CampaignCardData campaignCardData : data.b) {
                            final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                            final Function2 function24 = function22;
                            LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.CardCarouselUiKt$CardCarouselUi$2$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        CardCarouselUiKt.a(campaignCardData, SharedIntrinsicHeightModifierKt.a(Modifier.Companion.d, sharedIntrinsicHeightState2), function24, composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 452750199), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImpl.A(objG2);
            }
            composerImpl.V(r0);
            composerImpl2 = composerImpl;
            LazyDslKt.d(null, lazyListStateA, paddingValuesImpl, false, spacedAlignedG, null, targetedFlingBehaviorB, false, null, (Function1) objG2, composerImpl2, 24576, 425);
            composerImpl2.V(true);
            modifier2 = companion;
        }
        Function2 function24 = function22;
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(i, i2, 6, modifier2, data, function24);
        }
    }
}
