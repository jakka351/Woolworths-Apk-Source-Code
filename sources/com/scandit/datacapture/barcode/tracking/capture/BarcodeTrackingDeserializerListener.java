package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = BarcodeTrackingDeserializer.class, value = NativeBarcodeTrackingDeserializerListener.class)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerListener;", "", "onAdvancedOverlayDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializer;", "overlay", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onAdvancedOverlayDeserializationStarted", "onBasicOverlayDeserializationFinished", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;", "onBasicOverlayDeserializationStarted", "onModeDeserializationFinished", "mode", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "onModeDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeTrackingDeserializerListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onAdvancedOverlayDeserializationFinished(@NotNull BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingAdvancedOverlay overlay, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onAdvancedOverlayDeserializationStarted(@NotNull BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingAdvancedOverlay overlay, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onBasicOverlayDeserializationFinished(@NotNull BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingBasicOverlay overlay, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onBasicOverlayDeserializationStarted(@NotNull BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingBasicOverlay overlay, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationFinished(@NotNull BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTracking mode, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationStarted(@NotNull BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTracking mode, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationFinished(@NotNull BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationStarted(@NotNull BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }
    }

    @ProxyFunction
    void onAdvancedOverlayDeserializationFinished(@NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingAdvancedOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction
    void onAdvancedOverlayDeserializationStarted(@NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingAdvancedOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction
    void onBasicOverlayDeserializationFinished(@NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingBasicOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction
    void onBasicOverlayDeserializationStarted(@NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingBasicOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction
    void onModeDeserializationFinished(@NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTracking mode, @NotNull JsonValue json);

    @ProxyFunction
    void onModeDeserializationStarted(@NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTracking mode, @NotNull JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationFinished(@NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingSettings settings, @NotNull JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationStarted(@NotNull BarcodeTrackingDeserializer deserializer, @NotNull BarcodeTrackingSettings settings, @NotNull JsonValue json);
}
