package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.product.quantityselector.QuantitySelectorInfo;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003Jz\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\nHÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b¨\u0006:"}, d2 = {"Lau/com/woolworths/product/models/ProductTrolleyData;", "Lau/com/woolworths/product/quantityselector/QuantitySelectorInfo;", "Landroid/os/Parcelable;", "minimum", "", "maximum", "increment", "defaultValue", "inTrolley", "unitLabel", "", "buttonState", "Lau/com/woolworths/product/models/ProductTileButtonType;", "buttonLabel", "buttonQuantity", "title", "<init>", "(DDDDLjava/lang/Double;Ljava/lang/String;Lau/com/woolworths/product/models/ProductTileButtonType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMinimum", "()D", "getMaximum", "getIncrement", "getDefaultValue", "getInTrolley", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUnitLabel", "()Ljava/lang/String;", "getButtonState", "()Lau/com/woolworths/product/models/ProductTileButtonType;", "getButtonLabel", "getButtonQuantity", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(DDDDLjava/lang/Double;Ljava/lang/String;Lau/com/woolworths/product/models/ProductTileButtonType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lau/com/woolworths/product/models/ProductTrolleyData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ProductTrolleyData implements QuantitySelectorInfo, Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProductTrolleyData> CREATOR = new Creator();

    @SerializedName("buttonLabel")
    @NotNull
    private final String buttonLabel;

    @SerializedName("buttonQuantity")
    @Nullable
    private final String buttonQuantity;

    @SerializedName("buttonState")
    @NotNull
    private final ProductTileButtonType buttonState;

    @SerializedName(alternate = {"default"}, value = "defaultValue")
    private final double defaultValue;

    @SerializedName("inTrolley")
    @Nullable
    private final Double inTrolley;

    @SerializedName("increment")
    private final double increment;

    @SerializedName("maximum")
    private final double maximum;

    @SerializedName("minimum")
    private final double minimum;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("unit")
    @MappedName
    @Nullable
    private final String unitLabel;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ProductTrolleyData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductTrolleyData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductTrolleyData(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), ProductTileButtonType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductTrolleyData[] newArray(int i) {
            return new ProductTrolleyData[i];
        }
    }

    public ProductTrolleyData(double d, double d2, double d3, double d4, @Nullable Double d5, @Nullable String str, @NotNull ProductTileButtonType buttonState, @NotNull String buttonLabel, @Nullable String str2, @Nullable String str3) {
        Intrinsics.h(buttonState, "buttonState");
        Intrinsics.h(buttonLabel, "buttonLabel");
        this.minimum = d;
        this.maximum = d2;
        this.increment = d3;
        this.defaultValue = d4;
        this.inTrolley = d5;
        this.unitLabel = str;
        this.buttonState = buttonState;
        this.buttonLabel = buttonLabel;
        this.buttonQuantity = str2;
        this.title = str3;
    }

    /* renamed from: component1, reason: from getter */
    public final double getMinimum() {
        return this.minimum;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
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
    public final Double getInTrolley() {
        return this.inTrolley;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getUnitLabel() {
        return this.unitLabel;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ProductTileButtonType getButtonState() {
        return this.buttonState;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getButtonQuantity() {
        return this.buttonQuantity;
    }

    @NotNull
    public final ProductTrolleyData copy(double minimum, double maximum, double increment, double defaultValue, @Nullable Double inTrolley, @Nullable String unitLabel, @NotNull ProductTileButtonType buttonState, @NotNull String buttonLabel, @Nullable String buttonQuantity, @Nullable String title) {
        Intrinsics.h(buttonState, "buttonState");
        Intrinsics.h(buttonLabel, "buttonLabel");
        return new ProductTrolleyData(minimum, maximum, increment, defaultValue, inTrolley, unitLabel, buttonState, buttonLabel, buttonQuantity, title);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductTrolleyData)) {
            return false;
        }
        ProductTrolleyData productTrolleyData = (ProductTrolleyData) other;
        return Double.compare(this.minimum, productTrolleyData.minimum) == 0 && Double.compare(this.maximum, productTrolleyData.maximum) == 0 && Double.compare(this.increment, productTrolleyData.increment) == 0 && Double.compare(this.defaultValue, productTrolleyData.defaultValue) == 0 && Intrinsics.c(this.inTrolley, productTrolleyData.inTrolley) && Intrinsics.c(this.unitLabel, productTrolleyData.unitLabel) && this.buttonState == productTrolleyData.buttonState && Intrinsics.c(this.buttonLabel, productTrolleyData.buttonLabel) && Intrinsics.c(this.buttonQuantity, productTrolleyData.buttonQuantity) && Intrinsics.c(this.title, productTrolleyData.title);
    }

    @NotNull
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    @Nullable
    public final String getButtonQuantity() {
        return this.buttonQuantity;
    }

    @NotNull
    public final ProductTileButtonType getButtonState() {
        return this.buttonState;
    }

    @Override // au.com.woolworths.product.quantityselector.QuantitySelectorInfo
    public double getDefaultValue() {
        return this.defaultValue;
    }

    public double getDefault_() {
        return getDefaultValue();
    }

    @Nullable
    public final Double getInTrolley() {
        return this.inTrolley;
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

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override // au.com.woolworths.product.quantityselector.QuantitySelectorInfo
    @Nullable
    public String getUnitLabel() {
        return this.unitLabel;
    }

    public int hashCode() {
        int iA = a.a(this.defaultValue, a.a(this.increment, a.a(this.maximum, Double.hashCode(this.minimum) * 31, 31), 31), 31);
        Double d = this.inTrolley;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.unitLabel;
        int iC = b.c((this.buttonState.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.buttonLabel);
        String str2 = this.buttonQuantity;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        double d = this.minimum;
        double d2 = this.maximum;
        double d3 = this.increment;
        double d4 = this.defaultValue;
        Double d5 = this.inTrolley;
        String str = this.unitLabel;
        ProductTileButtonType productTileButtonType = this.buttonState;
        String str2 = this.buttonLabel;
        String str3 = this.buttonQuantity;
        String str4 = this.title;
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(d, "ProductTrolleyData(minimum=", ", maximum=");
        sbN.append(d2);
        au.com.woolworths.android.onesite.a.z(sbN, ", increment=", d3, ", defaultValue=");
        sbN.append(d4);
        sbN.append(", inTrolley=");
        sbN.append(d5);
        sbN.append(", unitLabel=");
        sbN.append(str);
        sbN.append(", buttonState=");
        sbN.append(productTileButtonType);
        androidx.constraintlayout.core.state.a.B(sbN, ", buttonLabel=", str2, ", buttonQuantity=", str3);
        return YU.a.p(sbN, ", title=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeDouble(this.minimum);
        dest.writeDouble(this.maximum);
        dest.writeDouble(this.increment);
        dest.writeDouble(this.defaultValue);
        Double d = this.inTrolley;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
        dest.writeString(this.unitLabel);
        this.buttonState.writeToParcel(dest, flags);
        dest.writeString(this.buttonLabel);
        dest.writeString(this.buttonQuantity);
        dest.writeString(this.title);
    }
}
