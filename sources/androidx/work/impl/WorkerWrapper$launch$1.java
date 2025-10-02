package androidx.work.impl;

import androidx.work.Logger;
import androidx.work.impl.WorkerWrapper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class WorkerWrapper$launch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public int p;
    public final /* synthetic */ WorkerWrapper q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1(WorkerWrapper workerWrapper, Continuation continuation) {
        super(2, continuation);
        this.q = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$launch$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkerWrapper$launch$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final WorkerWrapper.Resolution failed;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        final WorkerWrapper workerWrapper = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                JobImpl jobImpl = workerWrapper.n;
                WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(workerWrapper, null);
                this.p = 1;
                obj = BuildersKt.f(jobImpl, workerWrapper$launch$1$resolution$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            failed = (WorkerWrapper.Resolution) obj;
        } catch (WorkerStoppedException e) {
            failed = new WorkerWrapper.Resolution.ResetWorkerStatus(e.d);
        } catch (CancellationException unused) {
            failed = new WorkerWrapper.Resolution.Failed();
        } catch (Throwable th) {
            Logger.e().d(WorkerWrapperKt.f3946a, "Unexpected error in WorkerWrapper", th);
            failed = new WorkerWrapper.Resolution.Failed();
        }
        Object objP = workerWrapper.i.p(new Callable() { // from class: androidx.work.impl.f
            /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 382
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.f.call():java.lang.Object");
            }
        });
        Intrinsics.g(objP, "workDatabase.runInTransa…          }\n            )");
        return objP;
    }
}
