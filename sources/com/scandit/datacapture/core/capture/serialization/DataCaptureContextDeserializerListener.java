package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerListener;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = DataCaptureContextDeserializer.class, value = NativeDataCaptureContextDeserializerListener.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "", "onContextDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onContextDeserializationStarted", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DataCaptureContextDeserializerListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onContextDeserializationFinished(@NotNull DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener, @NotNull DataCaptureContextDeserializer deserializer, @NotNull DataCaptureContext dataCaptureContext, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onContextDeserializationStarted(@NotNull DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener, @NotNull DataCaptureContextDeserializer deserializer, @NotNull DataCaptureContext dataCaptureContext, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(json, "json");
        }
    }

    @ProxyFunction
    void onContextDeserializationFinished(@NotNull DataCaptureContextDeserializer deserializer, @NotNull DataCaptureContext dataCaptureContext, @NotNull JsonValue json);

    @ProxyFunction
    void onContextDeserializationStarted(@NotNull DataCaptureContextDeserializer deserializer, @NotNull DataCaptureContext dataCaptureContext, @NotNull JsonValue json);
}
