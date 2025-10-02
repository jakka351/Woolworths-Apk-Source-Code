package au.com.woolworths.android.onesite.analytics;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FirebaseAnalyticsLogger;", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseAnalyticsLogger {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAnalytics f4057a;
    public final FirebaseCrashlytics b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FirebaseAnalyticsLogger$Companion;", "", "", "PARAM_SHOPPER_ID", "Ljava/lang/String;", "PARAM_SHOPPING_MODE", "IN_STORE_ID_NOT_SET", "PARAM_IN_STORE_ID", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public FirebaseAnalyticsLogger(FirebaseAnalytics firebaseAnalytics, FirebaseCrashlytics firebaseCrashlytics) {
        this.f4057a = firebaseAnalytics;
        this.b = firebaseCrashlytics;
    }

    public final void a(String str) {
        CrashlyticsCore crashlyticsCore = this.b.f15252a;
        crashlyticsCore.o.f15286a.a(new d(crashlyticsCore, "shopper_id", str));
        this.f4057a.f15179a.zzk(null, "shopper_id", str, false);
    }
}
