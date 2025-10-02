package au.com.woolworths.android.onesite.logging.dynatrace;

import YU.a;
import kotlin.Metadata;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/logging/dynatrace/TimberDynatraceLogger;", "Lau/com/woolworths/android/onesite/logging/dynatrace/DynatraceLogger;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimberDynatraceLogger implements DynatraceLogger {
    public final DynatraceAction a(String str) {
        Timber.f27013a.b("Enter Action: ".concat(str), new Object[0]);
        return new TimberDynatraceAction(this, str);
    }

    public final void b(String str) {
        Timber.f27013a.b(a.A("Set identity: ", str), new Object[0]);
    }
}
