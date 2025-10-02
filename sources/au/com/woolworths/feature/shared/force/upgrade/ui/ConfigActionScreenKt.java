package au.com.woolworths.feature.shared.force.upgrade.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.dynamic.page.ui.content.i;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionContract;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ConfigActionScreenKt {
    public static final void a(final ConfigActionContract.ViewState viewState, ApplicationType applicationType, Function1 onUpgradeComponentShown, final Function2 onAppVersionUpdateClick, final Function2 onAppVersionUpdateIgnored, final Function2 onOsVersionUpdateClick, final Function1 onOsVersionUpdateIgnored, final Function2 onShowRewardsCardClick, Composer composer, int i) {
        ApplicationType applicationType2;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onUpgradeComponentShown, "onUpgradeComponentShown");
        Intrinsics.h(onAppVersionUpdateClick, "onAppVersionUpdateClick");
        Intrinsics.h(onAppVersionUpdateIgnored, "onAppVersionUpdateIgnored");
        Intrinsics.h(onOsVersionUpdateClick, "onOsVersionUpdateClick");
        Intrinsics.h(onOsVersionUpdateIgnored, "onOsVersionUpdateIgnored");
        Intrinsics.h(onShowRewardsCardClick, "onShowRewardsCardClick");
        ComposerImpl composerImplV = composer.v(1781637869);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.r(applicationType.ordinal()) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onUpgradeComponentShown) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onAppVersionUpdateClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onAppVersionUpdateIgnored) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onOsVersionUpdateClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onOsVersionUpdateIgnored) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onShowRewardsCardClick) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            applicationType2 = applicationType;
        } else {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 14) == 4) | ((i2 & 896) == 256) | composerImplV.I(lifecycleOwner);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new androidx.lifecycle.compose.b(11, lifecycleOwner, viewState, onUpgradeComponentShown);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.c(lifecycleOwner, (Function1) objG, composerImplV);
            applicationType2 = applicationType;
            CompositionLocalKt.a(LocalApplicationContextKt.f6514a.b(new ApplicationContext(applicationType2)), ComposableLambdaKt.c(623773229, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.force.upgrade.ui.ConfigActionScreenKt$ConfigActionScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ConfigActionContract.ViewState viewState2 = viewState;
                        if (viewState2 instanceof ConfigActionContract.ViewState.Content) {
                            composer2.o(-1495130442);
                            UpdateDialogKt.a(((ConfigActionContract.ViewState.Content) viewState2).f6500a, onAppVersionUpdateClick, onAppVersionUpdateIgnored, onOsVersionUpdateClick, onOsVersionUpdateIgnored, composer2, 0);
                            composer2.l();
                        } else if (viewState2 instanceof ConfigActionContract.ViewState.FullScreenContent) {
                            composer2.o(-1494769695);
                            UpdateFullScreenType updateFullScreenType = ((ConfigActionContract.ViewState.FullScreenContent) viewState2).f6501a;
                            composer2.o(5004770);
                            Function2 function2 = onAppVersionUpdateClick;
                            boolean zN = composer2.n(function2);
                            Object objG2 = composer2.G();
                            Object obj3 = Composer.Companion.f1624a;
                            if (zN || objG2 == obj3) {
                                objG2 = new i(2, function2);
                                composer2.A(objG2);
                            }
                            Function1 function1 = (Function1) objG2;
                            composer2.l();
                            composer2.o(5004770);
                            Function2 function22 = onOsVersionUpdateClick;
                            boolean zN2 = composer2.n(function22);
                            Object objG3 = composer2.G();
                            if (zN2 || objG3 == obj3) {
                                objG3 = new i(3, function22);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            UpdateFullScreenKt.b(updateFullScreenType, function1, (Function1) objG3, onShowRewardsCardClick, composer2, 0);
                            composer2.l();
                        } else {
                            composer2.o(-1494234945);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.broadcastbanner.b(viewState, applicationType2, onUpgradeComponentShown, onAppVersionUpdateClick, onAppVersionUpdateIgnored, onOsVersionUpdateClick, onOsVersionUpdateIgnored, onShowRewardsCardClick, i, 1);
        }
    }
}
