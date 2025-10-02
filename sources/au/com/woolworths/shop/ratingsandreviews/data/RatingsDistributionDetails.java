package au.com.woolworths.shop.ratingsandreviews.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/RatingsDistributionDetails;", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsDistributionSection;", "DistributionItem", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RatingsDistributionDetails implements RatingsDistributionSection {

    @NotNull
    public static final Parcelable.Creator<RatingsDistributionDetails> CREATOR = new Creator();
    public final List d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingsDistributionDetails> {
        @Override // android.os.Parcelable.Creator
        public final RatingsDistributionDetails createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(DistributionItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new RatingsDistributionDetails(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingsDistributionDetails[] newArray(int i) {
            return new RatingsDistributionDetails[i];
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/RatingsDistributionDetails$DistributionItem;", "Landroid/os/Parcelable;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DistributionItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DistributionItem> CREATOR = new Creator();
        public final String d;
        public final double e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DistributionItem> {
            @Override // android.os.Parcelable.Creator
            public final DistributionItem createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new DistributionItem(parcel.readDouble(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DistributionItem[] newArray(int i) {
                return new DistributionItem[i];
            }
        }

        public DistributionItem(double d, String ratingScore, String ratingCount) {
            Intrinsics.h(ratingScore, "ratingScore");
            Intrinsics.h(ratingCount, "ratingCount");
            this.d = ratingScore;
            this.e = d;
            this.f = ratingCount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DistributionItem)) {
                return false;
            }
            DistributionItem distributionItem = (DistributionItem) obj;
            return Intrinsics.c(this.d, distributionItem.d) && Double.compare(this.e, distributionItem.e) == 0 && Intrinsics.c(this.f, distributionItem.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + android.support.v4.media.session.a.a(this.e, this.d.hashCode() * 31, 31);
        }

        public final String toString() {
            return YU.a.p(au.com.woolworths.android.onesite.a.r(this.e, "DistributionItem(ratingScore=", this.d, ", percentage="), ", ratingCount=", this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeDouble(this.e);
            dest.writeString(this.f);
        }
    }

    public RatingsDistributionDetails(List list) {
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingsDistributionDetails) && Intrinsics.c(this.d, ((RatingsDistributionDetails) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.l("RatingsDistributionDetails(items=", ")", this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.d, dest);
        while (itU.hasNext()) {
            ((DistributionItem) itU.next()).writeToParcel(dest, i);
        }
    }
}
