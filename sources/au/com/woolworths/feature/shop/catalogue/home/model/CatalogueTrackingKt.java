package au.com.woolworths.feature.shop.catalogue.home.model;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueTrackingKt {
    public static final TrackingMetadata a(CatalogueTracking catalogueTracking) {
        Intrinsics.h(catalogueTracking, "<this>");
        String str = catalogueTracking.k;
        String str2 = catalogueTracking.j;
        String str3 = catalogueTracking.g;
        String str4 = catalogueTracking.i;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.x, catalogueTracking.d);
        trackingMetadataA.b(TrackableValue.y, catalogueTracking.e);
        trackingMetadataA.b(TrackableValue.J, catalogueTracking.f);
        String str5 = catalogueTracking.h;
        if (!StringsKt.D(str5)) {
            trackingMetadataA.b(TrackableValue.G, str5);
        }
        if (!StringsKt.D(str4)) {
            trackingMetadataA.b(TrackableValue.w, str4);
        }
        if (!StringsKt.D(str3)) {
            trackingMetadataA.b(TrackableValue.E, str3);
        }
        if (!StringsKt.D(str2)) {
            trackingMetadataA.b(TrackableValue.v, str2);
        }
        if (!StringsKt.D(str)) {
            trackingMetadataA.b(TrackableValue.H, str);
        }
        return trackingMetadataA;
    }
}
