package YU;

import android.util.Log;
import com.cyberfend.cyfsecurity.CircleProgressBar;

/* loaded from: classes.dex */
public class UB {
    static {
        CircleProgressBar.a("443=\u0001\u0004\u0015\u001f\u000e\f\u0011-7");
        CircleProgressBar.a("443=\u0001\u0004\u0015\u001f\u000e\f\u0011-6\b");
    }

    public static void a(Exception exc) {
        try {
            if (UK.f20a.length() < 10000) {
                StringBuilder sb = new StringBuilder();
                sb.append(UK.f20a);
                sb.append(";");
                String stackTraceString = Log.getStackTraceString(exc);
                if (stackTraceString != null && stackTraceString.length() > 500) {
                    stackTraceString = stackTraceString.substring(0, 500);
                }
                sb.append(M.a(stackTraceString));
                UK.f20a = sb.toString();
            }
        } catch (Exception unused) {
        }
    }
}
