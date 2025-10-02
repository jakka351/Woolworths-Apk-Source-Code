package au.com.woolworths.feature.product.list.compose.filter.child;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.navigation.compose.d;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsContentSkeletonKt;
import au.com.woolworths.feature.product.list.compose.filter.k;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.product.list.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.ui.ChildFilterItem;
import au.com.woolworths.feature.product.list.ui.ChildFilterMenuState;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$ViewState;", "viewState", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListChildFilterScreenKt {
    public static final void a(final ProductListOptionsContract.ViewState viewState, final Function1 onFilterOptionClicked, final Function2 onFilterCheckboxStateChanged, final Function1 onActionClicked, Function0 onSeeResultButtonClick, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onFilterOptionClicked, "onFilterOptionClicked");
        Intrinsics.h(onFilterCheckboxStateChanged, "onFilterCheckboxStateChanged");
        Intrinsics.h(onActionClicked, "onActionClicked");
        Intrinsics.h(onSeeResultButtonClick, "onSeeResultButtonClick");
        ComposerImpl composerImplV = composer.v(-26932333);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onFilterOptionClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onFilterCheckboxStateChanged) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onActionClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onSeeResultButtonClick) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ProductListOptionsContentSkeletonKt.a(viewState, onSeeResultButtonClick, ComposableLambdaKt.c(969587083, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterContent$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ProductListOptionsContentSkeleton = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ProductListOptionsContentSkeleton, "$this$ProductListOptionsContentSkeleton");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(ProductListOptionsContentSkeleton) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 8;
                        SpacerKt.c(ProductListOptionsContentSkeleton, f, composer2, (iIntValue & 14) | 48);
                        Modifier modifierA = ProductListOptionsContentSkeleton.a(SizeKt.e(Modifier.Companion.d, 1.0f), 1.0f, true);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
                        composer2.o(-1224400529);
                        final ProductListOptionsContract.ViewState viewState2 = viewState;
                        boolean zI = composer2.I(viewState2);
                        final Function1 function1 = onFilterOptionClicked;
                        boolean zN = zI | composer2.n(function1);
                        final Function2 function2 = onFilterCheckboxStateChanged;
                        boolean zN2 = zN | composer2.n(function2);
                        final Function1 function12 = onActionClicked;
                        boolean zN3 = zN2 | composer2.n(function12);
                        Object objG = composer2.G();
                        if (zN3 || objG == Composer.Companion.f1624a) {
                            objG = new Function1() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    LazyListScope LazyColumn = (LazyListScope) obj4;
                                    Intrinsics.h(LazyColumn, "$this$LazyColumn");
                                    for (ChildFilterItem childFilterItem : viewState2.f) {
                                        if (childFilterItem instanceof FilterMenuItem) {
                                            final FilterMenuItem filterMenuItem = (FilterMenuItem) childFilterItem;
                                            String str = filterMenuItem.d;
                                            final Function1 function13 = function1;
                                            final Function2 function22 = function2;
                                            LazyListScope.i(LazyColumn, str, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterContent$1$1$1$1$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    LazyItemScope item = (LazyItemScope) obj5;
                                                    Composer composer3 = (Composer) obj6;
                                                    int iIntValue2 = ((Number) obj7).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        ProductListOptionsChildFilterKt.a(filterMenuItem, function13, function22, composer3, 0);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -1546236018), 2);
                                        } else if (childFilterItem instanceof FilterInsetBannerData) {
                                            final FilterInsetBannerData filterInsetBannerData = (FilterInsetBannerData) childFilterItem;
                                            String filterPageKey = filterInsetBannerData.getFilterPageKey();
                                            final Function1 function14 = function12;
                                            LazyListScope.i(LazyColumn, filterPageKey, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterContent$1$1$1$1$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    LazyItemScope item = (LazyItemScope) obj5;
                                                    Composer composer3 = (Composer) obj6;
                                                    int iIntValue2 = ((Number) obj7).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        InsetBannerUiKt.b(filterInsetBannerData, null, false, function14, composer3, 0, 14);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -1808515323), 2);
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG);
                        }
                        composer2.l();
                        LazyDslKt.b(modifierA, null, null, false, spacedAlignedG, null, null, false, null, (Function1) objG, composer2, 24576, 494);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 9) & 112) | (i2 & 14) | KyberEngine.KyberPolyBytes);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(viewState, onFilterOptionClicked, onFilterCheckboxStateChanged, onActionClicked, onSeeResultButtonClick, i, 1);
        }
    }

    public static final void b(final ProductListOptionsViewModel viewModel, final Function0 onNavigateUp, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-1899762097);
        if ((((composerImplV.I(viewModel) ? 4 : 2) | i | (composerImplV.I(onNavigateUp) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.j, composerImplV);
            ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composerImplV, 3);
            Text text = ((ProductListOptionsContract.ViewState) mutableStateA.getD()).c;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.b;
            final String string = text.getText((Context) composerImplV.x(staticProvidableCompositionLocal)).toString();
            Context context = (Context) composerImplV.x(staticProvidableCompositionLocal);
            au.com.woolworths.design.wx.component.ScaffoldKt.a(SizeKt.c, scaffoldStateD, ComposableLambdaKt.c(153033962, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1555008505, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.back), function0, null, false, WxTheme.a(composer3).h(), composer3, 0, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final ProductListOptionsViewModel productListOptionsViewModel = viewModel;
                        final MutableState mutableState = mutableStateA;
                        TopNavBarKt.b(string, modifierE, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, composableLambdaImplC, ComposableLambdaKt.c(1856620063, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$1.2

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$1$2$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                static {
                                    int[] iArr = new int[ChildFilterMenuState.values().length];
                                    try {
                                        iArr[0] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        ChildFilterMenuState childFilterMenuState = ChildFilterMenuState.d;
                                        iArr[1] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Pair pair;
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    int iOrdinal = ((ProductListOptionsContract.ViewState) mutableState.getD()).h.ordinal();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (iOrdinal == 0) {
                                        composer3.o(1800457851);
                                        Integer numValueOf = Integer.valueOf(R.string.product_list_clear_button);
                                        composer3.o(5004770);
                                        ProductListOptionsViewModel productListOptionsViewModel2 = productListOptionsViewModel;
                                        boolean zI = composer3.I(productListOptionsViewModel2);
                                        Object objG = composer3.G();
                                        if (zI || objG == composer$Companion$Empty$1) {
                                            objG = new ProductListChildFilterScreenKt$ProductListChildFilterScreen$1$2$1$1(0, productListOptionsViewModel2, ProductListOptionsViewModel.class, "onClearButtonClicked", "onClearButtonClicked()V", 0);
                                            composer3.A(objG);
                                        }
                                        composer3.l();
                                        pair = new Pair(numValueOf, (KFunction) objG);
                                        composer3.l();
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw au.com.woolworths.android.onesite.a.x(composer3, 1800455185);
                                        }
                                        composer3.o(1800464804);
                                        Integer numValueOf2 = Integer.valueOf(R.string.product_list_select_all_button);
                                        composer3.o(5004770);
                                        ProductListOptionsViewModel productListOptionsViewModel3 = productListOptionsViewModel;
                                        boolean zI2 = composer3.I(productListOptionsViewModel3);
                                        Object objG2 = composer3.G();
                                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                                            objG2 = new ProductListChildFilterScreenKt$ProductListChildFilterScreen$1$2$2$1(0, productListOptionsViewModel3, ProductListOptionsViewModel.class, "onSelectAllButtonClicked", "onSelectAllButtonClicked()V", 0);
                                            composer3.A(objG2);
                                        }
                                        composer3.l();
                                        pair = new Pair(numValueOf2, (KFunction) objG2);
                                        composer3.l();
                                    }
                                    final int iIntValue2 = ((Number) pair.d).intValue();
                                    ButtonKt.c((Function0) ((KFunction) pair.e), null, !((ProductListOptionsContract.ViewState) r13.getD()).f5258a, null, null, null, null, null, ComposableLambdaKt.c(948194588, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt.ProductListChildFilterScreen.1.2.3
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            RowScope TextButton = (RowScope) obj6;
                                            Composer composer4 = (Composer) obj7;
                                            int iIntValue3 = ((Number) obj8).intValue();
                                            Intrinsics.h(TextButton, "$this$TextButton");
                                            if ((iIntValue3 & 17) == 16 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 4);
                                                String upperCase = StringResources_androidKt.c(composer4, iIntValue2).toUpperCase(Locale.ROOT);
                                                Intrinsics.g(upperCase, "toUpperCase(...)");
                                                TextKt.b(upperCase, modifierF, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 48, 0, 131068);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 805306368, 506);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306416, 6, 508);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(1039233720, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProductListOptionsContract.ViewState viewState = (ProductListOptionsContract.ViewState) mutableStateA.getD();
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel = viewModel;
                        boolean zI = composer2.I(productListOptionsViewModel);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI || objG == composer$Companion$Empty$1) {
                            ProductListChildFilterScreenKt$ProductListChildFilterScreen$2$1$1 productListChildFilterScreenKt$ProductListChildFilterScreen$2$1$1 = new ProductListChildFilterScreenKt$ProductListChildFilterScreen$2$1$1(1, productListOptionsViewModel, ProductListOptionsViewModel.class, "onFilterOptionClicked", "onFilterOptionClicked(Ljava/lang/String;)V", 0);
                            composer2.A(productListChildFilterScreenKt$ProductListChildFilterScreen$2$1$1);
                            objG = productListChildFilterScreenKt$ProductListChildFilterScreen$2$1$1;
                        }
                        composer2.l();
                        Function1 function1 = (Function1) ((KFunction) objG);
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel2 = viewModel;
                        boolean zI2 = composer2.I(productListOptionsViewModel2);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                            ProductListChildFilterScreenKt$ProductListChildFilterScreen$2$2$1 productListChildFilterScreenKt$ProductListChildFilterScreen$2$2$1 = new ProductListChildFilterScreenKt$ProductListChildFilterScreen$2$2$1(2, productListOptionsViewModel2, ProductListOptionsViewModel.class, "onFilterCheckboxStateChanged", "onFilterCheckboxStateChanged(Lau/com/woolworths/feature/product/list/ui/FilterMenuItem;Landroidx/compose/ui/state/ToggleableState;)V", 0);
                            composer2.A(productListChildFilterScreenKt$ProductListChildFilterScreen$2$2$1);
                            objG2 = productListChildFilterScreenKt$ProductListChildFilterScreen$2$2$1;
                        }
                        composer2.l();
                        Function2 function2 = (Function2) ((KFunction) objG2);
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel3 = viewModel;
                        boolean zI3 = composer2.I(productListOptionsViewModel3);
                        Object objG3 = composer2.G();
                        if (zI3 || objG3 == composer$Companion$Empty$1) {
                            objG3 = new ProductListChildFilterScreenKt$ProductListChildFilterScreen$2$3$1(1, productListOptionsViewModel3, ProductListOptionsViewModel.class, "onActionClicked", "onActionClicked(Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;)V", 0);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        Function1 function12 = (Function1) ((KFunction) objG3);
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel4 = viewModel;
                        boolean zI4 = composer2.I(productListOptionsViewModel4);
                        Object objG4 = composer2.G();
                        if (zI4 || objG4 == composer$Companion$Empty$1) {
                            objG4 = new k(productListOptionsViewModel4, 2);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        ProductListChildFilterScreenKt.a(viewState, function1, function2, function12, (Function0) objG4, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 390, 1016);
            composerImpl = composerImplV;
            composerImpl.o(-1746271574);
            boolean zI = composerImpl.I(viewModel) | composerImpl.n(scaffoldStateD) | composerImpl.I(context);
            Object objG = composerImpl.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1(viewModel, scaffoldStateD, context, null);
                composerImpl.A(objG);
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, Unit.f24250a, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(viewModel, i, 11, onNavigateUp);
        }
    }
}
