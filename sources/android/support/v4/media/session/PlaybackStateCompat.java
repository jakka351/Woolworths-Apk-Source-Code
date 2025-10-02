package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new AnonymousClass1();
    public final int d;
    public final long e;
    public final long f;
    public final float g;
    public final long h;
    public final int i;
    public final CharSequence j;
    public final long k;
    public final ArrayList l;
    public final long m;
    public final Bundle n;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Actions {
    }

    public static final class Builder {
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new AnonymousClass1();
        public final String d;
        public final CharSequence e;
        public final int f;
        public final Bundle g;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public static final class Builder {
        }

        public CustomAction(Parcel parcel) {
            this.d = parcel.readString();
            this.e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f = parcel.readInt();
            this.g = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.e) + ", mIcon=" + this.f + ", mExtras=" + this.g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.d);
            TextUtils.writeToParcel(this.e, parcel, i);
            parcel.writeInt(this.f);
            parcel.writeBundle(this.g);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ErrorCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface State {
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.g = parcel.readFloat();
        this.k = parcel.readLong();
        this.f = parcel.readLong();
        this.h = parcel.readLong();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.m = parcel.readLong();
        this.n = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.d);
        sb.append(", position=");
        sb.append(this.e);
        sb.append(", buffered position=");
        sb.append(this.f);
        sb.append(", speed=");
        sb.append(this.g);
        sb.append(", updated=");
        sb.append(this.k);
        sb.append(", actions=");
        sb.append(this.h);
        sb.append(", error code=");
        sb.append(this.i);
        sb.append(", error message=");
        sb.append(this.j);
        sb.append(", custom actions=");
        sb.append(this.l);
        sb.append(", active item id=");
        return a.l(this.m, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeFloat(this.g);
        parcel.writeLong(this.k);
        parcel.writeLong(this.f);
        parcel.writeLong(this.h);
        TextUtils.writeToParcel(this.j, parcel, i);
        parcel.writeTypedList(this.l);
        parcel.writeLong(this.m);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.i);
    }
}
