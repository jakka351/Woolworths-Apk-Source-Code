package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0838f implements BarcodeSelectionDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18046a;

    public C0838f(BarcodeSelectionDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f18046a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onBasicOverlayDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelectionBasicOverlay overlay, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f18046a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onBasicOverlayDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelectionBasicOverlay overlay, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f18046a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onModeDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelection mode, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f18046a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onModeDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelection mode, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f18046a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelectionSettings settings, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f18046a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelectionSettings settings, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f18046a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
