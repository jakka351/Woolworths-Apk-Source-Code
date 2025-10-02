package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = FrameSource.class, value = NativeFrameSourceListener.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/source/FrameSourceListener;", "", "onFrameOutput", "", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "frame", "Lcom/scandit/datacapture/core/data/FrameData;", "onObservationStarted", "onObservationStopped", "onStateChanged", "newState", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FrameSourceListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction(nativeName = "onFrameOutputAndroid")
        public static void onFrameOutput(@NotNull FrameSourceListener frameSourceListener, @NotNull FrameSource frameSource, @NotNull FrameData frame) {
            Intrinsics.h(frameSource, "frameSource");
            Intrinsics.h(frame, "frame");
        }

        @ProxyFunction
        public static void onObservationStarted(@NotNull FrameSourceListener frameSourceListener, @NotNull FrameSource frameSource) {
            Intrinsics.h(frameSource, "frameSource");
        }

        @ProxyFunction
        public static void onObservationStopped(@NotNull FrameSourceListener frameSourceListener, @NotNull FrameSource frameSource) {
            Intrinsics.h(frameSource, "frameSource");
        }

        @ProxyFunction
        public static void onStateChanged(@NotNull FrameSourceListener frameSourceListener, @NotNull FrameSource frameSource, @NotNull FrameSourceState newState) {
            Intrinsics.h(frameSource, "frameSource");
            Intrinsics.h(newState, "newState");
        }
    }

    @ProxyFunction(nativeName = "onFrameOutputAndroid")
    void onFrameOutput(@NotNull FrameSource frameSource, @NotNull FrameData frame);

    @ProxyFunction
    void onObservationStarted(@NotNull FrameSource frameSource);

    @ProxyFunction
    void onObservationStopped(@NotNull FrameSource frameSource);

    @ProxyFunction
    void onStateChanged(@NotNull FrameSource frameSource, @NotNull FrameSourceState newState);
}
