package com.scandit.datacapture.core.logger;

import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000f\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "", "", "component1", "component2", "component3", "component4", "", "component5", "", "component6", "Landroid/view/Choreographer;", "component7", "Landroid/graphics/SurfaceTexture;", "component8", "isRenderingFrames", "isFrameSourceConnected", "choreographerRequestInProcess", "previewSurfaceSet", "previousRenderedFrameTimeNanos", "glRenderThreadSubscriptions", "choreographer", "cameraSurfaceTexture", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "c", "getChoreographerRequestInProcess", "d", "getPreviewSurfaceSet", "e", "J", "getPreviousRenderedFrameTimeNanos", "()J", "f", "I", "getGlRenderThreadSubscriptions", "()I", "g", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "h", "Landroid/graphics/SurfaceTexture;", "getCameraSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "<init>", "(ZZZZJILandroid/view/Choreographer;Landroid/graphics/SurfaceTexture;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class GlRenderThreadState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isRenderingFrames;

    /* renamed from: b, reason: from kotlin metadata */
    private final boolean isFrameSourceConnected;

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean choreographerRequestInProcess;

    /* renamed from: d, reason: from kotlin metadata */
    private final boolean previewSurfaceSet;

    /* renamed from: e, reason: from kotlin metadata */
    private final long previousRenderedFrameTimeNanos;

    /* renamed from: f, reason: from kotlin metadata */
    private final int glRenderThreadSubscriptions;

    /* renamed from: g, reason: from kotlin metadata */
    private final Choreographer choreographer;

    /* renamed from: h, reason: from kotlin metadata */
    private final SurfaceTexture cameraSurfaceTexture;

    public GlRenderThreadState(boolean z, boolean z2, boolean z3, boolean z4, long j, int i, @Nullable Choreographer choreographer, @Nullable SurfaceTexture surfaceTexture) {
        this.isRenderingFrames = z;
        this.isFrameSourceConnected = z2;
        this.choreographerRequestInProcess = z3;
        this.previewSurfaceSet = z4;
        this.previousRenderedFrameTimeNanos = j;
        this.glRenderThreadSubscriptions = i;
        this.choreographer = choreographer;
        this.cameraSurfaceTexture = surfaceTexture;
    }

    public static /* synthetic */ GlRenderThreadState copy$default(GlRenderThreadState glRenderThreadState, boolean z, boolean z2, boolean z3, boolean z4, long j, int i, Choreographer choreographer, SurfaceTexture surfaceTexture, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = glRenderThreadState.isRenderingFrames;
        }
        if ((i2 & 2) != 0) {
            z2 = glRenderThreadState.isFrameSourceConnected;
        }
        if ((i2 & 4) != 0) {
            z3 = glRenderThreadState.choreographerRequestInProcess;
        }
        if ((i2 & 8) != 0) {
            z4 = glRenderThreadState.previewSurfaceSet;
        }
        if ((i2 & 16) != 0) {
            j = glRenderThreadState.previousRenderedFrameTimeNanos;
        }
        if ((i2 & 32) != 0) {
            i = glRenderThreadState.glRenderThreadSubscriptions;
        }
        if ((i2 & 64) != 0) {
            choreographer = glRenderThreadState.choreographer;
        }
        if ((i2 & 128) != 0) {
            surfaceTexture = glRenderThreadState.cameraSurfaceTexture;
        }
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        int i3 = i;
        long j2 = j;
        boolean z5 = z3;
        boolean z6 = z4;
        return glRenderThreadState.copy(z, z2, z5, z6, j2, i3, choreographer, surfaceTexture2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRenderingFrames() {
        return this.isRenderingFrames;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFrameSourceConnected() {
        return this.isFrameSourceConnected;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getChoreographerRequestInProcess() {
        return this.choreographerRequestInProcess;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPreviewSurfaceSet() {
        return this.previewSurfaceSet;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPreviousRenderedFrameTimeNanos() {
        return this.previousRenderedFrameTimeNanos;
    }

    /* renamed from: component6, reason: from getter */
    public final int getGlRenderThreadSubscriptions() {
        return this.glRenderThreadSubscriptions;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final SurfaceTexture getCameraSurfaceTexture() {
        return this.cameraSurfaceTexture;
    }

    @NotNull
    public final GlRenderThreadState copy(boolean isRenderingFrames, boolean isFrameSourceConnected, boolean choreographerRequestInProcess, boolean previewSurfaceSet, long previousRenderedFrameTimeNanos, int glRenderThreadSubscriptions, @Nullable Choreographer choreographer, @Nullable SurfaceTexture cameraSurfaceTexture) {
        return new GlRenderThreadState(isRenderingFrames, isFrameSourceConnected, choreographerRequestInProcess, previewSurfaceSet, previousRenderedFrameTimeNanos, glRenderThreadSubscriptions, choreographer, cameraSurfaceTexture);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlRenderThreadState)) {
            return false;
        }
        GlRenderThreadState glRenderThreadState = (GlRenderThreadState) other;
        return this.isRenderingFrames == glRenderThreadState.isRenderingFrames && this.isFrameSourceConnected == glRenderThreadState.isFrameSourceConnected && this.choreographerRequestInProcess == glRenderThreadState.choreographerRequestInProcess && this.previewSurfaceSet == glRenderThreadState.previewSurfaceSet && this.previousRenderedFrameTimeNanos == glRenderThreadState.previousRenderedFrameTimeNanos && this.glRenderThreadSubscriptions == glRenderThreadState.glRenderThreadSubscriptions && Intrinsics.c(this.choreographer, glRenderThreadState.choreographer) && Intrinsics.c(this.cameraSurfaceTexture, glRenderThreadState.cameraSurfaceTexture);
    }

    @Nullable
    public final SurfaceTexture getCameraSurfaceTexture() {
        return this.cameraSurfaceTexture;
    }

    @Nullable
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final boolean getChoreographerRequestInProcess() {
        return this.choreographerRequestInProcess;
    }

    public final int getGlRenderThreadSubscriptions() {
        return this.glRenderThreadSubscriptions;
    }

    public final boolean getPreviewSurfaceSet() {
        return this.previewSurfaceSet;
    }

    public final long getPreviousRenderedFrameTimeNanos() {
        return this.previousRenderedFrameTimeNanos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.isRenderingFrames;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r3 = this.isFrameSourceConnected;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r32 = this.choreographerRequestInProcess;
        int i4 = r32;
        if (r32 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.previewSurfaceSet;
        int iA = b.a(this.glRenderThreadSubscriptions, b.b((i5 + (z2 ? 1 : z2 ? 1 : 0)) * 31, 31, this.previousRenderedFrameTimeNanos), 31);
        Choreographer choreographer = this.choreographer;
        int iHashCode = (iA + (choreographer == null ? 0 : choreographer.hashCode())) * 31;
        SurfaceTexture surfaceTexture = this.cameraSurfaceTexture;
        return iHashCode + (surfaceTexture != null ? surfaceTexture.hashCode() : 0);
    }

    public final boolean isFrameSourceConnected() {
        return this.isFrameSourceConnected;
    }

    public final boolean isRenderingFrames() {
        return this.isRenderingFrames;
    }

    @NotNull
    public String toString() {
        return "GlRenderThreadState(isRenderingFrames=" + this.isRenderingFrames + ", isFrameSourceConnected=" + this.isFrameSourceConnected + ", choreographerRequestInProcess=" + this.choreographerRequestInProcess + ", previewSurfaceSet=" + this.previewSurfaceSet + ", previousRenderedFrameTimeNanos=" + this.previousRenderedFrameTimeNanos + ", glRenderThreadSubscriptions=" + this.glRenderThreadSubscriptions + ", choreographer=" + this.choreographer + ", cameraSurfaceTexture=" + this.cameraSurfaceTexture + ')';
    }
}
