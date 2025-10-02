package au.com.woolworths.shop.rewards.priming.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.v2.ui.g;
import au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract;
import au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel;
import au.com.woolworths.shop.rewards.priming.data.PrimingScreenData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$ViewState;", "viewState", "shop-rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsSetupPrimingScreenKt {
    public static final void a(RewardsSetupPrimingViewModel viewModel, final Function0 onSignInClick, final Function0 onJoinClick, final Function0 onBackClick, boolean z, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onSignInClick, "onSignInClick");
        Intrinsics.h(onJoinClick, "onJoinClick");
        Intrinsics.h(onBackClick, "onBackClick");
        ComposerImpl composerImplV = composer.v(247263898);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onSignInClick) ? 32 : 16) | (composerImplV.I(onJoinClick) ? 256 : 128) | (composerImplV.I(onBackClick) ? 2048 : 1024) | (composerImplV.p(z) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 57344) == 16384) | composerImplV.I(viewModel);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new RewardsSetupPrimingScreenKt$RewardsSetupPrimingScreen$1$1(viewModel, z, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG);
            final MutableState mutableStateA = FlowExtKt.a(viewModel.k, composerImplV);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(1554885855, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.priming.ui.RewardsSetupPrimingScreenKt$RewardsSetupPrimingScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.priming_screen_title);
                        final Function0 function0 = onBackClick;
                        TopNavBarKt.b(strC, null, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1185107760, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.priming.ui.RewardsSetupPrimingScreenKt$RewardsSetupPrimingScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), "Back", function0, null, false, 0L, composer3, 48, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 805306368, 0, 1534);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-963721263, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.priming.ui.RewardsSetupPrimingScreenKt$RewardsSetupPrimingScreen$3
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
                        Modifier modifierE = PaddingKt.e(SizeKt.c, paddingValues);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
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
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        State state = mutableStateA;
                        if (((RewardsSetupPrimingContract.ViewState) state.getD()).f12902a) {
                            composer2.o(-373805659);
                            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 29, WxTheme.a(composer2).h(), 0L, composer2, null);
                            composer2 = composer2;
                            composer2.l();
                        } else {
                            composer2.o(-373690990);
                            PrimingScreenData primingScreenData = ((RewardsSetupPrimingContract.ViewState) state.getD()).b;
                            if (primingScreenData != null) {
                                PrimingContentUiKt.a(primingScreenData, onSignInClick, onJoinClick, null, null, composer2, 0);
                            }
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 1018);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(i, 7, viewModel, onSignInClick, onJoinClick, onBackClick, z);
        }
    }
}
