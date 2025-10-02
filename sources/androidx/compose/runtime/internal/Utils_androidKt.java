package androidx.compose.runtime.internal;

import android.util.Log;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Utils_androidKt {
    public static final void a(Throwable th) {
        Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
    }
}
