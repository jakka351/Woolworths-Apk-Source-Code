package androidx.camera.core.impl;

/* loaded from: classes2.dex */
final class AutoValue_OutputSurfaceConfiguration extends OutputSurfaceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final OutputSurface f465a;
    public final OutputSurface b;
    public final OutputSurface c;
    public final OutputSurface d;

    public AutoValue_OutputSurfaceConfiguration(OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3, OutputSurface outputSurface4) {
        if (outputSurface == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f465a = outputSurface;
        if (outputSurface2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.b = outputSurface2;
        this.c = outputSurface3;
        this.d = outputSurface4;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface b() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface c() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface d() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface e() {
        return this.f465a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurfaceConfiguration)) {
            return false;
        }
        OutputSurfaceConfiguration outputSurfaceConfiguration = (OutputSurfaceConfiguration) obj;
        if (!this.f465a.equals(outputSurfaceConfiguration.e()) || !this.b.equals(outputSurfaceConfiguration.c())) {
            return false;
        }
        OutputSurface outputSurface = this.c;
        if (outputSurface == null) {
            if (outputSurfaceConfiguration.b() != null) {
                return false;
            }
        } else if (!outputSurface.equals(outputSurfaceConfiguration.b())) {
            return false;
        }
        OutputSurface outputSurface2 = this.d;
        return outputSurface2 == null ? outputSurfaceConfiguration.d() == null : outputSurface2.equals(outputSurfaceConfiguration.d());
    }

    public final int hashCode() {
        int iHashCode = (((this.f465a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        OutputSurface outputSurface = this.c;
        int iHashCode2 = (iHashCode ^ (outputSurface == null ? 0 : outputSurface.hashCode())) * 1000003;
        OutputSurface outputSurface2 = this.d;
        return iHashCode2 ^ (outputSurface2 != null ? outputSurface2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f465a + ", imageCaptureOutputSurface=" + this.b + ", imageAnalysisOutputSurface=" + this.c + ", postviewOutputSurface=" + this.d + "}";
    }
}
