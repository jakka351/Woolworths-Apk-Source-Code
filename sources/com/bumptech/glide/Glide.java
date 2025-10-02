package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.collection.ArrayMap;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.util.GlideSuppliers;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Glide implements ComponentCallbacks2 {
    public static volatile Glide m;
    public static volatile boolean n;
    public final Engine d;
    public final BitmapPool e;
    public final MemoryCache f;
    public final GlideContext g;
    public final ArrayPool h;
    public final RequestManagerRetriever i;
    public final ConnectivityMonitorFactory j;
    public final ArrayList k = new ArrayList();
    public final RequestOptionsFactory l;

    public interface RequestOptionsFactory {
        RequestOptions build();
    }

    public Glide(Context context, Engine engine, MemoryCache memoryCache, BitmapPool bitmapPool, ArrayPool arrayPool, RequestManagerRetriever requestManagerRetriever, ConnectivityMonitorFactory connectivityMonitorFactory, int i, RequestOptionsFactory requestOptionsFactory, ArrayMap arrayMap, List list, final ArrayList arrayList, final AppGlideModule appGlideModule, GlideExperiments glideExperiments) {
        this.d = engine;
        this.e = bitmapPool;
        this.h = arrayPool;
        this.f = memoryCache;
        this.i = requestManagerRetriever;
        this.j = connectivityMonitorFactory;
        this.l = requestOptionsFactory;
        this.g = new GlideContext(context, arrayPool, new GlideSuppliers.GlideSupplier<Registry>(arrayList, appGlideModule) { // from class: com.bumptech.glide.RegistryFactory.1

            /* renamed from: a, reason: collision with root package name */
            public boolean f13762a;
            public final /* synthetic */ ArrayList c;

            @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
            public final Object get() {
                if (this.f13762a) {
                    throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
                }
                Trace.beginSection(androidx.tracing.Trace.f("Glide registry"));
                this.f13762a = true;
                try {
                    return RegistryFactory.a(this.b, this.c);
                } finally {
                    this.f13762a = false;
                    Trace.endSection();
                }
            }
        }, new ImageViewTargetFactory(), requestOptionsFactory, arrayMap, list, engine, glideExperiments, i);
    }

    public static Glide a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (m == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (Glide.class) {
                if (m == null) {
                    if (n) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    n = true;
                    try {
                        b(context, generatedAppGlideModule);
                        n = false;
                    } catch (Throwable th) {
                        n = false;
                        throw th;
                    }
                }
            }
        }
        return m;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        GlideBuilder glideBuilder = new GlideBuilder();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        ManifestParser manifestParser = new ManifestParser(applicationContext);
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context2 = manifestParser.f13960a;
            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(ManifestParser.a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !GeneratedAppGlideModule.b().isEmpty()) {
            HashSet hashSetB = GeneratedAppGlideModule.b();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GlideModule glideModule = (GlideModule) it.next();
                if (hashSetB.contains(glideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + glideModule);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((GlideModule) it2.next()).getClass());
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((GlideModule) it3.next()).getClass();
        }
        if (glideBuilder.g == null) {
            int i = GlideExecutor.f;
            GlideExecutor.Builder builder = new GlideExecutor.Builder(false);
            if (GlideExecutor.f == 0) {
                GlideExecutor.f = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = GlideExecutor.f;
            builder.b = i2;
            builder.c = i2;
            builder.f = "source";
            glideBuilder.g = builder.a();
        }
        if (glideBuilder.h == null) {
            int i3 = GlideExecutor.f;
            GlideExecutor.Builder builder2 = new GlideExecutor.Builder(true);
            builder2.b = 1;
            builder2.c = 1;
            builder2.f = "disk-cache";
            glideBuilder.h = builder2.a();
        }
        if (glideBuilder.n == null) {
            if (GlideExecutor.f == 0) {
                GlideExecutor.f = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i4 = GlideExecutor.f < 4 ? 1 : 2;
            GlideExecutor.Builder builder3 = new GlideExecutor.Builder(true);
            builder3.b = i4;
            builder3.c = i4;
            builder3.f = "animation";
            glideBuilder.n = builder3.a();
        }
        if (glideBuilder.j == null) {
            glideBuilder.j = new MemorySizeCalculator(new MemorySizeCalculator.Builder(applicationContext));
        }
        if (glideBuilder.k == null) {
            glideBuilder.k = new DefaultConnectivityMonitorFactory();
        }
        if (glideBuilder.d == null) {
            int i5 = glideBuilder.j.f13837a;
            if (i5 > 0) {
                glideBuilder.d = new LruBitmapPool(i5);
            } else {
                glideBuilder.d = new BitmapPoolAdapter();
            }
        }
        if (glideBuilder.e == null) {
            glideBuilder.e = new LruArrayPool(glideBuilder.j.c);
        }
        if (glideBuilder.f == null) {
            glideBuilder.f = new LruResourceCache(glideBuilder.j.b);
        }
        if (glideBuilder.i == null) {
            glideBuilder.i = new InternalCacheDiskCacheFactory(applicationContext);
        }
        if (glideBuilder.c == null) {
            glideBuilder.c = new Engine(glideBuilder.f, glideBuilder.i, glideBuilder.h, glideBuilder.g, GlideExecutor.a(), glideBuilder.n);
        }
        List list2 = glideBuilder.o;
        if (list2 == null) {
            glideBuilder.o = Collections.EMPTY_LIST;
        } else {
            glideBuilder.o = Collections.unmodifiableList(list2);
        }
        GlideExperiments.Builder builder4 = glideBuilder.b;
        builder4.getClass();
        Glide glide = new Glide(applicationContext, glideBuilder.c, glideBuilder.f, glideBuilder.d, glideBuilder.e, new RequestManagerRetriever(), glideBuilder.k, glideBuilder.l, glideBuilder.m, glideBuilder.f13757a, glideBuilder.o, arrayList, generatedAppGlideModule, new GlideExperiments(builder4));
        applicationContext.registerComponentCallbacks(glide);
        m = glide;
    }

    public static RequestManager d(Context context) {
        Preconditions.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).i.c(context);
    }

    public static RequestManager e(View view) {
        Context context = view.getContext();
        Preconditions.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).i.d(view);
    }

    public final void c(int i) {
        Util.a();
        synchronized (this.k) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    ((RequestManager) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f.a(i);
        this.e.a(i);
        this.h.a(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Util.a();
        this.f.b();
        this.e.b();
        this.h.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        c(i);
    }
}
