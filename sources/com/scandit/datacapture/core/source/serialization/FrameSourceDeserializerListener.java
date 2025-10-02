package com.scandit.datacapture.core.source.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = FrameSourceDeserializer.class, value = NativeFrameSourceDeserializerListener.class)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "", "onCameraSettingsDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "settings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onCameraSettingsDeserializationStarted", "onFrameSourceDeserializationFinished", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "onFrameSourceDeserializationStarted", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FrameSourceDeserializerListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onCameraSettingsDeserializationFinished(@NotNull FrameSourceDeserializerListener frameSourceDeserializerListener, @NotNull FrameSourceDeserializer deserializer, @NotNull CameraSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onCameraSettingsDeserializationStarted(@NotNull FrameSourceDeserializerListener frameSourceDeserializerListener, @NotNull FrameSourceDeserializer deserializer, @NotNull CameraSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onFrameSourceDeserializationFinished(@NotNull FrameSourceDeserializerListener frameSourceDeserializerListener, @NotNull FrameSourceDeserializer deserializer, @NotNull FrameSource frameSource, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(frameSource, "frameSource");
            Intrinsics.h(json, "json");
        }

        @ProxyFunction
        public static void onFrameSourceDeserializationStarted(@NotNull FrameSourceDeserializerListener frameSourceDeserializerListener, @NotNull FrameSourceDeserializer deserializer, @NotNull FrameSource frameSource, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(frameSource, "frameSource");
            Intrinsics.h(json, "json");
        }
    }

    @ProxyFunction
    void onCameraSettingsDeserializationFinished(@NotNull FrameSourceDeserializer deserializer, @NotNull CameraSettings settings, @NotNull JsonValue json);

    @ProxyFunction
    void onCameraSettingsDeserializationStarted(@NotNull FrameSourceDeserializer deserializer, @NotNull CameraSettings settings, @NotNull JsonValue json);

    @ProxyFunction
    void onFrameSourceDeserializationFinished(@NotNull FrameSourceDeserializer deserializer, @NotNull FrameSource frameSource, @NotNull JsonValue json);

    @ProxyFunction
    void onFrameSourceDeserializationStarted(@NotNull FrameSourceDeserializer deserializer, @NotNull FrameSource frameSource, @NotNull JsonValue json);
}
