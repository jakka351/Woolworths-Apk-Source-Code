package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.tracking.capture.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0860f implements BarcodeTrackingDeserializerHelper, DataCaptureDeserializerHelper {
    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final void applySettings(BarcodeTracking mode, BarcodeTrackingSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        BarcodeTracking.applySettings$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final void changeAdvancedOverlayAddedToView(BarcodeTrackingAdvancedOverlay overlay, DataCaptureView view, boolean z) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(view, "view");
        if (z) {
            view.addOverlay(overlay);
        } else {
            view.removeOverlay(overlay);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final void changeBasicOverlayAddedToView(BarcodeTrackingBasicOverlay overlay, DataCaptureView view, boolean z) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(view, "view");
        if (z) {
            view.addOverlay(overlay);
        } else {
            view.removeOverlay(overlay);
        }
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final BarcodeTrackingAdvancedOverlay createAdvancedOverlay(BarcodeTracking mode) {
        Intrinsics.h(mode, "mode");
        return BarcodeTrackingAdvancedOverlay.INSTANCE.deserializerInstance$scandit_barcode_capture(mode, null);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final BarcodeTrackingBasicOverlay createBasicOverlay(BarcodeTracking mode, BarcodeTrackingBasicOverlayStyle style) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(style, "style");
        return BarcodeTrackingBasicOverlay.INSTANCE.newInstance(mode, null, style);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final BarcodeTracking createMode(DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        return BarcodeTracking.INSTANCE.forDataCaptureContext(dataCaptureContext, new BarcodeTrackingSettings());
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final CameraSettings createRecommendedCameraSettings() {
        return BarcodeTracking.INSTANCE.createRecommendedCameraSettings();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final BarcodeTrackingSettings createSettings() {
        return new BarcodeTrackingSettings();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final BarcodeTrackingSettings createSettingsForScenario(NativeObjectTrackerScenario scenario) {
        Intrinsics.h(scenario, "scenario");
        return BarcodeTrackingSettings.INSTANCE.forScenario(BarcodeTrackingSettingsKt.toPublic(scenario));
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final void updateAdvancedOverlayFromJson(BarcodeTrackingAdvancedOverlay overlay, JsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final void updateBasicOverlayFromJson(BarcodeTrackingBasicOverlay overlay, JsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final void updateModeFromJson(BarcodeTracking mode, JsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerHelper
    public final void updateSettingsFromJson(BarcodeTrackingSettings settings, JsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
    }
}
