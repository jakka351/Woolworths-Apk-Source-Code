package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/LocationTrackingStatusImage;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocationTrackingStatusImage {
    public static final Companion e;
    public static final EnumType f;
    public static final LocationTrackingStatusImage g;
    public static final /* synthetic */ LocationTrackingStatusImage[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/LocationTrackingStatusImage$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return LocationTrackingStatusImage.f;
        }
    }

    static {
        LocationTrackingStatusImage locationTrackingStatusImage = new LocationTrackingStatusImage("SHARING_LOCATION_ON", 0, "SHARING_LOCATION_ON");
        LocationTrackingStatusImage locationTrackingStatusImage2 = new LocationTrackingStatusImage("SHARING_LOCATION_OFF", 1, "SHARING_LOCATION_OFF");
        LocationTrackingStatusImage locationTrackingStatusImage3 = new LocationTrackingStatusImage("UNKNOWN__", 2, "UNKNOWN__");
        g = locationTrackingStatusImage3;
        LocationTrackingStatusImage[] locationTrackingStatusImageArr = {locationTrackingStatusImage, locationTrackingStatusImage2, locationTrackingStatusImage3};
        h = locationTrackingStatusImageArr;
        i = EnumEntriesKt.a(locationTrackingStatusImageArr);
        e = new Companion();
        f = new EnumType("LocationTrackingStatusImage", CollectionsKt.R("SHARING_LOCATION_ON", "SHARING_LOCATION_OFF"));
    }

    public LocationTrackingStatusImage(String str, int i2, String str2) {
        this.d = str2;
    }

    public static LocationTrackingStatusImage valueOf(String str) {
        return (LocationTrackingStatusImage) Enum.valueOf(LocationTrackingStatusImage.class, str);
    }

    public static LocationTrackingStatusImage[] values() {
        return (LocationTrackingStatusImage[]) h.clone();
    }
}
