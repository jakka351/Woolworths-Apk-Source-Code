package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0005J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/product/models/ProductCategory;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "categoryLevel", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getCategoryLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lau/com/woolworths/product/models/ProductCategory;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductCategory implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProductCategory> CREATOR = new Creator();

    @SerializedName("categoryLevel")
    @Nullable
    private final Integer categoryLevel;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @Nullable
    private final String name;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductCategory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductCategory createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductCategory(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductCategory[] newArray(int i) {
            return new ProductCategory[i];
        }
    }

    public ProductCategory(@Nullable String str, @Nullable Integer num) {
        this.name = str;
        this.categoryLevel = num;
    }

    public static /* synthetic */ ProductCategory copy$default(ProductCategory productCategory, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productCategory.name;
        }
        if ((i & 2) != 0) {
            num = productCategory.categoryLevel;
        }
        return productCategory.copy(str, num);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getCategoryLevel() {
        return this.categoryLevel;
    }

    @NotNull
    public final ProductCategory copy(@Nullable String name, @Nullable Integer categoryLevel) {
        return new ProductCategory(name, categoryLevel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCategory)) {
            return false;
        }
        ProductCategory productCategory = (ProductCategory) other;
        return Intrinsics.c(this.name, productCategory.name) && Intrinsics.c(this.categoryLevel, productCategory.categoryLevel);
    }

    @Nullable
    public final Integer getCategoryLevel() {
        return this.categoryLevel;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.categoryLevel;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductCategory(name=" + this.name + ", categoryLevel=" + this.categoryLevel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.name);
        Integer num = this.categoryLevel;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }
}
