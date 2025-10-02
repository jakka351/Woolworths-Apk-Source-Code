package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class RendererConfiguration {
    public static final RendererConfiguration c = new RendererConfiguration(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f3023a;
    public final boolean b;

    public RendererConfiguration(int i, boolean z) {
        this.f3023a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RendererConfiguration.class != obj.getClass()) {
            return false;
        }
        RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
        return this.f3023a == rendererConfiguration.f3023a && this.b == rendererConfiguration.b;
    }

    public final int hashCode() {
        return (this.f3023a << 1) + (this.b ? 1 : 0);
    }
}
