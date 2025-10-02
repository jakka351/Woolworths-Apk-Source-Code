package au.com.woolworths.analytics.supers.recipes.swapalternativeproducts;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/recipes/swapalternativeproducts/SwapAlternativeProductsAnalytics;", "", "SwapAlternativeProducts", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwapAlternativeProductsAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/recipes/swapalternativeproducts/SwapAlternativeProductsAnalytics$SwapAlternativeProducts;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SwapAlternativeProducts implements Screen {
        public static final SwapAlternativeProducts d = new SwapAlternativeProducts();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/recipes/swapalternativeproducts/SwapAlternativeProductsAnalytics$SwapAlternativeProducts$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final /* synthetic */ Action[] e;
            public static final /* synthetic */ EnumEntries f;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/recipes/swapalternativeproducts/SwapAlternativeProductsAnalytics.SwapAlternativeProducts.Action.CHOOSE_ALTERNATIVE_PRODUCT_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/recipes/swapalternativeproducts/SwapAlternativeProductsAnalytics$SwapAlternativeProducts$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CHOOSE_ALTERNATIVE_PRODUCT_BUTTON_CLICK extends Action {
                public final Object g;

                public CHOOSE_ALTERNATIVE_PRODUCT_BUTTON_CLICK() {
                    super("CHOOSE_ALTERNATIVE_PRODUCT_BUTTON_CLICK", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(SwapAlternativeProducts.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Choose alternative product", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            static {
                CHOOSE_ALTERNATIVE_PRODUCT_BUTTON_CLICK choose_alternative_product_button_click = new CHOOSE_ALTERNATIVE_PRODUCT_BUTTON_CLICK();
                d = choose_alternative_product_button_click;
                Action[] actionArr = {choose_alternative_product_button_click};
                e = actionArr;
                f = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) e.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Swap Alternative Products screen"), new Pair("app.Section", "Recipes"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "swapalternativeproducts_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Swap Alternative Products screen".equals(screen.getD()) && "swapalternativeproducts_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Swap Alternative Products screen";
        }

        public final int hashCode() {
            return e.hashCode() + 1559836283;
        }
    }
}
