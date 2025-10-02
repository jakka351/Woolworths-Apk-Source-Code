package me.oriient.internal.services.auth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: me.oriient.internal.services.auth.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1218j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25031a;
    public /* synthetic */ Object b;
    public final /* synthetic */ D c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218j(D d, Continuation continuation) {
        super(2, continuation);
        this.c = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1218j c1218j = new C1218j(this.c, continuation);
        c1218j.b = obj;
        return c1218j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1218j c1218j = new C1218j(this.c, (Continuation) obj2);
        c1218j.b = (CoroutineScope) obj;
        return c1218j.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r8 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r8 == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.C1218j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
