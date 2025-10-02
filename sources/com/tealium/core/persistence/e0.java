package com.tealium.core.persistence;

import android.content.ContentValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/e0;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final /* data */ class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f19168a;
    public final String b;
    public Expiry c;
    public Long d;
    public final Serialization e;

    public e0(String key, String value, Expiry expiry, Long l, Serialization serialization) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        this.f19168a = key;
        this.b = value;
        this.c = expiry;
        this.d = l;
        this.e = serialization;
    }

    public final ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", this.f19168a);
        contentValues.put("value", this.b);
        contentValues.put("type", Integer.valueOf(this.e.d));
        Expiry expiry = this.c;
        if (expiry != null) {
            contentValues.put("expiry", Long.valueOf(expiry.a()));
        }
        Long l = this.d;
        if (l != null) {
            contentValues.put("timestamp", Long.valueOf(l.longValue()));
        }
        return contentValues;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.c(this.f19168a, e0Var.f19168a) && Intrinsics.c(this.b, e0Var.b) && Intrinsics.c(this.c, e0Var.c) && Intrinsics.c(this.d, e0Var.d) && this.e == e0Var.e;
    }

    public final int hashCode() {
        int iC = androidx.camera.core.impl.b.c(this.f19168a.hashCode() * 31, 31, this.b);
        Expiry expiry = this.c;
        int iHashCode = (iC + (expiry == null ? 0 : expiry.hashCode())) * 31;
        Long l = this.d;
        return this.e.hashCode() + ((iHashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Expiry expiry = this.c;
        Long l = this.d;
        StringBuilder sbV = YU.a.v("PersistentItem(key=", this.f19168a, ", value=", this.b, ", expiry=");
        sbV.append(expiry);
        sbV.append(", timestamp=");
        sbV.append(l);
        sbV.append(", type=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
