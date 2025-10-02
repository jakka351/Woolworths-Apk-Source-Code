package au.com.woolworths.sdui.rewards.model.broadcastbanner;

import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.rewards.model.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/model/broadcastbanner/BasicCoreBroadcastBannerModel;", "", "rewards-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BasicCoreBroadcastBannerModel {

    /* renamed from: a, reason: collision with root package name */
    public final CoreBroadcastBannerModel f10026a;
    public final String b;
    public final ActionData c;

    public BasicCoreBroadcastBannerModel(CoreBroadcastBannerModel coreBroadcastBannerModel, String str, ActionData actionData) {
        this.f10026a = coreBroadcastBannerModel;
        this.b = str;
        this.c = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicCoreBroadcastBannerModel)) {
            return false;
        }
        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = (BasicCoreBroadcastBannerModel) obj;
        return this.f10026a.equals(basicCoreBroadcastBannerModel.f10026a) && Intrinsics.c(this.b, basicCoreBroadcastBannerModel.b) && Intrinsics.c(this.c, basicCoreBroadcastBannerModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10026a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ActionData actionData = this.c;
        return (iHashCode2 + (actionData != null ? actionData.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "BasicCoreBroadcastBannerModel(broadcastBannerUI=" + this.f10026a + ", actionLabel=" + this.b + ", action=" + this.c + ", impressionAnalytics=null)";
    }
}
