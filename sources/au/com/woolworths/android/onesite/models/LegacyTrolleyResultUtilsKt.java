package au.com.woolworths.android.onesite.models;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityUpdated;
import au.com.woolworths.product.models.ProductId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"toLegacyResult", "Lau/com/woolworths/android/onesite/models/TrolleyResult;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantitiesUpdatedResponse;", "oldResult", "toLegacyItem", "Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantityUpdated;", "shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LegacyTrolleyResultUtilsKt {
    @NotNull
    public static final TrolleyResult.TrolleyItem toLegacyItem(@NotNull CartProductQuantityUpdated cartProductQuantityUpdated) {
        Intrinsics.h(cartProductQuantityUpdated, "<this>");
        TrolleyResult.TrolleyItem trolleyItem = new TrolleyResult.TrolleyItem();
        trolleyItem.setMArticle(cartProductQuantityUpdated.f8684a);
        trolleyItem.setItemQuantityInTrolley((float) cartProductQuantityUpdated.b);
        return trolleyItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @NotNull
    public static final TrolleyResult toLegacyResult(@NotNull CartProductQuantitiesUpdatedResponse cartProductQuantitiesUpdatedResponse, @Nullable TrolleyResult trolleyResult) {
        ?? arrayList;
        List<TrolleyResult.TrolleyItem> trolleyItems;
        Intrinsics.h(cartProductQuantitiesUpdatedResponse, "<this>");
        TrolleyResult trolleyResult2 = new TrolleyResult();
        Iterable iterable = (Iterable) cartProductQuantitiesUpdatedResponse.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(ProductId.INSTANCE.create(((CartProductQuantityUpdated) it.next()).f8684a));
        }
        Set setL0 = CollectionsKt.L0(arrayList2);
        if (trolleyResult != null) {
            trolleyResult2.setErrors(trolleyResult.getErrors());
            trolleyResult2.setMarketplaceProducts(trolleyResult.getMarketplaceProducts());
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList3.add(toLegacyItem((CartProductQuantityUpdated) it2.next()));
        }
        EmptyList emptyList = EmptyList.d;
        if (trolleyResult == null || (trolleyItems = trolleyResult.getTrolleyItems()) == null) {
            arrayList = emptyList;
        } else {
            arrayList = new ArrayList();
            for (Object obj : trolleyItems) {
                ProductId.Companion companion = ProductId.INSTANCE;
                String mArticle = ((TrolleyResult.TrolleyItem) obj).getMArticle();
                Intrinsics.e(mArticle);
                if (!setL0.contains(companion.create(mArticle))) {
                    arrayList.add(obj);
                }
            }
        }
        trolleyResult2.setTrolleyItems(CollectionsKt.c0(arrayList, arrayList3));
        trolleyResult2.setTotalProducts(trolleyResult2.getTrolleyItems().size());
        trolleyResult2.setErrors(emptyList);
        return trolleyResult2;
    }

    public static /* synthetic */ TrolleyResult toLegacyResult$default(CartProductQuantitiesUpdatedResponse cartProductQuantitiesUpdatedResponse, TrolleyResult trolleyResult, int i, Object obj) {
        if ((i & 1) != 0) {
            trolleyResult = null;
        }
        return toLegacyResult(cartProductQuantitiesUpdatedResponse, trolleyResult);
    }
}
