package io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class LinkProperties implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1();
    public final ArrayList d = new ArrayList();
    public String e = "Share";
    public final HashMap i = new HashMap();
    public String f = "";
    public String g = "";
    public int h = 0;
    public String j = "";
    public String k = "";

    /* renamed from: io.branch.referral.util.LinkProperties$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkProperties linkProperties = new LinkProperties();
            linkProperties.e = parcel.readString();
            linkProperties.f = parcel.readString();
            linkProperties.g = parcel.readString();
            linkProperties.j = parcel.readString();
            linkProperties.k = parcel.readString();
            linkProperties.h = parcel.readInt();
            linkProperties.d.addAll((ArrayList) parcel.readSerializable());
            int i = parcel.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                linkProperties.i.put(parcel.readString(), parcel.readString());
            }
            return linkProperties;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkProperties[i];
        }
    }

    public final void a(String str, String str2) {
        this.i.put(str, str2);
    }

    public final void b(String str) {
        this.k = str;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final void d(int i) {
        this.h = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(String str) {
        this.e = str;
    }

    public final void f(String str) {
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.h);
        parcel.writeSerializable(this.d);
        HashMap map = this.i;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
