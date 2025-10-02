package com.google.android.play.core.review;

import YU.a;
import android.app.PendingIntent;

/* loaded from: classes6.dex */
final class zza extends ReviewInfo {
    public final PendingIntent d;
    public final boolean e;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.d = pendingIntent;
        this.e = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.d;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewInfo)) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        return this.d.equals(reviewInfo.a()) && this.e == reviewInfo.b();
    }

    public final int hashCode() {
        return ((this.d.hashCode() ^ 1000003) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return a.k("}", a.u("ReviewInfo{pendingIntent=", this.d.toString(), ", isNoOp="), this.e);
    }
}
