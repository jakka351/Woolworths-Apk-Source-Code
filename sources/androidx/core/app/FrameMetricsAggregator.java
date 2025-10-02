package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final FrameMetricsApi24Impl f2390a = new FrameMetricsApi24Impl();

    @RequiresApi
    public static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {
        public static HandlerThread e;
        public static Handler f;
        public SparseIntArray[] b = new SparseIntArray[9];
        public final ArrayList c = new ArrayList();
        public final Window.OnFrameMetricsAvailableListener d = new Window.OnFrameMetricsAvailableListener() { // from class: androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.1
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                FrameMetricsApi24Impl frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.f2391a & 1) != 0) {
                    SparseIntArray sparseIntArray = frameMetricsApi24Impl.b[0];
                    long metric = frameMetrics.getMetric(8);
                    if (sparseIntArray != null) {
                        int i2 = (int) ((500000 + metric) / 1000000);
                        if (metric >= 0) {
                            sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                        }
                    }
                }
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f2391a = 1;
    }

    public static class FrameMetricsBaseImpl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface MetricType {
    }

    public final void a(Activity activity) {
        FrameMetricsApi24Impl frameMetricsApi24Impl = this.f2390a;
        frameMetricsApi24Impl.getClass();
        if (FrameMetricsApi24Impl.e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            FrameMetricsApi24Impl.e = handlerThread;
            handlerThread.start();
            FrameMetricsApi24Impl.f = new Handler(FrameMetricsApi24Impl.e.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = frameMetricsApi24Impl.b;
            if (sparseIntArrayArr[i] == null && (frameMetricsApi24Impl.f2391a & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(frameMetricsApi24Impl.d, FrameMetricsApi24Impl.f);
        frameMetricsApi24Impl.c.add(new WeakReference(activity));
    }

    public final SparseIntArray[] b() {
        return this.f2390a.b;
    }

    public final void c(Activity activity) {
        FrameMetricsApi24Impl frameMetricsApi24Impl = this.f2390a;
        ArrayList arrayList = frameMetricsApi24Impl.c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(frameMetricsApi24Impl.d);
    }

    public final void d() {
        FrameMetricsApi24Impl frameMetricsApi24Impl = this.f2390a;
        SparseIntArray[] sparseIntArrayArr = frameMetricsApi24Impl.b;
        frameMetricsApi24Impl.b = new SparseIntArray[9];
    }
}
