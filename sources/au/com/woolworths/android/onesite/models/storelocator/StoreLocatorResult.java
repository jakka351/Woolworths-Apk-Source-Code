package au.com.woolworths.android.onesite.models.storelocator;

import androidx.annotation.Nullable;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.utils.Objects;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.h;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class StoreLocatorResult {

    @SerializedName("stores")
    private List<Store> mStores;

    public static class Store implements StoreItem, Serializable {
        private static final String SUPERMARKETS = "SUPERMARKETS";

        @SerializedName("GMTZone")
        String GMTZone;

        @SerializedName("addressLine1")
        String addressLine1;

        @SerializedName("addressLine2")
        Object addressLine2;

        @SerializedName("country")
        String country;

        @SerializedName("distance")
        String distance;

        @SerializedName("division")
        String division;

        @SerializedName(Scopes.EMAIL)
        String email;

        @SerializedName("extra1")
        Object extra1;

        @SerializedName("extra2")
        Object extra2;

        @SerializedName("extra3")
        Object extra3;

        @SerializedName("extra4")
        Object extra4;

        @SerializedName("extra5")
        Object extra5;

        @SerializedName("extra6")
        Object extra6;

        @SerializedName("extra7")
        Object extra7;

        @SerializedName("extra8")
        Object extra8;

        @SerializedName("extra9")
        Object extra9;

        @SerializedName("facilities")
        Object facilities;

        @SerializedName("geoLevel")
        String geoLevel;

        @SerializedName(h.a.b)
        String latitude;

        @SerializedName(h.a.c)
        String longitude;

        @SerializedName("longtitude")
        String longtitude;

        @SerializedName("manager")
        String manager;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        String name;

        @SerializedName("no")
        String no;

        @SerializedName("phone")
        String phone;

        @SerializedName("postcode")
        String postcode;

        @SerializedName("state")
        String state;

        @SerializedName("suburb")
        String suburb;

        @SerializedName("trading_hours")
        Object trading_hours;

        public Store() {
        }

        public String getAddress() {
            return b.o(getAddressLine1(), ", ", getSuburb());
        }

        public String getAddressLine1() {
            return this.addressLine1;
        }

        public Object getAddressLine2() {
            return this.addressLine2;
        }

        public String getCountry() {
            return this.country;
        }

        @Nullable
        public String getDistance() {
            return this.distance;
        }

        public String getDivision() {
            return this.division;
        }

        public String getEmail() {
            return this.email;
        }

        public Object getFacilities() {
            return this.facilities;
        }

        public String getGMTZone() {
            return this.GMTZone;
        }

        public String getGeoLevel() {
            return this.geoLevel;
        }

        @Override // au.com.woolworths.android.onesite.models.storelocator.StoreItem
        public long getItemId() {
            return Objects.a(this.name) + hashCode();
        }

        @Override // au.com.woolworths.android.onesite.models.storelocator.StoreItem
        public int getItemType() {
            return 1;
        }

        public String getLatitude() {
            return this.latitude;
        }

        public String getLongitude() {
            String str = this.longitude;
            return str == null ? this.longtitude : str;
        }

        public String getManager() {
            return this.manager;
        }

        public String getName() {
            return this.name;
        }

        public String getNo() {
            return this.no;
        }

        @Nullable
        public String getPhone() {
            return this.phone;
        }

        public String getPostcode() {
            return this.postcode;
        }

        public String getState() {
            return this.state;
        }

        public String getSuburb() {
            return this.suburb;
        }

        public Object getTradingHours() {
            return this.trading_hours;
        }

        public boolean isSupermarket() {
            return SUPERMARKETS.equals(this.division);
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNo(String str) {
            this.no = str;
        }

        public Store(String str, String str2, String str3) {
            this.no = str;
            this.name = str2;
            this.postcode = str3;
        }

        public Store(String str, String str2, String str3, String str4, String str5, String str6) {
            this.no = str;
            this.name = str2;
            this.postcode = str3;
            this.division = str4;
            this.latitude = str5;
            this.longitude = str6;
        }
    }

    public List<Store> getStores() {
        return this.mStores;
    }
}
