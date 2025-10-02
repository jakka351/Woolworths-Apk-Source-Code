package au.com.woolworths.feature.shop.bundles.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevationTokens;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.bundles.BundlesTransientError;
import au.com.woolworths.feature.shop.bundles.BundlesUiState;
import au.com.woolworths.feature.shop.bundles.BundlesViewModel;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"", "showBottomSheet", "topBarShadow", "Lau/com/woolworths/feature/shop/bundles/BundlesUiState;", "bundlesUiState", "bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BundlesTransientError.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BundlesTransientError bundlesTransientError = BundlesTransientError.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BundlesTransientError bundlesTransientError2 = BundlesTransientError.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(boolean z, BundlesViewModel bundlesViewModel, final Function0 onNavigateUp, final Function0 onSearchClicked, Function1 onOpenBottomSheet, Function1 onProductClick, Composer composer, int i) {
        final au.com.woolworths.feature.shop.bundles.e eVar;
        MutableState mutableState;
        final LazyPagingItems lazyPagingItems;
        int i2;
        String strC;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onSearchClicked, "onSearchClicked");
        Intrinsics.h(onOpenBottomSheet, "onOpenBottomSheet");
        Intrinsics.h(onProductClick, "onProductClick");
        ComposerImpl composerImplV = composer.v(-966032357);
        int i3 = i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(bundlesViewModel) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128) | (composerImplV.I(onSearchClicked) ? 2048 : 1024) | (composerImplV.I(onOpenBottomSheet) ? 16384 : 8192) | (composerImplV.I(onProductClick) ? 131072 : 65536);
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            final SheetState sheetStateA = SheetStateKt.a(0, 1, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            MutableState mutableState2 = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == obj) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            final MutableState mutableState3 = (MutableState) objD;
            composerImplV.V(false);
            final MutableState mutableStateA = FlowExtKt.a(bundlesViewModel.n, composerImplV);
            LazyPagingItems lazyPagingItemsA = LazyPagingItemsKt.a(bundlesViewModel.r, composerImplV);
            au.com.woolworths.feature.shop.bundles.e eVar2 = bundlesViewModel.A;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = new SnackbarHostState();
                composerImplV.A(objG2);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG2;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(bundlesViewModel);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == obj) {
                objG3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l(bundlesViewModel, 13);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            LifecycleEffectKt.c(null, (Function1) objG3, composerImplV, 6);
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(bundlesViewModel) | ((i3 & 14) == 4);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == obj) {
                objG4 = new BundlesScreenKt$BundlesScreen$2$1(bundlesViewModel, z, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG4);
            Flow flow = bundlesViewModel.p;
            composerImplV.o(-1224400529);
            boolean zI3 = ((i3 & 458752) == 131072) | ((i3 & 57344) == 16384) | composerImplV.I(bundlesViewModel) | composerImplV.I(context) | composerImplV.I(lazyPagingItemsA);
            Object objG5 = composerImplV.G();
            if (zI3 || objG5 == obj) {
                eVar = eVar2;
                mutableState = mutableState2;
                Object bundlesScreenKt$BundlesScreen$3$1 = new BundlesScreenKt$BundlesScreen$3$1(bundlesViewModel, context, onOpenBottomSheet, onProductClick, lazyPagingItemsA, mutableState, null);
                lazyPagingItems = lazyPagingItemsA;
                composerImplV.A(bundlesScreenKt$BundlesScreen$3$1);
                objG5 = bundlesScreenKt$BundlesScreen$3$1;
            } else {
                eVar = eVar2;
                lazyPagingItems = lazyPagingItemsA;
                mutableState = mutableState2;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG5);
            final au.com.woolworths.feature.shop.bundles.e eVar3 = eVar;
            final MutableState mutableState4 = mutableState;
            au.com.woolworths.feature.shop.bundles.e eVar4 = eVar;
            ScaffoldKt.a(WindowInsetsPaddingKt.d(SizeKt.c, WindowInsets_androidKt.b(composerImplV)), ComposableLambdaKt.c(1084599263, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$BundlesScreen$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC2 = StringResources_androidKt.c(composer2, R.string.bundles);
                        CoreElevationTokens coreElevationTokensC = CoreTheme.c(composer2);
                        CoreElevation coreElevation = ((Boolean) mutableState3.getD()).booleanValue() ? coreElevationTokensC.f4876a : coreElevationTokensC.c;
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1044594991, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$BundlesScreen$4.2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final State state = mutableStateA;
                        final Function1 function1 = eVar3;
                        final Function0 function02 = onSearchClicked;
                        TopNavBarKt.a(strC2, null, 0L, 0L, 0L, null, coreElevation, composableLambdaImplC, ComposableLambdaKt.c(-1883902264, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$BundlesScreen$4.3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                RowScope TopNavBar = (RowScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).f4879a.w, StringResources_androidKt.c(composer3, R.string.content_description_search), function02, null, false, null, 0L, composer3, 0, 120);
                                    final State state2 = state;
                                    if (((BundlesUiState) state2.getD()).b) {
                                        final Function1 function12 = function1;
                                        ThemeKt.b(6, composer3, ComposableLambdaKt.c(394665451, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt.BundlesScreen.4.3.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj7, Object obj8) {
                                                Composer composer4 = (Composer) obj7;
                                                if ((((Number) obj8).intValue() & 3) == 2 && composer4.c()) {
                                                    composer4.j();
                                                } else {
                                                    Integer num = ((BundlesUiState) state2.getD()).f6739a;
                                                    composer4.o(5004770);
                                                    Function1 function13 = function12;
                                                    boolean zN = composer4.n(function13);
                                                    Object objG6 = composer4.G();
                                                    if (zN || objG6 == Composer.Companion.f1624a) {
                                                        objG6 = new au.com.woolworths.feature.product.list.v2.ui.f(9, function13);
                                                        composer4.A(objG6);
                                                    }
                                                    composer4.l();
                                                    CartIconButtonKt.a(num, (Function0) objG6, null, 0L, composer4, 0, 12);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer3));
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 126);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(1733192033, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$BundlesScreen$5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, composer2, 6, 2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 0L, null, ComposableLambdaKt.c(-438921880, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$BundlesScreen$6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    PaddingValues it = (PaddingValues) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(SizeKt.c, it);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
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
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        State state = mutableStateA;
                        FullPageMessage.Error error = ((BundlesUiState) state.getD()).i;
                        Function1 function1 = eVar;
                        if (error != null) {
                            composer2.o(-1840189665);
                            BundlesErrorUiKt.a((BundlesUiState) state.getD(), function1, composer2, 0);
                            composer2.l();
                        } else {
                            LazyPagingItems lazyPagingItems2 = lazyPagingItems;
                            if (lazyPagingItems2.c().isEmpty() && ((BundlesUiState) state.getD()).c == null) {
                                composer2.o(-1839950810);
                                BundlesLoadingSkeletonUiKt.a(composer2, 0);
                                composer2.l();
                            } else {
                                composer2.o(-1839868784);
                                BundlesData bundlesData = ((BundlesUiState) state.getD()).c;
                                Map map = ((BundlesUiState) state.getD()).g;
                                BundlesProductCardConfig bundlesProductCardConfig = ((BundlesUiState) state.getD()).e;
                                composer2.o(5004770);
                                Object objG6 = composer2.G();
                                if (objG6 == Composer.Companion.f1624a) {
                                    objG6 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState3, 4);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                BundlesPageKt.b(bundlesData, map, bundlesProductCardConfig, function1, (Function1) objG6, lazyPagingItems2, composer2, 286720);
                                if ((lazyPagingItems2.d().f3529a instanceof LoadState.Loading) || ((BundlesUiState) state.getD()).d) {
                                    BundlesScreenKt.b(null, composer2, 0);
                                }
                                composer2.l();
                            }
                        }
                        composer2.f();
                        if (((Boolean) mutableState4.getD()).booleanValue()) {
                            BundlesSortBottomSheetKt.a(((BundlesUiState) state.getD()).c, sheetStateA, eVar, composer2, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12586032, 116);
            BundlesTransientError bundlesTransientError = ((BundlesUiState) mutableStateA.getD()).h;
            composerImplV.o(-643991763);
            if (bundlesTransientError == null) {
                strC = null;
            } else {
                int iOrdinal = bundlesTransientError.ordinal();
                if (iOrdinal == 0) {
                    i2 = R.string.default_connection_error_description;
                } else if (iOrdinal == 1) {
                    i2 = R.string.bundles_error_update_cart;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.string.bundles_sort_server_error;
                }
                strC = StringResources_androidKt.c(composerImplV, i2);
            }
            composerImplV.V(false);
            if (strC == null) {
                strC = "";
            }
            String str = strC;
            BundlesTransientError bundlesTransientError2 = ((BundlesUiState) mutableStateA.getD()).h;
            composerImplV.o(-1224400529);
            boolean zN = composerImplV.n(mutableStateA) | composerImplV.n(str) | composerImplV.I(bundlesViewModel) | composerImplV.n(eVar4);
            Object objG6 = composerImplV.G();
            if (zN || objG6 == obj) {
                Object bundlesScreenKt$BundlesScreen$7$1 = new BundlesScreenKt$BundlesScreen$7$1(snackbarHostState, str, bundlesViewModel, eVar4, mutableStateA, null);
                composerImplV.A(bundlesScreenKt$BundlesScreen$7$1);
                objG6 = bundlesScreenKt$BundlesScreen$7$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, bundlesTransientError2, (Function2) objG6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.loadingbutton.a(z, bundlesViewModel, onNavigateUp, onSearchClicked, onOpenBottomSheet, onProductClick, i);
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-530307936);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long jB = Color.b(Color.f, 0.5f);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(companion, jB, rectangleShapeKt$RectangleShape$1);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = BundlesScreenKt$LoadingUi$1$1.d;
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierX0 = SuspendingPointerInputFilterKt.d(modifierB, Unit.f24250a, (PointerInputEventHandler) objG).x0(SizeKt.c);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
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
            CircularProgressIndicatorKt.b(null, 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 15);
            composerImplV.V(true);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 16, modifier);
        }
    }
}
