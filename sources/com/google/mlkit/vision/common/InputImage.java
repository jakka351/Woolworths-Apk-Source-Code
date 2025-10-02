package com.google.mlkit.vision.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes6.dex */
public class InputImage implements MLTaskInput {

    /* renamed from: a, reason: collision with root package name */
    public volatile Bitmap f16001a;
    public volatile zzb b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    public InputImage(Bitmap bitmap) {
        this.f16001a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.c = bitmap.getWidth();
        this.d = bitmap.getHeight();
        d(0);
        this.e = 0;
        this.f = -1;
    }

    public static InputImage a(Image image, int i) {
        InputImage inputImage;
        int iLimit;
        Bitmap bitmapCreateBitmap;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        d(i);
        Preconditions.checkArgument(image.getFormat() == 256 || image.getFormat() == 35, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            if (i == 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrix, true);
            }
            inputImage = new InputImage(bitmapCreateBitmap);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            inputImage = new InputImage(image, image.getWidth(), image.getHeight(), i);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        InputImage inputImage2 = inputImage;
        zzmu.zza(zzms.zzb("vision-common"), image.getFormat(), 5, jElapsedRealtime, image.getHeight(), image.getWidth(), iLimit, i);
        return inputImage2;
    }

    public static void d(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    public final Image b() {
        if (this.b == null) {
            return null;
        }
        return this.b.f16005a;
    }

    public final Image.Plane[] c() {
        if (this.b == null) {
            return null;
        }
        return this.b.f16005a.getPlanes();
    }

    public InputImage(Image image, int i, int i2, int i3) {
        Preconditions.checkNotNull(image);
        this.b = new zzb(image);
        this.c = i;
        this.d = i2;
        d(i3);
        this.e = i3;
        this.f = 35;
    }
}
