package au.com.woolworths.feature.product.list.legacy.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductFilterSwitch;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductFilterSwitch implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductFilterSwitch> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final ContentCta h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductFilterSwitch> {
        @Override // android.os.Parcelable.Creator
        public final ProductFilterSwitch createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductFilterSwitch(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (ContentCta) parcel.readParcelable(ProductFilterSwitch.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProductFilterSwitch[] newArray(int i) {
            return new ProductFilterSwitch[i];
        }
    }

    public ProductFilterSwitch(String title, String str, String str2, boolean z, ContentCta contentCta) {
        Intrinsics.h(title, "title");
        this.d = title;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = contentCta;
    }

    public static ProductFilterSwitch a(ProductFilterSwitch productFilterSwitch, boolean z) {
        String title = productFilterSwitch.d;
        String str = productFilterSwitch.e;
        String str2 = productFilterSwitch.f;
        ContentCta contentCta = productFilterSwitch.h;
        productFilterSwitch.getClass();
        Intrinsics.h(title, "title");
        return new ProductFilterSwitch(title, str, str2, z, contentCta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductFilterSwitch)) {
            return false;
        }
        ProductFilterSwitch productFilterSwitch = (ProductFilterSwitch) obj;
        return Intrinsics.c(this.d, productFilterSwitch.d) && Intrinsics.c(this.e, productFilterSwitch.e) && Intrinsics.c(this.f, productFilterSwitch.f) && this.g == productFilterSwitch.g && Intrinsics.c(this.h, productFilterSwitch.h);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iE = b.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        ContentCta contentCta = this.h;
        return iE + (contentCta != null ? contentCta.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductFilterSwitch(title=", this.d, ", subtitle=", this.e, ", imageUrl=");
        d.A(this.f, ", value=", ", buttonCta=", sbV, this.g);
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.g ? 1 : 0);
        dest.writeParcelable(this.h, i);
    }
}
