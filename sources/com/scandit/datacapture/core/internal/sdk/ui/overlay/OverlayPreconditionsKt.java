package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "Lkotlin/Function0;", "", "lazyMessage", "", "checkAttachedToSameDataCaptureContext", "scandit-capture-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class OverlayPreconditionsKt {
    public static final void checkAttachedToSameDataCaptureContext(@NotNull DataCaptureMode mode, @Nullable DataCaptureView dataCaptureView, @NotNull Function0<? extends Object> lazyMessage) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(lazyMessage, "lazyMessage");
        DataCaptureContext c = mode.getC();
        DataCaptureContext dataCaptureContext = dataCaptureView != null ? dataCaptureView.getDataCaptureContext() : null;
        if (c != null && dataCaptureContext != null && !Intrinsics.c(c.getF18429a(), dataCaptureContext.getF18429a())) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }
}
