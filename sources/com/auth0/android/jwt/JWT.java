package com.auth0.android.jwt;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;

/* loaded from: classes4.dex */
public class JWT implements Parcelable {
    public static final Parcelable.Creator<JWT> CREATOR = new AnonymousClass1();
    public final String d;
    public final Map e;
    public final JWTPayload f;

    /* renamed from: com.auth0.android.jwt.JWT$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<JWT> {
        @Override // android.os.Parcelable.Creator
        public final JWT createFromParcel(Parcel parcel) {
            return new JWT(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JWT[] newArray(int i) {
            return new JWT[i];
        }
    }

    /* renamed from: com.auth0.android.jwt.JWT$2, reason: invalid class name */
    class AnonymousClass2 extends TypeToken<Map<String, String>> {
    }

    public JWT(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 2 && str.endsWith(".")) {
            strArrSplit = new String[]{strArrSplit[0], strArrSplit[1], ""};
        }
        if (strArrSplit.length != 3) {
            throw new DecodeException(a.e(strArrSplit.length, "The token was expected to have 3 parts, but got ", "."));
        }
        this.e = (Map) d(a(strArrSplit[0]), new AnonymousClass2().getType());
        this.f = (JWTPayload) d(a(strArrSplit[1]), JWTPayload.class);
        String str2 = strArrSplit[2];
        this.d = str;
    }

    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e) {
            throw new DecodeException("Received bytes didn't correspond to a valid Base64 encoded string.", e);
        }
    }

    public static Object d(String str, Type type) {
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.b(new JWTDeserializer(), JWTPayload.class);
            return gsonBuilder.a().f(str, type);
        } catch (Exception e) {
            throw new DecodeException("The token's payload had an invalid JSON format.", e);
        }
    }

    public final Date b() {
        return this.f.f13659a;
    }

    public final boolean c() {
        long jFloor = (long) (Math.floor(new Date().getTime() / 1000) * 1000.0d);
        Date date = new Date(jFloor);
        Date date2 = new Date(jFloor);
        Date date3 = this.f.f13659a;
        boolean z = date3 == null || !date2.after(date3);
        Date date4 = this.f.b;
        return (z && (date4 == null || !date.before(date4))) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
    }
}
