package com.woolworths.scanlibrary.ui.entry.launcher;

import android.app.Activity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.woolworths.scanlibrary.models.authentication.Token;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SngLauncherImpl e;

    public /* synthetic */ a(SngLauncherImpl sngLauncherImpl, int i) {
        this.d = i;
        this.e = sngLauncherImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                this.e.k.j(new ScanAndGoLauncherState(true, null));
                break;
            default:
                Intrinsics.e((Token) obj);
                SngLauncherImpl sngLauncherImpl = this.e;
                sngLauncherImpl.k.j(new ScanAndGoLauncherState(false, null));
                Activity activity = sngLauncherImpl.j;
                if (activity != null) {
                    activity.startActivityForResult(ActivityNavigatorKt.a(Activities.LaunchScanAndGo.f4483a, ApplicationType.e), GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
                }
                sngLauncherImpl.a();
                break;
        }
        return Unit.f24250a;
    }
}
