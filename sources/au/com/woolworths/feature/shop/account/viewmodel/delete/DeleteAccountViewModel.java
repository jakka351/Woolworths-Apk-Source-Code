package au.com.woolworths.feature.shop.account.viewmodel.delete;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeleteAccountViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final DeleteAccountInteractorImpl f;
    public final SchedulersProvider g;
    public final SharedFlowImpl h;
    public final Flow i;
    public final MutableStateFlow j;
    public final StateFlow k;

    public DeleteAccountViewModel(AnalyticsManager analyticsManager, DeleteAccountInteractorImpl deleteAccountInteractorImpl, SchedulersProvider schedulersProvider) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        this.e = analyticsManager;
        this.f = deleteAccountInteractorImpl;
        this.g = schedulersProvider;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        this.i = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(DeleteAccountContract.ViewState.Loading.f6593a);
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
        r6();
    }

    public static final void p6(DeleteAccountViewModel deleteAccountViewModel) {
        Object value;
        Object objB;
        MutableStateFlow mutableStateFlow = deleteAccountViewModel.j;
        do {
            value = mutableStateFlow.getValue();
            objB = (DeleteAccountContract.ViewState) value;
            if (objB instanceof DeleteAccountContract.ViewState.Content) {
                DeleteAccountContract.ViewState.Content content = (DeleteAccountContract.ViewState.Content) objB;
                AccountDeletionState accountDeletionState = content.b;
                objB = DeleteAccountContract.ViewState.Content.b(content, new AccountDeletionState(accountDeletionState.f6588a, false, accountDeletionState.c));
            }
        } while (!mutableStateFlow.d(value, objB));
        deleteAccountViewModel.h.f(DeleteAccountContract.Action.LaunchHome.f6589a);
    }

    public final void q6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new DeleteAccountViewModel$deleteAccount$1(this, null), 3);
    }

    public final void r6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new DeleteAccountViewModel$fetchDeleteAccountTnC$1(this, null), 3);
    }

    public final void s6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new DeleteAccountViewModel$logout$1(this, null), 3);
    }
}
