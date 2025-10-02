package coil3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.compose.d;
import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.Extras;
import coil3.decode.BitmapFactoryDecoder;
import coil3.decode.ExifOrientationStrategy;
import coil3.decode.StaticImageDecoder;
import coil3.fetch.AssetUriFetcher;
import coil3.fetch.BitmapFetcher;
import coil3.fetch.ByteArrayFetcher;
import coil3.fetch.ByteBufferFetcher;
import coil3.fetch.ContentUriFetcher;
import coil3.fetch.DrawableFetcher;
import coil3.fetch.FileUriFetcher;
import coil3.fetch.JarFileFetcher;
import coil3.fetch.ResourceUriFetcher;
import coil3.intercept.EngineInterceptor;
import coil3.key.AndroidResourceUriKeyer;
import coil3.key.FileUriKeyer;
import coil3.key.UriKeyer;
import coil3.map.AndroidUriMapper;
import coil3.map.FileMapper;
import coil3.map.PathMapper;
import coil3.map.ResourceIntMapper;
import coil3.map.StringMapper;
import coil3.memory.MemoryCache;
import coil3.request.AndroidRequestService;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.OneShotDisposable;
import coil3.request.ViewTargetRequestManagerKt;
import coil3.size.ViewSizeResolver;
import coil3.target.ViewTarget;
import coil3.util.AndroidSystemCallbacks;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.Path;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/RealImageLoader;", "Lcoil3/ImageLoader;", "Lkotlinx/atomicfu/AtomicBoolean;", "shutdown", "Options", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealImageLoader implements ImageLoader {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Options f13050a;
    public final ContextScope b;
    public final AndroidRequestService c;
    public final ComponentRegistry d;
    public volatile /* synthetic */ int e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/RealImageLoader$Options;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13051a;
        public final ImageRequest.Defaults b;
        public final Lazy c;
        public final Lazy d;
        public final ComponentRegistry e;

        public Options(Context context, ImageRequest.Defaults defaults, Lazy lazy, Lazy lazy2, ComponentRegistry componentRegistry) {
            this.f13051a = context;
            this.b = defaults;
            this.c = lazy;
            this.d = lazy2;
            this.e = componentRegistry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            if (!Intrinsics.c(this.f13051a, options.f13051a) || !this.b.equals(options.b) || !this.c.equals(options.c) || !this.d.equals(options.d)) {
                return false;
            }
            Object obj2 = EventListener.Factory.p3;
            return obj2.equals(obj2) && this.e.equals(options.e);
        }

        public final int hashCode() {
            return (this.e.hashCode() + ((EventListener.Factory.p3.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13051a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        }

        public final String toString() {
            return "Options(application=" + this.f13051a + ", defaults=" + this.b + ", memoryCacheLazy=" + this.c + ", diskCacheLazy=" + this.d + ", eventListenerFactory=" + EventListener.Factory.p3 + ", componentRegistry=" + this.e + ", logger=null)";
        }
    }

    static {
        AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "e");
    }

    public RealImageLoader(Options options) {
        Object obj = ExifOrientationStrategy.f13078a;
        this.f13050a = options;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.b = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a.T()).plus(new RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.d)));
        AndroidSystemCallbacks androidSystemCallbacks = new AndroidSystemCallbacks(this);
        AndroidRequestService androidRequestService = new AndroidRequestService(this, androidSystemCallbacks);
        this.c = androidRequestService;
        ComponentRegistry.Builder builder = new ComponentRegistry.Builder(options.e);
        Object obj2 = options.b.n.f13043a.get(ImageLoadersKt.f13048a);
        if (((Boolean) (obj2 == null ? Boolean.TRUE : obj2)).booleanValue()) {
            builder.d.add(new d(14));
            builder.e.add(new d(15));
        }
        AndroidUriMapper androidUriMapper = new AndroidUriMapper();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        builder.b(androidUriMapper, reflectionFactory.b(android.net.Uri.class));
        builder.b(new ResourceIntMapper(), reflectionFactory.b(Integer.class));
        builder.c.add(new Pair(new AndroidResourceUriKeyer(), reflectionFactory.b(Uri.class)));
        builder.a(new AssetUriFetcher.Factory(), reflectionFactory.b(Uri.class));
        builder.a(new ContentUriFetcher.Factory(), reflectionFactory.b(Uri.class));
        builder.a(new ResourceUriFetcher.Factory(), reflectionFactory.b(Uri.class));
        builder.a(new DrawableFetcher.Factory(), reflectionFactory.b(Drawable.class));
        builder.a(new BitmapFetcher.Factory(), reflectionFactory.b(Bitmap.class));
        Extras.Key key = ImageLoaders_androidKt.f13049a;
        Object obj3 = options.b.n.f13043a.get(ImageLoaders_androidKt.f13049a);
        Semaphore semaphoreA = SemaphoreKt.a(((Number) (obj3 == null ? 4 : obj3)).intValue());
        int i = 1;
        if (Build.VERSION.SDK_INT >= 29) {
            Object obj4 = options.b.n.f13043a.get(ImageLoaders_androidKt.b);
            ExifOrientationStrategy exifOrientationStrategy = (ExifOrientationStrategy) (obj4 == null ? obj : obj4);
            if (exifOrientationStrategy.equals(obj) || exifOrientationStrategy.equals(ExifOrientationStrategy.b)) {
                builder.e.add(new b(new StaticImageDecoder.Factory(semaphoreA), i));
            }
        }
        Object obj5 = options.b.n.f13043a.get(ImageLoaders_androidKt.b);
        builder.e.add(new b(new BitmapFactoryDecoder.Factory(semaphoreA, (ExifOrientationStrategy) (obj5 != null ? obj5 : obj)), i));
        builder.b(new FileMapper(), reflectionFactory.b(File.class));
        builder.a(new JarFileFetcher.Factory(), reflectionFactory.b(Uri.class));
        builder.a(new ByteBufferFetcher.Factory(), reflectionFactory.b(ByteBuffer.class));
        builder.b(new StringMapper(), reflectionFactory.b(String.class));
        builder.b(new PathMapper(), reflectionFactory.b(Path.class));
        builder.c.add(new Pair(new FileUriKeyer(), reflectionFactory.b(Uri.class)));
        builder.c.add(new Pair(new UriKeyer(), reflectionFactory.b(Uri.class)));
        builder.a(new FileUriFetcher.Factory(), reflectionFactory.b(Uri.class));
        builder.a(new ByteArrayFetcher.Factory(), reflectionFactory.b(byte[].class));
        builder.f13040a.add(new EngineInterceptor(this, androidSystemCallbacks, androidRequestService));
        this.d = builder.c();
        this.e = 0;
    }

    @Override // coil3.ImageLoader
    public final Object a(ImageRequest imageRequest, ContinuationImpl continuationImpl) {
        return ((imageRequest.c instanceof ViewTarget) || (imageRequest.p instanceof ViewSizeResolver) || ((Lifecycle) ExtrasKt.a(imageRequest, ImageRequests_androidKt.f)) != null) ? CoroutineScopeKt.c(new RealImageLoader$execute$2(this, imageRequest, null), continuationImpl) : c(imageRequest, 1, continuationImpl);
    }

    @Override // coil3.ImageLoader
    public final Disposable b(ImageRequest imageRequest) {
        Deferred deferredA = BuildersKt.a(this.b, null, new RealImageLoader$enqueue$job$1(this, imageRequest, null), 3);
        if (!(imageRequest.c instanceof ViewTarget)) {
            return new OneShotDisposable(deferredA);
        }
        ViewTargetRequestManagerKt.a(null);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0133, code lost:
    
        if (r5.a(r0) == r8) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:97:0x01a6, B:99:0x01ac, B:100:0x01b5, B:102:0x01b9, B:105:0x01c5, B:106:0x01ca, B:27:0x006f, B:78:0x013c, B:80:0x0143, B:82:0x014d, B:83:0x0157, B:84:0x015a, B:86:0x0161, B:87:0x0164), top: B:134:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01dd A[Catch: all -> 0x01ea, TRY_LEAVE, TryCatch #2 {all -> 0x01ea, blocks: (B:113:0x01d9, B:115:0x01dd, B:120:0x01ec, B:122:0x01f6, B:123:0x01f9), top: B:129:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ec A[Catch: all -> 0x01ea, TRY_ENTER, TryCatch #2 {all -> 0x01ea, blocks: (B:113:0x01d9, B:115:0x01dd, B:120:0x01ec, B:122:0x01f6, B:123:0x01f9), top: B:129:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:97:0x01a6, B:99:0x01ac, B:100:0x01b5, B:102:0x01b9, B:105:0x01c5, B:106:0x01ca, B:27:0x006f, B:78:0x013c, B:80:0x0143, B:82:0x014d, B:83:0x0157, B:84:0x015a, B:86:0x0161, B:87:0x0164), top: B:134:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0161 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:97:0x01a6, B:99:0x01ac, B:100:0x01b5, B:102:0x01b9, B:105:0x01c5, B:106:0x01ca, B:27:0x006f, B:78:0x013c, B:80:0x0143, B:82:0x014d, B:83:0x0157, B:84:0x015a, B:86:0x0161, B:87:0x0164), top: B:134:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ac A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:97:0x01a6, B:99:0x01ac, B:100:0x01b5, B:102:0x01b9, B:105:0x01c5, B:106:0x01ca, B:27:0x006f, B:78:0x013c, B:80:0x0143, B:82:0x014d, B:83:0x0157, B:84:0x015a, B:86:0x0161, B:87:0x0164), top: B:134:0x002a }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [coil3.EventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [coil3.EventListener, coil3.EventListener$Companion$NONE$1] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [coil3.EventListener] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [coil3.request.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r5v4, types: [coil3.request.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r5v8, types: [coil3.request.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [coil3.RealImageLoader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(coil3.request.ImageRequest r21, int r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.c(coil3.request.ImageRequest, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final MemoryCache d() {
        return (MemoryCache) this.f13050a.c.getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(coil3.request.ErrorResult r4, coil3.target.Target r5, coil3.EventListener r6) {
        /*
            r3 = this;
            coil3.request.ImageRequest r0 = r4.getB()
            boolean r1 = r5 instanceof coil3.transition.TransitionTarget
            if (r1 != 0) goto Lb
            if (r5 == 0) goto L30
            goto L22
        Lb:
            coil3.request.ImageRequest r1 = r4.getB()
            coil3.Extras$Key r2 = coil3.request.ImageRequests_androidKt.b
            java.lang.Object r1 = coil3.ExtrasKt.a(r1, r2)
            coil3.transition.Transition$Factory r1 = (coil3.transition.Transition.Factory) r1
            r2 = r5
            coil3.transition.TransitionTarget r2 = (coil3.transition.TransitionTarget) r2
            coil3.transition.Transition r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof coil3.transition.NoneTransition
            if (r2 == 0) goto L2a
        L22:
            coil3.Image r4 = r4.getF13146a()
            r5.d(r4)
            goto L30
        L2a:
            r6.getClass()
            r1.a()
        L30:
            r6.getClass()
            coil3.request.ImageRequest$Listener r4 = r0.d
            if (r4 == 0) goto L3a
            r4.a()
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.e(coil3.request.ErrorResult, coil3.target.Target, coil3.EventListener):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(coil3.request.SuccessResult r5, coil3.target.Target r6, coil3.EventListener r7) {
        /*
            r4 = this;
            coil3.request.ImageRequest r0 = r5.b
            coil3.Image r1 = r5.f13146a
            boolean r2 = r6 instanceof coil3.transition.TransitionTarget
            if (r2 != 0) goto Lb
            if (r6 == 0) goto L28
            goto L1e
        Lb:
            coil3.Extras$Key r2 = coil3.request.ImageRequests_androidKt.b
            java.lang.Object r2 = coil3.ExtrasKt.a(r0, r2)
            coil3.transition.Transition$Factory r2 = (coil3.transition.Transition.Factory) r2
            r3 = r6
            coil3.transition.TransitionTarget r3 = (coil3.transition.TransitionTarget) r3
            coil3.transition.Transition r5 = r2.a(r3, r5)
            boolean r2 = r5 instanceof coil3.transition.NoneTransition
            if (r2 == 0) goto L22
        L1e:
            r6.c(r1)
            goto L28
        L22:
            r7.getClass()
            r5.a()
        L28:
            r7.getClass()
            coil3.request.ImageRequest$Listener r5 = r0.d
            if (r5 == 0) goto L32
            r5.onSuccess()
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.f(coil3.request.SuccessResult, coil3.target.Target, coil3.EventListener):void");
    }
}
