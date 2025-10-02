package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ StandardCampaignContent e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Modifier h;

    public /* synthetic */ c(StandardCampaignContent standardCampaignContent, Function1 function1, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = standardCampaignContent;
        this.f = function1;
        this.g = function0;
        this.h = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                StandardBottomSheetUiKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                StandardCampaignScreenKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }
}
