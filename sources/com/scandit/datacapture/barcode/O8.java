package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper;
import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import com.scandit.datacapture.barcode.internal.sdk.pick.ui.BarcodePickViewSettingsDefaults;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickView;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class O8 {
    public static BarcodePickView a(ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, BarcodePickViewSettings viewSettings, CameraSettings cameraSettings, BarcodePickViewHighlightStyle.Rectangular castedStyle) {
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(viewSettings, "viewSettings");
        Intrinsics.h(cameraSettings, "cameraSettings");
        Intrinsics.h(castedStyle, "castedStyle");
        return a(parentView, dataCaptureContext, mode, viewSettings, cameraSettings, castedStyle, R2.a(castedStyle));
    }

    public static BarcodePickView a(ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, BarcodePickViewSettings viewSettings, CameraSettings cameraSettings, BarcodePickViewHighlightStyle.Dot castedStyle) {
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(viewSettings, "viewSettings");
        Intrinsics.h(cameraSettings, "cameraSettings");
        Intrinsics.h(castedStyle, "castedStyle");
        return a(parentView, dataCaptureContext, mode, viewSettings, cameraSettings, castedStyle, R2.a(castedStyle));
    }

    private static BarcodePickView a(ViewGroup viewGroup, DataCaptureContext dataCaptureContext, BarcodePick barcodePick, BarcodePickViewSettings viewSettings, CameraSettings cameraSettings, BarcodePickViewHighlightStyle barcodePickViewHighlightStyle, S2 s2) {
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "context");
        BarcodePickBasicOverlay barcodePickBasicOverlay = new BarcodePickBasicOverlay(context, barcodePick, viewSettings);
        Intrinsics.h(viewSettings, "viewSettings");
        BarcodePickDataCaptureViewWrapper barcodePickDataCaptureViewWrapperA = C0822s3.a(context, C0774p3.a(context), viewSettings);
        BarcodePickElementsCache barcodePickElementsCacheA = E3.a(null, s2, C0632g4.f17678a, false);
        CameraManager cameraManagerA = C0824s5.a(CameraPosition.WORLD_FACING, cameraSettings);
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar = BarcodePickDrawer.f17769a;
        BarcodePickDrawer barcodePickDrawerA = AbstractC0650h6.a(aVar, C2.a(aVar, barcodePickBasicOverlay, new L8(barcodePick), barcodePickViewHighlightStyle, new M8(barcodePickDataCaptureViewWrapperA), new D2(viewSettings.getDrawDebugInfo(), new Size2(BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), PixelExtensionsKt.pxFromDp$default(viewSettings.maxIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(viewSettings.minIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(BarcodePickViewSettingsDefaults.getIconPadding(), (Context) null, 1, (Object) null), new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), 0), barcodePickElementsCacheA), K3.a(aVar, barcodePickBasicOverlay, new N8(barcodePickDataCaptureViewWrapperA), new L3(new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), viewSettings.getFilterHighlightSettings())));
        Context context2 = viewGroup.getContext();
        Intrinsics.g(context2, "parentView.context");
        InterfaceC0933y9 interfaceC0933y9A = C0918x9.a(context2);
        Fe fe = Ge.f17176a;
        ShutterButtonWrapper shutterButtonWrapperA = F9.a(interfaceC0933y9A, I4.a(fe, viewSettings));
        Context context3 = viewGroup.getContext();
        Intrinsics.g(context3, "parentView.context");
        ExitButtonWrapper exitButtonWrapperA = K6.a(G6.a(context3), AbstractC0780p9.a(fe));
        Context context4 = viewGroup.getContext();
        Intrinsics.g(context4, "parentView.context");
        InterfaceC0732m8 interfaceC0732m8A = AbstractC0697k5.a(context, viewSettings);
        Context context5 = viewGroup.getContext();
        Intrinsics.g(context5, "parentView.context");
        return new BarcodePickView(context, viewGroup, dataCaptureContext, barcodePick, viewSettings, cameraManagerA, barcodePickElementsCacheA, barcodePickDrawerA, barcodePickDataCaptureViewWrapperA, shutterButtonWrapperA, exitButtonWrapperA, M3.a(context4, interfaceC0732m8A, C0651h7.a(context5)), barcodePickBasicOverlay);
    }
}
