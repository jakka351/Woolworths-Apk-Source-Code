package au.com.woolworths.feature.shop.modeselector.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ModeSelectorStoreDetailsData;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModeSelectorStoreDetailsData {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadableAsset f7529a;
    public final String b;
    public final String c;
    public final ButtonApiData d;

    public ModeSelectorStoreDetailsData(DownloadableAsset downloadableAsset, String str, String str2, ButtonApiData buttonApiData) {
        this.f7529a = downloadableAsset;
        this.b = str;
        this.c = str2;
        this.d = buttonApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeSelectorStoreDetailsData)) {
            return false;
        }
        ModeSelectorStoreDetailsData modeSelectorStoreDetailsData = (ModeSelectorStoreDetailsData) obj;
        return Intrinsics.c(this.f7529a, modeSelectorStoreDetailsData.f7529a) && Intrinsics.c(this.b, modeSelectorStoreDetailsData.b) && Intrinsics.c(this.c, modeSelectorStoreDetailsData.c) && Intrinsics.c(this.d, modeSelectorStoreDetailsData.d);
    }

    public final int hashCode() {
        DownloadableAsset downloadableAsset = this.f7529a;
        int iHashCode = (downloadableAsset == null ? 0 : downloadableAsset.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonApiData buttonApiData = this.d;
        return iHashCode3 + (buttonApiData != null ? buttonApiData.hashCode() : 0);
    }

    public final String toString() {
        return "ModeSelectorStoreDetailsData(image=" + this.f7529a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + ")";
    }
}
