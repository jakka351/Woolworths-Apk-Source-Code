package au.com.woolworths.feature.shared.instore.wifi.ui.content;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/content/RewardsAppSpecificContent;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/content/AppSpecificContent;", "Companion", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsAppSpecificContent implements AppSpecificContent {

    /* renamed from: a, reason: collision with root package name */
    public final String f6542a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/content/RewardsAppSpecificContent$Companion;", "", "", "NOTIFICATION_PREFERENCES_DEEPLINK_URL", "Ljava/lang/String;", "TERMS_URL", "PRIVACY_URL", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RewardsAppSpecificContent(String baseApiUrl) {
        Intrinsics.h(baseApiUrl, "baseApiUrl");
        this.f6542a = baseApiUrl;
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final int a() {
        return R.drawable.rewards_instore_wifi_hero;
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final List b() {
        return CollectionsKt.R(new ContentRowData(R.drawable.ic_rewards_access_features, R.string.access_in_store_app_features, R.string.in_app_feature_details), new ContentRowData(R.drawable.ic_rewards_stay_connected, R.string.stay_connected, R.string.stay_connected_details), new ContentRowData(R.drawable.ic_rewards_handy_reminders, R.string.handy_reminders, R.string.rewards_handy_reminders_details, true, CollectionsKt.Q("com.woolworths.rewards://preferences/pushNotifications")));
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final String c() {
        return a.g(this.f6542a, "/zeus/mnemosyne/v1/public/cisco-wifi/collection_notice.html");
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final String d() {
        return "com.woolworths.rewards://preferences/pushNotifications";
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final int e() {
        return R.string.rewards_instore_wifi_links_already_joined;
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final String f() {
        return "https://www.woolworthsgroup.com.au/au/en/privacy.html";
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final boolean g() {
        return false;
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final String h() {
        return "https://www.everyday.com.au/terms/app.html?utm_source=edr-app&utm_medium=referral&utm_term=terms-of-use";
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final int i() {
        return R.string.rewards_title_join_instore_wifi;
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final int j() {
        return R.string.rewards_instore_wifi_links_already_joined_no_feedback;
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent
    public final boolean k() {
        return false;
    }
}
