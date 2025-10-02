package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultExecutorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Delay f24690a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Delay delay;
        String strC = SystemPropsKt.c("kotlinx.coroutines.main.delay");
        if (strC != null ? Boolean.parseBoolean(strC) : false) {
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f24726a;
            delay = (MainDispatchersKt.a(mainCoroutineDispatcher) || !(mainCoroutineDispatcher instanceof Delay)) ? DefaultExecutor.m : (Delay) mainCoroutineDispatcher;
        } else {
            delay = DefaultExecutor.m;
        }
        f24690a = delay;
    }
}
