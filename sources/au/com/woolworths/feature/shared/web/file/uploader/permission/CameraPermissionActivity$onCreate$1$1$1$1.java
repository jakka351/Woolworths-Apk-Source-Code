package au.com.woolworths.feature.shared.web.file.uploader.permission;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CameraPermissionActivity$onCreate$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CameraPermissionActivity cameraPermissionActivity = (CameraPermissionActivity) this.receiver;
        int i = CameraPermissionActivity.z;
        cameraPermissionActivity.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", cameraPermissionActivity.getPackageName(), null));
        cameraPermissionActivity.startActivity(intent);
        return Unit.f24250a;
    }
}
