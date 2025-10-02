package com.salesforce.marketingcloud.messages.iam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

@RestrictTo
/* loaded from: classes6.dex */
public class j implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new a();

    @NonNull
    public static final String e = "buttonClicked";

    @NonNull
    public static final String f = "dismissed";

    @NonNull
    public static final String g = "autoDismissed";

    @NonNull
    public static final String h = "unknown";

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final String f17007a;

    @Nullable
    final InAppMessage.Button b;
    final long c;

    @NonNull
    final Date d;

    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i) {
            return new j[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public j(@NonNull Parcel parcel) {
        this.f17007a = parcel.readString();
        this.b = (InAppMessage.Button) parcel.readParcelable(InAppMessage.Button.class.getClassLoader());
        this.c = parcel.readLong();
        this.d = new Date(parcel.readLong());
    }

    public static j a(Date date, long j) {
        return new j(g, date, j, null);
    }

    public static j e() {
        return new j(h, new Date(), -1L, null);
    }

    public long b() {
        return this.c;
    }

    @NonNull
    public Date c() {
        return this.d;
    }

    @NonNull
    public String d() {
        return this.f17007a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.f17007a);
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d.getTime());
    }

    private j(@NonNull String str, @NonNull Date date, long j, @Nullable InAppMessage.Button button) {
        this.f17007a = str;
        this.c = j;
        this.b = button;
        this.d = date;
    }

    public static j a(Date date, long j, InAppMessage.Button button) {
        return new j(e, date, j, button);
    }

    public static j b(Date date, long j) {
        return new j(f, date, j, null);
    }

    @Nullable
    public InAppMessage.Button a() {
        return this.b;
    }
}
