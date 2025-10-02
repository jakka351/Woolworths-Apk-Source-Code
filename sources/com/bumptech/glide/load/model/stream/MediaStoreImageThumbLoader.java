package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class MediaStoreImageThumbLoader implements ModelLoader<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13887a;

    /* loaded from: classes.dex */
    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13888a;

        public Factory(Context context) {
            this.f13888a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreImageThumbLoader(this.f13888a);
        }
    }

    public MediaStoreImageThumbLoader(Context context) {
        this.f13887a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Uri uri = (Uri) obj;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
            return null;
        }
        return new ModelLoader.LoadData(new ObjectKey(uri), ThumbFetcher.f(this.f13887a, uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return MediaStoreUtil.a(uri) && !uri.getPathSegments().contains("video");
    }
}
