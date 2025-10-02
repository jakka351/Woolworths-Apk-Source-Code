package com.scandit.datacapture.core.source.serialization;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H'J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH'J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H'J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u0004H'J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H'J\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerProxy;", "", "warnings", "", "", "getWarnings", "()Ljava/util/List;", "_deserializer", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "_frameSourceFromJson", "Lcom/scandit/datacapture/core/source/FrameSource;", "jsonData", "_frameSourceFromJsonValue", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "_setDeserializer", "", "deserializer", "_setHelper", "helper", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "_setListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "cameraSettingsFromJson", "Lcom/scandit/datacapture/core/source/CameraSettings;", "updateCameraSettingsFromJson", "settings", "updateFrameSourceFromJson", "frameSource", "updateFrameSourceFromJsonValue", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeFrameSourceDeserializer.class)
/* loaded from: classes6.dex */
public interface FrameSourceDeserializerProxy {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static CameraSettings updateCameraSettingsFromJson(@NotNull FrameSourceDeserializerProxy frameSourceDeserializerProxy, @NotNull CameraSettings settings, @NotNull String jsonData) throws JSONException {
            Intrinsics.h(settings, "settings");
            Intrinsics.h(jsonData, "jsonData");
            NativeCameraSettings updatedSettings = frameSourceDeserializerProxy.getF18860a().updateCameraSettingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(settings), NativeJsonValue.fromString(jsonData));
            Intrinsics.g(updatedSettings, "updatedSettings");
            settings.updateWithNativeObject$scandit_capture_core(updatedSettings);
            return settings;
        }
    }

    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    FrameSourceDeserializer _deserializer();

    @ProxyFunction(nativeName = "frameSourceFromJson")
    @NotNull
    FrameSource _frameSourceFromJson(@NotNull String jsonData);

    @ProxyFunction(nativeName = "frameSourceFromJson")
    @NotNull
    FrameSource _frameSourceFromJsonValue(@NotNull JsonValue json);

    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeFrameSourceDeserializer getF18860a();

    @ProxySetter
    void _setDeserializer(@NotNull FrameSourceDeserializer deserializer);

    @ProxyFunction(nativeName = "setHelper")
    void _setHelper(@Nullable FrameSourceDeserializerHelper helper);

    @ProxyFunction(nativeName = "setListener")
    void _setListener(@Nullable FrameSourceDeserializerListener listener);

    @ProxyFunction
    @NotNull
    CameraSettings cameraSettingsFromJson(@NotNull String jsonData);

    @ProxyFunction(property = "warnings")
    @NotNull
    List<String> getWarnings();

    @NotNull
    CameraSettings updateCameraSettingsFromJson(@NotNull CameraSettings settings, @NotNull String jsonData);

    @ProxyFunction
    @NotNull
    FrameSource updateFrameSourceFromJson(@NotNull FrameSource frameSource, @NotNull String jsonData);

    @ProxyFunction(nativeName = "updateFrameSourceFromJson")
    @NotNull
    FrameSource updateFrameSourceFromJsonValue(@NotNull FrameSource frameSource, @NotNull JsonValue json);
}
