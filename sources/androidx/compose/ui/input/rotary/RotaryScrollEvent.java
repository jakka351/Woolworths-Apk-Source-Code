package androidx.compose.ui.input.rotary;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RotaryScrollEvent {

    /* renamed from: a, reason: collision with root package name */
    public final float f1869a;
    public final float b;
    public final long c;
    public final int d;

    public RotaryScrollEvent(float f, float f2, int i, long j) {
        this.f1869a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RotaryScrollEvent)) {
            return false;
        }
        RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
        return rotaryScrollEvent.f1869a == this.f1869a && rotaryScrollEvent.b == this.b && rotaryScrollEvent.c == this.c && rotaryScrollEvent.d == this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.b(a.b(this.b, Float.hashCode(this.f1869a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.f1869a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.b);
        sb.append(",uptimeMillis=");
        sb.append(this.c);
        sb.append(",deviceId=");
        return YU.a.l(sb, this.d, ')');
    }
}
