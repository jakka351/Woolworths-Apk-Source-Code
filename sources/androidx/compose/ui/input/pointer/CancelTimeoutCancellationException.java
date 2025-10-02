package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CancelTimeoutCancellationException extends CancellationException {
    public static final CancelTimeoutCancellationException d = new CancelTimeoutCancellationException();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(SuspendingPointerInputFilter_jvmKt.f1864a);
        return this;
    }
}
