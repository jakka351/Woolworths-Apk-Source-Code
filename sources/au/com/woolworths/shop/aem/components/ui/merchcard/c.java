package au.com.woolworths.shop.aem.components.ui.merchcard;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MerchCardData e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ c(MerchCardData merchCardData, Function1 function1, int i) {
        this.d = i;
        this.e = merchCardData;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                MerchCardData merchCardData = this.e;
                ActionData actionData = merchCardData.f;
                if (actionData != null) {
                    AnalyticsData analytics = actionData.getAnalytics();
                    this.f.invoke(ActionData.a(actionData, analytics != null ? AnalyticsDataKt.c(analytics, merchCardData.g, false) : null));
                }
                break;
            default:
                MerchCardData merchCardData2 = this.e;
                ActionData actionData2 = merchCardData2.f;
                if (actionData2 != null) {
                    AnalyticsData analytics2 = actionData2.getAnalytics();
                    this.f.invoke(ActionData.a(actionData2, analytics2 != null ? AnalyticsDataKt.c(analytics2, merchCardData2.g, false) : null));
                }
                break;
        }
        return Unit.f24250a;
    }
}
