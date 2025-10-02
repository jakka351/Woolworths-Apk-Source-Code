package au.com.woolworths.shop.aem.components.ui.merchcard;

import androidx.compose.runtime.DisposableEffectScope;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MerchCardData e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ b(MerchCardData merchCardData, Function1 function1, int i) {
        this.d = i;
        this.e = merchCardData;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                MerchCardData merchCardData = this.e;
                AnalyticsData analyticsData = merchCardData.h;
                if (analyticsData != null) {
                    this.f.invoke(AnalyticsDataKt.c(analyticsData, merchCardData.g, false));
                }
                return new MerchCardKt$MerchCardGrid$2$invoke$lambda$3$lambda$2$$inlined$onDispose$1();
            case 1:
                ButtonData it = (ButtonData) obj;
                Intrinsics.h(it, "it");
                ActionData actionData = it.e;
                if (actionData != null) {
                    AnalyticsData analytics = actionData.getAnalytics();
                    this.f.invoke(ActionData.a(actionData, analytics != null ? AnalyticsDataKt.c(analytics, this.e.g, false) : null));
                }
                return Unit.f24250a;
            case 2:
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect2, "$this$DisposableEffect");
                MerchCardData merchCardData2 = this.e;
                AnalyticsData analyticsData2 = merchCardData2.h;
                if (analyticsData2 != null) {
                    this.f.invoke(AnalyticsDataKt.c(analyticsData2, merchCardData2.g, false));
                }
                return new MerchCardKt$MerchCardList$1$invoke$lambda$3$lambda$2$$inlined$onDispose$1();
            default:
                ButtonData it2 = (ButtonData) obj;
                Intrinsics.h(it2, "it");
                ActionData actionData2 = it2.e;
                if (actionData2 != null) {
                    AnalyticsData analytics2 = actionData2.getAnalytics();
                    this.f.invoke(ActionData.a(actionData2, analytics2 != null ? AnalyticsDataKt.c(analytics2, this.e.g, false) : null));
                }
                return Unit.f24250a;
        }
    }
}
