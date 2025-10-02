package coil.util;

import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/util/FileDescriptorCounter;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class FileDescriptorCounter {
    static {
        new File("/proc/self/fd");
        SystemClock.uptimeMillis();
    }
}
