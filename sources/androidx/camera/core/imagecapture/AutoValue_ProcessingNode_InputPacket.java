package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.ProcessingNode;

/* loaded from: classes2.dex */
final class AutoValue_ProcessingNode_InputPacket extends ProcessingNode.InputPacket {

    /* renamed from: a, reason: collision with root package name */
    public final ProcessingRequest f439a;
    public final ImageProxy b;

    public AutoValue_ProcessingNode_InputPacket(ProcessingRequest processingRequest, ImageProxy imageProxy) {
        if (processingRequest == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f439a = processingRequest;
        this.b = imageProxy;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.InputPacket
    public final ImageProxy a() {
        return this.b;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.InputPacket
    public final ProcessingRequest b() {
        return this.f439a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProcessingNode.InputPacket)) {
            return false;
        }
        ProcessingNode.InputPacket inputPacket = (ProcessingNode.InputPacket) obj;
        return this.f439a.equals(inputPacket.b()) && this.b.equals(inputPacket.a());
    }

    public final int hashCode() {
        return ((this.f439a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f439a + ", imageProxy=" + this.b + "}";
    }
}
