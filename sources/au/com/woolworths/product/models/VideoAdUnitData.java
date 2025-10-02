package au.com.woolworths.product.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lau/com/woolworths/product/models/VideoAdUnitData;", "", "videoAd", "Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdData;", "productCard", "Lau/com/woolworths/product/models/ProductCard;", "videoAdUnitCarousel", "Lau/com/woolworths/product/models/VideoAdUnitCarousel;", "link", "Lau/com/woolworths/shop/aem/components/model/link/LinkData;", "<init>", "(Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdData;Lau/com/woolworths/product/models/ProductCard;Lau/com/woolworths/product/models/VideoAdUnitCarousel;Lau/com/woolworths/shop/aem/components/model/link/LinkData;)V", "getVideoAd", "()Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdData;", "getProductCard", "()Lau/com/woolworths/product/models/ProductCard;", "getVideoAdUnitCarousel", "()Lau/com/woolworths/product/models/VideoAdUnitCarousel;", "getLink", "()Lau/com/woolworths/shop/aem/components/model/link/LinkData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VideoAdUnitData {
    public static final int $stable = 8;

    @SerializedName("videoAdUnitBottomLink")
    @MappedName
    @Nullable
    private final LinkData link;

    @SerializedName("videoAdUnitProductCard")
    @MappedName
    @Nullable
    private final ProductCard productCard;

    @SerializedName("videoAdUnitVideoAd")
    @MappedName
    @NotNull
    private final VideoAdData videoAd;

    @SerializedName("videoAdUnitCarousel")
    @MappedName
    @Nullable
    private final VideoAdUnitCarousel videoAdUnitCarousel;

    public VideoAdUnitData(@NotNull VideoAdData videoAd, @Nullable ProductCard productCard, @Nullable VideoAdUnitCarousel videoAdUnitCarousel, @Nullable LinkData linkData) {
        Intrinsics.h(videoAd, "videoAd");
        this.videoAd = videoAd;
        this.productCard = productCard;
        this.videoAdUnitCarousel = videoAdUnitCarousel;
        this.link = linkData;
    }

    public static /* synthetic */ VideoAdUnitData copy$default(VideoAdUnitData videoAdUnitData, VideoAdData videoAdData, ProductCard productCard, VideoAdUnitCarousel videoAdUnitCarousel, LinkData linkData, int i, Object obj) {
        if ((i & 1) != 0) {
            videoAdData = videoAdUnitData.videoAd;
        }
        if ((i & 2) != 0) {
            productCard = videoAdUnitData.productCard;
        }
        if ((i & 4) != 0) {
            videoAdUnitCarousel = videoAdUnitData.videoAdUnitCarousel;
        }
        if ((i & 8) != 0) {
            linkData = videoAdUnitData.link;
        }
        return videoAdUnitData.copy(videoAdData, productCard, videoAdUnitCarousel, linkData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VideoAdData getVideoAd() {
        return this.videoAd;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ProductCard getProductCard() {
        return this.productCard;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final VideoAdUnitCarousel getVideoAdUnitCarousel() {
        return this.videoAdUnitCarousel;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final LinkData getLink() {
        return this.link;
    }

    @NotNull
    public final VideoAdUnitData copy(@NotNull VideoAdData videoAd, @Nullable ProductCard productCard, @Nullable VideoAdUnitCarousel videoAdUnitCarousel, @Nullable LinkData link) {
        Intrinsics.h(videoAd, "videoAd");
        return new VideoAdUnitData(videoAd, productCard, videoAdUnitCarousel, link);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoAdUnitData)) {
            return false;
        }
        VideoAdUnitData videoAdUnitData = (VideoAdUnitData) other;
        return Intrinsics.c(this.videoAd, videoAdUnitData.videoAd) && Intrinsics.c(this.productCard, videoAdUnitData.productCard) && Intrinsics.c(this.videoAdUnitCarousel, videoAdUnitData.videoAdUnitCarousel) && Intrinsics.c(this.link, videoAdUnitData.link);
    }

    @Nullable
    public final LinkData getLink() {
        return this.link;
    }

    @Nullable
    public final ProductCard getProductCard() {
        return this.productCard;
    }

    @NotNull
    public final VideoAdData getVideoAd() {
        return this.videoAd;
    }

    @Nullable
    public final VideoAdUnitCarousel getVideoAdUnitCarousel() {
        return this.videoAdUnitCarousel;
    }

    public int hashCode() {
        int iHashCode = this.videoAd.hashCode() * 31;
        ProductCard productCard = this.productCard;
        int iHashCode2 = (iHashCode + (productCard == null ? 0 : productCard.hashCode())) * 31;
        VideoAdUnitCarousel videoAdUnitCarousel = this.videoAdUnitCarousel;
        int iHashCode3 = (iHashCode2 + (videoAdUnitCarousel == null ? 0 : videoAdUnitCarousel.hashCode())) * 31;
        LinkData linkData = this.link;
        return iHashCode3 + (linkData != null ? linkData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VideoAdUnitData(videoAd=" + this.videoAd + ", productCard=" + this.productCard + ", videoAdUnitCarousel=" + this.videoAdUnitCarousel + ", link=" + this.link + ")";
    }
}
