package au.com.woolworths.feature.shop.foryou.settings;

import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ RewardsSettingsActivity d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RewardsSettingsContract.ViewState viewState = (RewardsSettingsContract.ViewState) obj;
        RewardsSettingsController rewardsSettingsController = this.d.A;
        if (rewardsSettingsController != null) {
            rewardsSettingsController.setData(viewState.b);
            return Unit.f24250a;
        }
        Intrinsics.p("settingsController");
        throw null;
    }
}
