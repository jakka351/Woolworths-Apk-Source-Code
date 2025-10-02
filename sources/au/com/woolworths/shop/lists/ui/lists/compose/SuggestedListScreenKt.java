package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.bundles.ui.k;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SuggestedListScreenKt {
    public static final void a(final SuggestedListsViewModel viewModel, Composer composer, int i) {
        Object obj;
        boolean z;
        FullPageMessageSpec fullPageMessageSpecE;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(-585782525);
        if (((i | (composerImplV.I(viewModel) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final LazyPagingItems lazyPagingItemsA = LazyPagingItemsKt.a(viewModel.k, composerImplV);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 16;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            Arrangement.SpacedAligned spacedAlignedG2 = Arrangement.g(f);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(lazyPagingItemsA) | composerImplV.I(viewModel);
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (zI || objG == obj2) {
                objG = new Function1() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        LazyGridScope LazyVerticalGrid = (LazyGridScope) obj3;
                        Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        final LazyPagingItems lazyPagingItems = lazyPagingItemsA;
                        int iB = lazyPagingItems.b();
                        final SuggestedListsViewModel suggestedListsViewModel = viewModel;
                        LazyGridScope.h(LazyVerticalGrid, iB, null, null, null, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.SuggestedListScreenKt$SuggestedListScreen$1$1$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                LazyGridItemScope items = (LazyGridItemScope) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Composer composer2 = (Composer) obj6;
                                int iIntValue2 = ((Number) obj7).intValue();
                                Intrinsics.h(items, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if ((iIntValue2 & 145) == 144 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    SuggestedListItem suggestedListItem = (SuggestedListItem) lazyPagingItems.a(iIntValue);
                                    if (suggestedListItem != null) {
                                        composer2.o(5004770);
                                        SuggestedListsViewModel suggestedListsViewModel2 = suggestedListsViewModel;
                                        boolean zI2 = composer2.I(suggestedListsViewModel2);
                                        Object objG2 = composer2.G();
                                        if (zI2 || objG2 == Composer.Companion.f1624a) {
                                            SuggestedListScreenKt$SuggestedListScreen$1$1$1$1$1$1$1 suggestedListScreenKt$SuggestedListScreen$1$1$1$1$1$1$1 = new SuggestedListScreenKt$SuggestedListScreen$1$1$1$1$1$1$1(1, suggestedListsViewModel2, SuggestedListsViewModel.class, "onSuggestedListItemClicked", "onSuggestedListItemClicked(Lau/com/woolworths/shop/lists/data/model/SuggestedListItem;)V", 0);
                                            composer2.A(suggestedListScreenKt$SuggestedListScreen$1$1$1$1$1$1$1);
                                            objG2 = suggestedListScreenKt$SuggestedListScreen$1$1$1$1$1$1$1;
                                        }
                                        composer2.l();
                                        SuggestedListItemCardKt.a(suggestedListItem, (Function1) ((KFunction) objG2), null, composer2, 0, 4);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1093998696), 14);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyGridDslKt.b(fixed, null, null, paddingValuesImpl, false, spacedAlignedG, spacedAlignedG2, null, false, null, (Function1) objG, composerImplV, 1772544, 0, 918);
            LoadState loadState = lazyPagingItemsA.d().f3529a;
            if (loadState instanceof LoadState.Loading) {
                composerImplV.o(950898987);
                if (lazyPagingItemsA.b() == 0) {
                    ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(companion, Alignment.Companion.e));
                }
                composerImplV.V(false);
                obj = obj2;
            } else if (loadState instanceof LoadState.Error) {
                composerImplV.o(951189116);
                if (((LoadState.Error) loadState).b instanceof NoConnectivityException) {
                    composerImplV.o(-1908974375);
                    composerImplV.o(5004770);
                    boolean zI2 = composerImplV.I(lazyPagingItemsA);
                    Object objG2 = composerImplV.G();
                    if (zI2) {
                        obj = obj2;
                    } else {
                        obj = obj2;
                        if (objG2 == obj) {
                        }
                        z = false;
                        composerImplV.V(false);
                        fullPageMessageSpecE = FullPageMessageSpec.Companion.b(null, null, (Function0) objG2, composerImplV, 15);
                        composerImplV.V(false);
                    }
                    objG2 = new k(lazyPagingItemsA, 7);
                    composerImplV.A(objG2);
                    z = false;
                    composerImplV.V(false);
                    fullPageMessageSpecE = FullPageMessageSpec.Companion.b(null, null, (Function0) objG2, composerImplV, 15);
                    composerImplV.V(false);
                } else {
                    obj = obj2;
                    composerImplV.o(-1908968738);
                    composerImplV.o(5004770);
                    boolean zI3 = composerImplV.I(lazyPagingItemsA);
                    Object objG3 = composerImplV.G();
                    if (zI3 || objG3 == obj) {
                        objG3 = new k(lazyPagingItemsA, 8);
                        composerImplV.A(objG3);
                    }
                    z = false;
                    composerImplV.V(false);
                    fullPageMessageSpecE = FullPageMessageSpec.Companion.e(null, null, null, null, (Function0) objG3, composerImplV, 31);
                    composerImplV.V(false);
                }
                FullPageMessageUiKt.a(fullPageMessageSpecE, null, null, composerImplV, 0, 6);
                composerImplV.V(z);
            } else {
                obj = obj2;
                composerImplV.o(951650179);
                composerImplV.V(false);
            }
            LoadState loadState2 = lazyPagingItemsA.d().f3529a;
            composerImplV.o(-1633490746);
            boolean zI4 = composerImplV.I(lazyPagingItemsA) | composerImplV.I(viewModel);
            Object objG4 = composerImplV.G();
            if (zI4 || objG4 == obj) {
                objG4 = new SuggestedListScreenKt$SuggestedListScreen$1$4$1(lazyPagingItemsA, viewModel, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, loadState2, (Function2) objG4);
            ArrayList arrayListB = b(lazyPagingItemsA);
            composerImplV.o(-1633490746);
            boolean zI5 = composerImplV.I(viewModel) | composerImplV.I(lazyPagingItemsA);
            Object objG5 = composerImplV.G();
            if (zI5 || objG5 == obj) {
                objG5 = new SuggestedListScreenKt$SuggestedListScreen$1$5$1(lazyPagingItemsA, viewModel, null);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, arrayListB, (Function2) objG5);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 29, viewModel);
        }
    }

    public static final ArrayList b(LazyPagingItems lazyPagingItems) {
        IntRange intRangeO = RangesKt.o(0, lazyPagingItems.b());
        ArrayList arrayList = new ArrayList();
        IntProgressionIterator it = intRangeO.iterator();
        while (it.f) {
            Object objA = lazyPagingItems.a(it.nextInt());
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }
}
