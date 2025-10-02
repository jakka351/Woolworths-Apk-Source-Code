package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_DualSurfaceProcessorNode_In extends DualSurfaceProcessorNode.In {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceEdge f554a;
    public final SurfaceEdge b;
    public final ArrayList c;

    public AutoValue_DualSurfaceProcessorNode_In(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, ArrayList arrayList) {
        if (surfaceEdge == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f554a = surfaceEdge;
        if (surfaceEdge2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.b = surfaceEdge2;
        this.c = arrayList;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public final List a() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public final SurfaceEdge b() {
        return this.f554a;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public final SurfaceEdge c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DualSurfaceProcessorNode.In)) {
            return false;
        }
        DualSurfaceProcessorNode.In in = (DualSurfaceProcessorNode.In) obj;
        return this.f554a.equals(in.b()) && this.b.equals(in.c()) && this.c.equals(in.a());
    }

    public final int hashCode() {
        return ((((this.f554a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.f554a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return android.support.v4.media.session.a.q("}", sb, this.c);
    }
}
