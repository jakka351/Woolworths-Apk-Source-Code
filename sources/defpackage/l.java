package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes4.dex */
public final class l extends SuspendLambda implements Function2 {
    public Mutex p;
    public RemoteLogImpl q;
    public int r;
    public final /* synthetic */ RemoteLogImpl s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(RemoteLogImpl remoteLogImpl, Continuation continuation) {
        super(2, continuation);
        this.s = remoteLogImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.s, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:15:0x002a, B:28:0x0068, B:30:0x006e, B:43:0x00b6, B:45:0x00ba, B:47:0x00c0, B:52:0x00d3, B:53:0x00d8), top: B:62:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:8:0x0016, B:34:0x0089, B:35:0x008f, B:37:0x0095, B:39:0x00ae), top: B:60:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #2 {all -> 0x002e, blocks: (B:15:0x002a, B:28:0x0068, B:30:0x006e, B:43:0x00b6, B:45:0x00ba, B:47:0x00c0, B:52:0x00d3, B:53:0x00d8), top: B:62:0x002a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
