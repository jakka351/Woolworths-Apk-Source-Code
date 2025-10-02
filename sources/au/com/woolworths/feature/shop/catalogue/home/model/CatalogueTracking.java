package au.com.woolworths.feature.shop.catalogue.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/model/CatalogueTracking;", "Landroid/os/Parcelable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueTracking implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CatalogueTracking> CREATOR = new Creator();
    public final String d;
    public final Validity e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CatalogueTracking> {
        @Override // android.os.Parcelable.Creator
        public final CatalogueTracking createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CatalogueTracking(parcel.readString(), Validity.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogueTracking[] newArray(int i) {
            return new CatalogueTracking[i];
        }
    }

    public CatalogueTracking(String id, Validity validity, String type, String publishDate, String startDate, String endDate, String postCode, String state) {
        Intrinsics.h(id, "id");
        Intrinsics.h(validity, "validity");
        Intrinsics.h(type, "type");
        Intrinsics.h(publishDate, "publishDate");
        Intrinsics.h(startDate, "startDate");
        Intrinsics.h(endDate, "endDate");
        Intrinsics.h(postCode, "postCode");
        Intrinsics.h(state, "state");
        this.d = id;
        this.e = validity;
        this.f = type;
        this.g = publishDate;
        this.h = startDate;
        this.i = endDate;
        this.j = postCode;
        this.k = state;
    }

    public static CatalogueTracking a(CatalogueTracking catalogueTracking, String type) {
        String id = catalogueTracking.d;
        Validity validity = catalogueTracking.e;
        String publishDate = catalogueTracking.g;
        String startDate = catalogueTracking.h;
        String endDate = catalogueTracking.i;
        String postCode = catalogueTracking.j;
        String state = catalogueTracking.k;
        catalogueTracking.getClass();
        Intrinsics.h(id, "id");
        Intrinsics.h(validity, "validity");
        Intrinsics.h(type, "type");
        Intrinsics.h(publishDate, "publishDate");
        Intrinsics.h(startDate, "startDate");
        Intrinsics.h(endDate, "endDate");
        Intrinsics.h(postCode, "postCode");
        Intrinsics.h(state, "state");
        return new CatalogueTracking(id, validity, type, publishDate, startDate, endDate, postCode, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueTracking)) {
            return false;
        }
        CatalogueTracking catalogueTracking = (CatalogueTracking) obj;
        return Intrinsics.c(this.d, catalogueTracking.d) && this.e == catalogueTracking.e && Intrinsics.c(this.f, catalogueTracking.f) && Intrinsics.c(this.g, catalogueTracking.g) && Intrinsics.c(this.h, catalogueTracking.h) && Intrinsics.c(this.i, catalogueTracking.i) && Intrinsics.c(this.j, catalogueTracking.j) && Intrinsics.c(this.k, catalogueTracking.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + b.c(b.c(b.c(b.c(b.c((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogueTracking(id=");
        sb.append(this.d);
        sb.append(", validity=");
        sb.append(this.e);
        sb.append(", type=");
        a.B(sb, this.f, ", publishDate=", this.g, ", startDate=");
        a.B(sb, this.h, ", endDate=", this.i, ", postCode=");
        return a.l(sb, this.j, ", state=", this.k, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        dest.writeString(this.j);
        dest.writeString(this.k);
    }
}
