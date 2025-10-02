package au.com.woolworths.rewards.base.featuretoggles;

import au.com.woolworths.android.onesite.remoteconfig.RemoteConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/rewards/base/featuretoggles/RewardsRemoteConfig;", "Lau/com/woolworths/android/onesite/remoteconfig/RemoteConfig;", "", "Companion", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class RewardsRemoteConfig implements RemoteConfig {
    public static final RewardsRemoteConfig e;
    public static final RewardsRemoteConfig f;
    public static final RewardsRemoteConfig g;
    public static final /* synthetic */ RewardsRemoteConfig[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/rewards/base/featuretoggles/RewardsRemoteConfig.BOTMANAGER_CONFIG", "Lau/com/woolworths/rewards/base/featuretoggles/RewardsRemoteConfig;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BOTMANAGER_CONFIG extends RewardsRemoteConfig {
        @Override // au.com.woolworths.rewards.base.featuretoggles.RewardsRemoteConfig, au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "{\n    \"protected_paths\": [],\n    \"protected_graphql_operations\": []\n}";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/featuretoggles/RewardsRemoteConfig$Companion;", "Lau/com/woolworths/android/onesite/remoteconfig/RemoteConfig$Values;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion implements RemoteConfig.Values {
    }

    static {
        RewardsRemoteConfig rewardsRemoteConfig = new RewardsRemoteConfig("ACTIVITY_ALERT_MESSAGE", 0, "s_rewards_activity_alert_message");
        BOTMANAGER_CONFIG botmanager_config = new BOTMANAGER_CONFIG("BOTMANAGER_CONFIG", 1, "s_rewards_botmanager_config");
        RewardsRemoteConfig rewardsRemoteConfig2 = new RewardsRemoteConfig("DISCOVER_ALERT_MESSAGE", 2, "s_rewards_discover_alert_message");
        RewardsRemoteConfig rewardsRemoteConfig3 = new RewardsRemoteConfig("EDX_ACQUISITION_OFFER", 3, "s_everyday_extra_acquisition_offer");
        e = rewardsRemoteConfig3;
        RewardsRemoteConfig rewardsRemoteConfig4 = new RewardsRemoteConfig("LITE_MODE_ACCOUNT", 4, "s_lite_mode_account");
        RewardsRemoteConfig rewardsRemoteConfig5 = new RewardsRemoteConfig("LITE_MODE_EXPIRED", 5, "s_lite_mode_expired");
        RewardsRemoteConfig rewardsRemoteConfig6 = new RewardsRemoteConfig("LITE_MODE_HOME", 6, "s_lite_mode_home");
        RewardsRemoteConfig rewardsRemoteConfig7 = new RewardsRemoteConfig("LITE_MODE_REGISTERED", 7, "s_lite_mode_registered");
        RewardsRemoteConfig rewardsRemoteConfig8 = new RewardsRemoteConfig("LITE_MODE_RETURNING", 8, "s_lite_mode_returning");
        RewardsRemoteConfig rewardsRemoteConfig9 = new RewardsRemoteConfig("MAINTENANCE_MESSAGE", 9, "s_rewards_maintenance_v2");
        f = rewardsRemoteConfig9;
        RewardsRemoteConfig rewardsRemoteConfig10 = new RewardsRemoteConfig("OPT_OUT_OF_PAPER", 10, "s_opt_out_of_paper_banner_text");
        RewardsRemoteConfig rewardsRemoteConfig11 = new RewardsRemoteConfig("REWARDS_STATIC_URLS", 11, "s_rewards_static_urls");
        g = rewardsRemoteConfig11;
        RewardsRemoteConfig[] rewardsRemoteConfigArr = {rewardsRemoteConfig, botmanager_config, rewardsRemoteConfig2, rewardsRemoteConfig3, rewardsRemoteConfig4, rewardsRemoteConfig5, rewardsRemoteConfig6, rewardsRemoteConfig7, rewardsRemoteConfig8, rewardsRemoteConfig9, rewardsRemoteConfig10, rewardsRemoteConfig11};
        h = rewardsRemoteConfigArr;
        i = EnumEntriesKt.a(rewardsRemoteConfigArr);
    }

    public RewardsRemoteConfig(String str, int i2, String str2) {
        this.d = str2;
    }

    public static RewardsRemoteConfig valueOf(String str) {
        return (RewardsRemoteConfig) Enum.valueOf(RewardsRemoteConfig.class, str);
    }

    public static RewardsRemoteConfig[] values() {
        return (RewardsRemoteConfig[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
    public String getDefaultValue() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
    /* renamed from: getKey, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
