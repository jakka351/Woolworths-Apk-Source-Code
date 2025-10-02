package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.offers.OfferFeedInlineBannerViewItem;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyle;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyleKt;
import au.com.woolworths.foundation.rewards.common.ui.iconasset.IconAssetUiKt;
import au.com.woolworths.rewards.base.data.IconAsset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferFeedInlineBannerKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1092603058);
        if ((((composerImplV.I(function0) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Painter painterA = PainterResources_androidKt.a(R.drawable.ic_dismiss, 0, composerImplV);
            String strC = StringResources_androidKt.c(composerImplV, R.string.dismiss_banner_button_content_description);
            Modifier.Companion companion = Modifier.Companion.d;
            modifier2 = companion;
            ImageKt.a(painterA, strC, SizeKt.q(ClickableKt.d(companion, false, null, null, function0, 7), 20), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 0, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(function0, modifier2, i, 0);
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1673798474);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            SurfaceKt.a(modifier2, RoundedCornerShapeKt.b(4), RewardsColors.b, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$OfferFeedInlineBannerKt.f6406a, composerImplV, 1572870, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 15, modifier2);
        }
    }

    public static final void c(final OfferFeedInlineBannerViewItem item, boolean z, final Function1 onDismiss, Function1 onImpression, final Function1 onClick, final Modifier modifier, Composer composer, int i) {
        Intrinsics.h(item, "item");
        Intrinsics.h(onDismiss, "onDismiss");
        Intrinsics.h(onImpression, "onImpression");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1653992275);
        int i2 = (composerImplV.I(item) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDismiss) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onImpression) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onClick) ? 16384 : 8192;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            AnimatedVisibilityKt.d(!z, null, EnterTransition.f722a, null, null, ComposableLambdaKt.c(440313899, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.OfferFeedInlineBannerKt$OfferFeedInlineBanner$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    Modifier modifierE = SizeKt.e(modifier, 1.0f);
                    float fA = HomepageStyleKt.a((HomepageStyle) composer2.x(HomepageStyleKt.f8583a));
                    final OfferFeedInlineBannerViewItem offerFeedInlineBannerViewItem = item;
                    final Function1 function1 = onDismiss;
                    final Function1 function12 = onClick;
                    CardKt.a(modifierE, null, 0L, 0L, null, fA, ComposableLambdaKt.c(-1132038386, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.OfferFeedInlineBannerKt$OfferFeedInlineBanner$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            BiasAlignment biasAlignment;
                            Function2 function2;
                            boolean z2;
                            RowScopeInstance rowScopeInstance;
                            Function2 function22;
                            Function2 function23;
                            char c;
                            Modifier.Companion companion;
                            Composer composer3 = (Composer) obj4;
                            if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                composer3.j();
                            } else {
                                composer3.o(-1633490746);
                                final Function1 function13 = function12;
                                boolean zN = composer3.n(function13);
                                final OfferFeedInlineBannerViewItem offerFeedInlineBannerViewItem2 = offerFeedInlineBannerViewItem;
                                boolean zI = zN | composer3.I(offerFeedInlineBannerViewItem2);
                                Object objG = composer3.G();
                                Object obj6 = Composer.Companion.f1624a;
                                if (zI || objG == obj6) {
                                    final int i3 = 0;
                                    objG = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.ui.b
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i3) {
                                                case 0:
                                                    function13.invoke(offerFeedInlineBannerViewItem2);
                                                    break;
                                                default:
                                                    function13.invoke(offerFeedInlineBannerViewItem2);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer3.A(objG);
                                }
                                composer3.l();
                                Modifier.Companion companion2 = Modifier.Companion.d;
                                Modifier modifierD = ClickableKt.d(companion2, false, null, null, (Function0) objG, 7);
                                composer3.o(5004770);
                                boolean zI2 = composer3.I(offerFeedInlineBannerViewItem2);
                                Object objG2 = composer3.G();
                                if (zI2 || objG2 == obj6) {
                                    objG2 = new l(offerFeedInlineBannerViewItem2, 6);
                                    composer3.A(objG2);
                                }
                                composer3.l();
                                Modifier modifierB = SemanticsModifierKt.b(modifierD, false, (Function1) objG2);
                                BiasAlignment biasAlignment2 = Alignment.Companion.f1719a;
                                MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment2, false);
                                int p = composer3.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierB);
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
                                Function2 function24 = ComposeUiNode.Companion.g;
                                Updater.b(composer3, measurePolicyD, function24);
                                Function2 function25 = ComposeUiNode.Companion.f;
                                Updater.b(composer3, persistentCompositionLocalMapD, function25);
                                Function2 function26 = ComposeUiNode.Companion.j;
                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer3, p, function26);
                                }
                                Function2 function27 = ComposeUiNode.Companion.d;
                                Updater.b(composer3, modifierD2, function27);
                                Modifier modifierF = PaddingKt.f(companion2, 16);
                                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer3, 48);
                                int p2 = composer3.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                Modifier modifierD3 = ComposedModifierKt.d(composer3, modifierF);
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
                                Updater.b(composer3, rowMeasurePolicyA, function24);
                                Updater.b(composer3, persistentCompositionLocalMapD2, function25);
                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                    androidx.camera.core.impl.b.z(p2, composer3, p2, function26);
                                }
                                Updater.b(composer3, modifierD3, function27);
                                IconAsset iconAsset = offerFeedInlineBannerViewItem2.f;
                                composer3.o(-251388103);
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
                                if (iconAsset == null) {
                                    function2 = function25;
                                    z2 = 12;
                                    function23 = function24;
                                    rowScopeInstance = rowScopeInstance2;
                                    biasAlignment = biasAlignment2;
                                    c = '6';
                                    function22 = function26;
                                } else {
                                    biasAlignment = biasAlignment2;
                                    function2 = function25;
                                    z2 = 12;
                                    rowScopeInstance = rowScopeInstance2;
                                    function22 = function26;
                                    function23 = function24;
                                    IconAssetUiKt.b(iconAsset, Color.k, SizeKt.q(companion2, 48), composer3, 432, 0);
                                    c = '6';
                                    SpacerKt.d(rowScopeInstance, 12, composer3, 54);
                                }
                                composer3.l();
                                Modifier modifierA = rowScopeInstance.a(companion2, 1.0f, true);
                                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                int p3 = composer3.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer3.d();
                                Modifier modifierD4 = ComposedModifierKt.d(composer3, modifierA);
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
                                Updater.b(composer3, columnMeasurePolicyA, function23);
                                Updater.b(composer3, persistentCompositionLocalMapD3, function2);
                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p3))) {
                                    androidx.camera.core.impl.b.z(p3, composer3, p3, function22);
                                }
                                Updater.b(composer3, modifierD4, function27);
                                composer3.o(1177412210);
                                if (offerFeedInlineBannerViewItem2.h) {
                                    OfferFeedInlineBannerKt.b(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), composer3, 6);
                                }
                                composer3.l();
                                Function2 function28 = function2;
                                Function2 function29 = function23;
                                Function2 function210 = function22;
                                BiasAlignment biasAlignment3 = biasAlignment;
                                TextKt.b(offerFeedInlineBannerViewItem2.c, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).m, composer3, 0, 0, 65534);
                                TextKt.b(offerFeedInlineBannerViewItem2.d, null, WxTheme.a(composer3).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).n, composer3, 0, 0, 65530);
                                composer3.f();
                                float f = 12;
                                SpacerKt.d(rowScopeInstance, f, composer3, 54);
                                IconAsset iconAsset2 = offerFeedInlineBannerViewItem2.g;
                                composer3.o(-251349901);
                                if (iconAsset2 == null) {
                                    companion = companion2;
                                } else {
                                    companion = companion2;
                                    IconAssetUiKt.b(iconAsset2, Color.k, SizeKt.q(companion, 48), composer3, 432, 0);
                                }
                                composer3.l();
                                composer3.f();
                                composer3.o(-1128270589);
                                if (offerFeedInlineBannerViewItem2.i) {
                                    Modifier modifierJ = PaddingKt.j(BoxScopeInstance.f944a.g(companion, Alignment.Companion.c), BitmapDescriptorFactory.HUE_RED, f, f, BitmapDescriptorFactory.HUE_RED, 9);
                                    MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment3, false);
                                    int p4 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer3.d();
                                    Modifier modifierD5 = ComposedModifierKt.d(composer3, modifierJ);
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
                                    Updater.b(composer3, measurePolicyD2, function29);
                                    Updater.b(composer3, persistentCompositionLocalMapD4, function28);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p4))) {
                                        androidx.camera.core.impl.b.z(p4, composer3, p4, function210);
                                    }
                                    Updater.b(composer3, modifierD5, function27);
                                    composer3.o(-1633490746);
                                    final Function1 function14 = function1;
                                    boolean zN2 = composer3.n(function14) | composer3.I(offerFeedInlineBannerViewItem2);
                                    Object objG3 = composer3.G();
                                    if (zN2 || objG3 == obj6) {
                                        final int i4 = 1;
                                        objG3 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.ui.b
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i4) {
                                                    case 0:
                                                        function14.invoke(offerFeedInlineBannerViewItem2);
                                                        break;
                                                    default:
                                                        function14.invoke(offerFeedInlineBannerViewItem2);
                                                        break;
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    OfferFeedInlineBannerKt.a(0, composer3, null, (Function0) objG3);
                                    composer3.f();
                                }
                                composer3.l();
                                composer3.f();
                            }
                            return Unit.f24250a;
                        }
                    }, composer2), composer2, 1572864, 30);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 196608, 26);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 7168) == 2048) | composerImplV.I(item);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new OfferFeedInlineBannerKt$OfferFeedInlineBanner$2$1(onImpression, item, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, item, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.d(item, z, onDismiss, onImpression, onClick, modifier, i);
        }
    }
}
