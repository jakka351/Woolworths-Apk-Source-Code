package au.com.woolworths.feature.shop.more;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MoreFragment e;

    public /* synthetic */ e(MoreFragment moreFragment, int i) {
        this.d = i;
        this.e = moreFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((ContentPageViewModel) this.e.o.getD()).q6(new Activities.ContentPage.ContentPageExtras(Activities.ContentPage.ContentPageType.t, "", ""));
                break;
            default:
                this.e.s = false;
                break;
        }
        return Unit.f24250a;
    }
}
