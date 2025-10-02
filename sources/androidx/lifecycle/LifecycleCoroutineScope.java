package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements CoroutineScope {
    /* renamed from: a */
    public abstract Lifecycle getD();

    public final void c(Function2 function2) {
        BuildersKt.c(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, function2, null), 3);
    }

    public final void d(Function2 function2) {
        BuildersKt.c(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, function2, null), 3);
    }
}
