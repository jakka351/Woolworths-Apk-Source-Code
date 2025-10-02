package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/LocationImage;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocationImage {
    public static final Companion e;
    public static final EnumType f;
    public static final LocationImage g;
    public static final /* synthetic */ LocationImage[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/LocationImage$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        LocationImage locationImage = new LocationImage("YOUR_LOCATION", 0, "YOUR_LOCATION");
        LocationImage locationImage2 = new LocationImage("LOCATION_OFF", 1, "LOCATION_OFF");
        LocationImage locationImage3 = new LocationImage("APP_SETTINGS", 2, "APP_SETTINGS");
        LocationImage locationImage4 = new LocationImage("DEFAULT", 3, "DEFAULT");
        LocationImage locationImage5 = new LocationImage("UNKNOWN__", 4, "UNKNOWN__");
        g = locationImage5;
        LocationImage[] locationImageArr = {locationImage, locationImage2, locationImage3, locationImage4, locationImage5};
        h = locationImageArr;
        i = EnumEntriesKt.a(locationImageArr);
        e = new Companion();
        f = new EnumType("LocationImage", CollectionsKt.R("YOUR_LOCATION", "LOCATION_OFF", "APP_SETTINGS", "DEFAULT"));
    }

    public LocationImage(String str, int i2, String str2) {
        this.d = str2;
    }

    public static LocationImage valueOf(String str) {
        return (LocationImage) Enum.valueOf(LocationImage.class, str);
    }

    public static LocationImage[] values() {
        return (LocationImage[]) h.clone();
    }
}
