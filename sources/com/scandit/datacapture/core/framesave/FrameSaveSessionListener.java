package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = FrameSaveSession.class, value = NativeFrameSaveSessionListener.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;", "", "onFrameSaveFailure", "", "session", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "message", "", "remainingQueueSize", "", "onFrameSaveSuccess", "onObservationStarted", "onObservationStopped", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FrameSaveSessionListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onFrameSaveFailure(@NotNull FrameSaveSessionListener frameSaveSessionListener, @NotNull FrameSaveSession session, @NotNull String message, long j) {
            Intrinsics.h(session, "session");
            Intrinsics.h(message, "message");
        }

        @ProxyFunction
        public static void onFrameSaveSuccess(@NotNull FrameSaveSessionListener frameSaveSessionListener, @NotNull FrameSaveSession session, @NotNull String message, long j) {
            Intrinsics.h(session, "session");
            Intrinsics.h(message, "message");
        }

        @ProxyFunction
        public static void onObservationStarted(@NotNull FrameSaveSessionListener frameSaveSessionListener, @NotNull FrameSaveSession session) {
            Intrinsics.h(session, "session");
        }

        @ProxyFunction
        public static void onObservationStopped(@NotNull FrameSaveSessionListener frameSaveSessionListener, @NotNull FrameSaveSession session) {
            Intrinsics.h(session, "session");
        }
    }

    @ProxyFunction
    void onFrameSaveFailure(@NotNull FrameSaveSession session, @NotNull String message, long remainingQueueSize);

    @ProxyFunction
    void onFrameSaveSuccess(@NotNull FrameSaveSession session, @NotNull String message, long remainingQueueSize);

    @ProxyFunction
    void onObservationStarted(@NotNull FrameSaveSession session);

    @ProxyFunction
    void onObservationStopped(@NotNull FrameSaveSession session);
}
