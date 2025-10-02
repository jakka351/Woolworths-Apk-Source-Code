package au.com.woolworths.android.onesite.logging;

import au.com.woolworths.android.onesite.analytics.a11y.a;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/logging/LoggingTree;", "Ltimber/log/Timber$Tree;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoggingTree extends Timber.Tree {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/logging/LoggingTree$Companion;", "", "", "TimberTreeDepth", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // timber.log.Timber.Tree
    public final void j(int i, String str, String message, Throwable th) {
        Intrinsics.h(message, "message");
        FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlyticsKt.a();
        if (i >= 4) {
            firebaseCrashlyticsA.a(message);
        }
        if (th != null) {
            if (i >= 6) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                Intrinsics.g(stackTrace, "getStackTrace(...)");
                firebaseCrashlyticsA.a("--- timber logging location ---\n" + CollectionsKt.M(ArraysKt.A(7, stackTrace), "\nat\n", null, null, new a(3), 30));
            } else {
                firebaseCrashlyticsA.a(th.getClass().getSimpleName() + ": " + th.getMessage());
            }
        }
        k(i, null, str, Arrays.copyOf(new Object[]{message, th}, 2));
    }
}
