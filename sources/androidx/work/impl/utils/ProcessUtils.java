package androidx.work.impl.utils;

import android.app.Application;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProcessUtils {
    static {
        Intrinsics.g(Logger.g("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    public static final boolean a(Context context, Configuration configuration) {
        Intrinsics.h(context, "context");
        Intrinsics.h(configuration, "configuration");
        String processName = Application.getProcessName();
        Intrinsics.g(processName, "getProcessName()");
        return processName.equals(context.getApplicationInfo().processName);
    }
}
