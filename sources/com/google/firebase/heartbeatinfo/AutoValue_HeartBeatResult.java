package com.google.firebase.heartbeatinfo;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f15605a;
    public final ArrayList b;

    public AutoValue_HeartBeatResult(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f15605a = str;
        this.b = arrayList;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final List b() {
        return this.b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final String c() {
        return this.f15605a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.f15605a.equals(heartBeatResult.c()) && this.b.equals(heartBeatResult.b());
    }

    public final int hashCode() {
        return ((this.f15605a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.f15605a);
        sb.append(", usedDates=");
        return android.support.v4.media.session.a.q("}", sb, this.b);
    }
}
