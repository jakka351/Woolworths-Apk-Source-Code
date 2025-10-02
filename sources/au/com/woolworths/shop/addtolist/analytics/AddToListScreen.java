package au.com.woolworths.shop.addtolist.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "AddList", "DuplicateList", "EditList", "Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen$AddList;", "Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen$DuplicateList;", "Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen$EditList;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AddToListScreen implements Screen {
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen$AddList;", "Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddList extends AddToListScreen {
        public final ListsAnalyticsAppSection e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddList(ListsAnalyticsAppSection appSection) {
            super(appSection.d);
            Intrinsics.h(appSection, "appSection");
            this.e = appSection;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String b() {
            return "addlist_screen";
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String d() {
            return "Add list screen";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddList) && this.e == ((AddList) obj).e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "AddList(appSection=" + this.e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen$DuplicateList;", "Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DuplicateList extends AddToListScreen {
        public final ListsAnalyticsAppSection e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuplicateList(ListsAnalyticsAppSection appSection) {
            super(appSection.d);
            Intrinsics.h(appSection, "appSection");
            this.e = appSection;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String b() {
            return "duplicatelist_screen";
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String d() {
            return "Duplicate list screen";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DuplicateList) && this.e == ((DuplicateList) obj).e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "DuplicateList(appSection=" + this.e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen$EditList;", "Lau/com/woolworths/shop/addtolist/analytics/AddToListScreen;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditList extends AddToListScreen {
        public final ListsAnalyticsAppSection e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditList(ListsAnalyticsAppSection appSection) {
            super(appSection.d);
            Intrinsics.h(appSection, "appSection");
            this.e = appSection;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String b() {
            return "editlist_screen";
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String d() {
            return "Edit list screen";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditList) && this.e == ((EditList) obj).e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "EditList(appSection=" + this.e + ")";
        }
    }

    public AddToListScreen(String str) {
        this.d = str;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Screen
    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
