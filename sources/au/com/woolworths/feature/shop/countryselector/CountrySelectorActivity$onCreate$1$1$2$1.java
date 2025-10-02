package au.com.woolworths.feature.shop.countryselector;

import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CountrySelectorActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function1<Region, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Region p0 = (Region) obj;
        Intrinsics.h(p0, "p0");
        CountrySelectorActivity countrySelectorActivity = (CountrySelectorActivity) this.receiver;
        int i = CountrySelectorActivity.y;
        countrySelectorActivity.getClass();
        Activities.MainActivity.Tab tab = Activities.MainActivity.Tab.d;
        String string = countrySelectorActivity.getString(com.woolworths.R.string.onboarding_country_selector_guest_mode_message, p0.e);
        Intrinsics.g(string, "getString(...)");
        countrySelectorActivity.startActivity(Activities.MainActivity.f4487a.c(tab, string));
        return Unit.f24250a;
    }
}
