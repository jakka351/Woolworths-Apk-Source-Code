package au.com.woolworths.product.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/product/models/ProductVarieties;", "Landroid/os/Parcelable;", "count", "", AnnotatedPrivateKey.LABEL, "", "priceFamilyId", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getCount", "()I", "getLabel", "()Ljava/lang/String;", "getPriceFamilyId", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductVarieties implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProductVarieties> CREATOR = new Creator();

    @SerializedName("totalCount")
    @MappedName
    private final int count;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @Nullable
    private final String label;

    @SerializedName("priceFamilyId")
    @NotNull
    private final String priceFamilyId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductVarieties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductVarieties createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductVarieties(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductVarieties[] newArray(int i) {
            return new ProductVarieties[i];
        }
    }

    public ProductVarieties(int i, @Nullable String str, @NotNull String priceFamilyId) {
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        this.count = i;
        this.label = str;
        this.priceFamilyId = priceFamilyId;
    }

    public static /* synthetic */ ProductVarieties copy$default(ProductVarieties productVarieties, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = productVarieties.count;
        }
        if ((i2 & 2) != 0) {
            str = productVarieties.label;
        }
        if ((i2 & 4) != 0) {
            str2 = productVarieties.priceFamilyId;
        }
        return productVarieties.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPriceFamilyId() {
        return this.priceFamilyId;
    }

    @NotNull
    public final ProductVarieties copy(int count, @Nullable String label, @NotNull String priceFamilyId) {
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        return new ProductVarieties(count, label, priceFamilyId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVarieties)) {
            return false;
        }
        ProductVarieties productVarieties = (ProductVarieties) other;
        return this.count == productVarieties.count && Intrinsics.c(this.label, productVarieties.label) && Intrinsics.c(this.priceFamilyId, productVarieties.priceFamilyId);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getPriceFamilyId() {
        return this.priceFamilyId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.label;
        return this.priceFamilyId.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        String str = this.label;
        return a.o(androidx.constraintlayout.core.state.a.p("ProductVarieties(count=", i, ", label=", str, ", priceFamilyId="), this.priceFamilyId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.count);
        dest.writeString(this.label);
        dest.writeString(this.priceFamilyId);
    }
}
