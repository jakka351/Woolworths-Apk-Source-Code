package au.com.woolworths.feature.shop.foryou.settings;

import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsOptionManager;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsSettingsOptionManager {

    /* renamed from: a, reason: collision with root package name */
    public final ShopAppRegionInteractor f7144a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RewardsSettingsOptionManager(ShopAppRegionInteractor shopRegionInteractor) {
        Intrinsics.h(shopRegionInteractor, "shopRegionInteractor");
        this.f7144a = shopRegionInteractor;
    }
}
