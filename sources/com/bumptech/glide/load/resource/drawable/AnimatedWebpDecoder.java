package com.bumptech.glide.load.resource.drawable;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RequiresApi
@Deprecated
/* loaded from: classes4.dex */
public final class AnimatedWebpDecoder {

    public static final class AnimatedImageDrawableResource implements Resource<Drawable> {
        @Override // com.bumptech.glide.load.engine.Resource
        public final Class a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Object get() {
            return null;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int getSize() {
            throw null;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void recycle() {
            throw null;
        }
    }

    public static final class ByteBufferAnimatedWebpDecoder implements ResourceDecoder<ByteBuffer, Drawable> {
        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean a(Object obj, Options options) {
            throw null;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource b(Object obj, int i, int i2, Options options) {
            ImageDecoder.createSource((ByteBuffer) obj);
            throw null;
        }
    }

    public static final class StreamAnimatedWebpDecoder implements ResourceDecoder<InputStream, Drawable> {
        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean a(Object obj, Options options) {
            throw null;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource b(Object obj, int i, int i2, Options options) {
            ImageDecoder.createSource(ByteBufferUtil.b((InputStream) obj));
            throw null;
        }
    }
}
