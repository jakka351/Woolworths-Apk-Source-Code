package au.com.woolworths.android.onesite.featuretoggles;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleMonitor;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureToggleMonitor {

    /* renamed from: a, reason: collision with root package name */
    public final ViewModel f4256a;
    public final FeatureToggleManager b;

    public FeatureToggleMonitor(ViewModel viewModel, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f4256a = viewModel;
        this.b = featureToggleManager;
    }

    public final void a(Feature feature, FlowCollector flowCollector) {
        BuildersKt.c(ViewModelKt.a(this.f4256a), null, null, new FeatureToggleMonitor$onChanged$1(this, feature, flowCollector, null), 3);
    }
}
