package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003Jl\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0003J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u00067"}, d2 = {"Lau/com/woolworths/product/models/InstoreLocationDetailsData;", "Landroid/os/Parcelable;", "aisleNumber", "", "aisleSide", "Lau/com/woolworths/product/models/AisleSide;", "location", "", "bayNumber", "bayNumberAlternate", "floorNumber", "x", "", "y", "z", "<init>", "(ILau/com/woolworths/product/models/AisleSide;Ljava/lang/String;ILjava/lang/Integer;IDDD)V", "getAisleNumber", "()I", "getAisleSide", "()Lau/com/woolworths/product/models/AisleSide;", "getLocation", "()Ljava/lang/String;", "getBayNumber", "getBayNumberAlternate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFloorNumber", "getX", "()D", "getY", "getZ", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILau/com/woolworths/product/models/AisleSide;Ljava/lang/String;ILjava/lang/Integer;IDDD)Lau/com/woolworths/product/models/InstoreLocationDetailsData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InstoreLocationDetailsData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<InstoreLocationDetailsData> CREATOR = new Creator();

    @SerializedName("aisleNumber")
    private final int aisleNumber;

    @SerializedName("aisleSide")
    @NotNull
    private final AisleSide aisleSide;

    @SerializedName("bayNumber")
    private final int bayNumber;

    @SerializedName("bayNumberAlternate")
    @Nullable
    private final Integer bayNumberAlternate;

    @SerializedName("floorNumber")
    private final int floorNumber;

    @SerializedName("location")
    @Nullable
    private final String location;

    @SerializedName("x")
    private final double x;

    @SerializedName("y")
    private final double y;

    @SerializedName("z")
    private final double z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstoreLocationDetailsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstoreLocationDetailsData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InstoreLocationDetailsData(parcel.readInt(), AisleSide.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstoreLocationDetailsData[] newArray(int i) {
            return new InstoreLocationDetailsData[i];
        }
    }

    public InstoreLocationDetailsData(int i, @NotNull AisleSide aisleSide, @Nullable String str, int i2, @Nullable Integer num, int i3, double d, double d2, double d3) {
        Intrinsics.h(aisleSide, "aisleSide");
        this.aisleNumber = i;
        this.aisleSide = aisleSide;
        this.location = str;
        this.bayNumber = i2;
        this.bayNumberAlternate = num;
        this.floorNumber = i3;
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public static /* synthetic */ InstoreLocationDetailsData copy$default(InstoreLocationDetailsData instoreLocationDetailsData, int i, AisleSide aisleSide, String str, int i2, Integer num, int i3, double d, double d2, double d3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = instoreLocationDetailsData.aisleNumber;
        }
        if ((i4 & 2) != 0) {
            aisleSide = instoreLocationDetailsData.aisleSide;
        }
        if ((i4 & 4) != 0) {
            str = instoreLocationDetailsData.location;
        }
        if ((i4 & 8) != 0) {
            i2 = instoreLocationDetailsData.bayNumber;
        }
        if ((i4 & 16) != 0) {
            num = instoreLocationDetailsData.bayNumberAlternate;
        }
        if ((i4 & 32) != 0) {
            i3 = instoreLocationDetailsData.floorNumber;
        }
        if ((i4 & 64) != 0) {
            d = instoreLocationDetailsData.x;
        }
        if ((i4 & 128) != 0) {
            d2 = instoreLocationDetailsData.y;
        }
        if ((i4 & 256) != 0) {
            d3 = instoreLocationDetailsData.z;
        }
        double d4 = d3;
        double d5 = d2;
        double d6 = d;
        Integer num2 = num;
        int i5 = i3;
        return instoreLocationDetailsData.copy(i, aisleSide, str, i2, num2, i5, d6, d5, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAisleNumber() {
        return this.aisleNumber;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AisleSide getAisleSide() {
        return this.aisleSide;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBayNumber() {
        return this.bayNumber;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getBayNumberAlternate() {
        return this.bayNumberAlternate;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFloorNumber() {
        return this.floorNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component8, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component9, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    @NotNull
    public final InstoreLocationDetailsData copy(int aisleNumber, @NotNull AisleSide aisleSide, @Nullable String location, int bayNumber, @Nullable Integer bayNumberAlternate, int floorNumber, double x, double y, double z) {
        Intrinsics.h(aisleSide, "aisleSide");
        return new InstoreLocationDetailsData(aisleNumber, aisleSide, location, bayNumber, bayNumberAlternate, floorNumber, x, y, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstoreLocationDetailsData)) {
            return false;
        }
        InstoreLocationDetailsData instoreLocationDetailsData = (InstoreLocationDetailsData) other;
        return this.aisleNumber == instoreLocationDetailsData.aisleNumber && this.aisleSide == instoreLocationDetailsData.aisleSide && Intrinsics.c(this.location, instoreLocationDetailsData.location) && this.bayNumber == instoreLocationDetailsData.bayNumber && Intrinsics.c(this.bayNumberAlternate, instoreLocationDetailsData.bayNumberAlternate) && this.floorNumber == instoreLocationDetailsData.floorNumber && Double.compare(this.x, instoreLocationDetailsData.x) == 0 && Double.compare(this.y, instoreLocationDetailsData.y) == 0 && Double.compare(this.z, instoreLocationDetailsData.z) == 0;
    }

    public final int getAisleNumber() {
        return this.aisleNumber;
    }

    @NotNull
    public final AisleSide getAisleSide() {
        return this.aisleSide;
    }

    public final int getBayNumber() {
        return this.bayNumber;
    }

    @Nullable
    public final Integer getBayNumberAlternate() {
        return this.bayNumberAlternate;
    }

    public final int getFloorNumber() {
        return this.floorNumber;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final double getZ() {
        return this.z;
    }

    public int hashCode() {
        int iHashCode = (this.aisleSide.hashCode() + (Integer.hashCode(this.aisleNumber) * 31)) * 31;
        String str = this.location;
        int iA = b.a(this.bayNumber, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.bayNumberAlternate;
        return Double.hashCode(this.z) + a.a(this.y, a.a(this.x, b.a(this.floorNumber, (iA + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.aisleNumber;
        AisleSide aisleSide = this.aisleSide;
        String str = this.location;
        int i2 = this.bayNumber;
        Integer num = this.bayNumberAlternate;
        int i3 = this.floorNumber;
        double d = this.x;
        double d2 = this.y;
        double d3 = this.z;
        StringBuilder sb = new StringBuilder("InstoreLocationDetailsData(aisleNumber=");
        sb.append(i);
        sb.append(", aisleSide=");
        sb.append(aisleSide);
        sb.append(", location=");
        YU.a.x(i2, str, ", bayNumber=", ", bayNumberAlternate=", sb);
        sb.append(num);
        sb.append(", floorNumber=");
        sb.append(i3);
        sb.append(", x=");
        sb.append(d);
        au.com.woolworths.android.onesite.a.z(sb, ", y=", d2, ", z=");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.aisleNumber);
        this.aisleSide.writeToParcel(dest, flags);
        dest.writeString(this.location);
        dest.writeInt(this.bayNumber);
        Integer num = this.bayNumberAlternate;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeInt(this.floorNumber);
        dest.writeDouble(this.x);
        dest.writeDouble(this.y);
        dest.writeDouble(this.z);
    }
}
