package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.ComponentRegistry;
import coil.decode.BitmapFactoryDecoder;
import coil.fetch.AssetUriFetcher;
import coil.fetch.BitmapFetcher;
import coil.fetch.ByteBufferFetcher;
import coil.fetch.ContentUriFetcher;
import coil.fetch.DrawableFetcher;
import coil.fetch.FileFetcher;
import coil.fetch.HttpUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.request.OneShotDisposable;
import coil.request.RequestService;
import coil.target.ViewTarget;
import coil.util.Collections;
import coil.util.ImageLoaderOptions;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RealImageLoader implements ImageLoader {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultRequestOptions f12964a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final ContextScope e;
    public final RequestService f;
    public final ComponentRegistry g;
    public final ArrayList h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil/RealImageLoader$Companion;", "", "", "REQUEST_TYPE_ENQUEUE", "I", "REQUEST_TYPE_EXECUTE", "", "TAG", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public RealImageLoader(Context context, DefaultRequestOptions defaultRequestOptions, Lazy lazy, Lazy lazy2, Lazy lazy3, ComponentRegistry componentRegistry, ImageLoaderOptions imageLoaderOptions) {
        this.f12964a = defaultRequestOptions;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.e = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a.T()).plus(new RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.d)));
        SystemCallbacks systemCallbacks = new SystemCallbacks(this, context, imageLoaderOptions.b);
        RequestService requestService = new RequestService(this, systemCallbacks);
        this.f = requestService;
        ComponentRegistry.Builder builder = new ComponentRegistry.Builder(componentRegistry);
        builder.b(new HttpUrlMapper(), HttpUrl.class);
        builder.b(new StringMapper(), String.class);
        builder.b(new FileUriMapper(), Uri.class);
        builder.b(new ResourceUriMapper(), Uri.class);
        builder.b(new ResourceIntMapper(), Integer.class);
        builder.b(new ByteArrayMapper(), byte[].class);
        Pair pair = new Pair(new UriKeyer(), Uri.class);
        ArrayList arrayList = builder.c;
        arrayList.add(pair);
        arrayList.add(new Pair(new FileKeyer(imageLoaderOptions.f13035a), File.class));
        builder.a(new HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.c), Uri.class);
        builder.a(new FileFetcher.Factory(), File.class);
        builder.a(new AssetUriFetcher.Factory(), Uri.class);
        builder.a(new ContentUriFetcher.Factory(), Uri.class);
        builder.a(new ResourceUriFetcher.Factory(), Uri.class);
        builder.a(new DrawableFetcher.Factory(), Drawable.class);
        builder.a(new BitmapFetcher.Factory(), Bitmap.class);
        builder.a(new ByteBufferFetcher.Factory(), ByteBuffer.class);
        BitmapFactoryDecoder.Factory factory = new BitmapFactoryDecoder.Factory(imageLoaderOptions.d, imageLoaderOptions.e);
        ArrayList arrayList2 = builder.e;
        arrayList2.add(factory);
        ComponentRegistry componentRegistry2 = new ComponentRegistry(Collections.a(builder.f12961a), Collections.a(builder.b), Collections.a(arrayList), Collections.a(builder.d), Collections.a(arrayList2));
        this.g = componentRegistry2;
        this.h = CollectionsKt.d0(new EngineInterceptor(this, requestService), componentRegistry2.f12960a);
        new AtomicBoolean(false);
        context.registerComponentCallbacks(systemCallbacks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[Catch: all -> 0x00d8, PHI: r1 r2 r3 r4
  0x00db: PHI (r1v13 coil.RealImageLoader) = (r1v3 coil.RealImageLoader), (r1v0 coil.RealImageLoader), (r1v0 coil.RealImageLoader) binds: [B:28:0x0075, B:38:0x00c3, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r2v17 coil.EventListener) = (r2v5 coil.EventListener), (r2v23 coil.EventListener), (r2v23 coil.EventListener) binds: [B:28:0x0075, B:38:0x00c3, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r3v11 coil.request.ImageRequest) = (r3v20 coil.request.ImageRequest), (r3v21 coil.request.ImageRequest), (r3v22 coil.request.ImageRequest) binds: [B:28:0x0075, B:38:0x00c3, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r4v10 coil.request.RequestDelegate) = (r4v12 coil.request.RequestDelegate), (r4v13 coil.request.RequestDelegate), (r4v14 coil.request.RequestDelegate) binds: [B:28:0x0075, B:38:0x00c3, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x00d8, blocks: (B:44:0x00db, B:46:0x00e1, B:47:0x00e4, B:49:0x00ef, B:50:0x00f2, B:35:0x00ba, B:37:0x00c0, B:39:0x00c5, B:84:0x0189, B:85:0x0190), top: B:106:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:44:0x00db, B:46:0x00e1, B:47:0x00e4, B:49:0x00ef, B:50:0x00f2, B:35:0x00ba, B:37:0x00c0, B:39:0x00c5, B:84:0x0189, B:85:0x0190), top: B:106:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:44:0x00db, B:46:0x00e1, B:47:0x00e4, B:49:0x00ef, B:50:0x00f2, B:35:0x00ba, B:37:0x00c0, B:39:0x00c5, B:84:0x0189, B:85:0x0190), top: B:106:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:60:0x0139, B:62:0x013f, B:65:0x0151, B:70:0x0169, B:66:0x0155, B:69:0x0163, B:75:0x0172, B:77:0x0176), top: B:97:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:60:0x0139, B:62:0x013f, B:65:0x0151, B:70:0x0169, B:66:0x0155, B:69:0x0163, B:75:0x0172, B:77:0x0176), top: B:97:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195 A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #5 {all -> 0x01a7, blocks: (B:86:0x0191, B:88:0x0195, B:93:0x01a9, B:94:0x01b2), top: B:105:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9 A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #5 {all -> 0x01a7, blocks: (B:86:0x0191, B:88:0x0195, B:93:0x01a9, B:94:0x01b2), top: B:105:0x0191 }] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [coil.request.ImageRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [coil.request.RequestDelegate] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(coil.RealImageLoader r21, coil.request.ImageRequest r22, int r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.c(coil.RealImageLoader, coil.request.ImageRequest, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // coil.ImageLoader
    /* renamed from: a, reason: from getter */
    public final DefaultRequestOptions getF12964a() {
        return this.f12964a;
    }

    @Override // coil.ImageLoader
    public final Object b(ImageRequest imageRequest, SuspendLambda suspendLambda) {
        return CoroutineScopeKt.c(new RealImageLoader$execute$2(this, imageRequest, null), suspendLambda);
    }

    public final Disposable d(ImageRequest imageRequest) {
        Deferred deferredA = BuildersKt.a(this.e, null, new RealImageLoader$enqueue$job$1(this, imageRequest, null), 3);
        if (!(imageRequest.c instanceof ViewTarget)) {
            return new OneShotDisposable(deferredA);
        }
        Utils.c(null);
        throw null;
    }

    public final MemoryCache e() {
        return (MemoryCache) this.b.getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(coil.request.ErrorResult r5, coil.target.Target r6, coil.EventListener r7) {
        /*
            r4 = this;
            coil.request.ImageRequest r0 = r5.b
            android.graphics.drawable.Drawable r1 = r5.f13016a
            boolean r2 = r6 instanceof coil.transition.TransitionTarget
            if (r2 != 0) goto Lb
            if (r6 == 0) goto L22
            goto L18
        Lb:
            coil.transition.Transition$Factory r2 = r0.g
            r3 = r6
            coil.transition.TransitionTarget r3 = (coil.transition.TransitionTarget) r3
            coil.transition.Transition r5 = r2.a(r3, r5)
            boolean r2 = r5 instanceof coil.transition.NoneTransition
            if (r2 == 0) goto L1c
        L18:
            r6.d(r1)
            goto L22
        L1c:
            r7.getClass()
            r5.a()
        L22:
            r7.getClass()
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.f(coil.request.ErrorResult, coil.target.Target, coil.EventListener):void");
    }
}
