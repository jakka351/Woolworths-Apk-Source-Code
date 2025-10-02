package au.com.woolworths.feature.shared.web.file.uploader.permission;

import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CameraPermissionActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        CameraPermissionViewModel cameraPermissionViewModel = (CameraPermissionViewModel) this.receiver;
        if (cameraPermissionViewModel.e.a("android.permission.CAMERA")) {
            MutableStateFlow mutableStateFlow = cameraPermissionViewModel.h;
            do {
                value = mutableStateFlow.getValue();
                ((CameraPermissionContract.ViewState) value).getClass();
            } while (!mutableStateFlow.d(value, new CameraPermissionContract.ViewState(true)));
        } else {
            cameraPermissionViewModel.f.f(CameraPermissionContract.Action.RequestCameraPermission.f6563a);
        }
        return Unit.f24250a;
    }
}
