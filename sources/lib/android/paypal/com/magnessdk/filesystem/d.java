package lib.android.paypal.com.magnessdk.filesystem;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class d {
    public static boolean a(Context context, ArrayList arrayList) throws PackageManager.NameNotFoundException {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                packageManager.getPackageInfo((String) it.next(), 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }
}
