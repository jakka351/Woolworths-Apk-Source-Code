package au.com.woolworths.foundation.bark.engine.reporting;

import YU.a;
import androidx.navigation.compose.c;
import au.com.woolworths.foundation.bark.common.BarkException;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/bark/engine/reporting/ErrorReporter;", "", "Companion", "engine-reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorReporter {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/foundation/bark/engine/reporting/ErrorReporter$Companion;", "", "", "ReportingDepth", "I", "", "FirebaseOwnerKey", "Ljava/lang/String;", "FirebaseSquadKey", "FirebaseAlertKey", "FirebaseAdditionalInfoKey", "engine-reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a(ReportOwner reportOwner, boolean z, BarkException barkException) {
        String string;
        System.out.println((Object) a.A("reportError ", barkException.getD()));
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.e(stackTrace);
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.M(7, stackTrace);
        if (stackTraceElement == null || (string = stackTraceElement.toString()) == null) {
            string = "unknown position";
        }
        FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlyticsKt.a();
        FirebaseCrashlyticsKt.b(firebaseCrashlyticsA, new c(reportOwner, 2, barkException, z));
        firebaseCrashlyticsA.a(string);
        firebaseCrashlyticsA.b(barkException);
        FirebaseCrashlyticsKt.b(firebaseCrashlyticsA, new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(barkException, 20));
        String name = reportOwner + " - " + string;
        Intrinsics.h(name, "name");
        Timber.f27013a.a("Report Standalone Error: ".concat(name), barkException, new Object[0]);
    }
}
