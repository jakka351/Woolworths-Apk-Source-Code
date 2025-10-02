package com.scandit.datacapture.core.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/logger/GlRenderThreadObtainSurfaceEvent;", "Lcom/scandit/datacapture/core/logger/Event;", "Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "component1", "threadState", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "getThreadState", "()Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "<init>", "(Lcom/scandit/datacapture/core/logger/GlRenderThreadState;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class GlRenderThreadObtainSurfaceEvent extends Event {

    /* renamed from: b, reason: from kotlin metadata */
    private final GlRenderThreadState threadState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlRenderThreadObtainSurfaceEvent(@NotNull GlRenderThreadState threadState) {
        super(null);
        Intrinsics.h(threadState, "threadState");
        this.threadState = threadState;
    }

    public static /* synthetic */ GlRenderThreadObtainSurfaceEvent copy$default(GlRenderThreadObtainSurfaceEvent glRenderThreadObtainSurfaceEvent, GlRenderThreadState glRenderThreadState, int i, Object obj) {
        if ((i & 1) != 0) {
            glRenderThreadState = glRenderThreadObtainSurfaceEvent.threadState;
        }
        return glRenderThreadObtainSurfaceEvent.copy(glRenderThreadState);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GlRenderThreadState getThreadState() {
        return this.threadState;
    }

    @NotNull
    public final GlRenderThreadObtainSurfaceEvent copy(@NotNull GlRenderThreadState threadState) {
        Intrinsics.h(threadState, "threadState");
        return new GlRenderThreadObtainSurfaceEvent(threadState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GlRenderThreadObtainSurfaceEvent) && Intrinsics.c(this.threadState, ((GlRenderThreadObtainSurfaceEvent) other).threadState);
    }

    @NotNull
    public final GlRenderThreadState getThreadState() {
        return this.threadState;
    }

    public int hashCode() {
        return this.threadState.hashCode();
    }

    @NotNull
    public String toString() {
        return "GlRenderThreadObtainSurfaceEvent(threadState=" + this.threadState + ')';
    }
}
