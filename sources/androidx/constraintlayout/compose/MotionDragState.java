package androidx.constraintlayout.compose;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/MotionDragState;", "", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MotionDragState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2249a;
    public final long b;
    public final long c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionDragState$Companion;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public MotionDragState(boolean z, long j, long j2) {
        this.f2249a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionDragState)) {
            return false;
        }
        MotionDragState motionDragState = (MotionDragState) obj;
        return this.f2249a == motionDragState.f2249a && Offset.c(this.b, motionDragState.b) && Velocity.c(this.c, motionDragState.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b.b(Boolean.hashCode(this.f2249a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MotionDragState(isDragging=" + this.f2249a + ", dragAmount=" + ((Object) Offset.j(this.b)) + ", velocity=" + ((Object) Velocity.i(this.c)) + ')';
    }
}
