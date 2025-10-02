package au.com.woolworths.feature.shop.login;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class LoginActivity$onCreate$1$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ActivityResultLauncher activityResultLauncher = ((LoginActivity) this.receiver).A;
        Intent intentPutExtra = ActivityNavigatorKt.a(Activities.CollectionModeSetup.f4459a, ApplicationType.e).putExtra("EXTRA_DATA", new Activities.CollectionModeSetup.CollectionModeSetupData(true));
        Intrinsics.g(intentPutExtra, "putExtra(...)");
        activityResultLauncher.a(intentPutExtra, null);
        return Unit.f24250a;
    }
}
