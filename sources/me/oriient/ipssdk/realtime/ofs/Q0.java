package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class Q0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f25993a;
    public int b;

    public Q0(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Q0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Q0((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0189, code lost:
    
        if (r4.onNewConfig(r9, r8) == r0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2 A[PHI: r1
  0x00b2: PHI (r1v8 me.oriient.ipssdk.base.auth.User) = (r1v5 me.oriient.ipssdk.base.auth.User), (r1v10 me.oriient.ipssdk.base.auth.User) binds: [B:26:0x00ae, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[PHI: r1
  0x00c5: PHI (r1v11 me.oriient.ipssdk.base.auth.User) = (r1v8 me.oriient.ipssdk.base.auth.User), (r1v13 me.oriient.ipssdk.base.auth.User) binds: [B:29:0x00c1, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[PHI: r1
  0x00d8: PHI (r1v14 me.oriient.ipssdk.base.auth.User) = (r1v11 me.oriient.ipssdk.base.auth.User), (r1v16 me.oriient.ipssdk.base.auth.User) binds: [B:32:0x00d4, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[PHI: r1
  0x00f2: PHI (r1v17 me.oriient.ipssdk.base.auth.User) = (r1v14 me.oriient.ipssdk.base.auth.User), (r1v19 me.oriient.ipssdk.base.auth.User) binds: [B:35:0x00ee, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105 A[PHI: r1
  0x0105: PHI (r1v20 me.oriient.ipssdk.base.auth.User) = (r1v17 me.oriient.ipssdk.base.auth.User), (r1v22 me.oriient.ipssdk.base.auth.User) binds: [B:38:0x0101, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[PHI: r1
  0x0118: PHI (r1v23 me.oriient.ipssdk.base.auth.User) = (r1v20 me.oriient.ipssdk.base.auth.User), (r1v25 me.oriient.ipssdk.base.auth.User) binds: [B:41:0x0114, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c A[PHI: r1
  0x012c: PHI (r1v26 me.oriient.ipssdk.base.auth.User) = (r1v23 me.oriient.ipssdk.base.auth.User), (r1v28 me.oriient.ipssdk.base.auth.User) binds: [B:44:0x0128, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145 A[PHI: r9
  0x0145: PHI (r9v27 java.lang.Object) = (r9v26 java.lang.Object), (r9v0 java.lang.Object) binds: [B:47:0x0141, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0226 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.Q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
