package au.com.woolworths.feature.rewards.offers.detail.composable;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.ui.content.o;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsCtaViewState;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsFullPageErrorStateLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateKt;
import au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateSpec;
import au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateStyle;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferUnknown;
import au.com.woolworths.foundation.rewards.offers.ui.AutoAdjustBackgroundHeaderImageKt;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferDataExtKt;
import au.com.woolworths.foundation.rewards.offers.ui.TintableTextKt;
import au.com.woolworths.foundation.rewards.offers.ui.TintableTextSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.rewards.base.confetti.RewardsConfettiKt;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$ViewState;", "viewState", "offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOfferDetailsScreenLegacyKt {
    public static final void a(final PaddingValues paddingValues, final NestedScrollConnection nestedScrollConnection, final RewardsOfferDetailsFullPageErrorStateLegacy rewardsOfferDetailsFullPageErrorStateLegacy, final Function1 function1, Composer composer, int i) {
        int i2;
        final FullPageMessageSpec fullPageMessageSpecF;
        ComposerImpl composerImplV = composer.v(282965682);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(nestedScrollConnection) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(rewardsOfferDetailsFullPageErrorStateLegacy) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Painter painterA = PainterResources_androidKt.a(rewardsOfferDetailsFullPageErrorStateLegacy.g, 0, composerImplV);
            Text text = rewardsOfferDetailsFullPageErrorStateLegacy.d;
            String strValueOf = String.valueOf(text != null ? text.getText(context) : null);
            String string = rewardsOfferDetailsFullPageErrorStateLegacy.e.getText(context).toString();
            String strC = StringResources_androidKt.c(composerImplV, rewardsOfferDetailsFullPageErrorStateLegacy.f);
            boolean z = rewardsOfferDetailsFullPageErrorStateLegacy instanceof RewardsOfferDetailsFullPageErrorStateLegacy.CustomErrorWithBackButtonLegacy;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(-430699738);
                composerImplV.o(-1633490746);
                boolean zI = ((i2 & 7168) == 2048) | composerImplV.I(rewardsOfferDetailsFullPageErrorStateLegacy);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    final int i3 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                                case 1:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                                default:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.e(painterA, strValueOf, string, strC, (Function0) objG);
                composerImplV.V(false);
            } else if (rewardsOfferDetailsFullPageErrorStateLegacy.equals(RewardsOfferDetailsFullPageErrorStateLegacy.NoConnectivity.h)) {
                composerImplV.o(-430317942);
                composerImplV.o(-1633490746);
                boolean zI2 = ((i2 & 7168) == 2048) | composerImplV.I(rewardsOfferDetailsFullPageErrorStateLegacy);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    final int i4 = 1;
                    objG2 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                                case 1:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                                default:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(painterA, strValueOf, string, null, (Function0) objG2, composerImplV, 18);
                composerImplV.V(false);
            } else {
                if (!rewardsOfferDetailsFullPageErrorStateLegacy.equals(RewardsOfferDetailsFullPageErrorStateLegacy.ServerErrorLegacy.h)) {
                    throw au.com.woolworths.android.onesite.a.w(-13896117, composerImplV, false);
                }
                composerImplV.o(-429967890);
                composerImplV.o(-1633490746);
                boolean zI3 = ((i2 & 7168) == 2048) | composerImplV.I(rewardsOfferDetailsFullPageErrorStateLegacy);
                Object objG3 = composerImplV.G();
                if (zI3 || objG3 == composer$Companion$Empty$1) {
                    final int i5 = 2;
                    objG3 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                                case 1:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                                default:
                                    function1.invoke(rewardsOfferDetailsFullPageErrorStateLegacy);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(painterA, null, strValueOf, string, null, (Function0) objG3, composerImplV, 18);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(1464282147, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$ErrorStateUi$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FullPageMessageUiKt.a(fullPageMessageSpecF, NestedScrollModifierKt.a(PaddingKt.e(Modifier.Companion.d, paddingValues).x0(SizeKt.c), nestedScrollConnection, null), Alignment.Companion.j, composer2, KyberEngine.KyberPolyBytes, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(paddingValues, nestedScrollConnection, rewardsOfferDetailsFullPageErrorStateLegacy, function1, i, 6);
        }
    }

    public static final void b(final String str, final String str2, final String str3, final float f, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(736904308);
        if (((i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(str3) ? 256 : 128) | (composerImplV.q(f) ? 2048 : 1024)) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier modifierA = AnimationModifierKt.a(modifier, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            modifier2 = modifier;
            AnimatedVisibilityKt.d(str != null, SizeKt.e(modifier2, 1.0f), EnterExitTransitionKt.e(null, 3), EnterExitTransitionKt.f(null, 3), null, ComposableLambdaKt.c(-1120038826, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$Header$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                    MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
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
                    Updater.b(composer2, measurePolicyD2, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function22 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function22);
                    }
                    Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                    float f2 = Dimens.f6333a;
                    Modifier modifierA2 = AspectRatioKt.a(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2 / 2, 7), 2.0f);
                    composer2.o(1849434622);
                    Object objG = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$1) {
                        objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(23);
                        composer2.A(objG);
                    }
                    composer2.l();
                    Modifier modifierA3 = SemanticsModifierKt.a(modifierA2, (Function1) objG);
                    composer2.o(5004770);
                    float f3 = f;
                    boolean zQ = composer2.q(f3);
                    Object objG2 = composer2.G();
                    if (zQ || objG2 == composer$Companion$Empty$1) {
                        objG2 = new o(f3, 1);
                        composer2.A(objG2);
                    }
                    composer2.l();
                    AutoAdjustBackgroundHeaderImageKt.a(str, GraphicsLayerModifierKt.a(modifierA3, (Function1) objG2), null, composer2, 0, 4);
                    Painter painterA = PainterResources_androidKt.a(R.drawable.ic_rewards_brand_icon_error, 0, composer2);
                    Modifier modifierJ = PaddingKt.j(SizeKt.g(companion, f2), 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    BiasAlignment biasAlignment2 = Alignment.Companion.g;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
                    SingletonAsyncImageKt.b(str2, null, boxScopeInstance.g(modifierJ, biasAlignment2), null, painterA, null, null, null, null, null, null, null, composer2, 48, 0, 32744);
                    Modifier modifierG = boxScopeInstance.g(SizeKt.g(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 56, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 30), biasAlignment);
                    if (!((Boolean) composer2.x(InspectionModeKt.f1972a)).booleanValue()) {
                        painterA = null;
                    }
                    SingletonAsyncImageKt.b(str3, null, modifierG, null, painterA, null, null, null, null, null, null, null, composer2, 48, 0, 32744);
                    composer2.f();
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 200064, 16);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(str, str2, str3, f, modifier2, i);
        }
    }

    public static final void c(PaddingValues paddingValues, NestedScrollConnection nestedScrollConnection, RewardsOfferUnknown rewardsOfferUnknown, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        String url;
        ComposerImpl composerImplV = composer.v(1547278061);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(nestedScrollConnection) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(rewardsOfferUnknown) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function12 = function1;
            i2 |= composerImplV.I(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            EmptyStateButtonData emptyStateButtonData = null;
            Modifier modifierA = NestedScrollModifierKt.a(PaddingKt.e(Modifier.Companion.d, paddingValues).x0(SizeKt.c), nestedScrollConnection, null);
            String str = rewardsOfferUnknown.d;
            String str2 = rewardsOfferUnknown.e;
            ContentCta contentCta = rewardsOfferUnknown.f;
            if (contentCta != null && (url = contentCta.getUrl()) != null) {
                emptyStateButtonData = new EmptyStateButtonData(contentCta.getLabel(), url);
            }
            RewardsEmptyStateKt.a(RewardsEmptyStateSpec.Companion.b(new RewardsEmptyStateData(0, str, str2, emptyStateButtonData, null, 16, null), RewardsEmptyStateStyle.e), modifierA, function12, composerImplV, (i2 >> 3) & 896, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(paddingValues, nestedScrollConnection, rewardsOfferUnknown, function1, i, 7);
        }
    }

    public static final void d(final String str, final RewardsOfferData rewardsOfferData, final OfferDetailsCtaViewState offerDetailsCtaViewState, final Function0 function0, final Function2 function2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1074883549);
        if (((i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(rewardsOfferData) ? 32 : 16) | (composerImplV.n(offerDetailsCtaViewState) ? 256 : 128) | (composerImplV.I(function0) ? 2048 : 1024) | (composerImplV.I(function2) ? 16384 : 8192)) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, 4, ComposableLambdaKt.c(1029438303, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$OfferDetailsFooter$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 8;
                        Modifier modifierJ = PaddingKt.j(PaddingKt.h(SizeKt.e(companion, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 12, 5);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierJ);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function22);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        Intrinsics.g(upperCase, "toUpperCase(...)");
                        TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).s, composer2, 0, 0, 65534);
                        Composer composer3 = composer2;
                        SpacerKt.c(ColumnScopeInstance.f948a, f, composer3, 54);
                        OfferDetailsCtaViewState offerDetailsCtaViewState2 = offerDetailsCtaViewState;
                        if (offerDetailsCtaViewState2 instanceof OfferDetailsCtaViewState.OfferStatusView) {
                            composer3.o(24757759);
                            TintableTextSpec tintableTextSpecC = RewardsOfferDataExtKt.c(rewardsOfferData, null, composer3, 1);
                            if (tintableTextSpecC != null) {
                                TintableTextKt.a(tintableTextSpecC, BackgroundKt.b(ClipKt.a(SizeKt.b(PaddingKt.h(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 6, 1), BitmapDescriptorFactory.HUE_RED, 36, 1), RoundedCornerShapeKt.b(4)), WxTheme.a(composer3).a(), RectangleShapeKt.f1779a), composer3, 0);
                            }
                            composer3.l();
                        } else if (offerDetailsCtaViewState2 instanceof OfferDetailsCtaViewState.StatefulCtaView) {
                            composer3.o(25413347);
                            Modifier modifierE = SizeKt.e(companion, 1.0f);
                            OfferDetailsCtaViewState.StatefulCtaView statefulCtaView = (OfferDetailsCtaViewState.StatefulCtaView) offerDetailsCtaViewState2;
                            StatefulButtonState statefulButtonState = statefulCtaView.c;
                            String str2 = statefulCtaView.b;
                            StatefulButtonKt.b(str2, str2, modifierE, statefulButtonState, 0L, function0, composer3, KyberEngine.KyberPolyBytes, 16);
                            composer3 = composer3;
                            composer3.l();
                        } else {
                            if (!(offerDetailsCtaViewState2 instanceof OfferDetailsCtaViewState.StatelessCtaView)) {
                                throw au.com.woolworths.android.onesite.a.x(composer3, 1801912091);
                            }
                            composer3.o(25887337);
                            Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                            ContentCta contentCta = ((OfferDetailsCtaViewState.StatelessCtaView) offerDetailsCtaViewState2).b;
                            String label = contentCta.getLabel();
                            boolean zC = Intrinsics.c(contentCta.getIsExternalUrl(), Boolean.TRUE);
                            composer3.o(-1633490746);
                            Function2 function23 = function2;
                            boolean zN = composer3.n(function23) | composer3.n(offerDetailsCtaViewState2);
                            Object objG = composer3.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(9, function23, offerDetailsCtaViewState2);
                                composer3.A(objG);
                            }
                            composer3.l();
                            RewardsOfferDetailsScreenLegacyKt.e(3072, composer3, modifierE2, label, (Function0) objG, zC);
                            composer3.l();
                        }
                        composer3.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769472, 31);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(str, rewardsOfferData, offerDetailsCtaViewState, function0, function2, i, 4);
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, final String str, Function0 function0, final boolean z) {
        Function0 function02;
        ComposerImpl composerImplV = composer.v(1744220443);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            function02 = function0;
            PrimaryButtonKt.b(function02, SizeKt.g(modifier, 36), false, PaddingKt.a(20, BitmapDescriptorFactory.HUE_RED, 2), ComposableLambdaKt.c(2123007640, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$PrimaryOfferCtaButton$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope PrimaryButton = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(PrimaryButton, "$this$PrimaryButton");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(PrimaryButton) ? 4 : 2;
                    }
                    int i3 = iIntValue;
                    if ((i3 & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        Intrinsics.g(upperCase, "toUpperCase(...)");
                        TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, WxTheme.b(composer2).p, composer2, 0, 432, 59390);
                        if (z) {
                            SpacerKt.d(PrimaryButton, 8, composer2, (i3 & 14) | 48);
                            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_open_external, 0, composer2), null, null, 0L, composer2, 48, 12);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 6) & 14) | 27648, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(str, z, function02, modifier, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy.ViewState r30, final kotlin.jvm.functions.Function1 r31, final kotlin.jvm.functions.Function1 r32, final kotlin.jvm.functions.Function0 r33, final kotlin.jvm.functions.Function0 r34, final kotlin.jvm.functions.Function0 r35, final kotlin.jvm.functions.Function2 r36, androidx.compose.ui.Modifier r37, androidx.compose.material.ScaffoldState r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt.f(au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy$ViewState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(RewardsOfferDetailsViewModel viewModel, Function0 onBackClick, Function1 openUrl, Function1 showOfferActivationMessage, Function1 onCloseScreenAndShowError, Function0 performSuccessHapticFeedback, Function0 performFailureHapticFeedback, Modifier modifier, Composer composer, int i) {
        Object rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1;
        Flow flow;
        ScaffoldState scaffoldState;
        int i2;
        RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel;
        Function1 function1;
        Object rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$7$1;
        final RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel2;
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onBackClick, "onBackClick");
        Intrinsics.h(openUrl, "openUrl");
        Intrinsics.h(showOfferActivationMessage, "showOfferActivationMessage");
        Intrinsics.h(onCloseScreenAndShowError, "onCloseScreenAndShowError");
        Intrinsics.h(performSuccessHapticFeedback, "performSuccessHapticFeedback");
        Intrinsics.h(performFailureHapticFeedback, "performFailureHapticFeedback");
        ComposerImpl composerImplV = composer.v(-2069897370);
        int i3 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onBackClick) ? 32 : 16) | (composerImplV.I(openUrl) ? 256 : 128) | (composerImplV.I(showOfferActivationMessage) ? 2048 : 1024) | (composerImplV.I(onCloseScreenAndShowError) ? 16384 : 8192) | (composerImplV.I(performSuccessHapticFeedback) ? 131072 : 65536) | (composerImplV.I(performFailureHapticFeedback) ? 1048576 : 524288) | (composerImplV.n(modifier) ? 8388608 : 4194304);
        if ((i3 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            rewardsOfferDetailsViewModel2 = viewModel;
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.r, composerImplV);
            ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composerImplV, 3);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Flow flow2 = viewModel.q;
            composerImplV.o(-1224400529);
            int i4 = i3 & 896;
            boolean zI = composerImplV.I(viewModel) | ((i3 & 112) == 32) | ((57344 & i3) == 16384) | (i4 == 256) | ((i3 & 3670016) == 1048576) | ((458752 & i3) == 131072) | composerImplV.I(coroutineScope) | composerImplV.n(scaffoldStateD) | composerImplV.I(context) | ((i3 & 7168) == 2048);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                flow = flow2;
                scaffoldState = scaffoldStateD;
                i2 = i3;
                rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1 = new RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1(viewModel, onBackClick, onCloseScreenAndShowError, openUrl, performFailureHapticFeedback, performSuccessHapticFeedback, coroutineScope, showOfferActivationMessage, scaffoldState, context, null);
                rewardsOfferDetailsViewModel = viewModel;
                function1 = openUrl;
                composerImplV.A(rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1);
            } else {
                flow = flow2;
                scaffoldState = scaffoldStateD;
                i2 = i3;
                rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1 = objG2;
                function1 = openUrl;
                rewardsOfferDetailsViewModel = viewModel;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1);
            RewardsOfferDetailsContractLegacy.ViewState viewState = (RewardsOfferDetailsContractLegacy.ViewState) mutableStateA.getD();
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(rewardsOfferDetailsViewModel);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == obj) {
                Object rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$2$1 = new RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$2$1(1, rewardsOfferDetailsViewModel, RewardsOfferDetailsViewModel.class, "onErrorStateActionClicked", "onErrorStateActionClicked(Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy;)V", 0);
                composerImplV.A(rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$2$1);
                objG3 = rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$2$1;
            }
            composerImplV.V(false);
            Function1 function12 = (Function1) ((KFunction) objG3);
            composerImplV.o(5004770);
            boolean z = i4 == 256;
            Object objG4 = composerImplV.G();
            if (z || objG4 == obj) {
                objG4 = new au.com.woolworths.design.wx.component.searchbar.a(9, function1);
                composerImplV.A(objG4);
            }
            Function1 function13 = (Function1) objG4;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(rewardsOfferDetailsViewModel);
            Object objG5 = composerImplV.G();
            if (zI3 || objG5 == obj) {
                Object rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$4$1 = new RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$4$1(0, rewardsOfferDetailsViewModel, RewardsOfferDetailsViewModel.class, "onBackClicked", "onBackClicked()V", 0);
                composerImplV.A(rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$4$1);
                objG5 = rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$4$1;
            }
            composerImplV.V(false);
            Function0 function0 = (Function0) ((KFunction) objG5);
            composerImplV.o(5004770);
            boolean zI4 = composerImplV.I(rewardsOfferDetailsViewModel);
            Object objG6 = composerImplV.G();
            if (zI4 || objG6 == obj) {
                Object rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$5$1 = new RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$5$1(0, rewardsOfferDetailsViewModel, RewardsOfferDetailsViewModel.class, "onBannerClick", "onBannerClick()V", 0);
                composerImplV.A(rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$5$1);
                objG6 = rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$5$1;
            }
            composerImplV.V(false);
            Function0 function02 = (Function0) ((KFunction) objG6);
            composerImplV.o(5004770);
            boolean zI5 = composerImplV.I(rewardsOfferDetailsViewModel);
            Object objG7 = composerImplV.G();
            if (zI5 || objG7 == obj) {
                Object rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$6$1 = new RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$6$1(0, rewardsOfferDetailsViewModel, RewardsOfferDetailsViewModel.class, "activateOffer", "activateOffer()V", 0);
                composerImplV.A(rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$6$1);
                objG7 = rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$6$1;
            }
            composerImplV.V(false);
            Function0 function03 = (Function0) ((KFunction) objG7);
            composerImplV.o(5004770);
            boolean zI6 = composerImplV.I(rewardsOfferDetailsViewModel);
            Object objG8 = composerImplV.G();
            if (zI6 || objG8 == obj) {
                rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$7$1 = new RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$7$1(2, rewardsOfferDetailsViewModel, RewardsOfferDetailsViewModel.class, "openUrl", "openUrl(Ljava/lang/String;Ljava/lang/String;)V", 0);
                rewardsOfferDetailsViewModel2 = rewardsOfferDetailsViewModel;
                composerImplV.A(rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$7$1);
            } else {
                rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$7$1 = objG8;
                rewardsOfferDetailsViewModel2 = rewardsOfferDetailsViewModel;
            }
            composerImplV.V(false);
            f(viewState, function12, function13, function0, function02, function03, (Function2) ((KFunction) rewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$7$1), modifier, scaffoldState, composerImplV, i2 & 29360128, 0);
            composerImpl = composerImplV;
            AnimatedVisibilityKt.d(((RewardsOfferDetailsContractLegacy.ViewState) mutableStateA.getD()).e, null, EnterExitTransitionKt.e(null, 3), null, null, ComposableLambdaKt.c(-1882442690, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    composer2.o(5004770);
                    RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel3 = rewardsOfferDetailsViewModel2;
                    boolean zI7 = composer2.I(rewardsOfferDetailsViewModel3);
                    Object objG9 = composer2.G();
                    if (zI7 || objG9 == Composer.Companion.f1624a) {
                        objG9 = new f(rewardsOfferDetailsViewModel3, 0);
                        composer2.A(objG9);
                    }
                    composer2.l();
                    RewardsConfettiKt.a(0, 1, composer2, null, (Function0) objG9);
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, 196992, 26);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(rewardsOfferDetailsViewModel2, onBackClick, openUrl, showOfferActivationMessage, onCloseScreenAndShowError, performSuccessHapticFeedback, performFailureHapticFeedback, modifier, i);
        }
    }
}
