package io.branch.referral;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/branch/referral/BranchLogger;", "", "BranchLogLevel", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BranchLogger {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f23853a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/branch/referral/BranchLogger$BranchLogLevel;", "", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum BranchLogLevel {
        /* JADX INFO: Fake field, exist only in values array */
        ERROR(1),
        /* JADX INFO: Fake field, exist only in values array */
        WARN(2),
        /* JADX INFO: Fake field, exist only in values array */
        INFO(3),
        /* JADX INFO: Fake field, exist only in values array */
        DEBUG(4),
        /* JADX INFO: Fake field, exist only in values array */
        VERBOSE(5);

        BranchLogLevel(int i) {
        }
    }

    public static final void a(String str) {
        if (!f23853a || str == null || str.length() <= 0) {
            return;
        }
        Log.d("BranchSDK", str);
    }

    public static final void b(String message) {
        Intrinsics.h(message, "message");
        if (!f23853a || message.length() <= 0) {
            return;
        }
        Log.e("BranchSDK", message);
    }

    public static final void c(String message) {
        Intrinsics.h(message, "message");
        if (message.length() > 0) {
            Log.i("BranchSDK", message);
        }
    }

    public static final String d(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static final void e(String message) {
        Intrinsics.h(message, "message");
    }

    public static final void f(String message) {
        Intrinsics.h(message, "message");
        if (!f23853a || message.length() <= 0) {
            return;
        }
        Log.w("BranchSDK", message);
    }
}
