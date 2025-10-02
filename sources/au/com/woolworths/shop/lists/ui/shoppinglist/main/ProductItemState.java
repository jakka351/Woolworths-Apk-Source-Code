package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyResultExtKt;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.model.ProductListItem;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.data.model.TextListItem;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ProductItemState;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListProductItemState;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductItemState implements ShoppingListProductItemState {

    /* renamed from: a, reason: collision with root package name */
    public final TrolleyInteractor f12378a;
    public final ListsInMemoryRepository b;
    public final FeatureToggleManager c;

    public ProductItemState(TrolleyInteractor trolleyInteractor, ListsInMemoryRepository listsInMemoryRepository, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f12378a = trolleyInteractor;
        this.b = listsInMemoryRepository;
        this.c = featureToggleManager;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState
    public final boolean a(ProductCard productCard) {
        InStoreAvailabilityInfo inStoreAvailabilityInfo;
        if (productCard != null && productCard.isTobacco()) {
            return false;
        }
        if (this.b.g()) {
            return Intrinsics.c((productCard == null || (inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo()) == null) ? null : inStoreAvailabilityInfo.getStatus(), "UNAVAILABLE");
        }
        return (ShoppingListsExtKt.e(productCard) || e(productCard)) ? false : true;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState
    public final boolean b(ProductId productId, float f) {
        TrolleyResult.TrolleyItem trolleyItem;
        List<TrolleyResult.TrolleyItem> allGroceryAndMarketItems;
        Object next;
        Intrinsics.h(productId, "productId");
        TrolleyInteractor trolleyInteractor = this.f12378a;
        Intrinsics.h(trolleyInteractor, "<this>");
        TrolleyResult trolleyResult = (TrolleyResult) ((Result) trolleyInteractor.getP().getValue()).f4591a;
        if (trolleyResult == null || (allGroceryAndMarketItems = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult)) == null) {
            trolleyItem = null;
        } else {
            Iterator<T> it = allGroceryAndMarketItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.c(ProductId.INSTANCE.create(((TrolleyResult.TrolleyItem) next).getArticle()), productId)) {
                    break;
                }
            }
            trolleyItem = (TrolleyResult.TrolleyItem) next;
        }
        return !Intrinsics.b(trolleyItem != null ? Float.valueOf(trolleyItem.getItemQuantityInTrolley()) : null, f);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState
    public final boolean c(ProductCard productCard) {
        return (ShoppingListsExtKt.e(productCard) || e(productCard)) ? false : true;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState
    public final boolean d(ProductCard productCard) {
        return !this.b.g() && ShoppingListsExtKt.e(productCard);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState
    public final boolean e(ProductCard productCard) {
        InStoreAvailabilityInfo inStoreAvailabilityInfo;
        return this.b.g() && Intrinsics.c((productCard == null || (inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo()) == null) ? null : inStoreAvailabilityInfo.getStatus(), "SEE_IN_STORE");
    }

    public final ShoppingListDetailsUiModel f(ShoppingListWithItems listWithItems) {
        Intrinsics.h(listWithItems, "listWithItems");
        ShoppingList shoppingList = listWithItems.getShoppingList();
        List<ProductListItem> productItems = listWithItems.getProductItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(productItems, 10));
        for (ProductListItem item : productItems) {
            Intrinsics.h(item, "item");
            ProductItemUiModel productItemUiModel = new ProductItemUiModel(item.getId(), item.getListId(), item.getCreatedAt(), item.getUpdatedAt(), item.isChecked(), item.getProductId(), item.getQuantity(), item.getProduct(), 65056);
            g(productItemUiModel);
            arrayList.add(productItemUiModel);
        }
        List<TextListItem> textItems = listWithItems.getTextItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(textItems, 10));
        for (TextListItem item2 : textItems) {
            Intrinsics.h(item2, "item");
            arrayList2.add(new TextItemUiModel(item2.getId(), item2.getListId(), item2.getCreatedAt(), item2.getUpdatedAt(), item2.isChecked(), item2.getText(), 32));
        }
        return new ShoppingListDetailsUiModel(shoppingList, arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel g(au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "uiModel"
            kotlin.jvm.internal.Intrinsics.h(r14, r0)
            au.com.woolworths.product.models.ProductCard r0 = r14.i
            if (r0 == 0) goto Lc
            r1 = 1
        La:
            r3 = r1
            goto Le
        Lc:
            r1 = 0
            goto La
        Le:
            au.com.woolworths.product.models.ProductId r1 = r14.g
            float r2 = r14.h
            boolean r5 = r13.b(r1, r2)
            boolean r6 = r13.d(r0)
            boolean r7 = r13.a(r0)
            boolean r8 = r13.e(r0)
            boolean r9 = r13.c(r0)
            if (r0 == 0) goto L39
            au.com.woolworths.product.models.ProductTrolleyData r0 = r0.getTrolley()
            if (r0 == 0) goto L33
            java.lang.String r0 = r0.getButtonLabel()
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 != 0) goto L37
            goto L39
        L37:
            r10 = r0
            goto L3c
        L39:
            java.lang.String r0 = ""
            goto L37
        L3c:
            r11 = 0
            r12 = 33247(0x81df, float:4.6589E-41)
            r4 = 0
            r2 = r14
            au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel r14 = au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ProductItemState.g(au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel):au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel");
    }
}
