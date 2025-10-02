package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDot;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightType;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class g implements BarcodePickDeserializerHelper, DataCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private BarcodePickSettings f17926a;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final void a(BarcodePick mode, JsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
        this.f17926a = null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final BarcodePickSettings createSettings() {
        BarcodePickSettings barcodePickSettings = this.f17926a;
        if (barcodePickSettings != null) {
            return barcodePickSettings;
        }
        BarcodePickSettings barcodePickSettings2 = new BarcodePickSettings();
        this.f17926a = barcodePickSettings2;
        return barcodePickSettings2;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final BarcodePick a(DataCaptureContext dataCaptureContext, BarcodePickProductProvider provider) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(provider, "provider");
        BarcodePickSettings barcodePickSettings = new BarcodePickSettings();
        this.f17926a = barcodePickSettings;
        return new BarcodePick(dataCaptureContext, barcodePickSettings, provider);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final void a(BarcodePickSettings settings, JsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        settings._updateFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final void a(BarcodePick mode, BarcodePickSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        BarcodePick._applySettings$scandit_barcode_capture$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final BarcodePickBasicOverlay a(BarcodePick mode, BarcodePickViewSettings viewSettings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(viewSettings, "viewSettings");
        return new BarcodePickBasicOverlay(AppAndroidEnvironment.INSTANCE.getApplicationContext(), mode, viewSettings);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final BarcodePickViewSettings a() {
        return new BarcodePickViewSettings();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final void a(BarcodePickViewSettings viewSettings, JsonValue json) {
        BarcodePickViewHighlightStyle rectangular;
        BarcodePickViewHighlightStyle rectangularWithIcons;
        Intrinsics.h(viewSettings, "viewSettings");
        Intrinsics.h(json, "json");
        BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        JsonValue byKeyAsObject = json.getByKeyAsObject("highlightStyle", null);
        if (byKeyAsObject == null) {
            return;
        }
        NativeBarcodePickViewHighlightType highlightStyleType = viewSettings.getF17954a().getHighlightStyleType();
        Intrinsics.e(highlightStyleType);
        int i = BarcodePickDeserializer$Helper$WhenMappings.$EnumSwitchMapping$0[highlightStyleType.ordinal()];
        if (i != 1) {
            int i2 = 2;
            int i3 = 0;
            if (i == 2) {
                NativeBarcodePickViewHighlightStyleRectangularWithIcons highlightStyleAsRectangularWithIcons = viewSettings.getF17954a().getHighlightStyleAsRectangularWithIcons();
                Intrinsics.g(highlightStyleAsRectangularWithIcons, "viewSettings._impl().hig…yleAsRectangularWithIcons");
                rectangularWithIcons = new BarcodePickViewHighlightStyle.RectangularWithIcons(highlightStyleAsRectangularWithIcons, b2 == true ? 1 : 0, i2, b == true ? 1 : 0);
                c cVar = c.f17922a;
                d dVar = d.f17923a;
                if (byKeyAsObject.contains(BarcodePickDeserializer.FIELD_ICONS_FOR_STATE)) {
                    JsonValue jsonValueRequireByKeyAsArray = byKeyAsObject.requireByKeyAsArray(BarcodePickDeserializer.FIELD_ICONS_FOR_STATE);
                    int size = (int) jsonValueRequireByKeyAsArray.getSize();
                    for (int i4 = 0; i4 < size; i4++) {
                        JsonValue jsonValueRequireByIndex = jsonValueRequireByKeyAsArray.requireByIndex(i4);
                        cVar.invoke(rectangularWithIcons, BitmapExtensionsKt.bitmapFromBase64(jsonValueRequireByIndex.requireByKeyAsString(BarcodePickDeserializer.FIELD_ICON)), BarcodePickState.INSTANCE.fromJsonString(jsonValueRequireByIndex.requireByKeyAsString(BarcodePickDeserializer.FIELD_BARCODE_PICK_STATE)));
                    }
                }
                e eVar = e.f17924a;
                f fVar = f.f17925a;
                if (byKeyAsObject.contains(BarcodePickDeserializer.FIELD_SELECTED_ICONS_FOR_STATE)) {
                    JsonValue jsonValueRequireByKeyAsArray2 = byKeyAsObject.requireByKeyAsArray(BarcodePickDeserializer.FIELD_SELECTED_ICONS_FOR_STATE);
                    int size2 = (int) jsonValueRequireByKeyAsArray2.getSize();
                    while (i3 < size2) {
                        JsonValue jsonValueRequireByIndex2 = jsonValueRequireByKeyAsArray2.requireByIndex(i3);
                        eVar.invoke(rectangularWithIcons, BitmapExtensionsKt.bitmapFromBase64(jsonValueRequireByIndex2.requireByKeyAsString(BarcodePickDeserializer.FIELD_ICON)), BarcodePickState.INSTANCE.fromJsonString(jsonValueRequireByIndex2.requireByKeyAsString(BarcodePickDeserializer.FIELD_BARCODE_PICK_STATE)));
                        i3++;
                    }
                }
            } else if (i == 3) {
                NativeBarcodePickViewHighlightStyleDot highlightStyleAsDot = viewSettings.getF17954a().getHighlightStyleAsDot();
                Intrinsics.g(highlightStyleAsDot, "viewSettings._impl().highlightStyleAsDot");
                rectangular = new BarcodePickViewHighlightStyle.Dot(highlightStyleAsDot);
            } else if (i == 4) {
                NativeBarcodePickViewHighlightStyleDotWithIcons highlightStyleAsDotWithIcons = viewSettings.getF17954a().getHighlightStyleAsDotWithIcons();
                Intrinsics.g(highlightStyleAsDotWithIcons, "viewSettings._impl().highlightStyleAsDotWithIcons");
                rectangularWithIcons = new BarcodePickViewHighlightStyle.DotWithIcons(highlightStyleAsDotWithIcons, barcodePickHighlightStyleIconsHolder, i2, b3 == true ? 1 : 0);
                c cVar2 = c.f17922a;
                d dVar2 = d.f17923a;
                if (byKeyAsObject.contains(BarcodePickDeserializer.FIELD_ICONS_FOR_STATE)) {
                    JsonValue jsonValueRequireByKeyAsArray3 = byKeyAsObject.requireByKeyAsArray(BarcodePickDeserializer.FIELD_ICONS_FOR_STATE);
                    int size3 = (int) jsonValueRequireByKeyAsArray3.getSize();
                    for (int i5 = 0; i5 < size3; i5++) {
                        JsonValue jsonValueRequireByIndex3 = jsonValueRequireByKeyAsArray3.requireByIndex(i5);
                        dVar2.invoke(rectangularWithIcons, BitmapExtensionsKt.bitmapFromBase64(jsonValueRequireByIndex3.requireByKeyAsString(BarcodePickDeserializer.FIELD_ICON)), BarcodePickState.INSTANCE.fromJsonString(jsonValueRequireByIndex3.requireByKeyAsString(BarcodePickDeserializer.FIELD_BARCODE_PICK_STATE)));
                    }
                }
                e eVar2 = e.f17924a;
                f fVar2 = f.f17925a;
                if (byKeyAsObject.contains(BarcodePickDeserializer.FIELD_SELECTED_ICONS_FOR_STATE)) {
                    JsonValue jsonValueRequireByKeyAsArray4 = byKeyAsObject.requireByKeyAsArray(BarcodePickDeserializer.FIELD_SELECTED_ICONS_FOR_STATE);
                    int size4 = (int) jsonValueRequireByKeyAsArray4.getSize();
                    while (i3 < size4) {
                        JsonValue jsonValueRequireByIndex4 = jsonValueRequireByKeyAsArray4.requireByIndex(i3);
                        fVar2.invoke(rectangularWithIcons, BitmapExtensionsKt.bitmapFromBase64(jsonValueRequireByIndex4.requireByKeyAsString(BarcodePickDeserializer.FIELD_ICON)), BarcodePickState.INSTANCE.fromJsonString(jsonValueRequireByIndex4.requireByKeyAsString(BarcodePickDeserializer.FIELD_BARCODE_PICK_STATE)));
                        i3++;
                    }
                }
            } else if (i == 5) {
                NativeBarcodePickViewHighlightStyleCustomView highlightStyleAsCustomView = viewSettings.getF17954a().getHighlightStyleAsCustomView();
                Intrinsics.g(highlightStyleAsCustomView, "viewSettings._impl().highlightStyleAsCustomView");
                rectangular = new BarcodePickViewHighlightStyle.CustomView(highlightStyleAsCustomView);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            rectangular = rectangularWithIcons;
        } else {
            NativeBarcodePickViewHighlightStyleRectangular highlightStyleAsRectangular = viewSettings.getF17954a().getHighlightStyleAsRectangular();
            Intrinsics.g(highlightStyleAsRectangular, "viewSettings._impl().highlightStyleAsRectangular");
            rectangular = new BarcodePickViewHighlightStyle.Rectangular(highlightStyleAsRectangular);
        }
        viewSettings.setHighlightStyle(rectangular);
    }
}
