package coil3;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004R\u0013\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/SingletonImageLoader;", "", "Lkotlinx/atomicfu/AtomicRef;", "reference", "Factory", "coil_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SingletonImageLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SingletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private f13052a = new SingletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcoil3/SingletonImageLoader$Factory;", "", "coil_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        ImageLoader a(Context context);
    }

    public static final ImageLoader a(Context context) {
        ImageLoader imageLoader;
        ImageLoader imageLoader2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SingletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private.b;
        SingletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private singletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private = f13052a;
        Object obj = atomicReferenceFieldUpdater.get(singletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private);
        ImageLoader imageLoader3 = obj instanceof ImageLoader ? (ImageLoader) obj : null;
        if (imageLoader3 != null) {
            return imageLoader3;
        }
        ImageLoader imageLoaderA = null;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(singletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private);
            if (obj2 instanceof ImageLoader) {
                imageLoader = (ImageLoader) obj2;
                imageLoader2 = imageLoaderA;
            } else {
                if (imageLoaderA == null) {
                    Factory factory = obj2 instanceof Factory ? (Factory) obj2 : null;
                    if (factory == null || (imageLoaderA = factory.a(context)) == null) {
                        Object applicationContext = context.getApplicationContext();
                        Factory factory2 = applicationContext instanceof Factory ? (Factory) applicationContext : null;
                        imageLoaderA = factory2 != null ? factory2.a(context) : SingletonImageLoaderKt.f13054a.a(context);
                    }
                }
                imageLoader = imageLoaderA;
                imageLoader2 = imageLoader;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(singletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private, obj2, imageLoader)) {
                if (atomicReferenceFieldUpdater.get(singletonImageLoader$SingletonImageLoader$VolatileWrapper$atomicfu$private) != obj2) {
                    break;
                }
            }
            Intrinsics.f(imageLoader, "null cannot be cast to non-null type coil3.ImageLoader");
            return imageLoader;
            imageLoaderA = imageLoader2;
        }
    }
}
