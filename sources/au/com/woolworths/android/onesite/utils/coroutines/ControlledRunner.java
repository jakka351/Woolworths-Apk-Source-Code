package au.com.woolworths.android.onesite.utils.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/utils/coroutines/ControlledRunner;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ControlledRunner<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4601a = new AtomicReference(null);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$1 r0 = (au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$1 r0 = new au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.p
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            kotlin.ResultKt.b(r7)
            goto L52
        L3a:
            kotlin.ResultKt.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f4601a
            java.lang.Object r7 = r7.get()
            kotlinx.coroutines.Deferred r7 = (kotlinx.coroutines.Deferred) r7
            if (r7 == 0) goto L52
            r0.p = r6
            r0.s = r4
            java.lang.Object r7 = kotlinx.coroutines.JobKt.c(r7, r0)
            if (r7 != r1) goto L52
            goto L62
        L52:
            au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2 r7 = new au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.p = r2
            r0.s = r3
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.c(r7, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner.a(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(Function1 function1, Continuation continuation) {
        Deferred deferred = (Deferred) this.f4601a.get();
        return deferred != null ? deferred.await(continuation) : CoroutineScopeKt.c(new ControlledRunner$joinPreviousOrRun$3(this, function1, null), continuation);
    }
}
