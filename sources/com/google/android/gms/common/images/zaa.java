package com.google.android.gms.common.images;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
final class zaa implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;

    @Nullable
    private final AssetFileDescriptor zac;

    public zaa(ImageManager imageManager, @Nullable Uri uri, AssetFileDescriptor assetFileDescriptor) {
        Objects.requireNonNull(imageManager);
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = assetFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        AssetFileDescriptor assetFileDescriptor = this.zac;
        boolean z = false;
        Bitmap bitmapDecodeStream = null;
        if (assetFileDescriptor != null) {
            try {
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptor.createInputStream();
                if (fileInputStreamCreateInputStream != null) {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStreamCreateInputStream);
                    } finally {
                    }
                }
                if (fileInputStreamCreateInputStream != null) {
                    fileInputStreamCreateInputStream.close();
                }
            } catch (IOException | OutOfMemoryError e) {
                Log.e("ImageManager", "Error loading bitmap for uri: ".concat(String.valueOf(this.zab)), e);
                z = e instanceof OutOfMemoryError;
            }
        }
        boolean z2 = z;
        Bitmap bitmap = bitmapDecodeStream;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.zaa;
        imageManager.zae().post(new zac(imageManager, this.zab, bitmap, z2, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.zab)));
        }
    }
}
