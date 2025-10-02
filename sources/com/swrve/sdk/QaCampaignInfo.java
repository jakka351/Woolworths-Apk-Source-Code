package com.swrve.sdk;

/* loaded from: classes6.dex */
public class QaCampaignInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f19036a;
    public final long b;
    public final CAMPAIGN_TYPE c;
    public final boolean d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class CAMPAIGN_TYPE {
        public static final CAMPAIGN_TYPE d;
        public static final CAMPAIGN_TYPE e;
        public static final /* synthetic */ CAMPAIGN_TYPE[] f;

        static {
            CAMPAIGN_TYPE campaign_type = new CAMPAIGN_TYPE() { // from class: com.swrve.sdk.QaCampaignInfo.CAMPAIGN_TYPE.1
                @Override // java.lang.Enum
                public final String toString() {
                    return "iam";
                }
            };
            d = campaign_type;
            CAMPAIGN_TYPE campaign_type2 = new CAMPAIGN_TYPE() { // from class: com.swrve.sdk.QaCampaignInfo.CAMPAIGN_TYPE.2
                @Override // java.lang.Enum
                public final String toString() {
                    return "embedded";
                }
            };
            e = campaign_type2;
            f = new CAMPAIGN_TYPE[]{campaign_type, campaign_type2};
        }

        public static CAMPAIGN_TYPE valueOf(String str) {
            return (CAMPAIGN_TYPE) Enum.valueOf(CAMPAIGN_TYPE.class, str);
        }

        public static CAMPAIGN_TYPE[] values() {
            return (CAMPAIGN_TYPE[]) f.clone();
        }
    }

    public QaCampaignInfo(long j, long j2, CAMPAIGN_TYPE campaign_type, boolean z, String str) {
        this.f19036a = j;
        this.b = j2;
        this.c = campaign_type;
        this.d = z;
        this.e = str;
    }
}
