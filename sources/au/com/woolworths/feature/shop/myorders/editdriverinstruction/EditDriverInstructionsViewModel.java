package au.com.woolworths.feature.shop.myorders.editdriverinstruction;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsContract;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.analytics.EditDriverInstructionsActions;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.models.EditDriverInstructionsResponse;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsEventHandler;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EditDriverInstructionsViewModel extends ViewModel implements EditDriverInstructionsEventHandler {
    public final EditDriverInstructionsInteractor e;
    public final AnalyticsManager f;
    public EditDriverInstructionActivity.Extras g;
    public final MutableLiveData h;
    public final SharedFlowImpl i;
    public final Flow j;
    public final MutableLiveData k;

    public EditDriverInstructionsViewModel(EditDriverInstructionsInteractor editDriverInstructionsInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = editDriverInstructionsInteractor;
        this.f = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.m(new EditDriverInstructionsContract.ViewState(StatefulButtonState.f));
        this.h = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
        this.k = mutableLiveData;
    }

    public static final EditDriverInstructionActivity.Result p6(EditDriverInstructionsViewModel editDriverInstructionsViewModel, EditDriverInstructionsResponse editDriverInstructionsResponse) {
        boolean z = editDriverInstructionsResponse.f7834a;
        String str = editDriverInstructionsResponse.c;
        if (str != null) {
            return new EditDriverInstructionActivity.Result(z, str);
        }
        throw new IllegalArgumentException("Edit Driver Instruction response field message is null");
    }

    public final void q6(String instructions) {
        Intrinsics.h(instructions, "instructions");
        this.f.c(EditDriverInstructionsActions.h);
        this.h.m(new EditDriverInstructionsContract.ViewState(StatefulButtonState.e));
        BuildersKt.c(ViewModelKt.a(this), null, null, new EditDriverInstructionsViewModel$onSaveDriverInstructionsClick$1(this, instructions, null), 3);
    }
}
