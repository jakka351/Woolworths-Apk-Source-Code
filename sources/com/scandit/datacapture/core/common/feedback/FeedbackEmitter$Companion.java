package com.scandit.datacapture.core.common.feedback;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/scandit/datacapture/core/common/feedback/FeedbackEmitter$Companion", "", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread", "()Landroid/os/HandlerThread;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FeedbackEmitter$Companion {
    public /* synthetic */ FeedbackEmitter$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final Handler getHandler() {
        return a.l;
    }

    @NotNull
    public final HandlerThread getHandlerThread() {
        return a.k;
    }

    private FeedbackEmitter$Companion() {
    }
}
