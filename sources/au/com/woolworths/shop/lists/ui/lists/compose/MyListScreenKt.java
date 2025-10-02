package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.lists.data.model.ProductListItem;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.ListTitleRowKt;
import au.com.woolworths.shop.lists.ui.lists.banner.ListsBannerKt;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsContract;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$ViewState;", "viewState", "shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MyListScreenKt {
    public static final void a(final MyListsViewModel viewModel, final Function1 filterOutWatchList, Composer composer, final int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(filterOutWatchList, "filterOutWatchList");
        ComposerImpl composerImplV = composer.v(-2024162293);
        int i2 = (composerImplV.I(viewModel) ? 4 : 2) | i | (composerImplV.I(filterOutWatchList) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.r, composerImplV);
            boolean z = ((MyListsContract.ViewState) mutableStateA.getD()).f12343a;
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(viewModel);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                MyListScreenKt$MyListScreen$pullRefreshState$1$1 myListScreenKt$MyListScreen$pullRefreshState$1$1 = new MyListScreenKt$MyListScreen$pullRefreshState$1$1(0, viewModel, MyListsViewModel.class, "refreshLists", "refreshLists()V", 0);
                composerImplV.A(myListScreenKt$MyListScreen$pullRefreshState$1$1);
                objG = myListScreenKt$MyListScreen$pullRefreshState$1$1;
            }
            composerImplV.V(false);
            PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(z, (Function0) ((KFunction) objG), composerImplV, 0);
            Modifier modifierA = PullRefreshKt.a(SizeKt.c, pullRefreshStateA, true);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            PaddingValuesImpl paddingValuesImplB = PaddingKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, WindowInsetsKt.d(WindowInsets_androidKt.a(composerImplV), composerImplV).getD(), 7);
            composerImplV.o(-1746271574);
            boolean zN = composerImplV.n(mutableStateA) | composerImplV.I(viewModel) | ((i2 & 112) == 32);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final MutableState mutableState = mutableStateA;
                        boolean z2 = ((MyListsContract.ViewState) mutableState.getD()).i;
                        final MyListsViewModel myListsViewModel = viewModel;
                        if (z2) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt$MyListScreen$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(5004770);
                                        MyListsViewModel myListsViewModel2 = myListsViewModel;
                                        boolean zI2 = composer2.I(myListsViewModel2);
                                        Object objG3 = composer2.G();
                                        if (zI2 || objG3 == Composer.Companion.f1624a) {
                                            MyListScreenKt$MyListScreen$1$1$1$1$1$1 myListScreenKt$MyListScreen$1$1$1$1$1$1 = new MyListScreenKt$MyListScreen$1$1$1$1$1$1(0, myListsViewModel2, MyListsViewModel.class, "onListsBannerDismissClicked", "onListsBannerDismissClicked()V", 0);
                                            composer2.A(myListScreenKt$MyListScreen$1$1$1$1$1$1);
                                            objG3 = myListScreenKt$MyListScreen$1$1$1$1$1$1;
                                        }
                                        composer2.l();
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        ListsBannerKt.b(48, composer2, PaddingKt.f(companion, 16), (Function0) ((KFunction) objG3));
                                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(companion, 72, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1521920961), 3);
                        }
                        final ShoppingListWithItems shoppingListWithItems = ((MyListsContract.ViewState) mutableState.getD()).c;
                        if (shoppingListWithItems != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt$MyListScreen$1$1$1$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    PromotionInfo promotionInfo;
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Object obj5 = myListsViewModel;
                                        obj5.getClass();
                                        ShoppingListWithItems watchlistWithItems = shoppingListWithItems;
                                        Intrinsics.h(watchlistWithItems, "watchlistWithItems");
                                        List<ProductListItem> productItems = watchlistWithItems.getProductItems();
                                        int i4 = 0;
                                        if (!(productItems instanceof Collection) || !productItems.isEmpty()) {
                                            for (ProductListItem productListItem : productItems) {
                                                ProductCard product = productListItem.getProduct();
                                                if (((product == null || (promotionInfo = product.getPromotionInfo()) == null) ? null : promotionInfo.getType()) != ProductPromotionTypes.SPECIAL) {
                                                    ProductCard product2 = productListItem.getProduct();
                                                    if ((product2 != null ? product2.getMultiBuyPriceInfo() : null) == null) {
                                                        continue;
                                                    }
                                                }
                                                i4++;
                                                if (i4 < 0) {
                                                    CollectionsKt.y0();
                                                    throw null;
                                                }
                                            }
                                        }
                                        PluralResText pluralResText = i4 > 0 ? new PluralResText(R.plurals.shop_lists_watchlist_specials_count, i4) : null;
                                        composer2.o(-1633490746);
                                        boolean zI2 = composer2.I(obj5) | composer2.I(watchlistWithItems);
                                        Object objG3 = composer2.G();
                                        if (zI2 || objG3 == Composer.Companion.f1624a) {
                                            objG3 = new c(0, obj5, watchlistWithItems);
                                            composer2.A(objG3);
                                        }
                                        composer2.l();
                                        WatchlistUiKt.a(watchlistWithItems, pluralResText, (Function0) objG3, null, composer2, 0);
                                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(Modifier.Companion.d, 72, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 208180053), 3);
                        }
                        LazyListScope.i(LazyColumn, null, null, ComposableSingletons$MyListScreenKt.f12326a, 3);
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt$MyListScreen$1$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    boolean zC = myListsViewModel.n.c(ShoppingListsFeature.l);
                                    composer2.o(5004770);
                                    MyListsViewModel myListsViewModel2 = myListsViewModel;
                                    boolean zI2 = composer2.I(myListsViewModel2);
                                    Object objG3 = composer2.G();
                                    if (zI2 || objG3 == Composer.Companion.f1624a) {
                                        MyListScreenKt$MyListScreen$1$1$1$3$1$1 myListScreenKt$MyListScreen$1$1$1$3$1$1 = new MyListScreenKt$MyListScreen$1$1$1$3$1$1(0, myListsViewModel2, MyListsViewModel.class, "onCreateShoppingListClicked", "onCreateShoppingListClicked()V", 0);
                                        composer2.A(myListScreenKt$MyListScreen$1$1$1$3$1$1);
                                        objG3 = myListScreenKt$MyListScreen$1$1$1$3$1$1;
                                    }
                                    composer2.l();
                                    AddListItemKt.a(0, composer2, null, (Function0) ((KFunction) objG3), zC);
                                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(Modifier.Companion.d, 72, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1576563101), 3);
                        final List list = (List) filterOutWatchList.invoke(((MyListsContract.ViewState) mutableState.getD()).b);
                        LazyListScope.g(LazyColumn, list.size(), null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt$MyListScreen$1$1$1$4
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                LazyItemScope items = (LazyItemScope) obj2;
                                final int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                Intrinsics.h(items, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if ((iIntValue2 & 145) == 144 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    composer2.o(-1746271574);
                                    final MyListsViewModel myListsViewModel2 = myListsViewModel;
                                    boolean zI2 = composer2.I(myListsViewModel2);
                                    final List list2 = list;
                                    boolean zI3 = ((iIntValue2 & 112) == 32) | zI2 | composer2.I(list2);
                                    Object objG3 = composer2.G();
                                    if (zI3 || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new d(myListsViewModel2, list2, iIntValue, 0);
                                        composer2.A(objG3);
                                    }
                                    composer2.l();
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierD2 = ClickableKt.d(companion, false, null, null, (Function0) objG3, 7);
                                    ShoppingListWithItems shoppingListWithItems2 = (ShoppingListWithItems) list2.get(iIntValue);
                                    final MutableState mutableState2 = mutableState;
                                    ListTitleRowKt.a(shoppingListWithItems2, modifierD2, null, ComposableLambdaKt.c(526902855, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt$MyListScreen$1$1$1$4.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            RowScope ListTitleRow = (RowScope) obj6;
                                            Composer composer3 = (Composer) obj7;
                                            int iIntValue3 = ((Number) obj8).intValue();
                                            Intrinsics.h(ListTitleRow, "$this$ListTitleRow");
                                            if ((iIntValue3 & 17) == 16 && composer3.c()) {
                                                composer3.j();
                                            } else if (((MyListsContract.ViewState) mutableState2.getD()).h) {
                                                Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 32);
                                                composer3.o(-1746271574);
                                                MyListsViewModel myListsViewModel3 = myListsViewModel2;
                                                boolean zI4 = composer3.I(myListsViewModel3);
                                                List list3 = list2;
                                                boolean zI5 = zI4 | composer3.I(list3);
                                                int i4 = iIntValue;
                                                boolean zR = zI5 | composer3.r(i4);
                                                Object objG4 = composer3.G();
                                                if (zR || objG4 == Composer.Companion.f1624a) {
                                                    objG4 = new d(myListsViewModel3, list3, i4, 1);
                                                    composer3.A(objG4);
                                                }
                                                composer3.l();
                                                IconButtonKt.a((Function0) objG4, modifierQ, false, ComposableSingletons$MyListScreenKt.b, composer3, 3120, 4);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer2), composer2, 3072, 4);
                                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(companion, 72, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1057104559), 6);
                        if (((MyListsContract.ViewState) mutableState.getD()).g) {
                            LazyListScope.i(LazyColumn, null, null, ComposableSingletons$MyListScreenKt.c, 3);
                            if (((MyListsContract.ViewState) mutableState.getD()).e) {
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt$MyListScreen$1$1$1$5
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        LazyItemScope item = (LazyItemScope) obj2;
                                        Composer composer2 = (Composer) obj3;
                                        int iIntValue = ((Number) obj4).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            composer2.o(5004770);
                                            MyListsViewModel myListsViewModel2 = myListsViewModel;
                                            boolean zI2 = composer2.I(myListsViewModel2);
                                            Object objG3 = composer2.G();
                                            if (zI2 || objG3 == Composer.Companion.f1624a) {
                                                MyListScreenKt$MyListScreen$1$1$1$5$1$1 myListScreenKt$MyListScreen$1$1$1$5$1$1 = new MyListScreenKt$MyListScreen$1$1$1$5$1$1(0, myListsViewModel2, MyListsViewModel.class, "onBuyAgainClicked", "onBuyAgainClicked()V", 0);
                                                composer2.A(myListScreenKt$MyListScreen$1$1$1$5$1$1);
                                                objG3 = myListScreenKt$MyListScreen$1$1$1$5$1$1;
                                            }
                                            composer2.l();
                                            BuyAgainItemKt.a(0, composer2, null, (Function0) ((KFunction) objG3));
                                            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(Modifier.Companion.d, 72, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 200571155), 3);
                            }
                            if (((MyListsContract.ViewState) mutableState.getD()).d) {
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt$MyListScreen$1$1$1$6
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        LazyItemScope item = (LazyItemScope) obj2;
                                        Composer composer2 = (Composer) obj3;
                                        int iIntValue = ((Number) obj4).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            composer2.o(5004770);
                                            MyListsViewModel myListsViewModel2 = myListsViewModel;
                                            boolean zI2 = composer2.I(myListsViewModel2);
                                            Object objG3 = composer2.G();
                                            if (zI2 || objG3 == Composer.Companion.f1624a) {
                                                MyListScreenKt$MyListScreen$1$1$1$6$1$1 myListScreenKt$MyListScreen$1$1$1$6$1$1 = new MyListScreenKt$MyListScreen$1$1$1$6$1$1(0, myListsViewModel2, MyListsViewModel.class, "onPastShopsClicked", "onPastShopsClicked()V", 0);
                                                composer2.A(myListScreenKt$MyListScreen$1$1$1$6$1$1);
                                                objG3 = myListScreenKt$MyListScreen$1$1$1$6$1$1;
                                            }
                                            composer2.l();
                                            PastShopItemKt.a(0, composer2, null, (Function0) ((KFunction) objG3));
                                            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(Modifier.Companion.d, 72, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -1505105142), 3);
                            }
                        }
                        if (((MyListsContract.ViewState) mutableState.getD()).f) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt$MyListScreen$1$1$1$7
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ListHeaderItemKt.a(R.string.shop_lists_everyday_rewards_header, 0, composer2, null);
                                        composer2.o(5004770);
                                        MyListsViewModel myListsViewModel2 = myListsViewModel;
                                        boolean zI2 = composer2.I(myListsViewModel2);
                                        Object objG3 = composer2.G();
                                        if (zI2 || objG3 == Composer.Companion.f1624a) {
                                            MyListScreenKt$MyListScreen$1$1$1$7$1$1 myListScreenKt$MyListScreen$1$1$1$7$1$1 = new MyListScreenKt$MyListScreen$1$1$1$7$1$1(0, myListsViewModel2, MyListsViewModel.class, "onBoostedOffersClicked", "onBoostedOffersClicked()V", 0);
                                            composer2.A(myListScreenKt$MyListScreen$1$1$1$7$1$1);
                                            objG3 = myListScreenKt$MyListScreen$1$1$1$7$1$1;
                                        }
                                        composer2.l();
                                        BoostedOfferItemKt.a(0, composer2, null, (Function0) ((KFunction) objG3));
                                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(Modifier.Companion.d, 72, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1977861063), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LazyDslKt.b(null, null, paddingValuesImplB, false, null, null, null, false, null, (Function1) objG2, composerImplV, 0, 507);
            PullRefreshIndicatorKt.a(((MyListsContract.ViewState) mutableStateA.getD()).f12343a, pullRefreshStateA, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.b), 0L, 0L, composerImplV, 64, 56);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(filterOutWatchList, i) { // from class: au.com.woolworths.shop.lists.ui.lists.compose.b
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    MyListScreenKt.a(this.d, this.e, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
