package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/DeliveryNowBottomBanner;", "Landroid/os/Parcelable;", "Lau/com/woolworths/feature/shop/homepage/data/BaseDeliveryNowBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeliveryNowBottomBanner implements Parcelable, BaseDeliveryNowBanner {

    @NotNull
    public static final Parcelable.Creator<DeliveryNowBottomBanner> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final DownloadableAsset h;
    public final ContentCta i;
    public final ContentCta j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryNowBottomBanner> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryNowBottomBanner createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeliveryNowBottomBanner(string, string2, string3, boolValueOf, (DownloadableAsset) parcel.readParcelable(DeliveryNowBottomBanner.class.getClassLoader()), (ContentCta) parcel.readParcelable(DeliveryNowBottomBanner.class.getClassLoader()), (ContentCta) parcel.readParcelable(DeliveryNowBottomBanner.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryNowBottomBanner[] newArray(int i) {
            return new DeliveryNowBottomBanner[i];
        }
    }

    public DeliveryNowBottomBanner(String typeId, String bottomSheetTitle, String bottomSheetBody, Boolean bool, DownloadableAsset downloadableAsset, ContentCta contentCta, ContentCta contentCta2) {
        Intrinsics.h(typeId, "typeId");
        Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
        Intrinsics.h(bottomSheetBody, "bottomSheetBody");
        this.d = typeId;
        this.e = bottomSheetTitle;
        this.f = bottomSheetBody;
        this.g = bool;
        this.h = downloadableAsset;
        this.i = contentCta;
        this.j = contentCta2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryNowBottomBanner)) {
            return false;
        }
        DeliveryNowBottomBanner deliveryNowBottomBanner = (DeliveryNowBottomBanner) obj;
        return Intrinsics.c(this.d, deliveryNowBottomBanner.d) && Intrinsics.c(this.e, deliveryNowBottomBanner.e) && Intrinsics.c(this.f, deliveryNowBottomBanner.f) && Intrinsics.c(this.g, deliveryNowBottomBanner.g) && Intrinsics.c(this.h, deliveryNowBottomBanner.h) && Intrinsics.c(this.i, deliveryNowBottomBanner.i) && Intrinsics.c(this.j, deliveryNowBottomBanner.j);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        Boolean bool = this.g;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        DownloadableAsset downloadableAsset = this.h;
        int iHashCode2 = (iHashCode + (downloadableAsset == null ? 0 : downloadableAsset.hashCode())) * 31;
        ContentCta contentCta = this.i;
        int iHashCode3 = (iHashCode2 + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        ContentCta contentCta2 = this.j;
        return iHashCode3 + (contentCta2 != null ? contentCta2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DeliveryNowBottomBanner(typeId=", this.d, ", bottomSheetTitle=", this.e, ", bottomSheetBody=");
        au.com.woolworths.android.onesite.a.A(sbV, this.f, ", showOnceOnly=", this.g, ", bannerAsset=");
        sbV.append(this.h);
        sbV.append(", primaryCta=");
        sbV.append(this.i);
        sbV.append(", secondaryCta=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        int iBooleanValue;
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Boolean bool = this.g;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            dest.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        dest.writeInt(iBooleanValue);
        dest.writeParcelable(this.h, i);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.j, i);
    }
}
