package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class U0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public PositioningEngine f26014a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ IPSCompletionListener d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(IPSCompletionListener iPSCompletionListener, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.d = iPSCompletionListener;
        this.e = str;
        this.f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        U0 u0 = new U0(this.d, this.e, this.f, continuation);
        u0.c = obj;
        return u0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        if (r13 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.U0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
