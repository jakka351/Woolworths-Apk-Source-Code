package com.github.piasy.biv.loader.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.github.piasy.biv.loader.ImageLoader;
import com.github.piasy.biv.loader.glide.GlideProgressSupport;
import com.github.piasy.biv.metadata.ImageInfoExtractor;
import java.io.File;
import java.util.HashMap;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes.dex */
public class GlideImageLoader implements ImageLoader {

    /* renamed from: a, reason: collision with root package name */
    public final RequestManager f14352a;
    public final HashMap b = new HashMap(3);

    public GlideImageLoader(Context context) {
        Glide glideA = Glide.a(context);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        final GlideProgressSupport.DispatchingProgressListener dispatchingProgressListener = new GlideProgressSupport.DispatchingProgressListener();
        builder.d.add(new Interceptor() { // from class: com.github.piasy.biv.loader.glide.GlideProgressSupport.1
            @Override // okhttp3.Interceptor
            public final Response a(RealInterceptorChain realInterceptorChain) {
                Request request = realInterceptorChain.e;
                Response responseC = realInterceptorChain.c(request);
                Response.Builder builderC = responseC.c();
                builderC.g = new OkHttpProgressResponseBody(request.f26690a, responseC.j, dispatchingProgressListener);
                return builderC.a();
            }
        });
        Registry registryA = glideA.g.a();
        registryA.f13761a.c(new OkHttpUrlLoader.Factory(new OkHttpClient(builder)));
        this.f14352a = Glide.d(context);
    }

    @Override // com.github.piasy.biv.loader.ImageLoader
    public final void a(int i, Uri uri, final ImageLoader.Callback callback) {
        final boolean[] zArr = new boolean[1];
        ImageDownloadTarget imageDownloadTarget = new ImageDownloadTarget(uri.toString()) { // from class: com.github.piasy.biv.loader.glide.GlideImageLoader.1
            @Override // com.github.piasy.biv.loader.glide.GlideProgressSupport.ProgressListener
            public final void c() {
                zArr[0] = true;
                callback.onStart();
            }

            @Override // com.github.piasy.biv.loader.glide.GlideProgressSupport.ProgressListener
            public final void f() {
                callback.onFinish();
            }

            @Override // com.github.piasy.biv.loader.glide.ImageDownloadTarget, com.bumptech.glide.request.target.Target
            public final void j(Drawable drawable) {
                super.j(drawable);
                callback.onFail(new GlideLoaderException());
            }

            @Override // com.github.piasy.biv.loader.glide.ImageDownloadTarget, com.bumptech.glide.request.target.Target
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public final void e(File file, Transition transition) {
                super.e(file, transition);
                boolean z = zArr[0];
                ImageLoader.Callback callback2 = callback;
                if (z) {
                    callback2.onCacheMiss(ImageInfoExtractor.a(file), file);
                } else {
                    callback2.onCacheHit(ImageInfoExtractor.a(file), file);
                }
                callback2.onSuccess(file);
            }

            @Override // com.github.piasy.biv.loader.glide.GlideProgressSupport.ProgressListener
            public final void onProgress(int i2) {
                callback.onProgress(i2);
            }
        };
        b(i);
        synchronized (this) {
            this.b.put(Integer.valueOf(i), imageDownloadTarget);
        }
        c(uri, imageDownloadTarget);
    }

    @Override // com.github.piasy.biv.loader.ImageLoader
    public final synchronized void b(int i) {
        ImageDownloadTarget imageDownloadTarget = (ImageDownloadTarget) this.b.remove(Integer.valueOf(i));
        if (imageDownloadTarget != null) {
            this.f14352a.f(imageDownloadTarget);
        }
    }

    public void c(Uri uri, Target target) {
        this.f14352a.c(File.class).a(RequestManager.p).L(uri).I(target);
    }
}
