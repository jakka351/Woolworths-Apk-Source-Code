package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"getTrackingMetadata", "Lau/com/woolworths/analytics/model/TrackingMetadata;", "", "Lau/com/woolworths/feature/product/list/data/IngredientCardApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class IngredientCardApiDataKt {
    @NotNull
    public static final TrackingMetadata getTrackingMetadata(@NotNull List<IngredientCardApiData> list) {
        Intrinsics.h(list, "<this>");
        TrackableValue trackableValue = TrackableValue.B0;
        List<IngredientCardApiData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((IngredientCardApiData) it.next()).getIngredientDetails());
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, arrayList);
        TrackableValue trackableValue2 = TrackableValue.A0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((IngredientCardApiData) it2.next()).getAnalytics().getLabel());
        }
        trackingMetadataA.b(trackableValue2, arrayList2);
        return trackingMetadataA;
    }
}
