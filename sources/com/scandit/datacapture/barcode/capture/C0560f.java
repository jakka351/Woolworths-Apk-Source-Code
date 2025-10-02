package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeCaptureFeedbackDeserializer;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayStyle;
import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.area.NoLocationSelection;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinder;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.capture.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0560f implements BarcodeCaptureDeserializerHelper, DataCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f17443a = new WeakReference(null);

    public final void a(WeakReference weakReference) {
        Intrinsics.h(weakReference, "<set-?>");
        this.f17443a = weakReference;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void applySettings(BarcodeCapture mode, BarcodeCaptureSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        BarcodeCapture.applySettings$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void changeOverlayAddedToView(BarcodeCaptureOverlay overlay, DataCaptureView view, boolean z) {
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

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final BarcodeCapture createMode(DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        return BarcodeCapture.INSTANCE.forDataCaptureContext(dataCaptureContext, new BarcodeCaptureSettings());
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final BarcodeCaptureOverlay createOverlay(BarcodeCapture mode, BarcodeCaptureOverlayStyle style) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(style, "style");
        Object obj = this.f17443a.get();
        Intrinsics.e(obj);
        ((BarcodeCaptureDeserializer) obj).getViewfinderDeserializer()._getAndResetLastViewfinder();
        return BarcodeCaptureOverlay.INSTANCE.newInstance(mode, null, style);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final CameraSettings createRecommendedCameraSettings() {
        return BarcodeCapture.INSTANCE.createRecommendedCameraSettings();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final BarcodeCaptureSettings createSettings() {
        Object obj = this.f17443a.get();
        Intrinsics.e(obj);
        ((BarcodeCaptureDeserializer) obj).getLocationSelectionDeserializer()._getAndResetLastLocationSelection();
        return new BarcodeCaptureSettings();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void updateModeFromJson(BarcodeCapture mode, JsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        JsonValue byKeyAsObject = json.getByKeyAsObject("feedback", null);
        if (byKeyAsObject != null) {
            mode.setFeedback(BarcodeCaptureFeedbackDeserializer.fromJson(byKeyAsObject));
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void updateOverlayFromJson(BarcodeCaptureOverlay overlay, JsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        Object obj = this.f17443a.get();
        Intrinsics.e(obj);
        Viewfinder viewfinder_getAndResetLastViewfinder = ((BarcodeCaptureDeserializer) obj).getViewfinderDeserializer()._getAndResetLastViewfinder();
        if (viewfinder_getAndResetLastViewfinder != null) {
            if (viewfinder_getAndResetLastViewfinder instanceof NoViewfinder) {
                viewfinder_getAndResetLastViewfinder = null;
            }
            overlay.setViewfinder(viewfinder_getAndResetLastViewfinder);
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void updateSettingsFromJson(BarcodeCaptureSettings settings, JsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        Object obj = this.f17443a.get();
        Intrinsics.e(obj);
        LocationSelection locationSelection_getAndResetLastLocationSelection = ((BarcodeCaptureDeserializer) obj).getLocationSelectionDeserializer()._getAndResetLastLocationSelection();
        if (locationSelection_getAndResetLastLocationSelection != null) {
            if (locationSelection_getAndResetLastLocationSelection instanceof NoLocationSelection) {
                locationSelection_getAndResetLastLocationSelection = null;
            }
            settings.setLocationSelection(locationSelection_getAndResetLastLocationSelection);
        }
    }
}
