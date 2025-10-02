package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class InviteData implements Serializable {
    private static final int HASH_CODE_MULT = 31;
    private BannerData bannerData;
    private b1 customInterceptData;
    private String declineButtonText;
    private String doSkipInvitation;
    private String invitationHeadline;
    private String invitationText;
    private boolean isRtl;
    private String laterButtonText;
    private t3 localNotificationData;
    private String mobileInvitationType;
    private String provideButtonText;

    /* loaded from: classes6.dex */
    public enum a {
        ALERT,
        BANNER,
        CUSTOM,
        PUSH_NOTIFICATION,
        LOCAL_NOTIFICATION,
        SKIP_INVITE;

        public static a a(String str) {
            if (str != null) {
                a aVar = BANNER;
                if (str.equals(aVar.toString())) {
                    return aVar;
                }
                a aVar2 = PUSH_NOTIFICATION;
                if (str.equals(aVar2.toString())) {
                    return aVar2;
                }
                a aVar3 = CUSTOM;
                if (str.equals(aVar3.toString())) {
                    return aVar3;
                }
                a aVar4 = LOCAL_NOTIFICATION;
                if (str.equals(aVar4.toString())) {
                    return aVar4;
                }
                a aVar5 = SKIP_INVITE;
                if (str.equals(aVar5.toString())) {
                    return aVar5;
                }
            }
            return ALERT;
        }
    }

    public InviteData() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InviteData inviteData = (InviteData) obj;
            String str = this.invitationHeadline;
            if (str == null ? inviteData.invitationHeadline != null : !str.equals(inviteData.invitationHeadline)) {
                return false;
            }
            String str2 = this.invitationText;
            if (str2 == null ? inviteData.invitationText != null : !str2.equals(inviteData.invitationText)) {
                return false;
            }
            String str3 = this.provideButtonText;
            if (str3 == null ? inviteData.provideButtonText != null : !str3.equals(inviteData.provideButtonText)) {
                return false;
            }
            String str4 = this.laterButtonText;
            if (str4 == null ? inviteData.laterButtonText != null : !str4.equals(inviteData.laterButtonText)) {
                return false;
            }
            String str5 = this.declineButtonText;
            if (str5 == null ? inviteData.declineButtonText != null : !str5.equals(inviteData.declineButtonText)) {
                return false;
            }
            String str6 = this.doSkipInvitation;
            if (str6 == null ? inviteData.doSkipInvitation != null : !str6.equals(inviteData.doSkipInvitation)) {
                return false;
            }
            String str7 = this.mobileInvitationType;
            if (str7 == null ? inviteData.mobileInvitationType != null : !str7.equals(inviteData.mobileInvitationType)) {
                return false;
            }
            if (this.isRtl != inviteData.isRtl) {
                return false;
            }
            b1 b1Var = this.customInterceptData;
            if (b1Var == null ? inviteData.customInterceptData != null : !b1Var.equals(inviteData.customInterceptData)) {
                return false;
            }
            t3 t3Var = this.localNotificationData;
            if (t3Var == null ? inviteData.localNotificationData != null : !t3Var.equals(inviteData.localNotificationData)) {
                return false;
            }
            BannerData bannerData = this.bannerData;
            BannerData bannerData2 = inviteData.bannerData;
            if (bannerData != null) {
                return bannerData.equals(bannerData2);
            }
            if (bannerData2 == null) {
                return true;
            }
        }
        return false;
    }

    public BannerData getBannerData() {
        return this.bannerData;
    }

    public b1 getCustomInterceptData() {
        return this.customInterceptData;
    }

    public String getDeclineButtonText() {
        return this.declineButtonText;
    }

    public String getDoSkipInvitation() {
        return this.doSkipInvitation;
    }

    public String getInvitationHeadline() {
        return this.invitationHeadline;
    }

    public String getInvitationText() {
        return this.invitationText;
    }

    public String getLaterButtonText() {
        return this.laterButtonText;
    }

    public t3 getLocalNotificationData() {
        return this.localNotificationData;
    }

    public String getProvideButtonText() {
        return this.provideButtonText;
    }

    public a getType() {
        return a.a(this.mobileInvitationType);
    }

    public int hashCode() {
        String str = this.invitationHeadline;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.invitationText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.provideButtonText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.laterButtonText;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.declineButtonText;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.doSkipInvitation;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.mobileInvitationType;
        int iHashCode7 = (Boolean.valueOf(this.isRtl).hashCode() + ((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31)) * 31;
        BannerData bannerData = this.bannerData;
        int iHashCode8 = (iHashCode7 + (bannerData != null ? bannerData.hashCode() : 0)) * 31;
        b1 b1Var = this.customInterceptData;
        int iHashCode9 = (iHashCode8 + (b1Var != null ? b1Var.hashCode() : 0)) * 31;
        t3 t3Var = this.localNotificationData;
        return iHashCode9 + (t3Var != null ? t3Var.hashCode() : 0);
    }

    public boolean isRtl() {
        return this.isRtl;
    }

    public void setLocalNotificationData(t3 t3Var) {
        this.localNotificationData = t3Var;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"invitationHeadline\":");
            sb.append(l3.d(this.invitationHeadline));
            sb.append(",\"invitationText\":");
            sb.append(l3.d(this.invitationText));
            sb.append(",\"provideButtonText\":");
            sb.append(l3.c(this.provideButtonText));
            sb.append(",\"laterButtonText\":");
            sb.append(l3.c(this.laterButtonText));
            sb.append(",\"declineButtonText\":");
            sb.append(l3.c(this.declineButtonText));
            sb.append(",\"doSkipInvitation\":");
            sb.append(l3.c(this.doSkipInvitation));
            sb.append(",\"mobileInvitationType\":");
            sb.append(l3.c(this.mobileInvitationType));
            sb.append(",\"isRtl\":");
            sb.append(this.isRtl);
            sb.append(",\"customBanner\":");
            BannerData bannerData = this.bannerData;
            String jsonString = null;
            sb.append(bannerData == null ? null : bannerData.toJsonString());
            sb.append(",\"customIntercept\":");
            b1 b1Var = this.customInterceptData;
            sb.append(b1Var == null ? null : b1Var.f());
            sb.append(",\"customLocalNotification\":");
            t3 t3Var = this.localNotificationData;
            if (t3Var != null) {
                jsonString = t3Var.toJsonString();
            }
            sb.append(jsonString);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public InviteData(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, BannerData bannerData, b1 b1Var) {
        this.invitationHeadline = str;
        this.invitationText = str2;
        this.provideButtonText = str3;
        this.laterButtonText = str4;
        this.declineButtonText = str5;
        this.doSkipInvitation = str6;
        this.mobileInvitationType = str7;
        this.isRtl = z;
        this.bannerData = bannerData;
        this.customInterceptData = b1Var;
    }

    public InviteData(JSONObject jSONObject) {
        try {
            if (jSONObject.has("invitationHeadline") && !jSONObject.isNull("invitationHeadline")) {
                this.invitationHeadline = jSONObject.getString("invitationHeadline");
            }
            if (jSONObject.has("invitationText") && !jSONObject.isNull("invitationText")) {
                this.invitationText = jSONObject.getString("invitationText");
            }
            if (jSONObject.has("provideButtonText") && !jSONObject.isNull("provideButtonText")) {
                this.provideButtonText = jSONObject.getString("provideButtonText");
            }
            if (jSONObject.has("laterButtonText") && !jSONObject.isNull("laterButtonText")) {
                this.laterButtonText = jSONObject.getString("laterButtonText");
            }
            if (jSONObject.has("declineButtonText") && !jSONObject.isNull("declineButtonText")) {
                this.declineButtonText = jSONObject.getString("declineButtonText");
            }
            if (jSONObject.has("doSkipInvitation") && !jSONObject.isNull("doSkipInvitation")) {
                this.doSkipInvitation = jSONObject.getString("doSkipInvitation");
            }
            if (jSONObject.has("mobileInvitationType") && !jSONObject.isNull("mobileInvitationType")) {
                this.mobileInvitationType = jSONObject.getString("mobileInvitationType");
            }
            if (jSONObject.has("isRtl") && !jSONObject.isNull("isRtl")) {
                this.isRtl = jSONObject.getBoolean("isRtl");
            }
            if (jSONObject.has("customBanner") && !jSONObject.isNull("customBanner")) {
                this.bannerData = new BannerData(jSONObject.getJSONObject("customBanner"));
            }
            if (jSONObject.has("customIntercept") && !jSONObject.isNull("customIntercept")) {
                this.customInterceptData = new b1(jSONObject.getJSONObject("customIntercept"));
            }
            if (!jSONObject.has("customLocalNotification") || jSONObject.isNull("customLocalNotification")) {
                return;
            }
            this.localNotificationData = new t3(jSONObject.getJSONObject("customLocalNotification"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }
}
