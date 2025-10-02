package io.branch.referral.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AdType {
    public static final /* synthetic */ AdType[] d = {new AdType("BANNER", 0), new AdType("INTERSTITIAL", 1), new AdType("REWARDED_VIDEO", 2), new AdType("NATIVE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    AdType EF5;

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) d.clone();
    }
}
