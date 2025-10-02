package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a f = new a(null);
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 4;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16949a;
    private final float b;
    private final double c;
    private final double d;
    private final int e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    /* renamed from: com.salesforce.marketingcloud.location.b$b, reason: collision with other inner class name */
    public @interface InterfaceC0365b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface c {
    }

    public b(@NotNull String id, float f2, double d, double d2, int i2) {
        Intrinsics.h(id, "id");
        this.f16949a = id;
        this.b = f2;
        this.c = d;
        this.d = d2;
        this.e = i2;
    }

    @NotNull
    public final String a() {
        return this.f16949a;
    }

    public final float b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final double d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f16949a, bVar.f16949a) && Float.compare(this.b, bVar.b) == 0 && Double.compare(this.c, bVar.c) == 0 && Double.compare(this.d, bVar.d) == 0 && this.e == bVar.e;
    }

    @NotNull
    public final String f() {
        return this.f16949a;
    }

    public final double g() {
        return this.c;
    }

    public final double h() {
        return this.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.e) + android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, android.support.v4.media.session.a.b(this.b, this.f16949a.hashCode() * 31, 31), 31), 31);
    }

    public final float i() {
        return this.b;
    }

    public final int j() {
        return this.e;
    }

    @NotNull
    public String toString() {
        String str = this.f16949a;
        float f2 = this.b;
        double d = this.c;
        double d2 = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder("GeofenceRegion(id=");
        sb.append(str);
        sb.append(", radius=");
        sb.append(f2);
        sb.append(", latitude=");
        sb.append(d);
        au.com.woolworths.android.onesite.a.z(sb, ", longitude=", d2, ", transition=");
        return YU.a.m(sb, i2, ")");
    }

    @NotNull
    public final b a(@NotNull String id, float f2, double d, double d2, int i2) {
        Intrinsics.h(id, "id");
        return new b(id, f2, d, d2, i2);
    }

    public static /* synthetic */ b a(b bVar, String str, float f2, double d, double d2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bVar.f16949a;
        }
        if ((i3 & 2) != 0) {
            f2 = bVar.b;
        }
        if ((i3 & 4) != 0) {
            d = bVar.c;
        }
        if ((i3 & 8) != 0) {
            d2 = bVar.d;
        }
        if ((i3 & 16) != 0) {
            i2 = bVar.e;
        }
        int i4 = i2;
        double d3 = d2;
        return bVar.a(str, f2, d, d3, i4);
    }
}
