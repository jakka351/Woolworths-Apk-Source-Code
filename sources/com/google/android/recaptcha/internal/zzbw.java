package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;

/* loaded from: classes6.dex */
public final class zzbw implements Deferred {
    private final /* synthetic */ CompletableDeferred zza;

    public zzbw(CompletableDeferred completableDeferred) {
        this.zza = completableDeferred;
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    public final ChildHandle attachChild(ChildJob childJob) {
        return this.zza.attachChild(childJob);
    }

    @Override // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation) {
        return this.zza.await(continuation);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.zza.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.zza.get(key);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // kotlinx.coroutines.Deferred
    @ExperimentalCoroutinesApi
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // kotlinx.coroutines.Deferred
    @ExperimentalCoroutinesApi
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* renamed from: getKey */
    public final CoroutineContext.Key getD() {
        return this.zza.getD();
    }

    @Override // kotlinx.coroutines.Deferred
    public final SelectClause1 getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // kotlinx.coroutines.Job
    public final Job getParent() {
        return this.zza.getParent();
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation continuation) {
        return this.zza.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.zza.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return this.zza.start();
    }

    @Override // kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return this.zza.invokeOnCompletion(z, z2, function1);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    public final Job plus(Job job) {
        return this.zza.plus(job);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
