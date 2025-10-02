package com.woolworths.shop.product.navigation;

import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceCategoriesInfo;
import au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceProductCategoryList;
import com.woolworths.shop.product.navigation.MarketplaceCategoryQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MarketplaceCategoryQueryProductCategories1769328528ExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static final MarketplaceProductCategoryList a(MarketplaceCategoryQuery.ProductCategories productCategories) {
        ?? arrayList;
        Intrinsics.h(productCategories, "<this>");
        String str = productCategories.f23607a;
        List list = productCategories.b;
        if (list != null) {
            ArrayList arrayListB = CollectionsKt.B(list);
            arrayList = new ArrayList(CollectionsKt.s(arrayListB, 10));
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                MarketplaceCategoryQuery.Category category = (MarketplaceCategoryQuery.Category) it.next();
                Intrinsics.h(category, "<this>");
                arrayList.add(new ProductCategory(category.f23604a, category.b, category.d, category.c, category.e, category.f));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        MarketplaceCategoryQuery.Marketplace marketplace = productCategories.c;
        return new MarketplaceProductCategoryList(str, arrayList, new MarketplaceCategoriesInfo(marketplace.f23606a, marketplace.b));
    }
}
