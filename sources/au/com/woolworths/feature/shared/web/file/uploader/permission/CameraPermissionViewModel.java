package au.com.woolworths.feature.shared.web.file.uploader.permission;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionViewModel;", "Landroidx/lifecycle/ViewModel;", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CameraPermissionViewModel extends ViewModel {
    public final PermissionFlagInteractorImpl e;
    public final SharedFlowImpl f;
    public final SharedFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;

    public CameraPermissionViewModel(PermissionFlagInteractorImpl permissionFlagInteractorImpl) {
        this.e = permissionFlagInteractorImpl;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f = sharedFlowImplB;
        this.g = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(CameraPermissionContract.ViewState.b);
        this.h = mutableStateFlowA;
        this.i = FlowKt.b(mutableStateFlowA);
    }

    public final void p6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.h;
            value = mutableStateFlow.getValue();
            ((CameraPermissionContract.ViewState) value).getClass();
        } while (!mutableStateFlow.d(value, new CameraPermissionContract.ViewState(false)));
    }
}
