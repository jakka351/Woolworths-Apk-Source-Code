package au.com.woolworths.foundation.shop.marketplace.education.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "OnAppear", "ClickLearnMore", "ContinueAddItem", "Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions$ClickLearnMore;", "Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions$ContinueAddItem;", "Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions$OnAppear;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EducationBottomSheetActions implements Action {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions$ClickLearnMore;", "Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickLearnMore extends EducationBottomSheetActions {
        public final Screen d;
        public final Category e;
        public final String f;

        public ClickLearnMore(Screen screen) {
            Intrinsics.h(screen, "screen");
            this.d = screen;
            this.e = Category.j;
            this.f = "Learn More";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getN() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getM() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickLearnMore) && Intrinsics.c(this.d, ((ClickLearnMore) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return d.m("ClickLearnMore(screen=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions$ContinueAddItem;", "Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContinueAddItem extends EducationBottomSheetActions {
        public final Screen d;
        public final Category e;
        public final String f;

        public ContinueAddItem(Screen screen) {
            Intrinsics.h(screen, "screen");
            this.d = screen;
            this.e = Category.j;
            this.f = "Continue adding item";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getN() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getM() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContinueAddItem) && Intrinsics.c(this.d, ((ContinueAddItem) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return d.m("ContinueAddItem(screen=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions$OnAppear;", "Lau/com/woolworths/foundation/shop/marketplace/education/analytics/EducationBottomSheetActions;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAppear extends EducationBottomSheetActions {
        public final Screen d;
        public final Category e;
        public final String f;

        public OnAppear(Screen screen) {
            Intrinsics.h(screen, "screen");
            this.d = screen;
            this.e = Category.k;
            this.f = "Everyday Market Educational Pop-up";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getN() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getM() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAppear) && Intrinsics.c(this.d, ((OnAppear) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return d.m("OnAppear(screen=", this.d, ")");
        }
    }
}
