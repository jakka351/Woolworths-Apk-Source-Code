package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class VideoDecoder<T> implements ResourceDecoder<T, Bitmap> {
    public static final Option d = new Option("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new Option.CacheKeyUpdater<Long>() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.1

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f13928a = ByteBuffer.allocate(8);

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f13928a) {
                this.f13928a.position(0);
                messageDigest.update(this.f13928a.putLong(l.longValue()).array());
            }
        }
    });
    public static final Option e = new Option("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new Option.CacheKeyUpdater<Integer>() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.2

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f13929a = ByteBuffer.allocate(4);

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f13929a) {
                this.f13929a.position(0);
                messageDigest.update(this.f13929a.putInt(num.intValue()).array());
            }
        }
    });
    public static final MediaMetadataRetrieverFactory f = new MediaMetadataRetrieverFactory();
    public static final List g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final MediaInitializer f13927a;
    public final BitmapPool b;
    public final MediaMetadataRetrieverFactory c = f;

    @RequiresApi
    public static final class AssetFileDescriptorInitializer implements MediaInitializer<AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public final void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @RequiresApi
    public static final class ByteBufferInitializer implements MediaInitializer<ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass1 extends MediaDataSource {
            public final /* synthetic */ ByteBuffer d;

            public AnonymousClass1(ByteBuffer byteBuffer) {
                this.d = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // android.media.MediaDataSource
            public final long getSize() {
                return this.d.limit();
            }

            @Override // android.media.MediaDataSource
            public final int readAt(long j, byte[] bArr, int i, int i2) {
                ByteBuffer byteBuffer = this.d;
                if (j >= byteBuffer.limit()) {
                    return -1;
                }
                byteBuffer.position((int) j);
                int iMin = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, iMin);
                return iMin;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public final void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
            mediaExtractor.setDataSource(new AnonymousClass1((ByteBuffer) obj));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new AnonymousClass1((ByteBuffer) obj));
        }
    }

    @VisibleForTesting
    public interface MediaInitializer<T> {
        void a(MediaExtractor mediaExtractor, Object obj);

        void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    @VisibleForTesting
    public static class MediaMetadataRetrieverFactory {
    }

    public static final class ParcelFileDescriptorInitializer implements MediaInitializer<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public final void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
            mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    /* loaded from: classes4.dex */
    public static final class VideoDecoderException extends RuntimeException {
        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public VideoDecoder(BitmapPool bitmapPool, MediaInitializer mediaInitializer) {
        this.b = bitmapPool;
        this.f13927a = mediaInitializer;
    }

    public static VideoDecoder c(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new AssetFileDescriptorInitializer());
    }

    public static VideoDecoder d(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new ByteBufferInitializer());
    }

    public static VideoDecoder f(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new ParcelFileDescriptorInitializer());
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i, int i2, Options options) throws Exception {
        long jLongValue = ((Long) options.b(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(b.k(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) options.b(e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.b(DownsampleStrategy.f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f13927a.b(mediaMetadataRetriever, obj);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapE = e(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, downsampleStrategy2);
            if (Build.VERSION.SDK_INT >= 29) {
                a.u(mediaMetadataRetriever);
            } else {
                mediaMetadataRetriever.release();
            }
            return BitmapResource.b(bitmapE, this.b);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            if (Build.VERSION.SDK_INT >= 29) {
                a.u(mediaMetadataRetriever);
                throw th3;
            }
            mediaMetadataRetriever.release();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.VideoDecoder.e(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):android.graphics.Bitmap");
    }
}
