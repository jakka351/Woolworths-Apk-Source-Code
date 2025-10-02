package au.com.woolworths.shop.ratingsandreviews.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/CtaText;", "Landroid/os/Parcelable;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CtaText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CtaText> CREATOR = new Creator();
    public final String d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CtaText> {
        @Override // android.os.Parcelable.Creator
        public final CtaText createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CtaText(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CtaText[] newArray(int i) {
            return new CtaText[i];
        }
    }

    public CtaText(String text, String altText) {
        Intrinsics.h(text, "text");
        Intrinsics.h(altText, "altText");
        this.d = text;
        this.e = altText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaText)) {
            return false;
        }
        CtaText ctaText = (CtaText) obj;
        return Intrinsics.c(this.d, ctaText.d) && Intrinsics.c(this.e, ctaText.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return a.j("CtaText(text=", this.d, ", altText=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
