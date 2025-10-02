package au.com.woolworths.foundation.shop.nhp.ui.edr;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.d;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.PrimaryLoadingButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.shop.nhp.model.TextWithAltData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.model.edr.RtlOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.model.edr.RtlOfferStatus;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "animatedScale", "animatedAlpha", "nhp-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EdrOfferBannerKt {
    public static final void a(final EdrOfferBannerData data, final EdrOfferBoostState edrOfferBoostState, final Function1 onBannerClick, final Function1 onBoostButtonClick, final Function1 onBannerImpression, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(data, "data");
        Intrinsics.h(onBannerClick, "onBannerClick");
        Intrinsics.h(onBoostButtonClick, "onBoostButtonClick");
        Intrinsics.h(onBannerImpression, "onBannerImpression");
        ComposerImpl composerImplV = composer.v(955278405);
        int i2 = (composerImplV.I(data) ? 4 : 2) | i | (composerImplV.I(edrOfferBoostState) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onBannerClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onBoostButtonClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onBannerImpression) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final Modifier modifier3 = modifier2;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1957044063, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt$EdrOfferBanner$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String strC;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    composer2.o(-1633490746);
                    Object obj3 = onBannerImpression;
                    boolean zN = composer2.n(obj3);
                    EdrOfferBannerData edrOfferBannerData = data;
                    boolean zI = zN | composer2.I(edrOfferBannerData);
                    Object objG = composer2.G();
                    Object obj4 = Composer.Companion.f1624a;
                    if (zI || objG == obj4) {
                        objG = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(22, obj3, edrOfferBannerData);
                        composer2.A(objG);
                    }
                    composer2.l();
                    EffectsKt.c(unit, (Function1) objG, composer2);
                    composer2.o(719782384);
                    StringBuilder sb = new StringBuilder();
                    composer2.o(221141646);
                    sb.append(StringResources_androidKt.c(composer2, R.string.banner_image_content_description));
                    sb.append(edrOfferBannerData.d);
                    sb.append(edrOfferBannerData.e);
                    EdrOfferBoostState edrOfferBoostState2 = edrOfferBoostState;
                    if (edrOfferBoostState2 instanceof EdrOfferBoostState.Boosting) {
                        composer2.o(-2121441672);
                        strC = StringResources_androidKt.c(composer2, R.string.boost_button_loading_state_description);
                        composer2.l();
                    } else if ((edrOfferBoostState2 instanceof EdrOfferBoostState.Failed) || edrOfferBoostState2.equals(EdrOfferBoostState.Idle.f8782a)) {
                        composer2.o(-1340052284);
                        composer2.l();
                        strC = null;
                    } else {
                        if (!(edrOfferBoostState2 instanceof EdrOfferBoostState.Success)) {
                            throw au.com.woolworths.android.onesite.a.x(composer2, -2121443771);
                        }
                        composer2.o(-2121435814);
                        strC = StringResources_androidKt.c(composer2, R.string.boost_button_activated_state_description);
                        composer2.l();
                    }
                    if (strC != null && strC.length() != 0) {
                        sb.append(strC);
                    }
                    composer2.l();
                    String string = sb.toString();
                    composer2.l();
                    Modifier modifierB = BackgroundKt.b(modifier3, CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a);
                    composer2.o(5004770);
                    boolean zN2 = composer2.n(string);
                    Object objG2 = composer2.G();
                    if (zN2 || objG2 == obj4) {
                        objG2 = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(string, 22);
                        composer2.A(objG2);
                    }
                    composer2.l();
                    Modifier modifierB2 = SemanticsModifierKt.b(modifierB, false, (Function1) objG2);
                    composer2.o(-1633490746);
                    Function1 function1 = onBannerClick;
                    boolean zN3 = composer2.n(function1) | composer2.I(edrOfferBannerData);
                    Object objG3 = composer2.G();
                    if (zN3 || objG3 == obj4) {
                        objG3 = new b(function1, edrOfferBannerData, 1);
                        composer2.A(objG3);
                    }
                    composer2.l();
                    Modifier modifierD = ClickableKt.d(modifierB2, false, null, null, (Function0) objG3, 7);
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierD);
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
                    Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                    String str = edrOfferBannerData.f;
                    composer2.o(-863501205);
                    if (str != null) {
                        EdrOfferBannerKt.c(0, composer2, null, str);
                    }
                    composer2.l();
                    EdrOfferBannerKt.b(edrOfferBannerData, edrOfferBoostState2, onBoostButtonClick, composer2, 0);
                    composer2.f();
                    return unit;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d((Object) data, (Object) edrOfferBoostState, (Object) onBannerClick, (Object) onBoostButtonClick, onBannerImpression, modifier, i, 12);
        }
    }

    public static final void b(EdrOfferBannerData edrOfferBannerData, EdrOfferBoostState edrOfferBoostState, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1533868093);
        int i2 = i | (composerImplV.I(edrOfferBannerData) ? 4 : 2) | (composerImplV.I(edrOfferBoostState) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            BorderStroke borderStrokeA = BorderStrokeKt.a(CoreTheme.b(composerImplV).e.b.e, 1);
            Modifier modifierB = BorderKt.b(fillElement, borderStrokeA.f828a, borderStrokeA.b, RoundedCornerShapeKt.b(4));
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
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
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierG = PaddingKt.g(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), 16, 12);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            d(edrOfferBannerData.d, edrOfferBannerData.e, null, composerImplV, 0);
            f(edrOfferBannerData, edrOfferBoostState, function1, composerImplV, i2 & 1022);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(edrOfferBannerData, edrOfferBoostState, function1, i, 0);
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, String str) {
        String str2;
        ComposerImpl composerImplV = composer.v(-295972164);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            str2 = str;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = -8;
            Modifier modifierA = ZIndexModifierKt.a(ClipKt.a(OffsetKt.b(SizeKt.q(companion, 24), f, f), RoundedCornerShapeKt.f1100a), 1.0f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            str2 = str;
            SingletonAsyncImageKt.a(str2, null, BoxScopeInstance.f944a.i(), null, null, composerImplV, (i2 & 14) | 48, 2040);
            composerImplV.V(true);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str2, modifier, i, 14);
        }
    }

    public static final void d(String str, String str2, Modifier modifier, Composer composer, int i) {
        Modifier.Companion companion;
        boolean z;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-2117100372);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion2, 0.6f);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(29);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierE, (Function1) objG);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1266055901);
            if (str == null) {
                companion = companion2;
                z = false;
            } else {
                companion = companion2;
                z = false;
                TextKt.a(str, CoreTheme.f(composerImplV).f5120a.b.b, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 2, false, 2, null, composerImplV, (i2 & 14) | 102236160, 692);
            }
            composerImplV.V(z);
            composerImplV.o(1266065700);
            if (str2 != null) {
                TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 2, false, 3, null, composerImplV, ((i2 >> 3) & 14) | 102236160, 692);
            }
            composerImplV.V(z);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.shippingcalculator.ui.a(str, str2, modifier2, i, 1);
        }
    }

    public static final void e(final TextWithAltData textWithAltData, final boolean z, final Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-245768508);
        if ((((composerImplV.I(textWithAltData) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(2017938087, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt$EdrOfferBoostButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        TextWithAltData textWithAltData2 = textWithAltData;
                        PrimaryLoadingButtonKt.a(textWithAltData2.f8778a, function0, z, null, textWithAltData2.b, StringResources_androidKt.c(composer2, R.string.boost_button_loading_state_description), null, composer2, 0, 312);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.a(textWithAltData, z, function0, i, 5);
        }
    }

    public static final void f(EdrOfferBannerData edrOfferBannerData, EdrOfferBoostState edrOfferBoostState, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(424579646);
        int i2 = (composerImplV.I(edrOfferBannerData) ? 4 : 2) | i | (composerImplV.I(edrOfferBoostState) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else if ((edrOfferBoostState instanceof EdrOfferBoostState.Idle) || (edrOfferBoostState instanceof EdrOfferBoostState.Boosting) || (edrOfferBoostState instanceof EdrOfferBoostState.Failed)) {
            composerImplV.o(-26107268);
            TextWithAltData textWithAltData = edrOfferBannerData.h;
            if (textWithAltData != null) {
                boolean z = edrOfferBoostState instanceof EdrOfferBoostState.Boosting;
                composerImplV.o(-1633490746);
                boolean zI = ((i2 & 896) == 256) | composerImplV.I(edrOfferBannerData);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new b(function1, edrOfferBannerData, 0);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                e(textWithAltData, z, (Function0) objG, composerImplV, 0);
            }
            composerImplV.V(false);
        } else {
            if (!(edrOfferBoostState instanceof EdrOfferBoostState.Success)) {
                throw au.com.woolworths.android.onesite.a.w(-846236, composerImplV, false);
            }
            composerImplV.o(-25647290);
            EdrOfferBoostState.Success success = (EdrOfferBoostState.Success) edrOfferBoostState;
            if (success.b == RtlOfferBoostState.d && success.c == RtlOfferStatus.d) {
                g(composerImplV, 0);
            }
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(edrOfferBannerData, edrOfferBoostState, function1, i, 1);
        }
    }

    public static final void g(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1788508914);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composerImplV, 54);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CornerSize cornerSizeB = CornerSizeKt.b(4);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            RoundedCornerShape roundedCornerShape2 = new RoundedCornerShape(cornerSizeB, cornerSizeB, cornerSizeB, cornerSizeB);
            long j = CoreTheme.b(composerImplV).g.f4869a.f4870a;
            Modifier modifierZ = SizeKt.z(Modifier.Companion.d, null, 3);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            int i3 = 0;
            if (objG == Composer.Companion.f1624a) {
                objG = new c(i3);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SurfaceKt.b(SemanticsModifierKt.a(modifierZ, (Function1) objG), roundedCornerShape2, j, 0L, null, null, ComposableSingletons$EdrOfferBannerKt.f8786a, composerImplV, 56);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.b(i, 27);
        }
    }

    public static final void h(final Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-613626518);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(2118815942, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt$PulsingIndicator$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierK = SizeKt.k(modifier, 16);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierK);
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
                        InfiniteTransition infiniteTransitionC = InfiniteTransitionKt.c("Pulsing", composer2, 0);
                        CubicBezierEasing cubicBezierEasing = EasingKt.b;
                        InfiniteTransition.TransitionAnimationState transitionAnimationStateA = InfiniteTransitionKt.a(infiniteTransitionC, 0.5f, 1.0f, AnimationSpecKt.a(6, 0L, new TweenSpec(500, 600, cubicBezierEasing), null), "OuterCircleScale", composer2, 29112, 0);
                        InfiniteTransition.TransitionAnimationState transitionAnimationStateA2 = InfiniteTransitionKt.a(infiniteTransitionC, 0.75f, BitmapDescriptorFactory.HUE_RED, AnimationSpecKt.a(6, 0L, new TweenSpec(500, 600, cubicBezierEasing), null), "OuterCircleAlpha", composer2, 29112, 0);
                        FillElement fillElement = SizeKt.c;
                        composer2.o(-1633490746);
                        boolean zN = composer2.n(transitionAnimationStateA) | composer2.n(transitionAnimationStateA2);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.foundation.rewards.common.ui.a(transitionAnimationStateA, transitionAnimationStateA2, 1);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierA = GraphicsLayerModifierKt.a(fillElement, (Function1) objG);
                        RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
                        Modifier modifierA2 = ClipKt.a(modifierA, roundedCornerShape);
                        long j = CoreTheme.a(composer2).f4774a.b.b;
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                        BoxKt.a(BackgroundKt.b(modifierA2, j, rectangleShapeKt$RectangleShape$1), composer2, 0);
                        BoxKt.a(SizeKt.k(BackgroundKt.b(ClipKt.a(Modifier.Companion.d, roundedCornerShape), CoreTheme.a(composer2).f4774a.b.b, rectangleShapeKt$RectangleShape$1), 8), composer2, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 23, modifier);
        }
    }
}
