package androidx.compose.runtime.internal;

import android.os.Looper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Thread_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1694a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f1694a = id;
    }
}
