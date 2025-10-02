package coil;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import coil.ImageLoader;
import coil.disk.DiskCache;
import coil.disk.RealDiskCache;
import coil.memory.EmptyStrongMemoryCache;
import coil.memory.EmptyWeakMemoryCache;
import coil.memory.MemoryCache;
import coil.memory.RealMemoryCache;
import coil.memory.RealStrongMemoryCache;
import coil.memory.RealWeakMemoryCache;
import coil.memory.StrongMemoryCache;
import coil.memory.WeakMemoryCache;
import coil.util.SingletonDiskCache;
import coil.util.Utils;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class ImageLoaders {
    public static final RealImageLoader a(Context context) {
        final ImageLoader.Builder builder = new ImageLoader.Builder(context);
        Lazy lazyB = LazyKt.b(new Function0<MemoryCache>() { // from class: coil.ImageLoader$Builder$build$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StrongMemoryCache emptyStrongMemoryCache;
                int i;
                int largeMemoryClass;
                MemoryCache.Builder builder2 = new MemoryCache.Builder(builder.f12963a);
                WeakMemoryCache realWeakMemoryCache = builder2.d ? new RealWeakMemoryCache() : new EmptyWeakMemoryCache();
                if (builder2.c) {
                    double d = builder2.b;
                    if (d > 0.0d) {
                        Context context2 = builder2.f13001a;
                        Bitmap.Config[] configArr = Utils.f13033a;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            Intrinsics.e(systemService);
                            ActivityManager activityManager = (ActivityManager) systemService;
                            largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                        } catch (Exception unused) {
                            largeMemoryClass = 256;
                        }
                        double d2 = 1024;
                        i = (int) (d * largeMemoryClass * d2 * d2);
                    } else {
                        i = 0;
                    }
                    emptyStrongMemoryCache = i > 0 ? new RealStrongMemoryCache(i, realWeakMemoryCache) : new EmptyStrongMemoryCache(realWeakMemoryCache);
                } else {
                    emptyStrongMemoryCache = new EmptyStrongMemoryCache(realWeakMemoryCache);
                }
                return new RealMemoryCache(emptyStrongMemoryCache, realWeakMemoryCache);
            }
        });
        Lazy lazyB2 = LazyKt.b(new Function0<DiskCache>() { // from class: coil.ImageLoader$Builder$build$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RealDiskCache realDiskCacheA;
                SingletonDiskCache singletonDiskCache = SingletonDiskCache.f13036a;
                Context context2 = builder.f12963a;
                synchronized (singletonDiskCache) {
                    try {
                        realDiskCacheA = SingletonDiskCache.b;
                        if (realDiskCacheA == null) {
                            DiskCache.Builder builder2 = new DiskCache.Builder();
                            builder2.b = FileSystem.d;
                            builder2.c = 0.02d;
                            builder2.d = 10485760L;
                            builder2.e = 262144000L;
                            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                            builder2.f = DefaultIoScheduler.f;
                            Bitmap.Config[] configArr = Utils.f13033a;
                            File cacheDir = context2.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileF = FilesKt.f(cacheDir, new File("image_cache"));
                            String str = Path.e;
                            builder2.f12980a = Path.Companion.b(fileF);
                            realDiskCacheA = builder2.a();
                            SingletonDiskCache.b = realDiskCacheA;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return realDiskCacheA;
            }
        });
        Lazy lazyB3 = LazyKt.b(ImageLoader$Builder$build$3.h);
        EmptyList emptyList = EmptyList.d;
        return new RealImageLoader(builder.f12963a, builder.b, lazyB, lazyB2, lazyB3, new ComponentRegistry(emptyList, emptyList, emptyList, emptyList, emptyList), builder.c);
    }
}
