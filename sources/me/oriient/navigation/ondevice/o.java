package me.oriient.navigation.ondevice;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository;
import me.oriient.internal.services.elog.ELog;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.ondevice.navgraph.NavGraphRepository;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o implements InterfaceC1785a {

    @NotNull
    private static final C1786b Companion = new C1786b();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26353a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public o() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26353a = dependencyInjectionA.inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.b = DiKt.a().inject(reflectionFactory.b(ELog.class));
        this.c = DiKt.a().inject(reflectionFactory.b(BuildingRepository.class));
        this.d = DiKt.a().inject(reflectionFactory.b(FloorTransitionsRepository.class));
        this.e = DiKt.a().inject(reflectionFactory.b(NavGraphRepository.class));
        this.f = DiKt.a().inject(reflectionFactory.b(ObstaclesRepository.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.navigation.ondevice.C1787c
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.navigation.ondevice.c r0 = (me.oriient.navigation.ondevice.C1787c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.navigation.ondevice.c r0 = new me.oriient.navigation.ondevice.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.b
            me.oriient.navigation.ondevice.o r0 = r0.f26282a
            kotlin.ResultKt.b(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            me.oriient.navigation.ondevice.l r7 = new me.oriient.navigation.ondevice.l
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.f26282a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r7 = kotlinx.coroutines.CoroutineScopeKt.c(r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            me.oriient.internal.infra.utils.core.Outcome r7 = (me.oriient.internal.infra.utils.core.Outcome) r7
            boolean r1 = r7 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            java.lang.String r2 = "NavigationDataProvider"
            if (r1 == 0) goto L6d
            r1 = r7
            me.oriient.internal.infra.utils.core.Outcome$Success r1 = (me.oriient.internal.infra.utils.core.Outcome.Success) r1
            java.lang.Object r1 = r1.getValue()
            me.oriient.navigation.ondevice.NavigationData r1 = (me.oriient.navigation.ondevice.NavigationData) r1
            kotlin.Lazy r1 = r0.b
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.services.elog.ELog r1 = (me.oriient.internal.services.elog.ELog) r1
            me.oriient.navigation.ondevice.m r3 = new me.oriient.navigation.ondevice.m
            r3.<init>(r6)
            java.lang.String r4 = "Get NavEngineBuilding"
            r1.d(r2, r4, r3)
        L6d:
            boolean r1 = r7 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r1 == 0) goto L8c
            r1 = r7
            me.oriient.internal.infra.utils.core.Outcome$Failure r1 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r1
            java.lang.Exception r1 = r1.getValue()
            me.oriient.navigation.common.util.NavigationError r1 = (me.oriient.navigation.common.util.NavigationError) r1
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.services.elog.ELog r0 = (me.oriient.internal.services.elog.ELog) r0
            me.oriient.navigation.ondevice.n r3 = new me.oriient.navigation.ondevice.n
            r3.<init>(r1, r6)
            java.lang.String r6 = "Cannot get NavEngineBuilding"
            r0.e(r2, r6, r3)
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.o.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
