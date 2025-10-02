package au.com.woolworths.foundation.shop.marketplace.education.ui;

import au.com.woolworths.base.shopapp.data.models.InfoSection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract;", "", "Actions", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EducationBottomSheetContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions;", "", "ContinueAddOrUpdateCart", "LaunchInfoSection", "Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions$ContinueAddOrUpdateCart;", "Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions$LaunchInfoSection;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions$ContinueAddOrUpdateCart;", "Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ContinueAddOrUpdateCart extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ContinueAddOrUpdateCart f8751a = new ContinueAddOrUpdateCart();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions$LaunchInfoSection;", "Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInfoSection extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final InfoSection f8752a;

            public LaunchInfoSection(InfoSection info) {
                Intrinsics.h(info, "info");
                this.f8752a = info;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchInfoSection) && Intrinsics.c(this.f8752a, ((LaunchInfoSection) obj).f8752a);
            }

            public final int hashCode() {
                return this.f8752a.hashCode();
            }

            public final String toString() {
                return "LaunchInfoSection(info=" + this.f8752a + ")";
            }
        }
    }
}
