package au.com.woolworths.foundation.force.upgrade.impl;

import au.com.woolworths.foundation.force.upgrade.SoftUpgradeAlertBannerSession;
import au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/impl/SoftUpgradeAlertBannerSessionImpl;", "Lau/com/woolworths/foundation/force/upgrade/SoftUpgradeAlertBannerSession;", "force-upgrade-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SoftUpgradeAlertBannerSessionImpl implements SoftUpgradeAlertBannerSession {

    /* renamed from: a, reason: collision with root package name */
    public static final SoftUpgradeAlertBannerSessionImpl f8508a = new SoftUpgradeAlertBannerSessionImpl();
    public static SoftUpgradeAlertBanner b;

    @Override // au.com.woolworths.foundation.force.upgrade.SoftUpgradeAlertBannerSession
    public final void a(SoftUpgradeAlertBanner softUpgradeAlertBanner) {
        b = softUpgradeAlertBanner;
    }
}
