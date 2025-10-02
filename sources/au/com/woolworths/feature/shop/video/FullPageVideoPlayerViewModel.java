package au.com.woolworths.feature.shop.video;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.shop.video.FullPageVideoPlayerContract;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/video/FullPageVideoPlayerViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FullPageVideoPlayerViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final DispatcherProvider f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public VideoData i;
    public Job j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/video/FullPageVideoPlayerViewModel$Companion;", "", "", "VIDEO_MILESTONE_90_PERCENT", "I", "", "PERCENTAGE", "F", "TICK_FACTOR", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public FullPageVideoPlayerViewModel(AnalyticsManager analyticsManager, DispatcherProvider dispatcher) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(dispatcher, "dispatcher");
        this.e = analyticsManager;
        this.f = dispatcher;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(FullPageVideoPlayerContract.ViewState.c);
        this.g = mutableStateFlowA;
        this.h = mutableStateFlowA;
    }

    public final void p6(long j, long j2, boolean z) {
        FullPageVideoPlayerViewModel fullPageVideoPlayerViewModel;
        FullPageVideoPlayerContract.ViewState viewState = (FullPageVideoPlayerContract.ViewState) this.h.getValue();
        Job jobC = null;
        this.g.setValue(new FullPageVideoPlayerContract.ViewState(viewState != null ? viewState.f8214a : null, j));
        Job job = this.j;
        if (job != null) {
            ((JobSupport) job).cancel((CancellationException) null);
        }
        if (z) {
            CloseableCoroutineScope closeableCoroutineScopeA = ViewModelKt.a(this);
            this.f.getClass();
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            fullPageVideoPlayerViewModel = this;
            jobC = BuildersKt.c(closeableCoroutineScopeA, DefaultIoScheduler.f, null, new FullPageVideoPlayerViewModel$trackVideoProgressJob$1(j, j2, fullPageVideoPlayerViewModel, null), 2);
        } else {
            fullPageVideoPlayerViewModel = this;
        }
        fullPageVideoPlayerViewModel.j = jobC;
    }
}
