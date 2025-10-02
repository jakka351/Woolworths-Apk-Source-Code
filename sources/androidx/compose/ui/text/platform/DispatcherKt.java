package androidx.compose.ui.text.platform;

import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DispatcherKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MainCoroutineDispatcher f2143a;

    static {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        f2143a = MainDispatcherLoader.f24726a;
    }
}
