package au.com.woolworths.android.onesite.analytics.adobe.data;

import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/ActionData;", "Lau/com/woolworths/android/onesite/analytics/adobe/data/ContextData;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ActionData implements ContextData {

    /* renamed from: a, reason: collision with root package name */
    public final String f4068a;
    public String b;
    public String c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/ActionData$Companion;", "", "", "ADOBE_ANALYTICS_TAG", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ActionData a(String action) {
            Intrinsics.h(action, "action");
            return new ActionData(action);
        }
    }

    public ActionData(String action) {
        Intrinsics.h(action, "action");
        this.f4068a = action;
    }

    public HashMap a(AppConfigurationInteractor appConfigurationInteractor, PreferencesManager preferencesManager, AccountInteractor accountInteractor) {
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        HashMap map = new HashMap();
        String str = this.b;
        String str2 = this.f4068a;
        if (str == null || StringsKt.D(str)) {
            Timber.f27013a.f(new IllegalStateException(String.format("Cannot track action \"%1$s\" - page name is not set", Arrays.copyOf(new Object[]{str2}, 1))));
        } else {
            String str3 = this.b;
            Intrinsics.e(str3);
            map.put("digitalData.page.pageName", str3);
        }
        if (!StringsKt.D(str2)) {
            map.put("digitalData.event.eventName", str2);
            map.put("digitalData.event.eventName", str2);
        }
        String str4 = this.c;
        if (str4 != null && !StringsKt.D(str4)) {
            String str5 = this.c;
            Intrinsics.e(str5);
            map.put("event27", str5);
        }
        return map;
    }

    public final void b(String pageName) {
        Intrinsics.h(pageName, "pageName");
        this.b = pageName;
    }
}
