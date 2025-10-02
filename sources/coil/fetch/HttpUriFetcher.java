package coil.fetch;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.decode.FileImageSource;
import coil.disk.DiskCache;
import coil.fetch.Fetcher;
import coil.network.CacheResponse;
import coil.network.CacheStrategy;
import coil.request.CachePolicy;
import coil.request.Options;
import coil.util.Utils;
import java.io.IOException;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/fetch/HttpUriFetcher;", "Lcoil/fetch/Fetcher;", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HttpUriFetcher implements Fetcher {
    public static final CacheControl f;
    public static final CacheControl g;

    /* renamed from: a, reason: collision with root package name */
    public final String f12992a;
    public final Options b;
    public final Lazy c;
    public final Lazy d;
    public final boolean e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil/fetch/HttpUriFetcher$Companion;", "", "Lokhttp3/CacheControl;", "CACHE_CONTROL_FORCE_NETWORK_NO_CACHE", "Lokhttp3/CacheControl;", "CACHE_CONTROL_NO_NETWORK_NO_CACHE", "", "MIME_TYPE_TEXT_PLAIN", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/fetch/HttpUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {

        /* renamed from: a, reason: collision with root package name */
        public final Lazy f12993a;
        public final Lazy b;
        public final boolean c;

        public Factory(Lazy lazy, Lazy lazy2, boolean z) {
            this.f12993a = lazy;
            this.b = lazy2;
            this.c = z;
        }

        @Override // coil.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options) {
            Uri uri = (Uri) obj;
            if (!Intrinsics.c(uri.getScheme(), "http") && !Intrinsics.c(uri.getScheme(), "https")) {
                return null;
            }
            return new HttpUriFetcher(uri.toString(), options, this.f12993a, this.b, this.c);
        }
    }

    static {
        CacheControl.Builder builder = new CacheControl.Builder();
        builder.f26665a = true;
        builder.b = true;
        f = builder.a();
        CacheControl.Builder builder2 = new CacheControl.Builder();
        builder2.f26665a = true;
        builder2.d = true;
        g = builder2.a();
    }

    public HttpUriFetcher(String str, Options options, Lazy lazy, Lazy lazy2, boolean z) {
        this.f12992a = str;
        this.b = options;
        this.c = lazy;
        this.d = lazy2;
        this.e = z;
    }

    public static String d(String str, MediaType mediaType) {
        String strB;
        String str2 = mediaType != null ? mediaType.f26685a : null;
        if ((str2 == null || StringsKt.W(str2, "text/plain", false)) && (strB = Utils.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return StringsKt.c0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9 A[Catch: Exception -> 0x015b, TryCatch #1 {Exception -> 0x015b, blocks: (B:83:0x01a3, B:85:0x01a9, B:87:0x01c8, B:89:0x01cd, B:88:0x01cb, B:91:0x01d1, B:92:0x01d6, B:59:0x012b, B:62:0x0137, B:64:0x0143, B:66:0x0151, B:70:0x015d, B:72:0x0165, B:74:0x017f, B:76:0x0184, B:75:0x0182, B:78:0x0188), top: B:103:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1 A[Catch: Exception -> 0x015b, TryCatch #1 {Exception -> 0x015b, blocks: (B:83:0x01a3, B:85:0x01a9, B:87:0x01c8, B:89:0x01cd, B:88:0x01cb, B:91:0x01d1, B:92:0x01d6, B:59:0x012b, B:62:0x0137, B:64:0x0143, B:66:0x0151, B:70:0x015d, B:72:0x0165, B:74:0x017f, B:76:0x0184, B:75:0x0182, B:78:0x0188), top: B:103:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01de A[Catch: Exception -> 0x01db, TryCatch #0 {Exception -> 0x01db, blocks: (B:93:0x01d7, B:94:0x01da, B:57:0x0123, B:97:0x01de, B:98:0x01e3), top: B:102:0x0027 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // coil.fetch.Fetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(okhttp3.Request r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            if (r0 == 0) goto L13
            r0 = r6
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = (coil.fetch.HttpUriFetcher$executeNetworkRequest$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = new coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L74
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            android.graphics.Bitmap$Config[] r6 = coil.util.Utils.f13033a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r2)
            kotlin.Lazy r2 = r4.c
            if (r6 == 0) goto L61
            coil.request.Options r6 = r4.b
            coil.request.CachePolicy r6 = r6.m
            boolean r6 = r6.d
            if (r6 != 0) goto L5b
            java.lang.Object r6 = r2.getD()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.internal.connection.RealCall r5 = r6.a(r5)
            okhttp3.Response r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            goto L77
        L5b:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L61:
            java.lang.Object r6 = r2.getD()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.internal.connection.RealCall r5 = r6.a(r5)
            r0.r = r3
            java.lang.Object r6 = coil.util.Calls.a(r5, r0)
            if (r6 != r1) goto L74
            return r1
        L74:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L77:
            boolean r6 = r5.s
            int r0 = r5.g
            if (r6 != 0) goto L9f
            r6 = 304(0x130, float:4.26E-43)
            if (r0 == r6) goto L9f
            okhttp3.ResponseBody r6 = r5.j
            if (r6 == 0) goto L88
            coil.util.Utils.a(r6)
        L88:
            coil.network.HttpException r6 = new coil.network.HttpException
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = ": "
            java.lang.StringBuilder r0 = YU.a.r(r0, r1, r2)
            java.lang.String r5 = r5.f
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L9f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.b(okhttp3.Request, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final FileSystem c() {
        Object d = this.d.getD();
        Intrinsics.e(d);
        return ((DiskCache) d).getF12983a();
    }

    public final Request e() {
        Request.Builder builder = new Request.Builder();
        builder.h(this.f12992a);
        Options options = this.b;
        builder.d(options.h);
        for (Map.Entry entry : options.i.f13025a.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.f(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builder.g((Class) key, entry.getValue());
        }
        CachePolicy cachePolicy = options.l;
        boolean z = cachePolicy.d;
        boolean z2 = options.m.d;
        if (!z2 && z) {
            builder.b(CacheControl.p);
        } else if (!z2 || z) {
            if (!z2 && !z) {
                builder.b(g);
            }
        } else if (cachePolicy.e) {
            builder.b(CacheControl.o);
        } else {
            builder.b(f);
        }
        return new Request(builder);
    }

    public final CacheResponse f(DiskCache.Snapshot snapshot) throws Throwable {
        Throwable th;
        CacheResponse cacheResponse;
        try {
            RealBufferedSource realBufferedSourceC = Okio.c(c().v(snapshot.getMetadata()));
            try {
                cacheResponse = new CacheResponse(realBufferedSourceC);
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
                cacheResponse = null;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.e(cacheResponse);
            return cacheResponse;
        } catch (IOException unused) {
            return null;
        }
    }

    public final FileImageSource g(DiskCache.Snapshot snapshot) {
        Path data = snapshot.getData();
        FileSystem fileSystemC = c();
        this.b.getClass();
        return new FileImageSource(data, fileSystemC, this.f12992a, snapshot);
    }

    public final DiskCache.Snapshot h(DiskCache.Snapshot snapshot, Request request, Response response, CacheResponse cacheResponse) throws IOException {
        DiskCache.Editor editorA;
        Throwable th;
        Long lValueOf;
        Headers headers = response.i;
        Options options = this.b;
        Throwable th2 = null;
        if (options.l.e && (!this.e || (!request.a().b && !response.a().b && !Intrinsics.c(headers.b("Vary"), "*")))) {
            if (snapshot != null) {
                editorA = snapshot.I();
            } else {
                DiskCache diskCache = (DiskCache) this.d.getD();
                if (diskCache != null) {
                    options.getClass();
                    editorA = diskCache.a(this.f12992a);
                } else {
                    editorA = null;
                }
            }
            try {
                if (editorA != null) {
                    try {
                        int i = response.g;
                        Unit unit = Unit.f24250a;
                        if (i != 304 || cacheResponse == null) {
                            RealBufferedSink realBufferedSinkB = Okio.b(c().r(editorA.getMetadata(), false));
                            try {
                                new CacheResponse(response).a(realBufferedSinkB);
                                try {
                                    realBufferedSinkB.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                try {
                                    realBufferedSinkB.close();
                                } catch (Throwable th5) {
                                    ExceptionsKt.a(th4, th5);
                                }
                                th = th4;
                                unit = null;
                            }
                            if (th != null) {
                                throw th;
                            }
                            Intrinsics.e(unit);
                            RealBufferedSink realBufferedSinkB2 = Okio.b(c().r(editorA.getData(), false));
                            try {
                                ResponseBody responseBody = response.j;
                                Intrinsics.e(responseBody);
                                lValueOf = Long.valueOf(responseBody.U0().t2(realBufferedSinkB2));
                                try {
                                    realBufferedSinkB2.close();
                                } catch (Throwable th6) {
                                    th2 = th6;
                                }
                            } catch (Throwable th7) {
                                try {
                                    realBufferedSinkB2.close();
                                } catch (Throwable th8) {
                                    ExceptionsKt.a(th7, th8);
                                }
                                th2 = th7;
                                lValueOf = null;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            Intrinsics.e(lValueOf);
                        } else {
                            Response.Builder builderC = response.c();
                            builderC.c(CacheStrategy.Companion.a(cacheResponse.f, headers));
                            Response responseA = builderC.a();
                            RealBufferedSink realBufferedSinkB3 = Okio.b(c().r(editorA.getMetadata(), false));
                            try {
                                new CacheResponse(responseA).a(realBufferedSinkB3);
                                try {
                                    realBufferedSinkB3.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                try {
                                    realBufferedSinkB3.close();
                                } catch (Throwable th11) {
                                    ExceptionsKt.a(th10, th11);
                                }
                                unit = null;
                                th2 = th10;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            Intrinsics.e(unit);
                        }
                        DiskCache.Snapshot snapshotA = editorA.a();
                        Utils.a(response);
                        return snapshotA;
                    } catch (Exception e) {
                        Bitmap.Config[] configArr = Utils.f13033a;
                        try {
                            editorA.abort();
                        } catch (Exception unused) {
                        }
                        throw e;
                    }
                }
            } catch (Throwable th12) {
                Utils.a(response);
                throw th12;
            }
        } else if (snapshot != null) {
            Utils.a(snapshot);
        }
        return null;
    }
}
