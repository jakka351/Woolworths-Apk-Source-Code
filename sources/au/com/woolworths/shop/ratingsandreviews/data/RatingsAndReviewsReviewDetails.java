package au.com.woolworths.shop.ratingsandreviews.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsReviewDetails;", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewSections;", "ReviewDetailsItem", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RatingsAndReviewsReviewDetails implements RatingsAndReviewsPreviewSections {

    @NotNull
    public static final Parcelable.Creator<RatingsAndReviewsReviewDetails> CREATOR = new Creator();
    public final ArrayList d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingsAndReviewsReviewDetails> {
        @Override // android.os.Parcelable.Creator
        public final RatingsAndReviewsReviewDetails createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(ReviewDetailsItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new RatingsAndReviewsReviewDetails(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingsAndReviewsReviewDetails[] newArray(int i) {
            return new RatingsAndReviewsReviewDetails[i];
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsReviewDetails$ReviewDetailsItem;", "Landroid/os/Parcelable;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReviewDetailsItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ReviewDetailsItem> CREATOR = new Creator();
        public final ArrayList d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ReviewDetailsItem> {
            @Override // android.os.Parcelable.Creator
            public final ReviewDetailsItem createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = au.com.woolworths.android.onesite.a.a(ReviewDetailsItem.class, parcel, arrayList, iA, 1);
                }
                return new ReviewDetailsItem(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewDetailsItem[] newArray(int i) {
                return new ReviewDetailsItem[i];
            }
        }

        public ReviewDetailsItem(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewDetailsItem) && this.d.equals(((ReviewDetailsItem) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("ReviewDetailsItem(sections=", ")", this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            ArrayList arrayList = this.d;
            dest.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), i);
            }
        }
    }

    public RatingsAndReviewsReviewDetails(ArrayList arrayList) {
        this.d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingsAndReviewsReviewDetails) && this.d.equals(((RatingsAndReviewsReviewDetails) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.k("RatingsAndReviewsReviewDetails(items=", ")", this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        ArrayList arrayList = this.d;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ReviewDetailsItem) it.next()).writeToParcel(dest, i);
        }
    }
}
