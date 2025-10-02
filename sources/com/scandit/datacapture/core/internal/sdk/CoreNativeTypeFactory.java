package com.scandit.datacapture.core.internal.sdk;

import com.scandit.datacapture.core.C1064m2;
import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextSettings;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.ui.GestureListener;
import com.scandit.datacapture.core.internal.module.ui.NativeGestureListener;
import com.scandit.datacapture.core.internal.sdk.area.NativeLocationSelection;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderStyleKt;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderAnimation;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderLineStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderLineStyleKt;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderStyleKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyConverter;
import com.scandit.datacapture.tools.internal.sdk.ProxyConverterFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ProxyConverterFactory
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0007J\u0010\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\tH\u0007J\u0010\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0007J\u0010\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000bH\u0007J\u0010\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0007J\u0010\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0007J\u0010\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0007J\u0010\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0007J\u0010\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H\u0007J\u0010\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0014H\u0007J\u0010\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aH\u0007J\u0010\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001eH\u0007J\u0010\u0010\u0005\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020 H\u0007J\u0010\u0010\u0005\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\"H\u0007J\u0010\u0010\u0005\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020$H\u0007J\u0010\u0010\u0005\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020%H\u0007J\u0010\u0010\u0005\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020&H\u0007J\u0010\u0010\u0005\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020'H\u0007J\u0010\u0010\u0005\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020(H\u0007J\u0010\u0010\u0005\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020)H\u0007¨\u0006*"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/CoreNativeTypeFactory;", "", "Lcom/scandit/datacapture/core/area/LocationSelection;", "source", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeLocationSelection;", "convert", "Lcom/scandit/datacapture/core/ui/style/Brush;", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "Lcom/scandit/datacapture/core/common/ContextStatus;", "Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "Lcom/scandit/datacapture/core/json/JsonValue;", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "Lcom/scandit/datacapture/core/data/FrameData;", "", "Lcom/scandit/datacapture/core/internal/sdk/common/graphics/NativeColor;", "", "Lcom/scandit/datacapture/core/source/Camera;", "camera", "Lcom/scandit/datacapture/core/internal/module/source/NativeAbstractCamera;", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "Lkotlin/collections/ArrayList;", "components", "", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGestureListener;", "Lcom/scandit/datacapture/core/internal/module/ui/GestureListener;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderLineStyle;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinderStyle;", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CoreNativeTypeFactory {

    @NotNull
    public static final CoreNativeTypeFactory INSTANCE = new CoreNativeTypeFactory();

    private CoreNativeTypeFactory() {
    }

    @ProxyConverter
    @NotNull
    public final NativeLocationSelection convert(@NotNull LocationSelection source) {
        Intrinsics.h(source, "source");
        return source.getC();
    }

    @ProxyConverter
    @NotNull
    public final NativeBrush convert(@NotNull Brush source) {
        Intrinsics.h(source, "source");
        return new NativeBrush(NativeColorExtensionsKt.toNativeColor(source.getFillColor()), NativeColorExtensionsKt.toNativeColor(source.getStrokeColor()), source.getStrokeWidth());
    }

    @ProxyConverter
    @NotNull
    public final Brush convert(@NotNull NativeBrush source) {
        Intrinsics.h(source, "source");
        NativeColor fillColor = source.getFillColor();
        Intrinsics.g(fillColor, "source.fillColor");
        int i = NativeColorExtensionsKt.toInt(fillColor);
        NativeColor strokeColor = source.getStrokeColor();
        Intrinsics.g(strokeColor, "source.strokeColor");
        return new Brush(i, NativeColorExtensionsKt.toInt(strokeColor), source.getStrokeWidth());
    }

    @ProxyConverter
    @NotNull
    public final NativeCameraSettings convert(@NotNull CameraSettings source) {
        Intrinsics.h(source, "source");
        return source._impl$scandit_capture_core();
    }

    @ProxyConverter
    @NotNull
    public final CameraSettings convert(@NotNull NativeCameraSettings source) {
        Intrinsics.h(source, "source");
        return new CameraSettings(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeContextStatus convert(@NotNull ContextStatus source) {
        Intrinsics.h(source, "source");
        return new NativeContextStatus(source.getMessage(), source.getCode());
    }

    @ProxyConverter
    @NotNull
    public final ContextStatus convert(@NotNull NativeContextStatus source) {
        Intrinsics.h(source, "source");
        return new ContextStatus(source);
    }

    @ProxyConverter
    @NotNull
    public final DataCaptureContext convert(@NotNull NativeDataCaptureContext source) {
        Intrinsics.h(source, "source");
        return new DataCaptureContext(source, null, 2, 0 == true ? 1 : 0);
    }

    @ProxyConverter
    @NotNull
    public final JsonValue convert(@NotNull NativeJsonValue source) {
        Intrinsics.h(source, "source");
        return new JsonValue(source);
    }

    @ProxyConverter
    @NotNull
    public final FrameData convert(@NotNull NativeFrameData source) {
        Intrinsics.h(source, "source");
        return new FrameData(source) { // from class: com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory.convert.1

            /* renamed from: a, reason: collision with root package name */
            private final NativeFrameData f18642a;

            {
                this.f18642a = source;
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            @NotNull
            /* renamed from: _impl, reason: from getter */
            public NativeFrameData getF18642a() {
                return this.f18642a;
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public boolean equals(@Nullable Object other) {
                if (other instanceof FrameData) {
                    return Intrinsics.c(this.f18642a, ((FrameData) other).getF18642a());
                }
                return false;
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            @NotNull
            public ImageBuffer getImageBuffer() {
                NativeImageBuffer imageBuffer = this.f18642a.getImageBuffer();
                Intrinsics.g(imageBuffer, "nativeFrameData.imageBuffer");
                return new ImageBuffer(imageBuffer);
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public int getOrientation() {
                return this.f18642a.getOrientation();
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public long getTimestamp() {
                return this.f18642a.getTimestampForAndroid();
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public int hashCode() {
                return this.f18642a.hashCode();
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public void release() {
                this.f18642a.release();
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public void retain() {
                this.f18642a.retain();
            }
        };
    }

    @ProxyConverter
    @NotNull
    public final NativeJsonValue convert(@NotNull String source) {
        Intrinsics.h(source, "source");
        NativeJsonValue nativeJsonValueFromString = NativeJsonValue.fromString(source);
        Intrinsics.g(nativeJsonValueFromString, "fromString(source)");
        return nativeJsonValueFromString;
    }

    @ProxyConverter
    public final int convert(@NotNull NativeColor source) {
        Intrinsics.h(source, "source");
        return NativeColorExtensionsKt.toInt(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeColor convert(int source) {
        return NativeColorExtensionsKt.toNativeColor(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeAbstractCamera convert(@NotNull Camera camera) {
        Intrinsics.h(camera, "camera");
        NativeAbstractCamera nativeAbstractCameraAsAbstractCamera = camera.getF18831a().asAbstractCamera();
        Intrinsics.g(nativeAbstractCameraAsAbstractCamera, "camera._impl().asAbstractCamera()");
        return nativeAbstractCameraAsAbstractCamera;
    }

    @ProxyConverter
    @NotNull
    public final GestureListener convert(@NotNull NativeGestureListener source) {
        Intrinsics.h(source, "source");
        return new GestureListener(source);
    }

    @ProxyConverter
    @NotNull
    public final DataCaptureContextSettings convert(@NotNull NativeDataCaptureContextSettings source) {
        Intrinsics.h(source, "source");
        return new DataCaptureContextSettings(source);
    }

    @ProxyConverter
    @NotNull
    public final RectangularViewfinderAnimation convert(@NotNull NativeRectangularViewfinderAnimation source) {
        Intrinsics.h(source, "source");
        return new RectangularViewfinderAnimation(source);
    }

    @ProxyConverter
    @NotNull
    public final RectangularViewfinderStyle convert(@NotNull NativeRectangularViewfinderStyle source) {
        Intrinsics.h(source, "source");
        return RectangularViewfinderStyleKt.fromNative(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeRectangularViewfinderStyle convert(@NotNull RectangularViewfinderStyle source) {
        Intrinsics.h(source, "source");
        return RectangularViewfinderStyleKt.toNative(source);
    }

    @ProxyConverter
    @NotNull
    public final RectangularViewfinderLineStyle convert(@NotNull NativeRectangularViewfinderLineStyle source) {
        Intrinsics.h(source, "source");
        return RectangularViewfinderLineStyleKt.fromNative(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeRectangularViewfinderLineStyle convert(@NotNull RectangularViewfinderLineStyle source) {
        Intrinsics.h(source, "source");
        return RectangularViewfinderLineStyleKt.toNative(source);
    }

    @ProxyConverter
    @NotNull
    public final LaserlineViewfinderStyle convert(@NotNull NativeLaserlineViewfinderStyle source) {
        Intrinsics.h(source, "source");
        return LaserlineViewfinderStyleKt.fromNative(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeLaserlineViewfinderStyle convert(@NotNull LaserlineViewfinderStyle source) {
        Intrinsics.h(source, "source");
        return LaserlineViewfinderStyleKt.toNative(source);
    }

    @ProxyConverter
    @NotNull
    public final List<DataCaptureComponent> convert(@NotNull ArrayList<NativeDataCaptureComponent> components) {
        Intrinsics.h(components, "components");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(components, 10));
        Iterator<T> it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1064m2((NativeDataCaptureComponent) it.next()));
        }
        return arrayList;
    }
}
