package androidx.work.impl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkForegroundKt;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {nlnlnnn.xxx00780078x0078, 311}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class WorkerWrapper$runWorker$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    public int p;
    public final /* synthetic */ WorkerWrapper q;
    public final /* synthetic */ ListenableWorker r;
    public final /* synthetic */ WorkForegroundUpdater s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$result$1(WorkerWrapper workerWrapper, ListenableWorker listenableWorker, WorkForegroundUpdater workForegroundUpdater, Continuation continuation) {
        super(2, continuation);
        this.q = workerWrapper;
        this.r = listenableWorker;
        this.s = workForegroundUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$runWorker$result$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkerWrapper$runWorker$result$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1;
        WorkerWrapper workerWrapper = this.q;
        WorkSpec workSpec = workerWrapper.f3941a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ListenableWorker listenableWorker = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            Context context = workerWrapper.b;
            WorkManagerTaskExecutor workManagerTaskExecutor = workerWrapper.e;
            this.p = 1;
            workerWrapper$runWorker$result$1 = this;
            if (WorkForegroundKt.a(context, workSpec, listenableWorker, this.s, workManagerTaskExecutor, workerWrapper$runWorker$result$1) != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        workerWrapper$runWorker$result$1 = this;
        String str = WorkerWrapperKt.f3946a;
        Logger.e().a(str, "Starting work for " + workSpec.c);
        ListenableFuture listenableFutureStartWork = listenableWorker.startWork();
        Intrinsics.g(listenableFutureStartWork, "worker.startWork()");
        workerWrapper$runWorker$result$1.p = 2;
        Object objA = WorkerWrapperKt.a(listenableFutureStartWork, listenableWorker, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
