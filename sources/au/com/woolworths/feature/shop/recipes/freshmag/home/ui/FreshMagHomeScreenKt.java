package au.com.woolworths.feature.shop.recipes.freshmag.home.ui;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeContract;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeErrorState;
import au.com.woolworths.feature.shop.recipes.freshmag.ui.FreshMagErrorKt;
import au.com.woolworths.feature.shop.recipes.freshmag.ui.FreshMagTopNavBarKt;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagHomeScreenKt {
    public static final void a(final FreshMagHomeData freshMagHomeData, final Function1 function1, final Function2 function2, final Function1 function12, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1494399145);
        int i2 = i | (composerImplV.I(freshMagHomeData) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128) | (composerImplV.I(function12) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(freshMagHomeData) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        FreshMagHomeData freshMagHomeData2 = freshMagHomeData;
                        if (freshMagHomeData2 != null) {
                            int i3 = 0;
                            for (final Object obj2 : freshMagHomeData2.f8052a) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                Integer numValueOf = Integer.valueOf(i3);
                                final Function1 function13 = function1;
                                final Function2 function22 = function2;
                                final Function1 function14 = function12;
                                LazyListScope.i(LazyColumn, numValueOf, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt$FreshMagHome$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Object obj6 = obj2;
                                            if (obj6 instanceof FreshMagSummaryData) {
                                                composer2.o(1007144016);
                                                FreshMagHomeScreenKt.c((FreshMagSummaryData) obj6, function13, null, composer2, 0);
                                                composer2.l();
                                            } else if (obj6 instanceof HorizontalListData) {
                                                composer2.o(1007150390);
                                                FreshMagHorizontalListKt.a((HorizontalListData) obj6, function22, function14, null, composer2, 0);
                                                composer2.l();
                                            } else {
                                                composer2.o(1157151048);
                                                composer2.l();
                                            }
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -870459398), 2);
                                i3 = i4;
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            Function1 function13 = (Function1) objG;
            composerImplV.V(false);
            modifier2 = Modifier.Companion.d;
            LazyDslKt.b(modifier2, null, null, false, null, null, null, false, null, function13, composerImplV, 6, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(freshMagHomeData, function1, function2, function12, modifier2, i, 8);
        }
    }

    public static final void b(final Function0 onNavigateUp, final FreshMagHomeViewModel viewModel, Composer composer, int i) {
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(2139982004);
        if ((((composerImplV.I(onNavigateUp) ? 4 : 2) | i | (composerImplV.I(viewModel) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final MutableState mutableStateA = LiveDataAdapterKt.a(viewModel.k, composerImplV);
            Object objX = composerImplV.x(LocalActivityKt.f65a);
            if (objX == null) {
                throw new IllegalArgumentException("Could not find activity!");
            }
            Activity activity = (Activity) objX;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-679029648, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt$FreshMagHomeScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FreshMagHomeContract.ViewState viewState = (FreshMagHomeContract.ViewState) mutableStateA.getD();
                        Integer num = viewState != null ? viewState.d : null;
                        composer2.o(5004770);
                        FreshMagHomeViewModel freshMagHomeViewModel = viewModel;
                        boolean zI = composer2.I(freshMagHomeViewModel);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            FreshMagHomeScreenKt$FreshMagHomeScreen$1$1$1 freshMagHomeScreenKt$FreshMagHomeScreen$1$1$1 = new FreshMagHomeScreenKt$FreshMagHomeScreen$1$1$1(0, freshMagHomeViewModel, FreshMagHomeViewModel.class, "onCartClicked", "onCartClicked()V", 0);
                            composer2.A(freshMagHomeScreenKt$FreshMagHomeScreen$1$1$1);
                            objG = freshMagHomeScreenKt$FreshMagHomeScreen$1$1$1;
                        }
                        composer2.l();
                        FreshMagTopNavBarKt.a(num, (Function0) ((KFunction) objG), onNavigateUp, null, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, WindowInsets_androidKt.b(composerImplV), ComposableLambdaKt.c(2013551815, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt$FreshMagHomeScreen$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f8064a;

                    static {
                        int[] iArr = new int[FreshMagHomeContract.PageState.values().length];
                        try {
                            FreshMagHomeContract.PageState pageState = FreshMagHomeContract.PageState.d;
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            FreshMagHomeContract.PageState pageState2 = FreshMagHomeContract.PageState.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            FreshMagHomeContract.PageState pageState3 = FreshMagHomeContract.PageState.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        f8064a = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(SizeKt.c, paddingValues);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
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
                        FreshMagHomeContract.ViewState viewState = (FreshMagHomeContract.ViewState) state.getD();
                        FreshMagHomeContract.PageState pageState = viewState != null ? viewState.f8062a : null;
                        int i2 = pageState == null ? -1 : WhenMappings.f8064a[pageState.ordinal()];
                        if (i2 != 1) {
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            FreshMagHomeViewModel freshMagHomeViewModel = viewModel;
                            if (i2 == 2) {
                                composer2.o(-1545884535);
                                FreshMagHomeContract.ViewState viewState2 = (FreshMagHomeContract.ViewState) state.getD();
                                FreshMagHomeData freshMagHomeData = viewState2 != null ? viewState2.c : null;
                                composer2.o(5004770);
                                boolean zI = composer2.I(freshMagHomeViewModel);
                                Object objG = composer2.G();
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(freshMagHomeViewModel, 13);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(freshMagHomeViewModel);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    FreshMagHomeScreenKt$FreshMagHomeScreen$2$1$2$1 freshMagHomeScreenKt$FreshMagHomeScreen$2$1$2$1 = new FreshMagHomeScreenKt$FreshMagHomeScreen$2$1$2$1(2, freshMagHomeViewModel, FreshMagHomeViewModel.class, "onHorizontalListItemClicked", "onHorizontalListItemClicked(Lau/com/woolworths/android/onesite/data/HorizontalListData;Ljava/lang/Object;)V", 0);
                                    composer2.A(freshMagHomeScreenKt$FreshMagHomeScreen$2$1$2$1);
                                    objG2 = freshMagHomeScreenKt$FreshMagHomeScreen$2$1$2$1;
                                }
                                composer2.l();
                                Function2 function22 = (Function2) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(freshMagHomeViewModel);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    FreshMagHomeScreenKt$FreshMagHomeScreen$2$1$3$1 freshMagHomeScreenKt$FreshMagHomeScreen$2$1$3$1 = new FreshMagHomeScreenKt$FreshMagHomeScreen$2$1$3$1(1, freshMagHomeViewModel, FreshMagHomeViewModel.class, "onHorizontalListActionClicked", "onHorizontalListActionClicked(Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;)V", 0);
                                    composer2.A(freshMagHomeScreenKt$FreshMagHomeScreen$2$1$3$1);
                                    objG3 = freshMagHomeScreenKt$FreshMagHomeScreen$2$1$3$1;
                                }
                                composer2.l();
                                FreshMagHomeScreenKt.a(freshMagHomeData, function1, function22, (Function1) ((KFunction) objG3), null, composer2, 0);
                                composer2.l();
                            } else if (i2 != 3) {
                                composer2.o(-1545121625);
                                composer2.l();
                            } else {
                                composer2.o(-1545348669);
                                FreshMagHomeContract.ViewState viewState3 = (FreshMagHomeContract.ViewState) state.getD();
                                FreshMagHomeErrorState freshMagHomeErrorState = viewState3 != null ? viewState3.b : null;
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(freshMagHomeViewModel);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    FreshMagHomeScreenKt$FreshMagHomeScreen$2$1$4$1 freshMagHomeScreenKt$FreshMagHomeScreen$2$1$4$1 = new FreshMagHomeScreenKt$FreshMagHomeScreen$2$1$4$1(0, freshMagHomeViewModel, FreshMagHomeViewModel.class, "fetchFreshMagHomeData", "fetchFreshMagHomeData()V", 0);
                                    composer2.A(freshMagHomeScreenKt$FreshMagHomeScreen$2$1$4$1);
                                    objG4 = freshMagHomeScreenKt$FreshMagHomeScreen$2$1$4$1;
                                }
                                composer2.l();
                                FreshMagErrorKt.a(freshMagHomeErrorState, (Function0) ((KFunction) objG4), composer2, 0);
                                composer2.l();
                            }
                        } else {
                            composer2.o(-1546029646);
                            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composer2, null);
                            composer2 = composer2;
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 60);
            Flow flow = viewModel.m;
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(viewModel) | composerImplV.I(activity);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new FreshMagHomeScreenKt$FreshMagHomeScreen$3$1(viewModel, activity, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(onNavigateUp, i, 26, viewModel);
        }
    }

    public static final void c(final FreshMagSummaryData data, Function1 onViewFreshMagClicked, Modifier modifier, Composer composer, int i) {
        boolean z;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        Intrinsics.h(onViewFreshMagClicked, "onViewFreshMagClicked");
        ComposerImpl composerImplV = composer.v(-88699406);
        int i2 = i | (composerImplV.n(data) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onViewFreshMagClicked) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 32;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, 5);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierF = PaddingKt.f(SizeKt.g(SizeKt.u(companion, 216), 284), 4);
            composerImplV.o(-1633490746);
            int i5 = i3 & 14;
            int i6 = i3 & 112;
            boolean z2 = (i5 == 4) | (i6 == 32);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z2 || objG == composer$Companion$Empty$1) {
                objG = new a(data, onViewFreshMagClicked);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CardKt.b((Function0) objG, modifierF, false, RectangleShapeKt.f1779a, 0L, 0L, 0L, 0L, null, null, null, ComposableLambdaKt.c(-551169609, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt$FreshMagSummary$1$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Card, "$this$Card");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        ImageRequest.Builder builder = new ImageRequest.Builder((Context) composer2.x(AndroidCompositionLocals_androidKt.b));
                        builder.c = data.f8054a;
                        ImageRequests_androidKt.d(builder, R.drawable.fresh_mag_placeholder);
                        ImageRequests_androidKt.a(builder, R.drawable.fresh_mag_placeholder);
                        SingletonAsyncImageKt.a(builder.a(), null, fillElement, null, ContentScale.Companion.f1880a, composer2, 1573296, 1976);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3120, 2036);
            TextKt.b(data.b, PaddingKt.j(companion, f, 24, f, BitmapDescriptorFactory.HUE_RED, 8), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 0, 0, 65020);
            composerImplV = composerImplV;
            composerImplV.o(-494371668);
            String str = data.d;
            if (str != null) {
                Modifier modifierJ2 = PaddingKt.j(SizeKt.e(companion, 1.0f), f, f, f, BitmapDescriptorFactory.HUE_RED, 8);
                composerImplV.o(-1633490746);
                boolean z3 = (i5 == 4) | (i6 == 32);
                Object objG2 = composerImplV.G();
                if (z3 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new a(onViewFreshMagClicked, data);
                    composerImplV.A(objG2);
                }
                z = false;
                composerImplV.V(false);
                PrimaryButtonKt.a(str, (Function0) objG2, modifierJ2, false, null, null, null, null, composerImplV, 0, 248);
            } else {
                z = false;
            }
            composerImplV.V(z);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(i, 26, data, modifier2, onViewFreshMagClicked);
        }
    }
}
