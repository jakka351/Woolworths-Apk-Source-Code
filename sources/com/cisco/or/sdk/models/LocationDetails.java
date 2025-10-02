package com.cisco.or.sdk.models;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/models/LocationDetails;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LocationDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f14041a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final JSONObject g;
    public final String h;

    public LocationDetails(String str, String str2, String str3, long j, long j2, String str4, JSONObject jSONObject, String str5) {
        this.f14041a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
        this.g = jSONObject;
        this.h = str5;
    }

    /* renamed from: a, reason: from getter */
    public final JSONObject getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDetails)) {
            return false;
        }
        LocationDetails locationDetails = (LocationDetails) obj;
        return Intrinsics.c(this.f14041a, locationDetails.f14041a) && Intrinsics.c(this.b, locationDetails.b) && Intrinsics.c(this.c, locationDetails.c) && this.d == locationDetails.d && this.e == locationDetails.e && Intrinsics.c(this.f, locationDetails.f) && Intrinsics.c(this.g, locationDetails.g) && Intrinsics.c(this.h, locationDetails.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + b.c(b.b(b.b(b.c(b.c(this.f14041a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationDetails(currentLocation=");
        sb.append(this.f14041a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", path=");
        sb.append(this.c);
        sb.append(", x=");
        sb.append(this.d);
        sb.append(", y=");
        sb.append(this.e);
        sb.append(", customerName=");
        sb.append(this.f);
        sb.append(", mapInfo=");
        sb.append(this.g);
        sb.append(", nearestAPs=");
        return b.r(sb, this.h, ')');
    }
}
