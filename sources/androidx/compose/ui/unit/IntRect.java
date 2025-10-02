package androidx.compose.ui.unit;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class IntRect {
    public static final IntRect e = new IntRect(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2201a;
    public final int b;
    public final int c;
    public final int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public IntRect(int i, int i2, int i3, int i4) {
        this.f2201a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((b() / 2) + this.b) & 4294967295L) | (((d() / 2) + this.f2201a) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (this.f2201a << 32) | (this.b & 4294967295L);
    }

    public final int d() {
        return this.c - this.f2201a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.f2201a == intRect.f2201a && this.b == intRect.b && this.c == intRect.c && this.d == intRect.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.a(this.c, b.a(this.b, Integer.hashCode(this.f2201a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f2201a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return a.l(sb, this.d, ')');
    }
}
