package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lme/oriient/internal/infra/rest/HttpCookie;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "rawCookie", "expiresAtMillis", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getExpiresAtMillis", "()J", "getName", "()Ljava/lang/String;", "getRawCookie", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HttpCookie {
    private final long expiresAtMillis;

    @NotNull
    private final String name;

    @NotNull
    private final String rawCookie;

    public HttpCookie(@NotNull String name, @NotNull String rawCookie, long j) {
        Intrinsics.h(name, "name");
        Intrinsics.h(rawCookie, "rawCookie");
        this.name = name;
        this.rawCookie = rawCookie;
        this.expiresAtMillis = j;
    }

    public static /* synthetic */ HttpCookie copy$default(HttpCookie httpCookie, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpCookie.name;
        }
        if ((i & 2) != 0) {
            str2 = httpCookie.rawCookie;
        }
        if ((i & 4) != 0) {
            j = httpCookie.expiresAtMillis;
        }
        return httpCookie.copy(str, str2, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRawCookie() {
        return this.rawCookie;
    }

    /* renamed from: component3, reason: from getter */
    public final long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    @NotNull
    public final HttpCookie copy(@NotNull String name, @NotNull String rawCookie, long expiresAtMillis) {
        Intrinsics.h(name, "name");
        Intrinsics.h(rawCookie, "rawCookie");
        return new HttpCookie(name, rawCookie, expiresAtMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpCookie)) {
            return false;
        }
        HttpCookie httpCookie = (HttpCookie) other;
        return Intrinsics.c(this.name, httpCookie.name) && Intrinsics.c(this.rawCookie, httpCookie.rawCookie) && this.expiresAtMillis == httpCookie.expiresAtMillis;
    }

    public final long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRawCookie() {
        return this.rawCookie;
    }

    public int hashCode() {
        return Long.hashCode(this.expiresAtMillis) + a.a(this.rawCookie, this.name.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HttpCookie(name=");
        sb.append(this.name);
        sb.append(", rawCookie=");
        sb.append(this.rawCookie);
        sb.append(", expiresAtMillis=");
        return androidx.camera.core.impl.b.q(sb, this.expiresAtMillis, ')');
    }
}
