package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    public final WindowBackend b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl$Companion;", "", "", "BUFFER_CAPACITY", "I", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public WindowInfoTrackerImpl(WindowBackend windowBackend) {
        this.b = windowBackend;
    }

    public final Flow b(Activity activity) {
        return FlowKt.B(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }
}
