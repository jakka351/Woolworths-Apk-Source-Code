package me.oriient.navigation.ondevice;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f26291a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, String str, Continuation continuation) {
        super(2, continuation);
        this.d = oVar;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.d, this.e, continuation);
        lVar.c = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L35
            if (r1 == r4) goto L29
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.b(r11)
            return r11
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            java.lang.Object r1 = r10.f26291a
            me.oriient.internal.infra.utils.core.Outcome r1 = (me.oriient.internal.infra.utils.core.Outcome) r1
            java.lang.Object r3 = r10.c
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.b(r11)
            goto L95
        L29:
            java.lang.Object r1 = r10.f26291a
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
            java.lang.Object r4 = r10.c
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.b(r11)
            goto L82
        L35:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.c
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            me.oriient.navigation.ondevice.o r1 = r10.d
            kotlin.Lazy r1 = r1.f26353a
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider r1 = (me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider) r1
            kotlin.coroutines.CoroutineContext r1 = r1.getIo()
            me.oriient.navigation.ondevice.j r6 = new me.oriient.navigation.ondevice.j
            me.oriient.navigation.ondevice.o r7 = r10.d
            java.lang.String r8 = r10.e
            r6.<init>(r7, r8, r5)
            kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.a(r11, r1, r6, r3)
            me.oriient.navigation.ondevice.o r6 = r10.d
            kotlin.Lazy r6 = r6.f26353a
            java.lang.Object r6 = r6.getD()
            me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider r6 = (me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider) r6
            kotlin.coroutines.CoroutineContext r6 = r6.getIo()
            me.oriient.navigation.ondevice.k r7 = new me.oriient.navigation.ondevice.k
            me.oriient.navigation.ondevice.o r8 = r10.d
            java.lang.String r9 = r10.e
            r7.<init>(r8, r9, r5)
            kotlinx.coroutines.Deferred r6 = kotlinx.coroutines.BuildersKt.a(r11, r6, r7, r3)
            r10.c = r11
            r10.f26291a = r6
            r10.b = r4
            java.lang.Object r1 = r1.await(r10)
            if (r1 != r0) goto L7f
            goto Lb6
        L7f:
            r4 = r11
            r11 = r1
            r1 = r6
        L82:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            r10.c = r4
            r10.f26291a = r11
            r10.b = r3
            java.lang.Object r1 = r1.await(r10)
            if (r1 != r0) goto L91
            goto Lb6
        L91:
            r3 = r1
            r1 = r11
            r11 = r3
            r3 = r4
        L95:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            me.oriient.internal.infra.utils.core.Outcome r11 = me.oriient.internal.infra.utils.core.OutcomeKt.combineOutcomes(r1, r11)
            me.oriient.navigation.ondevice.d r1 = me.oriient.navigation.ondevice.C1788d.f26283a
            me.oriient.internal.infra.utils.core.Outcome r11 = r11.mapFailure(r1)
            me.oriient.navigation.ondevice.i r1 = new me.oriient.navigation.ondevice.i
            me.oriient.navigation.ondevice.o r4 = r10.d
            java.lang.String r6 = r10.e
            r1.<init>(r3, r4, r6, r5)
            r10.c = r5
            r10.f26291a = r5
            r10.b = r2
            java.lang.Object r11 = r11.then(r1, r10)
            if (r11 != r0) goto Lb7
        Lb6:
            return r0
        Lb7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
