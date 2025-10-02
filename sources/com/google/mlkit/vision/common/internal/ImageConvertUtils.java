package com.google.mlkit.vision.common.internal;

import YU.a;
import android.graphics.Bitmap;
import android.media.Image;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;

@KeepForSdk
/* loaded from: classes6.dex */
public class ImageConvertUtils {
    public static ByteBuffer a(InputImage inputImage) throws MlKitException {
        int i;
        int i2 = inputImage.f;
        int i3 = 0;
        if (i2 == -1) {
            Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(inputImage.f16001a);
            if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
                bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
            }
            Bitmap bitmap = bitmapCopy;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i4 = width * height;
            int[] iArr = new int[i4];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int iCeil = (int) Math.ceil(height / 2.0d);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i4);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < height) {
                int i8 = i3;
                while (i8 < width) {
                    int i9 = iArr[i7];
                    int i10 = i9 >> 16;
                    int i11 = i9 >> 8;
                    int i12 = i9 & 255;
                    int i13 = i6 + 1;
                    int i14 = i10 & 255;
                    int i15 = i11 & 255;
                    byteBufferAllocateDirect.put(i6, (byte) Math.min(255, (a.C(i12, 25, (i15 * 129) + (i14 * 66), 128) >> 8) + 16));
                    if (i5 % 2 == 0 && i7 % 2 == 0) {
                        int i16 = ((((i14 * 112) - (i15 * 94)) - (i12 * 18)) + 128) >> 8;
                        int i17 = (((((i14 * (-38)) - (i15 * 74)) + (i12 * 112)) + 128) >> 8) + 128;
                        int i18 = i4 + 1;
                        byteBufferAllocateDirect.put(i4, (byte) Math.min(255, i16 + 128));
                        i4 += 2;
                        byteBufferAllocateDirect.put(i18, (byte) Math.min(255, i17));
                    }
                    i7++;
                    i8++;
                    i6 = i13;
                }
                i5++;
                i3 = 0;
            }
            return byteBufferAllocateDirect;
        }
        if (i2 == 17) {
            return (ByteBuffer) Preconditions.checkNotNull(null);
        }
        if (i2 != 35) {
            if (i2 != 842094169) {
                throw new MlKitException("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer = (ByteBuffer) Preconditions.checkNotNull(null);
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            int i19 = iLimit / 6;
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iLimit);
            int i20 = 0;
            while (true) {
                i = i19 * 4;
                if (i20 >= i) {
                    break;
                }
                byteBufferAllocateDirect2.put(i20, byteBuffer.get(i20));
                i20++;
            }
            while (i3 < i19 + i19) {
                byteBufferAllocateDirect2.put(i + i3, byteBuffer.get((i3 / 2) + ((i3 % 2) * i19) + i));
                i3++;
            }
            return byteBufferAllocateDirect2;
        }
        Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(inputImage.c());
        int i21 = inputImage.c;
        int i22 = inputImage.d;
        int i23 = i21 * i22;
        byte[] bArr = new byte[c.b(i23, 4, i23)];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit2 = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit2 - 1);
        int i24 = (i23 + i23) / 4;
        boolean z = buffer2.remaining() == i24 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit2);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i23);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i23, 1);
            buffer3.get(bArr, i23 + 1, i24 - 1);
        } else {
            b(planeArr[0], i21, i22, bArr, 0, 1);
            b(planeArr[1], i21, i22, bArr, i23 + 1, 2);
            b(planeArr[2], i21, i22, bArr, i23, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static final void b(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int rowStride2 = 0;
        for (int i6 = 0; i6 < rowStride; i6++) {
            int pixelStride = rowStride2;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i3] = buffer.get(pixelStride);
                i3 += i4;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }
}
