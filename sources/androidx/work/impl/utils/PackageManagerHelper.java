package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;

/* loaded from: classes.dex */
public class PackageManagerHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4001a = Logger.g("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = f4001a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                Logger.e().a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger loggerE = Logger.e();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            loggerE.a(str, sb.toString());
        } catch (Exception e) {
            Logger loggerE2 = Logger.e();
            StringBuilder sb2 = new StringBuilder();
            androidx.constraintlayout.core.state.a.x(cls, sb2, "could not be ");
            sb2.append(z ? "enabled" : "disabled");
            loggerE2.b(str, sb2.toString(), e);
        }
    }
}
