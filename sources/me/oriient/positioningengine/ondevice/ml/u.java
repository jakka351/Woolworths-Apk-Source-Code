package me.oriient.positioningengine.ondevice.ml;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u implements p {

    @NotNull
    public static final q Companion = new q();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26465a;
    public final Lazy b;
    public final Lazy c;

    public u() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26465a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DiKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
        this.c = DiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof me.oriient.positioningengine.ondevice.ml.r
            if (r0 == 0) goto L14
            r0 = r9
            me.oriient.positioningengine.ondevice.ml.r r0 = (me.oriient.positioningengine.ondevice.ml.r) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            me.oriient.positioningengine.ondevice.ml.r r0 = new me.oriient.positioningengine.ondevice.ml.r
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            me.oriient.positioningengine.ondevice.ml.u r8 = r6.f26462a
            kotlin.ResultKt.b(r9)
            goto L79
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.b(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            kotlin.Lazy r1 = r7.b
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.infra.rest.OriientApiProvider r1 = (me.oriient.internal.infra.rest.OriientApiProvider) r1
            me.oriient.internal.infra.rest.OriientApi r1 = r1.getOriientApi()
            java.lang.String r1 = r1.getEngineUrl()
            r9.append(r1)
            java.lang.String r1 = "/api/v1/model?sdkVersion="
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "&osType=android"
            r9.append(r8)
            java.lang.String r3 = r9.toString()
            kotlin.Lazy r8 = r7.c
            java.lang.Object r8 = r8.getD()
            r1 = r8
            me.oriient.internal.services.dataManager.rest.RestHelper r1 = (me.oriient.internal.services.dataManager.rest.RestHelper) r1
            me.oriient.positioningengine.ondevice.ml.s r5 = me.oriient.positioningengine.ondevice.ml.s.f26463a
            r6.f26462a = r7
            r6.d = r2
            java.lang.String r2 = "MlModelRest"
            r4 = 1
            java.lang.Object r9 = r1.getBytesData(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L78
            return r0
        L78:
            r8 = r7
        L79:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.positioningengine.ondevice.ml.t r0 = me.oriient.positioningengine.ondevice.ml.t.f26464a
            me.oriient.internal.infra.utils.core.Outcome r9 = r9.mapFailure(r0)
            boolean r0 = r9 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r0 == 0) goto L9d
            r0 = r9
            me.oriient.internal.infra.utils.core.Outcome$Failure r0 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r0
            java.lang.Exception r0 = r0.getValue()
            me.oriient.positioningengine.common.util.PositioningEngineError r0 = (me.oriient.positioningengine.common.util.PositioningEngineError) r0
            kotlin.Lazy r8 = r8.f26465a
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.infra.utils.core.Logger r8 = (me.oriient.internal.infra.utils.core.Logger) r8
            java.lang.String r0 = "MlModelRest"
            java.lang.String r1 = "Model request failed"
            r8.e(r0, r1)
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.ml.u.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
