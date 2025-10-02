package me.oriient.internal.services.retryOperation;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001+Bn\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR5\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0002\b\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR$\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lme/oriient/internal/services/retryOperation/RetryOperation;", "", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "networkManager", "", "retries", "", "baseIntervalMilli", "maxIntervalMilli", "Lme/oriient/internal/services/retryOperation/RetryStrategy;", "retryStrategy", "Lkotlin/Function0;", "", "onMaxRetriesReached", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "operation", "<init>", "(Lme/oriient/internal/infra/networkManager/NetworkManager;IJJLme/oriient/internal/services/retryOperation/RetryStrategy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "operationFailed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delayMillis", "startImpl$internal_publishRelease", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startImpl", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "I", "J", "Lme/oriient/internal/services/retryOperation/RetryStrategy;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function2;", "<set-?>", "tryNumber", "getTryNumber", "()I", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Companion", "me/oriient/internal/services/retryOperation/b", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RetryOperation {

    @NotNull
    private static final b Companion = new b();

    @NotNull
    private static final String TAG = "RetryOperation";
    private final long baseIntervalMilli;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;
    private final long maxIntervalMilli;

    @Nullable
    private final NetworkManager networkManager;

    @Nullable
    private final Function0<Unit> onMaxRetriesReached;

    @NotNull
    private final Function2<RetryOperation, Continuation<? super Unit>, Object> operation;
    private final int retries;

    @NotNull
    private final RetryStrategy retryStrategy;
    private int tryNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public RetryOperation(@Nullable NetworkManager networkManager, int i, long j, long j2, @NotNull RetryStrategy retryStrategy, @Nullable Function0<Unit> function0, @NotNull Function2<? super RetryOperation, ? super Continuation<? super Unit>, ? extends Object> operation) {
        Intrinsics.h(retryStrategy, "retryStrategy");
        Intrinsics.h(operation, "operation");
        this.networkManager = networkManager;
        this.retries = i;
        this.baseIntervalMilli = j;
        this.maxIntervalMilli = j2;
        this.retryStrategy = retryStrategy;
        this.onMaxRetriesReached = function0;
        this.operation = operation;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    public final int getTryNumber() {
        return this.tryNumber;
    }

    @Nullable
    public final Object operationFailed(@NotNull Continuation<? super Unit> continuation) {
        int i = this.tryNumber + 1;
        this.tryNumber = i;
        int i2 = this.retries;
        Unit unit = Unit.f24250a;
        if (i >= i2) {
            getLogger().d(TAG, "max retries reached!");
            Function0<Unit> function0 = this.onMaxRetriesReached;
            if (function0 != null) {
                function0.invoke();
            }
            return unit;
        }
        long jCalculateDelay$internal_publishRelease = this.retryStrategy.calculateDelay$internal_publishRelease(i, this.baseIntervalMilli, this.maxIntervalMilli);
        Logger logger = getLogger();
        StringBuilder sb = new StringBuilder("retryOperation: try ");
        sb.append(this.tryNumber + 1);
        sb.append(", delay ");
        logger.d(TAG, android.support.v4.media.session.a.l(jCalculateDelay$internal_publishRelease, " milli", sb));
        Object objStartImpl$internal_publishRelease = startImpl$internal_publishRelease(jCalculateDelay$internal_publishRelease, continuation);
        return objStartImpl$internal_publishRelease == CoroutineSingletons.d ? objStartImpl$internal_publishRelease : unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r8.collect(r3, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r8.invoke(r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startImpl$internal_publishRelease(long r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof me.oriient.internal.services.retryOperation.c
            if (r0 == 0) goto L13
            r0 = r10
            me.oriient.internal.services.retryOperation.c r0 = (me.oriient.internal.services.retryOperation.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.retryOperation.c r0 = new me.oriient.internal.services.retryOperation.c
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r10)
            goto Lbe
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.ResultKt.b(r10)
            goto La2
        L3a:
            long r8 = r0.b
            me.oriient.internal.services.retryOperation.RetryOperation r2 = r0.f25545a
            kotlin.ResultKt.b(r10)
            goto L53
        L42:
            kotlin.ResultKt.b(r10)
            r0.f25545a = r7
            r0.b = r8
            r0.e = r5
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.b(r8, r0)
            if (r10 != r1) goto L52
            goto Lbd
        L52:
            r2 = r7
        L53:
            me.oriient.internal.infra.utils.core.Logger r10 = r2.getLogger()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "startImpl: try "
            r5.<init>(r6)
            int r6 = r2.tryNumber
            r5.append(r6)
            java.lang.String r6 = ", waited "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r8 = " milli"
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            java.lang.String r9 = "RetryOperation"
            r10.d(r9, r8)
            me.oriient.internal.infra.networkManager.NetworkManager r8 = r2.networkManager
            r10 = 0
            if (r8 == 0) goto La8
            kotlinx.coroutines.flow.StateFlow r8 = r8.isConnected()
            if (r8 == 0) goto La8
            me.oriient.internal.infra.utils.core.Logger r3 = r2.getLogger()
            java.lang.String r5 = "startImpl: connection required, registering network observer"
            r3.d(r9, r5)
            kotlin.jvm.internal.Ref$BooleanRef r9 = new kotlin.jvm.internal.Ref$BooleanRef
            r9.<init>()
            me.oriient.internal.services.retryOperation.d r3 = new me.oriient.internal.services.retryOperation.d
            r3.<init>(r9, r2)
            r0.f25545a = r10
            r0.e = r4
            java.lang.Object r8 = r8.collect(r3, r0)
            if (r8 != r1) goto La2
            goto Lbd
        La2:
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        La8:
            me.oriient.internal.infra.utils.core.Logger r8 = r2.getLogger()
            java.lang.String r4 = "startImpl: Can run. trying..."
            r8.d(r9, r4)
            kotlin.jvm.functions.Function2<me.oriient.internal.services.retryOperation.RetryOperation, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r8 = r2.operation
            r0.f25545a = r10
            r0.e = r3
            java.lang.Object r8 = r8.invoke(r2, r0)
            if (r8 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.retryOperation.RetryOperation.startImpl$internal_publishRelease(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ RetryOperation(NetworkManager networkManager, int i, long j, long j2, RetryStrategy retryStrategy, Function0 function0, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : networkManager, i, j, j2, retryStrategy, function0, function2);
    }
}
