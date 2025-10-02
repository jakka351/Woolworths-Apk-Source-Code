package au.com.woolworths.shop.checkout.ui.substitution.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.filter.i;
import au.com.woolworths.shop.checkout.ui.common.component.LoadingScreenKt;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubstitutionScreenKt {
    public static final void a(final SubstitutionContract.ViewState viewState, Flow actionFlow, final Function1 onOptionSelected, final Function0 onRetry, final Function2 onProductSubstituteCheckedChange, Function0 onBackPressed, final Function0 onSaveClicked, final Function1 onCheaperSubstituteBannerDismiss, final Function0 onNoSuggestionRetry, Composer composer, int i) {
        boolean z;
        Flow flow;
        final Function0 function0;
        ComposerImpl composerImpl;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(actionFlow, "actionFlow");
        Intrinsics.h(onOptionSelected, "onOptionSelected");
        Intrinsics.h(onRetry, "onRetry");
        Intrinsics.h(onProductSubstituteCheckedChange, "onProductSubstituteCheckedChange");
        Intrinsics.h(onBackPressed, "onBackPressed");
        Intrinsics.h(onSaveClicked, "onSaveClicked");
        Intrinsics.h(onCheaperSubstituteBannerDismiss, "onCheaperSubstituteBannerDismiss");
        Intrinsics.h(onNoSuggestionRetry, "onNoSuggestionRetry");
        ComposerImpl composerImplV = composer.v(-857707427);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i | (composerImplV.I(actionFlow) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onOptionSelected) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onRetry) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onProductSubstituteCheckedChange) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onBackPressed) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onSaveClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onCheaperSubstituteBannerDismiss) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(onNoSuggestionRetry) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            flow = actionFlow;
            function0 = onBackPressed;
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
            String strC = StringResources_androidKt.c(composerImplV, R.string.substitution_no_product_selected);
            String strC2 = StringResources_androidKt.c(composerImplV, R.string.saving_error_message);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(actionFlow) | composerImplV.n(strC) | ((i2 & 458752) == 131072) | composerImplV.n(strC2);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                z = false;
                SubstitutionScreenKt$SubstitutionScreen$1$1 substitutionScreenKt$SubstitutionScreen$1$1 = new SubstitutionScreenKt$SubstitutionScreen$1$1(actionFlow, snackbarHostState, strC, onBackPressed, strC2, null);
                flow = actionFlow;
                function0 = onBackPressed;
                composerImplV.A(substitutionScreenKt$SubstitutionScreen$1$1);
                objG2 = substitutionScreenKt$SubstitutionScreen$1$1;
            } else {
                flow = actionFlow;
                function0 = onBackPressed;
                z = false;
            }
            composerImplV.V(z);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-17588959, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt$SubstitutionScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC3 = StringResources_androidKt.c(composer2, R.string.substitution_preference);
                        final Function0 function02 = function0;
                        TopNavBarKt.a(strC3, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-739026797, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt$SubstitutionScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), "back button", function02, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(1248481826, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt$SubstitutionScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SubstitutionContract.ViewState viewState2 = viewState;
                        if (viewState2 instanceof SubstitutionContract.ViewState.Content) {
                            SaveButtonKt.b(onSaveClicked, ((SubstitutionContract.ViewState.Content) viewState2).c, composer2, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1780414685, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt$SubstitutionScreen$4
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
            }, composerImplV), 0L, null, ComposableLambdaKt.c(458440426, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt$SubstitutionScreen$5
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
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, it);
                        long j = CoreTheme.b(composer2).e.f4848a.d;
                        final Function0 function02 = onNoSuggestionRetry;
                        final Function0 function03 = onRetry;
                        final SubstitutionContract.ViewState viewState2 = viewState;
                        final Function1 function1 = onOptionSelected;
                        final Function2 function2 = onProductSubstituteCheckedChange;
                        final Function1 function12 = onCheaperSubstituteBannerDismiss;
                        SurfaceKt.b(modifierE, null, j, 0L, null, null, ComposableLambdaKt.c(-2107301074, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt$SubstitutionScreen$5.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    SubstitutionContract.ViewState viewState3 = viewState2;
                                    if (viewState3 instanceof SubstitutionContract.ViewState.Content) {
                                        composer3.o(930785017);
                                        SubstitutionContract.ViewState.Content content = (SubstitutionContract.ViewState.Content) viewState3;
                                        SubstitutionContentKt.a(content.f10815a, content.b, function1, content.d, function2, content.e, function12, function02, composer3, 0);
                                        composer3.l();
                                    } else if (viewState3 instanceof SubstitutionContract.ViewState.Error) {
                                        composer3.o(931522786);
                                        SubstitutionErrorScreenKt.a(((SubstitutionContract.ViewState.Error) viewState3).f10816a, function03, composer3, 0);
                                        composer3.l();
                                    } else {
                                        if (!Intrinsics.c(viewState3, SubstitutionContract.ViewState.Loading.f10817a)) {
                                            throw au.com.woolworths.android.onesite.a.x(composer3, 2108233153);
                                        }
                                        composer3.o(2108266557);
                                        LoadingScreenKt.a(0L, composer3, 0);
                                        composer3.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 58);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 12586422, 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(viewState, flow, onOptionSelected, onRetry, onProductSubstituteCheckedChange, function0, onSaveClicked, onCheaperSubstituteBannerDismiss, onNoSuggestionRetry, i);
        }
    }
}
