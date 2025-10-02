package androidx.work.impl.utils;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.impl.model.WorkSpec;
import com.google.common.util.concurrent.ListenableFuture;
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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class WorkForegroundKt$workForeground$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Void>, Object> {
    public int p;
    public final /* synthetic */ ListenableWorker q;
    public final /* synthetic */ WorkSpec r;
    public final /* synthetic */ WorkForegroundUpdater s;
    public final /* synthetic */ Context t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkForegroundKt$workForeground$2(ListenableWorker listenableWorker, WorkSpec workSpec, WorkForegroundUpdater workForegroundUpdater, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = listenableWorker;
        this.r = workSpec;
        this.s = workForegroundUpdater;
        this.t = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkForegroundKt$workForeground$2(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkForegroundKt$workForeground$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.r.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ListenableWorker listenableWorker = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ListenableFuture foregroundInfoAsync = listenableWorker.getForegroundInfoAsync();
            Intrinsics.g(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
            this.p = 1;
            obj = WorkerWrapperKt.a(foregroundInfoAsync, listenableWorker, this);
            if (obj != coroutineSingletons) {
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
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (foregroundInfo == null) {
            throw new IllegalStateException(YU.a.h("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
        }
        String str2 = WorkForegroundKt.f4005a;
        Logger.e().a(str2, "Updating notification for " + str);
        ListenableFuture listenableFutureA = this.s.a(this.t, listenableWorker.getId(), foregroundInfo);
        this.p = 2;
        Object objA = ListenableFutureKt.a(listenableFutureA, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
