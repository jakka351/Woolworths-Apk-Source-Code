package me.oriient.internal.services.uploadingManager;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;

/* renamed from: me.oriient.internal.services.uploadingManager.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1527e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25632a;
    public final /* synthetic */ C1536n b;
    public final /* synthetic */ DataUploaderSession c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527e(C1536n c1536n, DataUploaderSession dataUploaderSession, Continuation continuation) {
        super(2, continuation);
        this.b = c1536n;
        this.c = dataUploaderSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1527e(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1527e(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25632a;
        if (i == 0) {
            ResultKt.b(obj);
            ((ELog) this.b.k.getD()).i("DataUploadManager", "Removing session", MapsKt.j(new Pair("sessionId", this.c.getId()), new Pair("dataType", this.b.e.name()), new Pair("sessionType", this.c.getSessionType().name())));
            DataUploaderItemsStorage dataUploaderItemsStorage = this.b.b;
            String id = this.c.getId();
            DataUploaderDataType dataUploaderDataType = this.b.e;
            this.f25632a = 1;
            obj = dataUploaderItemsStorage.getAllItems(id, dataUploaderDataType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        C1536n c1536n = this.b;
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            c1536n.b.delete((DataUploaderItem) it.next());
        }
        this.b.f25642a.removeSessionData(this.c.getId(), this.b.e);
        return Unit.f24250a;
    }
}
