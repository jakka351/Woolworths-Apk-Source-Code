package com.scandit.datacapture.core.logger;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/core/logger/UpdateTexImageCrashEvent;", "Lcom/scandit/datacapture/core/logger/Event;", "", "component1", "", "component2", "Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "component3", "throwable", "frameTimeNanos", "threadState", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "c", "J", "getFrameTimeNanos", "()J", "d", "Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "getThreadState", "()Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "<init>", "(Ljava/lang/Throwable;JLcom/scandit/datacapture/core/logger/GlRenderThreadState;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class UpdateTexImageCrashEvent extends Event {

    /* renamed from: b, reason: from kotlin metadata */
    private final Throwable throwable;

    /* renamed from: c, reason: from kotlin metadata */
    private final long frameTimeNanos;

    /* renamed from: d, reason: from kotlin metadata */
    private final GlRenderThreadState threadState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTexImageCrashEvent(@NotNull Throwable throwable, long j, @NotNull GlRenderThreadState threadState) {
        super(null);
        Intrinsics.h(throwable, "throwable");
        Intrinsics.h(threadState, "threadState");
        this.throwable = throwable;
        this.frameTimeNanos = j;
        this.threadState = threadState;
    }

    public static /* synthetic */ UpdateTexImageCrashEvent copy$default(UpdateTexImageCrashEvent updateTexImageCrashEvent, Throwable th, long j, GlRenderThreadState glRenderThreadState, int i, Object obj) {
        if ((i & 1) != 0) {
            th = updateTexImageCrashEvent.throwable;
        }
        if ((i & 2) != 0) {
            j = updateTexImageCrashEvent.frameTimeNanos;
        }
        if ((i & 4) != 0) {
            glRenderThreadState = updateTexImageCrashEvent.threadState;
        }
        return updateTexImageCrashEvent.copy(th, j, glRenderThreadState);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* renamed from: component2, reason: from getter */
    public final long getFrameTimeNanos() {
        return this.frameTimeNanos;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final GlRenderThreadState getThreadState() {
        return this.threadState;
    }

    @NotNull
    public final UpdateTexImageCrashEvent copy(@NotNull Throwable throwable, long frameTimeNanos, @NotNull GlRenderThreadState threadState) {
        Intrinsics.h(throwable, "throwable");
        Intrinsics.h(threadState, "threadState");
        return new UpdateTexImageCrashEvent(throwable, frameTimeNanos, threadState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateTexImageCrashEvent)) {
            return false;
        }
        UpdateTexImageCrashEvent updateTexImageCrashEvent = (UpdateTexImageCrashEvent) other;
        return Intrinsics.c(this.throwable, updateTexImageCrashEvent.throwable) && this.frameTimeNanos == updateTexImageCrashEvent.frameTimeNanos && Intrinsics.c(this.threadState, updateTexImageCrashEvent.threadState);
    }

    public final long getFrameTimeNanos() {
        return this.frameTimeNanos;
    }

    @NotNull
    public final GlRenderThreadState getThreadState() {
        return this.threadState;
    }

    @NotNull
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        return this.threadState.hashCode() + b.b(this.throwable.hashCode() * 31, 31, this.frameTimeNanos);
    }

    @NotNull
    public String toString() {
        return "UpdateTexImageCrashEvent(throwable=" + this.throwable + ", frameTimeNanos=" + this.frameTimeNanos + ", threadState=" + this.threadState + ')';
    }
}
