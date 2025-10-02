package me.oriient.internal.services.auth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.retryOperation.RetryOperation;

/* loaded from: classes7.dex */
public final class A extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25011a;
    public /* synthetic */ Object b;
    public final /* synthetic */ D c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d, Continuation continuation) {
        super(2, continuation);
        this.c = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        A a2 = new A(this.c, continuation);
        a2.b = obj;
        return a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        A a2 = new A(this.c, (Continuation) obj2);
        a2.b = (RetryOperation) obj;
        return a2.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
    
        if (r1.operationFailed(r10) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0128, code lost:
    
        if (r1.operationFailed(r10) == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
