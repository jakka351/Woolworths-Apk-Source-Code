package me.oriient.internal.services.dataManager.mapGrid;

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
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.config.InternalConfigManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class G implements MapGridRepository {

    @NotNull
    private static final B Companion = new B();

    /* renamed from: a, reason: collision with root package name */
    public final C1323v f25196a;
    public final MapGridPriorityLoader b;
    public final InterfaceC1303a c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public G(C1323v decrpytor, MapGridPriorityLoader mapGridPriorityLoader, InterfaceC1303a mapGridCache) {
        Intrinsics.h(decrpytor, "decrpytor");
        Intrinsics.h(mapGridPriorityLoader, "mapGridPriorityLoader");
        Intrinsics.h(mapGridCache, "mapGridCache");
        this.f25196a = decrpytor;
        this.b = mapGridPriorityLoader;
        this.c = mapGridCache;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.d = di.inject(reflectionFactory.b(Logger.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
        this.f = InternalDiKt.getDi().inject(reflectionFactory.b(W.class));
    }

    @Override // me.oriient.internal.services.dataManager.mapGrid.MapGridRepository
    public final Object cleanData(String str, Continuation continuation) {
        C1321t c1321t = (C1321t) ((InterfaceC1306d) ((C1305c) this.c).b.getD());
        c1321t.getClass();
        BuildersKt.c(c1321t.f25225a, null, null, new C1316n(new C1313k(c1321t, str), c1321t, null), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.mapGrid.MapGridRepository
    public final Object cleanExpiredData(double d, Continuation continuation) {
        C1321t c1321t = (C1321t) ((InterfaceC1306d) ((C1305c) this.c).b.getD());
        c1321t.getClass();
        BuildersKt.c(c1321t.f25225a, null, null, new C1316n(new C1309g(c1321t, d), c1321t, null), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.mapGrid.MapGridRepository
    public final Object cleanInMemoryData(Continuation continuation) {
        Object objCleanCache = ((Z) ((W) this.f.getD())).f25208a.cleanCache(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Unit unit = Unit.f24250a;
        if (objCleanCache != coroutineSingletons) {
            objCleanCache = unit;
        }
        return objCleanCache == coroutineSingletons ? objCleanCache : unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // me.oriient.internal.services.dataManager.mapGrid.MapGridRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getMapGrid(java.lang.String r12, java.lang.String r13, java.lang.String r14, double r15, kotlin.coroutines.Continuation r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof me.oriient.internal.services.dataManager.mapGrid.E
            if (r1 == 0) goto L16
            r1 = r0
            me.oriient.internal.services.dataManager.mapGrid.E r1 = (me.oriient.internal.services.dataManager.mapGrid.E) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.e = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            me.oriient.internal.services.dataManager.mapGrid.E r1 = new me.oriient.internal.services.dataManager.mapGrid.E
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r7.e
            r10 = 2
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L36
            if (r2 != r10) goto L2e
            kotlin.ResultKt.b(r0)
            return r0
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            me.oriient.internal.services.dataManager.mapGrid.w r12 = r7.b
            me.oriient.internal.services.dataManager.mapGrid.G r13 = r7.f25194a
            kotlin.ResultKt.b(r0)
            goto L72
        L3e:
            kotlin.ResultKt.b(r0)
            me.oriient.internal.services.dataManager.mapGrid.w r0 = new me.oriient.internal.services.dataManager.mapGrid.w
            kotlin.Lazy r2 = r11.e
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.services.config.InternalConfigManager r2 = (me.oriient.internal.services.config.InternalConfigManager) r2
            kotlinx.coroutines.flow.StateFlow r2 = r2.getConfig()
            java.lang.Object r2 = r2.getValue()
            me.oriient.internal.services.config.InternalConfig r2 = (me.oriient.internal.services.config.InternalConfig) r2
            me.oriient.internal.services.dataModel.engine.MapGridType r2 = r2.getMapGridType()
            r0.<init>(r12, r13, r14, r2)
            me.oriient.internal.services.dataManager.mapGrid.MapGridPriorityLoader r2 = r11.b
            r7.f25194a = r11
            r7.b = r0
            r7.e = r3
            r8 = 4
            r9 = 0
            r6 = 0
            r4 = r15
            r3 = r0
            java.lang.Object r0 = me.oriient.internal.services.dataPriorityLoader.DataPriorityLoader.DefaultImpls.loadData$default(r2, r3, r4, r6, r7, r8, r9)
            if (r0 != r1) goto L70
            goto L86
        L70:
            r13 = r11
            r12 = r3
        L72:
            me.oriient.internal.infra.utils.core.Outcome r0 = (me.oriient.internal.infra.utils.core.Outcome) r0
            me.oriient.internal.services.dataManager.mapGrid.F r14 = new me.oriient.internal.services.dataManager.mapGrid.F
            r2 = 0
            r14.<init>(r13, r12, r2)
            r7.f25194a = r2
            r7.b = r2
            r7.e = r10
            java.lang.Object r12 = r0.then(r14, r7)
            if (r12 != r1) goto L87
        L86:
            return r1
        L87:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.mapGrid.G.getMapGrid(java.lang.String, java.lang.String, java.lang.String, double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.mapGrid.MapGridRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cleanData(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.mapGrid.C
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.mapGrid.C r0 = (me.oriient.internal.services.dataManager.mapGrid.C) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.mapGrid.C r0 = new me.oriient.internal.services.dataManager.mapGrid.C
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            me.oriient.internal.services.dataManager.mapGrid.G r2 = r0.f25192a
            kotlin.ResultKt.b(r7)
            goto L59
        L3a:
            kotlin.ResultKt.b(r7)
            kotlin.Lazy r7 = r6.f
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.dataManager.mapGrid.W r7 = (me.oriient.internal.services.dataManager.mapGrid.W) r7
            r0.f25192a = r6
            r0.d = r5
            me.oriient.internal.services.dataManager.mapGrid.Z r7 = (me.oriient.internal.services.dataManager.mapGrid.Z) r7
            me.oriient.internal.services.dataManager.DataRepositoryImpl r7 = r7.f25208a
            java.lang.Object r7 = r7.cleanCache(r0)
            if (r7 != r1) goto L54
            goto L55
        L54:
            r7 = r3
        L55:
            if (r7 != r1) goto L58
            goto L68
        L58:
            r2 = r6
        L59:
            me.oriient.internal.services.dataManager.mapGrid.a r7 = r2.c
            r2 = 0
            r0.f25192a = r2
            r0.d = r4
            me.oriient.internal.services.dataManager.mapGrid.c r7 = (me.oriient.internal.services.dataManager.mapGrid.C1305c) r7
            java.lang.Object r7 = r7.clean(r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.mapGrid.G.cleanData(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
