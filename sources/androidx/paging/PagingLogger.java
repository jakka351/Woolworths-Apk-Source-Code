package androidx.paging;

import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagingLogger;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class PagingLogger {
    public static boolean a(int i) {
        return Build.ID != null && Log.isLoggable("Paging", i);
    }

    public static void b(int i, String message) {
        Intrinsics.h(message, "message");
        if (i == 2) {
            Log.v("Paging", message, null);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(YU.a.e(i, "debug level ", " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)"));
            }
            Log.d("Paging", message, null);
        }
    }
}
