package au.com.woolworths.dynamic.page.ui.content;

import au.com.woolworths.dynamic.page.data.CampaignCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ CampaignCardData f;

    public /* synthetic */ a(Function2 function2, CampaignCardData campaignCardData, int i) {
        this.d = i;
        this.e = function2;
        this.f = campaignCardData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f.d, null);
                break;
            default:
                this.e.invoke(this.f.d, null);
                break;
        }
        return Unit.f24250a;
    }
}
