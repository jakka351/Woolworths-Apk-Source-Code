package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInputChange {

    /* renamed from: a, reason: collision with root package name */
    public final long f1855a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final ArrayList k;
    public final long l;
    public boolean m;
    public boolean n;
    public PointerInputChange o;

    public PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f1855a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.l = 0L;
        this.m = z3;
        this.n = z3;
    }

    public final void a() {
        PointerInputChange pointerInputChange = this.o;
        if (pointerInputChange == null) {
            this.m = true;
            this.n = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.a();
        }
    }

    public final boolean b() {
        PointerInputChange pointerInputChange = this.o;
        return pointerInputChange != null ? pointerInputChange.b() : this.m || this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) PointerId.b(this.f1855a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) Offset.j(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) Offset.j(this.g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((Object) PointerType.a(this.i));
        sb.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = EmptyList.d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) Offset.j(this.j));
        sb.append(')');
        return sb.toString();
    }

    public PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.k = arrayList;
        this.l = j7;
    }
}
