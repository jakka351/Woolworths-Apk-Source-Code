package au.com.woolworths.android.onesite.modules.storelocator.apis;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b&\u0010%R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b(\u0010%R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b)\u0010%R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b*\u0010%R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b+\u0010%R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b,\u0010%R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b-\u0010%R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b.\u0010%R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b\r\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b/\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b0\u0010%R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b1\u0010%R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b5\u0010%R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b6\u00104R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b7\u0010%R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0019\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\b;\u0010:R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010?\u001a\u0004\b\u001d\u0010@R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\bA\u00104R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bB\u00104¨\u0006C"}, d2 = {"Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpLocationApiModel;", "", "", "deliveryMethod", "displayableName", "addressText", "street1", "street2", "suburb", "area", "suburbId", "areaId", "postcode", "isPrimary", "postalAddressId", "distance", "storeNumber", "", "Lau/com/woolworths/android/onesite/modules/storelocator/apis/TradingHoursApiModel;", "tradingHours", "phone", "facilities", "displayableAddress", "", h.a.b, h.a.c, "Lau/com/woolworths/android/onesite/modules/storelocator/apis/DivisionApiModel;", "division", "", "isDriveUp", "Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpTypeApiModel;", "pickUpTypes", "supportedCollectionTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DDLau/com/woolworths/android/onesite/modules/storelocator/apis/DivisionApiModel;ZLjava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getDeliveryMethod", "()Ljava/lang/String;", "b", "getAddressText", "getStreet1", "getStreet2", "getSuburb", "getArea", "getSuburbId", "getAreaId", "getPostcode", "getPostalAddressId", "c", "j", "Ljava/util/List;", "l", "()Ljava/util/List;", "h", "e", "a", "D", "f", "()D", "g", "Lau/com/woolworths/android/onesite/modules/storelocator/apis/DivisionApiModel;", "d", "()Lau/com/woolworths/android/onesite/modules/storelocator/apis/DivisionApiModel;", "Z", "()Z", "i", "k", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PickUpLocationApiModel {

    @SerializedName("AddressText")
    @NotNull
    private final String addressText;

    @SerializedName("Area")
    @NotNull
    private final String area;

    @SerializedName("AreaId")
    @NotNull
    private final String areaId;

    @SerializedName("DeliveryMethod")
    @NotNull
    private final String deliveryMethod;

    @SerializedName("CustomerFriendlyAddress")
    @NotNull
    private final String displayableAddress;

    @SerializedName("Description")
    @NotNull
    private final String displayableName;

    @SerializedName("Distance")
    @Nullable
    private final String distance;

    @SerializedName("Division")
    @NotNull
    private final DivisionApiModel division;

    @SerializedName("Facilities")
    @NotNull
    private final List<String> facilities;

    @SerializedName("IsDriveUp")
    private final boolean isDriveUp;

    @SerializedName("IsPrimary")
    @NotNull
    private final String isPrimary;

    @SerializedName("Latitude")
    private final double latitude;

    @SerializedName("Longitude")
    private final double longitude;

    @SerializedName("Phone")
    @Nullable
    private final String phone;

    @SerializedName("PickUpType")
    @NotNull
    private final List<PickUpTypeApiModel> pickUpTypes;

    @SerializedName("PostalAddressID")
    @Nullable
    private final String postalAddressId;

    @SerializedName("PostCode")
    @NotNull
    private final String postcode;

    @SerializedName("StoreNumber")
    @NotNull
    private final String storeNumber;

    @SerializedName("Street1")
    @NotNull
    private final String street1;

    @SerializedName("Street2")
    @NotNull
    private final String street2;

    @SerializedName("Suburb")
    @NotNull
    private final String suburb;

    @SerializedName("SuburbID")
    @NotNull
    private final String suburbId;

    @SerializedName("SupportedCollectionTypes")
    @NotNull
    private final List<String> supportedCollectionTypes;

    @SerializedName("TradingHours")
    @NotNull
    private final List<TradingHoursApiModel> tradingHours;

    public PickUpLocationApiModel(@NotNull String deliveryMethod, @NotNull String displayableName, @NotNull String addressText, @NotNull String street1, @NotNull String street2, @NotNull String suburb, @NotNull String area, @NotNull String suburbId, @NotNull String areaId, @NotNull String postcode, @NotNull String isPrimary, @Nullable String str, @Nullable String str2, @NotNull String storeNumber, @NotNull List<TradingHoursApiModel> tradingHours, @Nullable String str3, @NotNull List<String> facilities, @NotNull String displayableAddress, double d, double d2, @NotNull DivisionApiModel division, boolean z, @NotNull List<PickUpTypeApiModel> pickUpTypes, @NotNull List<String> supportedCollectionTypes) {
        Intrinsics.h(deliveryMethod, "deliveryMethod");
        Intrinsics.h(displayableName, "displayableName");
        Intrinsics.h(addressText, "addressText");
        Intrinsics.h(street1, "street1");
        Intrinsics.h(street2, "street2");
        Intrinsics.h(suburb, "suburb");
        Intrinsics.h(area, "area");
        Intrinsics.h(suburbId, "suburbId");
        Intrinsics.h(areaId, "areaId");
        Intrinsics.h(postcode, "postcode");
        Intrinsics.h(isPrimary, "isPrimary");
        Intrinsics.h(storeNumber, "storeNumber");
        Intrinsics.h(tradingHours, "tradingHours");
        Intrinsics.h(facilities, "facilities");
        Intrinsics.h(displayableAddress, "displayableAddress");
        Intrinsics.h(division, "division");
        Intrinsics.h(pickUpTypes, "pickUpTypes");
        Intrinsics.h(supportedCollectionTypes, "supportedCollectionTypes");
        this.deliveryMethod = deliveryMethod;
        this.displayableName = displayableName;
        this.addressText = addressText;
        this.street1 = street1;
        this.street2 = street2;
        this.suburb = suburb;
        this.area = area;
        this.suburbId = suburbId;
        this.areaId = areaId;
        this.postcode = postcode;
        this.isPrimary = isPrimary;
        this.postalAddressId = str;
        this.distance = str2;
        this.storeNumber = storeNumber;
        this.tradingHours = tradingHours;
        this.phone = str3;
        this.facilities = facilities;
        this.displayableAddress = displayableAddress;
        this.latitude = d;
        this.longitude = d2;
        this.division = division;
        this.isDriveUp = z;
        this.pickUpTypes = pickUpTypes;
        this.supportedCollectionTypes = supportedCollectionTypes;
    }

    /* renamed from: a, reason: from getter */
    public final String getDisplayableAddress() {
        return this.displayableAddress;
    }

    /* renamed from: b, reason: from getter */
    public final String getDisplayableName() {
        return this.displayableName;
    }

    /* renamed from: c, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    /* renamed from: d, reason: from getter */
    public final DivisionApiModel getDivision() {
        return this.division;
    }

    /* renamed from: e, reason: from getter */
    public final List getFacilities() {
        return this.facilities;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickUpLocationApiModel)) {
            return false;
        }
        PickUpLocationApiModel pickUpLocationApiModel = (PickUpLocationApiModel) obj;
        return Intrinsics.c(this.deliveryMethod, pickUpLocationApiModel.deliveryMethod) && Intrinsics.c(this.displayableName, pickUpLocationApiModel.displayableName) && Intrinsics.c(this.addressText, pickUpLocationApiModel.addressText) && Intrinsics.c(this.street1, pickUpLocationApiModel.street1) && Intrinsics.c(this.street2, pickUpLocationApiModel.street2) && Intrinsics.c(this.suburb, pickUpLocationApiModel.suburb) && Intrinsics.c(this.area, pickUpLocationApiModel.area) && Intrinsics.c(this.suburbId, pickUpLocationApiModel.suburbId) && Intrinsics.c(this.areaId, pickUpLocationApiModel.areaId) && Intrinsics.c(this.postcode, pickUpLocationApiModel.postcode) && Intrinsics.c(this.isPrimary, pickUpLocationApiModel.isPrimary) && Intrinsics.c(this.postalAddressId, pickUpLocationApiModel.postalAddressId) && Intrinsics.c(this.distance, pickUpLocationApiModel.distance) && Intrinsics.c(this.storeNumber, pickUpLocationApiModel.storeNumber) && Intrinsics.c(this.tradingHours, pickUpLocationApiModel.tradingHours) && Intrinsics.c(this.phone, pickUpLocationApiModel.phone) && Intrinsics.c(this.facilities, pickUpLocationApiModel.facilities) && Intrinsics.c(this.displayableAddress, pickUpLocationApiModel.displayableAddress) && Double.compare(this.latitude, pickUpLocationApiModel.latitude) == 0 && Double.compare(this.longitude, pickUpLocationApiModel.longitude) == 0 && this.division == pickUpLocationApiModel.division && this.isDriveUp == pickUpLocationApiModel.isDriveUp && Intrinsics.c(this.pickUpTypes, pickUpLocationApiModel.pickUpTypes) && Intrinsics.c(this.supportedCollectionTypes, pickUpLocationApiModel.supportedCollectionTypes);
    }

    /* renamed from: f, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: g, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: h, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(b.c(b.c(b.c(b.c(b.c(b.c(b.c(this.deliveryMethod.hashCode() * 31, 31, this.displayableName), 31, this.addressText), 31, this.street1), 31, this.street2), 31, this.suburb), 31, this.area), 31, this.suburbId), 31, this.areaId), 31, this.postcode), 31, this.isPrimary);
        String str = this.postalAddressId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.distance;
        int iD = b.d(b.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.storeNumber), 31, this.tradingHours);
        String str3 = this.phone;
        return this.supportedCollectionTypes.hashCode() + b.d(b.e((this.division.hashCode() + a.a(this.longitude, a.a(this.latitude, b.c(b.d((iD + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.facilities), 31, this.displayableAddress), 31), 31)) * 31, 31, this.isDriveUp), 31, this.pickUpTypes);
    }

    /* renamed from: i, reason: from getter */
    public final List getPickUpTypes() {
        return this.pickUpTypes;
    }

    /* renamed from: j, reason: from getter */
    public final String getStoreNumber() {
        return this.storeNumber;
    }

    /* renamed from: k, reason: from getter */
    public final List getSupportedCollectionTypes() {
        return this.supportedCollectionTypes;
    }

    /* renamed from: l, reason: from getter */
    public final List getTradingHours() {
        return this.tradingHours;
    }

    public final String toString() {
        String str = this.deliveryMethod;
        String str2 = this.displayableName;
        String str3 = this.addressText;
        String str4 = this.street1;
        String str5 = this.street2;
        String str6 = this.suburb;
        String str7 = this.area;
        String str8 = this.suburbId;
        String str9 = this.areaId;
        String str10 = this.postcode;
        String str11 = this.isPrimary;
        String str12 = this.postalAddressId;
        String str13 = this.distance;
        String str14 = this.storeNumber;
        List<TradingHoursApiModel> list = this.tradingHours;
        String str15 = this.phone;
        List<String> list2 = this.facilities;
        String str16 = this.displayableAddress;
        double d = this.latitude;
        double d2 = this.longitude;
        DivisionApiModel divisionApiModel = this.division;
        boolean z = this.isDriveUp;
        List<PickUpTypeApiModel> list3 = this.pickUpTypes;
        List<String> list4 = this.supportedCollectionTypes;
        StringBuilder sbV = YU.a.v("PickUpLocationApiModel(deliveryMethod=", str, ", displayableName=", str2, ", addressText=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", street1=", str4, ", street2=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", suburb=", str6, ", area=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", suburbId=", str8, ", areaId=");
        androidx.constraintlayout.core.state.a.B(sbV, str9, ", postcode=", str10, ", isPrimary=");
        androidx.constraintlayout.core.state.a.B(sbV, str11, ", postalAddressId=", str12, ", distance=");
        androidx.constraintlayout.core.state.a.B(sbV, str13, ", storeNumber=", str14, ", tradingHours=");
        sbV.append(list);
        sbV.append(", phone=");
        sbV.append(str15);
        sbV.append(", facilities=");
        sbV.append(list2);
        sbV.append(", displayableAddress=");
        sbV.append(str16);
        sbV.append(", latitude=");
        sbV.append(d);
        au.com.woolworths.android.onesite.a.z(sbV, ", longitude=", d2, ", division=");
        sbV.append(divisionApiModel);
        sbV.append(", isDriveUp=");
        sbV.append(z);
        sbV.append(", pickUpTypes=");
        sbV.append(list3);
        sbV.append(", supportedCollectionTypes=");
        sbV.append(list4);
        sbV.append(")");
        return sbV.toString();
    }
}
