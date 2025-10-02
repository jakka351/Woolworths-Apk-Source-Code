package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/BoostExt;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BoostExt {

    /* renamed from: a, reason: collision with root package name */
    public final ProductBoostInteractor f12375a;
    public final TrolleyInteractor b;
    public final CartUpdateInteractor c;
    public final ListsInMemoryRepository d;

    public BoostExt(ProductBoostInteractor productBoostInteractor, TrolleyInteractor trolleyInteractor, CartUpdateInteractor cartUpdater, ListsInMemoryRepository listsInMemoryRepository) {
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(cartUpdater, "cartUpdater");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        this.f12375a = productBoostInteractor;
        this.b = trolleyInteractor;
        this.c = cartUpdater;
        this.d = listsInMemoryRepository;
    }

    public static List b(ShoppingListDetailsUiModel shoppingListDetailsUiModel) {
        if (shoppingListDetailsUiModel == null) {
            return EmptyList.d;
        }
        List list = shoppingListDetailsUiModel.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductCard productCard = ((ProductItemUiModel) it.next()).i;
            if (productCard != null) {
                arrayList.add(productCard);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            RewardsOfferInfo rewardsOfferInfo = ((ProductCard) next).getRewardsOfferInfo();
            if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.NOT_ACTIVATED) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostExt.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
