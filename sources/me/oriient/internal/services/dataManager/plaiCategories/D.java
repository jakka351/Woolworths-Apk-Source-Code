package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.dataManager.CachedDataStatus;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataManager.DataSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class D implements DataSource, DiProvidable {

    @NotNull
    private static final C1398x Companion = new C1398x();

    /* renamed from: a, reason: collision with root package name */
    public final DataRepositoryImpl f25321a;
    public final Lazy b;
    public final Lazy c;

    public D(DataRepositoryImpl plaiUrlsRepository) {
        Intrinsics.h(plaiUrlsRepository, "plaiUrlsRepository");
        this.f25321a = plaiUrlsRepository;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(T.class));
    }

    @Override // me.oriient.internal.services.dataManager.DataSource
    public final Object getCacheStatus(Object obj, Continuation continuation) {
        return OutcomeKt.toOutcomeSuccess(CachedDataStatus.VALID);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchData(me.oriient.internal.services.dataManager.building.BuildingId r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.plaiCategories.C1399y
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.plaiCategories.y r0 = (me.oriient.internal.services.dataManager.plaiCategories.C1399y) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.plaiCategories.y r0 = new me.oriient.internal.services.dataManager.plaiCategories.y
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
            goto L63
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            me.oriient.internal.services.dataManager.building.BuildingId r7 = r0.b
            me.oriient.internal.services.dataManager.plaiCategories.D r2 = r0.f25360a
            kotlin.ResultKt.b(r8)
            goto L4e
        L3a:
            kotlin.ResultKt.b(r8)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r8 = r6.f25321a
            r0.f25360a = r6
            r0.b = r7
            r0.e = r4
            r2 = 0
            java.lang.Object r8 = r8.getData(r7, r2, r0)
            if (r8 != r1) goto L4d
            goto L62
        L4d:
            r2 = r6
        L4e:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.dataManager.plaiCategories.B r4 = new me.oriient.internal.services.dataManager.plaiCategories.B
            r5 = 0
            r4.<init>(r2, r7, r5)
            r0.f25360a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r8 = r8.then(r4, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.dataManager.plaiCategories.C r7 = me.oriient.internal.services.dataManager.plaiCategories.C.f25320a
            me.oriient.internal.infra.utils.core.Outcome r7 = r8.map(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plaiCategories.D.fetchData(me.oriient.internal.services.dataManager.building.BuildingId, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
