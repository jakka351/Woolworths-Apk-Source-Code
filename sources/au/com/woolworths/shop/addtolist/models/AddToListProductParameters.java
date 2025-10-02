package au.com.woolworths.shop.addtolist.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/models/AddToListProductParameters;", "Landroid/os/Parcelable;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddToListProductParameters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AddToListProductParameters> CREATOR = new Creator();
    public final ProductCard d;
    public final String e;
    public final Float f;
    public final BoostResult g;
    public final boolean h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddToListProductParameters> {
        @Override // android.os.Parcelable.Creator
        public final AddToListProductParameters createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new AddToListProductParameters((ProductCard) parcel.readParcelable(AddToListProductParameters.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? BoostResult.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AddToListProductParameters[] newArray(int i) {
            return new AddToListProductParameters[i];
        }
    }

    public AddToListProductParameters(ProductCard productCard, String str, Float f, BoostResult boostResult, boolean z) {
        Intrinsics.h(productCard, "productCard");
        this.d = productCard;
        this.e = str;
        this.f = f;
        this.g = boostResult;
        this.h = z;
    }

    public static AddToListProductParameters a(AddToListProductParameters addToListProductParameters, ProductCard productCard, BoostResult boostResult, int i) {
        if ((i & 1) != 0) {
            productCard = addToListProductParameters.d;
        }
        ProductCard productCard2 = productCard;
        String str = addToListProductParameters.e;
        Float f = addToListProductParameters.f;
        if ((i & 8) != 0) {
            boostResult = addToListProductParameters.g;
        }
        boolean z = addToListProductParameters.h;
        addToListProductParameters.getClass();
        Intrinsics.h(productCard2, "productCard");
        return new AddToListProductParameters(productCard2, str, f, boostResult, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToListProductParameters)) {
            return false;
        }
        AddToListProductParameters addToListProductParameters = (AddToListProductParameters) obj;
        return Intrinsics.c(this.d, addToListProductParameters.d) && Intrinsics.c(this.e, addToListProductParameters.e) && Intrinsics.c(this.f, addToListProductParameters.f) && this.g == addToListProductParameters.g && this.h == addToListProductParameters.h;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.f;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        BoostResult boostResult = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode3 + (boostResult != null ? boostResult.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddToListProductParameters(productCard=");
        sb.append(this.d);
        sb.append(", editingProductListItemId=");
        sb.append(this.e);
        sb.append(", quantity=");
        sb.append(this.f);
        sb.append(", boostResult=");
        sb.append(this.g);
        sb.append(", hasVarieties=");
        return a.k(")", sb, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        Float f = this.f;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
        }
        BoostResult boostResult = this.g;
        if (boostResult == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(boostResult.name());
        }
        dest.writeInt(this.h ? 1 : 0);
    }

    public /* synthetic */ AddToListProductParameters(ProductCard productCard, String str, Float f, boolean z, int i) {
        this(productCard, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : f, (BoostResult) null, (i & 16) != 0 ? false : z);
    }
}
