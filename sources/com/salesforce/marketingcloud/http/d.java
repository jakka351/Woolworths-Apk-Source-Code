package com.salesforce.marketingcloud.http;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
/* loaded from: classes6.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f16916a;

    @Nullable
    private final String b;

    @Nullable
    private final String c;
    private final long d;
    private final long e;

    @NotNull
    private final Map<String, List<String>> f;

    @NotNull
    public static final b g = new b(null);

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new c();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f16917a;

        @Nullable
        private String b;

        @Nullable
        private String c;
        private long d;
        private long e;

        @Nullable
        private Map<String, ? extends List<String>> f;

        @NotNull
        public final a a(@NotNull String body) {
            Intrinsics.h(body, "body");
            this.b = body;
            return this;
        }

        @NotNull
        public final a b(@NotNull String message) {
            Intrinsics.h(message, "message");
            this.c = message;
            return this;
        }

        @NotNull
        public final d a() {
            int i = this.f16917a;
            String str = this.b;
            String str2 = this.c;
            long j = this.d;
            long j2 = this.e;
            Map<String, ? extends List<String>> map = this.f;
            if (map == null) {
                map = EmptyMap.d;
            }
            return new d(i, str, str2, j, j2, map);
        }

        @NotNull
        public final a b(long j) {
            this.d = j;
            return this;
        }

        @NotNull
        public final a a(int i) {
            this.f16917a = i;
            return this;
        }

        @NotNull
        public final a a(long j) {
            this.e = j;
            return this;
        }

        @NotNull
        public final a a(@NotNull Map<String, ? extends List<String>> headers) {
            Intrinsics.h(headers, "headers");
            this.f = headers;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final a a() {
            return new a();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final d a(@NotNull String message, int i) {
            Intrinsics.h(message, "message");
            long jCurrentTimeMillis = System.currentTimeMillis();
            return a().a(i).b(message).b(jCurrentTimeMillis).a(jCurrentTimeMillis).a();
        }
    }

    public static final class c implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            return new d(i, string, string2, j, j2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i) {
            return new d[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i, @Nullable String str, @Nullable String str2, long j, long j2, @NotNull Map<String, ? extends List<String>> headers) {
        Intrinsics.h(headers, "headers");
        this.f16916a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = headers;
    }

    @JvmStatic
    @NotNull
    public static final d a(@NotNull String str, int i) {
        return g.a(str, i);
    }

    public final int b() {
        return this.f16916a;
    }

    public final long c() {
        return this.e;
    }

    @NotNull
    public final Map<String, List<String>> d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.c;
    }

    public final long f() {
        return this.d;
    }

    public final boolean g() {
        int i = this.f16916a;
        return 200 <= i && i < 300;
    }

    public final long h() {
        return this.e - this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.h(out, "out");
        out.writeInt(this.f16916a);
        out.writeString(this.b);
        out.writeString(this.c);
        out.writeLong(this.d);
        out.writeLong(this.e);
        Map<String, List<String>> map = this.f;
        out.writeInt(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeStringList(entry.getValue());
        }
    }

    @Nullable
    public final String a() {
        return this.b;
    }
}
