package au.com.woolworths.shop.cart.ui.cart;

import android.content.Context;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferScreenKt;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartNavHostKt {
    public static final void a(final NavHostController navController, final boolean z, final CartViewModel viewModel, final Function0 onNavigateUp, Composer composer, int i) {
        Intrinsics.h(navController, "navController");
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-1324186074);
        int i2 = i | (composerImplV.I(navController) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(viewModel) ? 256 : 128) | (composerImplV.I(onNavigateUp) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CartRoute cartRoute = CartRoute.INSTANCE;
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(viewModel) | ((i2 & 7168) == 2048) | composerImplV.I(navController);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.shop.cart.ui.cart.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        NavGraphBuilder NavHost = (NavGraphBuilder) obj;
                        Intrinsics.h(NavHost, "$this$NavHost");
                        final boolean z2 = z;
                        final CartViewModel cartViewModel = viewModel;
                        final Function0 function0 = onNavigateUp;
                        final NavHostController navHostController = navController;
                        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartNavHostKt$CartNavHost$1$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                AnimatedContentScope composable = (AnimatedContentScope) obj2;
                                NavBackStackEntry it = (NavBackStackEntry) obj3;
                                Composer composer2 = (Composer) obj4;
                                ((Number) obj5).intValue();
                                Intrinsics.h(composable, "$this$composable");
                                Intrinsics.h(it, "it");
                                composer2.o(-1633490746);
                                CartViewModel cartViewModel2 = cartViewModel;
                                boolean zI2 = composer2.I(cartViewModel2);
                                NavHostController navHostController2 = navHostController;
                                boolean zI3 = zI2 | composer2.I(navHostController2);
                                Object objG2 = composer2.G();
                                if (zI3 || objG2 == Composer.Companion.f1624a) {
                                    objG2 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(29, cartViewModel2, navHostController2);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                CartScreenKt.a(z2, cartViewModel, function0, (Function1) objG2, composer2, 0);
                                return Unit.f24250a;
                            }
                        }, true, -1865559483);
                        Map map = EmptyMap.d;
                        ReflectionFactory reflectionFactory = Reflection.f24268a;
                        NavGraphBuilderKt.a(NavHost, reflectionFactory.b(CartRoute.class), map, null, null, null, null, composableLambdaImpl);
                        au.com.woolworths.shop.aem.components.ui.merchcard.a aVar = new au.com.woolworths.shop.aem.components.ui.merchcard.a(23);
                        au.com.woolworths.shop.aem.components.ui.merchcard.a aVar2 = new au.com.woolworths.shop.aem.components.ui.merchcard.a(24);
                        au.com.woolworths.shop.aem.components.ui.merchcard.a aVar3 = new au.com.woolworths.shop.aem.components.ui.merchcard.a(25);
                        au.com.woolworths.shop.aem.components.ui.merchcard.a aVar4 = new au.com.woolworths.shop.aem.components.ui.merchcard.a(26);
                        ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartNavHostKt$CartNavHost$1$1$6
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                AnimatedContentScope composable = (AnimatedContentScope) obj2;
                                Object it = (NavBackStackEntry) obj3;
                                Composer composer2 = (Composer) obj4;
                                ((Number) obj5).intValue();
                                Intrinsics.h(composable, "$this$composable");
                                Intrinsics.h(it, "it");
                                Context context = (Context) composer2.x(AndroidCompositionLocals_androidKt.b);
                                composer2.o(1849434622);
                                Object objG2 = composer2.G();
                                Object obj6 = Composer.Companion.f1624a;
                                if (objG2 == obj6) {
                                    objG2 = new SnackbarHostState();
                                    composer2.A(objG2);
                                }
                                final SnackbarHostState snackbarHostState = (SnackbarHostState) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(it);
                                Object objG3 = composer2.G();
                                if (zI2 || objG3 == obj6) {
                                    objG3 = new j(it, 0);
                                    composer2.A(objG3);
                                }
                                Function1 function1 = (Function1) objG3;
                                composer2.l();
                                composer2.F(-83599083);
                                ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composer2);
                                if (viewModelStoreOwnerA == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                HiltViewModelFactory hiltViewModelFactoryA = HiltViewModelKt.a(viewModelStoreOwnerA, composer2);
                                MutableCreationExtras mutableCreationExtrasA = viewModelStoreOwnerA instanceof HasDefaultViewModelProviderFactory ? HiltViewModelExtensions.a(((HasDefaultViewModelProviderFactory) viewModelStoreOwnerA).getDefaultViewModelCreationExtras(), function1) : HiltViewModelExtensions.a(CreationExtras.Empty.b, function1);
                                composer2.F(1729797275);
                                ViewModel viewModelB = ViewModelKt.b(QuickAddOfferViewModel.class, viewModelStoreOwnerA, hiltViewModelFactoryA, mutableCreationExtrasA, composer2);
                                composer2.N();
                                composer2.N();
                                final QuickAddOfferViewModel quickAddOfferViewModel = (QuickAddOfferViewModel) viewModelB;
                                SharedFlow sharedFlow = quickAddOfferViewModel.l;
                                composer2.o(-1224400529);
                                boolean zI3 = composer2.I(quickAddOfferViewModel);
                                final Function0 function02 = function0;
                                boolean zN = zI3 | composer2.n(function02) | composer2.I(cartViewModel) | composer2.I(context);
                                Object objG4 = composer2.G();
                                if (zN || objG4 == obj6) {
                                    objG4 = new CartNavHostKt$CartNavHost$1$1$6$1$1(quickAddOfferViewModel, function0, cartViewModel, snackbarHostState, context, null);
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                EffectsKt.e(composer2, sharedFlow, (Function2) objG4);
                                final NavHostController navHostController2 = navHostController;
                                CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-583414198, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartNavHostKt$CartNavHost$1$1$6.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj7, Object obj8) {
                                        Composer composer3 = (Composer) obj7;
                                        if ((((Number) obj8).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            composer3.o(-1633490746);
                                            NavHostController navHostController3 = navHostController2;
                                            boolean zI4 = composer3.I(navHostController3);
                                            Function0 function03 = function02;
                                            boolean zN2 = zI4 | composer3.n(function03);
                                            Object objG5 = composer3.G();
                                            if (zN2 || objG5 == Composer.Companion.f1624a) {
                                                objG5 = new au.com.woolworths.sdui.common.alert.a(18, navHostController3, function03);
                                                composer3.A(objG5);
                                            }
                                            composer3.l();
                                            QuickAddOfferScreenKt.a(quickAddOfferViewModel, snackbarHostState, (Function0) objG5, composer3, 48);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2));
                                return Unit.f24250a;
                            }
                        }, true, 447688686);
                        NavGraphBuilderKt.a(NavHost, reflectionFactory.b(QuickAddOfferRoute.class), EmptyMap.d, aVar, aVar2, aVar3, aVar4, composableLambdaImpl2);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            NavHostKt.b(navController, cartRoute, null, null, null, null, null, null, null, (Function1) objG, composerImplV, (i2 & 14) | 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(navController, z, viewModel, onNavigateUp, i);
        }
    }
}
