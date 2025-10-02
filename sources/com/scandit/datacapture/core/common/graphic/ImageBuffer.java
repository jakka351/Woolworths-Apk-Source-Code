package com.scandit.datacapture.core.common.graphic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.common.graphic.ImageBufferFormat;
import com.scandit.datacapture.core.internal.sdk.common.graphic.ImageBufferUtilsKt;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0006\u0010\u0004\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/core/common/graphic/ImageBuffer;", "Lcom/scandit/datacapture/core/common/graphic/ImageBufferProxy;", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;", "_impl", "deepCopy", "Landroid/graphics/Bitmap;", "toBitmap", "", "getHeight", "()I", "height", "", "Lcom/scandit/datacapture/core/common/graphic/ImagePlane;", "getPlanes", "()Ljava/util/List;", "planes", "getWidth", "width", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(IILjava/util/ArrayList;)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class ImageBuffer implements ImageBufferProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ImageBufferProxyAdapter f18482a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageBufferFormat.values().length];
            try {
                iArr[ImageBufferFormat.ARGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageBufferFormat.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageBuffer(@NotNull NativeImageBuffer impl) {
        Intrinsics.h(impl, "impl");
        this.f18482a = new ImageBufferProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeImageBuffer getF18483a() {
        return this.f18482a.getF18483a();
    }

    @NotNull
    public final ImageBuffer deepCopy() {
        NativeImageBuffer nativeImageBufferDeepCopy = getF18483a().deepCopy();
        Intrinsics.g(nativeImageBufferDeepCopy, "_impl().deepCopy()");
        return new ImageBuffer(nativeImageBufferDeepCopy);
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @ProxyFunction(property = "height")
    public int getHeight() {
        return this.f18482a.getHeight();
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @ProxyFunction(property = "planes")
    @NotNull
    public List<ImagePlane> getPlanes() {
        return this.f18482a.getPlanes();
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @ProxyFunction(property = "width")
    public int getWidth() {
        return this.f18482a.getWidth();
    }

    @NotNull
    public final Bitmap toBitmap() {
        int i = WhenMappings.$EnumSwitchMapping$0[ImageBufferUtilsKt.getFormat(getF18483a()).ordinal()];
        if (i == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(getF18483a().toBitmap()));
            return bitmapCreateBitmap;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        YuvImage yuvImage = new YuvImage(getF18483a().toBitmap(), 17, getWidth(), getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, getWidth(), getHeight()), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        Intrinsics.g(bitmapDecodeByteArray, "decodeByteArray(jpegByte…y, 0, jpegByteArray.size)");
        return bitmapDecodeByteArray;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageBuffer(int i, int i2, @NotNull ArrayList<ImagePlane> planes) {
        Intrinsics.h(planes, "planes");
        NativeImageBuffer nativeImageBufferCreate = NativeImageBuffer.create(i, i2, planes);
        Intrinsics.g(nativeImageBufferCreate, "create(width, height, planes)");
        this(nativeImageBufferCreate);
    }
}
