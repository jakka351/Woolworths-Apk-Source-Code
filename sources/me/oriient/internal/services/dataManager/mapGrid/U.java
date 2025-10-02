package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.DataSource;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class U implements DataSource {

    @NotNull
    private static final M Companion = new M();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25205a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public U() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25205a = di.inject(reflectionFactory.b(EngineVersionProvider.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(W.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(H.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.f = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchData(me.oriient.internal.services.dataManager.mapGrid.C1324w r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof me.oriient.internal.services.dataManager.mapGrid.N
            if (r0 == 0) goto L13
            r0 = r11
            me.oriient.internal.services.dataManager.mapGrid.N r0 = (me.oriient.internal.services.dataManager.mapGrid.N) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.mapGrid.N r0 = new me.oriient.internal.services.dataManager.mapGrid.N
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r11)
            return r11
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            me.oriient.internal.services.dataManager.mapGrid.w r10 = r0.b
            me.oriient.internal.services.dataManager.mapGrid.U r2 = r0.f25200a
            kotlin.ResultKt.b(r11)
            goto L6e
        L3b:
            kotlin.ResultKt.b(r11)
            kotlin.Lazy r11 = r9.b
            java.lang.Object r11 = r11.getD()
            me.oriient.internal.services.dataManager.mapGrid.W r11 = (me.oriient.internal.services.dataManager.mapGrid.W) r11
            me.oriient.internal.services.dataManager.mapGrid.V r2 = new me.oriient.internal.services.dataManager.mapGrid.V
            java.lang.String r6 = r10.c
            kotlin.Lazy r7 = r9.f25205a
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.dataManager.engine.EngineVersionProvider r7 = (me.oriient.internal.services.dataManager.engine.EngineVersionProvider) r7
            java.lang.String r7 = r7.getShortVersion()
            me.oriient.internal.services.dataModel.engine.MapGridType r8 = r10.d
            r2.<init>(r6, r7, r5, r8)
            r0.f25200a = r9
            r0.b = r10
            r0.e = r4
            me.oriient.internal.services.dataManager.mapGrid.Z r11 = (me.oriient.internal.services.dataManager.mapGrid.Z) r11
            me.oriient.internal.services.dataManager.DataRepositoryImpl r11 = r11.f25208a
            r4 = 0
            java.lang.Object r11 = r11.getData(r2, r4, r0)
            if (r11 != r1) goto L6d
            goto L81
        L6d:
            r2 = r9
        L6e:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            me.oriient.internal.services.dataManager.mapGrid.P r4 = new me.oriient.internal.services.dataManager.mapGrid.P
            r4.<init>(r2, r10, r5)
            r0.f25200a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r10 = r11.then(r4, r0)
            if (r10 != r1) goto L82
        L81:
            return r1
        L82:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.mapGrid.U.fetchData(me.oriient.internal.services.dataManager.mapGrid.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCacheStatus(me.oriient.internal.services.dataManager.mapGrid.MapGridRecord r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof me.oriient.internal.services.dataManager.mapGrid.Q
            if (r0 == 0) goto L13
            r0 = r10
            me.oriient.internal.services.dataManager.mapGrid.Q r0 = (me.oriient.internal.services.dataManager.mapGrid.Q) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.mapGrid.Q r0 = new me.oriient.internal.services.dataManager.mapGrid.Q
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            me.oriient.internal.services.dataManager.mapGrid.MapGridRecord r9 = r0.b
            me.oriient.internal.services.dataManager.mapGrid.U r0 = r0.f25203a
            kotlin.ResultKt.b(r10)
            goto La6
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.ResultKt.b(r10)
            java.lang.String r10 = r9.getEngineVersion()
            kotlin.Lazy r2 = r8.f25205a
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.services.dataManager.engine.EngineVersionProvider r2 = (me.oriient.internal.services.dataManager.engine.EngineVersionProvider) r2
            java.lang.String r2 = r2.getShortVersion()
            boolean r10 = kotlin.jvm.internal.Intrinsics.c(r10, r2)
            if (r10 != 0) goto L55
            me.oriient.internal.infra.utils.core.Outcome$Success r9 = new me.oriient.internal.infra.utils.core.Outcome$Success
            me.oriient.internal.services.dataManager.CachedDataStatus r10 = me.oriient.internal.services.dataManager.CachedDataStatus.INVALID
            r9.<init>(r10)
            return r9
        L55:
            kotlin.Lazy r10 = r8.b
            java.lang.Object r10 = r10.getD()
            me.oriient.internal.services.dataManager.mapGrid.W r10 = (me.oriient.internal.services.dataManager.mapGrid.W) r10
            me.oriient.internal.services.dataManager.mapGrid.V r2 = new me.oriient.internal.services.dataManager.mapGrid.V
            java.lang.String r4 = r9.getMapId()
            java.lang.String r5 = r9.getEngineVersion()
            int r6 = r9.getMapVersion()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            me.oriient.internal.services.dataModel.engine.MapGridType r6 = r9.getType()
            r2.<init>(r4, r5, r7, r6)
            kotlin.Lazy r4 = r8.f
            java.lang.Object r4 = r4.getD()
            me.oriient.internal.services.config.InternalConfigManager r4 = (me.oriient.internal.services.config.InternalConfigManager) r4
            kotlinx.coroutines.flow.StateFlow r4 = r4.getConfig()
            java.lang.Object r4 = r4.getValue()
            me.oriient.internal.services.config.InternalConfig r4 = (me.oriient.internal.services.config.InternalConfig) r4
            me.oriient.internal.services.dataModel.engine.MapGridFetchingStrategy r4 = r4.getMapGridFetchingStrategy()
            me.oriient.internal.services.dataModel.engine.MapGridFetchingStrategy r5 = me.oriient.internal.services.dataModel.engine.MapGridFetchingStrategy.ALWAYS_ENFORCE
            if (r4 == r5) goto L93
            r4 = r3
            goto L94
        L93:
            r4 = 0
        L94:
            r0.f25203a = r8
            r0.b = r9
            r0.e = r3
            me.oriient.internal.services.dataManager.mapGrid.Z r10 = (me.oriient.internal.services.dataManager.mapGrid.Z) r10
            me.oriient.internal.services.dataManager.DataRepositoryImpl r10 = r10.f25208a
            java.lang.Object r10 = r10.getData(r2, r4, r0)
            if (r10 != r1) goto La5
            return r1
        La5:
            r0 = r8
        La6:
            me.oriient.internal.infra.utils.core.Outcome r10 = (me.oriient.internal.infra.utils.core.Outcome) r10
            me.oriient.internal.services.dataManager.mapGrid.T r1 = new me.oriient.internal.services.dataManager.mapGrid.T
            r1.<init>(r0, r9)
            me.oriient.internal.infra.utils.core.Outcome r9 = r10.map(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.mapGrid.U.getCacheStatus(me.oriient.internal.services.dataManager.mapGrid.MapGridRecord, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
