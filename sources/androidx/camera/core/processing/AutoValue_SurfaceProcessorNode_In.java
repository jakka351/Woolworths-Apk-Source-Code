package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceProcessorNode;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_SurfaceProcessorNode_In extends SurfaceProcessorNode.In {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceEdge f548a;
    public final List b;

    public AutoValue_SurfaceProcessorNode_In(SurfaceEdge surfaceEdge, List list) {
        if (surfaceEdge == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f548a = surfaceEdge;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.b = list;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.In
    public final List a() {
        return this.b;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.In
    public final SurfaceEdge b() {
        return this.f548a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProcessorNode.In)) {
            return false;
        }
        SurfaceProcessorNode.In in = (SurfaceProcessorNode.In) obj;
        return this.f548a.equals(in.b()) && this.b.equals(in.a());
    }

    public final int hashCode() {
        return ((this.f548a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.f548a);
        sb.append(", outConfigs=");
        return android.support.v4.media.session.a.t(sb, this.b, "}");
    }
}
