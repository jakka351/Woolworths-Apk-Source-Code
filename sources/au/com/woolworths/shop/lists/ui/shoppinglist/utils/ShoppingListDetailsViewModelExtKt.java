package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyResultExtKt;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.woolworths.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListDetailsViewModelExtKt {
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea A[Catch: HttpException -> 0x0127, NoConnectivityException -> 0x013e, TryCatch #1 {HttpException -> 0x0127, blocks: (B:12:0x0031, B:44:0x00d3, B:46:0x00ea, B:48:0x00f0, B:50:0x00f6, B:52:0x0111, B:47:0x00ef), top: B:61:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef A[Catch: HttpException -> 0x0127, NoConnectivityException -> 0x013e, TryCatch #1 {HttpException -> 0x0127, blocks: (B:12:0x0031, B:44:0x00d3, B:46:0x00ea, B:48:0x00f0, B:50:0x00f6, B:52:0x0111, B:47:0x00ef), top: B:61:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6 A[Catch: HttpException -> 0x0127, NoConnectivityException -> 0x013e, TryCatch #1 {HttpException -> 0x0127, blocks: (B:12:0x0031, B:44:0x00d3, B:46:0x00ea, B:48:0x00f0, B:50:0x00f6, B:52:0x0111, B:47:0x00ef), top: B:61:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111 A[Catch: HttpException -> 0x0127, NoConnectivityException -> 0x013e, TRY_LEAVE, TryCatch #1 {HttpException -> 0x0127, blocks: (B:12:0x0031, B:44:0x00d3, B:46:0x00ea, B:48:0x00f0, B:50:0x00f6, B:52:0x0111, B:47:0x00ef), top: B:61:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor r18, au.com.woolworths.android.onesite.rxutils.Result r19, java.util.List r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListDetailsViewModelExtKt.a(au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor, au.com.woolworths.android.onesite.rxutils.Result, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor r16, au.com.woolworths.android.onesite.rxutils.Result r17, au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListDetailsViewModelExtKt.b(au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor, au.com.woolworths.android.onesite.rxutils.Result, au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final int c(Result result, List list) {
        Iterable allGroceryAndMarketItems;
        TrolleyResult trolleyResult = (TrolleyResult) result.f4591a;
        if (trolleyResult == null || (allGroceryAndMarketItems = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult)) == null) {
            allGroceryAndMarketItems = EmptyList.d;
        }
        Iterable<TrolleyResult.TrolleyItem> iterable = allGroceryAndMarketItems;
        int iH = MapsKt.h(CollectionsKt.s(iterable, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (TrolleyResult.TrolleyItem trolleyItem : iterable) {
            linkedHashMap.put(trolleyItem.getArticle(), Float.valueOf(trolleyItem.getItemQuantityInTrolley()));
        }
        List<ProductItemUiModel> list2 = list;
        int i = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (ProductItemUiModel productItemUiModel : list2) {
                if (Intrinsics.b((Float) linkedHashMap.get(productItemUiModel.g.getValue()), productItemUiModel.h) && (i = i + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        return list.size() - i;
    }

    public static final Integer d(TrolleyResult trolleyResult, TrolleyResult trolleyResult2) {
        if (trolleyResult == null || trolleyResult2 == null) {
            return null;
        }
        List<TrolleyResult.TrolleyItem> allGroceryAndMarketItems = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult);
        int iH = MapsKt.h(CollectionsKt.s(allGroceryAndMarketItems, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (TrolleyResult.TrolleyItem trolleyItem : allGroceryAndMarketItems) {
            linkedHashMap.put(trolleyItem.getArticle(), Float.valueOf(trolleyItem.getItemQuantityInTrolley()));
        }
        List<TrolleyResult.TrolleyItem> allGroceryAndMarketItems2 = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult2);
        int i = 0;
        if (!(allGroceryAndMarketItems2 instanceof Collection) || !allGroceryAndMarketItems2.isEmpty()) {
            for (TrolleyResult.TrolleyItem trolleyItem2 : allGroceryAndMarketItems2) {
                Float f = (Float) linkedHashMap.get(trolleyItem2.getArticle());
                if (f == null || !Intrinsics.b(f, trolleyItem2.getItemQuantityInTrolley())) {
                    i++;
                    if (i < 0) {
                        CollectionsKt.y0();
                        throw null;
                    }
                }
            }
        }
        return Integer.valueOf(i);
    }

    public static final Reporting e(int i) {
        if (i == 0) {
            return new Reporting(new ResText(R.string.shop_lists_add_all_to_cart_already_in_cart), "All list items are already in your cart");
        }
        return new Reporting(new PluralResText(R.plurals.shop_lists_add_all_to_cart_success_message, i), i + " product added to cart");
    }

    public static final Reporting f(Result result, Result result2, ProductItemUiModel productItemUiModel) {
        TrolleyResult trolleyResult;
        Object obj;
        Object next;
        Reporting reporting = new Reporting(new PluralResText(R.plurals.shop_lists_add_all_to_cart_failure_message, 1), EventDescription.a(1));
        TrolleyResult trolleyResult2 = (TrolleyResult) result.f4591a;
        if (trolleyResult2 != null && (trolleyResult = (TrolleyResult) result2.f4591a) != null) {
            Iterator<T> it = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult2).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.c(ProductId.INSTANCE.create(((TrolleyResult.TrolleyItem) next).getArticle()), productItemUiModel.g)) {
                    break;
                }
            }
            TrolleyResult.TrolleyItem trolleyItem = (TrolleyResult.TrolleyItem) next;
            Iterator<T> it2 = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.c(ProductId.INSTANCE.create(((TrolleyResult.TrolleyItem) next2).getArticle()), productItemUiModel.g)) {
                    obj = next2;
                    break;
                }
            }
            TrolleyResult.TrolleyItem trolleyItem2 = (TrolleyResult.TrolleyItem) obj;
            if (trolleyItem == null && trolleyItem2 == null) {
                return new Reporting(new PluralResText(R.plurals.shop_lists_add_all_to_cart_failure_message, 1), EventDescription.a(1));
            }
            if (trolleyItem == null && trolleyItem2 != null) {
                return new Reporting(new ResText(R.string.shop_lists_add_product_to_cart_added), "1 product added to cart");
            }
            if (trolleyItem != null && trolleyItem2 != null) {
                return trolleyItem.getItemQuantityInTrolley() == trolleyItem2.getItemQuantityInTrolley() ? new Reporting(new ResText(R.string.shop_lists_add_product_to_cart_already_in_cart), "Product is already in your cart") : new Reporting(new ResText(R.string.shop_lists_update_product_to_cart_quantity_updated), "Quantity updated in cart");
            }
        }
        return reporting;
    }
}
