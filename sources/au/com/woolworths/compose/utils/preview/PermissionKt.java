package au.com.woolworths.compose.utils.preview;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectionModeKt;
import au.com.woolworths.android.onesite.repository.b;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PermissionKt {
    public static final PermissionState a(String str, Function1 function1, Composer composer, int i) {
        composer.o(-1036225265);
        if ((i & 2) != 0) {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new b(10);
                composer.A(objG);
            }
            function1 = (Function1) objG;
            composer.l();
        }
        PermissionState permissionKt$rememberPermissionsStatePreviewable$2 = ((Boolean) composer.x(InspectionModeKt.f1972a)).booleanValue() ? new PermissionKt$rememberPermissionsStatePreviewable$2() : PermissionStateKt.a(str, function1, composer, 0);
        composer.l();
        return permissionKt$rememberPermissionsStatePreviewable$2;
    }
}
