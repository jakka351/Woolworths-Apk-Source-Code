package androidx.slidingpanelayout.widget;

import androidx.window.layout.WindowInfoTrackerImpl;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;", "", "OnFoldingFeatureChangeListener", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FoldingFeatureObserver {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInfoTrackerImpl f3761a;
    public final Executor b;
    public Job c;
    public OnFoldingFeatureChangeListener d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnFoldingFeatureChangeListener {
    }

    public FoldingFeatureObserver(WindowInfoTrackerImpl windowInfoTrackerImpl, Executor executor) {
        Intrinsics.h(executor, "executor");
        this.f3761a = windowInfoTrackerImpl;
        this.b = executor;
    }
}
