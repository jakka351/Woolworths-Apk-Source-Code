package ovh.plrapps.mapcompose.core;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/core/Viewport;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Viewport {

    /* renamed from: a, reason: collision with root package name */
    public int f26938a;
    public int b;
    public int c;
    public int d;
    public float e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Viewport)) {
            return false;
        }
        Viewport viewport = (Viewport) obj;
        return this.f26938a == viewport.f26938a && this.b == viewport.b && this.c == viewport.c && this.d == viewport.d && Float.compare(this.e, viewport.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + b.a(this.d, b.a(this.c, b.a(this.b, Integer.hashCode(this.f26938a) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.f26938a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        float f = this.e;
        StringBuilder sbQ = a.q(i, i2, "Viewport(left=", ", top=", ", right=");
        a.w(i3, i4, ", bottom=", ", angleRad=", sbQ);
        return android.support.v4.media.session.a.j(f, ")", sbQ);
    }
}
