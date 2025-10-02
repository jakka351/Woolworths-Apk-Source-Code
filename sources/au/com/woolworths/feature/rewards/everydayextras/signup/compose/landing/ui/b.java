package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraComparisonSectionItem;
import au.com.woolworths.feature.shop.modeselector.Screens;
import com.woolworths.R;
import io.noties.markwon.Markwon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ b(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle extras;
        switch (this.d) {
            case 0:
                EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue it = (EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue) obj;
                Intrinsics.h(it, "it");
                String str = it.b;
                Context context = this.e;
                if (str != null) {
                    return Markwon.b(context).d(str).toString();
                }
                if (it.f6155a != null) {
                    String string = context.getString(R.string.everyday_extras_landing_table_item_included);
                    Intrinsics.g(string, "getString(...)");
                    return string;
                }
                String string2 = context.getString(R.string.everyday_extras_landing_table_item_not_included);
                Intrinsics.g(string2, "getString(...)");
                return string2;
            default:
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.h(result, "result");
                if (result.d == -1) {
                    Intent intent = result.e;
                    Activities.LogIn.Extras extras2 = (intent == null || (extras = intent.getExtras()) == null) ? null : (Activities.LogIn.Extras) extras.getParcelable("login_extras");
                    Activities.LogIn.Extras.ParentActivityExtras parentActivityExtras = extras2 instanceof Activities.LogIn.Extras.ParentActivityExtras ? (Activities.LogIn.Extras.ParentActivityExtras) extras2 : null;
                    String str2 = parentActivityExtras != null ? parentActivityExtras.d : null;
                    if (str2 != null) {
                        this.e.startActivity(ShopAppDeepLink.a(Screens.d, str2));
                    }
                }
                return Unit.f24250a;
        }
    }
}
