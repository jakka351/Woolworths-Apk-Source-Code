package androidx.camera.core.internal;

/* loaded from: classes2.dex */
final class AutoValue_ImmutableZoomState extends ImmutableZoomState {

    /* renamed from: a, reason: collision with root package name */
    public final float f527a;
    public final float b;
    public final float c;
    public final float d;

    public AutoValue_ImmutableZoomState(float f, float f2, float f3, float f4) {
        this.f527a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
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
        return this.f527a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableZoomState) {
            AutoValue_ImmutableZoomState autoValue_ImmutableZoomState = (AutoValue_ImmutableZoomState) ((ImmutableZoomState) obj);
            if (Float.floatToIntBits(this.f527a) == Float.floatToIntBits(autoValue_ImmutableZoomState.f527a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(autoValue_ImmutableZoomState.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(autoValue_ImmutableZoomState.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(autoValue_ImmutableZoomState.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f527a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb.append(this.f527a);
        sb.append(", maxZoomRatio=");
        sb.append(this.b);
        sb.append(", minZoomRatio=");
        sb.append(this.c);
        sb.append(", linearZoom=");
        return android.support.v4.media.session.a.j(this.d, "}", sb);
    }
}
