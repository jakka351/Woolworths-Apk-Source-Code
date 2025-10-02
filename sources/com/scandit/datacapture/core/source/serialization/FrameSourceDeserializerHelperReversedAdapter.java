package com.scandit.datacapture.core.source.serialization;

import android.util.Log;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper;
import com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.BitmapFrameSource;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0016R\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializerHelper;", "Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "settings", "", "cameraDeviceType", "cameraSubtype", "Lcom/scandit/datacapture/core/internal/module/source/NativeAbstractCamera;", "createCamera", "camera", "", "applySettings", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "updateCameraFromJson", "base64Image", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "createImageFrameSource", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "helper", "<init>", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class FrameSourceDeserializerHelperReversedAdapter extends NativeFrameSourceDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSourceDeserializerHelper f18858a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public /* synthetic */ FrameSourceDeserializerHelperReversedAdapter(FrameSourceDeserializerHelper frameSourceDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameSourceDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper
    public void applySettings(@NotNull NativeAbstractCamera camera, @NotNull NativeCameraSettings settings) throws Exception {
        Intrinsics.h(camera, "camera");
        Intrinsics.h(settings, "settings");
        try {
            ProxyCache proxyCache = this.proxyCache;
            KClass kClassB = Reflection.f24268a.b(NativeFrameSource.class);
            NativeFrameSource nativeFrameSourceAsFrameSource = camera.asFrameSource();
            Intrinsics.g(nativeFrameSourceAsFrameSource, "camera.asFrameSource()");
            FrameSource frameSource = (FrameSource) proxyCache.require(kClassB, null, nativeFrameSourceAsFrameSource);
            Camera camera2 = frameSource instanceof Camera ? (Camera) frameSource : null;
            if (camera2 != null) {
                this.f18858a.applySettings(camera2, CoreNativeTypeFactory.INSTANCE.convert(settings));
                return;
            }
            throw new IllegalStateException(("No cached kotlin version of Camera (" + camera + ") found (cast failure).").toString());
        } catch (Exception e) {
            Log.e("ScanditDataCapture", "Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper
    @Nullable
    public NativeAbstractCamera createCamera(@NotNull CameraPosition position, @NotNull NativeCameraSettings settings, @NotNull String cameraDeviceType, @NotNull String cameraSubtype) throws Exception {
        NativeAndroidCamera f18831a;
        Intrinsics.h(position, "position");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(cameraDeviceType, "cameraDeviceType");
        Intrinsics.h(cameraSubtype, "cameraSubtype");
        try {
            Camera cameraCreateCamera = this.f18858a.createCamera(position, CoreNativeTypeFactory.INSTANCE.convert(settings), cameraDeviceType, cameraSubtype);
            if (cameraCreateCamera != null) {
                ProxyCache proxyCache = this.proxyCache;
                KClass kClassB = Reflection.f24268a.b(NativeFrameSource.class);
                NativeFrameSource nativeFrameSourceAsFrameSource = cameraCreateCamera.getF18831a().asFrameSource();
                Intrinsics.g(nativeFrameSourceAsFrameSource, "it._impl().asFrameSource()");
                proxyCache.put(kClassB, null, nativeFrameSourceAsFrameSource, cameraCreateCamera);
            } else {
                cameraCreateCamera = null;
            }
            if (cameraCreateCamera == null || (f18831a = cameraCreateCamera.getF18831a()) == null) {
                return null;
            }
            return f18831a.asAbstractCamera();
        } catch (Exception e) {
            Log.e("ScanditDataCapture", "Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper
    @Nullable
    public NativeFrameSource createImageFrameSource(@NotNull String base64Image) throws Exception {
        NativeFrameDataCollectionFrameSource nativeFrameDataCollectionFrameSource_impl;
        Intrinsics.h(base64Image, "base64Image");
        try {
            FrameSource frameSourceCreateImageFrameSource = this.f18858a.createImageFrameSource(base64Image);
            BitmapFrameSource bitmapFrameSource = frameSourceCreateImageFrameSource instanceof BitmapFrameSource ? (BitmapFrameSource) frameSourceCreateImageFrameSource : null;
            if (bitmapFrameSource != null) {
                ProxyCache proxyCache = this.proxyCache;
                KClass kClassB = Reflection.f24268a.b(NativeFrameSource.class);
                NativeFrameSource nativeFrameSourceAsFrameSource = bitmapFrameSource._impl().asFrameSource();
                Intrinsics.g(nativeFrameSourceAsFrameSource, "it._impl().asFrameSource()");
                proxyCache.put(kClassB, null, nativeFrameSourceAsFrameSource, bitmapFrameSource);
            } else {
                bitmapFrameSource = null;
            }
            if (bitmapFrameSource == null || (nativeFrameDataCollectionFrameSource_impl = bitmapFrameSource._impl()) == null) {
                return null;
            }
            return nativeFrameDataCollectionFrameSource_impl.asFrameSource();
        } catch (Exception e) {
            Log.e("ScanditDataCapture", "Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper
    public void updateCameraFromJson(@NotNull NativeAbstractCamera camera, @NotNull NativeJsonValue json) throws Exception {
        Intrinsics.h(camera, "camera");
        Intrinsics.h(json, "json");
        try {
            ProxyCache proxyCache = this.proxyCache;
            KClass kClassB = Reflection.f24268a.b(NativeFrameSource.class);
            NativeFrameSource nativeFrameSourceAsFrameSource = camera.asFrameSource();
            Intrinsics.g(nativeFrameSourceAsFrameSource, "camera.asFrameSource()");
            FrameSource frameSource = (FrameSource) proxyCache.require(kClassB, null, nativeFrameSourceAsFrameSource);
            Camera camera2 = frameSource instanceof Camera ? (Camera) frameSource : null;
            if (camera2 != null) {
                this.f18858a.updateCameraFromJson(camera2, new JsonValue(json));
                return;
            }
            throw new IllegalStateException(("No cached kotlin version of Camera (" + camera + ") found (cast failure).").toString());
        } catch (Exception e) {
            Log.e("ScanditDataCapture", "Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    public FrameSourceDeserializerHelperReversedAdapter(@NotNull FrameSourceDeserializerHelper helper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(helper, "helper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18858a = helper;
        this.proxyCache = proxyCache;
    }
}
