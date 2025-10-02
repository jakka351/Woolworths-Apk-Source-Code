package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.processing.Edge;

/* loaded from: classes2.dex */
final class AutoValue_ProcessingNode_In extends ProcessingNode.In {

    /* renamed from: a, reason: collision with root package name */
    public final Edge f438a;
    public final Edge b;
    public final int c;
    public final int d;

    public AutoValue_ProcessingNode_In(Edge edge, Edge edge2, int i, int i2) {
        this.f438a = edge;
        this.b = edge2;
        this.c = i;
        this.d = i2;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    public final Edge a() {
        return this.f438a;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    public final int b() {
        return this.c;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    public final int c() {
        return this.d;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    public final Edge d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProcessingNode.In)) {
            return false;
        }
        ProcessingNode.In in = (ProcessingNode.In) obj;
        return this.f438a.equals(in.a()) && this.b.equals(in.d()) && this.c == in.b() && this.d == in.c();
    }

    public final int hashCode() {
        return ((((((this.f438a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.f438a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormat=");
        return YU.a.m(sb, this.d, "}");
    }
}
