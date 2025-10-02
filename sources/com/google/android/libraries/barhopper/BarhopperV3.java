package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BarhopperV3 implements Closeable {
    public long d;

    private native void closeNative(long j);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    public static BarhopperProto$BarhopperResponse e(byte[] bArr) {
        bArr.getClass();
        try {
            return BarhopperProto$BarhopperResponse.a(bArr, zzds.zza());
        } catch (zzer e) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e);
        }
    }

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j, int i, int i2, int i3, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j, int i, int i2, int i3, byte[] bArr, RecognitionOptions recognitionOptions);

    public final void a(BarhopperV3Options barhopperV3Options) {
        if (this.d != 0) {
            Log.w("BarhopperV3", "Native pointer already exists.");
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(barhopperV3Options.zzD());
        this.d = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    public final BarhopperProto$BarhopperResponse b(int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.d;
        if (j != 0) {
            return e(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public final BarhopperProto$BarhopperResponse c(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.d;
        if (j != 0) {
            return e(recognizeNative(j, i, i2, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.d;
        if (j != 0) {
            closeNative(j);
            this.d = 0L;
        }
    }

    public final BarhopperProto$BarhopperResponse d(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.d == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d("BarhopperV3", "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return e(recognizeBitmapNative(this.d, bitmap, recognitionOptions));
    }
}
