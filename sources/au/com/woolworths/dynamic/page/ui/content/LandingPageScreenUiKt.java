package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.DynamicPageErrorState;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.data.DynamicPageFooterData;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\n²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"", "titleTopY", "Landroidx/compose/ui/graphics/Color;", "topNavBarBackgroundColor", "titleColor", "iconsTint", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lau/com/woolworths/dynamic/page/data/DynamicPageFeedData;", "feedData", "dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LandingPageScreenUiKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5200a;

        static {
            int[] iArr = new int[DynamicPageErrorState.values().length];
            try {
                DynamicPageErrorState dynamicPageErrorState = DynamicPageErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5200a = iArr;
        }
    }

    public static final void a(DynamicPageContract.ViewState viewState, Function2 function2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1762667270);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i | (composerImplV.I(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            DynamicPageFeedData dynamicPageFeedData = viewState.c;
            DynamicPageFooterData dynamicPageFooterData = dynamicPageFeedData != null ? dynamicPageFeedData.c : null;
            if (dynamicPageFooterData != null) {
                ScreenContentKt.b(dynamicPageFooterData, viewState.a(), function2, composerImplV, (i2 << 3) & 896);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(viewState, i, 1, function2);
        }
    }

    public static final void b(DynamicPageErrorState dynamicPageErrorState, Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpecE;
        ComposerImpl composerImplV = composer.v(-1309032968);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(dynamicPageErrorState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (WhenMappings.f5200a[dynamicPageErrorState.ordinal()] == 1) {
                composerImplV.o(444743595);
                fullPageMessageSpecE = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImplV, R.string.dynamic_page_connection_error), function0, composerImplV, 7);
                composerImplV.V(false);
                composerImpl = composerImplV;
            } else {
                composerImplV.o(444750659);
                composerImpl = composerImplV;
                fullPageMessageSpecE = FullPageMessageSpec.Companion.e(null, null, StringResources_androidKt.c(composerImplV, R.string.dynamic_page_server_error), null, function0, composerImpl, 23);
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecE, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(dynamicPageErrorState, i, 2, function0);
        }
    }

    public static final void c(final DynamicPageContract.ViewState viewState, final Function2 onLinkClick, final Function0 onNavigateUp, final Function0 onShareClick, final Function0 onCartClick, final Function0 onTryAgainClick, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onLinkClick, "onLinkClick");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onShareClick, "onShareClick");
        Intrinsics.h(onCartClick, "onCartClick");
        Intrinsics.h(onTryAgainClick, "onTryAgainClick");
        ComposerImpl composerImplV = composer.v(-326130263);
        int i4 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(onLinkClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onNavigateUp) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.I(onShareClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.I(onCartClick) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= composerImplV.I(onTryAgainClick) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 = i4 | 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 1048576 : 524288);
        }
        if ((599187 & i3) == 599186 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            final Modifier modifier4 = i5 != 0 ? Modifier.Companion.d : modifier2;
            DynamicPageFeedData dynamicPageFeedData = viewState.c;
            if ((dynamicPageFeedData != null ? dynamicPageFeedData.f5185a.b : null) != null) {
                composerImplV.o(-529961091);
                e(viewState, onLinkClick, onNavigateUp, onShareClick, onCartClick, SizeKt.c, composerImplV, 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344));
                composerImplV.V(false);
                modifier3 = modifier4;
            } else {
                composerImplV.o(-529659740);
                modifier3 = modifier4;
                ScaffoldKt.a(null, null, ComposableLambdaKt.c(-1746420014, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.LandingPageScreenUiKt$LandingPageScreenUi$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            LandingPageScreenUiKt.f(viewState, 4, onNavigateUp, onShareClick, onCartClick, 0L, composer2, 48);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), null, null, 0, 0L, 0L, ComposableLambdaKt.c(148824, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.LandingPageScreenUiKt$LandingPageScreenUi$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            LandingPageScreenUiKt.a(viewState, onLinkClick, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), null, ComposableLambdaKt.c(-2133397948, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.LandingPageScreenUiKt$LandingPageScreenUi$3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        PaddingValues paddingValues = (PaddingValues) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(paddingValues, "paddingValues");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                        }
                        if ((iIntValue & 19) == 18 && composer2.c()) {
                            composer2.j();
                        } else {
                            LandingPageScreenUiKt.d(viewState, onLinkClick, onTryAgainClick, PaddingKt.e(modifier4, paddingValues), composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 100663680, 763);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.dialog.b(viewState, onLinkClick, onNavigateUp, onShareClick, onCartClick, onTryAgainClick, modifier3, i, i2, 3);
        }
    }

    public static final void d(DynamicPageContract.ViewState viewState, Function2 function2, Function0 function0, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(514829107);
        int i2 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.I(function2) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = viewState.f5195a;
            DynamicPageFeedData dynamicPageFeedData = viewState.c;
            DynamicPageErrorState dynamicPageErrorState = viewState.d;
            if (z) {
                composerImplV.o(-54021366);
                FillElement fillElement = SizeKt.c;
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                int i3 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function02);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                    androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e));
                composerImplV.V(true);
                composerImplV.V(false);
            } else if (dynamicPageErrorState != null) {
                composerImplV.o(-53795097);
                b(dynamicPageErrorState, function0, composerImplV, (i2 >> 3) & 112);
                composerImplV.V(false);
            } else if (dynamicPageFeedData != null && (!dynamicPageFeedData.b.isEmpty()) && dynamicPageFeedData.f5185a.b == null) {
                composerImplV.o(829552458);
                if (dynamicPageFeedData != null) {
                    ScreenContentKt.f(dynamicPageFeedData, modifier, function2, composerImplV, ((i2 >> 6) & 112) | ((i2 << 3) & 896), 0);
                }
                composerImplV.V(false);
            } else {
                composerImplV.o(-53470961);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) viewState, (Object) function2, function0, modifier, i, 1);
        }
    }

    public static final void e(final DynamicPageContract.ViewState viewState, final Function2 function2, final Function0 function0, final Function0 function02, final Function0 function03, final Modifier modifier, Composer composer, final int i) {
        int i2;
        final Function0 function04;
        final Function0 function05;
        long jA;
        ComposerImpl composerImplV = composer.v(1082878729);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function04 = function0;
            i2 |= composerImplV.I(function04) ? 256 : 128;
        } else {
            function04 = function0;
        }
        if ((i & 3072) == 0) {
            function05 = function02;
            i2 |= composerImplV.I(function05) ? 2048 : 1024;
        } else {
            function05 = function02;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            DynamicPageFeedData dynamicPageFeedData = viewState.c;
            if (dynamicPageFeedData == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.dynamic.page.ui.content.l
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    LandingPageScreenUiKt.e(viewState, function2, function04, function05, function03, modifier, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    LandingPageScreenUiKt.e(viewState, function2, function04, function05, function03, modifier, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            int i4 = i2;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = PrimitiveSnapshotStateKt.a(100.0f);
                composerImplV.A(objG);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) objG;
            composerImplV.V(false);
            composerImplV.o(1264392850);
            long jA2 = mutableFloatState.a() <= BitmapDescriptorFactory.HUE_RED ? WxTheme.a(composerImplV).a() : Color.j;
            composerImplV.V(false);
            androidx.compose.animation.core.b bVar = EasingKt.d;
            State stateB = SingleValueAnimationKt.b(jA2, new TweenSpec(nlnlnnn.xxx00780078x0078, 0, bVar), "animation-color", composerImplV, KyberEngine.KyberPolyBytes, 8);
            composerImplV.o(1264399823);
            long jC = mutableFloatState.a() <= BitmapDescriptorFactory.HUE_RED ? WxTheme.a(composerImplV).c() : Color.j;
            composerImplV.V(false);
            State stateB2 = SingleValueAnimationKt.b(jC, new TweenSpec(nlnlnnn.xxx00780078x0078, 0, bVar), "animation-color", composerImplV, KyberEngine.KyberPolyBytes, 8);
            if (mutableFloatState.a() <= BitmapDescriptorFactory.HUE_RED) {
                composerImplV.o(1264407888);
                jA = WxTheme.a(composerImplV).h();
            } else {
                composerImplV.o(1264408947);
                jA = WxTheme.a(composerImplV).a();
            }
            composerImplV.V(false);
            State stateB3 = SingleValueAnimationKt.b(jA, new TweenSpec(nlnlnnn.xxx00780078x0078, 0, bVar), "animation-color", composerImplV, KyberEngine.KyberPolyBytes, 8);
            State stateA = AnimateAsStateKt.a(mutableFloatState.a() <= BitmapDescriptorFactory.HUE_RED ? 4 : 0, new TweenSpec(nlnlnnn.xxx00780078x0078, 0, bVar), "animation-elevation", null, composerImplV, KyberEngine.KyberPolyBytes, 8);
            ScaffoldKt.a(modifier.x0(SizeKt.c), null, null, null, null, 0, 0L, 0L, ComposableLambdaKt.c(-2099211436, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.LandingPageScreenUiKt$PageUiWithImage$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        LandingPageScreenUiKt.a(viewState, function2, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(2025502016, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.LandingPageScreenUiKt$PageUiWithImage$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues padding = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(padding, "padding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(padding) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(BackgroundKt.b(SizeKt.c, WxTheme.a(composer2).a(), RectangleShapeKt.f1779a), padding);
                        composer2.o(5004770);
                        Object objG2 = composer2.G();
                        if (objG2 == Composer.Companion.f1624a) {
                            objG2 = new m(mutableFloatState, 0);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        ScreenContentKt.e(viewState, function2, modifierE, (Function1) objG2, composer2, 3072, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 100663296, 766);
            int i5 = i4 << 9;
            ScreenContentKt.g(viewState, dynamicPageFeedData.f5185a.f5187a, ((Color) stateB.getD()).f1766a, ((Dp) stateA.getD()).d, ((Color) stateB3.getD()).f1766a, function0, function02, null, ((Color) stateB2.getD()).f1766a, function03, composerImplV, (i4 & 14) | (458752 & i5) | (i5 & 3670016) | ((i4 << 15) & 1879048192));
            composerImplV = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i6 = 1;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.dynamic.page.ui.content.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            LandingPageScreenUiKt.e(viewState, function2, function0, function02, function03, modifier, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            LandingPageScreenUiKt.e(viewState, function2, function0, function02, function03, modifier, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void f(final DynamicPageContract.ViewState viewState, final float f, final Function0 function0, final Function0 function02, final Function0 function03, long j, Composer composer, final int i) {
        int i2;
        long jC;
        String str;
        final long j2;
        ComposerImpl composerImplV = composer.v(-138323302);
        int i3 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.I(function0) ? 256 : 128) | (composerImplV.I(function02) ? 2048 : 1024) | (composerImplV.I(function03) ? 16384 : 8192) | 65536;
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            j2 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                i2 = i3 & (-458753);
                jC = WxTheme.a(composerImplV).c();
            } else {
                composerImplV.j();
                i2 = i3 & (-458753);
                jC = j;
            }
            composerImplV.W();
            DynamicPageFeedData dynamicPageFeedData = viewState.c;
            if (dynamicPageFeedData != null && (!dynamicPageFeedData.b.isEmpty()) && dynamicPageFeedData.f5185a.b == null) {
                DynamicPageFeedData dynamicPageFeedData2 = viewState.c;
                Intrinsics.e(dynamicPageFeedData2);
                str = dynamicPageFeedData2.f5185a.f5187a;
            } else {
                str = "";
            }
            int i4 = i2 << 9;
            ScreenContentKt.g(viewState, str, WxTheme.a(composerImplV).a(), f, WxTheme.a(composerImplV).h(), function0, function02, null, jC, function03, composerImplV, (i2 & 14) | 3072 | (458752 & i4) | (i4 & 3670016) | ((i2 << 15) & 1879048192));
            j2 = jC;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(f, function0, function02, function03, j2, i) { // from class: au.com.woolworths.dynamic.page.ui.content.k
                public final /* synthetic */ float e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ long i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(49);
                    LandingPageScreenUiKt.f(this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
