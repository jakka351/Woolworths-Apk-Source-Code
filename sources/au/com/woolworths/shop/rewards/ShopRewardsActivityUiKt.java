package au.com.woolworths.shop.rewards;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.listpage.ui.e;
import au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.wx.CollapsingToolbarScaffoldKt;
import au.com.woolworths.rewards.tooltip.Tooltip;
import au.com.woolworths.shop.checkout.ui.compose.k;
import au.com.woolworths.shop.rewards.ShopRewardsContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/ShopRewardsContract$ViewState;", "viewState", "Lau/com/woolworths/rewards/tooltip/Tooltip;", "tooltip", "shop-rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopRewardsActivityUiKt {
    public static final void a(Function0 function0, Composer composer, int i) {
        Function0 function02;
        ComposerImpl composerImplV = composer.v(1716274235);
        int i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            function02 = function0;
            IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composerImplV, com.woolworths.R.string.back), function02, null, false, WxTheme.a(composerImplV).c(), composerImplV, (i2 << 6) & 896, 24);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.b(i, 7, function02);
        }
    }

    public static final void b(ShopRewardsContract.ViewState viewState, Tooltip tooltip, Function0 function0, Function0 function02, Composer composer, int i) {
        Painter painterA;
        Function0 function03;
        ComposerImpl composerImplV = composer.v(-2857397);
        int i2 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.n(tooltip) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function03 = function02;
        } else {
            Modifier modifierH = PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (viewState.b) {
                composerImplV.o(1229242022);
                painterA = PainterResources_androidKt.a(com.woolworths.R.drawable.ic_boosters_everyday_rewards_plus, 0, composerImplV);
                composerImplV.V(false);
            } else {
                composerImplV.o(1229355947);
                painterA = PainterResources_androidKt.a(com.woolworths.R.drawable.ic_boosters_everyday_rewards, 0, composerImplV);
                composerImplV.V(false);
            }
            ImageKt.a(painterA, StringResources_androidKt.c(composerImplV, com.woolworths.R.string.back), null, Alignment.Companion.d, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 3072, 116);
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new j(21, function0);
                composerImplV.A(objG);
            }
            Function1 function1 = (Function1) objG;
            composerImplV.V(false);
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(viewState);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                function03 = function02;
                objG2 = new au.com.woolworths.foundation.shop.olive.voice.ui.a(6, viewState, tooltip, function03);
                composerImplV.A(objG2);
            } else {
                function03 = function02;
            }
            composerImplV.V(false);
            AndroidView_androidKt.a(function1, null, (Function1) objG2, composerImplV, 0, 2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k((Object) viewState, (Object) tooltip, function0, function03, i, 5);
        }
    }

    public static final void c(Function0 function0, Composer composer, int i) {
        Function0 function02;
        ComposerImpl composerImplV = composer.v(-1586397321);
        int i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            function02 = function0;
            IconButtonKt.b(PainterResources_androidKt.a(com.woolworths.R.drawable.ic_settings_icon, 0, composerImplV), StringResources_androidKt.c(composerImplV, com.woolworths.R.string.settings_button_content_description), function02, null, false, WxTheme.a(composerImplV).f(), composerImplV, (i2 << 6) & 896, 24);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.b(i, 8, function02);
        }
    }

    public static final void d(final ShopRewardsViewModel shopRewardsViewModel, final Function0 onNavigateUp, final Function0 onNavigateSettings, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onNavigateSettings, "onNavigateSettings");
        ComposerImpl composerImplV = composer.v(88721495);
        if (((i | (composerImplV.I(shopRewardsViewModel) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onNavigateSettings) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(shopRewardsViewModel.k, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            ScaffoldState scaffoldStateD = ScaffoldKt.d(snackbarHostState, composerImplV, 1);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = SnapshotStateKt.f(null);
                composerImplV.A(objG2);
            }
            final MutableState mutableState = (MutableState) objG2;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(shopRewardsViewModel);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1() { // from class: au.com.woolworths.shop.rewards.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String message = (String) obj;
                        Intrinsics.h(message, "message");
                        BuildersKt.c(ViewModelKt.a(shopRewardsViewModel), null, null, new ShopRewardsActivityUiKt$ShopRewardsActivityUi$showSnackbar$1$1$1(snackbarHostState, message, null), 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            final Function1 function1 = (Function1) objG3;
            composerImplV.V(false);
            SharedFlowImpl sharedFlowImpl = shopRewardsViewModel.m;
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(shopRewardsViewModel);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new ShopRewardsActivityUiKt$ShopRewardsActivityUi$1$1(shopRewardsViewModel, mutableState, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, sharedFlowImpl, (Function2) objG4);
            if (((ShopRewardsContract.ViewState) mutableStateA.getD()).c) {
                composerImplV.o(1698281578);
                CollapsingToolbarScaffoldKt.a(ComposableLambdaKt.c(-2045267235, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ((Number) obj).floatValue();
                        Composer composer2 = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            ShopRewardsActivityUiKt.a(onNavigateUp, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), ComposableLambdaKt.c(981029982, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ((Number) obj).floatValue();
                        Composer composer2 = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                            Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            SpacerKt.a(56, composer2, 6);
                            ShopRewardsContract.ViewState viewState = (ShopRewardsContract.ViewState) mutableStateA.getD();
                            MutableState mutableState2 = mutableState;
                            Tooltip tooltip = (Tooltip) mutableState2.getD();
                            composer2.o(5004770);
                            ShopRewardsViewModel shopRewardsViewModel2 = shopRewardsViewModel;
                            boolean zI3 = composer2.I(shopRewardsViewModel2);
                            Object objG5 = composer2.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                            if (zI3 || objG5 == composer$Companion$Empty$12) {
                                ShopRewardsActivityUiKt$ShopRewardsActivityUi$3$1$1$1 shopRewardsActivityUiKt$ShopRewardsActivityUi$3$1$1$1 = new ShopRewardsActivityUiKt$ShopRewardsActivityUi$3$1$1$1(0, shopRewardsViewModel2, ShopRewardsViewModel.class, "onPointsBalanceClick", "onPointsBalanceClick()V", 0);
                                composer2.A(shopRewardsActivityUiKt$ShopRewardsActivityUi$3$1$1$1);
                                objG5 = shopRewardsActivityUiKt$ShopRewardsActivityUi$3$1$1$1;
                            }
                            composer2.l();
                            Function0 function02 = (Function0) ((KFunction) objG5);
                            composer2.o(5004770);
                            Object objG6 = composer2.G();
                            if (objG6 == composer$Companion$Empty$12) {
                                objG6 = new e(mutableState2, 20);
                                composer2.A(objG6);
                            }
                            composer2.l();
                            ShopRewardsActivityUiKt.b(viewState, tooltip, function02, (Function0) objG6, composer2, 3072);
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), null, null, 0L, 0L, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$ShopRewardsActivityUiKt.f12882a, null, null, ComposableLambdaKt.c(138170802, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$4
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        RowScope CollapsingToolbarScaffold = (RowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(CollapsingToolbarScaffold, "$this$CollapsingToolbarScaffold");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            ShopRewardsActivityUiKt.c(onNavigateSettings, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), ComposableLambdaKt.c(-1901792378, new Function5<PaddingValues, NestedScrollConnection, Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$5
                    @Override // kotlin.jvm.functions.Function5
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        PaddingValues paddingValues = (PaddingValues) obj;
                        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) obj2;
                        float fFloatValue = ((Number) obj3).floatValue();
                        Composer composer2 = (Composer) obj4;
                        ((Number) obj5).intValue();
                        Intrinsics.h(paddingValues, "paddingValues");
                        Intrinsics.h(nestedScrollConnection, "nestedScrollConnection");
                        PointsScreenKt.a(390, 0, composer2, NestedScrollModifierKt.a(PaddingKt.e(Modifier.Companion.d, paddingValues), nestedScrollConnection, null), function1, fFloatValue == BitmapDescriptorFactory.HUE_RED, true);
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 12582966, 54, 892);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                composerImplV.o(1700402939);
                au.com.woolworths.design.wx.component.ScaffoldKt.a(SizeKt.c, scaffoldStateD, ComposableLambdaKt.c(554248465, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            final Function0 function0 = onNavigateUp;
                            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1796010912, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$6.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer3 = (Composer) obj3;
                                    if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        ShopRewardsActivityUiKt.a(function0, composer3, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2);
                            final Function0 function02 = onNavigateSettings;
                            TopNavBarKt.b("", null, null, null, 0L, 0L, 0L, null, 0, composableLambdaImplC, ComposableLambdaKt.c(1357081862, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$6.2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    RowScope TopNavBar = (RowScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        ShopRewardsActivityUiKt.c(function02, composer3, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 905969670, 6, 254);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-1700136097, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$7
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        PaddingValues it = (PaddingValues) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(it, "it");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            FillElement fillElement = SizeKt.c;
                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
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
                            Updater.b(composer2, columnMeasurePolicyA, function2);
                            Function2 function22 = ComposeUiNode.Companion.f;
                            Updater.b(composer2, persistentCompositionLocalMapD, function22);
                            Function2 function23 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function23);
                            }
                            Function2 function24 = ComposeUiNode.Companion.d;
                            Updater.b(composer2, modifierD, function24);
                            ShopRewardsContract.ViewState viewState = (ShopRewardsContract.ViewState) mutableStateA.getD();
                            MutableState mutableState2 = mutableState;
                            Tooltip tooltip = (Tooltip) mutableState2.getD();
                            composer2.o(5004770);
                            ShopRewardsViewModel shopRewardsViewModel2 = shopRewardsViewModel;
                            boolean zI3 = composer2.I(shopRewardsViewModel2);
                            Object objG5 = composer2.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                            if (zI3 || objG5 == composer$Companion$Empty$12) {
                                ShopRewardsActivityUiKt$ShopRewardsActivityUi$7$1$1$1 shopRewardsActivityUiKt$ShopRewardsActivityUi$7$1$1$1 = new ShopRewardsActivityUiKt$ShopRewardsActivityUi$7$1$1$1(0, shopRewardsViewModel2, ShopRewardsViewModel.class, "onPointsBalanceClick", "onPointsBalanceClick()V", 0);
                                composer2.A(shopRewardsActivityUiKt$ShopRewardsActivityUi$7$1$1$1);
                                objG5 = shopRewardsActivityUiKt$ShopRewardsActivityUi$7$1$1$1;
                            }
                            composer2.l();
                            Function0 function02 = (Function0) ((KFunction) objG5);
                            composer2.o(5004770);
                            Object objG6 = composer2.G();
                            if (objG6 == composer$Companion$Empty$12) {
                                objG6 = new e(mutableState2, 21);
                                composer2.A(objG6);
                            }
                            composer2.l();
                            ShopRewardsActivityUiKt.b(viewState, tooltip, function02, (Function0) objG6, composer2, 3072);
                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.b, false);
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
                            Updater.b(composer2, measurePolicyD, function2);
                            Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                            }
                            Updater.b(composer2, modifierD2, function24);
                            PointsScreenKt.a(438, 8, composer2, null, function1, true, false);
                            composer2.f();
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 390, 1016);
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.product.details.ui.linkdedicatedviews.a((ViewModel) shopRewardsViewModel, onNavigateUp, (Object) onNavigateSettings, i, 2);
        }
    }
}
