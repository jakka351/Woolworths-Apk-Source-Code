package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements DataCaptureViewDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18942a;

    public a(DataCaptureViewDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f18942a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerListener
    public final void onViewDeserializationFinished(DataCaptureViewDeserializer deserializer, DataCaptureView view, JsonValue json) {
        DataCaptureViewDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        DataCaptureViewDeserializer dataCaptureViewDeserializer = (DataCaptureViewDeserializer) this.f18942a.get();
        if (dataCaptureViewDeserializer == null || (listener = dataCaptureViewDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onViewDeserializationFinished(deserializer, view, json);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerListener
    public final void onViewDeserializationStarted(DataCaptureViewDeserializer deserializer, DataCaptureView view, JsonValue json) {
        DataCaptureViewDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        DataCaptureViewDeserializer dataCaptureViewDeserializer = (DataCaptureViewDeserializer) this.f18942a.get();
        if (dataCaptureViewDeserializer == null || (listener = dataCaptureViewDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onViewDeserializationStarted(deserializer, view, json);
    }
}
