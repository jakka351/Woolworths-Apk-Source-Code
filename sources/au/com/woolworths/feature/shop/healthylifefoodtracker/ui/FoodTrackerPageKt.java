package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
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
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopBarLiftOnScrollElevationKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerContract;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerConsent;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerContentFeed;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"healthy-life-food-tracker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FoodTrackerPageKt {
    public static final void a(final State viewState, FoodTrackerEventListener foodTrackerEventListener, final Function0 onNavigateUp, Composer composer, int i) {
        Object foodTrackerPageKt$FoodTrackerPage$3$1;
        int i2;
        int i3;
        final SnackbarHostState snackbarHostState;
        final FoodTrackerEventListener eventListener = foodTrackerEventListener;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(eventListener, "eventListener");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-915161463);
        int i4 = i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.n(eventListener) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128);
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            final LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composerImplV, 3078, 6);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = new SnackbarHostState();
                composerImplV.A(objG2);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objG2;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(lazyListStateA);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = SnapshotStateKt.d(new c(1, lazyListStateA, viewState));
                composerImplV.A(objG3);
            }
            final State state = (State) objG3;
            composerImplV.V(false);
            Boolean boolValueOf = Boolean.valueOf(((FoodTrackerContract.ViewState) viewState.getD()).g);
            composerImplV.o(-1633490746);
            int i5 = i4 & 14;
            boolean zI = (i5 == 4) | composerImplV.I(modalBottomSheetStateC);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == obj) {
                objG4 = new FoodTrackerPageKt$FoodTrackerPage$1$1(viewState, modalBottomSheetStateC, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG4);
            Boolean boolValueOf2 = Boolean.valueOf(modalBottomSheetStateC.d());
            composerImplV.o(-1633490746);
            int i6 = i4 & 112;
            boolean zI2 = (i6 == 32) | composerImplV.I(modalBottomSheetStateC);
            Object objG5 = composerImplV.G();
            if (zI2 || objG5 == obj) {
                objG5 = new FoodTrackerPageKt$FoodTrackerPage$2$1(eventListener, modalBottomSheetStateC, null);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf2, (Function2) objG5);
            Text text = ((FoodTrackerContract.ViewState) viewState.getD()).f;
            composerImplV.o(-1224400529);
            boolean zI3 = (i5 == 4) | composerImplV.I(context) | (i6 == 32);
            Object objG6 = composerImplV.G();
            if (zI3 || objG6 == obj) {
                i2 = i5;
                i3 = -1633490746;
                foodTrackerPageKt$FoodTrackerPage$3$1 = new FoodTrackerPageKt$FoodTrackerPage$3$1(viewState, snackbarHostState2, context, foodTrackerEventListener, null);
                snackbarHostState = snackbarHostState2;
                eventListener = foodTrackerEventListener;
                composerImplV.A(foodTrackerPageKt$FoodTrackerPage$3$1);
            } else {
                snackbarHostState = snackbarHostState2;
                foodTrackerPageKt$FoodTrackerPage$3$1 = objG6;
                i3 = -1633490746;
                i2 = i5;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, text, (Function2) foodTrackerPageKt$FoodTrackerPage$3$1);
            Boolean boolValueOf3 = Boolean.valueOf(((FoodTrackerContract.ViewState) viewState.getD()).f7157a);
            composerImplV.o(i3);
            boolean zI4 = (i2 == 4) | composerImplV.I(modalBottomSheetStateC);
            Object objG7 = composerImplV.G();
            if (zI4 || objG7 == obj) {
                objG7 = new FoodTrackerPageKt$FoodTrackerPage$4$1(viewState, modalBottomSheetStateC, null);
                composerImplV.A(objG7);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf3, (Function2) objG7);
            composerImplV.o(-1746271574);
            boolean zI5 = composerImplV.I(coroutineScope) | composerImplV.I(modalBottomSheetStateC) | ((i4 & 896) == 256);
            Object objG8 = composerImplV.G();
            if (zI5 || objG8 == obj) {
                objG8 = new Function0() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BuildersKt.c(coroutineScope, null, null, new FoodTrackerPageKt$FoodTrackerPage$5$1$1(modalBottomSheetStateC, onNavigateUp, null), 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG8);
            }
            composerImplV.V(false);
            BackHandlerKt.a(false, (Function0) objG8, composerImplV, 0, 1);
            final FoodTrackerEventListener foodTrackerEventListener2 = eventListener;
            ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(24501659, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt$FoodTrackerPage$6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Composer composer2;
                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj2;
                    Composer composer3 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((iIntValue & 17) == 16 && composer3.c()) {
                        composer3.j();
                    } else {
                        State state2 = viewState;
                        FoodTrackerPage foodTrackerPage = ((FoodTrackerContract.ViewState) state2.getD()).b;
                        FoodTrackerContentFeed foodTrackerContentFeed = foodTrackerPage instanceof FoodTrackerContentFeed ? (FoodTrackerContentFeed) foodTrackerPage : null;
                        Object obj5 = foodTrackerContentFeed != null ? foodTrackerContentFeed.d.c : null;
                        AndroidWindowInsets androidWindowInsetsA = WindowInsets_androidKt.a(composer3);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = WindowInsetsPaddingKt.d(companion, androidWindowInsetsA);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierD);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function0);
                        } else {
                            composer3.e();
                        }
                        Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function2);
                        }
                        Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                        FoodTrackerConsent foodTrackerConsent = obj5 instanceof FoodTrackerConsent ? (FoodTrackerConsent) obj5 : null;
                        composer3.o(664693034);
                        if (foodTrackerConsent == null) {
                            composer2 = composer3;
                        } else {
                            StatefulButtonState statefulButtonState = ((FoodTrackerContract.ViewState) state2.getD()).d;
                            composer3.o(5004770);
                            FoodTrackerEventListener foodTrackerEventListener3 = eventListener;
                            boolean zI6 = composer3.I(foodTrackerEventListener3);
                            Object objG9 = composer3.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            if (zI6 || objG9 == composer$Companion$Empty$1) {
                                objG9 = new g(foodTrackerEventListener3, 0);
                                composer3.A(objG9);
                            }
                            Function0 function02 = (Function0) objG9;
                            composer3.l();
                            composer3.o(5004770);
                            boolean zI7 = composer3.I(foodTrackerEventListener3);
                            Object objG10 = composer3.G();
                            if (zI7 || objG10 == composer$Companion$Empty$1) {
                                objG10 = new g(foodTrackerEventListener3, 1);
                                composer3.A(objG10);
                            }
                            composer3.l();
                            composer2 = composer3;
                            FoodTrackerConsentFormKt.a(foodTrackerConsent, statefulButtonState, function02, (Function0) objG10, null, composer2, 0);
                        }
                        composer2.l();
                        Composer composer4 = composer2;
                        SnackbarHostKt.b(snackbarHostState, PaddingKt.j(BoxScopeInstance.f944a.g(companion, Alignment.Companion.h), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7), null, composer4, 6, 4);
                        composer4.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), SizeKt.c, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableLambdaKt.c(-367366204, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt$FoodTrackerPage$7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        final State state2 = state;
                        final Function0 function0 = onNavigateUp;
                        final State state3 = viewState;
                        final LazyListState lazyListState = lazyListStateA;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1876796129, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt$FoodTrackerPage$7.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String str = (String) state2.getD();
                                    PaddingValues paddingValuesD = WindowInsetsKt.d(WindowInsets_androidKt.b(composer3), composer3);
                                    composer3.o(285190694);
                                    float fA = ((FoodTrackerContract.ViewState) state3.getD()).b instanceof FoodTrackerContentFeed ? TopBarLiftOnScrollElevationKt.a(lazyListState, composer3) : 0;
                                    composer3.l();
                                    final Function0 function02 = function0;
                                    TopNavBarKt.b(str, null, null, null, 0L, 0L, 0L, paddingValuesD, fA, ComposableLambdaKt.c(1881819118, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt.FoodTrackerPage.7.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVectorA = CloseKt.a();
                                                String strC = StringResources_androidKt.c(composer4, R.string.cancel);
                                                composer4.o(5004770);
                                                Function0 function03 = function02;
                                                boolean zN2 = composer4.n(function03);
                                                Object objG9 = composer4.G();
                                                if (zN2 || objG9 == Composer.Companion.f1624a) {
                                                    objG9 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(27, function03);
                                                    composer4.A(objG9);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVectorA, strC, (Function0) objG9, null, false, 0L, composer4, 0, 56);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 805306368, 0, 1150);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final FoodTrackerEventListener foodTrackerEventListener3 = foodTrackerEventListener2;
                        ScaffoldKt.a(fillElement, null, composableLambdaImplC, null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(658708077, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt$FoodTrackerPage$7.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                PaddingValues it = (PaddingValues) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(it, "it");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    AndroidWindowInsets androidWindowInsetsA = WindowInsets_androidKt.a(composer3);
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierD = WindowInsetsPaddingKt.d(companion, androidWindowInsetsA);
                                    BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                                    MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierD);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function02 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function02);
                                    } else {
                                        composer3.e();
                                    }
                                    Function2 function2 = ComposeUiNode.Companion.g;
                                    Updater.b(composer3, measurePolicyD, function2);
                                    Function2 function22 = ComposeUiNode.Companion.f;
                                    Updater.b(composer3, persistentCompositionLocalMapD, function22);
                                    Function2 function23 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function23);
                                    }
                                    Function2 function24 = ComposeUiNode.Companion.d;
                                    Updater.b(composer3, modifierD2, function24);
                                    State state4 = state3;
                                    FoodTrackerContract.ViewState viewState2 = (FoodTrackerContract.ViewState) state4.getD();
                                    Intrinsics.h(viewState2, "<this>");
                                    if (viewState2.f7157a && viewState2.b == null) {
                                        composer3.o(-1125824295);
                                        FullPageLoadingKt.a(SizeKt.c, composer3, 6);
                                        composer3.l();
                                    } else {
                                        FoodTrackerContract.ViewState viewState3 = (FoodTrackerContract.ViewState) state4.getD();
                                        Intrinsics.h(viewState3, "<this>");
                                        FoodTrackerPage foodTrackerPage = viewState3.b;
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                        FoodTrackerEventListener foodTrackerEventListener4 = foodTrackerEventListener3;
                                        if (foodTrackerPage != null && viewState3.e == null) {
                                            composer3.o(-540660767);
                                            FoodTrackerContract.ViewState viewState4 = (FoodTrackerContract.ViewState) state4.getD();
                                            Intrinsics.h(viewState4, "<this>");
                                            boolean z = viewState4.f7157a && viewState4.b != null;
                                            composer3.o(5004770);
                                            boolean zI6 = composer3.I(foodTrackerEventListener4);
                                            Object objG9 = composer3.G();
                                            if (zI6 || objG9 == composer$Companion$Empty$1) {
                                                objG9 = new g(foodTrackerEventListener4, 2);
                                                composer3.A(objG9);
                                            }
                                            composer3.l();
                                            PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(z, (Function0) objG9, composer3, 0);
                                            FillElement fillElement2 = SizeKt.c;
                                            Modifier modifierA = PullRefreshKt.a(fillElement2, pullRefreshStateA, true);
                                            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                                            int p2 = composer3.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                            Modifier modifierD3 = ComposedModifierKt.d(composer3, modifierA);
                                            if (composer3.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer3.i();
                                            if (composer3.getO()) {
                                                composer3.K(function02);
                                            } else {
                                                composer3.e();
                                            }
                                            Updater.b(composer3, measurePolicyD2, function2);
                                            Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                                androidx.camera.core.impl.b.z(p2, composer3, p2, function23);
                                            }
                                            Updater.b(composer3, modifierD3, function24);
                                            FoodTrackerPage foodTrackerPage2 = ((FoodTrackerContract.ViewState) state4.getD()).b;
                                            Intrinsics.e(foodTrackerPage2);
                                            FoodTrackerContentKt.a(foodTrackerPage2, lazyListState, foodTrackerEventListener4, fillElement2, composer3, 3072);
                                            FoodTrackerContract.ViewState viewState5 = (FoodTrackerContract.ViewState) state4.getD();
                                            Intrinsics.h(viewState5, "<this>");
                                            PullRefreshIndicatorKt.a(viewState5.f7157a && viewState5.b != null, pullRefreshStateA, BoxScopeInstance.f944a.g(companion, Alignment.Companion.b), WxTheme.a(composer3).a(), WxTheme.a(composer3).h(), composer3, 64, 32);
                                            composer3 = composer3;
                                            composer3.f();
                                            composer3.l();
                                        } else if (((FoodTrackerContract.ViewState) state4.getD()).e != null) {
                                            composer3.o(-1125773684);
                                            FullPageMessage.Error error = ((FoodTrackerContract.ViewState) state4.getD()).e;
                                            Intrinsics.e(error);
                                            composer3.o(5004770);
                                            boolean zI7 = composer3.I(foodTrackerEventListener4);
                                            Object objG10 = composer3.G();
                                            if (zI7 || objG10 == composer$Companion$Empty$1) {
                                                objG10 = new FoodTrackerPageKt$FoodTrackerPage$7$2$1$2$1(0, foodTrackerEventListener4, FoodTrackerEventListener.class, "onPageRefresh", "onPageRefresh()V", 0);
                                                composer3.A(objG10);
                                            }
                                            composer3.l();
                                            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(error, null, null, (Function0) ((KFunction) objG10), composer3, 1572864, 30), null, null, composer3, 0, 6);
                                            composer3 = composer3;
                                            composer3.l();
                                        } else {
                                            composer3.o(-538942437);
                                            composer3.l();
                                        }
                                    }
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 390, 1018);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12583478, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(viewState, foodTrackerEventListener, onNavigateUp, i, 2);
        }
    }
}
