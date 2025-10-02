package com.woolworths.scanlibrary.configuration;

import au.com.woolworths.android.onesite.remoteconfig.RemoteConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/configuration/ScanAndGoRemoteConfig;", "Lau/com/woolworths/android/onesite/remoteconfig/RemoteConfig;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ScanAndGoRemoteConfig implements RemoteConfig {
    public static final ScanAndGoRemoteConfig d;
    public static final /* synthetic */ ScanAndGoRemoteConfig[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ScanAndGoRemoteConfig scanAndGoRemoteConfig = new ScanAndGoRemoteConfig() { // from class: com.woolworths.scanlibrary.configuration.ScanAndGoRemoteConfig.START_SHOP_INFO
            @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
            public final String getDefaultValue() {
                return "{\n    \"message\": \"All your Woolworths lists are now accessible in Scan&Go.\"\n}";
            }

            @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
            /* renamed from: getKey */
            public final String getD() {
                return "s_scan_and_go_start_shop_note";
            }
        };
        d = scanAndGoRemoteConfig;
        ScanAndGoRemoteConfig[] scanAndGoRemoteConfigArr = {scanAndGoRemoteConfig};
        e = scanAndGoRemoteConfigArr;
        f = EnumEntriesKt.a(scanAndGoRemoteConfigArr);
    }

    public static ScanAndGoRemoteConfig valueOf(String str) {
        return (ScanAndGoRemoteConfig) Enum.valueOf(ScanAndGoRemoteConfig.class, str);
    }

    public static ScanAndGoRemoteConfig[] values() {
        return (ScanAndGoRemoteConfig[]) e.clone();
    }
}
