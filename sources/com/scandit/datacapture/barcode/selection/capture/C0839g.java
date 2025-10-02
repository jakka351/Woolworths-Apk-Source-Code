package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeSelectionFeedbackDeserializer;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayStyle;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0839g implements BarcodeSelectionDeserializerHelper, DataCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f18047a = new WeakReference(null);
    private BarcodeSelectionType b;
    private BarcodeSelectionStrategy c;

    public final void a(WeakReference weakReference) {
        Intrinsics.h(weakReference, "<set-?>");
        this.f18047a = weakReference;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void applySettings(BarcodeSelection mode, BarcodeSelectionSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        BarcodeSelection.applySettings$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void changeBasicOverlayAddedToView(BarcodeSelectionBasicOverlay overlay, DataCaptureView view, boolean z) {
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
        this.b = null;
        this.c = null;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionAimerSelection createAimerSelection() {
        BarcodeSelectionAimerSelection barcodeSelectionAimerSelection = new BarcodeSelectionAimerSelection();
        this.b = barcodeSelectionAimerSelection;
        return barcodeSelectionAimerSelection;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionAutoSelectionStrategy createAutoSelectionStrategy() {
        BarcodeSelectionAutoSelectionStrategy barcodeSelectionAutoSelectionStrategy = new BarcodeSelectionAutoSelectionStrategy();
        this.c = barcodeSelectionAutoSelectionStrategy;
        return barcodeSelectionAutoSelectionStrategy;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionBasicOverlay createBasicOverlay(BarcodeSelection mode, BarcodeSelectionBasicOverlayStyle style) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(style, "style");
        Object obj = this.f18047a.get();
        Intrinsics.e(obj);
        Viewfinder viewfinder_getAndResetLastViewfinder = ((BarcodeSelectionDeserializer) obj).getViewfinderDeserializer()._getAndResetLastViewfinder();
        BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlayNewInstance = BarcodeSelectionBasicOverlay.INSTANCE.newInstance(mode, null, style);
        if ((viewfinder_getAndResetLastViewfinder instanceof AimerViewfinder) && (barcodeSelectionBasicOverlayNewInstance.getViewfinder() instanceof AimerViewfinder)) {
            AimerViewfinder aimerViewfinder = (AimerViewfinder) viewfinder_getAndResetLastViewfinder;
            ((AimerViewfinder) barcodeSelectionBasicOverlayNewInstance.getViewfinder()).setDotColor(aimerViewfinder.getDotColor());
            ((AimerViewfinder) barcodeSelectionBasicOverlayNewInstance.getViewfinder()).setFrameColor(aimerViewfinder.getFrameColor());
        }
        return barcodeSelectionBasicOverlayNewInstance;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionManualSelectionStrategy createManualSelectionStrategy() {
        BarcodeSelectionManualSelectionStrategy barcodeSelectionManualSelectionStrategy = new BarcodeSelectionManualSelectionStrategy();
        this.c = barcodeSelectionManualSelectionStrategy;
        return barcodeSelectionManualSelectionStrategy;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelection createMode(DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        return BarcodeSelection.INSTANCE.forDataCaptureContext(dataCaptureContext, new BarcodeSelectionSettings());
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final CameraSettings createRecommendedCameraSettings() {
        return BarcodeSelection.INSTANCE.createRecommendedCameraSettings();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionSettings createSettings() {
        return new BarcodeSelectionSettings();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionTapSelection createTapSelection() {
        BarcodeSelectionTapSelection barcodeSelectionTapSelection = new BarcodeSelectionTapSelection();
        this.b = barcodeSelectionTapSelection;
        return barcodeSelectionTapSelection;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void updateBasicOverlayFromJson(BarcodeSelectionBasicOverlay overlay, JsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        Object obj = this.f18047a.get();
        Intrinsics.e(obj);
        Viewfinder viewfinder_getAndResetLastViewfinder = ((BarcodeSelectionDeserializer) obj).getViewfinderDeserializer()._getAndResetLastViewfinder();
        Viewfinder viewfinder = overlay.getViewfinder();
        if ((viewfinder_getAndResetLastViewfinder instanceof AimerViewfinder) && (viewfinder instanceof AimerViewfinder)) {
            AimerViewfinder aimerViewfinder = (AimerViewfinder) viewfinder;
            AimerViewfinder aimerViewfinder2 = (AimerViewfinder) viewfinder_getAndResetLastViewfinder;
            aimerViewfinder.setDotColor(aimerViewfinder2.getDotColor());
            aimerViewfinder.setFrameColor(aimerViewfinder2.getFrameColor());
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void updateModeFromJson(BarcodeSelection mode, JsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        JsonValue byKeyAsObject = json.getByKeyAsObject("feedback", null);
        if (byKeyAsObject != null) {
            mode.setFeedback(BarcodeSelectionFeedbackDeserializer.fromJson(byKeyAsObject));
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void updateSettingsFromJson(BarcodeSelectionSettings settings, JsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeSelectionType barcodeSelectionType = this.b;
        if (barcodeSelectionType != null) {
            BarcodeSelectionStrategy barcodeSelectionStrategy = this.c;
            if (barcodeSelectionStrategy != null) {
                BarcodeSelectionAimerSelection barcodeSelectionAimerSelection = barcodeSelectionType instanceof BarcodeSelectionAimerSelection ? (BarcodeSelectionAimerSelection) barcodeSelectionType : null;
                if (barcodeSelectionAimerSelection != null) {
                    barcodeSelectionAimerSelection.setSelectionStrategy(barcodeSelectionStrategy);
                }
            }
            settings.setSelectionType(barcodeSelectionType);
        }
    }
}
