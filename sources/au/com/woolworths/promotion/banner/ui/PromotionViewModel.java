package au.com.woolworths.promotion.banner.ui;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromotionViewModel extends ViewModel {
    public final MutableStateFlow e;
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 f;

    @Inject
    public PromotionViewModel() {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.e = mutableStateFlowA;
        this.f = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(mutableStateFlowA);
    }
}
