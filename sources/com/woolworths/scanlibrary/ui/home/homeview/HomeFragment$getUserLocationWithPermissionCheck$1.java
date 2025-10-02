package com.woolworths.scanlibrary.ui.home.homeview;

import androidx.fragment.app.FragmentActivity;
import com.woolworths.scanlibrary.ui.home.homeview.HomeFragment;
import com.woolworths.scanlibrary.util.location.BoundLocationManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class HomeFragment$getUserLocationWithPermissionCheck$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeFragment homeFragment = (HomeFragment) this.receiver;
        HomeFragment.StoreNearByLocationListener storeNearByLocationListener = homeFragment.l;
        FragmentActivity activity = homeFragment.getActivity();
        BoundLocationManager.a(homeFragment, storeNearByLocationListener, activity != null ? activity.getApplicationContext() : null);
        return Unit.f24250a;
    }
}
