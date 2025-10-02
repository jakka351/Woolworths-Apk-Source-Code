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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.j5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0681j5 {
    public static BarcodePickView a(ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, BarcodePickViewSettings viewSettings, CameraSettings cameraSettings) {
        L4 l4A;
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(viewSettings, "viewSettings");
        Intrinsics.h(cameraSettings, "cameraSettings");
        BarcodePickViewHighlightStyle highlightStyle = viewSettings.getHighlightStyle();
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.Dot) {
            return O8.a(parentView, dataCaptureContext, mode, viewSettings, cameraSettings, (BarcodePickViewHighlightStyle.Dot) highlightStyle);
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular) {
            return O8.a(parentView, dataCaptureContext, mode, viewSettings, cameraSettings, (BarcodePickViewHighlightStyle.Rectangular) highlightStyle);
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            BarcodePickViewHighlightStyle.DotWithIcons dotWithIcons = (BarcodePickViewHighlightStyle.DotWithIcons) highlightStyle;
            Context context = parentView.getContext();
            Intrinsics.g(context, "context");
            BarcodePickBasicOverlay barcodePickBasicOverlay = new BarcodePickBasicOverlay(context, mode, viewSettings);
            BarcodePickDataCaptureViewWrapper barcodePickDataCaptureViewWrapperA = C0822s3.a(context, C0774p3.a(context), viewSettings);
            BarcodePickElementsCache barcodePickElementsCacheA = E3.a(dotWithIcons.getAsyncStyleProvider(), R2.a(dotWithIcons), C0584d4.a(dotWithIcons.get_iconsHolder(), V3.a(dotWithIcons)), dotWithIcons.getStyleResponseCacheEnabled());
            InterfaceC0871u7 interfaceC0871u7A = C0848t7.a();
            CameraManager cameraManagerA = C0824s5.a(CameraPosition.WORLD_FACING, cameraSettings);
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar = BarcodePickDrawer.f17769a;
            BarcodePickDrawer barcodePickDrawerA = C2.a(aVar, barcodePickBasicOverlay, new U8(mode), dotWithIcons, new V8(barcodePickDataCaptureViewWrapperA), new D2(viewSettings.getDrawDebugInfo(), new Size2(BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), PixelExtensionsKt.pxFromDp$default(viewSettings.maxIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(viewSettings.minIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(BarcodePickViewSettingsDefaults.getIconPadding(), (Context) null, 1, (Object) null), new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), 0), barcodePickElementsCacheA);
            BarcodePickDrawer barcodePickDrawerA2 = K3.a(aVar, barcodePickBasicOverlay, new W8(barcodePickDataCaptureViewWrapperA), new L3(new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), viewSettings.getFilterHighlightSettings()));
            InterfaceC0826s7 interfaceC0826s7A = interfaceC0871u7A.a(dotWithIcons);
            Intrinsics.f(barcodePickElementsCacheA, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElementProvider<com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElement>");
            BarcodePickDrawer barcodePickDrawerA3 = AbstractC0650h6.a(aVar, barcodePickDrawerA, barcodePickDrawerA2, S4.a(aVar, barcodePickBasicOverlay, interfaceC0826s7A, barcodePickElementsCacheA, dotWithIcons, AbstractC0915x6.a(context, new X8(barcodePickDataCaptureViewWrapperA), barcodePickElementsCacheA, dotWithIcons)));
            Context context2 = parentView.getContext();
            Intrinsics.g(context2, "parentView.context");
            InterfaceC0933y9 interfaceC0933y9A = C0918x9.a(context2);
            Fe fe = Ge.f17176a;
            ShutterButtonWrapper shutterButtonWrapperA = F9.a(interfaceC0933y9A, I4.a(fe, viewSettings));
            Context context3 = parentView.getContext();
            Intrinsics.g(context3, "parentView.context");
            ExitButtonWrapper exitButtonWrapperA = K6.a(G6.a(context3), AbstractC0780p9.a(fe));
            Context context4 = parentView.getContext();
            Intrinsics.g(context4, "parentView.context");
            InterfaceC0732m8 interfaceC0732m8A = AbstractC0697k5.a(context, viewSettings);
            Context context5 = parentView.getContext();
            Intrinsics.g(context5, "parentView.context");
            return new BarcodePickView(context, parentView, dataCaptureContext, mode, viewSettings, cameraManagerA, barcodePickElementsCacheA, barcodePickDrawerA3, barcodePickDataCaptureViewWrapperA, shutterButtonWrapperA, exitButtonWrapperA, M3.a(context4, interfaceC0732m8A, C0651h7.a(context5)), barcodePickBasicOverlay);
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            BarcodePickViewHighlightStyle.RectangularWithIcons rectangularWithIcons = (BarcodePickViewHighlightStyle.RectangularWithIcons) highlightStyle;
            Context context6 = parentView.getContext();
            Intrinsics.g(context6, "context");
            BarcodePickBasicOverlay barcodePickBasicOverlay2 = new BarcodePickBasicOverlay(context6, mode, viewSettings);
            BarcodePickDataCaptureViewWrapper barcodePickDataCaptureViewWrapperA2 = C0822s3.a(context6, C0774p3.a(context6), viewSettings);
            BarcodePickElementsCache barcodePickElementsCacheA2 = E3.a(rectangularWithIcons.getAsyncStyleProvider(), R2.a(rectangularWithIcons), C0584d4.a(rectangularWithIcons.get_iconsHolder(), V3.a(rectangularWithIcons)), rectangularWithIcons.getStyleResponseCacheEnabled());
            InterfaceC0871u7 interfaceC0871u7A2 = C0848t7.a();
            CameraManager cameraManagerA2 = C0824s5.a(CameraPosition.WORLD_FACING, cameraSettings);
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar2 = BarcodePickDrawer.f17769a;
            BarcodePickDrawer barcodePickDrawerA4 = C2.a(aVar2, barcodePickBasicOverlay2, new Y8(mode), rectangularWithIcons, new Z8(barcodePickDataCaptureViewWrapperA2), new D2(viewSettings.getDrawDebugInfo(), new Size2(BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), PixelExtensionsKt.pxFromDp$default(viewSettings.maxIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(viewSettings.minIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(BarcodePickViewSettingsDefaults.getIconPadding(), (Context) null, 1, (Object) null), new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), 0), barcodePickElementsCacheA2);
            BarcodePickDrawer barcodePickDrawerA5 = K3.a(aVar2, barcodePickBasicOverlay2, new C0521a9(barcodePickDataCaptureViewWrapperA2), new L3(new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), viewSettings.getFilterHighlightSettings()));
            InterfaceC0826s7 interfaceC0826s7A2 = interfaceC0871u7A2.a(rectangularWithIcons);
            Intrinsics.f(barcodePickElementsCacheA2, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElementProvider<com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElement>");
            BarcodePickDrawer barcodePickDrawerA6 = AbstractC0650h6.a(aVar2, barcodePickDrawerA4, barcodePickDrawerA5, S4.a(aVar2, barcodePickBasicOverlay2, interfaceC0826s7A2, barcodePickElementsCacheA2, rectangularWithIcons, AbstractC0701k9.a(new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), new C0537b9(barcodePickDataCaptureViewWrapperA2))));
            Context context7 = parentView.getContext();
            Intrinsics.g(context7, "parentView.context");
            InterfaceC0933y9 interfaceC0933y9A2 = C0918x9.a(context7);
            Fe fe2 = Ge.f17176a;
            ShutterButtonWrapper shutterButtonWrapperA2 = F9.a(interfaceC0933y9A2, I4.a(fe2, viewSettings));
            Context context8 = parentView.getContext();
            Intrinsics.g(context8, "parentView.context");
            ExitButtonWrapper exitButtonWrapperA2 = K6.a(G6.a(context8), AbstractC0780p9.a(fe2));
            Context context9 = parentView.getContext();
            Intrinsics.g(context9, "parentView.context");
            InterfaceC0732m8 interfaceC0732m8A2 = AbstractC0697k5.a(context6, viewSettings);
            Context context10 = parentView.getContext();
            Intrinsics.g(context10, "parentView.context");
            return new BarcodePickView(context6, parentView, dataCaptureContext, mode, viewSettings, cameraManagerA2, barcodePickElementsCacheA2, barcodePickDrawerA6, barcodePickDataCaptureViewWrapperA2, shutterButtonWrapperA2, exitButtonWrapperA2, M3.a(context9, interfaceC0732m8A2, C0651h7.a(context10)), barcodePickBasicOverlay2);
        }
        if (!(highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView)) {
            throw new NoWhenBranchMatchedException();
        }
        BarcodePickViewHighlightStyle.CustomView customView = (BarcodePickViewHighlightStyle.CustomView) highlightStyle;
        Context context11 = parentView.getContext();
        Intrinsics.g(context11, "context");
        BarcodePickBasicOverlay barcodePickBasicOverlay3 = new BarcodePickBasicOverlay(context11, mode, viewSettings);
        BarcodePickDataCaptureViewWrapper barcodePickDataCaptureViewWrapperA3 = C0822s3.a(context11, C0774p3.a(context11), viewSettings);
        BarcodePickElementsCache barcodePickElementsCacheA3 = E3.a(customView.getAsyncCustomViewProvider());
        InterfaceC0871u7 interfaceC0871u7A3 = C0848t7.a();
        CameraManager cameraManagerA3 = C0824s5.a(CameraPosition.WORLD_FACING, cameraSettings);
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar3 = BarcodePickDrawer.f17769a;
        BarcodePickDrawer barcodePickDrawerA7 = AbstractC0547c3.a(aVar3, barcodePickBasicOverlay3, customView.getFitViewsToBarcode(), new Q8(mode), customView, new C0583d3(viewSettings), V2.a(new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), customView.getFitViewsToBarcode(), new P8(barcodePickDataCaptureViewWrapperA3), viewSettings), barcodePickElementsCacheA3, !dataCaptureContext.isFeatureSupported("barcode-ar-full"));
        BarcodePickDrawer barcodePickDrawerA8 = K3.a(aVar3, barcodePickBasicOverlay3, new R8(barcodePickDataCaptureViewWrapperA3), new L3(new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), viewSettings.getFilterHighlightSettings()));
        InterfaceC0826s7 interfaceC0826s7A3 = interfaceC0871u7A3.a(customView);
        Intrinsics.f(barcodePickElementsCacheA3, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElementProvider<com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElement>");
        boolean fitViewsToBarcode = customView.getFitViewsToBarcode();
        if (fitViewsToBarcode) {
            l4A = AbstractC0746n6.a(new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), new S8(barcodePickDataCaptureViewWrapperA3));
        } else {
            if (fitViewsToBarcode) {
                throw new NoWhenBranchMatchedException();
            }
            l4A = AbstractC0714l6.a(new T8(barcodePickDataCaptureViewWrapperA3), barcodePickElementsCacheA3);
        }
        BarcodePickDrawer barcodePickDrawerA9 = AbstractC0650h6.a(aVar3, barcodePickDrawerA7, barcodePickDrawerA8, S4.a(aVar3, barcodePickBasicOverlay3, interfaceC0826s7A3, barcodePickElementsCacheA3, customView, l4A));
        Context context12 = parentView.getContext();
        Intrinsics.g(context12, "parentView.context");
        InterfaceC0933y9 interfaceC0933y9A3 = C0918x9.a(context12);
        Fe fe3 = Ge.f17176a;
        ShutterButtonWrapper shutterButtonWrapperA3 = F9.a(interfaceC0933y9A3, I4.a(fe3, viewSettings));
        Context context13 = parentView.getContext();
        Intrinsics.g(context13, "parentView.context");
        ExitButtonWrapper exitButtonWrapperA3 = K6.a(G6.a(context13), AbstractC0780p9.a(fe3));
        Context context14 = parentView.getContext();
        Intrinsics.g(context14, "parentView.context");
        InterfaceC0732m8 interfaceC0732m8A3 = AbstractC0697k5.a(context11, viewSettings);
        Context context15 = parentView.getContext();
        Intrinsics.g(context15, "parentView.context");
        return new BarcodePickView(context11, parentView, dataCaptureContext, mode, viewSettings, cameraManagerA3, barcodePickElementsCacheA3, barcodePickDrawerA9, barcodePickDataCaptureViewWrapperA3, shutterButtonWrapperA3, exitButtonWrapperA3, M3.a(context14, interfaceC0732m8A3, C0651h7.a(context15)), barcodePickBasicOverlay3);
    }
}
