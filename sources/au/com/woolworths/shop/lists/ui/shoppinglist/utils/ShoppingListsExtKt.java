package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.product.models.ProductCategory;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.data.prefs.SortDirection;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SortDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SortDirection sortDirection = SortDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SortBy.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SortBy sortBy = SortBy.f;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SortBy sortBy2 = SortBy.f;
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SortBy sortBy3 = SortBy.f;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                SortBy sortBy4 = SortBy.f;
                iArr2[0] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final String a(ProductItemUiModel productItemUiModel, int i) {
        String name;
        ProductCard productCard = productItemUiModel.i;
        List<ProductCategory> categories = productCard != null ? productCard.getCategories() : null;
        List<ProductCategory> list = categories;
        if (list == null || list.isEmpty()) {
            return "Other";
        }
        Integer categoryLevel = categories.get(0).getCategoryLevel();
        if (categoryLevel == null || categoryLevel.intValue() != i) {
            return (categories.size() <= 1 || (name = categories.get(1).getName()) == null) ? "Other" : name;
        }
        String name2 = categories.get(0).getName();
        return name2 == null ? "Other" : name2;
    }

    public static final boolean b(ProductItemUiModel productItemUiModel) {
        String instoreLocationText;
        ProductCard productCard = productItemUiModel.i;
        if (productCard == null || (instoreLocationText = ProductCardKt.getInstoreLocationText(productCard)) == null) {
            return false;
        }
        return !StringsKt.D(instoreLocationText);
    }

    public static final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ProductCard productCard = ((ProductItemUiModel) obj).i;
            if (productCard != null && productCard.isAvailable()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final ArrayList d(ShoppingListDetailsUiModel shoppingListDetailsUiModel, ArrayList arrayList) {
        Intrinsics.h(shoppingListDetailsUiModel, "<this>");
        List list = shoppingListDetailsUiModel.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (arrayList.contains(((ProductItemUiModel) obj).g)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ProductCard productCard = ((ProductItemUiModel) it.next()).i;
            if (productCard == null) {
                throw new IllegalStateException("Product in List item cannot be null!");
            }
            arrayList3.add(productCard);
        }
        return arrayList3;
    }

    public static final boolean e(ProductCard productCard) {
        return productCard != null && productCard.getTagLabel() == null && productCard.isAvailable();
    }

    public static final List f(ArrayList arrayList, SortBy sortBy, SortDirection sortDirection) {
        Comparator comparator;
        Comparator shoppingListsExtKt$sortByAlphabetic$$inlined$compareBy$1;
        Comparator comparator2;
        Comparator comparator3;
        int iOrdinal = sortBy.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = sortDirection.ordinal();
            if (iOrdinal2 == 0) {
                final ShoppingListsExtKt$sortByCategory$$inlined$thenBy$2 shoppingListsExtKt$sortByCategory$$inlined$thenBy$2 = new ShoppingListsExtKt$sortByCategory$$inlined$thenBy$2(new ShoppingListsExtKt$sortByCategory$$inlined$thenBy$1(new ShoppingListsExtKt$sortByCategory$$inlined$compareBy$1()));
                comparator = new Comparator() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt$sortByCategory$$inlined$thenBy$3
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        String name;
                        String name2;
                        int iCompare = shoppingListsExtKt$sortByCategory$$inlined$thenBy$2.compare(obj, obj2);
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        ProductCard productCard = ((ProductItemUiModel) obj).i;
                        String str = "";
                        if (productCard == null || (name = productCard.getName()) == null) {
                            name = "";
                        }
                        ProductCard productCard2 = ((ProductItemUiModel) obj2).i;
                        if (productCard2 != null && (name2 = productCard2.getName()) != null) {
                            str = name2;
                        }
                        return ComparisonsKt.a(name, str);
                    }
                };
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                final ShoppingListsExtKt$sortByCategory$$inlined$thenByDescending$1 shoppingListsExtKt$sortByCategory$$inlined$thenByDescending$1 = new ShoppingListsExtKt$sortByCategory$$inlined$thenByDescending$1(new ShoppingListsExtKt$sortByCategory$$inlined$thenBy$4(new ShoppingListsExtKt$sortByCategory$$inlined$compareByDescending$1()));
                comparator = new Comparator() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt$sortByCategory$$inlined$thenByDescending$2
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        String name;
                        String name2;
                        int iCompare = shoppingListsExtKt$sortByCategory$$inlined$thenByDescending$1.compare(obj, obj2);
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        ProductCard productCard = ((ProductItemUiModel) obj2).i;
                        String str = "";
                        if (productCard == null || (name = productCard.getName()) == null) {
                            name = "";
                        }
                        ProductCard productCard2 = ((ProductItemUiModel) obj).i;
                        if (productCard2 != null && (name2 = productCard2.getName()) != null) {
                            str = name2;
                        }
                        return ComparisonsKt.a(name, str);
                    }
                };
            }
            return CollectionsKt.u0(comparator, arrayList);
        }
        if (iOrdinal == 1) {
            int iOrdinal3 = sortDirection.ordinal();
            if (iOrdinal3 == 0) {
                return CollectionsKt.u0(new ShoppingListsExtKt$sort$$inlined$sortedBy$1(), arrayList);
            }
            if (iOrdinal3 == 1) {
                return CollectionsKt.u0(new ShoppingListsExtKt$sort$$inlined$sortedByDescending$1(), arrayList);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (iOrdinal == 2) {
            int iOrdinal4 = sortDirection.ordinal();
            if (iOrdinal4 == 0) {
                shoppingListsExtKt$sortByAlphabetic$$inlined$compareBy$1 = new ShoppingListsExtKt$sortByAlphabetic$$inlined$compareBy$1();
            } else {
                if (iOrdinal4 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                shoppingListsExtKt$sortByAlphabetic$$inlined$compareBy$1 = new ShoppingListsExtKt$sortByAlphabetic$$inlined$compareByDescending$1();
            }
            return CollectionsKt.u0(shoppingListsExtKt$sortByAlphabetic$$inlined$compareBy$1, arrayList);
        }
        if (iOrdinal == 3) {
            int iOrdinal5 = sortDirection.ordinal();
            if (iOrdinal5 == 0) {
                final ShoppingListsExtKt$sortBySpecials$$inlined$thenBy$2 shoppingListsExtKt$sortBySpecials$$inlined$thenBy$2 = new ShoppingListsExtKt$sortBySpecials$$inlined$thenBy$2(new ShoppingListsExtKt$sortBySpecials$$inlined$thenBy$1(new ShoppingListsExtKt$sortBySpecials$$inlined$compareBy$1()));
                comparator2 = new Comparator() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt$sortBySpecials$$inlined$thenBy$3
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iCompare = shoppingListsExtKt$sortBySpecials$$inlined$thenBy$2.compare(obj, obj2);
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        ProductCard productCard = ((ProductItemUiModel) obj).i;
                        String name = productCard != null ? productCard.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        ProductCard productCard2 = ((ProductItemUiModel) obj2).i;
                        String name2 = productCard2 != null ? productCard2.getName() : null;
                        return ComparisonsKt.a(name, name2 != null ? name2 : "");
                    }
                };
            } else {
                if (iOrdinal5 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                final ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$2 shoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$2 = new ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$2(new ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$1(new ShoppingListsExtKt$sortBySpecials$$inlined$compareByDescending$1()));
                comparator2 = new Comparator() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$3
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iCompare = shoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$2.compare(obj, obj2);
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        ProductCard productCard = ((ProductItemUiModel) obj2).i;
                        String name = productCard != null ? productCard.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        ProductCard productCard2 = ((ProductItemUiModel) obj).i;
                        String name2 = productCard2 != null ? productCard2.getName() : null;
                        return ComparisonsKt.a(name, name2 != null ? name2 : "");
                    }
                };
            }
            return CollectionsKt.u0(comparator2, arrayList);
        }
        if (iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal6 = sortDirection.ordinal();
        if (iOrdinal6 == 0) {
            final ShoppingListsExtKt$sortByAisle$$inlined$thenBy$1 shoppingListsExtKt$sortByAisle$$inlined$thenBy$1 = new ShoppingListsExtKt$sortByAisle$$inlined$thenBy$1(new LocationTextComparator());
            comparator3 = new Comparator() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt$sortByAisle$$inlined$thenBy$2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    String name;
                    String name2;
                    int iCompare = shoppingListsExtKt$sortByAisle$$inlined$thenBy$1.compare(obj, obj2);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    ProductCard productCard = ((ProductItemUiModel) obj).i;
                    String str = "";
                    if (productCard == null || (name = productCard.getName()) == null) {
                        name = "";
                    }
                    ProductCard productCard2 = ((ProductItemUiModel) obj2).i;
                    if (productCard2 != null && (name2 = productCard2.getName()) != null) {
                        str = name2;
                    }
                    return ComparisonsKt.a(name, str);
                }
            };
        } else {
            if (iOrdinal6 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Comparator<ProductItemUiModel> comparatorReversed = new LocationTextComparator().reversed();
            Intrinsics.g(comparatorReversed, "reversed(...)");
            final ShoppingListsExtKt$sortByAisle$$inlined$thenBy$3 shoppingListsExtKt$sortByAisle$$inlined$thenBy$3 = new ShoppingListsExtKt$sortByAisle$$inlined$thenBy$3(comparatorReversed);
            comparator3 = new Comparator() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt$sortByAisle$$inlined$thenByDescending$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    String name;
                    String name2;
                    int iCompare = shoppingListsExtKt$sortByAisle$$inlined$thenBy$3.compare(obj, obj2);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    ProductCard productCard = ((ProductItemUiModel) obj2).i;
                    String str = "";
                    if (productCard == null || (name = productCard.getName()) == null) {
                        name = "";
                    }
                    ProductCard productCard2 = ((ProductItemUiModel) obj).i;
                    if (productCard2 != null && (name2 = productCard2.getName()) != null) {
                        str = name2;
                    }
                    return ComparisonsKt.a(name, str);
                }
            };
        }
        return CollectionsKt.u0(comparator3, arrayList);
    }

    public static final ShoppingListDetailsUiModel g(ShoppingListDetailsUiModel shoppingListDetailsUiModel, TrolleyInteractor trolleyInteractor, Result result, CoroutineContext coroutineContext) throws Throwable {
        Object next;
        List list = shoppingListDetailsUiModel.b;
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(coroutineContext, "coroutineContext");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (result == null) {
            try {
                BuildersKt.d(coroutineContext, new ShoppingListsExtKt$toTrolleyData$1(objectRef, trolleyInteractor, null));
            } catch (InterruptedException e) {
                Timber.f27013a.p(e);
            }
        } else if (result.b()) {
            objectRef.d = result.f4591a;
        }
        TrolleyResult trolleyResult = (TrolleyResult) objectRef.d;
        if (trolleyResult == null) {
            return shoppingListDetailsUiModel;
        }
        List<ProductItemUiModel> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ProductCard productCard = ((ProductItemUiModel) it.next()).i;
            if (productCard != null) {
                arrayList.add(productCard);
            }
        }
        ArrayList arrayListC = ProductListFeedTrolleyUpdater.c(arrayList, trolleyResult);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        for (ProductItemUiModel productItemUiModel : list2) {
            ProductCard productCard2 = productItemUiModel.i;
            Iterator it2 = arrayListC.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.c(((ProductCard) next).getProductId(), productCard2 != null ? productCard2.getProductId() : null)) {
                    break;
                }
            }
            ProductCard productCardCopy = (ProductCard) next;
            if (productCardCopy != null) {
                ProductTrolleyData trolley = productCardCopy.getTrolley();
                if (Intrinsics.c(trolley != null ? trolley.getButtonLabel() : null, "Update")) {
                    ProductTrolleyData trolley2 = productCardCopy.getTrolley();
                    Intrinsics.e(trolley2);
                    productCardCopy = productCardCopy.copy(((-33554433) & 1) != 0 ? productCardCopy.productId : null, ((-33554433) & 2) != 0 ? productCardCopy.name : null, ((-33554433) & 4) != 0 ? productCardCopy.productImage : null, ((-33554433) & 8) != 0 ? productCardCopy.badgeImage : null, ((-33554433) & 16) != 0 ? productCardCopy.price : null, ((-33554433) & 32) != 0 ? productCardCopy.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCardCopy.promotionValue : null, ((-33554433) & 128) != 0 ? productCardCopy.promotionType : null, ((-33554433) & 256) != 0 ? productCardCopy.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCardCopy.isAvailable : false, ((-33554433) & 1024) != 0 ? productCardCopy.isNew : false, ((-33554433) & 2048) != 0 ? productCardCopy.wasPrice : null, ((-33554433) & 4096) != 0 ? productCardCopy.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCardCopy.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCardCopy.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCardCopy.trolley : trolley2.copy((895 & 1) != 0 ? trolley2.minimum : 0.0d, (895 & 2) != 0 ? trolley2.maximum : 0.0d, (895 & 4) != 0 ? trolley2.increment : 0.0d, (895 & 8) != 0 ? trolley2.defaultValue : 0.0d, (895 & 16) != 0 ? trolley2.inTrolley : null, (895 & 32) != 0 ? trolley2.unitLabel : null, (895 & 64) != 0 ? trolley2.buttonState : null, (895 & 128) != 0 ? trolley2.buttonLabel : "Update Cart", (895 & 256) != 0 ? trolley2.buttonQuantity : null, (895 & 512) != 0 ? trolley2.title : null), ((-33554433) & 65536) != 0 ? productCardCopy.trolleys : null, ((-33554433) & 131072) != 0 ? productCardCopy.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCardCopy.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCardCopy.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCardCopy.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCardCopy.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCardCopy.adId : null, ((-33554433) & 8388608) != 0 ? productCardCopy.source : null, ((-33554433) & 16777216) != 0 ? productCardCopy.marketplace : null, ((-33554433) & 33554432) != 0 ? productCardCopy.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCardCopy.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCardCopy.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCardCopy.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCardCopy.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCardCopy.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCardCopy.isTobacco : false, (255 & 1) != 0 ? productCardCopy.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCardCopy.memberPriceInfo : null, (255 & 4) != 0 ? productCardCopy.cartProductInfo : null, (255 & 8) != 0 ? productCardCopy.inStoreLocation : null, (255 & 16) != 0 ? productCardCopy.productCardAnalytics : null, (255 & 32) != 0 ? productCardCopy.impressionAnalyticsData : null, (255 & 64) != 0 ? productCardCopy.productCardAction : null, (255 & 128) != 0 ? productCardCopy.pricingFootnoteMd : null);
                }
            } else {
                productCardCopy = null;
            }
            arrayList2.add(ProductItemUiModel.a(productItemUiModel, false, productCardCopy, false, false, false, false, false, null, null, 65279));
        }
        return ShoppingListDetailsUiModel.a(shoppingListDetailsUiModel, arrayList2, null, 5);
    }

    public static final ShoppingListDetailsUiModel h(ShoppingListDetailsUiModel shoppingListDetailsUiModel, CloseableCoroutineScope closeableCoroutineScope, ShoppingListItemInteractor shoppingListItemInteractor, List updateProductsWithOffersInfo) {
        Object next;
        Intrinsics.h(shoppingListItemInteractor, "shoppingListItemInteractor");
        Intrinsics.h(updateProductsWithOffersInfo, "updateProductsWithOffersInfo");
        List list = shoppingListDetailsUiModel.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (true) {
            ProductCard productCard = null;
            if (!it.hasNext()) {
                return ShoppingListDetailsUiModel.a(shoppingListDetailsUiModel, arrayList, null, 5);
            }
            ProductItemUiModel productItemUiModelA = (ProductItemUiModel) it.next();
            ProductCard productCard2 = productItemUiModelA.i;
            if (productCard2 != null) {
                Iterator it2 = updateProductsWithOffersInfo.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.c(((ProductCard) next).getProductId(), productCard2.getProductId())) {
                        break;
                    }
                }
                ProductCard productCard3 = (ProductCard) next;
                if (productCard3 != null) {
                    ProductCard productCardCopy = productCard2.copy(((-33554433) & 1) != 0 ? productCard2.productId : null, ((-33554433) & 2) != 0 ? productCard2.name : null, ((-33554433) & 4) != 0 ? productCard2.productImage : null, ((-33554433) & 8) != 0 ? productCard2.badgeImage : null, ((-33554433) & 16) != 0 ? productCard2.price : null, ((-33554433) & 32) != 0 ? productCard2.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCard2.promotionValue : null, ((-33554433) & 128) != 0 ? productCard2.promotionType : null, ((-33554433) & 256) != 0 ? productCard2.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCard2.isAvailable : false, ((-33554433) & 1024) != 0 ? productCard2.isNew : false, ((-33554433) & 2048) != 0 ? productCard2.wasPrice : null, ((-33554433) & 4096) != 0 ? productCard2.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCard2.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCard2.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCard2.trolley : null, ((-33554433) & 65536) != 0 ? productCard2.trolleys : null, ((-33554433) & 131072) != 0 ? productCard2.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCard2.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCard2.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCard2.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCard2.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCard2.adId : null, ((-33554433) & 8388608) != 0 ? productCard2.source : null, ((-33554433) & 16777216) != 0 ? productCard2.marketplace : null, ((-33554433) & 33554432) != 0 ? productCard2.rewardsOfferInfo : productCard3.getRewardsOfferInfo(), ((-33554433) & 67108864) != 0 ? productCard2.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCard2.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCard2.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCard2.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCard2.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCard2.isTobacco : false, (255 & 1) != 0 ? productCard2.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCard2.memberPriceInfo : null, (255 & 4) != 0 ? productCard2.cartProductInfo : null, (255 & 8) != 0 ? productCard2.inStoreLocation : null, (255 & 16) != 0 ? productCard2.productCardAnalytics : null, (255 & 32) != 0 ? productCard2.impressionAnalyticsData : null, (255 & 64) != 0 ? productCard2.productCardAction : null, (255 & 128) != 0 ? productCard2.pricingFootnoteMd : null);
                    BuildersKt.c(closeableCoroutineScope, null, null, new ShoppingListsExtKt$updateProductItem$updatedProductCard$2$1(shoppingListItemInteractor, productCardCopy, null), 3);
                    productCard = productCardCopy;
                }
                productItemUiModelA = ProductItemUiModel.a(productItemUiModelA, false, productCard == null ? productCard2 : productCard, false, false, false, false, false, null, null, 65279);
            }
            arrayList.add(productItemUiModelA);
        }
    }
}
