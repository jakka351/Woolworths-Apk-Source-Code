package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesScreenKt {
    public static final void a(final YourGroceriesContract.ViewState viewState, final Flow actionFlow, final Function0 onBackPressed, final Function0 onHelpPressed, final Function1 onFilterSelect, final Function1 onFulfilmentStatusClick, final Function1 onProductItemClick, final Function1 onProductSubstitutionItemClick, final Function0 onRetry, final Function0 onTotalPriceClick, final Function2 onRatingSelected, final Function0 onUnhappySubstitutedBannerDisplayed, Composer composer, final int i, final int i2) {
        int i3;
        ComposerImpl composerImpl;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(actionFlow, "actionFlow");
        Intrinsics.h(onBackPressed, "onBackPressed");
        Intrinsics.h(onHelpPressed, "onHelpPressed");
        Intrinsics.h(onFilterSelect, "onFilterSelect");
        Intrinsics.h(onFulfilmentStatusClick, "onFulfilmentStatusClick");
        Intrinsics.h(onProductItemClick, "onProductItemClick");
        Intrinsics.h(onProductSubstitutionItemClick, "onProductSubstitutionItemClick");
        Intrinsics.h(onRetry, "onRetry");
        Intrinsics.h(onTotalPriceClick, "onTotalPriceClick");
        Intrinsics.h(onRatingSelected, "onRatingSelected");
        Intrinsics.h(onUnhappySubstitutedBannerDisplayed, "onUnhappySubstitutedBannerDisplayed");
        ComposerImpl composerImplV = composer.v(1436020014);
        int i4 = (composerImplV.I(viewState) ? 4 : 2) | i | (composerImplV.I(actionFlow) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onBackPressed) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.I(onHelpPressed) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.I(onFilterSelect) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.I(onFulfilmentStatusClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= composerImplV.I(onProductItemClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= composerImplV.I(onProductSubstitutionItemClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= composerImplV.I(onRetry) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= composerImplV.I(onTotalPriceClick) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerImplV.I(onRatingSelected) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(onUnhappySubstitutedBannerDisplayed) ? 32 : 16;
        }
        if ((i4 & 306783379) == 306783378 && (i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            String strC = StringResources_androidKt.c(composerImplV, R.string.your_groceries_rating_message);
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(actionFlow) | composerImplV.n(strC);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new YourGroceriesScreenKt$YourGroceriesScreen$1$1(actionFlow, snackbarHostState, strC, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, actionFlow, (Function2) objG2);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(614640618, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesScreenKt$YourGroceriesScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC2 = StringResources_androidKt.c(composer2, R.string.my_items_title);
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function0 = onBackPressed;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-834820552, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesScreenKt$YourGroceriesScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, "back button", function0, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final YourGroceriesContract.ViewState viewState2 = viewState;
                        final Function0 function02 = onHelpPressed;
                        TopNavBarKt.a(strC2, null, 0L, 0L, 0L, null, coreElevation, composableLambdaImplC, ComposableLambdaKt.c(315663777, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesScreenKt$YourGroceriesScreen$2.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else if (viewState2.d != null) {
                                    ButtonKt.c(function02, null, false, null, null, null, null, null, ComposableSingletons$YourGroceriesScreenKt.f7804a, composer3, 805306368, 510);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 126);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1800800055, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesScreenKt$YourGroceriesScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        YourGroceriesContract.ViewState viewState2 = viewState;
                        YourGroceriesContract.ErrorState errorState = viewState2.e;
                        YourGroceriesContract.PaymentSummaryInfo paymentSummaryInfo = viewState2.c;
                        if (errorState == null && ((viewState2.f7817a || paymentSummaryInfo != null) && paymentSummaryInfo != null)) {
                            YourGroceriesTotalPriceKt.a(0, 0, composer2, WindowInsetsPadding_androidKt.a(Modifier.Companion.d), paymentSummaryInfo.f7816a, paymentSummaryInfo.b, onTotalPriceClick);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(78726568, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesScreenKt$YourGroceriesScreen$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, composer2, 6, 2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 0L, null, ComposableLambdaKt.c(1783235329, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesScreenKt$YourGroceriesScreen$5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierB = BackgroundKt.b(PaddingKt.e(Modifier.Companion.d, it), CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a);
                        final Function2 function2 = onRatingSelected;
                        final Function0 function0 = onUnhappySubstitutedBannerDisplayed;
                        final YourGroceriesContract.ViewState viewState2 = viewState;
                        final Function0 function02 = onRetry;
                        final Function1 function1 = onFilterSelect;
                        final Function1 function12 = onFulfilmentStatusClick;
                        final Function1 function13 = onProductItemClick;
                        final Function1 function14 = onProductSubstitutionItemClick;
                        SurfaceKt.b(modifierB, null, 0L, 0L, null, null, ComposableLambdaKt.c(-1256808899, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesScreenKt$YourGroceriesScreen$5.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    YourGroceriesContract.ViewState viewState3 = viewState2;
                                    boolean z = viewState3.f7817a;
                                    YourGroceriesContract.ErrorState errorState = viewState3.e;
                                    if (z) {
                                        composer3.o(1931016969);
                                        YourGroceriesLoadingViewKt.a(composer3, 0);
                                        composer3.l();
                                    } else if (errorState != null) {
                                        composer3.o(1931119548);
                                        YourGroceriesErrorScreenKt.a(errorState, function02, composer3, 0);
                                        composer3.l();
                                    } else {
                                        composer3.o(1931306230);
                                        YourGroceriesListKt.a(viewState3.b, function1, function12, function13, function14, function2, viewState3.f, function0, composer3, 0);
                                        composer3.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 62);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 12586422, 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    YourGroceriesScreenKt.a(viewState, actionFlow, onBackPressed, onHelpPressed, onFilterSelect, onFulfilmentStatusClick, onProductItemClick, onProductSubstitutionItemClick, onRetry, onTotalPriceClick, onRatingSelected, onUnhappySubstitutedBannerDisplayed, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
