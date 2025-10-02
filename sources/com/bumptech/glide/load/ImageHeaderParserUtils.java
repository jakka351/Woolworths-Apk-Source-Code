package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class ImageHeaderParserUtils {

    public interface OrientationReader {
        int a(ImageHeaderParser imageHeaderParser);
    }

    public interface TypeReader {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final ArrayPool arrayPool) {
        return d(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.6
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public final int a(ImageHeaderParser imageHeaderParser) throws Throwable {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                ArrayPool arrayPool2 = arrayPool;
                ParcelFileDescriptorRewinder parcelFileDescriptorRewinder2 = parcelFileDescriptorRewinder;
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder2.c().getFileDescriptor()), arrayPool2);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    int iC = imageHeaderParser.c(recyclableBufferedInputStream, arrayPool2);
                    recyclableBufferedInputStream.release();
                    parcelFileDescriptorRewinder2.c();
                    return iC;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                    if (recyclableBufferedInputStream2 != null) {
                        recyclableBufferedInputStream2.release();
                    }
                    parcelFileDescriptorRewinder2.c();
                    throw th;
                }
            }
        });
    }

    public static int b(List list, final InputStream inputStream, final ArrayPool arrayPool) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        return d(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.5
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
                InputStream inputStream2 = inputStream;
                try {
                    return imageHeaderParser.c(inputStream2, arrayPool);
                } finally {
                    inputStream2.reset();
                }
            }
        });
    }

    public static int c(List list, final ByteBuffer byteBuffer, final ArrayPool arrayPool) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.4
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public final int a(ImageHeaderParser imageHeaderParser) {
                ByteBuffer byteBuffer2 = byteBuffer;
                try {
                    return imageHeaderParser.a(byteBuffer2, arrayPool);
                } finally {
                    ByteBufferUtil.c(byteBuffer2);
                }
            }
        });
    }

    public static int d(List list, OrientationReader orientationReader) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = orientationReader.a((ImageHeaderParser) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final ArrayPool arrayPool) {
        return h(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.3
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                ParcelFileDescriptorRewinder parcelFileDescriptorRewinder2 = parcelFileDescriptorRewinder;
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder2.c().getFileDescriptor()), arrayPool);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(recyclableBufferedInputStream);
                    recyclableBufferedInputStream.release();
                    parcelFileDescriptorRewinder2.c();
                    return imageTypeB;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                    if (recyclableBufferedInputStream2 != null) {
                        recyclableBufferedInputStream2.release();
                    }
                    parcelFileDescriptorRewinder2.c();
                    throw th;
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType f(List list, final InputStream inputStream, ArrayPool arrayPool) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        return h(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.1
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
                InputStream inputStream2 = inputStream;
                try {
                    return imageHeaderParser.b(inputStream2);
                } finally {
                    inputStream2.reset();
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType g(List list, final ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.2
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
                ByteBuffer byteBuffer2 = byteBuffer;
                try {
                    return imageHeaderParser.d(byteBuffer2);
                } finally {
                    ByteBufferUtil.c(byteBuffer2);
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType h(List list, TypeReader typeReader) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeA = typeReader.a((ImageHeaderParser) list.get(i));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
