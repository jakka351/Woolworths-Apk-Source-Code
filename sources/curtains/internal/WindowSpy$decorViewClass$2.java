package curtains.internal;

import android.os.Build;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class WindowSpy$decorViewClass$2 extends Lambda implements Function0<Class<?>> {
    public static final WindowSpy$decorViewClass$2 h = new WindowSpy$decorViewClass$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = Build.VERSION.SDK_INT;
        try {
            return Class.forName("com.android.internal.policy.DecorView");
        } catch (Throwable th) {
            Log.d("WindowSpy", "Unexpected exception loading com.android.internal.policy.DecorView on API " + i, th);
            return null;
        }
    }
}
