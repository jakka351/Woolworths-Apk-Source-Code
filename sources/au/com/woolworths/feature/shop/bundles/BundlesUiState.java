package au.com.woolworths.feature.shop.bundles;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiState;", "", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundlesUiState {
    public static final BundlesUiState j = new BundlesUiState(null, false, null, false, BundlesProductCardConfig.e, EmptyMap.d, EmptyMap.d, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6739a;
    public final boolean b;
    public final BundlesData c;
    public final boolean d;
    public final BundlesProductCardConfig e;
    public final Map f;
    public final Map g;
    public final BundlesTransientError h;
    public final FullPageMessage.Error i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiState$Companion;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BundlesUiState(Integer num, boolean z, BundlesData bundlesData, boolean z2, BundlesProductCardConfig bundlesProductCardConfig, Map map, Map map2, BundlesTransientError bundlesTransientError, FullPageMessage.Error error) {
        this.f6739a = num;
        this.b = z;
        this.c = bundlesData;
        this.d = z2;
        this.e = bundlesProductCardConfig;
        this.f = map;
        this.g = map2;
        this.h = bundlesTransientError;
        this.i = error;
    }

    public static BundlesUiState a(BundlesUiState bundlesUiState, Integer num, boolean z, BundlesData bundlesData, boolean z2, BundlesProductCardConfig bundlesProductCardConfig, Map map, Map map2, BundlesTransientError bundlesTransientError, FullPageMessage.Error error, int i) {
        if ((i & 1) != 0) {
            num = bundlesUiState.f6739a;
        }
        Integer num2 = num;
        if ((i & 2) != 0) {
            z = bundlesUiState.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            bundlesData = bundlesUiState.c;
        }
        BundlesData bundlesData2 = bundlesData;
        if ((i & 8) != 0) {
            z2 = bundlesUiState.d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            bundlesProductCardConfig = bundlesUiState.e;
        }
        BundlesProductCardConfig bundlesProductCardConfig2 = bundlesProductCardConfig;
        Map map3 = (i & 32) != 0 ? bundlesUiState.f : map;
        Map map4 = (i & 64) != 0 ? bundlesUiState.g : map2;
        BundlesTransientError bundlesTransientError2 = (i & 128) != 0 ? bundlesUiState.h : bundlesTransientError;
        FullPageMessage.Error error2 = (i & 256) != 0 ? bundlesUiState.i : error;
        bundlesUiState.getClass();
        return new BundlesUiState(num2, z3, bundlesData2, z4, bundlesProductCardConfig2, map3, map4, bundlesTransientError2, error2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundlesUiState)) {
            return false;
        }
        BundlesUiState bundlesUiState = (BundlesUiState) obj;
        return Intrinsics.c(this.f6739a, bundlesUiState.f6739a) && this.b == bundlesUiState.b && Intrinsics.c(this.c, bundlesUiState.c) && this.d == bundlesUiState.d && Intrinsics.c(this.e, bundlesUiState.e) && Intrinsics.c(this.f, bundlesUiState.f) && Intrinsics.c(this.g, bundlesUiState.g) && this.h == bundlesUiState.h && Intrinsics.c(this.i, bundlesUiState.i);
    }

    public final int hashCode() {
        Integer num = this.f6739a;
        int iE = androidx.camera.core.impl.b.e((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        BundlesData bundlesData = this.c;
        int iD = au.com.woolworths.dynamic.page.ui.content.d.d(this.g, au.com.woolworths.dynamic.page.ui.content.d.d(this.f, (this.e.hashCode() + androidx.camera.core.impl.b.e((iE + (bundlesData == null ? 0 : bundlesData.hashCode())) * 31, 31, this.d)) * 31, 31), 31);
        BundlesTransientError bundlesTransientError = this.h;
        int iHashCode = (iD + (bundlesTransientError == null ? 0 : bundlesTransientError.hashCode())) * 31;
        FullPageMessage.Error error = this.i;
        return iHashCode + (error != null ? error.hashCode() : 0);
    }

    public final String toString() {
        return "BundlesUiState(cartCount=" + this.f6739a + ", showCartIcon=" + this.b + ", page=" + this.c + ", isRefreshing=" + this.d + ", productCardConfig=" + this.e + ", updateProductQuantityMap=" + this.f + ", updateBundlesQuantityMap=" + this.g + ", transientError=" + this.h + ", error=" + this.i + ")";
    }
}
