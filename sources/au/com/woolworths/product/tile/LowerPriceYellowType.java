package au.com.woolworths.product.tile;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/tile/LowerPriceYellowType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LowerPriceYellowType implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<LowerPriceYellowType> CREATOR = new Creator();
    public final int d;
    public final int e;
    public final int f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LowerPriceYellowType> {
        @Override // android.os.Parcelable.Creator
        public final LowerPriceYellowType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new LowerPriceYellowType(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LowerPriceYellowType[] newArray(int i) {
            return new LowerPriceYellowType[i];
        }
    }

    public LowerPriceYellowType(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LowerPriceYellowType)) {
            return false;
        }
        LowerPriceYellowType lowerPriceYellowType = (LowerPriceYellowType) obj;
        return this.d == lowerPriceYellowType.d && this.e == lowerPriceYellowType.e && this.f == lowerPriceYellowType.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    /* renamed from: getBackgroundColour, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    /* renamed from: getBorderColour, reason: from getter */
    public final int getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    /* renamed from: getTextColour, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + b.a(this.e, Integer.hashCode(this.d) * 31, 31);
    }

    public final String toString() {
        return a.m(a.q(this.d, this.e, "LowerPriceYellowType(textColour=", ", backgroundColour=", ", borderColour="), this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
    }
}
