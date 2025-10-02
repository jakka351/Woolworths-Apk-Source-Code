package au.com.woolworths.feature.rewards.redemptionsettings;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ au.com.woolworths.feature.rewards.card.overlay.ui.b f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(Object obj, List list, au.com.woolworths.feature.rewards.card.overlay.ui.b bVar, int i, int i2) {
        this.d = i2;
        this.h = obj;
        this.e = list;
        this.f = bVar;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.g;
        au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = this.f;
        List list = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                int i3 = RewardsRedemptionSettingsBottomSheetActivity.B;
                ((RewardsRedemptionSettingsBottomSheetActivity) obj).P4(list, bVar, i2 + 1);
                break;
            default:
                ((RewardsRedemptionSettingsBottomSheetFragment) obj).Q1(list, bVar, i2 + 1);
                break;
        }
        return unit;
    }
}
