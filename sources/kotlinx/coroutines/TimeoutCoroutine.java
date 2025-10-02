package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/TimeoutCoroutine;", "U", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimeoutCoroutine<U, T extends U> extends ScopeCoroutine<T> implements Runnable {
    public final long h;

    public TimeoutCoroutine(long j, Continuation continuation) {
        super(continuation, continuation.getE());
        this.h = j;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String b0() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.b0());
        sb.append("(timeMillis=");
        return androidx.camera.core.impl.b.q(sb, this.h, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.f
            kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DelayKt.c(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.DelayWithTimeoutDiagnostics
            if (r1 == 0) goto Ld
            kotlinx.coroutines.DelayWithTimeoutDiagnostics r0 = (kotlinx.coroutines.DelayWithTimeoutDiagnostics) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r4.h
            if (r0 == 0) goto L1f
            int r3 = kotlin.time.Duration.g
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.g
            kotlin.time.DurationKt.h(r1, r3)
            java.lang.String r0 = r0.b()
            if (r0 != 0) goto L27
        L1f:
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r3 = " ms"
            java.lang.String r0 = androidx.camera.core.impl.b.l(r1, r0, r3)
        L27:
            kotlinx.coroutines.TimeoutCancellationException r1 = new kotlinx.coroutines.TimeoutCancellationException
            r1.<init>(r0, r4)
            r4.D(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutCoroutine.run():void");
    }
}
