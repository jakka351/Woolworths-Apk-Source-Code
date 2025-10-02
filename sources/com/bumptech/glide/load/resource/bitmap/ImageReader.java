package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import com.bumptech.glide.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
interface ImageReader {

    public static final class ByteArrayReader implements ImageReader {
        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int b() {
            return ImageHeaderParserUtils.c(null, ByteBuffer.wrap(null), null);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap c(BitmapFactory.Options options) {
            throw null;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() {
            return ImageHeaderParserUtils.g(null, ByteBuffer.wrap(null));
        }
    }

    public static final class ByteBufferReader implements ImageReader {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f13916a;
        public final List b;
        public final ArrayPool c;

        public ByteBufferReader(ByteBuffer byteBuffer, ArrayList arrayList, ArrayPool arrayPool) {
            this.f13916a = byteBuffer;
            this.b = arrayList;
            this.c = arrayPool;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int b() {
            return ImageHeaderParserUtils.c(this.b, ByteBufferUtil.c(this.f13916a), this.c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(ByteBufferUtil.f(ByteBufferUtil.c(this.f13916a)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() {
            return ImageHeaderParserUtils.g(this.b, ByteBufferUtil.c(this.f13916a));
        }
    }

    public static final class FileReader implements ImageReader {
        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int b() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
            } catch (Throwable th2) {
                recyclableBufferedInputStream = null;
                th = th2;
            }
            try {
                int iB = ImageHeaderParserUtils.b(null, recyclableBufferedInputStream, null);
                try {
                    recyclableBufferedInputStream.close();
                } catch (IOException unused) {
                }
                return iB;
            } catch (Throwable th3) {
                th = th3;
                if (recyclableBufferedInputStream != null) {
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap c(BitmapFactory.Options options) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
                try {
                    recyclableBufferedInputStream.close();
                } catch (IOException unused) {
                }
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                th = th2;
                recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                if (recyclableBufferedInputStream2 != null) {
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
            } catch (Throwable th2) {
                recyclableBufferedInputStream = null;
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType imageTypeF = ImageHeaderParserUtils.f(null, recyclableBufferedInputStream, null);
                try {
                    recyclableBufferedInputStream.close();
                } catch (IOException unused) {
                }
                return imageTypeF;
            } catch (Throwable th3) {
                th = th3;
                if (recyclableBufferedInputStream != null) {
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
    }

    public static final class InputStreamImageReader implements ImageReader {

        /* renamed from: a, reason: collision with root package name */
        public final InputStreamRewinder f13917a;
        public final ArrayPool b;
        public final List c;

        public InputStreamImageReader(MarkEnforcingInputStream markEnforcingInputStream, ArrayList arrayList, ArrayPool arrayPool) {
            Preconditions.c(arrayPool, "Argument must not be null");
            this.b = arrayPool;
            Preconditions.c(arrayList, "Argument must not be null");
            this.c = arrayList;
            this.f13917a = new InputStreamRewinder(markEnforcingInputStream, arrayPool);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void a() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f13917a.f13786a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f = recyclableBufferedInputStream.d.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f13917a.f13786a;
            recyclableBufferedInputStream.reset();
            return ImageHeaderParserUtils.b(this.c, recyclableBufferedInputStream, this.b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap c(BitmapFactory.Options options) {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f13917a.f13786a;
            recyclableBufferedInputStream.reset();
            return BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f13917a.f13786a;
            recyclableBufferedInputStream.reset();
            return ImageHeaderParserUtils.f(this.c, recyclableBufferedInputStream, this.b);
        }
    }

    @RequiresApi
    public static final class ParcelFileDescriptorImageReader implements ImageReader {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayPool f13918a;
        public final List b;
        public final ParcelFileDescriptorRewinder c;

        public ParcelFileDescriptorImageReader(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, ArrayPool arrayPool) {
            Preconditions.c(arrayPool, "Argument must not be null");
            this.f13918a = arrayPool;
            Preconditions.c(arrayList, "Argument must not be null");
            this.b = arrayList;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final int b() {
            return ImageHeaderParserUtils.a(this.b, this.c, this.f13918a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.c().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public final ImageHeaderParser.ImageType d() {
            return ImageHeaderParserUtils.e(this.b, this.c, this.f13918a);
        }
    }

    void a();

    int b();

    Bitmap c(BitmapFactory.Options options);

    ImageHeaderParser.ImageType d();
}
