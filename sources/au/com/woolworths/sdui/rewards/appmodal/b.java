package au.com.woolworths.sdui.rewards.appmodal;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.modules.SerialModuleImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                int i2 = RewardsAppModalActivity.x;
                RewardsAppModalViewModel rewardsAppModalViewModelN4 = ((RewardsAppModalActivity) obj2).N4();
                BuildersKt.c(ViewModelKt.a(rewardsAppModalViewModelN4), null, null, new RewardsAppModalViewModel$displayNotificationsPermissionsDialog$1((String) obj, rewardsAppModalViewModelN4, null), 3);
                break;
            case 1:
                AnalyticsData analyticsData = (AnalyticsData) obj;
                int i3 = RewardsAppModalActivity.x;
                RewardsAppModalViewModel rewardsAppModalViewModelN42 = ((RewardsAppModalActivity) obj2).N4();
                if (analyticsData != null) {
                    rewardsAppModalViewModelN42.g.g(AnalyticsDataKt.a(analyticsData));
                    break;
                }
                break;
            default:
                JsonBuilder Json = (JsonBuilder) obj;
                Intrinsics.h(Json, "$this$Json");
                Json.b = true;
                SerialModuleImpl serialModuleImpl = ((RewardsAppModalInteractor) obj2).b;
                Intrinsics.h(serialModuleImpl, "<set-?>");
                Json.g = serialModuleImpl;
                Json.e = "__typename";
                break;
        }
        return unit;
    }
}
