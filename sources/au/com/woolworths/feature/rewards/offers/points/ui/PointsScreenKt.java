package au.com.woolworths.feature.rewards.offers.points.ui;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.compose.utils.effect.ChangedEffectKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.j;
import au.com.woolworths.feature.rewards.offers.ActivityOfferExtKt;
import au.com.woolworths.feature.rewards.offers.RewardsHomeBridgeViewModel;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContractKt;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.RewardsBoostersListViewKt;
import au.com.woolworths.foundation.rewards.common.ui.CircularProgressIndicatorBoxedKt;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import au.com.woolworths.rewards.base.confetti.RewardsConfettiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$ViewState;", "viewState", "", "topPx", "", "isFixedSize", "offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PointsScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RewardsOfferListFullPageErrorState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = RewardsOfferListFullPageErrorState.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState2 = RewardsOfferListFullPageErrorState.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState3 = RewardsOfferListFullPageErrorState.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final void a(int i, int i2, Composer composer, Modifier modifier, Function1 showSnackbar, boolean z, boolean z2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object obj;
        Object pointsScreenKt$PointsScreen$pullRefreshState$1$1;
        Intrinsics.h(showSnackbar, "showSnackbar");
        ComposerImpl composerImplV = composer.v(1609515985);
        if ((i & 48) == 0) {
            i3 = i | (composerImplV.p(z) ? 32 : 16);
        } else {
            i3 = i;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (composerImplV.n(modifier2) ? 2048 : 1024);
        }
        int i6 = i4 | (composerImplV.I(showSnackbar) ? 16384 : 8192);
        if ((i6 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier3 = i5 != 0 ? companion : modifier2;
            ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composerImplV);
            if (viewModelStoreOwnerA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            CreationExtras defaultViewModelCreationExtras = viewModelStoreOwnerA instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            final RewardsPointsViewModel rewardsPointsViewModel = (RewardsPointsViewModel) ViewModelKt.a(viewModelStoreOwnerA, reflectionFactory.b(RewardsPointsViewModel.class), null, defaultViewModelCreationExtras);
            final AppCompatActivity appCompatActivityB = ContextExtKt.b((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            RewardsHomeBridgeViewModel rewardsHomeBridgeViewModel = (RewardsHomeBridgeViewModel) ViewModelKt.a(appCompatActivityB, reflectionFactory.b(RewardsHomeBridgeViewModel.class), null, appCompatActivityB != null ? appCompatActivityB.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b);
            Integer numValueOf = Integer.valueOf(((Number) FlowExtKt.a(rewardsHomeBridgeViewModel.h, composerImplV).getD()).intValue());
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(rewardsPointsViewModel);
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (zI || objG == obj2) {
                objG = new PointsScreenKt$PointsScreen$1$1(rewardsPointsViewModel, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            ChangedEffectKt.a(numValueOf, (Function2) objG, composerImplV, 0);
            MutableState mutableStateA = FlowExtKt.a(rewardsHomeBridgeViewModel.f, composerImplV);
            Object d = mutableStateA.getD();
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(mutableStateA) | composerImplV.I(rewardsPointsViewModel);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj2) {
                objG2 = new PointsScreenKt$PointsScreen$2$1(mutableStateA, rewardsPointsViewModel, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, d, (Function2) objG2);
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(rewardsHomeBridgeViewModel) | composerImplV.I(rewardsPointsViewModel);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == obj2) {
                objG3 = new PointsScreenKt$PointsScreen$3$1(rewardsHomeBridgeViewModel, rewardsPointsViewModel, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Unit unit = Unit.f24250a;
            EffectsKt.e(composerImplV, unit, (Function2) objG3);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(rewardsPointsViewModel);
            Object objG4 = composerImplV.G();
            if (zI3 || objG4 == obj2) {
                objG4 = new a(rewardsPointsViewModel, 0);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.c(unit, (Function1) objG4, composerImplV);
            MutableState mutableStateA2 = SnapshotStateKt.a(rewardsPointsViewModel.A, composerImplV);
            boolean z3 = ((RewardsPointsContract.ViewState) mutableStateA2.getD()).b;
            composerImplV.o(5004770);
            boolean zI4 = composerImplV.I(rewardsPointsViewModel);
            Object objG5 = composerImplV.G();
            if (zI4 || objG5 == obj2) {
                obj = obj2;
                pointsScreenKt$PointsScreen$pullRefreshState$1$1 = new PointsScreenKt$PointsScreen$pullRefreshState$1$1(0, rewardsPointsViewModel, RewardsPointsViewModel.class, "onPullRefresh", "onPullRefresh()V", 0);
                composerImplV.A(pointsScreenKt$PointsScreen$pullRefreshState$1$1);
            } else {
                obj = obj2;
                pointsScreenKt$PointsScreen$pullRefreshState$1$1 = objG5;
            }
            composerImplV.V(false);
            PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(z3, (Function0) ((KFunction) pointsScreenKt$PointsScreen$pullRefreshState$1$1), composerImplV, 0);
            Modifier modifierA = PullRefreshKt.a(modifier3, pullRefreshStateA, z);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i7 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(5004770);
            boolean zI5 = composerImplV.I(appCompatActivityB);
            Object objG6 = composerImplV.G();
            if (zI5 || objG6 == obj) {
                objG6 = new au.com.woolworths.feature.rewards.offers.detail.composable.f(appCompatActivityB, 2);
                composerImplV.A(objG6);
            }
            Function0 function02 = (Function0) objG6;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI6 = composerImplV.I(appCompatActivityB);
            Object objG7 = composerImplV.G();
            if (zI6 || objG7 == obj) {
                final int i8 = 0;
                objG7 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i8) {
                            case 0:
                                String it = (String) obj3;
                                Intrinsics.h(it, "it");
                                ContextExtKt.e(appCompatActivityB, it);
                                break;
                            default:
                                OfferActivationMessage it2 = (OfferActivationMessage) obj3;
                                Intrinsics.h(it2, "it");
                                ActivityOfferExtKt.a(appCompatActivityB, it2);
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG7);
            }
            Function1 function1 = (Function1) objG7;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI7 = composerImplV.I(appCompatActivityB) | composerImplV.I(rewardsPointsViewModel);
            Object objG8 = composerImplV.G();
            if (zI7 || objG8 == obj) {
                objG8 = new b(appCompatActivityB, rewardsPointsViewModel);
                composerImplV.A(objG8);
            }
            Function1 function12 = (Function1) objG8;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI8 = composerImplV.I(appCompatActivityB) | composerImplV.I(rewardsPointsViewModel);
            Object objG9 = composerImplV.G();
            if (zI8 || objG9 == obj) {
                final int i9 = 0;
                objG9 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                BuildersKt.c(androidx.lifecycle.ViewModelKt.a(rewardsPointsViewModel), null, null, new PointsScreenKt$PointsScreen$performHapticFeedback$1$1(true, appCompatActivityB, null), 3);
                                break;
                            default:
                                BuildersKt.c(androidx.lifecycle.ViewModelKt.a(rewardsPointsViewModel), null, null, new PointsScreenKt$PointsScreen$performHapticFeedback$1$1(false, appCompatActivityB, null), 3);
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG9);
            }
            Function0 function03 = (Function0) objG9;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI9 = composerImplV.I(appCompatActivityB) | composerImplV.I(rewardsPointsViewModel);
            Object objG10 = composerImplV.G();
            if (zI9 || objG10 == obj) {
                final int i10 = 1;
                objG10 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                BuildersKt.c(androidx.lifecycle.ViewModelKt.a(rewardsPointsViewModel), null, null, new PointsScreenKt$PointsScreen$performHapticFeedback$1$1(true, appCompatActivityB, null), 3);
                                break;
                            default:
                                BuildersKt.c(androidx.lifecycle.ViewModelKt.a(rewardsPointsViewModel), null, null, new PointsScreenKt$PointsScreen$performHapticFeedback$1$1(false, appCompatActivityB, null), 3);
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG10);
            }
            Function0 function04 = (Function0) objG10;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI10 = composerImplV.I(appCompatActivityB);
            Object objG11 = composerImplV.G();
            if (zI10 || objG11 == obj) {
                final int i11 = 1;
                objG11 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i11) {
                            case 0:
                                String it = (String) obj3;
                                Intrinsics.h(it, "it");
                                ContextExtKt.e(appCompatActivityB, it);
                                break;
                            default:
                                OfferActivationMessage it2 = (OfferActivationMessage) obj3;
                                Intrinsics.h(it2, "it");
                                ActivityOfferExtKt.a(appCompatActivityB, it2);
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG11);
            }
            composerImplV.V(false);
            c(rewardsPointsViewModel, z2, showSnackbar, function02, function1, function12, function03, function04, (Function1) objG11, composerImplV, ((i6 >> 3) & 7168) | 432);
            composerImplV.o(386442560);
            if (z) {
                PullRefreshIndicatorKt.a(((RewardsPointsContract.ViewState) mutableStateA2.getD()).b, pullRefreshStateA, BoxScopeInstance.f944a.g(companion, Alignment.Companion.b), WxTheme.a(composerImplV).a(), WxTheme.a(composerImplV).h(), composerImplV, 64, 32);
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            composerImplV.V(true);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.c(z, z2, modifier2, showSnackbar, i, i2);
        }
    }

    public static final void b(final RewardsPointsContract.ViewState viewState, final boolean z, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final Function2 function2, final Function1 function15, Function1 function16, final Function1 function17, final Function1 function18, final Function1 function19, final Function1 function110, final Function0 function0, final Function1 function111, final Function1 function112, final Function2 function22, final Function0 function02, final Function1 function113, final RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener, final RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener, final Modifier modifier, Composer composer, final int i) {
        int i2;
        MutableState mutableState;
        ComposerImpl composerImpl;
        MutableState mutableState2;
        boolean z2;
        int i3;
        final FullPageMessageSpec fullPageMessageSpecC;
        final Function1 function114;
        ComposerImpl composerImplV = composer.v(1912974920);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(true) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function12) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= composerImplV.I(function13) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerImplV.I(function14) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerImplV.I(function2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerImplV.I(function15) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerImplV.I(function16) ? 536870912 : 268435456;
        }
        int i4 = (composerImplV.I(function17) ? 4 : 2) | (composerImplV.I(function18) ? 32 : 16) | (composerImplV.I(function19) ? 256 : 128) | (composerImplV.I(function110) ? 2048 : 1024) | (composerImplV.I(function0) ? 16384 : 8192) | (composerImplV.I(function111) ? 131072 : 65536) | (composerImplV.I(function112) ? 1048576 : 524288) | (composerImplV.I(function22) ? 8388608 : 4194304) | (composerImplV.I(function02) ? 67108864 : 33554432) | (composerImplV.I(function113) ? 536870912 : 268435456);
        int i5 = (composerImplV.n(offerFeedInlineBannerListener) ? 4 : 2) | (composerImplV.n(rewardsCtaCardListener) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && (i5 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function114 = function16;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objG);
            }
            MutableState mutableState3 = (MutableState) objG;
            composerImplV.V(false);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Boolean bool = (Boolean) mutableState3.getD();
            bool.getClass();
            composerImplV.o(-1633490746);
            boolean z3 = (i2 & 1879048192) == 536870912;
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == composer$Companion$Empty$1) {
                objG2 = new PointsScreenKt$PointsScreen$29$1(function16, mutableState3, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, bool, (Function2) objG2);
            Intrinsics.h(viewState, "<this>");
            RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = viewState.c;
            boolean z4 = viewState.f6374a;
            if (z4 && (rewardsOfferListFullPageErrorState != null || viewState.e == null)) {
                composerImplV.o(-483648703);
                CircularProgressIndicatorBoxedKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), null, null, composerImplV, 6);
                mutableState3.setValue(Boolean.TRUE);
                composerImplV.V(false);
                mutableState = mutableState3;
            } else if (rewardsOfferListFullPageErrorState == null || z4) {
                composerImplV.o(-481890290);
                composerImplV.o(5004770);
                Object objG3 = composerImplV.G();
                if (objG3 == composer$Companion$Empty$1) {
                    objG3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState3, 2);
                    composerImplV.A(objG3);
                }
                Function1 function115 = (Function1) objG3;
                composerImplV.V(false);
                int i6 = i2 >> 3;
                mutableState = mutableState3;
                RewardsBoostersListViewKt.b(z, viewState, function1, function12, function13, function14, function2, function115, function17, function18, function19, function110, function0, function111, function112, function22, function02, function113, offerFeedInlineBannerListener, rewardsCtaCardListener, modifier, composerImplV, (i2 & 29360128) | (i6 & 112) | (i6 & 14) | 100663296 | ((i2 << 6) & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | ((i4 << 27) & 1879048192), ((i4 >> 3) & 268435454) | ((i5 << 27) & 1879048192), (i5 >> 3) & 126);
                composerImpl = composerImplV;
                composerImpl.V(false);
                Boolean bool2 = (Boolean) mutableState.getD();
                bool2.getClass();
                function114 = function16;
                function114.invoke(bool2);
            } else {
                composerImplV.o(-483438802);
                if (rewardsOfferListFullPageErrorState == null) {
                    mutableState2 = mutableState3;
                    z2 = false;
                } else {
                    Painter painterA = PainterResources_androidKt.a(rewardsOfferListFullPageErrorState.getG(), 0, composerImplV);
                    Text d = rewardsOfferListFullPageErrorState.getD();
                    String strValueOf = String.valueOf(d != null ? d.getText(context) : null);
                    String string = rewardsOfferListFullPageErrorState.getE().getText(context).toString();
                    composerImplV.o(-1633490746);
                    boolean zR = ((i2 & 234881024) == 67108864) | composerImplV.r(rewardsOfferListFullPageErrorState.ordinal());
                    Object objG4 = composerImplV.G();
                    if (zR || objG4 == composer$Companion$Empty$1) {
                        objG4 = new d(0, rewardsOfferListFullPageErrorState, function15);
                        composerImplV.A(objG4);
                    }
                    Function0 function03 = (Function0) objG4;
                    composerImplV.V(false);
                    int iOrdinal = rewardsOfferListFullPageErrorState.ordinal();
                    if (iOrdinal == 0) {
                        mutableState2 = mutableState3;
                        z2 = false;
                        i3 = 6;
                        composerImplV.o(-311367628);
                        composerImplV = composerImplV;
                        fullPageMessageSpecC = FullPageMessageSpec.Companion.c(painterA, strValueOf, string, null, function03, composerImplV, 18);
                        composerImplV.V(false);
                        CoreThemeKt.b(i3, composerImplV, ComposableLambdaKt.c(235514746, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$30$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2 = (Composer) obj;
                                if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    FullPageMessageUiKt.a(fullPageMessageSpecC, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), Alignment.Companion.j, composer2, 432, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composerImplV));
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw au.com.woolworths.android.onesite.a.w(-311373469, composerImplV, false);
                                }
                            }
                            mutableState2 = mutableState3;
                            z2 = false;
                            i3 = 6;
                            composerImplV.o(-311367628);
                            composerImplV = composerImplV;
                            fullPageMessageSpecC = FullPageMessageSpec.Companion.c(painterA, strValueOf, string, null, function03, composerImplV, 18);
                            composerImplV.V(false);
                            CoreThemeKt.b(i3, composerImplV, ComposableLambdaKt.c(235514746, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$30$1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer2 = (Composer) obj;
                                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        FullPageMessageUiKt.a(fullPageMessageSpecC, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), Alignment.Companion.j, composer2, 432, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composerImplV));
                        }
                        composerImplV.o(-311354608);
                        mutableState2 = mutableState3;
                        z2 = false;
                        i3 = 6;
                        fullPageMessageSpecC = FullPageMessageSpec.Companion.f(painterA, null, strValueOf, string, null, function03, composerImplV, 18);
                        composerImplV.V(false);
                        composerImplV = composerImplV;
                        CoreThemeKt.b(i3, composerImplV, ComposableLambdaKt.c(235514746, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$30$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2 = (Composer) obj;
                                if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    FullPageMessageUiKt.a(fullPageMessageSpecC, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), Alignment.Companion.j, composer2, 432, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composerImplV));
                    }
                }
                mutableState2.setValue(Boolean.TRUE);
                composerImplV.V(z2);
                mutableState = mutableState2;
            }
            composerImpl = composerImplV;
            Boolean bool22 = (Boolean) mutableState.getD();
            bool22.getClass();
            function114 = function16;
            function114.invoke(bool22);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    PointsScreenKt.b(viewState, z, function1, function12, function13, function14, function2, function15, function114, function17, function18, function19, function110, function0, function111, function112, function22, function02, function113, offerFeedInlineBannerListener, rewardsCtaCardListener, modifier, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.ComposerImpl] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v21, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v22 */
    public static final void c(RewardsPointsViewModel rewardsPointsViewModel, boolean z, Function1 showSnackbar, Function0 onCloseScreen, Function1 openUrl, Function1 showOfferDetailScreen, Function0 performSuccessHapticFeedback, Function0 performFailureHapticFeedback, Function1 showOfferActivationMessage, Composer composer, int i) {
        int i2;
        int i3;
        ?? r13;
        ?? arrayList;
        Object pointsScreenKt$PointsScreen$25$1;
        final RewardsPointsViewModel rewardsPointsViewModel2;
        ComposerImpl composerImpl;
        RewardsPointsViewModel rewardsPointsViewModel3 = rewardsPointsViewModel;
        Intrinsics.h(showSnackbar, "showSnackbar");
        Intrinsics.h(onCloseScreen, "onCloseScreen");
        Intrinsics.h(openUrl, "openUrl");
        Intrinsics.h(showOfferDetailScreen, "showOfferDetailScreen");
        Intrinsics.h(performSuccessHapticFeedback, "performSuccessHapticFeedback");
        Intrinsics.h(performFailureHapticFeedback, "performFailureHapticFeedback");
        Intrinsics.h(showOfferActivationMessage, "showOfferActivationMessage");
        ?? V = composer.v(2063627668);
        if ((i & 6) == 0) {
            i2 = (V.I(rewardsPointsViewModel3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= V.p(true) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= V.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= V.I(showSnackbar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= V.I(onCloseScreen) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= V.I(openUrl) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= V.I(showOfferDetailScreen) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= V.I(performSuccessHapticFeedback) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= V.I(performFailureHapticFeedback) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= V.I(showOfferActivationMessage) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && V.c()) {
            V.j();
            rewardsPointsViewModel2 = rewardsPointsViewModel3;
            composerImpl = V;
        } else {
            MutableState mutableStateA = FlowExtKt.a(rewardsPointsViewModel3.A, V);
            Context context = (Context) V.x(AndroidCompositionLocals_androidKt.b);
            SharedFlow sharedFlow = rewardsPointsViewModel3.j;
            V.o(-1224400529);
            boolean zI = V.I(rewardsPointsViewModel3) | ((i2 & 57344) == 16384) | ((458752 & i2) == 131072) | ((234881024 & i2) == 67108864) | ((29360128 & i2) == 8388608) | ((i2 & 7168) == 2048) | V.I(context) | ((1879048192 & i2) == 536870912) | ((3670016 & i2) == 1048576);
            Object objG = V.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                i3 = i2;
                r13 = 0;
                PointsScreenKt$PointsScreen$7$1 pointsScreenKt$PointsScreen$7$1 = new PointsScreenKt$PointsScreen$7$1(rewardsPointsViewModel3, onCloseScreen, openUrl, performFailureHapticFeedback, performSuccessHapticFeedback, showSnackbar, context, showOfferActivationMessage, showOfferDetailScreen, null);
                rewardsPointsViewModel3 = rewardsPointsViewModel3;
                V.A(pointsScreenKt$PointsScreen$7$1);
                objG = pointsScreenKt$PointsScreen$7$1;
            } else {
                i3 = i2;
                r13 = 0;
            }
            V.V(r13);
            EffectsKt.e(V, sharedFlow, (Function2) objG);
            Set set = ((RewardsPointsContract.ViewState) mutableStateA.getD()).h;
            if (set != null) {
                Set set2 = set;
                arrayList = new ArrayList(CollectionsKt.s(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RewardsOfferFilterData) it.next()).b);
                }
            } else {
                arrayList = EmptyList.d;
            }
            final List list = arrayList;
            final int iA = RewardsPointsContractKt.a((RewardsPointsContract.ViewState) mutableStateA.getD());
            V.o(5004770);
            boolean zI2 = V.I(rewardsPointsViewModel3);
            Object objG2 = V.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$8$1 pointsScreenKt$PointsScreen$8$1 = new PointsScreenKt$PointsScreen$8$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onSelectedFilterChanged", "onSelectedFilterChanged(I)V", 0);
                V.A(pointsScreenKt$PointsScreen$8$1);
                objG2 = pointsScreenKt$PointsScreen$8$1;
            }
            V.V(r13);
            final Function1 onSelectedIndexChanged = (Function1) ((KFunction) objG2);
            Intrinsics.h(onSelectedIndexChanged, "onSelectedIndexChanged");
            rewardsPointsViewModel3.y2();
            rewardsPointsViewModel3.b3(new Function1() { // from class: au.com.woolworths.rewards.base.b
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    LocalScrollStatus update = (LocalScrollStatus) obj;
                    Intrinsics.h(update, "$this$update");
                    update.c.getClass();
                    update.c = new RewardsPageScrollManager.StickyFilter(iA, list, onSelectedIndexChanged);
                    return Unit.f24250a;
                }
            });
            V.o(1849434622);
            Object objG3 = V.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = SnapshotIntStateKt.a(r13);
                V.A(objG3);
            }
            MutableIntState mutableIntState = (MutableIntState) objG3;
            V.V(r13);
            RewardsPointsContract.ViewState viewState = (RewardsPointsContract.ViewState) mutableStateA.getD();
            V.o(5004770);
            boolean zI3 = V.I(rewardsPointsViewModel3);
            Object objG4 = V.G();
            if (zI3 || objG4 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$9$1 pointsScreenKt$PointsScreen$9$1 = new PointsScreenKt$PointsScreen$9$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onBannerClick", "onBannerClick(Lau/com/woolworths/feature/rewards/offers/SectionViewItem;)V", 0);
                V.A(pointsScreenKt$PointsScreen$9$1);
                objG4 = pointsScreenKt$PointsScreen$9$1;
            }
            V.V(r13);
            Function1 function1 = (Function1) ((KFunction) objG4);
            V.o(5004770);
            boolean zI4 = V.I(rewardsPointsViewModel3);
            Object objG5 = V.G();
            if (zI4 || objG5 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$10$1 pointsScreenKt$PointsScreen$10$1 = new PointsScreenKt$PointsScreen$10$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onOfferSectionTitleCtaClick", "onOfferSectionTitleCtaClick(Lau/com/woolworths/feature/rewards/offers/OfferSectionViewItem;)V", 0);
                V.A(pointsScreenKt$PointsScreen$10$1);
                objG5 = pointsScreenKt$PointsScreen$10$1;
            }
            V.V(r13);
            Function1 function12 = (Function1) ((KFunction) objG5);
            V.o(5004770);
            boolean zI5 = V.I(rewardsPointsViewModel3);
            Object objG6 = V.G();
            if (zI5 || objG6 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$11$1 pointsScreenKt$PointsScreen$11$1 = new PointsScreenKt$PointsScreen$11$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onOfferClick", "onOfferClick(Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;)V", 0);
                V.A(pointsScreenKt$PointsScreen$11$1);
                objG6 = pointsScreenKt$PointsScreen$11$1;
            }
            V.V(r13);
            Function1 function13 = (Function1) ((KFunction) objG6);
            V.o(5004770);
            boolean zI6 = V.I(rewardsPointsViewModel3);
            Object objG7 = V.G();
            if (zI6 || objG7 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$12$1 pointsScreenKt$PointsScreen$12$1 = new PointsScreenKt$PointsScreen$12$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "activateOffer", "activateOffer(Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;)V", 0);
                V.A(pointsScreenKt$PointsScreen$12$1);
                objG7 = pointsScreenKt$PointsScreen$12$1;
            }
            V.V(r13);
            Function1 function14 = (Function1) ((KFunction) objG7);
            V.o(5004770);
            boolean zI7 = V.I(rewardsPointsViewModel3);
            Object objG8 = V.G();
            if (zI7 || objG8 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$13$1 pointsScreenKt$PointsScreen$13$1 = new PointsScreenKt$PointsScreen$13$1(2, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onOfferCtaButtonClick", "onOfferCtaButtonClick(Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;Lau/com/woolworths/android/onesite/data/ContentCta;)V", 0);
                V.A(pointsScreenKt$PointsScreen$13$1);
                objG8 = pointsScreenKt$PointsScreen$13$1;
            }
            V.V(r13);
            Function2 function2 = (Function2) ((KFunction) objG8);
            V.o(5004770);
            boolean zI8 = V.I(rewardsPointsViewModel3);
            Object objG9 = V.G();
            if (zI8 || objG9 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$14$1 pointsScreenKt$PointsScreen$14$1 = new PointsScreenKt$PointsScreen$14$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onRetryClicked", "onRetryClicked(Lau/com/woolworths/feature/rewards/offers/list/RewardsOfferListFullPageErrorState;)V", 0);
                V.A(pointsScreenKt$PointsScreen$14$1);
                objG9 = pointsScreenKt$PointsScreen$14$1;
            }
            V.V(r13);
            Function1 function15 = (Function1) ((KFunction) objG9);
            V.o(5004770);
            boolean zI9 = V.I(rewardsPointsViewModel3);
            Object objG10 = V.G();
            if (zI9 || objG10 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$15$1 pointsScreenKt$PointsScreen$15$1 = new PointsScreenKt$PointsScreen$15$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onRefreshedContent", "onRefreshedContent(Z)V", 0);
                V.A(pointsScreenKt$PointsScreen$15$1);
                objG10 = pointsScreenKt$PointsScreen$15$1;
            }
            V.V(r13);
            Function1 function16 = (Function1) ((KFunction) objG10);
            V.o(-1633490746);
            boolean zI10 = V.I(rewardsPointsViewModel3);
            Object objG11 = V.G();
            if (zI10 || objG11 == composer$Companion$Empty$1) {
                objG11 = new b(rewardsPointsViewModel3, mutableIntState, 1);
                V.A(objG11);
            }
            Function1 function17 = (Function1) objG11;
            V.V(r13);
            V.o(5004770);
            boolean zI11 = V.I(rewardsPointsViewModel3);
            Object objG12 = V.G();
            if (zI11 || objG12 == composer$Companion$Empty$1) {
                objG12 = new a(rewardsPointsViewModel3, 1);
                V.A(objG12);
            }
            Function1 function18 = (Function1) objG12;
            V.V(r13);
            V.o(5004770);
            boolean zI12 = V.I(rewardsPointsViewModel3);
            Object objG13 = V.G();
            if (zI12 || objG13 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$18$1 pointsScreenKt$PointsScreen$18$1 = new PointsScreenKt$PointsScreen$18$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "trackSpinSurpriseBannerImpression", "trackSpinSurpriseBannerImpression(Lau/com/woolworths/feature/rewards/offers/SpinSurpriseBannerViewItem;)V", 0);
                V.A(pointsScreenKt$PointsScreen$18$1);
                objG13 = pointsScreenKt$PointsScreen$18$1;
            }
            V.V(r13);
            Function1 function19 = (Function1) ((KFunction) objG13);
            V.o(5004770);
            boolean zI13 = V.I(rewardsPointsViewModel3);
            Object objG14 = V.G();
            if (zI13 || objG14 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$19$1 pointsScreenKt$PointsScreen$19$1 = new PointsScreenKt$PointsScreen$19$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "trackStandardBannerImpression", "trackStandardBannerImpression(Lau/com/woolworths/feature/rewards/offers/StandardBannerViewItem;)V", 0);
                V.A(pointsScreenKt$PointsScreen$19$1);
                objG14 = pointsScreenKt$PointsScreen$19$1;
            }
            V.V(r13);
            Function1 function110 = (Function1) ((KFunction) objG14);
            V.o(5004770);
            boolean zI14 = V.I(rewardsPointsViewModel3);
            Object objG15 = V.G();
            if (zI14 || objG15 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$20$1 pointsScreenKt$PointsScreen$20$1 = new PointsScreenKt$PointsScreen$20$1(0, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onProductOffersSwipeStarted", "onProductOffersSwipeStarted()V", 0);
                V.A(pointsScreenKt$PointsScreen$20$1);
                objG15 = pointsScreenKt$PointsScreen$20$1;
            }
            V.V(r13);
            Function0 function0 = (Function0) ((KFunction) objG15);
            V.o(5004770);
            boolean zI15 = V.I(rewardsPointsViewModel3);
            Object objG16 = V.G();
            if (zI15 || objG16 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$21$1 pointsScreenKt$PointsScreen$21$1 = new PointsScreenKt$PointsScreen$21$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onProductOffersSwipeEnded", "onProductOffersSwipeEnded(Z)V", 0);
                V.A(pointsScreenKt$PointsScreen$21$1);
                objG16 = pointsScreenKt$PointsScreen$21$1;
            }
            V.V(r13);
            Function1 function111 = (Function1) ((KFunction) objG16);
            V.o(5004770);
            boolean zI16 = V.I(rewardsPointsViewModel3);
            Object objG17 = V.G();
            if (zI16 || objG17 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$22$1 pointsScreenKt$PointsScreen$22$1 = new PointsScreenKt$PointsScreen$22$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onSelectedFilterChanged", "onSelectedFilterChanged(I)V", 0);
                V.A(pointsScreenKt$PointsScreen$22$1);
                objG17 = pointsScreenKt$PointsScreen$22$1;
            }
            V.V(r13);
            Function1 function112 = (Function1) ((KFunction) objG17);
            V.o(5004770);
            boolean zI17 = V.I(rewardsPointsViewModel3);
            Object objG18 = V.G();
            if (zI17 || objG18 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$23$1 pointsScreenKt$PointsScreen$23$1 = new PointsScreenKt$PointsScreen$23$1(2, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onErrorDialogCtaClicked", "onErrorDialogCtaClicked(Lau/com/woolworths/android/onesite/data/ContentCta;Ljava/lang/String;)V", 0);
                V.A(pointsScreenKt$PointsScreen$23$1);
                objG18 = pointsScreenKt$PointsScreen$23$1;
            }
            V.V(r13);
            Function2 function22 = (Function2) ((KFunction) objG18);
            V.o(5004770);
            boolean zI18 = V.I(rewardsPointsViewModel3);
            Object objG19 = V.G();
            if (zI18 || objG19 == composer$Companion$Empty$1) {
                PointsScreenKt$PointsScreen$24$1 pointsScreenKt$PointsScreen$24$1 = new PointsScreenKt$PointsScreen$24$1(0, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onErrorDialogDismiss", "onErrorDialogDismiss()V", 0);
                V.A(pointsScreenKt$PointsScreen$24$1);
                objG19 = pointsScreenKt$PointsScreen$24$1;
            }
            V.V(r13);
            Function0 function02 = (Function0) ((KFunction) objG19);
            V.o(5004770);
            boolean zI19 = V.I(rewardsPointsViewModel3);
            Object objG20 = V.G();
            if (zI19 || objG20 == composer$Companion$Empty$1) {
                pointsScreenKt$PointsScreen$25$1 = new PointsScreenKt$PointsScreen$25$1(1, rewardsPointsViewModel3, RewardsPointsViewModel.class, "onHeaderCtaClicked", "onHeaderCtaClicked(Lau/com/woolworths/android/onesite/data/ContentCta;)V", 0);
                rewardsPointsViewModel2 = rewardsPointsViewModel3;
                V.A(pointsScreenKt$PointsScreen$25$1);
            } else {
                pointsScreenKt$PointsScreen$25$1 = objG20;
                rewardsPointsViewModel2 = rewardsPointsViewModel3;
            }
            V.V(r13);
            Function1 function113 = (Function1) ((KFunction) pointsScreenKt$PointsScreen$25$1);
            RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener = rewardsPointsViewModel2.k;
            RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener = rewardsPointsViewModel2.l;
            V.o(-1633490746);
            boolean zI20 = V.I(rewardsPointsViewModel2);
            Object objG21 = V.G();
            if (zI20 || objG21 == composer$Companion$Empty$1) {
                objG21 = new b(rewardsPointsViewModel2, mutableIntState, 0);
                V.A(objG21);
            }
            V.V(r13);
            b(viewState, z, function1, function12, function13, function14, function2, function15, function16, function17, function18, function19, function110, function0, function111, function112, function22, function02, function113, offerFeedInlineBannerListener, rewardsCtaCardListener, OnPlacedModifierKt.a(Modifier.Companion.d, (Function1) objG21), V, i3 & 1008);
            composerImpl = V;
            AnimatedVisibilityKt.d(((RewardsPointsContract.ViewState) mutableStateA.getD()).j, null, EnterExitTransitionKt.e(null, 3), null, null, ComposableLambdaKt.c(1379577788, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$27
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    composer2.o(5004770);
                    RewardsPointsViewModel rewardsPointsViewModel4 = rewardsPointsViewModel2;
                    boolean zI21 = composer2.I(rewardsPointsViewModel4);
                    Object objG22 = composer2.G();
                    if (zI21 || objG22 == Composer.Companion.f1624a) {
                        objG22 = new au.com.woolworths.feature.rewards.offers.detail.composable.f(rewardsPointsViewModel4, 3);
                        composer2.A(objG22);
                    }
                    composer2.l();
                    RewardsConfettiKt.a(0, 1, composer2, null, (Function0) objG22);
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, 196992, 26);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new j(rewardsPointsViewModel2, z, showSnackbar, onCloseScreen, openUrl, showOfferDetailScreen, performSuccessHapticFeedback, performFailureHapticFeedback, showOfferActivationMessage, i);
        }
    }
}
