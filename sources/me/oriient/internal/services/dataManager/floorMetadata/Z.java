package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.CachedDataStatus;
import me.oriient.internal.services.dataManager.DataSource;
import me.oriient.internal.services.dataManager.SimpleDataSource;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class Z implements DataSource {

    @NotNull
    private static final V Companion = new V();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDataSource f25154a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public Z(SimpleDataSource floorMetadataSource) {
        Intrinsics.h(floorMetadataSource, "floorMetadataSource");
        this.f25154a = floorMetadataSource;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(FloorImagesProvider.class));
    }

    @Override // me.oriient.internal.services.dataManager.DataSource
    public final Object getCacheStatus(Object obj, Continuation continuation) {
        return new Outcome.Success(CachedDataStatus.VALID);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchData(me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.floorMetadata.W
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.floorMetadata.W r0 = (me.oriient.internal.services.dataManager.floorMetadata.W) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorMetadata.W r0 = new me.oriient.internal.services.dataManager.floorMetadata.W
            r0.<init>(r6, r8)
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
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r7 = r0.b
            me.oriient.internal.services.dataManager.floorMetadata.Z r2 = r0.f25151a
            kotlin.ResultKt.b(r8)
            goto L68
        L3a:
            kotlin.ResultKt.b(r8)
            kotlin.Lazy r8 = r6.b
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.infra.utils.core.Logger r8 = (me.oriient.internal.infra.utils.core.Logger) r8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "fetchData() called with: id = "
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "FloorMetadataWithStrSou"
            r8.d(r5, r2)
            me.oriient.internal.services.dataManager.SimpleDataSource r8 = r6.f25154a
            r0.f25151a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r8.fetchData(r7, r0)
            if (r8 != r1) goto L67
            goto L7c
        L67:
            r2 = r6
        L68:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.dataManager.floorMetadata.Y r4 = new me.oriient.internal.services.dataManager.floorMetadata.Y
            r5 = 0
            r4.<init>(r2, r7, r5)
            r0.f25151a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r8.then(r4, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.Z.fetchData(me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
