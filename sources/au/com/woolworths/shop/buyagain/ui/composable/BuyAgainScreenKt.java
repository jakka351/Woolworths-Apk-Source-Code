package au.com.woolworths.shop.buyagain.ui.composable;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkKt;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import au.com.woolworths.shop.buyagain.domain.BuyAgainProductList;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import au.com.woolworths.shop.buyagain.ui.BuyAgainFullPageError;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$ViewState;", "viewState", "shop-buy-again_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainScreenKt {
    public static final void a(final BuyAgainContract.ViewState viewState, final SnackbarHostState snackbarHostState, final Function0 onNavigateUp, final Function0 onSearchClick, final Function0 onCartClick, final Function0 onGoToProductsClick, final Function0 networkErrorRetry, final Function0 serverErrorRetry, final Function1 addProduct, final Function2 incrementProductQuantity, final Function2 decrementProductQuantity, final Function1 onProductQuantityClick, final Function1 onProductAddToListClick, final Function1 onChipClick, final Function1 onBoostingAnimationTriggered, final Function1 onWatchlistClick, final Function1 onAisleClicked, final Function2 onSnackbarShown, final Function0 dismissFilterCoachMark, final Function1 onTileClick, Composer composer, final int i) {
        int i2;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        ComposerImpl composerImpl;
        BuyAgainContract.ViewState viewState2;
        String upperCase;
        CharSequence text;
        String string;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(snackbarHostState, "snackbarHostState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onSearchClick, "onSearchClick");
        Intrinsics.h(onCartClick, "onCartClick");
        Intrinsics.h(onGoToProductsClick, "onGoToProductsClick");
        Intrinsics.h(networkErrorRetry, "networkErrorRetry");
        Intrinsics.h(serverErrorRetry, "serverErrorRetry");
        Intrinsics.h(addProduct, "addProduct");
        Intrinsics.h(incrementProductQuantity, "incrementProductQuantity");
        Intrinsics.h(decrementProductQuantity, "decrementProductQuantity");
        Intrinsics.h(onProductQuantityClick, "onProductQuantityClick");
        Intrinsics.h(onProductAddToListClick, "onProductAddToListClick");
        Intrinsics.h(onChipClick, "onChipClick");
        Intrinsics.h(onBoostingAnimationTriggered, "onBoostingAnimationTriggered");
        Intrinsics.h(onWatchlistClick, "onWatchlistClick");
        Intrinsics.h(onAisleClicked, "onAisleClicked");
        Intrinsics.h(onSnackbarShown, "onSnackbarShown");
        Intrinsics.h(dismissFilterCoachMark, "dismissFilterCoachMark");
        Intrinsics.h(onTileClick, "onTileClick");
        ComposerImpl composerImplV = composer.v(-1236443030);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.I(viewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(snackbarHostState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onSearchClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onCartClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onGoToProductsClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(networkErrorRetry) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(serverErrorRetry) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerImplV.I(addProduct) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerImplV.I(incrementProductQuantity) ? 536870912 : 268435456;
        }
        int i3 = i2;
        int i4 = (composerImplV.I(decrementProductQuantity) ? 4 : 2) | (composerImplV.I(onProductQuantityClick) ? 32 : 16) | (composerImplV.I(onProductAddToListClick) ? 256 : 128) | (composerImplV.I(onChipClick) ? 2048 : 1024) | (composerImplV.I(onBoostingAnimationTriggered) ? 16384 : 8192) | (composerImplV.I(onWatchlistClick) ? 131072 : 65536) | (composerImplV.I(onAisleClicked) ? 1048576 : 524288) | (composerImplV.I(onSnackbarShown) ? 8388608 : 4194304) | (composerImplV.I(dismissFilterCoachMark) ? 67108864 : 33554432) | (composerImplV.I(onTileClick) ? 536870912 : 268435456);
        if ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            viewState2 = viewState;
            composerImpl = composerImplV;
        } else {
            boolean z = viewState.f10271a;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                objG = new h(20);
                composerImplV.A(objG);
            } else {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
            }
            composerImplV.V(false);
            final PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(z, (Function0) objG, composerImplV, 48);
            final CoachMarkState coachMarkStateF = CoachMarkKt.f(viewState.m, composerImplV, 0, 6);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Composer$Companion$Empty$1 composer$Companion$Empty$13 = composer$Companion$Empty$1;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(1985289824, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt$BuyAgainScreen$19$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.buy_again_page_title);
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function02 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-565543378, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt$BuyAgainScreen$19$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    String strC2 = StringResources_androidKt.c(composer3, R.string.content_description_back_button);
                                    composer3.o(5004770);
                                    Function0 function03 = function02;
                                    boolean zN = composer3.n(function03);
                                    Object objG2 = composer3.G();
                                    if (zN || objG2 == Composer.Companion.f1624a) {
                                        objG2 = new f(8, function03);
                                        composer3.A(objG2);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC2, (Function0) objG2, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final BuyAgainContract.ViewState viewState3 = viewState;
                        final Function0 function03 = onCartClick;
                        final Function0 function04 = onSearchClick;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, coreElevation, composableLambdaImplC, ComposableLambdaKt.c(1127341783, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt$BuyAgainScreen$19$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    SearchIconButtonKt.a(function04, CoreTheme.b(composer3).e.c.f4854a, composer3, 0);
                                    BuyAgainContract.ViewState viewState4 = viewState3;
                                    if (viewState4.g) {
                                        CartIconButtonKt.a(viewState4.c, function03, null, CoreTheme.b(composer3).e.c.f4854a, composer3, 0, 4);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 126);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(-1436055138, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt$BuyAgainScreen$19$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, composer2, 0, 2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 0L, null, ComposableLambdaKt.c(1824470071, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt$BuyAgainScreen$19$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScopeInstance boxScopeInstance;
                    Unit unit;
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    int i6 = iIntValue & 19;
                    Unit unit2 = Unit.f24250a;
                    if (i6 == 18 && composer2.c()) {
                        composer2.j();
                        return unit2;
                    }
                    Modifier modifierE = PaddingKt.e(SizeKt.c, it);
                    MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierE);
                    ComposeUiNode.e3.getClass();
                    Function0 function02 = ComposeUiNode.Companion.b;
                    Unit unit3 = null;
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
                    BuyAgainContract.ViewState viewState3 = viewState;
                    final BuyAgainFullPageError buyAgainFullPageError = viewState3.h;
                    composer2.o(263529061);
                    BiasAlignment biasAlignment = Alignment.Companion.b;
                    Modifier.Companion companion = Modifier.Companion.d;
                    PullRefreshState pullRefreshState = pullRefreshStateA;
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f944a;
                    if (buyAgainFullPageError == null) {
                        boxScopeInstance = boxScopeInstance2;
                        unit = null;
                    } else {
                        final Function0 function03 = onGoToProductsClick;
                        final Function0 function04 = networkErrorRetry;
                        final Function0 function05 = serverErrorRetry;
                        ThemeKt.b(6, composer2, ComposableLambdaKt.c(-1108485741, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt$BuyAgainScreen$19$3$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    BuyAgainErrorScreenKt.a(buyAgainFullPageError, function03, function04, function05, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                        boxScopeInstance = boxScopeInstance2;
                        PullRefreshIndicatorKt.a(viewState3.f10271a, pullRefreshState, boxScopeInstance2.g(companion, biasAlignment), 0L, 0L, composer2, 64, 56);
                        unit = unit2;
                    }
                    composer2.l();
                    composer2.o(263530252);
                    if (unit == null) {
                        BuyAgainProductList buyAgainProductList = viewState3.d;
                        composer2.o(263556144);
                        if (buyAgainProductList != null) {
                            BuyAgainScreenContentKt.a(buyAgainProductList, viewState3.e, addProduct, incrementProductQuantity, decrementProductQuantity, onProductQuantityClick, onProductAddToListClick, viewState3.f, onBoostingAnimationTriggered, onChipClick, viewState3.b, viewState3.i, viewState3.n, onWatchlistClick, viewState3.j, coachMarkStateF, onTileClick, viewState3.l, onAisleClicked, composer2, 0);
                            composer2 = composer2;
                            PullRefreshIndicatorKt.a(viewState3.f10271a, pullRefreshState, boxScopeInstance.g(companion, biasAlignment), 0L, 0L, composer2, 64, 56);
                            unit3 = unit2;
                        }
                        composer2.l();
                        composer2.o(263555278);
                        if (unit3 == null) {
                            ProductTileSkeletonKt.a(composer2, 0);
                        }
                        composer2.l();
                    }
                    composer2.l();
                    composer2.f();
                    return unit2;
                }
            }, composerImplV), composerImplV, 12586038, 116);
            composerImpl = composerImplV;
            viewState2 = viewState;
            CoachMarkKt.a(coachMarkStateF, dismissFilterCoachMark, BitmapDescriptorFactory.HUE_RED, 28, 12, -12, 6, -6, ComposableLambdaKt.c(-193012528, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt$BuyAgainScreen$19$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        CoachMarkKt.c(StringResources_androidKt.c(composer2, R.string.buy_again_filter_chip_coachmark_title), StringResources_androidKt.c(composer2, R.string.buy_again_filter_chip_coachmark_message), StringResources_androidKt.c(composer2, R.string.buy_again_filter_chip_coachmark_cta), dismissFilterCoachMark, null, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, 115043328 | ((i4 >> 21) & 112), 4);
            composerImpl.V(true);
            BuyAgainContract.Snackbar snackbar = viewState2.k;
            if (snackbar != null) {
                Context context = (Context) composerImpl.x(AndroidCompositionLocals_androidKt.b);
                String string2 = snackbar.f10270a.getText(context).toString();
                Text text2 = snackbar.b;
                if (text2 == null || (text = text2.getText(context)) == null || (string = text.toString()) == null) {
                    upperCase = null;
                } else {
                    upperCase = string.toUpperCase(Locale.ROOT);
                    Intrinsics.g(upperCase, "toUpperCase(...)");
                }
                String str = upperCase;
                composerImpl.o(-1224400529);
                boolean zN = ((i4 & 29360128) == 8388608) | composerImpl.n(string2) | composerImpl.I(snackbar) | ((i3 & 112) == 32) | composerImpl.n(str);
                Object objG2 = composerImpl.G();
                if (zN || objG2 == composer$Companion$Empty$13) {
                    BuyAgainScreenKt$BuyAgainScreen$20$1$1 buyAgainScreenKt$BuyAgainScreen$20$1$1 = new BuyAgainScreenKt$BuyAgainScreen$20$1$1(onSnackbarShown, string2, snackbar, snackbarHostState, str, null);
                    composerImpl.A(buyAgainScreenKt$BuyAgainScreen$20$1$1);
                    objG2 = buyAgainScreenKt$BuyAgainScreen$20$1$1;
                }
                composerImpl.V(false);
                EffectsKt.e(composerImpl, snackbar, (Function2) objG2);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final BuyAgainContract.ViewState viewState3 = viewState2;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.buyagain.ui.composable.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    BuyAgainScreenKt.a(viewState3, snackbarHostState, onNavigateUp, onSearchClick, onCartClick, onGoToProductsClick, networkErrorRetry, serverErrorRetry, addProduct, incrementProductQuantity, decrementProductQuantity, onProductQuantityClick, onProductAddToListClick, onChipClick, onBoostingAnimationTriggered, onWatchlistClick, onAisleClicked, onSnackbarShown, dismissFilterCoachMark, onTileClick, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(BuyAgainViewModel viewModel, Function0 onNavigateUp, Composer composer, int i) {
        ComposerImpl composerImpl;
        Function0 function0;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-1615744810);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function0 = onNavigateUp;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            BuyAgainContract.ViewState viewState = (BuyAgainContract.ViewState) FlowExtKt.a(viewModel.n, composerImplV).getD();
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(viewModel);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$1$1 buyAgainScreenKt$BuyAgainScreen$1$1 = new BuyAgainScreenKt$BuyAgainScreen$1$1(0, viewModel, BuyAgainViewModel.class, "onSearchClick", "onSearchClick$shop_buy_again_release()V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$1$1);
                objG2 = buyAgainScreenKt$BuyAgainScreen$1$1;
            }
            KFunction kFunction = (KFunction) objG2;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(viewModel);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$2$1 buyAgainScreenKt$BuyAgainScreen$2$1 = new BuyAgainScreenKt$BuyAgainScreen$2$1(0, viewModel, BuyAgainViewModel.class, "onCartClick", "onCartClick$shop_buy_again_release()V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$2$1);
                objG3 = buyAgainScreenKt$BuyAgainScreen$2$1;
            }
            KFunction kFunction2 = (KFunction) objG3;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(viewModel);
            Object objG4 = composerImplV.G();
            if (zI3 || objG4 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$3$1 buyAgainScreenKt$BuyAgainScreen$3$1 = new BuyAgainScreenKt$BuyAgainScreen$3$1(0, viewModel, BuyAgainViewModel.class, "goToProducts", "goToProducts$shop_buy_again_release()V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$3$1);
                objG4 = buyAgainScreenKt$BuyAgainScreen$3$1;
            }
            KFunction kFunction3 = (KFunction) objG4;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI4 = composerImplV.I(viewModel);
            Object objG5 = composerImplV.G();
            if (zI4 || objG5 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$4$1 buyAgainScreenKt$BuyAgainScreen$4$1 = new BuyAgainScreenKt$BuyAgainScreen$4$1(0, viewModel, BuyAgainViewModel.class, "networkErrorRetry", "networkErrorRetry$shop_buy_again_release()V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$4$1);
                objG5 = buyAgainScreenKt$BuyAgainScreen$4$1;
            }
            KFunction kFunction4 = (KFunction) objG5;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI5 = composerImplV.I(viewModel);
            Object objG6 = composerImplV.G();
            if (zI5 || objG6 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$5$1 buyAgainScreenKt$BuyAgainScreen$5$1 = new BuyAgainScreenKt$BuyAgainScreen$5$1(0, viewModel, BuyAgainViewModel.class, "serverErrorRetry", "serverErrorRetry$shop_buy_again_release()V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$5$1);
                objG6 = buyAgainScreenKt$BuyAgainScreen$5$1;
            }
            KFunction kFunction5 = (KFunction) objG6;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI6 = composerImplV.I(viewModel);
            Object objG7 = composerImplV.G();
            if (zI6 || objG7 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$6$1 buyAgainScreenKt$BuyAgainScreen$6$1 = new BuyAgainScreenKt$BuyAgainScreen$6$1(1, viewModel, BuyAgainViewModel.class, "addProductToCart", "addProductToCart$shop_buy_again_release(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$6$1);
                objG7 = buyAgainScreenKt$BuyAgainScreen$6$1;
            }
            KFunction kFunction6 = (KFunction) objG7;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI7 = composerImplV.I(viewModel);
            Object objG8 = composerImplV.G();
            if (zI7 || objG8 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$7$1 buyAgainScreenKt$BuyAgainScreen$7$1 = new BuyAgainScreenKt$BuyAgainScreen$7$1(2, viewModel, BuyAgainViewModel.class, "incrementProductQuantity", "incrementProductQuantity$shop_buy_again_release(Lau/com/woolworths/product/models/ProductCard;D)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$7$1);
                objG8 = buyAgainScreenKt$BuyAgainScreen$7$1;
            }
            KFunction kFunction7 = (KFunction) objG8;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI8 = composerImplV.I(viewModel);
            Object objG9 = composerImplV.G();
            if (zI8 || objG9 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$8$1 buyAgainScreenKt$BuyAgainScreen$8$1 = new BuyAgainScreenKt$BuyAgainScreen$8$1(2, viewModel, BuyAgainViewModel.class, "decrementProductQuantity", "decrementProductQuantity$shop_buy_again_release(Lau/com/woolworths/product/models/ProductCard;D)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$8$1);
                objG9 = buyAgainScreenKt$BuyAgainScreen$8$1;
            }
            KFunction kFunction8 = (KFunction) objG9;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI9 = composerImplV.I(viewModel);
            Object objG10 = composerImplV.G();
            if (zI9 || objG10 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$9$1 buyAgainScreenKt$BuyAgainScreen$9$1 = new BuyAgainScreenKt$BuyAgainScreen$9$1(1, viewModel, BuyAgainViewModel.class, "onProductQuantityClick", "onProductQuantityClick$shop_buy_again_release(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$9$1);
                objG10 = buyAgainScreenKt$BuyAgainScreen$9$1;
            }
            KFunction kFunction9 = (KFunction) objG10;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI10 = composerImplV.I(viewModel);
            Object objG11 = composerImplV.G();
            if (zI10 || objG11 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$10$1 buyAgainScreenKt$BuyAgainScreen$10$1 = new BuyAgainScreenKt$BuyAgainScreen$10$1(1, viewModel, BuyAgainViewModel.class, "onProductAddToListClick", "onProductAddToListClick$shop_buy_again_release(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$10$1);
                objG11 = buyAgainScreenKt$BuyAgainScreen$10$1;
            }
            KFunction kFunction10 = (KFunction) objG11;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI11 = composerImplV.I(viewModel);
            Object objG12 = composerImplV.G();
            if (zI11 || objG12 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$11$1 buyAgainScreenKt$BuyAgainScreen$11$1 = new BuyAgainScreenKt$BuyAgainScreen$11$1(1, viewModel, BuyAgainViewModel.class, "onBoostingAnimationTriggered", "onBoostingAnimationTriggered(Ljava/lang/String;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$11$1);
                objG12 = buyAgainScreenKt$BuyAgainScreen$11$1;
            }
            KFunction kFunction11 = (KFunction) objG12;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI12 = composerImplV.I(viewModel);
            Object objG13 = composerImplV.G();
            if (zI12 || objG13 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$12$1 buyAgainScreenKt$BuyAgainScreen$12$1 = new BuyAgainScreenKt$BuyAgainScreen$12$1(1, viewModel, BuyAgainViewModel.class, "onChipClick", "onChipClick(Lau/com/woolworths/shop/buyagain/domain/BuyAgainChip;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$12$1);
                objG13 = buyAgainScreenKt$BuyAgainScreen$12$1;
            }
            KFunction kFunction12 = (KFunction) objG13;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI13 = composerImplV.I(viewModel);
            Object objG14 = composerImplV.G();
            if (zI13 || objG14 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$13$1 buyAgainScreenKt$BuyAgainScreen$13$1 = new BuyAgainScreenKt$BuyAgainScreen$13$1(1, viewModel, BuyAgainViewModel.class, "onWatchlistClick", "onWatchlistClick$shop_buy_again_release(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$13$1);
                objG14 = buyAgainScreenKt$BuyAgainScreen$13$1;
            }
            KFunction kFunction13 = (KFunction) objG14;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI14 = composerImplV.I(viewModel);
            Object objG15 = composerImplV.G();
            if (zI14 || objG15 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$14$1 buyAgainScreenKt$BuyAgainScreen$14$1 = new BuyAgainScreenKt$BuyAgainScreen$14$1(1, viewModel, BuyAgainViewModel.class, "onAisleClicked", "onAisleClicked(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$14$1);
                objG15 = buyAgainScreenKt$BuyAgainScreen$14$1;
            }
            KFunction kFunction14 = (KFunction) objG15;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI15 = composerImplV.I(viewModel);
            Object objG16 = composerImplV.G();
            if (zI15 || objG16 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$15$1 buyAgainScreenKt$BuyAgainScreen$15$1 = new BuyAgainScreenKt$BuyAgainScreen$15$1(2, viewModel, BuyAgainViewModel.class, "onSnackbarShown", "onSnackbarShown$shop_buy_again_release(Ljava/lang/String;Lau/com/woolworths/analytics/model/TrackingMetadata;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$15$1);
                objG16 = buyAgainScreenKt$BuyAgainScreen$15$1;
            }
            KFunction kFunction15 = (KFunction) objG16;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI16 = composerImplV.I(viewModel);
            Object objG17 = composerImplV.G();
            if (zI16 || objG17 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$16$1 buyAgainScreenKt$BuyAgainScreen$16$1 = new BuyAgainScreenKt$BuyAgainScreen$16$1(0, viewModel, BuyAgainViewModel.class, "dismissFilterCoachMark", "dismissFilterCoachMark()V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$16$1);
                objG17 = buyAgainScreenKt$BuyAgainScreen$16$1;
            }
            KFunction kFunction16 = (KFunction) objG17;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI17 = composerImplV.I(viewModel);
            Object objG18 = composerImplV.G();
            if (zI17 || objG18 == composer$Companion$Empty$1) {
                BuyAgainScreenKt$BuyAgainScreen$17$1 buyAgainScreenKt$BuyAgainScreen$17$1 = new BuyAgainScreenKt$BuyAgainScreen$17$1(1, viewModel, BuyAgainViewModel.class, "onTileClick", "onTileClick(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                composerImplV.A(buyAgainScreenKt$BuyAgainScreen$17$1);
                objG18 = buyAgainScreenKt$BuyAgainScreen$17$1;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            function0 = onNavigateUp;
            a(viewState, snackbarHostState, function0, (Function0) kFunction, (Function0) kFunction2, (Function0) kFunction3, (Function0) kFunction4, (Function0) kFunction5, (Function1) kFunction6, (Function2) kFunction7, (Function2) kFunction8, (Function1) kFunction9, (Function1) kFunction10, (Function1) kFunction12, (Function1) kFunction11, (Function1) kFunction13, (Function1) kFunction14, (Function2) kFunction15, (Function0) kFunction16, (Function1) ((KFunction) objG18), composerImpl, ((i2 << 3) & 896) | 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(viewModel, i, 16, function0);
        }
    }
}
