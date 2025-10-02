package io.branch.data;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/branch/data/InstallReferrerResult;", "", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InstallReferrerResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f23842a;
    public final long b;
    public final String c;
    public final long d;
    public final boolean e;

    public InstallReferrerResult(String str, String str2, long j, boolean z, long j2) {
        this.f23842a = str;
        this.b = j;
        this.c = str2;
        this.d = j2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallReferrerResult)) {
            return false;
        }
        InstallReferrerResult installReferrerResult = (InstallReferrerResult) obj;
        return Intrinsics.c(this.f23842a, installReferrerResult.f23842a) && this.b == installReferrerResult.b && Intrinsics.c(this.c, installReferrerResult.c) && this.d == installReferrerResult.d && this.e == installReferrerResult.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f23842a;
        int iB = b.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iB2 = b.b((iB + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iB2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallReferrerResult(appStore=");
        sb.append(this.f23842a);
        sb.append(", latestInstallTimestamp=");
        sb.append(this.b);
        sb.append(", latestRawReferrer=");
        sb.append(this.c);
        sb.append(", latestClickTimestamp=");
        sb.append(this.d);
        sb.append(", isClickThrough=");
        return b.s(sb, this.e, ')');
    }
}
