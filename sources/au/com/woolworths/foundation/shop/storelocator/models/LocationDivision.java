package au.com.woolworths.foundation.shop.storelocator.models;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/models/LocationDivision;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LocationDivision {
    public static final LocationDivision d;
    public static final LocationDivision e;
    public static final LocationDivision f;
    public static final /* synthetic */ LocationDivision[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        LocationDivision locationDivision = new LocationDivision() { // from class: au.com.woolworths.foundation.shop.storelocator.models.LocationDivision.SUPERMARKETS
            @Override // au.com.woolworths.foundation.shop.storelocator.models.LocationDivision
            public final int a() {
                return R.drawable.ic_store_woolies;
            }

            @Override // au.com.woolworths.foundation.shop.storelocator.models.LocationDivision
            public final int b() {
                return 2131232218;
            }
        };
        d = locationDivision;
        LocationDivision locationDivision2 = new LocationDivision() { // from class: au.com.woolworths.foundation.shop.storelocator.models.LocationDivision.BWS
            @Override // au.com.woolworths.foundation.shop.storelocator.models.LocationDivision
            public final int a() {
                return R.drawable.ic_store_bws;
            }

            @Override // au.com.woolworths.foundation.shop.storelocator.models.LocationDivision
            public final int b() {
                return 2131231074;
            }
        };
        e = locationDivision2;
        LocationDivision locationDivision3 = new LocationDivision() { // from class: au.com.woolworths.foundation.shop.storelocator.models.LocationDivision.PETROL
            @Override // au.com.woolworths.foundation.shop.storelocator.models.LocationDivision
            public final int a() {
                return R.drawable.ic_store_petrol;
            }

            @Override // au.com.woolworths.foundation.shop.storelocator.models.LocationDivision
            public final int b() {
                return 2131231240;
            }
        };
        f = locationDivision3;
        LocationDivision[] locationDivisionArr = {locationDivision, locationDivision2, locationDivision3, new LocationDivision() { // from class: au.com.woolworths.foundation.shop.storelocator.models.LocationDivision.UNKNOWN
            @Override // au.com.woolworths.foundation.shop.storelocator.models.LocationDivision
            public final int a() {
                return R.drawable.ic_store_woolies;
            }

            @Override // au.com.woolworths.foundation.shop.storelocator.models.LocationDivision
            public final int b() {
                return 2131232218;
            }
        }};
        g = locationDivisionArr;
        h = EnumEntriesKt.a(locationDivisionArr);
    }

    public static LocationDivision valueOf(String str) {
        return (LocationDivision) Enum.valueOf(LocationDivision.class, str);
    }

    public static LocationDivision[] values() {
        return (LocationDivision[]) g.clone();
    }

    public abstract int a();

    public abstract int b();
}
