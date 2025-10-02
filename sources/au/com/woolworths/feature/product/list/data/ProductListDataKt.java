package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.foundation.advertising.data.adobe.model.AdobeTargetAnalytics;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductListByProductIdsApiData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0007¨\u0006\b"}, d2 = {"getTrackingMetadata", "Lau/com/woolworths/analytics/model/TrackingMetadata;", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "containsGoogleAds", "", "containsUniversalInventory", "toProductListData", "Lau/com/woolworths/product/models/ProductListByProductIdsApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListDataKt {
    public static final boolean containsGoogleAds(@NotNull ProductListData productListData) {
        Intrinsics.h(productListData, "<this>");
        List<Object> c = productListData.getC();
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof GoogleAdBannerCard) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsUniversalInventory(@NotNull ProductListData productListData) {
        Intrinsics.h(productListData, "<this>");
        List<Object> c = productListData.getC();
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof UniversalInventoryContainerData) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final TrackingMetadata getTrackingMetadata(@NotNull ProductListData productListData) {
        ArrayList arrayList;
        Intrinsics.h(productListData, "<this>");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.R1, Integer.valueOf(productListData.getD()));
        List<Object> c = productListData.getC();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof ProductCard) {
                arrayList2.add(obj);
            }
        }
        trackingMetadataA.a(ProductAnalyticsExtKt.f(arrayList2));
        List<Object> analytics = productListData.getAnalytics();
        if (analytics != null) {
            arrayList = new ArrayList();
            for (Object obj2 : analytics) {
                if (obj2 instanceof AdobeTargetAnalytics) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            TrackableValue trackableValue = TrackableValue.f;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((AdobeTargetAnalytics) it.next()).getPe());
            }
            trackingMetadataA.b(trackableValue, arrayList3);
            TrackableValue trackableValue2 = TrackableValue.g;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((AdobeTargetAnalytics) it2.next()).getTnta());
            }
            trackingMetadataA.b(trackableValue2, arrayList4);
        }
        return trackingMetadataA;
    }

    @NotNull
    public static final ProductListData toProductListData(@NotNull ProductListByProductIdsApiData productListByProductIdsApiData) {
        Intrinsics.h(productListByProductIdsApiData, "<this>");
        int size = productListByProductIdsApiData.getProducts().size();
        List<ProductCard> products = productListByProductIdsApiData.getProducts();
        EmptyList emptyList = EmptyList.d;
        return new ProductListData(products, null, null, size, null, emptyList, emptyList, null, null, null, null, null, null, null, null, null, null, 61312, null);
    }
}
