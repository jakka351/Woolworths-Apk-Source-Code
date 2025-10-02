package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "AddToListSheetClose", "AddToListSheetLaunch", "NewList", "NewListCreated", "RemoveFromList", "SaveToListButtonClick", "UpdateQuantitySheetLaunch", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$AddToListSheetClose;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$AddToListSheetLaunch;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$NewList;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$NewListCreated;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$RemoveFromList;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$SaveToListButtonClick;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$UpdateQuantitySheetLaunch;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AddToListBottomSheetActions implements Action {
    public final Screen d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$AddToListSheetClose;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToListSheetClose extends AddToListBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public AddToListSheetClose(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.m;
            this.g = "Close bottomsheet";
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
            return (obj instanceof AddToListSheetClose) && Intrinsics.c(this.e, ((AddToListSheetClose) obj).e);
        }

        @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("AddToListSheetClose(screen=", this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$AddToListSheetLaunch;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToListSheetLaunch extends AddToListBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public AddToListSheetLaunch(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.k;
            this.g = "Lists Selector";
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
            return (obj instanceof AddToListSheetLaunch) && Intrinsics.c(this.e, ((AddToListSheetLaunch) obj).e);
        }

        @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("AddToListSheetLaunch(screen=", this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$NewList;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NewList extends AddToListBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public NewList(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.m;
            this.g = "New list";
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
            return (obj instanceof NewList) && Intrinsics.c(this.e, ((NewList) obj).e);
        }

        @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("NewList(screen=", this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$NewListCreated;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NewListCreated extends AddToListBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public NewListCreated(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.g0;
            this.g = "New list created";
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
            return (obj instanceof NewListCreated) && Intrinsics.c(this.e, ((NewListCreated) obj).e);
        }

        @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("NewListCreated(screen=", this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$RemoveFromList;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveFromList extends AddToListBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public RemoveFromList(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.m;
            this.g = "Remove";
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
            return (obj instanceof RemoveFromList) && Intrinsics.c(this.e, ((RemoveFromList) obj).e);
        }

        @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("RemoveFromList(screen=", this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$SaveToListButtonClick;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveToListButtonClick extends AddToListBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public SaveToListButtonClick(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.m;
            this.g = "Save to List";
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
            return (obj instanceof SaveToListButtonClick) && Intrinsics.c(this.e, ((SaveToListButtonClick) obj).e);
        }

        @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("SaveToListButtonClick(screen=", this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions$UpdateQuantitySheetLaunch;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetActions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateQuantitySheetLaunch extends AddToListBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public UpdateQuantitySheetLaunch(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.k;
            this.g = "Update quantity";
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
            return (obj instanceof UpdateQuantitySheetLaunch) && Intrinsics.c(this.e, ((UpdateQuantitySheetLaunch) obj).e);
        }

        @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("UpdateQuantitySheetLaunch(screen=", this.e, ")");
        }
    }

    public AddToListBottomSheetActions(Screen screen) {
        this.d = screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
