package au.com.woolworths.shop.checkout.ui.timeselector;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentBottomSheet;
import au.com.woolworths.shop.checkout.ui.common.component.WappleLoadingScreenKt;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.InfoModalKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSelectorFooterKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$ViewState;", "viewState", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TimeSelectorScreenKt {
    public static final void a(final TimeSelectorViewModel viewModel, final Function0 onNavigateUp, Composer composer, int i) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-1132975015);
        if ((((composerImplV.I(viewModel) ? 4 : 2) | i | (composerImplV.I(onNavigateUp) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.j, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Flow flow = viewModel.l;
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(viewModel) | composerImplV.I(context);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new TimeSelectorScreenKt$TimeSelectorScreen$1$1(viewModel, context, snackbarHostState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            ScaffoldKt.a(null, ComposableLambdaKt.c(1306981397, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FulfilmentWindows fulfilmentWindows = ((TimeSelectorContract.ViewState) mutableStateA.getD()).f;
                        String str = fulfilmentWindows != null ? fulfilmentWindows.b : null;
                        final Function0 function0 = onNavigateUp;
                        TopNavBarKt.a(str, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(1121720035, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(1001346868, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = WindowInsetsPadding_androidKt.a(Modifier.Companion.d);
                        FooterData footerData = ((TimeSelectorContract.ViewState) mutableStateA.getD()).b;
                        composer2.o(5004770);
                        TimeSelectorViewModel timeSelectorViewModel = viewModel;
                        boolean zI2 = composer2.I(timeSelectorViewModel);
                        Object objG3 = composer2.G();
                        if (zI2 || objG3 == Composer.Companion.f1624a) {
                            objG3 = new a(timeSelectorViewModel, 0);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        TimeSelectorFooterKt.a(footerData, (Function0) objG3, modifierA, composer2, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(695712339, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$4
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
            }, composerImplV), 0L, null, ComposableLambdaKt.c(1331807084, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$5

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[TimeSelectorContract.LoadingState.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            TimeSelectorContract.LoadingState loadingState = TimeSelectorContract.LoadingState.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            TimeSelectorContract.LoadingState loadingState2 = TimeSelectorContract.LoadingState.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    Object obj5;
                    Object obj6;
                    PaddingValues padding = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(padding, "padding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(padding) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = PaddingKt.e(companion, padding);
                        BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                        MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, measurePolicyD, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        State state = mutableStateA;
                        TimeSelectorContract.LoadingState loadingState = ((TimeSelectorContract.ViewState) state.getD()).e;
                        TimeSelectorContract.LoadingState loadingState2 = TimeSelectorContract.LoadingState.f;
                        Object obj7 = Composer.Companion.f1624a;
                        Object obj8 = viewModel;
                        if (loadingState != loadingState2) {
                            composer2.o(1388280723);
                            int iOrdinal = ((TimeSelectorContract.ViewState) state.getD()).e.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    composer2.o(1388747459);
                                    WappleLoadingScreenKt.a(null, composer2, 0);
                                    composer2.l();
                                } else {
                                    if (iOrdinal != 2) {
                                        throw au.com.woolworths.android.onesite.a.x(composer2, 2122993895);
                                    }
                                    composer2.o(1389035790);
                                    composer2.l();
                                }
                                obj6 = obj8;
                            } else {
                                composer2.o(1388387332);
                                FillElement fillElement = SizeKt.c;
                                MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                                int p2 = composer2.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                                Modifier modifierD2 = ComposedModifierKt.d(composer2, fillElement);
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
                                Updater.b(composer2, measurePolicyD2, function2);
                                Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                    b.z(p2, composer2, p2, function23);
                                }
                                Updater.b(composer2, modifierD2, function24);
                                obj6 = obj8;
                                CircularProgressIndicatorKt.b(BoxScopeInstance.f944a.g(companion, Alignment.Companion.e), 0L, BitmapDescriptorFactory.HUE_RED, 0, composer2, 0, 14);
                                composer2.f();
                                composer2.l();
                            }
                            composer2.l();
                            obj4 = obj6;
                        } else if (((TimeSelectorContract.ViewState) state.getD()).d != null) {
                            composer2.o(1389137563);
                            TimeSelectorContract.TimeSelectorErrorState timeSelectorErrorState = ((TimeSelectorContract.ViewState) state.getD()).d;
                            if (timeSelectorErrorState == null) {
                                obj5 = obj8;
                            } else {
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(obj8);
                                Object objG3 = composer2.G();
                                if (zI2 || objG3 == obj7) {
                                    objG3 = new TimeSelectorScreenKt$TimeSelectorScreen$5$1$2$1$1(0, obj8, TimeSelectorViewModel.class, "loadScreen", "loadScreen()V", 0);
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG3);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(obj8);
                                Object objG4 = composer2.G();
                                if (zI3 || objG4 == obj7) {
                                    objG4 = new TimeSelectorScreenKt$TimeSelectorScreen$5$1$2$2$1(0, obj8, TimeSelectorViewModel.class, "loadScreen", "loadScreen()V", 0);
                                    obj5 = obj8;
                                    composer2.A(objG4);
                                } else {
                                    obj5 = obj8;
                                }
                                composer2.l();
                                TimeSelectorErrorScreenKt.a(timeSelectorErrorState, function02, (Function0) ((KFunction) objG4), composer2, 0);
                            }
                            composer2.l();
                            obj4 = obj5;
                        } else {
                            composer2.o(2123035176);
                            composer2.o(-1633490746);
                            boolean zN = composer2.n(state) | composer2.I(obj8);
                            Object objG5 = composer2.G();
                            if (zN || objG5 == obj7) {
                                objG5 = new l(14, state, obj8);
                                composer2.A(objG5);
                            }
                            composer2.l();
                            obj4 = obj8;
                            LazyDslKt.b(null, null, null, false, null, null, null, false, null, (Function1) objG5, composer2, 0, 511);
                            composer2.l();
                        }
                        FulfilmentBottomSheet fulfilmentBottomSheet = ((TimeSelectorContract.ViewState) state.getD()).g;
                        composer2.o(2123127011);
                        if (fulfilmentBottomSheet != null) {
                            String str = fulfilmentBottomSheet.f10670a;
                            String str2 = fulfilmentBottomSheet.b;
                            composer2.o(5004770);
                            boolean zI4 = composer2.I(obj4);
                            Object objG6 = composer2.G();
                            if (zI4 || objG6 == obj7) {
                                objG6 = new TimeSelectorScreenKt$TimeSelectorScreen$5$1$4$1$1(0, obj4, TimeSelectorViewModel.class, "onTooltipDismiss", "onTooltipDismiss()V", 0);
                                composer2.A(objG6);
                            }
                            composer2.l();
                            InfoModalKt.a(str, str2, (Function0) ((KFunction) objG6), null, composer2, 0);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12586416, 113);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(viewModel, i, 21, onNavigateUp);
        }
    }
}
