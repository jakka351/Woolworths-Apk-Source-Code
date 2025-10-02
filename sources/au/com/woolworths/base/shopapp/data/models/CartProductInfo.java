package au.com.woolworths.base.shopapp.data.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/base/shopapp/data/models/CartProductInfo;", "Landroid/os/Parcelable;", "", "totalPrice", "totalOriginalPrice", "totalDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CartProductInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CartProductInfo> CREATOR = new Creator();

    @SerializedName("totalDiscount")
    @Nullable
    private final String totalDiscount;

    @SerializedName("totalOriginalPrice")
    @Nullable
    private final String totalOriginalPrice;

    @SerializedName("totalPrice")
    @Nullable
    private final String totalPrice;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CartProductInfo> {
        @Override // android.os.Parcelable.Creator
        public final CartProductInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CartProductInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CartProductInfo[] newArray(int i) {
            return new CartProductInfo[i];
        }
    }

    public CartProductInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.totalPrice = str;
        this.totalOriginalPrice = str2;
        this.totalDiscount = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getTotalDiscount() {
        return this.totalDiscount;
    }

    /* renamed from: b, reason: from getter */
    public final String getTotalOriginalPrice() {
        return this.totalOriginalPrice;
    }

    /* renamed from: c, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductInfo)) {
            return false;
        }
        CartProductInfo cartProductInfo = (CartProductInfo) obj;
        return Intrinsics.c(this.totalPrice, cartProductInfo.totalPrice) && Intrinsics.c(this.totalOriginalPrice, cartProductInfo.totalOriginalPrice) && Intrinsics.c(this.totalDiscount, cartProductInfo.totalDiscount);
    }

    public final int hashCode() {
        String str = this.totalPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.totalOriginalPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalDiscount;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.totalPrice;
        String str2 = this.totalOriginalPrice;
        return a.o(a.v("CartProductInfo(totalPrice=", str, ", totalOriginalPrice=", str2, ", totalDiscount="), this.totalDiscount, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.totalPrice);
        dest.writeString(this.totalOriginalPrice);
        dest.writeString(this.totalDiscount);
    }
}
