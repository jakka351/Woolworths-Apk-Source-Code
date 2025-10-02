package com.swrve.sdk.messaging;

/* loaded from: classes.dex */
public class SwrveEmbeddedMessage implements SwrveBaseMessage {

    /* renamed from: a, reason: collision with root package name */
    public int f19096a;
    public int b;
    public SwrveEmbeddedCampaign c;
    public String d;
    public EMBEDDED_CAMPAIGN_TYPE e;
    public boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static class EMBEDDED_CAMPAIGN_TYPE {
        public static final EMBEDDED_CAMPAIGN_TYPE d;
        public static final EMBEDDED_CAMPAIGN_TYPE e;
        public static final /* synthetic */ EMBEDDED_CAMPAIGN_TYPE[] f;

        static {
            EMBEDDED_CAMPAIGN_TYPE embedded_campaign_type = new EMBEDDED_CAMPAIGN_TYPE() { // from class: com.swrve.sdk.messaging.SwrveEmbeddedMessage.EMBEDDED_CAMPAIGN_TYPE.1
                @Override // java.lang.Enum
                public final String toString() {
                    return "other";
                }
            };
            d = embedded_campaign_type;
            EMBEDDED_CAMPAIGN_TYPE embedded_campaign_type2 = new EMBEDDED_CAMPAIGN_TYPE() { // from class: com.swrve.sdk.messaging.SwrveEmbeddedMessage.EMBEDDED_CAMPAIGN_TYPE.2
                @Override // java.lang.Enum
                public final String toString() {
                    return "json";
                }
            };
            e = embedded_campaign_type2;
            f = new EMBEDDED_CAMPAIGN_TYPE[]{embedded_campaign_type, embedded_campaign_type2};
        }

        public static EMBEDDED_CAMPAIGN_TYPE valueOf(String str) {
            return (EMBEDDED_CAMPAIGN_TYPE) Enum.valueOf(EMBEDDED_CAMPAIGN_TYPE.class, str);
        }

        public static EMBEDDED_CAMPAIGN_TYPE[] values() {
            return (EMBEDDED_CAMPAIGN_TYPE[]) f.clone();
        }
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final SwrveBaseCampaign a() {
        return this.c;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final int b() {
        return this.b;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final boolean c() {
        return this.f;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final boolean d(SwrveOrientation swrveOrientation) {
        return true;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final int getId() {
        return this.f19096a;
    }
}
