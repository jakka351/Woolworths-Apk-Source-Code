package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.DataCache;
import me.oriient.internal.services.dataManager.InMemoryDataCache;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class F implements DataCache {

    @NotNull
    private static final C1293x Companion = new C1293x();

    /* renamed from: a, reason: collision with root package name */
    public final InMemoryDataCache f25138a;
    public final Lazy b;
    public final Lazy c;

    public F(InMemoryDataCache floorMetadataCache) {
        Intrinsics.h(floorMetadataCache, "floorMetadataCache");
        this.f25138a = floorMetadataCache;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(FloorImagesProvider.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r6.clearAllCaches(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clean(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof me.oriient.internal.services.dataManager.floorMetadata.C1294y
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.services.dataManager.floorMetadata.y r0 = (me.oriient.internal.services.dataManager.floorMetadata.C1294y) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorMetadata.y r0 = new me.oriient.internal.services.dataManager.floorMetadata.y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            me.oriient.internal.services.dataManager.floorMetadata.F r2 = r0.f25172a
            kotlin.ResultKt.b(r6)
            goto L49
        L38:
            kotlin.ResultKt.b(r6)
            me.oriient.internal.services.dataManager.InMemoryDataCache r6 = r5.f25138a
            r0.f25172a = r5
            r0.d = r4
            java.lang.Object r6 = r6.clean(r0)
            if (r6 != r1) goto L48
            goto L5c
        L48:
            r2 = r5
        L49:
            kotlin.Lazy r6 = r2.c
            java.lang.Object r6 = r6.getD()
            me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider r6 = (me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider) r6
            r2 = 0
            r0.f25172a = r2
            r0.d = r3
            java.lang.Object r6 = r6.clearAllCaches(r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.F.clean(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r7.clearData(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cleanData(me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.floorMetadata.C1295z
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.floorMetadata.z r0 = (me.oriient.internal.services.dataManager.floorMetadata.C1295z) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorMetadata.z r0 = new me.oriient.internal.services.dataManager.floorMetadata.z
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r6 = r0.b
            me.oriient.internal.services.dataManager.floorMetadata.F r2 = r0.f25173a
            kotlin.ResultKt.b(r7)
            goto L4d
        L3a:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.dataManager.InMemoryDataCache r7 = r5.f25138a
            r0.f25173a = r5
            r0.b = r6
            r0.e = r4
            java.lang.Object r7 = r7.cleanData(r6, r0)
            if (r7 != r1) goto L4c
            goto L62
        L4c:
            r2 = r5
        L4d:
            kotlin.Lazy r7 = r2.c
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider r7 = (me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider) r7
            r2 = 0
            r0.f25173a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r7.clearData(r6, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.F.cleanData(me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getData(me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof me.oriient.internal.services.dataManager.floorMetadata.A
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.internal.services.dataManager.floorMetadata.A r0 = (me.oriient.internal.services.dataManager.floorMetadata.A) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorMetadata.A r0 = new me.oriient.internal.services.dataManager.floorMetadata.A
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            me.oriient.internal.services.dataManager.floorMetadata.F r7 = r0.f25133a
            kotlin.ResultKt.b(r9)
            goto L6c
        L38:
            kotlin.ResultKt.b(r9)
            kotlin.Lazy r9 = r6.b
            java.lang.Object r9 = r9.getD()
            me.oriient.internal.infra.utils.core.Logger r9 = (me.oriient.internal.infra.utils.core.Logger) r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "getData() called with: id = "
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r5 = ", allowOutdated = "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "FloorMetadataWithImageCac"
            r9.d(r5, r2)
            me.oriient.internal.services.dataManager.InMemoryDataCache r9 = r6.f25138a
            r0.f25133a = r6
            r0.d = r4
            java.lang.Object r9 = r9.getData(r7, r8, r0)
            if (r9 != r1) goto L6b
            goto L7e
        L6b:
            r7 = r6
        L6c:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.dataManager.floorMetadata.C r8 = new me.oriient.internal.services.dataManager.floorMetadata.C
            r2 = 0
            r8.<init>(r7, r2)
            r0.f25133a = r2
            r0.d = r3
            java.lang.Object r7 = r9.then(r8, r0)
            if (r7 != r1) goto L7f
        L7e:
            return r1
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.F.getData(me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object save(me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r6, me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.floorMetadata.D
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.floorMetadata.D r0 = (me.oriient.internal.services.dataManager.floorMetadata.D) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorMetadata.D r0 = new me.oriient.internal.services.dataManager.floorMetadata.D
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage r7 = r0.b
            me.oriient.internal.services.dataManager.floorMetadata.F r6 = r0.f25136a
            kotlin.ResultKt.b(r8)
            goto L51
        L3a:
            kotlin.ResultKt.b(r8)
            me.oriient.internal.services.dataManager.InMemoryDataCache r8 = r5.f25138a
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata r2 = r7.getMetadata()
            r0.f25136a = r5
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r8.save(r6, r2, r0)
            if (r8 != r1) goto L50
            goto L65
        L50:
            r6 = r5
        L51:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.dataManager.floorMetadata.E r2 = new me.oriient.internal.services.dataManager.floorMetadata.E
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f25136a = r4
            r0.b = r4
            r0.e = r3
            java.lang.Object r6 = r8.then(r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.F.save(me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
