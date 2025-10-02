package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u001eB;\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006\u001f"}, d2 = {"Lme/oriient/internal/infra/utils/core/SingleInstanceExecutor;", "Params", "Result", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "toExecute", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "<set-?>", "currentParams", "getCurrentParams", "()Ljava/lang/Object;", "Ljava/lang/Object;", "isRunning", "", "()Z", "getName", "()Ljava/lang/String;", "pendingRun", "Lkotlinx/coroutines/Deferred;", "Lkotlin/jvm/functions/Function2;", "cancel", "", "run", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleInstanceExecutor<Params, Result> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CoroutineContext coroutineContext;

    @Nullable
    private Params currentParams;

    @NotNull
    private final String name;

    @Nullable
    private Deferred<? extends Result> pendingRun;

    @NotNull
    private final Function2<Params, Continuation<? super Result>, Object> toExecute;

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JW\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/infra/utils/core/SingleInstanceExecutor$Companion;", "", "()V", "newExecutor", "Lme/oriient/internal/infra/utils/core/SingleInstanceExecutor;", "Params", "Result", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "toExecute", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lme/oriient/internal/infra/utils/core/SingleInstanceExecutor;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <Params, Result> SingleInstanceExecutor<Params, Result> newExecutor(@NotNull CoroutineContext coroutineContext, @NotNull String name, @NotNull Function2<? super Params, ? super Continuation<? super Result>, ? extends Object> toExecute) {
            Intrinsics.h(coroutineContext, "coroutineContext");
            Intrinsics.h(name, "name");
            Intrinsics.h(toExecute, "toExecute");
            return new SingleInstanceExecutor<>(coroutineContext, name, toExecute, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SingleInstanceExecutor(CoroutineContext coroutineContext, String str, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContext, str, function2);
    }

    public final void cancel() {
        Deferred<? extends Result> deferred = this.pendingRun;
        if (deferred != null) {
            deferred.cancel((CancellationException) null);
        }
        this.pendingRun = null;
        this.currentParams = null;
    }

    @Nullable
    public final Params getCurrentParams() {
        return this.currentParams;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean isRunning() {
        return this.pendingRun != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object run(Params r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super Result> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.infra.utils.core.h
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.infra.utils.core.h r0 = (me.oriient.internal.infra.utils.core.h) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.infra.utils.core.h r0 = new me.oriient.internal.infra.utils.core.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            me.oriient.internal.infra.utils.core.SingleInstanceExecutor r7 = r0.f25007a
            kotlin.ResultKt.b(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.Deferred<? extends Result> r8 = r6.pendingRun
            if (r8 != 0) goto L4d
            kotlin.coroutines.CoroutineContext r8 = r6.coroutineContext
            kotlinx.coroutines.internal.ContextScope r8 = kotlinx.coroutines.CoroutineScopeKt.a(r8)
            me.oriient.internal.infra.utils.core.i r2 = new me.oriient.internal.infra.utils.core.i
            r2.<init>(r6, r7, r4)
            r5 = 3
            kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.a(r8, r4, r2, r5)
            r6.pendingRun = r8
            r6.currentParams = r7
        L4d:
            r0.f25007a = r6
            r0.d = r3
            java.lang.Object r8 = r8.await(r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r7 = r6
        L59:
            r7.pendingRun = r4
            r7.currentParams = r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.infra.utils.core.SingleInstanceExecutor.run(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SingleInstanceExecutor(CoroutineContext coroutineContext, String str, Function2<? super Params, ? super Continuation<? super Result>, ? extends Object> function2) {
        this.coroutineContext = coroutineContext;
        this.name = str;
        this.toExecute = function2;
    }
}
