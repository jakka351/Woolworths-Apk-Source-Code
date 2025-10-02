package au.com.woolworths.foundation.feature.analytics;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"feature_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnalyticsTrackerKt {
    public static final AnalyticsTracker a(Composer composer) {
        composer.o(897798835);
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            Object applicationContext = context.getApplicationContext();
            AnalyticsTrackerFactory analyticsTrackerFactory = applicationContext instanceof AnalyticsTrackerFactory ? (AnalyticsTrackerFactory) applicationContext : null;
            objG = analyticsTrackerFactory != null ? analyticsTrackerFactory.e() : new a();
            composer.A(objG);
        }
        AnalyticsTracker analyticsTracker = (AnalyticsTracker) objG;
        composer.l();
        composer.l();
        return analyticsTracker;
    }
}
