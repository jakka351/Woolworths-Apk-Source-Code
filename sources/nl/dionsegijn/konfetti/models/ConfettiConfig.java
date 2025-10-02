package nl.dionsegijn.konfetti.models;

import YU.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/models/ConfettiConfig;", "", "konfetti_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class ConfettiConfig {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26651a;
    public long b;
    public boolean c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfettiConfig)) {
            return false;
        }
        ConfettiConfig confettiConfig = (ConfettiConfig) obj;
        return this.f26651a == confettiConfig.f26651a && this.b == confettiConfig.b && this.c == confettiConfig.c && this.d == confettiConfig.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    public final int hashCode() {
        boolean z = this.f26651a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        long j = this.b;
        int i = ((r0 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        ?? r2 = this.c;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.d;
        return ((i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + ((int) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfettiConfig(fadeOut=");
        sb.append(this.f26651a);
        sb.append(", timeToLive=");
        sb.append(this.b);
        sb.append(", rotate=");
        sb.append(this.c);
        sb.append(", accelerate=");
        return a.k(", delay=0)", sb, this.d);
    }
}
