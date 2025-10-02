package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"_modes", "", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "get_modes$annotations", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "get_modes", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Ljava/util/Set;", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataCaptureContextExtensionsKt {
    public static final /* synthetic */ Set get_modes(DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "<this>");
        return dataCaptureContext.get_modes$scandit_capture_core();
    }

    public static /* synthetic */ void get_modes$annotations(DataCaptureContext dataCaptureContext) {
    }
}
