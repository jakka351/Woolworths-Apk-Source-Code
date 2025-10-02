package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/LocationImage;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationImage {
    public static final LocationImage d;
    public static final LocationImage e;
    public static final LocationImage f;
    public static final LocationImage g;
    public static final /* synthetic */ LocationImage[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        LocationImage locationImage = new LocationImage("DEFAULT", 0);
        d = locationImage;
        LocationImage locationImage2 = new LocationImage("YOUR_LOCATION", 1);
        e = locationImage2;
        LocationImage locationImage3 = new LocationImage("LOCATION_OFF", 2);
        f = locationImage3;
        LocationImage locationImage4 = new LocationImage("APP_SETTINGS", 3);
        g = locationImage4;
        LocationImage[] locationImageArr = {locationImage, locationImage2, locationImage3, locationImage4};
        h = locationImageArr;
        i = EnumEntriesKt.a(locationImageArr);
    }

    public static LocationImage valueOf(String str) {
        return (LocationImage) Enum.valueOf(LocationImage.class, str);
    }

    public static LocationImage[] values() {
        return (LocationImage[]) h.clone();
    }
}
