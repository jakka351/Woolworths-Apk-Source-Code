package com.woolworths.scanlibrary.ui.entry.launcher;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import com.woolworths.scanlibrary.analytics.tracking.ScanAndGoEntryActions;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class SngLauncherImpl$fetchScanAndGoData$3 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FetchSngErrorState fetchSngErrorState;
        Throwable p0 = (Throwable) obj;
        Intrinsics.h(p0, "p0");
        SngLauncherImpl sngLauncherImpl = (SngLauncherImpl) this.receiver;
        AnalyticsManager analyticsManager = sngLauncherImpl.h;
        sngLauncherImpl.g.getClass();
        if (p0 instanceof NoConnectivityException) {
            analyticsManager.c(ScanAndGoEntryActions.g);
            fetchSngErrorState = FetchSngErrorState.d;
        } else {
            analyticsManager.c(ScanAndGoEntryActions.e);
            fetchSngErrorState = FetchSngErrorState.e;
        }
        sngLauncherImpl.k.j(new ScanAndGoLauncherState(false, fetchSngErrorState));
        sngLauncherImpl.a();
        return Unit.f24250a;
    }
}
