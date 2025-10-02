package com.scandit.datacapture.barcode.spark.serialization;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.scandit.datacapture.barcode.C0577cd;
import com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanViewSettingsDeserializer;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanViewDeserializer;", "", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "view", "", "jsonData", "updateViewFromJson", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "mode", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "json", "viewFrom", "Lcom/scandit/datacapture/barcode/internal/module/spark/serialization/SparkScanViewSettingsDeserializer;", "viewSettingsDeserializer", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "settingsFactory", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/spark/serialization/SparkScanViewSettingsDeserializer;Lkotlin/jvm/functions/Function0;)V", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanViewDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewSettingsDeserializer f18116a;
    private final Function0 b;

    @VisibleForTesting
    public SparkScanViewDeserializer(@NotNull SparkScanViewSettingsDeserializer viewSettingsDeserializer, @NotNull Function0<SparkScanViewSettings> settingsFactory) {
        Intrinsics.h(viewSettingsDeserializer, "viewSettingsDeserializer");
        Intrinsics.h(settingsFactory, "settingsFactory");
        this.f18116a = viewSettingsDeserializer;
        this.b = settingsFactory;
    }

    @NotNull
    public final SparkScanView updateViewFromJson(@NotNull SparkScanView view, @NotNull String jsonData) {
        Intrinsics.h(view, "view");
        Intrinsics.h(jsonData, "jsonData");
        JsonValue jsonValue = new JsonValue(jsonData);
        if (jsonValue.contains("shouldShowScanAreaGuides")) {
            view.setShouldShowScanAreaGuides(jsonValue.requireByKeyAsBoolean("shouldShowScanAreaGuides"));
        }
        if (jsonValue.contains("torchButtonVisible")) {
            view.setTorchButtonVisible(jsonValue.requireByKeyAsBoolean("torchButtonVisible"));
        }
        if (jsonValue.contains("scanningBehaviorButtonVisible")) {
            view.setScanningBehaviorButtonVisible(jsonValue.requireByKeyAsBoolean("scanningBehaviorButtonVisible"));
        }
        if (jsonValue.contains("handModeButtonVisible")) {
            view.setHandModeButtonVisible(jsonValue.requireByKeyAsBoolean("handModeButtonVisible"));
        }
        if (jsonValue.contains("stopCapturingText")) {
            view.setStopCapturingText(jsonValue.requireByKeyAsString("stopCapturingText"));
        }
        if (jsonValue.contains("startCapturingText")) {
            view.setStartCapturingText(jsonValue.requireByKeyAsString("startCapturingText"));
        }
        if (jsonValue.contains("resumeCapturingText")) {
            view.setResumeCapturingText(jsonValue.requireByKeyAsString("resumeCapturingText"));
        }
        if (jsonValue.contains("scanningCapturingText")) {
            view.setScanningCapturingText(jsonValue.requireByKeyAsString("scanningCapturingText"));
        }
        if (jsonValue.contains("captureButtonBackgroundColor")) {
            view.setCaptureButtonBackgroundColor(Integer.valueOf(jsonValue.requireByKeyAsColor("captureButtonBackgroundColor")));
        }
        if (jsonValue.contains("captureButtonActiveBackgroundColor")) {
            view.setCaptureButtonActiveBackgroundColor(Integer.valueOf(jsonValue.requireByKeyAsColor("captureButtonActiveBackgroundColor")));
        }
        if (jsonValue.contains("toolbarBackgroundColor")) {
            view.setToolbarBackgroundColor(Integer.valueOf(jsonValue.requireByKeyAsColor("toolbarBackgroundColor")));
        }
        if (jsonValue.contains("barcodeCountButtonVisible")) {
            view.setBarcodeCountButtonVisible(jsonValue.requireByKeyAsBoolean("barcodeCountButtonVisible"));
        }
        if (jsonValue.contains("barcodeFindButtonVisible")) {
            view.setBarcodeFindButtonVisible(jsonValue.requireByKeyAsBoolean("barcodeFindButtonVisible"));
        }
        if (jsonValue.contains("targetModeButtonVisible")) {
            view.setTargetModeButtonVisible(jsonValue.requireByKeyAsBoolean("targetModeButtonVisible"));
        }
        if (jsonValue.contains("toolbarIconActiveTintColor")) {
            view.setToolbarIconActiveTintColor(Integer.valueOf(jsonValue.requireByKeyAsColor("toolbarIconActiveTintColor")));
        }
        if (jsonValue.contains("toolbarIconInactiveTintColor")) {
            view.setToolbarIconInactiveTintColor(Integer.valueOf(jsonValue.requireByKeyAsColor("toolbarIconInactiveTintColor")));
        }
        if (jsonValue.contains("soundModeButtonVisible")) {
            view.setSoundModeButtonVisible(jsonValue.requireByKeyAsBoolean("soundModeButtonVisible"));
        }
        if (jsonValue.contains("hapticModeButtonVisible")) {
            view.setHapticModeButtonVisible(jsonValue.requireByKeyAsBoolean("hapticModeButtonVisible"));
        }
        if (jsonValue.contains("captureButtonTintColor")) {
            view.setCaptureButtonTintColor(Integer.valueOf(jsonValue.requireByKeyAsColor("captureButtonTintColor")));
        }
        if (jsonValue.contains("zoomSwitchControlVisible")) {
            view.setZoomSwitchControlVisible(jsonValue.requireByKeyAsBoolean("zoomSwitchControlVisible"));
        }
        if (jsonValue.contains("previewSizeControlVisible")) {
            view.setPreviewSizeControlVisible(jsonValue.requireByKeyAsBoolean("previewSizeControlVisible"));
        }
        if (jsonValue.contains("cameraSwitchButtonVisible")) {
            view.setCameraSwitchButtonVisible(jsonValue.requireByKeyAsBoolean("cameraSwitchButtonVisible"));
        }
        return view;
    }

    @NotNull
    public final SparkScanView viewFrom(@NotNull View parentView, @NotNull SparkScan mode, @NotNull DataCaptureContext context, @NotNull String json) {
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        JsonValue jsonValue = new JsonValue(json);
        SparkScanViewSettings sparkScanViewSettings = (SparkScanViewSettings) this.b.invoke();
        if (jsonValue.contains("viewSettings")) {
            this.f18116a.a(sparkScanViewSettings, jsonValue.requireByKeyAsObject("viewSettings"));
        }
        return updateViewFromJson(SparkScanView.INSTANCE.newInstance(parentView, context, mode, sparkScanViewSettings), json);
    }

    public SparkScanViewDeserializer() {
        this(new C0577cd(), c.f18119a);
    }
}
