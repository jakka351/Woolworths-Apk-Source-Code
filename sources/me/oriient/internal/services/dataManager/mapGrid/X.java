package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class X extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25207a;
    public /* synthetic */ Object b;

    public X(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        X x = new X(continuation);
        x.b = obj;
        return x;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        X x = new X((Continuation) obj2);
        x.b = (V) obj;
        return x.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.f25207a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.b(r15)
            return r15
        Ld:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L15:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.b
            me.oriient.internal.services.dataManager.mapGrid.V r15 = (me.oriient.internal.services.dataManager.mapGrid.V) r15
            me.oriient.internal.infra.di.DependencyInjection r1 = me.oriient.internal.di.InternalDiKt.getDi()
            java.lang.Class<me.oriient.internal.services.dataManager.mapGrid.H> r3 = me.oriient.internal.services.dataManager.mapGrid.H.class
            kotlin.jvm.internal.ReflectionFactory r4 = kotlin.jvm.internal.Reflection.f24268a
            kotlin.reflect.KClass r3 = r4.b(r3)
            me.oriient.internal.infra.utils.core.DiProvidable r1 = r1.get(r3)
            me.oriient.internal.services.dataManager.mapGrid.H r1 = (me.oriient.internal.services.dataManager.mapGrid.H) r1
            java.lang.String r3 = r15.f25206a
            java.lang.String r4 = r15.b
            java.lang.Integer r5 = r15.c
            me.oriient.internal.services.dataModel.engine.MapGridType r15 = r15.d
            r14.f25207a = r2
            me.oriient.internal.services.dataManager.mapGrid.L r1 = (me.oriient.internal.services.dataManager.mapGrid.L) r1
            if (r5 == 0) goto L4f
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "&mapGridVersion="
            r2.<init>(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L51
        L4f:
            java.lang.String r2 = ""
        L51:
            kotlin.Lazy r5 = r1.b
            java.lang.Object r5 = r5.getD()
            r6 = r5
            me.oriient.internal.services.dataManager.rest.RestHelper r6 = (me.oriient.internal.services.dataManager.rest.RestHelper) r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            kotlin.Lazy r1 = r1.f25199a
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.infra.rest.OriientApiProvider r1 = (me.oriient.internal.infra.rest.OriientApiProvider) r1
            me.oriient.internal.infra.rest.OriientApi r1 = r1.getOriientApi()
            java.lang.String r1 = r1.getEngineUrl()
            r5.append(r1)
            java.lang.String r1 = "/api/v2/maps/"
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = "/map-grid?osType=android&sdkVersion="
            r5.append(r1)
            r5.append(r4)
            r5.append(r2)
            java.lang.String r1 = "&useHeaders=false&gridType="
            r5.append(r1)
            java.lang.String r15 = r15.getRawValue()
            r5.append(r15)
            java.lang.String r8 = r5.toString()
            me.oriient.internal.services.dataManager.mapGrid.K r10 = me.oriient.internal.services.dataManager.mapGrid.K.f25198a
            r12 = 4
            r13 = 0
            java.lang.String r7 = "MapGridRest"
            r9 = 0
            r11 = r14
            java.lang.Object r15 = me.oriient.internal.services.dataManager.rest.RestHelper.DefaultImpls.getStringData$default(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto La4
            return r0
        La4:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.mapGrid.X.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
