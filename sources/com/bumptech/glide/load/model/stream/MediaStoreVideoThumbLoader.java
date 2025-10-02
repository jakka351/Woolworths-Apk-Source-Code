package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class MediaStoreVideoThumbLoader implements ModelLoader<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13889a;

    /* loaded from: classes.dex */
    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13890a;

        public Factory(Context context) {
            this.f13890a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreVideoThumbLoader(this.f13890a);
        }
    }

    public MediaStoreVideoThumbLoader(Context context) {
        this.f13889a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Long l;
        Uri uri = (Uri) obj;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) options.b(VideoDecoder.d)) == null || l.longValue() != -1) {
            return null;
        }
        return new ModelLoader.LoadData(new ObjectKey(uri), ThumbFetcher.g(this.f13889a, uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return MediaStoreUtil.a(uri) && uri.getPathSegments().contains("video");
    }
}
