package androidx.lifecycle;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/MediatorLiveData;", "lifecycle-livedata_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    public BlockRunner m;
    public EmittedSource n;

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public final void h() {
        super.h();
        BlockRunner blockRunner = this.m;
        if (blockRunner != null) {
            Job job = blockRunner.f;
            if (job != null) {
                ((JobSupport) job).cancel((CancellationException) null);
            }
            blockRunner.f = null;
            if (blockRunner.e != null) {
                return;
            }
            blockRunner.e = BuildersKt.c(blockRunner.c, null, null, new BlockRunner$maybeRun$1(blockRunner, null), 3);
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public final void i() {
        super.i();
        BlockRunner blockRunner = this.m;
        if (blockRunner != null) {
            if (blockRunner.f != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            ContextScope contextScope = blockRunner.c;
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            blockRunner.f = BuildersKt.c(contextScope, MainDispatcherLoader.f24726a.T(), null, new BlockRunner$cancel$1(blockRunner, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2a
            kotlin.ResultKt.b(r7)
            goto L53
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            kotlin.ResultKt.b(r7)
            androidx.lifecycle.EmittedSource r7 = r6.n
            if (r7 == 0) goto L53
            r0.r = r5
            kotlinx.coroutines.scheduling.DefaultScheduler r2 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.internal.MainDispatcherLoader.f24726a
            kotlinx.coroutines.MainCoroutineDispatcher r2 = r2.T()
            androidx.lifecycle.EmittedSource$disposeNow$2 r5 = new androidx.lifecycle.EmittedSource$disposeNow$2
            r5.<init>(r7, r4)
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r2, r5, r0)
            if (r7 != r1) goto L4f
            goto L50
        L4f:
            r7 = r3
        L50:
            if (r7 != r1) goto L53
            return r1
        L53:
            r6.n = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.p(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
