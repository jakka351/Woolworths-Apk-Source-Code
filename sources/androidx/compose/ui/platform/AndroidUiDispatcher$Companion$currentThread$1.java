package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidUiDispatcher$Companion$currentThread$1 extends ThreadLocal<CoroutineContext> {
    @Override // java.lang.ThreadLocal
    public final CoroutineContext initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, Handler.createAsync(looperMyLooper));
        return CoroutineContext.Element.DefaultImpls.c(androidUiDispatcher, androidUiDispatcher.o);
    }
}
