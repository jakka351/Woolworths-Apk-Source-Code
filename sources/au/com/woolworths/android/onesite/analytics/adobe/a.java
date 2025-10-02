package au.com.woolworths.android.onesite.analytics.adobe;

import android.content.SharedPreferences;
import com.adobe.marketing.mobile.AdobeCallback;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements AdobeCallback {
    public final /* synthetic */ AdobeAnalyticsInteractor d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ a(AdobeAnalyticsInteractor adobeAnalyticsInteractor, boolean z) {
        this.d = adobeAnalyticsInteractor;
        this.e = z;
    }

    @Override // com.adobe.marketing.mobile.AdobeCallback, com.adobe.marketing.mobile.EventHistoryResultHandler
    public final void a(Object obj) {
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            return;
        }
        Timber.f27013a.b("Adobe Experience cloud id - ".concat(str), new Object[0]);
        AdobeAnalyticsInteractor adobeAnalyticsInteractor = this.d;
        adobeAnalyticsInteractor.d.d(this.e ? "adobe_ecid_first_time_sync" : "adobe_ecid_re_sync");
        AdobeAnalyticsRepository adobeAnalyticsRepository = adobeAnalyticsInteractor.c;
        adobeAnalyticsRepository.getClass();
        SharedPreferences.Editor editorEdit = adobeAnalyticsRepository.f4067a.edit();
        editorEdit.putString("adobe_experience_cloud_id", str);
        editorEdit.apply();
    }
}
