package au.com.woolworths.feature.shop.myorders.details.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "HelpMenuClick", "ChatWithOlive", "FaqClick", "Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions$ChatWithOlive;", "Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions$FaqClick;", "Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions$HelpMenuClick;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HelpActions implements Action {
    public final Screen d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions$ChatWithOlive;", "Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatWithOlive extends HelpActions {
        public final Screen e;
        public final Category f;
        public final String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChatWithOlive(Screen screen) {
            super(screen);
            Intrinsics.h(screen, "screen");
            this.e = screen;
            this.f = Category.m;
            this.g = "Chat";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getK() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChatWithOlive) && Intrinsics.c(this.e, ((ChatWithOlive) obj).e);
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.analytics.HelpActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("ChatWithOlive(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions$FaqClick;", "Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FaqClick extends HelpActions {
        public final Screen e;
        public final Category f;
        public final String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaqClick(Screen screen) {
            super(screen);
            Intrinsics.h(screen, "screen");
            this.e = screen;
            this.f = Category.m;
            this.g = "FAQs";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getK() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FaqClick) && Intrinsics.c(this.e, ((FaqClick) obj).e);
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.analytics.HelpActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("FaqClick(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions$HelpMenuClick;", "Lau/com/woolworths/feature/shop/myorders/details/analytics/HelpActions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HelpMenuClick extends HelpActions {
        public final MyOrdersScreens e;
        public final Category f;
        public final String g;

        public HelpMenuClick(MyOrdersScreens myOrdersScreens) {
            super(myOrdersScreens);
            this.e = myOrdersScreens;
            this.f = Category.m;
            this.g = "Help";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getK() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpMenuClick) && this.e.equals(((HelpMenuClick) obj).e);
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.analytics.HelpActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "HelpMenuClick(screen=" + this.e + ")";
        }
    }

    public HelpActions(Screen screen) {
        this.d = screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
