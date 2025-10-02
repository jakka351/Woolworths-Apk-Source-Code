package com.bumptech.glide;

import androidx.constraintlayout.core.state.a;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a, reason: collision with root package name */
    public final ModelLoaderRegistry f13761a;
    public final EncoderRegistry b;
    public final ResourceDecoderRegistry c;
    public final ResourceEncoderRegistry d;
    public final DataRewinderRegistry e;
    public final TranscoderRegistry f;
    public final ImageHeaderParserRegistry g;
    public final ModelToResourceClassCache h = new ModelToResourceClassCache();
    public final LoadPathCache i = new LoadPathCache();
    public final Pools.Pool j;

    /* loaded from: classes4.dex */
    public static class MissingComponentException extends RuntimeException {
    }

    /* loaded from: classes4.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes4.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super(a.e(cls, "Failed to find result encoder for resource class: ", ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
        }
    }

    /* loaded from: classes4.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
    }

    public Registry() {
        Pools.Pool poolB = FactoryPools.b();
        this.j = poolB;
        this.f13761a = new ModelLoaderRegistry(poolB);
        this.b = new EncoderRegistry();
        this.c = new ResourceDecoderRegistry();
        this.d = new ResourceEncoderRegistry();
        this.e = new DataRewinderRegistry();
        this.f = new TranscoderRegistry();
        this.g = new ImageHeaderParserRegistry();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ResourceDecoderRegistry resourceDecoderRegistry = this.c;
        synchronized (resourceDecoderRegistry) {
            try {
                ArrayList arrayList2 = new ArrayList(resourceDecoderRegistry.f13966a);
                resourceDecoderRegistry.f13966a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    resourceDecoderRegistry.f13966a.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        resourceDecoderRegistry.f13966a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(ResourceDecoder resourceDecoder, Class cls, Class cls2, String str) {
        this.c.a(resourceDecoder, cls, cls2, str);
    }

    public final ArrayList b() {
        ArrayList arrayList;
        ImageHeaderParserRegistry imageHeaderParserRegistry = this.g;
        synchronized (imageHeaderParserRegistry) {
            arrayList = imageHeaderParserRegistry.f13963a;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    public final DataRewinder c(Object obj) {
        DataRewinder dataRewinderB;
        DataRewinderRegistry dataRewinderRegistry = this.e;
        synchronized (dataRewinderRegistry) {
            try {
                Preconditions.b(obj);
                DataRewinder.Factory factory = (DataRewinder.Factory) dataRewinderRegistry.f13784a.get(obj.getClass());
                if (factory == null) {
                    Iterator it = dataRewinderRegistry.f13784a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DataRewinder.Factory factory2 = (DataRewinder.Factory) it.next();
                        if (factory2.a().isAssignableFrom(obj.getClass())) {
                            factory = factory2;
                            break;
                        }
                    }
                }
                if (factory == null) {
                    factory = DataRewinderRegistry.b;
                }
                dataRewinderB = factory.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataRewinderB;
    }

    public final void d(DataRewinder.Factory factory) {
        DataRewinderRegistry dataRewinderRegistry = this.e;
        synchronized (dataRewinderRegistry) {
            dataRewinderRegistry.f13784a.put(factory.a(), factory);
        }
    }

    /* loaded from: classes4.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
