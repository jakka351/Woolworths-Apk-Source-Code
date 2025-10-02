package curtains.internal;

import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcurtains/internal/CurrentFrameMetricsListener;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "Companion", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class CurrentFrameMetricsListener implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f23762a = LazyKt.a(LazyThreadSafetyMode.e, CurrentFrameMetricsListener$Companion$mainThreadHandler$2.h);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcurtains/internal/CurrentFrameMetricsListener$Companion;", "", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* renamed from: curtains.internal.CurrentFrameMetricsListener$onFrameMetricsAvailable$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        Intrinsics.h(window, "window");
        Intrinsics.h(frameMetrics, "frameMetrics");
        if (frameMetrics.getMetric(11) == 0) {
            throw null;
        }
    }
}
