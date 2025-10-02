package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.capture.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0559e implements BarcodeCaptureDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17442a;

    public C0559e(BarcodeCaptureDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f17442a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onModeDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCapture mode, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f17442a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onModeDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCapture mode, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f17442a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onOverlayDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCaptureOverlay overlay, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f17442a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onOverlayDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCaptureOverlay overlay, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f17442a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCaptureSettings settings, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f17442a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCaptureSettings settings, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f17442a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
