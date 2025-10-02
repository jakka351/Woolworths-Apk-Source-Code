package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.tracking.capture.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0859e implements BarcodeTrackingDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18169a;

    public C0859e(BarcodeTrackingDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f18169a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerListener
    public final void onAdvancedOverlayDeserializationFinished(BarcodeTrackingDeserializer deserializer, BarcodeTrackingAdvancedOverlay overlay, JsonValue json) {
        BarcodeTrackingDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.f18169a.get();
        if (barcodeTrackingDeserializer == null || (listener = barcodeTrackingDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onAdvancedOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerListener
    public final void onAdvancedOverlayDeserializationStarted(BarcodeTrackingDeserializer deserializer, BarcodeTrackingAdvancedOverlay overlay, JsonValue json) {
        BarcodeTrackingDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.f18169a.get();
        if (barcodeTrackingDeserializer == null || (listener = barcodeTrackingDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onAdvancedOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerListener
    public final void onBasicOverlayDeserializationFinished(BarcodeTrackingDeserializer deserializer, BarcodeTrackingBasicOverlay overlay, JsonValue json) {
        BarcodeTrackingDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.f18169a.get();
        if (barcodeTrackingDeserializer == null || (listener = barcodeTrackingDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerListener
    public final void onBasicOverlayDeserializationStarted(BarcodeTrackingDeserializer deserializer, BarcodeTrackingBasicOverlay overlay, JsonValue json) {
        BarcodeTrackingDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.f18169a.get();
        if (barcodeTrackingDeserializer == null || (listener = barcodeTrackingDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerListener
    public final void onModeDeserializationFinished(BarcodeTrackingDeserializer deserializer, BarcodeTracking mode, JsonValue json) {
        BarcodeTrackingDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.f18169a.get();
        if (barcodeTrackingDeserializer == null || (listener = barcodeTrackingDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerListener
    public final void onModeDeserializationStarted(BarcodeTrackingDeserializer deserializer, BarcodeTracking mode, JsonValue json) {
        BarcodeTrackingDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.f18169a.get();
        if (barcodeTrackingDeserializer == null || (listener = barcodeTrackingDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeTrackingDeserializer deserializer, BarcodeTrackingSettings settings, JsonValue json) {
        BarcodeTrackingDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.f18169a.get();
        if (barcodeTrackingDeserializer == null || (listener = barcodeTrackingDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeTrackingDeserializer deserializer, BarcodeTrackingSettings settings, JsonValue json) {
        BarcodeTrackingDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.f18169a.get();
        if (barcodeTrackingDeserializer == null || (listener = barcodeTrackingDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
