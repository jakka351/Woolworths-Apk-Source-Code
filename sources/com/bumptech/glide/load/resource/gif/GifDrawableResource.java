package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;

/* loaded from: classes4.dex */
public class GifDrawableResource extends DrawableResource<GifDrawable> implements Initializable {
    public GifDrawableResource(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return GifDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        GifFrameLoader gifFrameLoader = ((GifDrawable) this.d).d.f13939a;
        StandardGifDecoder standardGifDecoder = gifFrameLoader.f13941a;
        return (standardGifDecoder.j.length * 4) + standardGifDecoder.d.limit() + standardGifDecoder.i.length + gifFrameLoader.o;
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        ((GifDrawable) this.d).c().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        GifDrawable gifDrawable = (GifDrawable) this.d;
        gifDrawable.stop();
        gifDrawable.g = true;
        GifFrameLoader gifFrameLoader = gifDrawable.d.f13939a;
        RequestManager requestManager = gifFrameLoader.d;
        gifFrameLoader.c.clear();
        Bitmap bitmap = gifFrameLoader.l;
        if (bitmap != null) {
            gifFrameLoader.e.d(bitmap);
            gifFrameLoader.l = null;
        }
        gifFrameLoader.f = false;
        GifFrameLoader.DelayTarget delayTarget = gifFrameLoader.i;
        if (delayTarget != null) {
            requestManager.f(delayTarget);
            gifFrameLoader.i = null;
        }
        GifFrameLoader.DelayTarget delayTarget2 = gifFrameLoader.k;
        if (delayTarget2 != null) {
            requestManager.f(delayTarget2);
            gifFrameLoader.k = null;
        }
        GifFrameLoader.DelayTarget delayTarget3 = gifFrameLoader.n;
        if (delayTarget3 != null) {
            requestManager.f(delayTarget3);
            gifFrameLoader.n = null;
        }
        StandardGifDecoder standardGifDecoder = gifFrameLoader.f13941a;
        GifDecoder.BitmapProvider bitmapProvider = standardGifDecoder.c;
        standardGifDecoder.l = null;
        byte[] bArr = standardGifDecoder.i;
        if (bArr != null) {
            bitmapProvider.e(bArr);
        }
        int[] iArr = standardGifDecoder.j;
        if (iArr != null) {
            bitmapProvider.f(iArr);
        }
        Bitmap bitmap2 = standardGifDecoder.m;
        if (bitmap2 != null) {
            bitmapProvider.c(bitmap2);
        }
        standardGifDecoder.m = null;
        standardGifDecoder.d = null;
        standardGifDecoder.s = null;
        byte[] bArr2 = standardGifDecoder.e;
        if (bArr2 != null) {
            bitmapProvider.e(bArr2);
        }
        gifFrameLoader.j = true;
    }
}
