package com.scandit.datacapture.core.component.serialization;

import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureComponentDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ProxyBaseClass(NativeDataCaptureComponentDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/component/serialization/DataCaptureComponentDeserializer;", "", "_helper", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "_componentDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureComponentDeserializer;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DataCaptureComponentDeserializer {
    @NativeImpl
    @NotNull
    NativeDataCaptureComponentDeserializer _componentDeserializerImpl();

    @NotNull
    DataCaptureDeserializerHelper get_helper();
}
