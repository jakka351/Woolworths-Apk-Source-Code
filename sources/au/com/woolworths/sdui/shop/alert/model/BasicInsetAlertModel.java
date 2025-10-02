package au.com.woolworths.sdui.shop.alert.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.sdui.common.alert.model.CoreInsetAlertModel;
import au.com.woolworths.sdui.model.action.ActionData;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/sdui/shop/alert/model/BasicInsetAlertModel;", "", "Lau/com/woolworths/sdui/common/alert/model/CoreInsetAlertModel;", "insetAlertUI", "Lau/com/woolworths/sdui/model/action/ActionData;", UrlHandler.ACTION, "", "actionLabel", "Lau/com/woolworths/analytics/model/AnalyticsData;", "impressionAnalytics", "<init>", "(Lau/com/woolworths/sdui/common/alert/model/CoreInsetAlertModel;Lau/com/woolworths/sdui/model/action/ActionData;Ljava/lang/String;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Lau/com/woolworths/sdui/common/alert/model/CoreInsetAlertModel;", "d", "()Lau/com/woolworths/sdui/common/alert/model/CoreInsetAlertModel;", "Lau/com/woolworths/sdui/model/action/ActionData;", "a", "()Lau/com/woolworths/sdui/model/action/ActionData;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "c", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BasicInsetAlertModel {

    @SerializedName("insetAlertAction")
    @MappedName
    @Nullable
    private final ActionData action;

    @SerializedName("insetAlertActionLabel")
    @MappedName
    @Nullable
    private final String actionLabel;

    @SerializedName("impressionAnalytics")
    @Nullable
    private final AnalyticsData impressionAnalytics;

    @SerializedName("insetAlertUI")
    @NotNull
    private final CoreInsetAlertModel insetAlertUI;

    public BasicInsetAlertModel(@NotNull CoreInsetAlertModel insetAlertUI, @Nullable ActionData actionData, @Nullable String str, @Nullable AnalyticsData analyticsData) {
        Intrinsics.h(insetAlertUI, "insetAlertUI");
        this.insetAlertUI = insetAlertUI;
        this.action = actionData;
        this.actionLabel = str;
        this.impressionAnalytics = analyticsData;
    }

    /* renamed from: a, reason: from getter */
    public final ActionData getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final String getActionLabel() {
        return this.actionLabel;
    }

    /* renamed from: c, reason: from getter */
    public final AnalyticsData getImpressionAnalytics() {
        return this.impressionAnalytics;
    }

    /* renamed from: d, reason: from getter */
    public final CoreInsetAlertModel getInsetAlertUI() {
        return this.insetAlertUI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicInsetAlertModel)) {
            return false;
        }
        BasicInsetAlertModel basicInsetAlertModel = (BasicInsetAlertModel) obj;
        return Intrinsics.c(this.insetAlertUI, basicInsetAlertModel.insetAlertUI) && Intrinsics.c(this.action, basicInsetAlertModel.action) && Intrinsics.c(this.actionLabel, basicInsetAlertModel.actionLabel) && Intrinsics.c(this.impressionAnalytics, basicInsetAlertModel.impressionAnalytics);
    }

    public final int hashCode() {
        int iHashCode = this.insetAlertUI.hashCode() * 31;
        ActionData actionData = this.action;
        int iHashCode2 = (iHashCode + (actionData == null ? 0 : actionData.hashCode())) * 31;
        String str = this.actionLabel;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsData analyticsData = this.impressionAnalytics;
        return iHashCode3 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        return "BasicInsetAlertModel(insetAlertUI=" + this.insetAlertUI + ", action=" + this.action + ", actionLabel=" + this.actionLabel + ", impressionAnalytics=" + this.impressionAnalytics + ")";
    }
}
