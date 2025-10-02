package me.oriient.internal.infra.observable;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.UtilsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0011H\u0096@¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/infra/observable/FlowObservableEvent;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/observable/ObservableEvent;", "()V", "flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "observersCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "getObserversCount", "()Lkotlinx/coroutines/flow/StateFlow;", "emit", "", "value", "(Ljava/lang/Object;)V", "observe", "observer", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlowObservableEvent<T> implements ObservableEvent<T> {

    @NotNull
    private MutableSharedFlow<T> flow = UtilsKt.MutableSharedFlowConfigured();

    public final void emit(T value) {
        this.flow.f(value);
    }

    @NotNull
    public final StateFlow<Integer> getObserversCount() {
        return this.flow.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.infra.observable.ObservableEvent, me.oriient.internal.infra.observable.ObservableProperty
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object observe(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.internal.infra.observable.a
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.infra.observable.a r0 = (me.oriient.internal.infra.observable.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.infra.observable.a r0 = new me.oriient.internal.infra.observable.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f24967a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.ResultKt.b(r6)
            goto L42
        L2f:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.MutableSharedFlow<T> r6 = r4.flow
            me.oriient.internal.infra.observable.b r2 = new me.oriient.internal.infra.observable.b
            r2.<init>(r5)
            r0.c = r3
            java.lang.Object r5 = r6.collect(r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.infra.observable.FlowObservableEvent.observe(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
