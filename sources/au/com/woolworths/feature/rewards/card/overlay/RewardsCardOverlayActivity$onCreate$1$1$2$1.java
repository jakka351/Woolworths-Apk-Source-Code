package au.com.woolworths.feature.rewards.card.overlay;

import android.content.Intent;
import au.com.woolworths.android.onesite.haptic.HapticExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsCardOverlayActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        RewardsCardOverlayActivity rewardsCardOverlayActivity = (RewardsCardOverlayActivity) this.receiver;
        AppIdentifier appIdentifier = rewardsCardOverlayActivity.x;
        if (appIdentifier == null) {
            Intrinsics.p("appIdentifier");
            throw null;
        }
        Intent intentA = ActivityNavigatorKt.a(Activities.CopyToClipboardActionActivity.f4462a, appIdentifier == AppIdentifier.d ? ApplicationType.e : ApplicationType.d);
        intentA.putExtra("EXTRA_DATA", new Activities.CopyToClipboardActionActivity.Extras(p0, null));
        rewardsCardOverlayActivity.startActivity(intentA);
        HapticExtKt.c(rewardsCardOverlayActivity);
        return Unit.f24250a;
    }
}
