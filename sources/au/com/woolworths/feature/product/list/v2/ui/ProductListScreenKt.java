package au.com.woolworths.feature.product.list.v2.ui;

import android.app.Activity;
import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalActivityKt;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.v2.ProductListUiState;
import au.com.woolworths.feature.product.list.v2.ProductListViewModel;
import au.com.woolworths.feature.product.list.v2.data.ProductListData;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiState;", "uiState", "product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListScreenKt {
    public static final void a(ProductListViewModel productListViewModel, final ShopAppNavigator navigator, final Function2 launchProductSearch, Composer composer, final int i) {
        Object productListScreenKt$ProductListScreen$1$1;
        Flow flow;
        final SnackbarHostState snackbarHostState;
        ComposerImpl composerImpl;
        final ProductListViewModel productListViewModel2 = productListViewModel;
        Intrinsics.h(navigator, "navigator");
        Intrinsics.h(launchProductSearch, "launchProductSearch");
        ComposerImpl composerImplV = composer.v(-1710004593);
        int i2 = (composerImplV.n(productListViewModel2) ? 4 : 2) | i | (composerImplV.I(navigator) ? 32 : 16) | (composerImplV.I(launchProductSearch) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Object objX = composerImplV.x(LocalActivityKt.f65a);
            if (objX == null) {
                throw new IllegalArgumentException("Could not find activity!");
            }
            Activity activity = (Activity) objX;
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerA = LocalOnBackPressedDispatcherOwner.a(composerImplV);
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwnerA != null ? onBackPressedDispatcherOwnerA.getF() : null;
            final MutableState mutableStateA = FlowExtKt.a(productListViewModel2.q, composerImplV);
            final au.com.woolworths.feature.product.list.v2.a aVar = productListViewModel2.t;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objG;
            composerImplV.V(false);
            final LazyPagingItems lazyPagingItemsA = LazyPagingItemsKt.a(productListViewModel2.o, composerImplV);
            Flow flow2 = productListViewModel2.s;
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 14) == 4) | composerImplV.I(onBackPressedDispatcher) | composerImplV.I(context) | ((i2 & 896) == 256) | composerImplV.I(activity) | composerImplV.I(navigator);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                flow = flow2;
                snackbarHostState = snackbarHostState2;
                productListViewModel2 = productListViewModel;
                productListScreenKt$ProductListScreen$1$1 = new ProductListScreenKt$ProductListScreen$1$1(productListViewModel2, onBackPressedDispatcher, context, launchProductSearch, activity, navigator, snackbarHostState, null);
                composerImplV.A(productListScreenKt$ProductListScreen$1$1);
            } else {
                productListScreenKt$ProductListScreen$1$1 = objG2;
                snackbarHostState = snackbarHostState2;
                productListViewModel2 = productListViewModel;
                flow = flow2;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) productListScreenKt$ProductListScreen$1$1);
            composerImpl = composerImplV;
            ScaffoldKt.a(WindowInsetsPaddingKt.d(SizeKt.c, WindowInsets_androidKt.b(composerImplV)), ComposableLambdaKt.c(904376659, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$ProductListScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        State state = mutableStateA;
                        ProductListTopBarKt.a(((ProductListUiState) state.getD()).f5522a, ((ProductListUiState) state.getD()).d, ((ProductListUiState) state.getD()).f, ((ProductListUiState) state.getD()).c, aVar, ((ProductListUiState) state.getD()).e, !((ProductListUiState) state.getD()).d, null, 0L, 0L, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(-1018873771, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$ProductListScreen$3
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
            }, composerImplV), 0L, null, ComposableLambdaKt.c(-1505446500, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$ProductListScreen$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    int i3 = iIntValue & 19;
                    Unit unit = Unit.f24250a;
                    if (i3 == 18 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    Modifier modifierE = PaddingKt.e(SizeKt.c, it);
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                    ComposeUiNode.e3.getClass();
                    Function0 function0 = ComposeUiNode.Companion.b;
                    Unit unit2 = null;
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
                    final LazyPagingItems lazyPagingItems = lazyPagingItemsA;
                    boolean zC = Intrinsics.c(lazyPagingItems.d().f3529a, LoadState.Loading.b);
                    final State state = mutableStateA;
                    if (zC) {
                        composer2.o(698139226);
                        ProductListSkeletonUiKt.a(((ProductListUiState) state.getD()).g, composer2, 0);
                        composer2.l();
                    } else {
                        composer2.o(698250082);
                        ProductListData productListData = ((ProductListUiState) state.getD()).b;
                        ProductListZeroResults productListZeroResults = productListData != null ? productListData.n : null;
                        composer2.o(-116022033);
                        final ProductListViewModel productListViewModel3 = productListViewModel2;
                        final Function1 function1 = aVar;
                        if (productListZeroResults != null) {
                            ProductListZeroResultsViewKt.a(productListZeroResults, ((ProductListUiState) state.getD()).h.isInstoreMode(), productListViewModel3, function1, null, composer2, 24576);
                            unit2 = unit;
                        }
                        composer2.l();
                        if (unit2 == null) {
                            ThemeKt.b(6, composer2, ComposableLambdaKt.c(-743040055, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$ProductListScreen$4$1$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer3 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        ProductListPageUiKt.a(lazyPagingItems, function1, (ProductListUiState) state.getD(), productListViewModel3, composer3, 8);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2));
                        }
                        composer2.l();
                    }
                    composer2.f();
                    return unit;
                }
            }, composerImplV), composerImpl, 12586032, 116);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(navigator, launchProductSearch, i) { // from class: au.com.woolworths.feature.product.list.v2.ui.c
                public final /* synthetic */ ShopAppNavigator e;
                public final /* synthetic */ Function2 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ProductListScreenKt.a(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState r7, au.com.woolworths.product.models.ProductCard r8, java.lang.String r9, java.lang.String r10, boolean r11, au.com.woolworths.design.core.ui.component.experimental.chip.e r12, kotlin.coroutines.Continuation r13) {
        /*
            boolean r0 = r13 instanceof au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$showWatchlistSnackbar$1
            if (r0 == 0) goto L14
            r0 = r13
            au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$showWatchlistSnackbar$1 r0 = (au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$showWatchlistSnackbar$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.u = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$showWatchlistSnackbar$1 r0 = new au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$showWatchlistSnackbar$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r5.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.u
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            boolean r11 = r5.s
            au.com.woolworths.design.core.ui.component.experimental.chip.e r12 = r5.r
            java.lang.String r9 = r5.q
            au.com.woolworths.product.models.ProductCard r8 = r5.p
            kotlin.ResultKt.b(r13)
            goto L5a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.ResultKt.b(r13)
            if (r11 == 0) goto L42
            java.lang.String r13 = "View List"
        L40:
            r3 = r13
            goto L44
        L42:
            r13 = 0
            goto L40
        L44:
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarDuration r4 = au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarDuration.d
            r5.p = r8
            r5.q = r9
            r5.r = r12
            r5.s = r11
            r5.u = r2
            r6 = 4
            r1 = r7
            r2 = r10
            java.lang.Object r13 = au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState.c(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5a
            return r0
        L5a:
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult r13 = (au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult) r13
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult r7 = au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult.e
            if (r13 != r7) goto L65
            if (r11 == 0) goto L65
            r12.invoke(r8, r9)
        L65:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt.b(au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState, au.com.woolworths.product.models.ProductCard, java.lang.String, java.lang.String, boolean, au.com.woolworths.design.core.ui.component.experimental.chip.e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
