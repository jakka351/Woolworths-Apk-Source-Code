package au.com.woolworths.shop.ratingsandreviews.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/Cta;", "Landroid/os/Parcelable;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Cta implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Cta> CREATOR = new Creator();
    public final CtaLinkAction d;
    public final CtaText e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Cta> {
        @Override // android.os.Parcelable.Creator
        public final Cta createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new Cta(CtaLinkAction.CREATOR.createFromParcel(parcel), CtaText.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Cta[] newArray(int i) {
            return new Cta[i];
        }
    }

    public Cta(CtaLinkAction linkAction, CtaText linkTextWithAlt) {
        Intrinsics.h(linkAction, "linkAction");
        Intrinsics.h(linkTextWithAlt, "linkTextWithAlt");
        this.d = linkAction;
        this.e = linkTextWithAlt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) obj;
        return Intrinsics.c(this.d, cta.d) && Intrinsics.c(this.e, cta.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "Cta(linkAction=" + this.d + ", linkTextWithAlt=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
    }
}
