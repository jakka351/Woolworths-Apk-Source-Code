package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ViewModelKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SynchronizedObject f2801a = new SynchronizedObject();

    public static final CloseableCoroutineScope a(ViewModel viewModel) {
        CloseableCoroutineScope closeableCoroutineScope;
        Intrinsics.h(viewModel, "<this>");
        synchronized (f2801a) {
            closeableCoroutineScope = (CloseableCoroutineScope) viewModel.n6("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (closeableCoroutineScope == null) {
                CoroutineContext coroutineContextT = EmptyCoroutineContext.d;
                try {
                    DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                    coroutineContextT = MainDispatcherLoader.f24726a.T();
                } catch (IllegalStateException | NotImplementedError unused) {
                }
                CloseableCoroutineScope closeableCoroutineScope2 = new CloseableCoroutineScope(coroutineContextT.plus(SupervisorKt.b()));
                viewModel.l6("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", closeableCoroutineScope2);
                closeableCoroutineScope = closeableCoroutineScope2;
            }
        }
        return closeableCoroutineScope;
    }
}
