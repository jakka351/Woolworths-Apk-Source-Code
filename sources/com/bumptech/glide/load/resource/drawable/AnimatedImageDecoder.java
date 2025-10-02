package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

@RequiresApi
/* loaded from: classes.dex */
public final class AnimatedImageDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13931a;
    public final ArrayPool b;

    /* loaded from: classes4.dex */
    public static final class AnimatedImageDrawableResource implements Resource<Drawable> {
        public final AnimatedImageDrawable d;

        public AnimatedImageDrawableResource(AnimatedImageDrawable animatedImageDrawable) {
            this.d = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Class a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Object get() {
            return this.d;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int getSize() {
            AnimatedImageDrawable animatedImageDrawable = this.d;
            return Util.d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void recycle() {
            AnimatedImageDrawable animatedImageDrawable = this.d;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }
    }

    public static final class ByteBufferAnimatedImageDecoder implements ResourceDecoder<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final AnimatedImageDecoder f13932a;

        public ByteBufferAnimatedImageDecoder(AnimatedImageDecoder animatedImageDecoder) {
            this.f13932a = animatedImageDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean a(Object obj, Options options) {
            ImageHeaderParser.ImageType imageTypeG = ImageHeaderParserUtils.g(this.f13932a.f13931a, (ByteBuffer) obj);
            if (imageTypeG != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeG == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource b(Object obj, int i, int i2, Options options) {
            return AnimatedImageDecoder.b(ImageDecoder.createSource((ByteBuffer) obj), i, i2, options);
        }
    }

    public static final class StreamAnimatedImageDecoder implements ResourceDecoder<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final AnimatedImageDecoder f13933a;

        public StreamAnimatedImageDecoder(AnimatedImageDecoder animatedImageDecoder) {
            this.f13933a = animatedImageDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean a(Object obj, Options options) {
            AnimatedImageDecoder animatedImageDecoder = this.f13933a;
            ImageHeaderParser.ImageType imageTypeF = ImageHeaderParserUtils.f(animatedImageDecoder.f13931a, (InputStream) obj, animatedImageDecoder.b);
            if (imageTypeF != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeF == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource b(Object obj, int i, int i2, Options options) {
            return AnimatedImageDecoder.b(ImageDecoder.createSource(ByteBufferUtil.b((InputStream) obj)), i, i2, options);
        }
    }

    public AnimatedImageDecoder(ArrayList arrayList, ArrayPool arrayPool) {
        this.f13931a = arrayList;
        this.b = arrayPool;
    }

    public static ResourceDecoder a(ArrayList arrayList, ArrayPool arrayPool) {
        return new ByteBufferAnimatedImageDecoder(new AnimatedImageDecoder(arrayList, arrayPool));
    }

    public static Resource b(ImageDecoder.Source source, int i, int i2, Options options) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i, i2, options));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new AnimatedImageDrawableResource((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public static ResourceDecoder c(ArrayList arrayList, ArrayPool arrayPool) {
        return new StreamAnimatedImageDecoder(new AnimatedImageDecoder(arrayList, arrayPool));
    }
}
