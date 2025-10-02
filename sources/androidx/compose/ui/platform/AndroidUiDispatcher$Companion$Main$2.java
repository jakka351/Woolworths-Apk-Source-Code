package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements Function0<CoroutineContext> {
    public static final AndroidUiDispatcher$Companion$Main$2 h = new AndroidUiDispatcher$Companion$Main$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            choreographer = (Choreographer) BuildersKt.d(MainDispatcherLoader.f24726a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1());
        }
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, Handler.createAsync(Looper.getMainLooper()));
        return CoroutineContext.Element.DefaultImpls.c(androidUiDispatcher, androidUiDispatcher.o);
    }
}
