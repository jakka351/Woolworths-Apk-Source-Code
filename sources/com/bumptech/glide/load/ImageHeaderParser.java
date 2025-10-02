package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13775a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f13775a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13775a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13775a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        public final boolean d;

        ImageType(boolean z) {
            this.d = z;
        }

        public boolean hasAlpha() {
            return this.d;
        }

        public boolean isWebp() {
            int i = AnonymousClass1.f13775a[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    int a(ByteBuffer byteBuffer, ArrayPool arrayPool);

    ImageType b(InputStream inputStream);

    int c(InputStream inputStream, ArrayPool arrayPool);

    ImageType d(ByteBuffer byteBuffer);
}
