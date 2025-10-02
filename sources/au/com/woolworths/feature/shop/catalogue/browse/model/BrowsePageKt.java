package au.com.woolworths.feature.shop.catalogue.browse.model;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BrowsePageKt {
    public static final TrackingMetadata a(BrowsePage.Category category) {
        Intrinsics.h(category, "<this>");
        List list = category.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof BrowsePageHeader) {
                arrayList.add(obj);
            }
        }
        BrowsePageHeader browsePageHeader = (BrowsePageHeader) CollectionsKt.F(arrayList);
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.C1, Integer.valueOf(category.b));
        if (browsePageHeader != null) {
            trackingMetadataA.b(TrackableValue.o0, browsePageHeader.f6809a);
        }
        return trackingMetadataA;
    }
}
