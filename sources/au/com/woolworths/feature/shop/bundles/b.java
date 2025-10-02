package au.com.woolworths.feature.shop.bundles;

import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ BundlesActivity e;

    public /* synthetic */ b(BundlesActivity bundlesActivity, int i) {
        this.d = i;
        this.e = bundlesActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        BundlesActivity bundlesActivity = this.e;
        switch (i) {
            case 0:
                int i2 = BundlesActivity.A;
                break;
            case 1:
                bundlesActivity.finish();
                break;
            default:
                int i3 = BundlesActivity.A;
                bundlesActivity.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null)));
                break;
        }
        return unit;
    }
}
