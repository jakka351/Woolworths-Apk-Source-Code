package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = BarcodeCaptureDeserializer.class, value = NativeBarcodeCaptureDeserializerListener.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;", "", "onModeDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "mode", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onModeDeserializationStarted", "onOverlayDeserializationFinished", "overlay", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "onOverlayDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeCaptureDeserializerListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onModeDeserializationFinished(@NotNull BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, @NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCapture mode, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationStarted(@NotNull BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, @NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCapture mode, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onOverlayDeserializationFinished(@NotNull BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, @NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCaptureOverlay overlay, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onOverlayDeserializationStarted(@NotNull BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, @NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCaptureOverlay overlay, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationFinished(@NotNull BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, @NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCaptureSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationStarted(@NotNull BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, @NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCaptureSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }
    }

    @ProxyFunction
    void onModeDeserializationFinished(@NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCapture mode, @NotNull JsonValue json);

    @ProxyFunction
    void onModeDeserializationStarted(@NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCapture mode, @NotNull JsonValue json);

    @ProxyFunction
    void onOverlayDeserializationFinished(@NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCaptureOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction
    void onOverlayDeserializationStarted(@NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCaptureOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationFinished(@NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCaptureSettings settings, @NotNull JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationStarted(@NotNull BarcodeCaptureDeserializer deserializer, @NotNull BarcodeCaptureSettings settings, @NotNull JsonValue json);
}
