package au.com.woolworths.checkout.common.responsemodels;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0011HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0011HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003JË\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001J\u0013\u0010C\u001a\u00020\u00112\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010(R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001d¨\u0006H"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutPrimaryAddress;", "", "addressId", "", "street1", "", "street2", "areaId", "areaName", "suburbId", "suburbName", "country", "postalCode", "phone", "statusId", "shopperId", "isPrimary", "", "areaDeliveryMethodId", "deliveryMethod", "shoppedWith", "postalAddressId", "addressText", "state", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressId", "()J", "getStreet1", "()Ljava/lang/String;", "getStreet2", "getAreaId", "getAreaName", "getSuburbId", "getSuburbName", "getCountry", "getPostalCode", "getPhone", "getStatusId", "getShopperId", "()Z", "getAreaDeliveryMethodId", "getDeliveryMethod", "getShoppedWith", "getPostalAddressId", "getAddressText", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutPrimaryAddress {

    @SerializedName("AddressId")
    private final long addressId;

    @SerializedName("AddressText")
    @NotNull
    private final String addressText;

    @SerializedName("AreaDeliveryMethodId")
    private final long areaDeliveryMethodId;

    @SerializedName("AreaId")
    private final long areaId;

    @SerializedName("AreaName")
    @NotNull
    private final String areaName;

    @SerializedName("Country")
    @NotNull
    private final String country;

    @SerializedName("DeliveryMethod")
    @NotNull
    private final String deliveryMethod;

    @SerializedName("IsPrimary")
    private final boolean isPrimary;

    @SerializedName("Phone")
    @NotNull
    private final String phone;

    @SerializedName("PostalAddressId")
    @Nullable
    private final String postalAddressId;

    @SerializedName("PostalCode")
    @NotNull
    private final String postalCode;

    @SerializedName("ShoppedWith")
    private final boolean shoppedWith;

    @SerializedName("ShopperId")
    private final long shopperId;

    @SerializedName("State")
    @NotNull
    private final String state;

    @SerializedName("StatusId")
    private final long statusId;

    @SerializedName("Street1")
    @NotNull
    private final String street1;

    @SerializedName("Street2")
    @Nullable
    private final String street2;

    @SerializedName("SuburbId")
    private final long suburbId;

    @SerializedName("SuburbName")
    @NotNull
    private final String suburbName;

    public CheckoutPrimaryAddress(long j, @NotNull String street1, @Nullable String str, long j2, @NotNull String areaName, long j3, @NotNull String suburbName, @NotNull String country, @NotNull String postalCode, @NotNull String phone, long j4, long j5, boolean z, long j6, @NotNull String deliveryMethod, boolean z2, @Nullable String str2, @NotNull String addressText, @NotNull String state) {
        Intrinsics.h(street1, "street1");
        Intrinsics.h(areaName, "areaName");
        Intrinsics.h(suburbName, "suburbName");
        Intrinsics.h(country, "country");
        Intrinsics.h(postalCode, "postalCode");
        Intrinsics.h(phone, "phone");
        Intrinsics.h(deliveryMethod, "deliveryMethod");
        Intrinsics.h(addressText, "addressText");
        Intrinsics.h(state, "state");
        this.addressId = j;
        this.street1 = street1;
        this.street2 = str;
        this.areaId = j2;
        this.areaName = areaName;
        this.suburbId = j3;
        this.suburbName = suburbName;
        this.country = country;
        this.postalCode = postalCode;
        this.phone = phone;
        this.statusId = j4;
        this.shopperId = j5;
        this.isPrimary = z;
        this.areaDeliveryMethodId = j6;
        this.deliveryMethod = deliveryMethod;
        this.shoppedWith = z2;
        this.postalAddressId = str2;
        this.addressText = addressText;
        this.state = state;
    }

    public static /* synthetic */ CheckoutPrimaryAddress copy$default(CheckoutPrimaryAddress checkoutPrimaryAddress, long j, String str, String str2, long j2, String str3, long j3, String str4, String str5, String str6, String str7, long j4, long j5, boolean z, long j6, String str8, boolean z2, String str9, String str10, String str11, int i, Object obj) {
        long j7;
        long j8;
        String str12;
        String str13;
        long j9 = (i & 1) != 0 ? checkoutPrimaryAddress.addressId : j;
        String str14 = (i & 2) != 0 ? checkoutPrimaryAddress.street1 : str;
        String str15 = (i & 4) != 0 ? checkoutPrimaryAddress.street2 : str2;
        long j10 = (i & 8) != 0 ? checkoutPrimaryAddress.areaId : j2;
        String str16 = (i & 16) != 0 ? checkoutPrimaryAddress.areaName : str3;
        long j11 = (i & 32) != 0 ? checkoutPrimaryAddress.suburbId : j3;
        String str17 = (i & 64) != 0 ? checkoutPrimaryAddress.suburbName : str4;
        String str18 = (i & 128) != 0 ? checkoutPrimaryAddress.country : str5;
        String str19 = (i & 256) != 0 ? checkoutPrimaryAddress.postalCode : str6;
        String str20 = (i & 512) != 0 ? checkoutPrimaryAddress.phone : str7;
        if ((i & 1024) != 0) {
            j7 = j9;
            j8 = checkoutPrimaryAddress.statusId;
        } else {
            j7 = j9;
            j8 = j4;
        }
        long j12 = j8;
        long j13 = (i & 2048) != 0 ? checkoutPrimaryAddress.shopperId : j5;
        boolean z3 = (i & 4096) != 0 ? checkoutPrimaryAddress.isPrimary : z;
        long j14 = (i & 8192) != 0 ? checkoutPrimaryAddress.areaDeliveryMethodId : j6;
        String str21 = (i & 16384) != 0 ? checkoutPrimaryAddress.deliveryMethod : str8;
        boolean z4 = (32768 & i) != 0 ? checkoutPrimaryAddress.shoppedWith : z2;
        String str22 = (i & 65536) != 0 ? checkoutPrimaryAddress.postalAddressId : str9;
        String str23 = (i & 131072) != 0 ? checkoutPrimaryAddress.addressText : str10;
        if ((i & 262144) != 0) {
            str13 = str23;
            str12 = checkoutPrimaryAddress.state;
        } else {
            str12 = str11;
            str13 = str23;
        }
        return checkoutPrimaryAddress.copy(j7, str14, str15, j10, str16, j11, str17, str18, str19, str20, j12, j13, z3, j14, str21, z4, str22, str13, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAddressId() {
        return this.addressId;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component11, reason: from getter */
    public final long getStatusId() {
        return this.statusId;
    }

    /* renamed from: component12, reason: from getter */
    public final long getShopperId() {
        return this.shopperId;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: component14, reason: from getter */
    public final long getAreaDeliveryMethodId() {
        return this.areaDeliveryMethodId;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getShoppedWith() {
        return this.shoppedWith;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getPostalAddressId() {
        return this.postalAddressId;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final String getAddressText() {
        return this.addressText;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStreet1() {
        return this.street1;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStreet2() {
        return this.street2;
    }

    /* renamed from: component4, reason: from getter */
    public final long getAreaId() {
        return this.areaId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAreaName() {
        return this.areaName;
    }

    /* renamed from: component6, reason: from getter */
    public final long getSuburbId() {
        return this.suburbId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSuburbName() {
        return this.suburbName;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final CheckoutPrimaryAddress copy(long addressId, @NotNull String street1, @Nullable String street2, long areaId, @NotNull String areaName, long suburbId, @NotNull String suburbName, @NotNull String country, @NotNull String postalCode, @NotNull String phone, long statusId, long shopperId, boolean isPrimary, long areaDeliveryMethodId, @NotNull String deliveryMethod, boolean shoppedWith, @Nullable String postalAddressId, @NotNull String addressText, @NotNull String state) {
        Intrinsics.h(street1, "street1");
        Intrinsics.h(areaName, "areaName");
        Intrinsics.h(suburbName, "suburbName");
        Intrinsics.h(country, "country");
        Intrinsics.h(postalCode, "postalCode");
        Intrinsics.h(phone, "phone");
        Intrinsics.h(deliveryMethod, "deliveryMethod");
        Intrinsics.h(addressText, "addressText");
        Intrinsics.h(state, "state");
        return new CheckoutPrimaryAddress(addressId, street1, street2, areaId, areaName, suburbId, suburbName, country, postalCode, phone, statusId, shopperId, isPrimary, areaDeliveryMethodId, deliveryMethod, shoppedWith, postalAddressId, addressText, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutPrimaryAddress)) {
            return false;
        }
        CheckoutPrimaryAddress checkoutPrimaryAddress = (CheckoutPrimaryAddress) other;
        return this.addressId == checkoutPrimaryAddress.addressId && Intrinsics.c(this.street1, checkoutPrimaryAddress.street1) && Intrinsics.c(this.street2, checkoutPrimaryAddress.street2) && this.areaId == checkoutPrimaryAddress.areaId && Intrinsics.c(this.areaName, checkoutPrimaryAddress.areaName) && this.suburbId == checkoutPrimaryAddress.suburbId && Intrinsics.c(this.suburbName, checkoutPrimaryAddress.suburbName) && Intrinsics.c(this.country, checkoutPrimaryAddress.country) && Intrinsics.c(this.postalCode, checkoutPrimaryAddress.postalCode) && Intrinsics.c(this.phone, checkoutPrimaryAddress.phone) && this.statusId == checkoutPrimaryAddress.statusId && this.shopperId == checkoutPrimaryAddress.shopperId && this.isPrimary == checkoutPrimaryAddress.isPrimary && this.areaDeliveryMethodId == checkoutPrimaryAddress.areaDeliveryMethodId && Intrinsics.c(this.deliveryMethod, checkoutPrimaryAddress.deliveryMethod) && this.shoppedWith == checkoutPrimaryAddress.shoppedWith && Intrinsics.c(this.postalAddressId, checkoutPrimaryAddress.postalAddressId) && Intrinsics.c(this.addressText, checkoutPrimaryAddress.addressText) && Intrinsics.c(this.state, checkoutPrimaryAddress.state);
    }

    public final long getAddressId() {
        return this.addressId;
    }

    @NotNull
    public final String getAddressText() {
        return this.addressText;
    }

    public final long getAreaDeliveryMethodId() {
        return this.areaDeliveryMethodId;
    }

    public final long getAreaId() {
        return this.areaId;
    }

    @NotNull
    public final String getAreaName() {
        return this.areaName;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getPostalAddressId() {
        return this.postalAddressId;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    public final boolean getShoppedWith() {
        return this.shoppedWith;
    }

    public final long getShopperId() {
        return this.shopperId;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final long getStatusId() {
        return this.statusId;
    }

    @NotNull
    public final String getStreet1() {
        return this.street1;
    }

    @Nullable
    public final String getStreet2() {
        return this.street2;
    }

    public final long getSuburbId() {
        return this.suburbId;
    }

    @NotNull
    public final String getSuburbName() {
        return this.suburbName;
    }

    public int hashCode() {
        int iC = b.c(Long.hashCode(this.addressId) * 31, 31, this.street1);
        String str = this.street2;
        int iE = b.e(b.c(b.b(b.e(b.b(b.b(b.c(b.c(b.c(b.c(b.b(b.c(b.b((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.areaId), 31, this.areaName), 31, this.suburbId), 31, this.suburbName), 31, this.country), 31, this.postalCode), 31, this.phone), 31, this.statusId), 31, this.shopperId), 31, this.isPrimary), 31, this.areaDeliveryMethodId), 31, this.deliveryMethod), 31, this.shoppedWith);
        String str2 = this.postalAddressId;
        return this.state.hashCode() + b.c((iE + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.addressText);
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    @NotNull
    public String toString() {
        long j = this.addressId;
        String str = this.street1;
        String str2 = this.street2;
        long j2 = this.areaId;
        String str3 = this.areaName;
        long j3 = this.suburbId;
        String str4 = this.suburbName;
        String str5 = this.country;
        String str6 = this.postalCode;
        String str7 = this.phone;
        long j4 = this.statusId;
        long j5 = this.shopperId;
        boolean z = this.isPrimary;
        long j6 = this.areaDeliveryMethodId;
        String str8 = this.deliveryMethod;
        boolean z2 = this.shoppedWith;
        String str9 = this.postalAddressId;
        String str10 = this.addressText;
        String str11 = this.state;
        StringBuilder sb = new StringBuilder("CheckoutPrimaryAddress(addressId=");
        sb.append(j);
        sb.append(", street1=");
        sb.append(str);
        a.w(sb, ", street2=", str2, ", areaId=");
        sb.append(j2);
        sb.append(", areaName=");
        sb.append(str3);
        androidx.constraintlayout.core.state.a.A(sb, ", suburbId=", j3, ", suburbName=");
        androidx.constraintlayout.core.state.a.B(sb, str4, ", country=", str5, ", postalCode=");
        androidx.constraintlayout.core.state.a.B(sb, str6, ", phone=", str7, ", statusId=");
        sb.append(j4);
        androidx.constraintlayout.core.state.a.A(sb, ", shopperId=", j5, ", isPrimary=");
        sb.append(z);
        sb.append(", areaDeliveryMethodId=");
        sb.append(j6);
        sb.append(", deliveryMethod=");
        sb.append(str8);
        sb.append(", shoppedWith=");
        sb.append(z2);
        androidx.constraintlayout.core.state.a.B(sb, ", postalAddressId=", str9, ", addressText=", str10);
        return YU.a.p(sb, ", state=", str11, ")");
    }
}
