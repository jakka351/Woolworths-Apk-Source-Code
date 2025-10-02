package me.oriient.internal.services.dataManager.region;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataManager.building.BuildingKt;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g implements RegionRepository {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final DataRepositoryImpl f25397a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public g(DataRepositoryImpl regionDataRepository) {
        Intrinsics.h(regionDataRepository, "regionDataRepository");
        this.f25397a = regionDataRepository;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(FloorMetadataRepository.class));
    }

    @Override // me.oriient.internal.services.dataManager.region.RegionRepository
    public final Object cleanCache(Continuation continuation) {
        Object objCleanCache = this.f25397a.cleanCache(continuation);
        return objCleanCache == CoroutineSingletons.d ? objCleanCache : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.region.RegionRepository
    public final Object cleanData(String str, Continuation continuation) {
        Object objCleanData = this.f25397a.cleanData(BuildingKt.getAsBuildingId(str), continuation);
        return objCleanData == CoroutineSingletons.d ? objCleanData : Unit.f24250a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.region.RegionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getExitRegions(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.region.c
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.region.c r0 = (me.oriient.internal.services.dataManager.region.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.region.c r0 = new me.oriient.internal.services.dataManager.region.c
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
            goto L83
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r7 = r0.b
            me.oriient.internal.services.dataManager.region.g r2 = r0.f25393a
            kotlin.ResultKt.b(r8)
            goto L6e
        L3a:
            kotlin.ResultKt.b(r8)
            kotlin.Lazy r8 = r6.b
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.infra.utils.core.Logger r8 = (me.oriient.internal.infra.utils.core.Logger) r8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "getExitRegions() called with: buildingId = "
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "RegionRepository"
            r8.d(r5, r2)
            kotlin.Lazy r8 = r6.c
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.services.dataManager.building.BuildingRepository r8 = (me.oriient.internal.services.dataManager.building.BuildingRepository) r8
            r0.f25393a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r8.fetchBuilding(r7, r0)
            if (r8 != r1) goto L6d
            goto L82
        L6d:
            r2 = r6
        L6e:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.dataManager.region.e r4 = new me.oriient.internal.services.dataManager.region.e
            r5 = 0
            r4.<init>(r2, r7, r5)
            r0.f25393a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r8 = r8.then(r4, r0)
            if (r8 != r1) goto L83
        L82:
            return r1
        L83:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.dataManager.region.f r7 = me.oriient.internal.services.dataManager.region.f.f25396a
            me.oriient.internal.infra.utils.core.Outcome r7 = r8.map(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.region.g.getExitRegions(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.region.RegionRepository
    public final Object getRegions(String str, Continuation continuation) {
        return this.f25397a.getData(BuildingKt.getAsBuildingId(str), false, continuation);
    }
}
