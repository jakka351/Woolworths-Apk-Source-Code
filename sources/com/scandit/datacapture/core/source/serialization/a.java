package com.scandit.datacapture.core.source.serialization;

import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements FrameSourceDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18861a;

    public a(FrameSourceDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f18861a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerListener
    public final void onCameraSettingsDeserializationFinished(FrameSourceDeserializer deserializer, CameraSettings settings, JsonValue json) {
        FrameSourceDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f18861a.get();
        if (frameSourceDeserializer == null || (listener = frameSourceDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onCameraSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerListener
    public final void onCameraSettingsDeserializationStarted(FrameSourceDeserializer deserializer, CameraSettings settings, JsonValue json) {
        FrameSourceDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f18861a.get();
        if (frameSourceDeserializer == null || (listener = frameSourceDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onCameraSettingsDeserializationStarted(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerListener
    public final void onFrameSourceDeserializationFinished(FrameSourceDeserializer deserializer, FrameSource frameSource, JsonValue json) {
        FrameSourceDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f18861a.get();
        if (frameSourceDeserializer == null || (listener = frameSourceDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onFrameSourceDeserializationFinished(deserializer, frameSource, json);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerListener
    public final void onFrameSourceDeserializationStarted(FrameSourceDeserializer deserializer, FrameSource frameSource, JsonValue json) {
        FrameSourceDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f18861a.get();
        if (frameSourceDeserializer == null || (listener = frameSourceDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onFrameSourceDeserializationStarted(deserializer, frameSource, json);
    }
}
