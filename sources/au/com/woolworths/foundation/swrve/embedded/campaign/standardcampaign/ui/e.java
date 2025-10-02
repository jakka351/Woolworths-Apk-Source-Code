package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ StandardCampaignContent e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ e(StandardCampaignContent standardCampaignContent, Function1 function1, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = standardCampaignContent;
        this.f = function1;
        this.g = function0;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                StandardBottomSheetUiKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                StandardPopUpUiKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }
}
