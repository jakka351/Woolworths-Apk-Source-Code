package com.scandit.datacapture.core.internal.sdk.extensions;

import android.graphics.Rect;
import android.media.Image;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis;
import com.scandit.datacapture.core.internal.module.source.BufferStack;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001aO\u0010\u0019\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001b"}, d2 = {"nv21BytesSize", "", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;", "getNv21BytesSize", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;)I", "convertToFrameData", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameData;", "Landroid/media/Image;", "buffers", "Lcom/scandit/datacapture/core/internal/module/source/BufferStack;", "pool", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameDataPool;", "captureDeviceOrientation", "isImageMirrored", "", "isTimestampRealtime", "initParameters", "Lkotlin/Function1;", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraCaptureParameters;", "", "Lkotlin/ExtensionFunctionType;", "toNv21Bytes", "", "imageCrop", "Landroid/graphics/Rect;", "updateFrameData", "frameData", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ImageExtensionsKt {
    @Nullable
    public static final NativeCameraFrameData convertToFrameData(@NotNull Image image, @NotNull BufferStack buffers, @NotNull NativeCameraFrameDataPool pool, int i, boolean z, boolean z2, @NotNull Function1<? super NativeCameraCaptureParameters, Unit> initParameters) {
        Intrinsics.h(image, "<this>");
        Intrinsics.h(buffers, "buffers");
        Intrinsics.h(pool, "pool");
        Intrinsics.h(initParameters, "initParameters");
        Long lValueOf = z2 ? Long.valueOf(image.getTimestamp()) : null;
        if (buffers.isEmpty()) {
            return null;
        }
        Image.Plane plane = image.getPlanes()[0];
        Image.Plane plane2 = image.getPlanes()[1];
        Image.Plane plane3 = image.getPlanes()[2];
        ByteBuffer buffer = plane.getBuffer();
        ByteBuffer buffer2 = plane2.getBuffer();
        ByteBuffer buffer3 = plane3.getBuffer();
        buffer.position(0);
        buffer2.position(0);
        buffer3.position(0);
        int width = image.getWidth();
        int height = image.getHeight();
        byte[] bArrA = buffers.a(buffer3.remaining() + buffer2.remaining() + buffer.remaining());
        int pixelStride = plane2.getPixelStride();
        int rowStride = plane.getRowStride();
        int rowStride2 = plane2.getRowStride();
        NativeAxis nativeAxis = z ? NativeAxis.Y : NativeAxis.NONE;
        NativeCameraCaptureParameters nativeCameraCaptureParametersCreate = NativeCameraCaptureParameters.create();
        initParameters.invoke(nativeCameraCaptureParametersCreate);
        return NativeCameraFrameData.createNv21FrameData(width, height, bArrA, buffer, buffer2, buffer3, pixelStride, rowStride, rowStride2, pool, i, nativeAxis, nativeCameraCaptureParametersCreate, lValueOf);
    }

    public static /* synthetic */ NativeCameraFrameData convertToFrameData$default(Image image, BufferStack bufferStack, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i, boolean z, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            function1 = a.f18704a;
        }
        return convertToFrameData(image, bufferStack, nativeCameraFrameDataPool, i, z, z2, function1);
    }

    public static final int getNv21BytesSize(@NotNull NativeImageBuffer nativeImageBuffer) {
        Intrinsics.h(nativeImageBuffer, "<this>");
        return ((nativeImageBuffer.getHeight() * nativeImageBuffer.getWidth()) * 12) / 8;
    }

    @NotNull
    public static final byte[] toNv21Bytes(@NotNull NativeImageBuffer nativeImageBuffer, @NotNull Rect imageCrop) {
        Intrinsics.h(nativeImageBuffer, "<this>");
        Intrinsics.h(imageCrop, "imageCrop");
        float f = imageCrop.left;
        float f2 = imageCrop.top;
        byte[] bitmapRepresentationFromYUV = nativeImageBuffer.getBitmapRepresentationFromYUV(new com.scandit.datacapture.core.common.geometry.Rect(new Point(f, f2), new Size2(imageCrop.right - f, imageCrop.bottom - f2)));
        Intrinsics.g(bitmapRepresentationFromYUV, "getBitmapRepresentationFromYUV(sdcImageCrop)");
        return bitmapRepresentationFromYUV;
    }

    public static /* synthetic */ byte[] toNv21Bytes$default(NativeImageBuffer nativeImageBuffer, Rect rect, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = new Rect(0, 0, nativeImageBuffer.getWidth(), nativeImageBuffer.getHeight());
        }
        return toNv21Bytes(nativeImageBuffer, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData updateFrameData(@org.jetbrains.annotations.NotNull android.media.Image r15, @org.jetbrains.annotations.NotNull com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData r16, @org.jetbrains.annotations.NotNull com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool r17, int r18, boolean r19, boolean r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters, kotlin.Unit> r21) {
        /*
            r0 = r16
            r1 = r21
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r15, r2)
            java.lang.String r2 = "frameData"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)
            java.lang.String r2 = "pool"
            r10 = r17
            kotlin.jvm.internal.Intrinsics.h(r10, r2)
            java.lang.String r2 = "initParameters"
            kotlin.jvm.internal.Intrinsics.h(r1, r2)
            r2 = 0
            if (r20 == 0) goto L27
            long r3 = r15.getTimestamp()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r14 = r3
            goto L28
        L27:
            r14 = r2
        L28:
            android.media.Image$Plane[] r3 = r15.getPlanes()
            r4 = 0
            r3 = r3[r4]
            android.media.Image$Plane[] r5 = r15.getPlanes()
            r6 = 1
            r5 = r5[r6]
            android.media.Image$Plane[] r6 = r15.getPlanes()
            r7 = 2
            r6 = r6[r7]
            java.nio.ByteBuffer r7 = r3.getBuffer()
            r8 = r5
            java.nio.ByteBuffer r5 = r8.getBuffer()
            java.nio.ByteBuffer r6 = r6.getBuffer()
            r7.position(r4)
            r5.position(r4)
            r6.position(r4)
            int r4 = r7.remaining()
            int r9 = r5.remaining()
            int r9 = r9 + r4
            int r4 = r6.remaining()
            int r4 = r4 + r9
            byte[] r9 = r0.takeBuffer()
            if (r9 == 0) goto L6d
            int r11 = r9.length
            if (r11 != r4) goto L6b
            r2 = r9
        L6b:
            if (r2 != 0) goto L6f
        L6d:
            byte[] r2 = new byte[r4]
        L6f:
            com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters r4 = r0.getCaptureParameters()
            if (r4 == 0) goto L7a
            r4.clear()
        L78:
            r13 = r4
            goto L7f
        L7a:
            com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters r4 = com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters.create()
            goto L78
        L7f:
            int r4 = r15.getWidth()
            int r15 = r15.getHeight()
            r9 = r4
            r4 = r7
            int r7 = r8.getPixelStride()
            int r3 = r3.getRowStride()
            int r8 = r8.getRowStride()
            if (r19 == 0) goto L9b
            com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis r11 = com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis.Y
        L99:
            r12 = r11
            goto L9e
        L9b:
            com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis r11 = com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis.NONE
            goto L99
        L9e:
            r1.invoke(r13)
            r11 = r18
            r1 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r15
            r0.updateNv21(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.sdk.extensions.ImageExtensionsKt.updateFrameData(android.media.Image, com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData, com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool, int, boolean, boolean, kotlin.jvm.functions.Function1):com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData");
    }

    public static /* synthetic */ NativeCameraFrameData updateFrameData$default(Image image, NativeCameraFrameData nativeCameraFrameData, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i, boolean z, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            function1 = b.f18705a;
        }
        return updateFrameData(image, nativeCameraFrameData, nativeCameraFrameDataPool, i, z, z2, function1);
    }
}
