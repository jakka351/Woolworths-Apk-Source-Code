package com.scandit.datacapture.core.source.serialization;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.BitmapFrameSource;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u000278B\u001f\b\u0000\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b4\u00105B\u0017\b\u0016\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b4\u00106J\t\u0010\u0002\u001a\u00020\u0000H\u0097\u0001J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0097\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0097\u0001J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0097\u0001J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0019\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0019\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0019\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030 8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00069"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerProxy;", "_deserializer", "", "jsonData", "Lcom/scandit/datacapture/core/source/FrameSource;", "_frameSourceFromJson", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "_frameSourceFromJsonValue", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "_impl", "deserializer", "", "_setDeserializer", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "helper", "_setHelper", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_setListener", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettingsFromJson", "settings", "updateCameraSettingsFromJson", "frameSource", "updateFrameSourceFromJson", "updateFrameSourceFromJsonValue", "frameSourceFromJson", "frameSourceFromJsonValue$scandit_capture_core", "(Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/source/FrameSource;", "frameSourceFromJsonValue", "", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "modeDeserializers", "Ljava/util/List;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer$Helper;", "b", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer$Helper;", "get_helper", "()Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer$Helper;", "_helper", "c", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;)V", "getWarnings", "()Ljava/util/List;", "warnings", "impl", "<init>", "(Ljava/util/List;Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;)V", "(Ljava/util/List;)V", "com/scandit/datacapture/core/source/serialization/a", "Helper", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class FrameSourceDeserializer implements FrameSourceDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FrameSourceDeserializerProxyAdapter f18856a;

    /* renamed from: b, reason: from kotlin metadata */
    private final Helper _helper;

    /* renamed from: c, reason: from kotlin metadata */
    private FrameSourceDeserializerListener listener;

    @Keep
    @NotNull
    private final List<DataCaptureModeDeserializer> modeDeserializers;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J*\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer$Helper;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "", "clear", "Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "", "cameraDeviceType", "cameraSubtype", "Lcom/scandit/datacapture/core/source/Camera;", "createCamera", "camera", "applySettings", "base64Image", "Lcom/scandit/datacapture/core/source/FrameSource;", "createImageFrameSource", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "updateCameraFromJson", "a", "Lcom/scandit/datacapture/core/source/FrameSource;", "getDeserializedFrameSource", "()Lcom/scandit/datacapture/core/source/FrameSource;", "setDeserializedFrameSource", "(Lcom/scandit/datacapture/core/source/FrameSource;)V", "deserializedFrameSource", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Helper implements FrameSourceDeserializerHelper, DataCaptureDeserializerHelper {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private FrameSource deserializedFrameSource;

        @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerHelper
        public void applySettings(@NotNull Camera camera, @NotNull CameraSettings settings) {
            Intrinsics.h(camera, "camera");
            Intrinsics.h(settings, "settings");
            Camera.applySettings$default(camera, settings, null, 2, null);
        }

        @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
        public void clear() {
            this.deserializedFrameSource = null;
        }

        @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerHelper
        @Nullable
        public Camera createCamera(@NotNull CameraPosition position, @NotNull CameraSettings settings, @NotNull String cameraDeviceType, @NotNull String cameraSubtype) {
            Intrinsics.h(position, "position");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(cameraDeviceType, "cameraDeviceType");
            Intrinsics.h(cameraSubtype, "cameraSubtype");
            Camera camera = Camera.INSTANCE.getCamera(position, settings);
            this.deserializedFrameSource = camera;
            return camera;
        }

        @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerHelper
        @Nullable
        public FrameSource createImageFrameSource(@NotNull String base64Image) {
            Intrinsics.h(base64Image, "base64Image");
            Bitmap bitmapBitmapFromBase64 = BitmapExtensionsKt.bitmapFromBase64(base64Image);
            if (bitmapBitmapFromBase64 == null) {
                return null;
            }
            BitmapFrameSource bitmapFrameSourceOf = BitmapFrameSource.INSTANCE.of(bitmapBitmapFromBase64);
            this.deserializedFrameSource = bitmapFrameSourceOf;
            return bitmapFrameSourceOf;
        }

        @Nullable
        public final FrameSource getDeserializedFrameSource() {
            return this.deserializedFrameSource;
        }

        public final void setDeserializedFrameSource(@Nullable FrameSource frameSource) {
            this.deserializedFrameSource = frameSource;
        }

        @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerHelper
        public void updateCameraFromJson(@NotNull Camera camera, @NotNull JsonValue json) {
            Intrinsics.h(camera, "camera");
            Intrinsics.h(json, "json");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FrameSourceDeserializer(@NotNull List<? extends DataCaptureModeDeserializer> modeDeserializers, @NotNull NativeFrameSourceDeserializer impl) {
        Intrinsics.h(modeDeserializers, "modeDeserializers");
        Intrinsics.h(impl, "impl");
        this.modeDeserializers = modeDeserializers;
        this.f18856a = new FrameSourceDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Helper helper = new Helper();
        this._helper = helper;
        _setDeserializer(this);
        _setHelper(helper);
        impl.setListener(new FrameSourceDeserializerListenerReversedAdapter(new a(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public FrameSourceDeserializer _deserializer() {
        return this.f18856a._deserializer();
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "frameSourceFromJson")
    @NotNull
    public FrameSource _frameSourceFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        return this.f18856a._frameSourceFromJson(jsonData);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "frameSourceFromJson")
    @NotNull
    public FrameSource _frameSourceFromJsonValue(@NotNull JsonValue json) {
        Intrinsics.h(json, "json");
        return this.f18856a._frameSourceFromJsonValue(json);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeFrameSourceDeserializer getF18860a() {
        return this.f18856a.getF18860a();
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxySetter
    public void _setDeserializer(@NotNull FrameSourceDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.f18856a._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(@Nullable FrameSourceDeserializerHelper helper) {
        this.f18856a._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "setListener")
    public void _setListener(@Nullable FrameSourceDeserializerListener listener) {
        this.f18856a._setListener(listener);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction
    @NotNull
    public CameraSettings cameraSettingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        return this.f18856a.cameraSettingsFromJson(jsonData);
    }

    @NotNull
    public final FrameSource frameSourceFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        FrameSource frameSource_frameSourceFromJson = _frameSourceFromJson(jsonData);
        this._helper.clear();
        return frameSource_frameSourceFromJson;
    }

    @NotNull
    public final FrameSource frameSourceFromJsonValue$scandit_capture_core(@NotNull JsonValue json) {
        Intrinsics.h(json, "json");
        FrameSource frameSource_frameSourceFromJsonValue = _frameSourceFromJsonValue(json);
        this._helper.clear();
        return frameSource_frameSourceFromJsonValue;
    }

    @Nullable
    public final FrameSourceDeserializerListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.f18856a.getWarnings();
    }

    @NotNull
    public final Helper get_helper() {
        return this._helper;
    }

    public final void setListener(@Nullable FrameSourceDeserializerListener frameSourceDeserializerListener) {
        this.listener = frameSourceDeserializerListener;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public CameraSettings updateCameraSettingsFromJson(@NotNull CameraSettings settings, @NotNull String jsonData) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(jsonData, "jsonData");
        return this.f18856a.updateCameraSettingsFromJson(settings, jsonData);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction
    @NotNull
    public FrameSource updateFrameSourceFromJson(@NotNull FrameSource frameSource, @NotNull String jsonData) {
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(jsonData, "jsonData");
        return this.f18856a.updateFrameSourceFromJson(frameSource, jsonData);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "updateFrameSourceFromJson")
    @NotNull
    public FrameSource updateFrameSourceFromJsonValue(@NotNull FrameSource frameSource, @NotNull JsonValue json) {
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(json, "json");
        return this.f18856a.updateFrameSourceFromJsonValue(frameSource, json);
    }

    public FrameSourceDeserializer(@NotNull List<? extends DataCaptureModeDeserializer> modeDeserializers) {
        Intrinsics.h(modeDeserializers, "modeDeserializers");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(modeDeserializers, 10));
        Iterator<T> it = modeDeserializers.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataCaptureModeDeserializer) it.next())._modeDeserializerImpl());
        }
        NativeFrameSourceDeserializer nativeFrameSourceDeserializerCreate = NativeFrameSourceDeserializer.create(new ArrayList(arrayList));
        Intrinsics.g(nativeFrameSourceDeserializerCreate, "create(\n            Arra…alizerImpl() })\n        )");
        this(modeDeserializers, nativeFrameSourceDeserializerCreate);
    }
}
