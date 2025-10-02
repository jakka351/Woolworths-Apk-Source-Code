package com.salesforce.marketingcloud.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.messages.Region;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
/* loaded from: classes6.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17032a;

    @NotNull
    private final String b;
    private final int c;
    private final int d;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@NotNull Region region) throws IllegalArgumentException {
        Intrinsics.h(region, "region");
        String strId = region.id();
        String strProximityUuid = region.proximityUuid();
        if (strProximityUuid == null) {
            throw new IllegalArgumentException("Not a beacon region");
        }
        this(strId, strProximityUuid, region.major(), region.minor());
    }

    @NotNull
    public final String a() {
        return this.f17032a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.f17032a, cVar.f17032a) && Intrinsics.c(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
    }

    @NotNull
    public final String f() {
        return this.f17032a;
    }

    public final int g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.c(this.f17032a.hashCode() * 31, 31, this.b), 31);
    }

    @NotNull
    public String toString() {
        return androidx.compose.ui.input.pointer.a.i(this.c, this.d, ", minor=", ")", YU.a.v("BeaconRegion(id=", this.f17032a, ", guid=", this.b, ", major="));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.h(out, "out");
        out.writeString(this.f17032a);
        out.writeString(this.b);
        out.writeInt(this.c);
        out.writeInt(this.d);
    }

    public c(@NotNull String id, @NotNull String guid, int i, int i2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(guid, "guid");
        this.f17032a = id;
        this.b = guid;
        this.c = i;
        this.d = i2;
    }

    @NotNull
    public final c a(@NotNull String id, @NotNull String guid, int i, int i2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(guid, "guid");
        return new c(id, guid, i, i2);
    }

    public static /* synthetic */ c a(c cVar, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cVar.f17032a;
        }
        if ((i3 & 2) != 0) {
            str2 = cVar.b;
        }
        if ((i3 & 4) != 0) {
            i = cVar.c;
        }
        if ((i3 & 8) != 0) {
            i2 = cVar.d;
        }
        return cVar.a(str, str2, i, i2);
    }
}
