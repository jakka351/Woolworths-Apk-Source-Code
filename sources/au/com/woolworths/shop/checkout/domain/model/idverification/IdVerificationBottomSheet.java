package au.com.woolworths.shop.checkout.domain.model.idverification;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/idverification/IdVerificationBottomSheet;", "Landroid/os/Parcelable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IdVerificationBottomSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IdVerificationBottomSheet> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final List f;
    public final ButtonApiData g;
    public final ButtonApiData h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IdVerificationBottomSheet> {
        @Override // android.os.Parcelable.Creator
        public final IdVerificationBottomSheet createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new IdVerificationBottomSheet(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (ButtonApiData) parcel.readParcelable(IdVerificationBottomSheet.class.getClassLoader()), (ButtonApiData) parcel.readParcelable(IdVerificationBottomSheet.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IdVerificationBottomSheet[] newArray(int i) {
            return new IdVerificationBottomSheet[i];
        }
    }

    public IdVerificationBottomSheet(String title, String body, ArrayList imageUrls, ButtonApiData buttonApiData, ButtonApiData buttonApiData2) {
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        Intrinsics.h(imageUrls, "imageUrls");
        this.d = title;
        this.e = body;
        this.f = imageUrls;
        this.g = buttonApiData;
        this.h = buttonApiData2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdVerificationBottomSheet)) {
            return false;
        }
        IdVerificationBottomSheet idVerificationBottomSheet = (IdVerificationBottomSheet) obj;
        return Intrinsics.c(this.d, idVerificationBottomSheet.d) && Intrinsics.c(this.e, idVerificationBottomSheet.e) && Intrinsics.c(this.f, idVerificationBottomSheet.f) && Intrinsics.c(this.g, idVerificationBottomSheet.g) && Intrinsics.c(this.h, idVerificationBottomSheet.h);
    }

    public final int hashCode() {
        int iD = b.d(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        ButtonApiData buttonApiData = this.g;
        int iHashCode = (iD + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31;
        ButtonApiData buttonApiData2 = this.h;
        return iHashCode + (buttonApiData2 != null ? buttonApiData2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("IdVerificationBottomSheet(title=", this.d, ", body=", this.e, ", imageUrls=");
        sbV.append(this.f);
        sbV.append(", primaryButton=");
        sbV.append(this.g);
        sbV.append(", secondaryButton=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeStringList(this.f);
        dest.writeParcelable(this.g, i);
        dest.writeParcelable(this.h, i);
    }
}
