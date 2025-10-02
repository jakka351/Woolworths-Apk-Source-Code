package au.com.woolworths.feature.shop.banners.broadcastbanner;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerDataKt;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/banners/broadcastbanner/BannerDismissInteractor;", "", "banners_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BannerDismissInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6637a;
    public final ShopAccountInteractor b;

    public BannerDismissInteractor(SharedPreferences sharedPreferences, ShopAccountInteractor accountInteractor) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.f6637a = sharedPreferences;
        this.b = accountInteractor;
    }

    public final boolean a(BroadcastBannerData bannerData) {
        Intrinsics.h(bannerData, "bannerData");
        if (!BroadcastBannerDataKt.a(bannerData) || bannerData.getBannerId() == null) {
            return false;
        }
        String bannerId = bannerData.getBannerId();
        Intrinsics.e(bannerId);
        return this.f6637a.getBoolean(c(bannerId), false);
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f6637a.edit();
        editorEdit.putBoolean(c(str), true);
        editorEdit.apply();
    }

    public final String c(String str) {
        String shopperId;
        Member memberN = this.b.n();
        if (memberN == null || (shopperId = memberN.getShopperId()) == null) {
            shopperId = "Guest";
        }
        return androidx.constraintlayout.core.state.a.i(shopperId, "_", str, "_dismissed");
    }
}
