package io.branch.referral;

import androidx.camera.core.impl.b;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/branch/referral/BranchUrlQueryParameter;", "", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BranchUrlQueryParameter {

    /* renamed from: a, reason: collision with root package name */
    public String f23856a;
    public String b;
    public Date c;
    public boolean d;
    public long e;

    public /* synthetic */ BranchUrlQueryParameter(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BranchUrlQueryParameter)) {
            return false;
        }
        BranchUrlQueryParameter branchUrlQueryParameter = (BranchUrlQueryParameter) obj;
        return Intrinsics.c(this.f23856a, branchUrlQueryParameter.f23856a) && Intrinsics.c(this.b, branchUrlQueryParameter.b) && Intrinsics.c(this.c, branchUrlQueryParameter.c) && this.d == branchUrlQueryParameter.d && this.e == branchUrlQueryParameter.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f23856a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.c;
        int iHashCode3 = (iHashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Long.hashCode(this.e) + ((iHashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BranchUrlQueryParameter(name=");
        sb.append(this.f23856a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", isDeepLink=");
        sb.append(this.d);
        sb.append(", validityWindow=");
        return b.q(sb, this.e, ')');
    }

    public BranchUrlQueryParameter(String str, String str2, Date date, long j) {
        this.f23856a = str;
        this.b = str2;
        this.c = date;
        this.d = false;
        this.e = j;
    }
}
