package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
class ZoomStateImpl implements ZoomState {

    /* renamed from: a, reason: collision with root package name */
    public float f294a;
    public final float b;
    public final float c;
    public float d;

    public ZoomStateImpl(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // androidx.camera.core.ZoomState
    public final float a() {
        return this.b;
    }

    @Override // androidx.camera.core.ZoomState
    public final float b() {
        return this.d;
    }

    @Override // androidx.camera.core.ZoomState
    public final float c() {
        return this.c;
    }

    @Override // androidx.camera.core.ZoomState
    public final float d() {
        return this.f294a;
    }

    public final void e(float f) {
        if (f > 1.0f || f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
        }
        this.d = f;
        float f2 = this.b;
        if (f != 1.0f) {
            float f3 = this.c;
            if (f == BitmapDescriptorFactory.HUE_RED) {
                f2 = f3;
            } else {
                double d = 1.0f / f3;
                double d2 = 1.0d / ((((1.0f / f2) - d) * f) + d);
                double d3 = f3;
                double d4 = f2;
                if (d2 < d3) {
                    d2 = d3;
                } else if (d2 > d4) {
                    d2 = d4;
                }
                f2 = (float) d2;
            }
        }
        this.f294a = f2;
    }

    public final void f(float f) {
        float f2 = this.b;
        float f3 = this.c;
        if (f > f2 || f < f3) {
            StringBuilder sb = new StringBuilder("Requested zoomRatio ");
            sb.append(f);
            sb.append(" is not within valid range [");
            sb.append(f3);
            sb.append(" , ");
            throw new IllegalArgumentException(android.support.v4.media.session.a.j(f2, "]", sb));
        }
        this.f294a = f;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f2 != f3) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.d = f4;
    }
}
