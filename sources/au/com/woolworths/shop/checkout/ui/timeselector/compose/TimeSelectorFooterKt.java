package au.com.woolworths.shop.checkout.ui.timeselector.compose;

import androidx.camera.core.impl.b;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntOffset;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.v2.ui.d;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsFooterIconData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TimeSelectorFooterKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10841a;

        static {
            int[] iArr = new int[FulfilmentWindowsFooterIconData.values().length];
            try {
                iArr[FulfilmentWindowsFooterIconData.GREEN_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FulfilmentWindowsFooterIconData.PARTNER_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10841a = iArr;
        }
    }

    public static final void a(final FooterData footerData, final Function0 onButtonClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(689842691);
        int i4 = (composerImplV.n(footerData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(onButtonClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
        } else {
            i3 = i4 | (composerImplV.n(modifier) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.d : modifier;
            c(footerData != null, BackgroundKt.b(modifier3, CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a), ComposableLambdaKt.c(-1913816826, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSelectorFooterKt$TimeSelectorFooter$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer2).e.b.e, composer2, null);
                        Modifier modifierG = PaddingKt.g(BackgroundKt.b(companion, CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a), 16, 14);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierG);
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
                        Updater.b(composer2, columnMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        final FooterData footerData2 = footerData;
                        TimeSelectorFooterKt.c((footerData2 != null ? footerData2.b : null) != null, null, ComposableLambdaKt.c(-1416866801, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSelectorFooterKt$TimeSelectorFooter$1$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    FooterData footerData3 = footerData2;
                                    TimeSelectorFooterKt.b(footerData3 != null ? footerData3.b : null, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, KyberEngine.KyberPolyBytes, 2);
                        Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                        String str = footerData2 != null ? footerData2.f10599a : null;
                        if (str == null) {
                            str = "";
                        }
                        PrimaryButtonKt.a(str, onButtonClick, modifierE2, false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 248);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, KyberEngine.KyberPolyBytes, 0);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a((Object) footerData, (Function) onButtonClick, modifier2, i, i2, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowSlotSelectionInfo r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSelectorFooterKt.b(au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowSlotSelectionInfo, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(boolean z, Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        ComposerImpl composerImplV = composer.v(-230792982);
        int i4 = (composerImplV.p(z) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (composerImplV.n(modifier) ? 32 : 16);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            z2 = z;
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.d;
            }
            modifier2 = modifier;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new d(4);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EnterTransition enterTransitionB = EnterExitTransitionKt.n(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), (Function1) objG).b(EnterExitTransitionKt.d(null, 15));
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new d(4);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            AnimatedVisibilityKt.d(z, modifier2, enterTransitionB, EnterExitTransitionKt.q(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), (Function1) objG2).b(EnterExitTransitionKt.l(null, 15)), null, ComposableLambdaKt.c(1286900498, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSelectorFooterKt$VerticalSlidingVisibility$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    composableLambdaImpl.invoke((Composer) obj2, 0);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i3 & 14) | 200064 | (i3 & 112), 16);
            z2 = z;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(z2, modifier2, composableLambdaImpl, i, i2);
        }
    }
}
