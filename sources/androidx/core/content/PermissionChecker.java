package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface PermissionResult {
    }

    public static int a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                if (((Process.myUid() == i2 && Objects.equals(context.getPackageName(), str2)) ? AppOpsManagerCompat.a(strPermissionToOp, str2, context, i2) : ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, str2)) != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
