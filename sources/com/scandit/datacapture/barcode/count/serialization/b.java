package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class b implements BarcodeCountDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17529a;

    public b(BarcodeCountDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f17529a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onBasicOverlayDeserializationFinished(BarcodeCountDeserializer deserializer, BarcodeCountBasicOverlay overlay, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f17529a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onBasicOverlayDeserializationStarted(BarcodeCountDeserializer deserializer, BarcodeCountBasicOverlay overlay, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f17529a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onModeDeserializationFinished(BarcodeCountDeserializer deserializer, BarcodeCount mode, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f17529a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onModeDeserializationStarted(BarcodeCountDeserializer deserializer, BarcodeCount mode, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f17529a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeCountDeserializer deserializer, BarcodeCountSettings settings, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f17529a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeCountDeserializer deserializer, BarcodeCountSettings settings, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f17529a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
