package me.oriient.internal.services.retryOperation;

import androidx.annotation.Keep;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0098\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010\u0003*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112(\u0010\u0012\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0087@¢\u0006\u0002\u0010\u0016\u001a\u0084\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010\u0003*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2(\u0010\u0012\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0087@¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"retryTo", "Lme/oriient/internal/infra/utils/core/Outcome;", "Success", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tag", "", lqlqqlq.mmm006Dm006Dm, "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "times", "", "initialDelayMillis", "", "maxDelayMillis", "factor", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/infra/utils/core/Logger;IJJDLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryToPeriodic", "intervalMillis", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/infra/utils/core/Logger;IJLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RetryExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9 A[Catch: Exception -> 0x00e3, TryCatch #2 {Exception -> 0x00e3, blocks: (B:32:0x00d4, B:35:0x00d9, B:36:0x00e2), top: B:57:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0136 -> B:18:0x0058). Please report as a decompilation issue!!! */
    @androidx.annotation.Keep
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <Success, Failure extends java.lang.Exception> java.lang.Object retryTo(@org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull me.oriient.internal.infra.utils.core.Logger r24, int r25, long r26, long r28, double r30, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<Success, Failure>>, ? extends java.lang.Object> r32, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<Success, Failure>> r33) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.retryOperation.RetryExtensionsKt.retryTo(java.lang.String, java.lang.String, me.oriient.internal.infra.utils.core.Logger, int, long, long, double, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object retryTo$default(String str, String str2, Logger logger, int i, long j, long j2, double d, Function1 function1, Continuation continuation, int i2, Object obj) {
        double d2;
        String str3;
        String str4;
        Logger logger2;
        Function1 function12;
        Continuation continuation2;
        int i3 = (i2 & 8) != 0 ? Integer.MAX_VALUE : i;
        long j3 = (i2 & 16) != 0 ? 100L : j;
        long j4 = (i2 & 32) != 0 ? 1000L : j2;
        if ((i2 & 64) != 0) {
            d2 = 2.0d;
            str4 = str2;
            logger2 = logger;
            function12 = function1;
            continuation2 = continuation;
            str3 = str;
        } else {
            d2 = d;
            str3 = str;
            str4 = str2;
            logger2 = logger;
            function12 = function1;
            continuation2 = continuation;
        }
        return retryTo(str3, str4, logger2, i3, j3, j4, d2, function12, continuation2);
    }

    @Keep
    @Nullable
    public static final <Success, Failure extends Exception> Object retryToPeriodic(@NotNull String str, @NotNull String str2, @NotNull Logger logger, int i, long j, @NotNull Function1<? super Continuation<? super Outcome<Success, Failure>>, ? extends Object> function1, @NotNull Continuation<? super Outcome<Success, Failure>> continuation) {
        return retryTo(str, str2, logger, i, j, j, 1.0d, function1, continuation);
    }

    public static /* synthetic */ Object retryToPeriodic$default(String str, String str2, Logger logger, int i, long j, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            j = 1000;
        }
        return retryToPeriodic(str, str2, logger, i3, j, function1, continuation);
    }
}
