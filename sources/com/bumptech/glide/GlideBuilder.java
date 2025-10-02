package com.bumptech.glide;

import androidx.collection.ArrayMap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.request.RequestOptions;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideBuilder {
    public Engine c;
    public BitmapPool d;
    public LruArrayPool e;
    public LruResourceCache f;
    public GlideExecutor g;
    public GlideExecutor h;
    public InternalCacheDiskCacheFactory i;
    public MemorySizeCalculator j;
    public DefaultConnectivityMonitorFactory k;
    public GlideExecutor n;
    public List o;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayMap f13757a = new ArrayMap(0);
    public final GlideExperiments.Builder b = new GlideExperiments.Builder();
    public final int l = 4;
    public final Glide.RequestOptionsFactory m = new AnonymousClass1();

    /* renamed from: com.bumptech.glide.GlideBuilder$1, reason: invalid class name */
    public class AnonymousClass1 implements Glide.RequestOptionsFactory {
        @Override // com.bumptech.glide.Glide.RequestOptionsFactory
        public final RequestOptions build() {
            return new RequestOptions();
        }
    }

    /* renamed from: com.bumptech.glide.GlideBuilder$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 implements Glide.RequestOptionsFactory {
        @Override // com.bumptech.glide.Glide.RequestOptionsFactory
        public final RequestOptions build() {
            return new RequestOptions();
        }
    }

    public static final class EnableImageDecoderForBitmaps implements GlideExperiments.Experiment {
    }

    /* loaded from: classes4.dex */
    public static final class LogRequestOrigins implements GlideExperiments.Experiment {
    }

    /* loaded from: classes4.dex */
    public static final class ManualOverrideHardwareBitmapMaxFdCount implements GlideExperiments.Experiment {
    }
}
