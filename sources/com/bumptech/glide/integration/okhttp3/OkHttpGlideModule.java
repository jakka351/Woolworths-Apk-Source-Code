package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.module.GlideModule;
import okhttp3.OkHttpClient;

@Deprecated
/* loaded from: classes.dex */
public class OkHttpGlideModule implements GlideModule {
    @Override // com.bumptech.glide.module.GlideModule
    public final void a(Registry registry) {
        if (OkHttpUrlLoader.Factory.b == null) {
            synchronized (OkHttpUrlLoader.Factory.class) {
                try {
                    if (OkHttpUrlLoader.Factory.b == null) {
                        OkHttpUrlLoader.Factory.b = new OkHttpClient();
                    }
                } finally {
                }
            }
        }
        registry.f13761a.c(new OkHttpUrlLoader.Factory(OkHttpUrlLoader.Factory.b));
    }
}
