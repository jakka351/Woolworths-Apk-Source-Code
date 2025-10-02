package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new AnonymousClass1();
    public final int d;
    public final float e;

    /* renamed from: android.support.v4.media.RatingCompat$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Style {
    }

    public RatingCompat(int i, float f) {
        this.d = i;
        this.e = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.d);
        sb.append(" rating=");
        float f = this.e;
        sb.append(f < BitmapDescriptorFactory.HUE_RED ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
    }
}
