package au.com.woolworths.feature.shop.onboarding.sdui.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/OnboardingContentData;", "", "VerticalContentData", "Lau/com/woolworths/feature/shop/onboarding/sdui/data/OnboardingContentData$VerticalContentData;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface OnboardingContentData {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/OnboardingContentData$VerticalContentData;", "Lau/com/woolworths/feature/shop/onboarding/sdui/data/OnboardingContentData;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VerticalContentData implements OnboardingContentData {

        /* renamed from: a, reason: collision with root package name */
        public final List f7977a;

        public VerticalContentData(AbstractList abstractList) {
            this.f7977a = abstractList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalContentData) && Intrinsics.c(this.f7977a, ((VerticalContentData) obj).f7977a);
        }

        public final int hashCode() {
            List list = this.f7977a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return a.l("VerticalContentData(rows=", ")", this.f7977a);
        }
    }
}
