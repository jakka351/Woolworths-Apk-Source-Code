package au.com.woolworths.shop.aem.components.model.herobanner;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerText;", "", "HeroBannerBodyText", "HeroBannerPromoBody", "Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerText$HeroBannerBodyText;", "Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerText$HeroBannerPromoBody;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HeroBannerText {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerText$HeroBannerBodyText;", "Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerText;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerBodyText implements HeroBannerText {

        /* renamed from: a, reason: collision with root package name */
        public final String f10166a;

        public HeroBannerBodyText(String str) {
            this.f10166a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeroBannerBodyText) && Intrinsics.c(this.f10166a, ((HeroBannerBodyText) obj).f10166a);
        }

        public final int hashCode() {
            return this.f10166a.hashCode();
        }

        public final String toString() {
            return a.h("HeroBannerBodyText(text=", this.f10166a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerText$HeroBannerPromoBody;", "Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerText;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerPromoBody implements HeroBannerText {

        /* renamed from: a, reason: collision with root package name */
        public final String f10167a;
        public final String b;

        public HeroBannerPromoBody(String str, String str2) {
            this.f10167a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerPromoBody)) {
                return false;
            }
            HeroBannerPromoBody heroBannerPromoBody = (HeroBannerPromoBody) obj;
            return Intrinsics.c(this.f10167a, heroBannerPromoBody.f10167a) && Intrinsics.c(this.b, heroBannerPromoBody.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10167a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("HeroBannerPromoBody(code=", this.f10167a, ", text=", this.b, ")");
        }
    }
}
