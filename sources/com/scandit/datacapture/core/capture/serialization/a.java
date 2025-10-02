package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements DataCaptureContextDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18454a;

    public a(DataCaptureContextDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f18454a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerListener
    public final void onContextDeserializationFinished(DataCaptureContextDeserializer deserializer, DataCaptureContext dataCaptureContext, JsonValue json) {
        DataCaptureContextDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(json, "json");
        DataCaptureContextDeserializer dataCaptureContextDeserializer = (DataCaptureContextDeserializer) this.f18454a.get();
        if (dataCaptureContextDeserializer == null || (listener = dataCaptureContextDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onContextDeserializationFinished(deserializer, dataCaptureContext, json);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerListener
    public final void onContextDeserializationStarted(DataCaptureContextDeserializer deserializer, DataCaptureContext dataCaptureContext, JsonValue json) {
        DataCaptureContextDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(json, "json");
        DataCaptureContextDeserializer dataCaptureContextDeserializer = (DataCaptureContextDeserializer) this.f18454a.get();
        if (dataCaptureContextDeserializer == null || (listener = dataCaptureContextDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onContextDeserializationStarted(deserializer, dataCaptureContext, json);
    }
}
