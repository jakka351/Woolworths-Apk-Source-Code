package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1279i implements FloorImagesProvider {

    @NotNull
    private static final C1272b Companion = new C1272b();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25162a;
    public final Lazy b;
    public final Lazy c;

    public C1279i() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        Lazy lazyInject = di.inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.f25162a = lazyInject;
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(ContextProvider.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        BuildersKt.c(GlobalScope.d, ((CoroutineContextProvider) lazyInject.getD()).getMain(), null, new C1271a(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof me.oriient.internal.services.dataManager.floorMetadata.C1275e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.internal.services.dataManager.floorMetadata.e r0 = (me.oriient.internal.services.dataManager.floorMetadata.C1275e) r0
            int r2 = r0.c
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.c = r2
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorMetadata.e r0 = new me.oriient.internal.services.dataManager.floorMetadata.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f25158a
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            kotlin.ResultKt.b(r9)     // Catch: java.net.MalformedURLException -> L28
            goto Lc6
        L28:
            r7 = move-exception
            goto Lc9
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.b(r9)
            me.oriient.internal.services.dataManager.floorMetadata.FloorImage r9 = r7.getDefaultMap()     // Catch: java.net.MalformedURLException -> L28
            java.lang.String r9 = r9.getUrl()     // Catch: java.net.MalformedURLException -> L28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.net.MalformedURLException -> L28
            r3.<init>()     // Catch: java.net.MalformedURLException -> L28
            java.lang.String r5 = r7.getId()     // Catch: java.net.MalformedURLException -> L28
            r3.append(r5)     // Catch: java.net.MalformedURLException -> L28
            int r7 = r7.getVersion()     // Catch: java.net.MalformedURLException -> L28
            r3.append(r7)     // Catch: java.net.MalformedURLException -> L28
            java.lang.String r7 = r3.toString()     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.request.RequestOptions r3 = new com.bumptech.glide.request.RequestOptions     // Catch: java.net.MalformedURLException -> L28
            r3.<init>()     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.load.engine.DiskCacheStrategy r5 = com.bumptech.glide.load.engine.DiskCacheStrategy.f13803a     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.d(r5)     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.request.RequestOptions r3 = (com.bumptech.glide.request.RequestOptions) r3     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.request.BaseRequestOptions r1 = r3.k(r1, r1)     // Catch: java.net.MalformedURLException -> L28
            java.lang.String r3 = "override(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r3)     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1     // Catch: java.net.MalformedURLException -> L28
            r0.c = r4     // Catch: java.net.MalformedURLException -> L28
            kotlin.coroutines.SafeContinuation r3 = new kotlin.coroutines.SafeContinuation     // Catch: java.net.MalformedURLException -> L28
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)     // Catch: java.net.MalformedURLException -> L28
            r3.<init>(r0)     // Catch: java.net.MalformedURLException -> L28
            kotlin.Lazy r0 = r6.b     // Catch: java.net.MalformedURLException -> L28
            java.lang.Object r0 = r0.getD()     // Catch: java.net.MalformedURLException -> L28
            me.oriient.internal.infra.utils.android.ContextProvider r0 = (me.oriient.internal.infra.utils.android.ContextProvider) r0     // Catch: java.net.MalformedURLException -> L28
            android.content.Context r0 = r0.getContext()     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.d(r0)     // Catch: java.net.MalformedURLException -> L28
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            com.bumptech.glide.RequestBuilder r0 = r0.c(r4)     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.request.RequestOptions r4 = com.bumptech.glide.RequestManager.n     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.RequestBuilder r0 = r0.a(r4)     // Catch: java.net.MalformedURLException -> L28
            me.oriient.internal.services.dataManager.floorMetadata.c r4 = new me.oriient.internal.services.dataManager.floorMetadata.c     // Catch: java.net.MalformedURLException -> L28
            java.net.URL r5 = new java.net.URL     // Catch: java.net.MalformedURLException -> L28
            r5.<init>(r9)     // Catch: java.net.MalformedURLException -> L28
            r4.<init>(r5, r7)     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.RequestBuilder r7 = r0.N(r4)     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.request.BaseRequestOptions r7 = r7.i(r8)     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.RequestBuilder r7 = (com.bumptech.glide.RequestBuilder) r7     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.RequestBuilder r7 = r7.a(r1)     // Catch: java.net.MalformedURLException -> L28
            me.oriient.internal.services.dataManager.floorMetadata.f r8 = new me.oriient.internal.services.dataManager.floorMetadata.f     // Catch: java.net.MalformedURLException -> L28
            r8.<init>(r3)     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.RequestBuilder r7 = r7.K(r8)     // Catch: java.net.MalformedURLException -> L28
            com.bumptech.glide.request.RequestFutureTarget r8 = new com.bumptech.glide.request.RequestFutureTarget     // Catch: java.net.MalformedURLException -> L28
            r8.<init>()     // Catch: java.net.MalformedURLException -> L28
            java.util.concurrent.Executor r9 = com.bumptech.glide.util.Executors.b     // Catch: java.net.MalformedURLException -> L28
            r7.J(r8, r8, r7, r9)     // Catch: java.net.MalformedURLException -> L28
            java.lang.Object r9 = r3.a()     // Catch: java.net.MalformedURLException -> L28
            if (r9 != r2) goto Lc6
            return r2
        Lc6:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9     // Catch: java.net.MalformedURLException -> L28
            return r9
        Lc9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "failed to load floor image. invalid url. "
            r8.<init>(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            me.oriient.internal.infra.utils.core.Outcome$Failure r8 = new me.oriient.internal.infra.utils.core.Outcome$Failure
            me.oriient.internal.infra.utils.core.InternalError r9 = new me.oriient.internal.infra.utils.core.InternalError
            r9.<init>(r7)
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.C1279i.a(me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.C1279i.b(me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider
    public final Object clearAllCaches(Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(((CoroutineContextProvider) this.f25162a.getD()).getIo(), new C1274d(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider
    public final Object clearData(FloorFetchData floorFetchData, Continuation continuation) {
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider
    public final Object fetchFloorImage(FloorMetadata floorMetadata, Continuation continuation) {
        return a(floorMetadata, false, continuation);
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider
    public final Object fetchFloorSvgImage(FloorMetadata floorMetadata, Continuation continuation) {
        return b(floorMetadata, false, continuation);
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider
    public final Object getCachedFloorImage(FloorMetadata floorMetadata, Continuation continuation) {
        return a(floorMetadata, true, continuation);
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider
    public final Object getCachedSvgFloorImage(FloorMetadata floorMetadata, Continuation continuation) {
        return b(floorMetadata, true, continuation);
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider
    public final Object saveImageToCache(FloorMetadataWithImage floorMetadataWithImage, Continuation continuation) {
        return new Outcome.Success(Unit.f24250a);
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider
    public final Object saveSvgImageToCache(FloorMetadataWithSvgImage floorMetadataWithSvgImage, Continuation continuation) {
        return new Outcome.Success(Unit.f24250a);
    }
}
