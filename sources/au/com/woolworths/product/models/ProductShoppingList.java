package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.product.quantityselector.QuantitySelectorInfo;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lau/com/woolworths/product/models/ProductShoppingList;", "Lau/com/woolworths/product/quantityselector/QuantitySelectorInfo;", "Landroid/os/Parcelable;", "minimum", "", "maximum", "increment", "defaultValue", "unitLabel", "", "<init>", "(DDDDLjava/lang/String;)V", "getMinimum", "()D", "getMaximum", "getIncrement", "getDefaultValue", "getUnitLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductShoppingList implements QuantitySelectorInfo, Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProductShoppingList> CREATOR = new Creator();

    @SerializedName("defaultValue")
    @ColumnInfo
    private final double defaultValue;

    @SerializedName("increment")
    private final double increment;

    @SerializedName("maximum")
    private final double maximum;

    @SerializedName("minimum")
    private final double minimum;

    @SerializedName("unit")
    @MappedName
    @Nullable
    private final String unitLabel;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductShoppingList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductShoppingList createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductShoppingList(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductShoppingList[] newArray(int i) {
            return new ProductShoppingList[i];
        }
    }

    public ProductShoppingList(double d, double d2, double d3, double d4, @Nullable String str) {
        this.minimum = d;
        this.maximum = d2;
        this.increment = d3;
        this.defaultValue = d4;
        this.unitLabel = str;
    }

    public static /* synthetic */ ProductShoppingList copy$default(ProductShoppingList productShoppingList, double d, double d2, double d3, double d4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = productShoppingList.minimum;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = productShoppingList.maximum;
        }
        return productShoppingList.copy(d5, d2, (i & 4) != 0 ? productShoppingList.increment : d3, (i & 8) != 0 ? productShoppingList.defaultValue : d4, (i & 16) != 0 ? productShoppingList.unitLabel : str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMinimum() {
        return this.minimum;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMaximum() {
        return this.maximum;
    }

    /* renamed from: component3, reason: from getter */
    public final double getIncrement() {
        return this.increment;
    }

    /* renamed from: component4, reason: from getter */
    public final double getDefaultValue() {
        return this.defaultValue;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getUnitLabel() {
        return this.unitLabel;
    }

    @NotNull
    public final ProductShoppingList copy(double minimum, double maximum, double increment, double defaultValue, @Nullable String unitLabel) {
        return new ProductShoppingList(minimum, maximum, increment, defaultValue, unitLabel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductShoppingList)) {
            return false;
        }
        ProductShoppingList productShoppingList = (ProductShoppingList) other;
        return Double.compare(this.minimum, productShoppingList.minimum) == 0 && Double.compare(this.maximum, productShoppingList.maximum) == 0 && Double.compare(this.increment, productShoppingList.increment) == 0 && Double.compare(this.defaultValue, productShoppingList.defaultValue) == 0 && Intrinsics.c(this.unitLabel, productShoppingList.unitLabel);
    }

    @Override // au.com.woolworths.product.quantityselector.QuantitySelectorInfo
    public double getDefaultValue() {
        return this.defaultValue;
    }

    public double getDefault_() {
        return getDefaultValue();
    }

    @Override // au.com.woolworths.product.quantityselector.QuantitySelectorInfo
    public double getIncrement() {
        return this.increment;
    }

    @Override // au.com.woolworths.product.quantityselector.QuantitySelectorInfo
    public double getMaximum() {
        return this.maximum;
    }

    @Override // au.com.woolworths.product.quantityselector.QuantitySelectorInfo
    public double getMinimum() {
        return this.minimum;
    }

    @Override // au.com.woolworths.product.quantityselector.QuantitySelectorInfo
    @Nullable
    public String getUnitLabel() {
        return this.unitLabel;
    }

    public int hashCode() {
        int iA = a.a(this.defaultValue, a.a(this.increment, a.a(this.maximum, Double.hashCode(this.minimum) * 31, 31), 31), 31);
        String str = this.unitLabel;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        double d = this.minimum;
        double d2 = this.maximum;
        double d3 = this.increment;
        double d4 = this.defaultValue;
        String str = this.unitLabel;
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(d, "ProductShoppingList(minimum=", ", maximum=");
        sbN.append(d2);
        au.com.woolworths.android.onesite.a.z(sbN, ", increment=", d3, ", defaultValue=");
        sbN.append(d4);
        sbN.append(", unitLabel=");
        sbN.append(str);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeDouble(this.minimum);
        dest.writeDouble(this.maximum);
        dest.writeDouble(this.increment);
        dest.writeDouble(this.defaultValue);
        dest.writeString(this.unitLabel);
    }

    public /* synthetic */ ProductShoppingList(double d, double d2, double d3, double d4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, (i & 16) != 0 ? null : str);
    }
}
