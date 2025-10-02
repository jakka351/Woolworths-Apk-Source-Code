package me.oriient.internal.services.dataManager.floorTransitions;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataManager.building.BuildingKt;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d implements FloorTransitionsRepository {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final DataRepositoryImpl f25176a;
    public final Lazy b;

    public d(DataRepositoryImpl floorTransitionsDataRepository) {
        Intrinsics.h(floorTransitionsDataRepository, "floorTransitionsDataRepository");
        this.f25176a = floorTransitionsDataRepository;
        this.b = InternalDiKt.getDi().inject(Reflection.f24268a.b(ELog.class));
    }

    @Override // me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository
    public final Object cleanCache(Continuation continuation) {
        Object objCleanCache = this.f25176a.cleanCache(continuation);
        return objCleanCache == CoroutineSingletons.d ? objCleanCache : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository
    public final Object cleanData(String str, Continuation continuation) {
        Object objCleanData = this.f25176a.cleanData(BuildingKt.getAsBuildingId(str), continuation);
        return objCleanData == CoroutineSingletons.d ? objCleanData : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchFloorTransitions(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.floorTransitions.c
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.floorTransitions.c r0 = (me.oriient.internal.services.dataManager.floorTransitions.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorTransitions.c r0 = new me.oriient.internal.services.dataManager.floorTransitions.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.b
            me.oriient.internal.services.dataManager.floorTransitions.d r0 = r0.f25175a
            kotlin.ResultKt.b(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r7 = r5.f25176a
            me.oriient.internal.services.dataManager.building.BuildingId r2 = me.oriient.internal.services.dataManager.building.BuildingKt.getAsBuildingId(r6)
            r0.f25175a = r5
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
            java.lang.String r2 = "FloorTransitionsReposit"
            java.lang.String r3 = "buildingId"
            if (r1 == 0) goto L6a
            r1 = r7
            me.oriient.internal.infra.utils.core.Outcome$Success r1 = (me.oriient.internal.infra.utils.core.Outcome.Success) r1
            java.lang.Object r1 = r1.getValue()
            me.oriient.internal.services.dataManager.floorTransitions.FloorTransitions r1 = (me.oriient.internal.services.dataManager.floorTransitions.FloorTransitions) r1
            kotlin.Lazy r1 = r0.b
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.services.elog.ELog r1 = (me.oriient.internal.services.elog.ELog) r1
            java.lang.String r4 = "Get floor transitions by ID"
            kotlin.reflect.jvm.internal.impl.types.checker.a.q(r3, r6, r1, r2, r4)
        L6a:
            boolean r1 = r7 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r1 == 0) goto L9c
            r1 = r7
            me.oriient.internal.infra.utils.core.Outcome$Failure r1 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r1
            java.lang.Exception r1 = r1.getValue()
            me.oriient.internal.infra.utils.core.OriientError r1 = (me.oriient.internal.infra.utils.core.OriientError) r1
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.services.elog.ELog r0 = (me.oriient.internal.services.elog.ELog) r0
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r6)
            java.lang.String r6 = r1.getMessage()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r3 = "errorMessage"
            r1.<init>(r3, r6)
            kotlin.Pair[] r6 = new kotlin.Pair[]{r4, r1}
            java.util.Map r6 = kotlin.collections.MapsKt.j(r6)
            java.lang.String r1 = "Failed to get floor transitions by ID"
            r0.e(r2, r1, r6)
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorTransitions.d.fetchFloorTransitions(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
