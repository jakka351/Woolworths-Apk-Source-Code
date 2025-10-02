package au.com.woolworths.feature.shop.ask.olive.ui.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/model/OliveSurvey;", "", "", "surveyFormId", "interactionId", "brand", "customerName", "sessionId", "agentPlatform", "firstIntent", "lastIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "e", "b", "c", "g", "a", "d", "f", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OliveSurvey {

    @SerializedName("agentPlatform")
    @Nullable
    private final String agentPlatform;

    @SerializedName("brand")
    @Nullable
    private final String brand;

    @SerializedName("customerName")
    @Nullable
    private final String customerName;

    @SerializedName("firstIntent")
    @Nullable
    private final String firstIntent;

    @SerializedName("interactionId")
    @Nullable
    private final String interactionId;

    @SerializedName("lastIntent")
    @Nullable
    private final String lastIntent;

    @SerializedName("sessionId")
    @Nullable
    private final String sessionId;

    @SerializedName("surveyFormId")
    @Nullable
    private final String surveyFormId;

    public OliveSurvey(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.surveyFormId = str;
        this.interactionId = str2;
        this.brand = str3;
        this.customerName = str4;
        this.sessionId = str5;
        this.agentPlatform = str6;
        this.firstIntent = str7;
        this.lastIntent = str8;
    }

    /* renamed from: a, reason: from getter */
    public final String getAgentPlatform() {
        return this.agentPlatform;
    }

    /* renamed from: b, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: c, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: d, reason: from getter */
    public final String getFirstIntent() {
        return this.firstIntent;
    }

    /* renamed from: e, reason: from getter */
    public final String getInteractionId() {
        return this.interactionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OliveSurvey)) {
            return false;
        }
        OliveSurvey oliveSurvey = (OliveSurvey) obj;
        return Intrinsics.c(this.surveyFormId, oliveSurvey.surveyFormId) && Intrinsics.c(this.interactionId, oliveSurvey.interactionId) && Intrinsics.c(this.brand, oliveSurvey.brand) && Intrinsics.c(this.customerName, oliveSurvey.customerName) && Intrinsics.c(this.sessionId, oliveSurvey.sessionId) && Intrinsics.c(this.agentPlatform, oliveSurvey.agentPlatform) && Intrinsics.c(this.firstIntent, oliveSurvey.firstIntent) && Intrinsics.c(this.lastIntent, oliveSurvey.lastIntent);
    }

    /* renamed from: f, reason: from getter */
    public final String getLastIntent() {
        return this.lastIntent;
    }

    /* renamed from: g, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: h, reason: from getter */
    public final String getSurveyFormId() {
        return this.surveyFormId;
    }

    public final int hashCode() {
        String str = this.surveyFormId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.interactionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brand;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sessionId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agentPlatform;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstIntent;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastIntent;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.surveyFormId;
        String str2 = this.interactionId;
        String str3 = this.brand;
        String str4 = this.customerName;
        String str5 = this.sessionId;
        String str6 = this.agentPlatform;
        String str7 = this.firstIntent;
        String str8 = this.lastIntent;
        StringBuilder sbV = a.v("OliveSurvey(surveyFormId=", str, ", interactionId=", str2, ", brand=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", customerName=", str4, ", sessionId=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", agentPlatform=", str6, ", firstIntent=");
        return androidx.constraintlayout.core.state.a.l(sbV, str7, ", lastIntent=", str8, ")");
    }
}
