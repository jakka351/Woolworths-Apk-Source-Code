package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.DataCache;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1384i implements DataCache, DiProvidable {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25348a;
    public final Lazy b;
    public final Lazy c;

    public C1384i() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25348a = di.inject(reflectionFactory.b(E.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.internal.services.dataManager.building.BuildingId r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.plaiCategories.C1377b
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.plaiCategories.b r0 = (me.oriient.internal.services.dataManager.plaiCategories.C1377b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.plaiCategories.b r0 = new me.oriient.internal.services.dataManager.plaiCategories.b
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
            me.oriient.internal.services.dataManager.building.BuildingId r7 = r0.b
            me.oriient.internal.services.dataManager.plaiCategories.i r2 = r0.f25341a
            kotlin.ResultKt.b(r8)
            goto L61
        L3a:
            kotlin.ResultKt.b(r8)
            kotlin.Lazy r8 = r6.f25348a
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.services.dataManager.plaiCategories.E r8 = (me.oriient.internal.services.dataManager.plaiCategories.E) r8
            java.lang.String r2 = r7.getValue()
            r0.f25341a = r6
            r0.b = r7
            r0.e = r4
            me.oriient.internal.services.dataManager.plaiCategories.S r8 = (me.oriient.internal.services.dataManager.plaiCategories.S) r8
            r8.getClass()
            me.oriient.internal.services.dataManager.plaiCategories.O r4 = new me.oriient.internal.services.dataManager.plaiCategories.O
            r4.<init>(r2)
            java.lang.Object r8 = r8.a(r4, r0)
            if (r8 != r1) goto L60
            goto L75
        L60:
            r2 = r6
        L61:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.dataManager.plaiCategories.d r4 = new me.oriient.internal.services.dataManager.plaiCategories.d
            r5 = 0
            r4.<init>(r2, r7, r5)
            r0.f25341a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r8.then(r4, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plaiCategories.C1384i.a(me.oriient.internal.services.dataManager.building.BuildingId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object clean(Continuation continuation) {
        S s = (S) ((E) this.f25348a.getD());
        s.getClass();
        BuildersKt.c(s.f25334a, null, null, new K(new I(null), s, null), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object cleanData(Object obj, Continuation continuation) {
        E e = (E) this.f25348a.getD();
        String value = ((BuildingId) obj).getValue();
        S s = (S) e;
        s.getClass();
        BuildersKt.c(s.f25334a, null, null, new K(new H(value, null), s, null), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final /* bridge */ /* synthetic */ Object getData(Object obj, boolean z, Continuation continuation) {
        return a((BuildingId) obj, continuation);
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object save(Object obj, Object obj2, Continuation continuation) {
        E e = (E) this.f25348a.getD();
        String value = ((BuildingId) obj).getValue();
        S s = (S) e;
        s.getClass();
        return s.a(new Q(value, (List) obj2, s), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getData(java.lang.String r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof me.oriient.internal.services.dataManager.plaiCategories.C1380e
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.internal.services.dataManager.plaiCategories.e r0 = (me.oriient.internal.services.dataManager.plaiCategories.C1380e) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.plaiCategories.e r0 = new me.oriient.internal.services.dataManager.plaiCategories.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
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
            java.lang.String r8 = r0.c
            java.lang.String r7 = r0.b
            me.oriient.internal.services.dataManager.plaiCategories.i r2 = r0.f25344a
            kotlin.ResultKt.b(r9)
            goto L61
        L3c:
            kotlin.ResultKt.b(r9)
            kotlin.Lazy r9 = r6.f25348a
            java.lang.Object r9 = r9.getD()
            me.oriient.internal.services.dataManager.plaiCategories.E r9 = (me.oriient.internal.services.dataManager.plaiCategories.E) r9
            r0.f25344a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r4
            me.oriient.internal.services.dataManager.plaiCategories.S r9 = (me.oriient.internal.services.dataManager.plaiCategories.S) r9
            r9.getClass()
            me.oriient.internal.services.dataManager.plaiCategories.O r2 = new me.oriient.internal.services.dataManager.plaiCategories.O
            r2.<init>(r7)
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L60
            goto L77
        L60:
            r2 = r6
        L61:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.dataManager.plaiCategories.h r4 = new me.oriient.internal.services.dataManager.plaiCategories.h
            r5 = 0
            r4.<init>(r2, r7, r8, r5)
            r0.f25344a = r5
            r0.b = r5
            r0.c = r5
            r0.f = r3
            java.lang.Object r7 = r9.then(r4, r0)
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plaiCategories.C1384i.getData(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
