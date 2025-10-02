package com.bumptech.glide.load.resource.bitmap;

import YU.a;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13905a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes4.dex */
    public static final class ByteBufferReader implements Reader {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f13906a;

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.f13906a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a(int i, byte[] bArr) {
            ByteBuffer byteBuffer = this.f13906a;
            int iMin = Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.f13906a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.f13906a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* loaded from: classes4.dex */
    public static final class RandomAccessReader {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f13907a;

        public RandomAccessReader(byte[] bArr, int i) {
            this.f13907a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public final short a(int i) {
            ByteBuffer byteBuffer = this.f13907a;
            if (byteBuffer.remaining() - i >= 2) {
                return byteBuffer.getShort(i);
            }
            return (short) -1;
        }

        public final int b(int i) {
            ByteBuffer byteBuffer = this.f13907a;
            if (byteBuffer.remaining() - i >= 4) {
                return byteBuffer.getInt(i);
            }
            return -1;
        }

        public final int c() {
            return this.f13907a.remaining();
        }

        public final void d(ByteOrder byteOrder) {
            this.f13907a.order(byteOrder);
        }
    }

    /* loaded from: classes4.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a(int i, byte[] bArr);

        int b();

        short c();

        long skip(long j);
    }

    /* loaded from: classes4.dex */
    public static final class StreamReader implements Reader {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f13908a;

        public StreamReader(InputStream inputStream) {
            this.f13908a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a(int i, byte[] bArr) throws Reader.EndOfFileException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f13908a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws IOException {
            int i = this.f13908a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.f13908a;
                long jSkip = inputStream.skip(j2);
                if (jSkip > 0) {
                    j2 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public static int e(Reader reader, ArrayPool arrayPool) {
        try {
            int iB = reader.b();
            if ((iB & 65496) == 65496 || iB == 19789 || iB == 18761) {
                int iG = g(reader);
                if (iG != -1) {
                    byte[] bArr = (byte[]) arrayPool.c(byte[].class, iG);
                    try {
                        return h(reader, bArr, iG);
                    } finally {
                        arrayPool.put(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iB);
                return -1;
            }
        } catch (Reader.EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType f(Reader reader) {
        try {
            int iB = reader.b();
            if (iB == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iB << 8) | reader.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | reader.c();
            if (iC2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 == 1380533830) {
                reader.skip(4L);
                if (((reader.b() << 16) | reader.b()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iB2 = (reader.b() << 16) | reader.b();
                if ((iB2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iB2 & 255;
                if (i == 88) {
                    reader.skip(4L);
                    short sC = reader.c();
                    return (sC & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.b() << 16) | reader.b()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iB3 = (reader.b() << 16) | reader.b();
            if (iB3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iB3 == 1635150182;
            reader.skip(4L);
            int i3 = iC2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iB4 = (reader.b() << 16) | reader.b();
                    if (iB4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iB4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r9) {
        /*
        L0:
            short r0 = r9.c()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown segmentId="
            r9.<init>(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.c()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L6a
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L3d
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r9)
            return r3
        L3d:
            int r1 = r9.b()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L6b
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r2 = ", but actually skipped: "
            java.lang.String r5 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = YU.a.q(r0, r1, r5, r9, r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L6a:
            return r3
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):int");
    }

    public static int h(Reader reader, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iA = reader.a(i, bArr);
        if (iA == i) {
            byte[] bArr2 = f13905a;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i2 = 0;
                while (true) {
                    if (i2 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i2] != bArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                RandomAccessReader randomAccessReader = new RandomAccessReader(bArr, i);
                short sA = randomAccessReader.a(6);
                if (sA != 18761) {
                    if (sA != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sA));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                randomAccessReader.d(byteOrder);
                int iB = randomAccessReader.b(10);
                short sA2 = randomAccessReader.a(iB + 6);
                for (int i3 = 0; i3 < sA2; i3++) {
                    int i4 = (i3 * 12) + iB + 8;
                    short sA3 = randomAccessReader.a(i4);
                    if (sA3 == 274) {
                        short sA4 = randomAccessReader.a(i4 + 2);
                        if (sA4 >= 1 && sA4 <= 12) {
                            int iB2 = randomAccessReader.b(i4 + 4);
                            if (iB2 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sbQ = a.q(i3, sA3, "Got tagIndex=", " tagType=", " formatCode=");
                                    sbQ.append((int) sA4);
                                    sbQ.append(" componentCount=");
                                    sbQ.append(iB2);
                                    Log.d("DfltImageHeaderParser", sbQ.toString());
                                }
                                int i5 = iB2 + b[sA4];
                                if (i5 <= 4) {
                                    int i6 = i4 + 8;
                                    if (i6 >= 0 && i6 <= randomAccessReader.c()) {
                                        if (i5 >= 0 && i5 + i6 <= randomAccessReader.c()) {
                                            return randomAccessReader.a(i6);
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i6 + " tagType=" + ((int) sA3));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sA4));
                        }
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iA);
            return -1;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(ByteBuffer byteBuffer, ArrayPool arrayPool) {
        Preconditions.c(byteBuffer, "Argument must not be null");
        ByteBufferReader byteBufferReader = new ByteBufferReader(byteBuffer);
        Preconditions.c(arrayPool, "Argument must not be null");
        return e(byteBufferReader, arrayPool);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(InputStream inputStream) {
        return f(new StreamReader(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, ArrayPool arrayPool) {
        StreamReader streamReader = new StreamReader(inputStream);
        Preconditions.c(arrayPool, "Argument must not be null");
        return e(streamReader, arrayPool);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(ByteBuffer byteBuffer) {
        Preconditions.c(byteBuffer, "Argument must not be null");
        return f(new ByteBufferReader(byteBuffer));
    }
}
