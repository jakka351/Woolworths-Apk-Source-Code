package au.com.woolworths.feature.shop.modeselector.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/V1AddressDetails;", "", "ModeSelectorV1AddressDetailsDelivery", "ModeSelectorV1AddressDetailsPickup", "Lau/com/woolworths/feature/shop/modeselector/model/V1AddressDetails$ModeSelectorV1AddressDetailsDelivery;", "Lau/com/woolworths/feature/shop/modeselector/model/V1AddressDetails$ModeSelectorV1AddressDetailsPickup;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface V1AddressDetails {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/V1AddressDetails$ModeSelectorV1AddressDetailsDelivery;", "Lau/com/woolworths/feature/shop/modeselector/model/V1AddressDetails;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ModeSelectorV1AddressDetailsDelivery implements V1AddressDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f7543a;
        public final int b;
        public final String c;
        public final boolean d;
        public final String e;
        public final String f;
        public final String g;
        public final int h;
        public final String i;

        public ModeSelectorV1AddressDetailsDelivery(String str, int i, String str2, boolean z, String str3, String str4, String str5, int i2, String str6) {
            this.f7543a = str;
            this.b = i;
            this.c = str2;
            this.d = z;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = i2;
            this.i = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModeSelectorV1AddressDetailsDelivery)) {
                return false;
            }
            ModeSelectorV1AddressDetailsDelivery modeSelectorV1AddressDetailsDelivery = (ModeSelectorV1AddressDetailsDelivery) obj;
            return Intrinsics.c(this.f7543a, modeSelectorV1AddressDetailsDelivery.f7543a) && this.b == modeSelectorV1AddressDetailsDelivery.b && Intrinsics.c(this.c, modeSelectorV1AddressDetailsDelivery.c) && this.d == modeSelectorV1AddressDetailsDelivery.d && Intrinsics.c(this.e, modeSelectorV1AddressDetailsDelivery.e) && Intrinsics.c(this.f, modeSelectorV1AddressDetailsDelivery.f) && Intrinsics.c(this.g, modeSelectorV1AddressDetailsDelivery.g) && this.h == modeSelectorV1AddressDetailsDelivery.h && Intrinsics.c(this.i, modeSelectorV1AddressDetailsDelivery.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + b.a(this.h, b.c(b.c(b.c(b.e(b.c(b.a(this.b, this.f7543a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
        }

        public final String toString() {
            StringBuilder sbU = b.u("ModeSelectorV1AddressDetailsDelivery(modeId=", this.b, this.f7543a, ", addressId=", ", addressText=");
            d.A(this.c, ", isPrimary=", ", postcode=", sbU, this.d);
            a.B(sbU, this.e, ", street1=", this.f, ", street2=");
            YU.a.x(this.h, this.g, ", suburbId=", ", suburbName=", sbU);
            return YU.a.o(sbU, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/V1AddressDetails$ModeSelectorV1AddressDetailsPickup;", "Lau/com/woolworths/feature/shop/modeselector/model/V1AddressDetails;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ModeSelectorV1AddressDetailsPickup implements V1AddressDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f7544a;
        public final String b;
        public final int c;
        public final String d;
        public final String e;
        public final String f;

        public ModeSelectorV1AddressDetailsPickup(String str, String str2, int i, String str3, String str4, String str5) {
            this.f7544a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModeSelectorV1AddressDetailsPickup)) {
                return false;
            }
            ModeSelectorV1AddressDetailsPickup modeSelectorV1AddressDetailsPickup = (ModeSelectorV1AddressDetailsPickup) obj;
            return Intrinsics.c(this.f7544a, modeSelectorV1AddressDetailsPickup.f7544a) && Intrinsics.c(this.b, modeSelectorV1AddressDetailsPickup.b) && this.c == modeSelectorV1AddressDetailsPickup.c && Intrinsics.c(this.d, modeSelectorV1AddressDetailsPickup.d) && Intrinsics.c(this.e, modeSelectorV1AddressDetailsPickup.e) && Intrinsics.c(this.f, modeSelectorV1AddressDetailsPickup.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(b.c(b.a(this.c, b.c(this.f7544a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("ModeSelectorV1AddressDetailsPickup(modeId=", this.f7544a, ", storeId=", this.b, ", addressId=");
            androidx.compose.ui.input.pointer.a.u(this.c, ", addressText=", this.d, ", displayName=", sbV);
            return a.l(sbV, this.e, ", label=", this.f, ")");
        }
    }
}
