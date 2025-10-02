package me.oriient.internal.services.uploadingManager;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;

/* renamed from: me.oriient.internal.services.uploadingManager.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1531i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1536n f25636a;
    public final /* synthetic */ DataUploaderSession b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531i(C1536n c1536n, DataUploaderSession dataUploaderSession, Continuation continuation) {
        super(2, continuation);
        this.f25636a = c1536n;
        this.b = dataUploaderSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1531i(this.f25636a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1531i(this.f25636a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        C1536n.a(this.f25636a).d("DataUploadManager", "start() called with: session = " + this.b);
        C1536n c1536n = this.f25636a;
        c1536n.b.printStatus(c1536n.e);
        C1536n c1536n2 = this.f25636a;
        c1536n2.f25642a.printStatus(c1536n2.e);
        boolean zCompareAndSet = this.f25636a.o.compareAndSet(false, true);
        Unit unit = Unit.f24250a;
        if (!zCompareAndSet) {
            ((ELog) this.f25636a.k.getD()).e("DataUploadManager", "Already have an active tracking session");
            me.oriient.internal.services.uploadingManager.temp.a.a("Trying to start an upload session before stopping the previous one");
            return unit;
        }
        C1536n c1536n3 = this.f25636a;
        DataUploaderSession dataUploaderSession = this.b;
        C1536n.a(c1536n3, "start", dataUploaderSession, dataUploaderSession.getClientMetadata());
        C1536n c1536n4 = this.f25636a;
        DataUploaderSession dataUploaderSession2 = this.b;
        c1536n4.p = dataUploaderSession2;
        if (dataUploaderSession2 == null) {
            c1536n4.s = 0;
            c1536n4.r = null;
        }
        c1536n4.c.setCurrentSessionId(dataUploaderSession2.getId());
        ((ELog) this.f25636a.k.getD()).d("DataUploadManager", "UploadSession started", MapsKt.j(new Pair("sessionId", this.b.getId()), new Pair("dataType", this.f25636a.e.name()), new Pair("sessionType", this.b.getSessionType().getValue())));
        return unit;
    }
}
