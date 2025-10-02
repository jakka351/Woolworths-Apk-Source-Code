package au.com.woolworths.foundation.rewards.offers.model;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.sdui.rewards.model.broadcastbanner.BasicCoreBroadcastBannerModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsHeader;", "", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferDetailsHeader {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadableAsset f8611a;
    public final IconAsset b;
    public final IconAsset c;
    public final String d;
    public final String e;
    public final OfferDetailsStatusBadge f;
    public final BasicCoreBroadcastBannerModel g;

    public OfferDetailsHeader(DownloadableAsset downloadableAsset, IconAsset iconAsset, IconAsset iconAsset2, String str, String str2, OfferDetailsStatusBadge offerDetailsStatusBadge, BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel) {
        this.f8611a = downloadableAsset;
        this.b = iconAsset;
        this.c = iconAsset2;
        this.d = str;
        this.e = str2;
        this.f = offerDetailsStatusBadge;
        this.g = basicCoreBroadcastBannerModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsHeader)) {
            return false;
        }
        OfferDetailsHeader offerDetailsHeader = (OfferDetailsHeader) obj;
        return Intrinsics.c(this.f8611a, offerDetailsHeader.f8611a) && Intrinsics.c(this.b, offerDetailsHeader.b) && Intrinsics.c(this.c, offerDetailsHeader.c) && Intrinsics.c(this.d, offerDetailsHeader.d) && Intrinsics.c(this.e, offerDetailsHeader.e) && Intrinsics.c(this.f, offerDetailsHeader.f) && Intrinsics.c(this.g, offerDetailsHeader.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8611a.hashCode() * 31)) * 31;
        IconAsset iconAsset = this.c;
        int iC = b.c(b.c((iHashCode + (iconAsset == null ? 0 : iconAsset.hashCode())) * 31, 31, this.d), 31, this.e);
        OfferDetailsStatusBadge offerDetailsStatusBadge = this.f;
        int iHashCode2 = (iC + (offerDetailsStatusBadge == null ? 0 : offerDetailsStatusBadge.hashCode())) * 31;
        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = this.g;
        return iHashCode2 + (basicCoreBroadcastBannerModel != null ? basicCoreBroadcastBannerModel.hashCode() : 0);
    }

    public final String toString() {
        return "OfferDetailsHeader(heroAsset=" + this.f8611a + ", leafAsset=" + this.b + ", roundelAsset=" + this.c + ", title=" + this.d + ", description=" + this.e + ", statusBadge=" + this.f + ", broadcastBanner=" + this.g + ")";
    }
}
