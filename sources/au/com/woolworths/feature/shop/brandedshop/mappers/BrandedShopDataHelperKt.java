package au.com.woolworths.feature.shop.brandedshop.mappers;

import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopFeedItem;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopProductGridConfig;
import au.com.woolworths.feature.shop.brandedshop.data.ItemKey;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.product.ProductSectionData;
import au.com.woolworths.shop.aem.components.model.tab.TabSectionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BrandedShopDataHelperKt {
    public static final BrandedShopProductGridConfig a(ArrayList arrayList, boolean z, boolean z2) {
        Iterator it = arrayList.iterator();
        boolean z3 = false;
        boolean zS = false;
        boolean z4 = false;
        while (it.hasNext()) {
            ProductCard productCard = (ProductCard) it.next();
            if (!z3) {
                ProductMultiBuyLabel productMultiBuyLabel = ProductMultiBuyLabel.e;
                z3 = ProductCardExtKt.z(productCard, productMultiBuyLabel) || ProductCardExtKt.w(productCard, productMultiBuyLabel);
            }
            if (!zS) {
                zS = ProductCardExtKt.s(productCard);
            }
            if (!z4) {
                z4 = productCard.getMemberPriceInfo() != null;
            }
        }
        return new BrandedShopProductGridConfig(z, z3, zS, z4, z2);
    }

    public static final LinkedHashMap b(BrandedShopData brandedShopData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : brandedShopData.c) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            if (((GenericPageFeedItem) obj) instanceof TabSectionData) {
                linkedHashMap.put(new ItemKey.TabHeader(i).getKey(), 0);
            }
            i = i2;
        }
        return linkedHashMap;
    }

    public static final void c(ArrayList arrayList, int i, Integer num, ProductSectionData productSectionData) {
        List list = productSectionData.d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductCard) {
                arrayList2.add(obj);
            }
        }
        arrayList.add(new BrandedShopFeedItem.BrandedShopProductSectionImpression(new ItemKey.ProductSection(i).getKey(), productSectionData));
        ArrayList arrayListO0 = CollectionsKt.O0(arrayList2, 2, 2);
        Iterator it = arrayListO0.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            arrayList.add(new BrandedShopFeedItem.BrandedShopHorizontalDivider(new ItemKey.Divider(i, num, Integer.valueOf(i2)).getKey(), 0));
            arrayList.add(new BrandedShopFeedItem.BrandedShopProductRow(new ItemKey.ProductCardRow(i, num, Integer.valueOf(i2)).getKey(), (List) next));
            i2 = i3;
        }
        int size = arrayListO0.size();
        if (size != 0) {
            arrayList.add(new BrandedShopFeedItem.BrandedShopHorizontalDivider(new ItemKey.Divider(i, num, Integer.valueOf(size)).getKey(), 8));
        }
        LinkData linkData = productSectionData.c;
        if (linkData != null) {
            arrayList.add(new BrandedShopFeedItem.BrandedShopLink(new ItemKey.Link(i, num).getKey(), linkData, true));
        }
    }
}
