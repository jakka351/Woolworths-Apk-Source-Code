package me.oriient.internal.services.retryOperation;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.networkManager.NetworkManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a{\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u0011H\u0087@¢\u0006\u0002\u0010\u0012\u001ay\u0010\u0013\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u0011H\u0082@¢\u0006\u0002\u0010\u0017\u001a\u0083\u0001\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u0011H\u0087@¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"retryOperation", "", "retries", "", "initialDelayMilli", "", "baseIntervalMilli", "maxIntervalMilli", "retryStrategy", "Lme/oriient/internal/services/retryOperation/RetryStrategy;", "onMaxRetriesReached", "Lkotlin/Function0;", "userOperation", "Lkotlin/Function2;", "Lme/oriient/internal/services/retryOperation/RetryOperation;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(IJJJLme/oriient/internal/services/retryOperation/RetryStrategy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryOperationImpl", "networkManager", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "operation", "(Lme/oriient/internal/infra/networkManager/NetworkManager;IJJJLme/oriient/internal/services/retryOperation/RetryStrategy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryOperationWithNetwork", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RetryOperationKt {
    @Keep
    @Nullable
    public static final Object retryOperation(int i, long j, long j2, long j3, @NotNull RetryStrategy retryStrategy, @Nullable Function0<Unit> function0, @NotNull Function2<? super RetryOperation, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objRetryOperationImpl = retryOperationImpl(null, i, j, j2, j3, retryStrategy, function0, function2, continuation);
        return objRetryOperationImpl == CoroutineSingletons.d ? objRetryOperationImpl : Unit.f24250a;
    }

    public static /* synthetic */ Object retryOperation$default(int i, long j, long j2, long j3, RetryStrategy retryStrategy, Function0 function0, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            j2 = 1000;
        }
        if ((i2 & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        if ((i2 & 16) != 0) {
            retryStrategy = RetryStrategy.LINEAR;
        }
        if ((i2 & 32) != 0) {
            function0 = null;
        }
        long j4 = j;
        return retryOperation(i, j4, j2, j3, retryStrategy, function0, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object retryOperationImpl(NetworkManager networkManager, int i, long j, long j2, long j3, RetryStrategy retryStrategy, Function0<Unit> function0, Function2<? super RetryOperation, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objStartImpl$internal_publishRelease = new RetryOperation(networkManager, i, j2, j3, retryStrategy, function0, function2).startImpl$internal_publishRelease(j, continuation);
        return objStartImpl$internal_publishRelease == CoroutineSingletons.d ? objStartImpl$internal_publishRelease : Unit.f24250a;
    }

    @Keep
    @Nullable
    public static final Object retryOperationWithNetwork(@NotNull NetworkManager networkManager, int i, long j, long j2, long j3, @NotNull RetryStrategy retryStrategy, @Nullable Function0<Unit> function0, @NotNull Function2<? super RetryOperation, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objRetryOperationImpl = retryOperationImpl(networkManager, i, j, j2, j3, retryStrategy, function0, function2, continuation);
        return objRetryOperationImpl == CoroutineSingletons.d ? objRetryOperationImpl : Unit.f24250a;
    }

    public static /* synthetic */ Object retryOperationWithNetwork$default(NetworkManager networkManager, int i, long j, long j2, long j3, RetryStrategy retryStrategy, Function0 function0, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        if ((i2 & 8) != 0) {
            j2 = 1000;
        }
        if ((i2 & 16) != 0) {
            j3 = Long.MAX_VALUE;
        }
        if ((i2 & 32) != 0) {
            retryStrategy = RetryStrategy.LINEAR;
        }
        if ((i2 & 64) != 0) {
            function0 = null;
        }
        long j4 = j3;
        long j5 = j2;
        return retryOperationWithNetwork(networkManager, i, j, j5, j4, retryStrategy, function0, function2, continuation);
    }
}
