package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.ui.MapAnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InstoreMapCallbacks e;

    public /* synthetic */ a(InstoreMapCallbacks instoreMapCallbacks, int i) {
        this.d = i;
        this.e = instoreMapCallbacks;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        InstoreMapCallbacks instoreMapCallbacks = this.e;
        switch (i) {
            case 0:
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                instoreMapCallbacks.c(MapAnalyticsEvent.OnLocationRationaleShown.f7397a);
                break;
            case 1:
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$12 = InstoreMapScreenKt.f7385a;
                instoreMapCallbacks.c(MapAnalyticsEvent.DeviceNotSupportedDialogImpression.f7391a);
                break;
            case 2:
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$13 = InstoreMapScreenKt.f7385a;
                instoreMapCallbacks.c(MapAnalyticsEvent.NotInStoreBuildingErrorDialogImpression.f7396a);
                break;
            case 3:
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$14 = InstoreMapScreenKt.f7385a;
                instoreMapCallbacks.c(MapAnalyticsEvent.InStoreNavigationErrorDialogImpression.f7393a);
                break;
            default:
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$15 = InstoreMapScreenKt.f7385a;
                instoreMapCallbacks.o();
                break;
        }
        return unit;
    }
}
