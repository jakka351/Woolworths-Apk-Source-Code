package au.com.woolworths.feature.shop.myorders.details.models;

import au.com.woolworths.shop.graphql.type.LocationImage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationImageExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[au.com.woolworths.shop.graphql.type.LocationImage.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LocationImage.Companion companion = au.com.woolworths.shop.graphql.type.LocationImage.e;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LocationImage.Companion companion2 = au.com.woolworths.shop.graphql.type.LocationImage.e;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LocationImage.Companion companion3 = au.com.woolworths.shop.graphql.type.LocationImage.e;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final LocationImage a(au.com.woolworths.shop.graphql.type.LocationImage locationImage) {
        int iOrdinal = locationImage.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? LocationImage.d : LocationImage.d : LocationImage.g : LocationImage.f : LocationImage.e;
    }
}
