package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PrefetchScheduler_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PrefetchScheduler_androidKt$RobolectricImpl$1 f1064a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        f1064a = lowerCase.equals("robolectric") ? new PrefetchScheduler_androidKt$RobolectricImpl$1() : null;
    }
}
