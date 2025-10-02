package coil3.gif.internal;

import coil3.gif.AnimatedImageDecoder;
import coil3.util.DecoderServiceLoaderTarget;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/gif/internal/GifDecoderServiceLoaderTarget;", "Lcoil3/util/DecoderServiceLoaderTarget;", "<init>", "()V", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GifDecoderServiceLoaderTarget implements DecoderServiceLoaderTarget {
    @Override // coil3.util.DecoderServiceLoaderTarget
    public final AnimatedImageDecoder.Factory a() {
        return new AnimatedImageDecoder.Factory();
    }
}
