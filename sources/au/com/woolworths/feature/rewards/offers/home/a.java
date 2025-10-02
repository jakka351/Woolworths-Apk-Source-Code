package au.com.woolworths.feature.rewards.offers.home;

import au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String str = (String) this.e;
                List offers = (List) obj;
                Intrinsics.h(offers, "offers");
                return SectionViewItemExtKt.f(str, true, offers);
            default:
                RewardsOfferData rewardsOfferData = (RewardsOfferData) this.e;
                List offers2 = (List) obj;
                Intrinsics.h(offers2, "offers");
                return SectionViewItemExtKt.f(rewardsOfferData.d, false, offers2);
        }
    }
}
