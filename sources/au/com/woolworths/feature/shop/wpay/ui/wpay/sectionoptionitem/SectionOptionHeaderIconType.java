package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderIconType;", "", "ImageUrl", "Resource", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderIconType$ImageUrl;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderIconType$Resource;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SectionOptionHeaderIconType {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderIconType$ImageUrl;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderIconType;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageUrl implements SectionOptionHeaderIconType {

        /* renamed from: a, reason: collision with root package name */
        public final String f8392a;
        public final int b;

        public ImageUrl(String url, int i) {
            Intrinsics.h(url, "url");
            this.f8392a = url;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageUrl)) {
                return false;
            }
            ImageUrl imageUrl = (ImageUrl) obj;
            return Intrinsics.c(this.f8392a, imageUrl.f8392a) && this.b == imageUrl.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f8392a.hashCode() * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.p("ImageUrl(url=", this.b, this.f8392a, ", placeholder=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderIconType$Resource;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderIconType;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Resource implements SectionOptionHeaderIconType {

        /* renamed from: a, reason: collision with root package name */
        public final int f8393a;

        public Resource(int i) {
            this.f8393a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && this.f8393a == ((Resource) obj).f8393a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8393a);
        }

        public final String toString() {
            return YU.a.e(this.f8393a, "Resource(resourceId=", ")");
        }
    }
}
