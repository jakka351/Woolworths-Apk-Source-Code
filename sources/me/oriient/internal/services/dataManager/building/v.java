package me.oriient.internal.services.dataManager.building;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class v implements BuildingRepository {

    @NotNull
    public static final C1235c Companion = new C1235c();

    /* renamed from: a, reason: collision with root package name */
    public final DataRepositoryImpl f25118a;
    public final DataRepositoryImpl b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final ConcurrentHashMap g;

    public v(DataRepositoryImpl buildingDataRepository, DataRepositoryImpl buildingByClientIdDataRepository) {
        Intrinsics.h(buildingDataRepository, "buildingDataRepository");
        Intrinsics.h(buildingByClientIdDataRepository, "buildingByClientIdDataRepository");
        this.f25118a = buildingDataRepository;
        this.b = buildingByClientIdDataRepository;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(w.class));
        this.f = InternalDiKt.getDi().inject(reflectionFactory.b(AuthManager.class));
        this.g = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.internal.services.dataManager.building.v r9, java.lang.String r10, me.oriient.internal.services.dataManager.common.WorldCoordinate r11, float r12, float r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.building.v.a(me.oriient.internal.services.dataManager.building.v, java.lang.String, me.oriient.internal.services.dataManager.common.WorldCoordinate, float, float, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.cleanCache(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cleanCache(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof me.oriient.internal.services.dataManager.building.C1236d
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.services.dataManager.building.d r0 = (me.oriient.internal.services.dataManager.building.C1236d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.building.d r0 = new me.oriient.internal.services.dataManager.building.d
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
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            me.oriient.internal.services.dataManager.building.v r2 = r0.f25100a
            kotlin.ResultKt.b(r6)
            goto L49
        L38:
            kotlin.ResultKt.b(r6)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r6 = r5.f25118a
            r0.f25100a = r5
            r0.d = r4
            java.lang.Object r6 = r6.cleanCache(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            me.oriient.internal.services.dataManager.DataRepositoryImpl r6 = r2.b
            r2 = 0
            r0.f25100a = r2
            r0.d = r3
            java.lang.Object r6 = r6.cleanCache(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.building.v.cleanCache(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    public final Object cleanData(String str, Continuation continuation) {
        Object objCleanData = this.f25118a.cleanData(BuildingKt.getAsBuildingId(str), continuation);
        return objCleanData == CoroutineSingletons.d ? objCleanData : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    public final void cleanInMemoryCache() {
        this.g.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchBuilding(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.building.C1237e
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.building.e r0 = (me.oriient.internal.services.dataManager.building.C1237e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.building.e r0 = new me.oriient.internal.services.dataManager.building.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.b
            me.oriient.internal.services.dataManager.building.v r0 = r0.f25101a
            kotlin.ResultKt.b(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r7 = r5.f25118a
            me.oriient.internal.services.dataManager.building.BuildingId r2 = me.oriient.internal.services.dataManager.building.BuildingKt.getAsBuildingId(r6)
            r0.f25101a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r7 = r7.getData(r2, r3, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            me.oriient.internal.infra.utils.core.Outcome r7 = (me.oriient.internal.infra.utils.core.Outcome) r7
            boolean r1 = r7 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            java.lang.String r2 = "BuildingRepository"
            if (r1 == 0) goto L6d
            r1 = r7
            me.oriient.internal.infra.utils.core.Outcome$Success r1 = (me.oriient.internal.infra.utils.core.Outcome.Success) r1
            java.lang.Object r1 = r1.getValue()
            me.oriient.internal.services.dataManager.building.Building r1 = (me.oriient.internal.services.dataManager.building.Building) r1
            kotlin.Lazy r1 = r0.d
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.services.elog.ELog r1 = (me.oriient.internal.services.elog.ELog) r1
            me.oriient.internal.services.dataManager.building.f r3 = new me.oriient.internal.services.dataManager.building.f
            r3.<init>(r6)
            java.lang.String r4 = "Get building by ID"
            r1.v(r2, r4, r3)
        L6d:
            boolean r1 = r7 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r1 == 0) goto L8c
            r1 = r7
            me.oriient.internal.infra.utils.core.Outcome$Failure r1 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r1
            java.lang.Exception r1 = r1.getValue()
            me.oriient.internal.infra.utils.core.OriientError r1 = (me.oriient.internal.infra.utils.core.OriientError) r1
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.services.elog.ELog r0 = (me.oriient.internal.services.elog.ELog) r0
            me.oriient.internal.services.dataManager.building.g r3 = new me.oriient.internal.services.dataManager.building.g
            r3.<init>(r6, r1)
            java.lang.String r6 = "Failed to get building by ID"
            r0.e(r2, r6, r3)
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.building.v.fetchBuilding(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchBuildingByClientId(java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof me.oriient.internal.services.dataManager.building.C1240h
            if (r0 == 0) goto L13
            r0 = r11
            me.oriient.internal.services.dataManager.building.h r0 = (me.oriient.internal.services.dataManager.building.C1240h) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.building.h r0 = new me.oriient.internal.services.dataManager.building.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            java.lang.String r3 = "BuildingRepository"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            me.oriient.internal.infra.utils.core.Outcome$Success r10 = r0.c
            java.lang.String r1 = r0.b
            me.oriient.internal.services.dataManager.building.v r0 = r0.f25104a
            kotlin.ResultKt.b(r11)
            goto L84
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            java.lang.String r10 = r0.b
            me.oriient.internal.services.dataManager.building.v r2 = r0.f25104a
            kotlin.ResultKt.b(r11)
            goto L59
        L42:
            kotlin.ResultKt.b(r11)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r11 = r9.b
            me.oriient.internal.services.dataManager.building.BuildingClientId r2 = me.oriient.internal.services.dataManager.building.BuildingKt.getAsBuildingClientId(r10)
            r0.f25104a = r9
            r0.b = r10
            r0.f = r5
            java.lang.Object r11 = r11.getData(r2, r5, r0)
            if (r11 != r1) goto L58
            goto L80
        L58:
            r2 = r9
        L59:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            boolean r5 = r11 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r5 == 0) goto L99
            r5 = r11
            me.oriient.internal.infra.utils.core.Outcome$Success r5 = (me.oriient.internal.infra.utils.core.Outcome.Success) r5
            java.lang.Object r6 = r5.getValue()
            me.oriient.internal.services.dataManager.building.Building r6 = (me.oriient.internal.services.dataManager.building.Building) r6
            me.oriient.internal.services.dataManager.DataRepositoryImpl r7 = r2.f25118a
            java.lang.String r8 = r6.getId()
            me.oriient.internal.services.dataManager.building.BuildingId r8 = me.oriient.internal.services.dataManager.building.BuildingKt.getAsBuildingId(r8)
            r0.f25104a = r2
            r0.b = r10
            r0.c = r5
            r0.f = r4
            java.lang.Object r0 = r7.saveData(r8, r6, r0)
            if (r0 != r1) goto L81
        L80:
            return r1
        L81:
            r1 = r10
            r10 = r11
            r0 = r2
        L84:
            kotlin.Lazy r11 = r0.d
            java.lang.Object r11 = r11.getD()
            me.oriient.internal.services.elog.ELog r11 = (me.oriient.internal.services.elog.ELog) r11
            me.oriient.internal.services.dataManager.building.i r2 = new me.oriient.internal.services.dataManager.building.i
            r2.<init>(r1)
            java.lang.String r4 = "Get building by client ID"
            r11.v(r3, r4, r2)
            r11 = r10
            r2 = r0
            r10 = r1
        L99:
            boolean r0 = r11 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r0 == 0) goto Lb8
            r0 = r11
            me.oriient.internal.infra.utils.core.Outcome$Failure r0 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r0
            java.lang.Exception r0 = r0.getValue()
            me.oriient.internal.infra.utils.core.OriientError r0 = (me.oriient.internal.infra.utils.core.OriientError) r0
            kotlin.Lazy r1 = r2.d
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.services.elog.ELog r1 = (me.oriient.internal.services.elog.ELog) r1
            me.oriient.internal.services.dataManager.building.j r2 = new me.oriient.internal.services.dataManager.building.j
            r2.<init>(r10, r0)
            java.lang.String r10 = "Failed to get building by client ID"
            r1.e(r3, r10, r2)
        Lb8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.building.v.fetchBuildingByClientId(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    public final Object fetchBuildingSearchResults(BuildingSearchPage buildingSearchPage, Continuation continuation) {
        return BuildersKt.f(((CoroutineContextProvider) this.c.getD()).getIo(), new k(this, buildingSearchPage, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    public final Object fetchClientBuildingId(String str, Continuation continuation) {
        w wVar = (w) this.e.getD();
        BuildingId asBuildingId = BuildingKt.getAsBuildingId(str);
        D d = (D) wVar;
        return RestHelper.DefaultImpls.getStringData$default((RestHelper) d.b.getD(), "BuildingRest", ((OriientApiProvider) d.f25093a.getD()).getOriientApi().getRealtimeUrl() + "/v1/buildings/" + asBuildingId.getValue() + "/client", false, A.f25092a, continuation, 4, null);
    }

    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    public final Object searchBuildings(String str, WorldCoordinate worldCoordinate, float f, float f2, String str2, Continuation continuation) {
        return BuildersKt.f(((CoroutineContextProvider) this.c.getD()).getIo(), new q(this, str, worldCoordinate, f2, f, str2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.building.BuildingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object searchBuildings(java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.building.l
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.building.l r0 = (me.oriient.internal.services.dataManager.building.l) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.building.l r0 = new me.oriient.internal.services.dataManager.building.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r7 = r0.b
            me.oriient.internal.services.dataManager.building.v r6 = r0.f25108a
            kotlin.ResultKt.b(r8)
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r8)
            kotlin.Lazy r8 = r5.c
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider r8 = (me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider) r8
            kotlin.coroutines.CoroutineContext r8 = r8.getIo()
            me.oriient.internal.services.dataManager.building.n r2 = new me.oriient.internal.services.dataManager.building.n
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.f25108a = r5
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r8, r2, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            r6 = r5
        L56:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            boolean r0 = r8 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            java.lang.String r1 = "BuildingRepository"
            if (r0 == 0) goto L79
            r0 = r8
            me.oriient.internal.infra.utils.core.Outcome$Success r0 = (me.oriient.internal.infra.utils.core.Outcome.Success) r0
            java.lang.Object r0 = r0.getValue()
            me.oriient.internal.services.dataManager.building.BuildingsSearchResult r0 = (me.oriient.internal.services.dataManager.building.BuildingsSearchResult) r0
            kotlin.Lazy r2 = r6.d
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.services.elog.ELog r2 = (me.oriient.internal.services.elog.ELog) r2
            me.oriient.internal.services.dataManager.building.o r3 = new me.oriient.internal.services.dataManager.building.o
            r3.<init>(r7, r0)
            java.lang.String r0 = "Get all buildings"
            r2.d(r1, r0, r3)
        L79:
            boolean r0 = r8 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r0 == 0) goto L98
            r0 = r8
            me.oriient.internal.infra.utils.core.Outcome$Failure r0 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r0
            java.lang.Exception r0 = r0.getValue()
            me.oriient.internal.infra.utils.core.OriientError r0 = (me.oriient.internal.infra.utils.core.OriientError) r0
            kotlin.Lazy r6 = r6.d
            java.lang.Object r6 = r6.getD()
            me.oriient.internal.services.elog.ELog r6 = (me.oriient.internal.services.elog.ELog) r6
            me.oriient.internal.services.dataManager.building.p r2 = new me.oriient.internal.services.dataManager.building.p
            r2.<init>(r7, r0)
            java.lang.String r7 = "Failed to get all buildings"
            r6.e(r1, r7, r2)
        L98:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.building.v.searchBuildings(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
