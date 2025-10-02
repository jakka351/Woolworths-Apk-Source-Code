package au.com.woolworths.feature.shop.myorders.details.infomodal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.feature.shop.myorders.details.epoxy.ProgressStepperInfoDescription;
import au.com.woolworths.feature.shop.myorders.details.epoxy.ProgressStepperInfoStep;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.models.ToolTipStepInfo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/infomodal/ProgressStepperInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProgressStepperInfoViewModel extends ViewModel {
    public final MutableStateFlow e;
    public final StateFlow f;

    @Inject
    public ProgressStepperInfoViewModel(@NotNull SavedStateHandle savedStateHandle) {
        StepsToolTip stepsToolTip;
        Object value;
        Intrinsics.h(savedStateHandle, "savedStateHandle");
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ProgressStepperInfoViewState(EmptyList.d));
        this.e = mutableStateFlowA;
        this.f = mutableStateFlowA;
        ProgressStepperInfoActivity.Companion.Extras extras = (ProgressStepperInfoActivity.Companion.Extras) savedStateHandle.a("EXTRAS_PROGRESS_STEPPER_INFO");
        if (extras == null || (stepsToolTip = extras.d) == null) {
            return;
        }
        ProgressStepperInfoDescription progressStepperInfoDescription = new ProgressStepperInfoDescription(stepsToolTip.d);
        List list = stepsToolTip.e;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProgressStepperInfoStep((ToolTipStepInfo) it.next()));
        }
        ArrayList arrayListC0 = CollectionsKt.c0(arrayList, CollectionsKt.Q(progressStepperInfoDescription));
        MutableStateFlow mutableStateFlow = this.e;
        do {
            value = mutableStateFlow.getValue();
            ((ProgressStepperInfoViewState) this.e.getValue()).getClass();
        } while (!mutableStateFlow.d(value, new ProgressStepperInfoViewState(arrayListC0)));
    }
}
