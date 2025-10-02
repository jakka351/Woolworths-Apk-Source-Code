package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ StandardCampaignContent f;

    public /* synthetic */ b(Function1 function1, StandardCampaignContent standardCampaignContent, int i) {
        this.d = i;
        this.e = function1;
        this.f = standardCampaignContent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f.f);
                break;
            case 1:
                this.e.invoke(this.f.g);
                break;
            case 2:
                this.e.invoke(this.f.f);
                break;
            default:
                this.e.invoke(this.f.g);
                break;
        }
        return Unit.f24250a;
    }
}
