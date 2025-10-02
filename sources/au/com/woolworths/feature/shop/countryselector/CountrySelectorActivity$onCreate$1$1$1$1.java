package au.com.woolworths.feature.shop.countryselector;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CountrySelectorActivity$onCreate$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CountrySelectorActivity countrySelectorActivity = (CountrySelectorActivity) this.receiver;
        int i = CountrySelectorActivity.y;
        countrySelectorActivity.getClass();
        Intent intentA = ActivityNavigatorKt.a(Activities.Onboarding.f4493a, ApplicationType.e);
        if (countrySelectorActivity.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
            intentA.putExtras(countrySelectorActivity.getIntent());
        }
        countrySelectorActivity.startActivity(intentA);
        return Unit.f24250a;
    }
}
