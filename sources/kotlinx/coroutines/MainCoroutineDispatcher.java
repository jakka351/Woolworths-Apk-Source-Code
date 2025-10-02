package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher A(int i) {
        LimitedDispatcherKt.a(i);
        return this;
    }

    public abstract MainCoroutineDispatcher T();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        MainCoroutineDispatcher mainCoroutineDispatcherT;
        String str;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f24726a;
        if (this == mainCoroutineDispatcher) {
            str = "Dispatchers.Main";
        } else {
            try {
                mainCoroutineDispatcherT = mainCoroutineDispatcher.T();
            } catch (UnsupportedOperationException unused) {
                mainCoroutineDispatcherT = null;
            }
            str = this == mainCoroutineDispatcherT ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + DebugStringsKt.a(this);
    }
}
