package me.oriient.internal.services.elog;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.remoteLog.RemoteLog;

/* loaded from: classes7.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Map f25440a;
    public ELogImpl b;
    public RemoteLog c;
    public Iterator d;
    public int e;
    public final /* synthetic */ ELogImpl f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Map i;
    public final /* synthetic */ RemoteLog j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ELogImpl eLogImpl, String str, String str2, Map map, RemoteLog remoteLog, Continuation continuation) {
        super(2, continuation);
        this.f = eLogImpl;
        this.g = str;
        this.h = str2;
        this.i = map;
        this.j = remoteLog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.e
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 2
            r4 = 1
            java.lang.String r5 = "ELog"
            r6 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.util.Map r0 = r12.f25440a
            kotlin.ResultKt.b(r13)
            goto Lc0
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.util.Iterator r1 = r12.d
            me.oriient.internal.services.remoteLog.RemoteLog r7 = r12.c
            me.oriient.internal.services.elog.ELogImpl r8 = r12.b
            java.util.Map r9 = r12.f25440a
            kotlin.ResultKt.b(r13)
            goto L75
        L2c:
            kotlin.ResultKt.b(r13)
            me.oriient.internal.services.elog.ELogImpl r13 = r12.f
            java.lang.String r1 = r12.g
            java.lang.String r7 = r12.h
            java.util.Map r8 = r12.i
            java.util.Map r9 = me.oriient.internal.services.elog.ELogImpl.access$buildLogMessage(r13, r1, r7, r8)
            me.oriient.internal.services.remoteLog.RemoteLog r7 = r12.j
            if (r7 == 0) goto Lc2
            me.oriient.internal.services.elog.ELogImpl r8 = r12.f
            java.util.Queue r13 = me.oriient.internal.services.elog.ELogImpl.access$getPendingMessages$p(r8)
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto La5
            me.oriient.internal.infra.utils.core.Logger r13 = me.oriient.internal.services.elog.ELogImpl.access$getLogger(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r10 = "Sending "
            r1.<init>(r10)
            java.util.Queue r10 = me.oriient.internal.services.elog.ELogImpl.access$getPendingMessages$p(r8)
            int r10 = r10.size()
            r1.append(r10)
            java.lang.String r10 = " pending messages"
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r13.d(r5, r1)
            java.util.Queue r13 = me.oriient.internal.services.elog.ELogImpl.access$getPendingMessages$p(r8)
            java.util.Iterator r1 = r13.iterator()
        L75:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L9e
            java.lang.Object r13 = r1.next()
            java.util.Map r13 = (java.util.Map) r13
            me.oriient.internal.infra.utils.core.Logger r10 = me.oriient.internal.services.elog.ELogImpl.access$getLogger(r8)
            java.lang.String r11 = "sendMessage() called (pending)"
            r10.d(r5, r11)
            kotlin.jvm.internal.Intrinsics.e(r13)
            r12.f25440a = r9
            r12.b = r8
            r12.c = r7
            r12.d = r1
            r12.e = r4
            java.lang.Object r13 = r7.sendMessage(r13, r12)
            if (r13 != r0) goto L75
            goto Lbe
        L9e:
            java.util.Queue r13 = me.oriient.internal.services.elog.ELogImpl.access$getPendingMessages$p(r8)
            r13.clear()
        La5:
            me.oriient.internal.infra.utils.core.Logger r13 = me.oriient.internal.services.elog.ELogImpl.access$getLogger(r8)
            java.lang.String r1 = "sendMessage() called"
            r13.d(r5, r1)
            r12.f25440a = r9
            r12.b = r6
            r12.c = r6
            r12.d = r6
            r12.e = r3
            java.lang.Object r13 = r7.sendMessage(r9, r12)
            if (r13 != r0) goto Lbf
        Lbe:
            return r0
        Lbf:
            r0 = r9
        Lc0:
            r9 = r0
            r6 = r2
        Lc2:
            if (r6 != 0) goto Lc9
            me.oriient.internal.services.elog.ELogImpl r13 = r12.f
            me.oriient.internal.services.elog.ELogImpl.access$savePendingMessage(r13, r9)
        Lc9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.elog.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
