package au.com.woolworths.product.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/product/models/MultiBuyPriceInfo;", "Landroid/os/Parcelable;", "price", "", "unitPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getUnitPrice", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MultiBuyPriceInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<MultiBuyPriceInfo> CREATOR = new Creator();

    @SerializedName("price")
    @NotNull
    private final String price;

    @SerializedName("unitPrice")
    @Nullable
    private final String unitPrice;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiBuyPriceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiBuyPriceInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new MultiBuyPriceInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiBuyPriceInfo[] newArray(int i) {
            return new MultiBuyPriceInfo[i];
        }
    }

    public MultiBuyPriceInfo(@NotNull String price, @Nullable String str) {
        Intrinsics.h(price, "price");
        this.price = price;
        this.unitPrice = str;
    }

    public static /* synthetic */ MultiBuyPriceInfo copy$default(MultiBuyPriceInfo multiBuyPriceInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBuyPriceInfo.price;
        }
        if ((i & 2) != 0) {
            str2 = multiBuyPriceInfo.unitPrice;
        }
        return multiBuyPriceInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getUnitPrice() {
        return this.unitPrice;
    }

    @NotNull
    public final MultiBuyPriceInfo copy(@NotNull String price, @Nullable String unitPrice) {
        Intrinsics.h(price, "price");
        return new MultiBuyPriceInfo(price, unitPrice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiBuyPriceInfo)) {
            return false;
        }
        MultiBuyPriceInfo multiBuyPriceInfo = (MultiBuyPriceInfo) other;
        return Intrinsics.c(this.price, multiBuyPriceInfo.price) && Intrinsics.c(this.unitPrice, multiBuyPriceInfo.unitPrice);
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getUnitPrice() {
        return this.unitPrice;
    }

    public int hashCode() {
        int iHashCode = this.price.hashCode() * 31;
        String str = this.unitPrice;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return a.j("MultiBuyPriceInfo(price=", this.price, ", unitPrice=", this.unitPrice, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.price);
        dest.writeString(this.unitPrice);
    }
}
