package au.com.woolworths.product.quantityselector;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/quantityselector/QuantitySelectorActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "CarouselClick", "CarouselSwipe", "Lau/com/woolworths/product/quantityselector/QuantitySelectorActions$CarouselClick;", "Lau/com/woolworths/product/quantityselector/QuantitySelectorActions$CarouselSwipe;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class QuantitySelectorActions implements Action {
    public final Screen d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/quantityselector/QuantitySelectorActions$CarouselClick;", "Lau/com/woolworths/product/quantityselector/QuantitySelectorActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CarouselClick extends QuantitySelectorActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public CarouselClick(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.j;
            this.g = "Quantity Selector";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CarouselClick) && Intrinsics.c(this.e, ((CarouselClick) obj).e);
        }

        @Override // au.com.woolworths.product.quantityselector.QuantitySelectorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("CarouselClick(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/quantityselector/QuantitySelectorActions$CarouselSwipe;", "Lau/com/woolworths/product/quantityselector/QuantitySelectorActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CarouselSwipe extends QuantitySelectorActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public CarouselSwipe(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.l;
            this.g = "Quantity Selector";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CarouselSwipe) && Intrinsics.c(this.e, ((CarouselSwipe) obj).e);
        }

        @Override // au.com.woolworths.product.quantityselector.QuantitySelectorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("CarouselSwipe(screen=", this.e, ")");
        }
    }

    public QuantitySelectorActions(Screen screen) {
        this.d = screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
