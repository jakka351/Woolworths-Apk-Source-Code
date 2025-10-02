package coil3.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.compose.d;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.decode.FileImageSource;
import coil3.decode.ImageSourceKt;
import coil3.disk.DiskCache;
import coil3.fetch.Fetcher;
import coil3.network.NetworkHeaders;
import coil3.network.internal.SingleParameterLazy;
import coil3.network.internal.SingleParameterLazyKt;
import coil3.request.CachePolicy;
import coil3.request.Options;
import coil3.util.MimeTypeMap;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/network/NetworkFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class NetworkFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final String f13126a;
    public final Options b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final ConnectivityChecker f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/network/NetworkFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {

        /* renamed from: a, reason: collision with root package name */
        public final Lazy f13127a;
        public final Lazy b;
        public final SingleParameterLazy c;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: coil3.network.NetworkFetcher$Factory$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Context, ConnectivityChecker> {
            public static final AnonymousClass2 d = new AnonymousClass2(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Context applicationContext = ((Context) obj).getApplicationContext();
                ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
                if (connectivityManager != null && ContextCompat.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    try {
                        return new ConnectivityCheckerApi23(connectivityManager);
                    } catch (Exception unused) {
                    }
                }
                return ConnectivityChecker.f13124a;
            }
        }

        public Factory(Function0 function0) {
            d dVar = new d(18);
            AnonymousClass2 anonymousClass2 = AnonymousClass2.d;
            this.f13127a = LazyKt.b(function0);
            this.b = LazyKt.b(dVar);
            this.c = SingleParameterLazyKt.a(anonymousClass2);
        }

        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            Uri uri = (Uri) obj;
            if (!Intrinsics.c(uri.c, "http") && !Intrinsics.c(uri.c, "https")) {
                return null;
            }
            return new NetworkFetcher(uri.f13055a, options, this.f13127a, LazyKt.b(new androidx.lifecycle.d(realImageLoader, 7)), this.b, (ConnectivityChecker) this.c.a(options.f13145a));
        }
    }

    public NetworkFetcher(String str, Options options, Lazy lazy, Lazy lazy2, Lazy lazy3, ConnectivityChecker connectivityChecker) {
        this.f13126a = str;
        this.b = options;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = connectivityChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(coil3.network.NetworkFetcher r4, coil3.network.NetworkResponseBody r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof coil3.network.NetworkFetcher$toImageSource$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.network.NetworkFetcher$toImageSource$1 r0 = (coil3.network.NetworkFetcher$toImageSource$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            coil3.network.NetworkFetcher$toImageSource$1 r0 = new coil3.network.NetworkFetcher$toImageSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            okio.Buffer r4 = r0.q
            coil3.network.NetworkFetcher r5 = r0.p
            kotlin.ResultKt.b(r6)
            r6 = r4
            r4 = r5
            goto L4b
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r6)
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            r0.p = r4
            r0.q = r6
            r0.t = r3
            r5.L(r6)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            if (r5 != r1) goto L4b
            return r1
        L4b:
            okio.FileSystem r4 = r4.e()
            coil3.decode.SourceImageSource r5 = new coil3.decode.SourceImageSource
            r0 = 0
            r5.<init>(r6, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.b(coil3.network.NetworkFetcher, coil3.network.NetworkResponseBody, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(coil3.network.NetworkFetcher r5, coil3.disk.DiskCache.Snapshot r6, coil3.network.NetworkResponse r7, coil3.network.NetworkRequest r8, coil3.network.NetworkResponse r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.c(coil3.network.NetworkFetcher, coil3.disk.DiskCache$Snapshot, coil3.network.NetworkResponse, coil3.network.NetworkRequest, coil3.network.NetworkResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static String f(String str, String str2) {
        String strB;
        if ((str2 == null || StringsKt.W(str2, "text/plain", false)) && (strB = MimeTypeMap.b(str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return StringsKt.c0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #1 {Exception -> 0x004d, blocks: (B:21:0x0048, B:67:0x013c, B:69:0x0140), top: B:88:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // coil3.fetch.Fetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(NetworkRequest networkRequest, Function2 function2, Continuation continuation) {
        if (this.b.i.d && Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        return ((NetworkClient) this.c.getD()).a(networkRequest, new NetworkFetcher$executeNetworkRequest$2(function2, null), continuation);
    }

    public final FileSystem e() {
        FileSystem fileSystem;
        DiskCache diskCache = (DiskCache) this.d.getD();
        return (diskCache == null || (fileSystem = diskCache.getF13087a()) == null) ? this.b.f : fileSystem;
    }

    public final NetworkRequest g() {
        Extras.Key key = ImageRequestsKt.b;
        Options options = this.b;
        NetworkHeaders networkHeaders = (NetworkHeaders) ExtrasKt.b(options, key);
        networkHeaders.getClass();
        NetworkHeaders.Builder builder = new NetworkHeaders.Builder(networkHeaders);
        CachePolicy cachePolicy = options.h;
        boolean z = cachePolicy.d;
        boolean z2 = options.i.d && this.f.a();
        if (!z2 && z) {
            builder.c("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                builder.c("no-cache, only-if-cached");
            }
        } else if (cachePolicy.e) {
            builder.c("no-cache");
        } else {
            builder.c("no-cache, no-store");
        }
        return new NetworkRequest(this.f13126a, (String) ExtrasKt.b(options, ImageRequestsKt.f13125a), builder.b(), (NetworkRequestBody) ExtrasKt.b(options, ImageRequestsKt.c));
    }

    public final FileImageSource h(DiskCache.Snapshot snapshot) {
        Path data = snapshot.getData();
        FileSystem fileSystemE = e();
        String str = this.b.e;
        if (str == null) {
            str = this.f13126a;
        }
        return ImageSourceKt.a(data, fileSystemE, str, snapshot, 16);
    }

    public final NetworkResponse i(DiskCache.Snapshot snapshot) throws Throwable {
        Throwable th;
        NetworkResponse networkResponseA;
        try {
            RealBufferedSource realBufferedSourceC = Okio.c(e().v(snapshot.getMetadata()));
            try {
                networkResponseA = CacheNetworkResponse.a(realBufferedSourceC);
                try {
                    realBufferedSourceC.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    realBufferedSourceC.close();
                } catch (Throwable th4) {
                    ExceptionsKt.a(th3, th4);
                }
                th = th3;
                networkResponseA = null;
            }
            if (th == null) {
                return networkResponseA;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
