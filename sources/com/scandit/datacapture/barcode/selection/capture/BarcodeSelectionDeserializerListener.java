package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = BarcodeSelectionDeserializer.class, value = NativeBarcodeSelectionDeserializerListener.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "", "onBasicOverlayDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "overlay", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onBasicOverlayDeserializationStarted", "onModeDeserializationFinished", "mode", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "onModeDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeSelectionDeserializerListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onBasicOverlayDeserializationFinished(@NotNull BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, @NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelectionBasicOverlay overlay, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onBasicOverlayDeserializationStarted(@NotNull BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, @NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelectionBasicOverlay overlay, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationFinished(@NotNull BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, @NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelection mode, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationStarted(@NotNull BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, @NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelection mode, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationFinished(@NotNull BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, @NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelectionSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationStarted(@NotNull BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, @NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelectionSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }
    }

    @ProxyFunction
    void onBasicOverlayDeserializationFinished(@NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelectionBasicOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction
    void onBasicOverlayDeserializationStarted(@NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelectionBasicOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction
    void onModeDeserializationFinished(@NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelection mode, @NotNull JsonValue json);

    @ProxyFunction
    void onModeDeserializationStarted(@NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelection mode, @NotNull JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationFinished(@NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelectionSettings settings, @NotNull JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationStarted(@NotNull BarcodeSelectionDeserializer deserializer, @NotNull BarcodeSelectionSettings settings, @NotNull JsonValue json);
}
