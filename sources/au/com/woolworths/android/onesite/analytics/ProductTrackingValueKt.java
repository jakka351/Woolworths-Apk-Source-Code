package au.com.woolworths.android.onesite.analytics;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductTrackingValueKt {
    public static final TrackingMetadata a(List list) {
        String string;
        Intrinsics.h(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((ProductTrackingValue) it.next()).f4062a));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b(((ProductTrackingValue) it2.next()).b));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it3 = list2.iterator();
        while (true) {
            String str = "";
            if (!it3.hasNext()) {
                break;
            }
            String str2 = ((ProductTrackingValue) it3.next()).e;
            if (str2 != null) {
                str = str2;
            }
            arrayList3.add(str);
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            String str3 = ((ProductTrackingValue) it4.next()).f;
            if (str3 == null) {
                str3 = "";
            }
            arrayList4.add(str3);
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            Float f = ((ProductTrackingValue) it5.next()).d;
            String string2 = f != null ? f.toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            arrayList5.add(string2);
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            Boolean bool = ((ProductTrackingValue) it6.next()).c;
            if (bool == null || (string = bool.toString()) == null) {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            arrayList6.add(string);
        }
        ArrayList arrayList7 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            String str4 = ((ProductTrackingValue) it7.next()).g;
            if (str4 == null) {
                str4 = "";
            }
            arrayList7.add(str4);
        }
        ArrayList arrayList8 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            String str5 = ((ProductTrackingValue) it8.next()).h;
            if (str5 == null) {
                str5 = "";
            }
            arrayList8.add(str5);
        }
        ArrayList arrayList9 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            String str6 = ((ProductTrackingValue) it9.next()).k;
            if (str6 == null) {
                str6 = "";
            }
            arrayList9.add(str6);
        }
        ArrayList arrayList10 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            String str7 = ((ProductTrackingValue) it10.next()).l;
            if (str7 == null) {
                str7 = "";
            }
            arrayList10.add(str7);
        }
        ArrayList arrayList11 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it11 = list2.iterator();
        while (it11.hasNext()) {
            String str8 = ((ProductTrackingValue) it11.next()).m;
            if (str8 == null) {
                str8 = "";
            }
            arrayList11.add(str8);
        }
        ArrayList arrayList12 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it12 = list2.iterator();
        while (it12.hasNext()) {
            String str9 = ((ProductTrackingValue) it12.next()).n;
            if (str9 == null) {
                str9 = "";
            }
            arrayList12.add(str9);
        }
        ArrayList arrayList13 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it13 = list2.iterator();
        while (it13.hasNext()) {
            MarketplaceTrackingValue marketplaceTrackingValue = ((ProductTrackingValue) it13.next()).i;
            arrayList13.add(b(marketplaceTrackingValue != null ? marketplaceTrackingValue.f4061a : null));
        }
        ArrayList arrayList14 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it14 = list2.iterator();
        while (it14.hasNext()) {
            MarketplaceTrackingValue marketplaceTrackingValue2 = ((ProductTrackingValue) it14.next()).i;
            arrayList14.add(b(marketplaceTrackingValue2 != null ? marketplaceTrackingValue2.b : null));
        }
        ArrayList arrayList15 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it15 = list2.iterator();
        while (it15.hasNext()) {
            MarketplaceTrackingValue marketplaceTrackingValue3 = ((ProductTrackingValue) it15.next()).i;
            arrayList15.add(b(marketplaceTrackingValue3 != null ? marketplaceTrackingValue3.c : null));
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.l, arrayList);
        trackingMetadataA.b(TrackableValue.H1, arrayList7);
        trackingMetadataA.b(TrackableValue.I1, arrayList6);
        trackingMetadataA.b(TrackableValue.J1, arrayList13);
        trackingMetadataA.b(TrackableValue.M1, arrayList12);
        trackingMetadataA.b(TrackableValue.N1, arrayList15);
        trackingMetadataA.b(TrackableValue.Q1, arrayList10);
        trackingMetadataA.b(TrackableValue.Z1, arrayList9);
        trackingMetadataA.b(TrackableValue.b2, arrayList2);
        trackingMetadataA.b(TrackableValue.c2, arrayList11);
        trackingMetadataA.b(TrackableValue.d2, arrayList5);
        trackingMetadataA.b(TrackableValue.e2, arrayList14);
        trackingMetadataA.b(TrackableValue.f2, arrayList8);
        trackingMetadataA.b(TrackableValue.h2, arrayList4);
        trackingMetadataA.b(TrackableValue.i2, arrayList3);
        ArrayList arrayList16 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it16 = list2.iterator();
        while (it16.hasNext()) {
            arrayList16.add(((ProductTrackingValue) it16.next()).j);
        }
        trackingMetadataA.a(RewardsOfferAnalyticsDataExtKt.a(arrayList16));
        return trackingMetadataA;
    }

    public static final String b(String str) {
        String string = str != null ? StringsKt.k0(str).toString() : null;
        return string == null ? "" : string;
    }
}
