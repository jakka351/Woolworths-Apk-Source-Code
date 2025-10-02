package androidx.compose.ui.input.pointer;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PointerInputEventData {

    /* renamed from: a, reason: collision with root package name */
    public final long f1859a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.f1859a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.a(this.f1859a, pointerInputEventData.f1859a) && this.b == pointerInputEventData.b && Offset.c(this.c, pointerInputEventData.c) && Offset.c(this.d, pointerInputEventData.d) && this.e == pointerInputEventData.e && Float.compare(this.f, pointerInputEventData.f) == 0 && this.g == pointerInputEventData.g && this.h == pointerInputEventData.h && this.i.equals(pointerInputEventData.i) && Offset.c(this.j, pointerInputEventData.j) && Offset.c(this.k, pointerInputEventData.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + b.b(a.b(b.e(b.a(this.g, android.support.v4.media.session.a.b(this.f, b.e(b.b(b.b(b.b(Long.hashCode(this.f1859a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.b(this.f1859a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) Offset.j(this.c)) + ", position=" + ((Object) Offset.j(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) PointerType.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) Offset.j(this.j)) + ", originalEventPosition=" + ((Object) Offset.j(this.k)) + ')';
    }
}
