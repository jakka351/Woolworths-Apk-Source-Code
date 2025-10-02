package androidx.work.impl.constraints;

import androidx.camera.core.impl.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/NetworkState;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3962a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public NetworkState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f3962a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.f3962a == networkState.f3962a && this.b == networkState.b && this.c == networkState.c && this.d == networkState.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + b.e(b.e(Boolean.hashCode(this.f3962a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.f3962a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        return b.s(sb, this.d, ')');
    }
}
