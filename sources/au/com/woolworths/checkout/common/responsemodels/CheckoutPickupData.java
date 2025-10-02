package au.com.woolworths.checkout.common.responsemodels;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutPickupData;", "", "id", "", "addressId", TextBundle.TEXT_ENTRY, "", "displayableName", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getAddressId", "getText", "()Ljava/lang/String;", "getDisplayableName", "isAllDataSet", "", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutPickupData {

    @SerializedName("AddressId")
    private final int addressId;

    @SerializedName("Name")
    @NotNull
    private final String displayableName;

    @SerializedName("Id")
    private final int id;

    @SerializedName("Text")
    @NotNull
    private final String text;

    public CheckoutPickupData(int i, int i2, @NotNull String text, @NotNull String displayableName) {
        Intrinsics.h(text, "text");
        Intrinsics.h(displayableName, "displayableName");
        this.id = i;
        this.addressId = i2;
        this.text = text;
        this.displayableName = displayableName;
    }

    public static /* synthetic */ CheckoutPickupData copy$default(CheckoutPickupData checkoutPickupData, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = checkoutPickupData.id;
        }
        if ((i3 & 2) != 0) {
            i2 = checkoutPickupData.addressId;
        }
        if ((i3 & 4) != 0) {
            str = checkoutPickupData.text;
        }
        if ((i3 & 8) != 0) {
            str2 = checkoutPickupData.displayableName;
        }
        return checkoutPickupData.copy(i, i2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAddressId() {
        return this.addressId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDisplayableName() {
        return this.displayableName;
    }

    @NotNull
    public final CheckoutPickupData copy(int id, int addressId, @NotNull String text, @NotNull String displayableName) {
        Intrinsics.h(text, "text");
        Intrinsics.h(displayableName, "displayableName");
        return new CheckoutPickupData(id, addressId, text, displayableName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutPickupData)) {
            return false;
        }
        CheckoutPickupData checkoutPickupData = (CheckoutPickupData) other;
        return this.id == checkoutPickupData.id && this.addressId == checkoutPickupData.addressId && Intrinsics.c(this.text, checkoutPickupData.text) && Intrinsics.c(this.displayableName, checkoutPickupData.displayableName);
    }

    public final int getAddressId() {
        return this.addressId;
    }

    @NotNull
    public final String getDisplayableName() {
        return this.displayableName;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.displayableName.hashCode() + b.c(b.a(this.addressId, Integer.hashCode(this.id) * 31, 31), 31, this.text);
    }

    public final boolean isAllDataSet() {
        return (this.id == 0 || StringsKt.D(this.text)) ? false : true;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.addressId;
        return a.l(YU.a.q(i, i2, "CheckoutPickupData(id=", ", addressId=", ", text="), this.text, ", displayableName=", this.displayableName, ")");
    }
}
