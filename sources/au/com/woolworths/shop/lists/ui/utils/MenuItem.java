package au.com.woolworths.shop.lists.ui.utils;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.ui.lists.menu.ListAction;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/MenuItem;", "", "AddAllToCart", "Edit", "Duplicate", "Delete", "RemoveAll", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem$AddAllToCart;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem$Delete;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem$Duplicate;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem$Edit;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem$RemoveAll;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MenuItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f12488a;
    public final int b;
    public final ListAction c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/MenuItem$AddAllToCart;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddAllToCart extends MenuItem {
        public final int d;
        public final int e;
        public final ListAction f;
        public final boolean g;

        /* JADX WARN: Illegal instructions before constructor call */
        public AddAllToCart(boolean z) {
            ListAction listAction = ListAction.g;
            super(R.drawable.ic_shop_lists_trolley_menu, R.string.shop_lists_more_add_all_to_cart, listAction);
            this.d = R.drawable.ic_shop_lists_trolley_menu;
            this.e = R.string.shop_lists_more_add_all_to_cart;
            this.f = listAction;
            this.g = z;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: a, reason: from getter */
        public final ListAction getC() {
            return this.f;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: b, reason: from getter */
        public final int getF12488a() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: c, reason: from getter */
        public final int getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddAllToCart)) {
                return false;
            }
            AddAllToCart addAllToCart = (AddAllToCart) obj;
            return this.d == addAllToCart.d && this.e == addAllToCart.e && this.f == addAllToCart.f && this.g == addAllToCart.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + b.a(this.e, Integer.hashCode(this.d) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = YU.a.q(this.d, this.e, "AddAllToCart(iconResId=", ", titleResId=", ", action=");
            sbQ.append(this.f);
            sbQ.append(", enabled=");
            sbQ.append(this.g);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/MenuItem$Delete;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Delete extends MenuItem {
        public final int d;
        public final int e;
        public final ListAction f;
        public final boolean g;

        /* JADX WARN: Illegal instructions before constructor call */
        public Delete(boolean z) {
            ListAction listAction = ListAction.f;
            super(R.drawable.ic_shop_lists_delete_menu_item, R.string.shop_lists_menu_delete, listAction);
            this.d = R.drawable.ic_shop_lists_delete_menu_item;
            this.e = R.string.shop_lists_menu_delete;
            this.f = listAction;
            this.g = z;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: a, reason: from getter */
        public final ListAction getC() {
            return this.f;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: b, reason: from getter */
        public final int getF12488a() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: c, reason: from getter */
        public final int getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Delete)) {
                return false;
            }
            Delete delete = (Delete) obj;
            return this.d == delete.d && this.e == delete.e && this.f == delete.f && this.g == delete.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + b.a(this.e, Integer.hashCode(this.d) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = YU.a.q(this.d, this.e, "Delete(iconResId=", ", titleResId=", ", action=");
            sbQ.append(this.f);
            sbQ.append(", enabled=");
            sbQ.append(this.g);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/MenuItem$Duplicate;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Duplicate extends MenuItem {
        public final int d;
        public final int e;
        public final ListAction f;

        /* JADX WARN: Illegal instructions before constructor call */
        public Duplicate() {
            ListAction listAction = ListAction.e;
            super(R.drawable.ic_shop_lists_duplicate, R.string.shop_lists_menu_duplicate, listAction);
            this.d = R.drawable.ic_shop_lists_duplicate;
            this.e = R.string.shop_lists_menu_duplicate;
            this.f = listAction;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: a, reason: from getter */
        public final ListAction getC() {
            return this.f;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: b, reason: from getter */
        public final int getF12488a() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: c, reason: from getter */
        public final int getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Duplicate)) {
                return false;
            }
            Duplicate duplicate = (Duplicate) obj;
            return this.d == duplicate.d && this.e == duplicate.e && this.f == duplicate.f;
        }

        public final int hashCode() {
            return this.f.hashCode() + b.a(this.e, Integer.hashCode(this.d) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbQ = YU.a.q(this.d, this.e, "Duplicate(iconResId=", ", titleResId=", ", action=");
            sbQ.append(this.f);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/MenuItem$Edit;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Edit extends MenuItem {
        public final int d;
        public final int e;
        public final ListAction f;

        /* JADX WARN: Illegal instructions before constructor call */
        public Edit() {
            ListAction listAction = ListAction.d;
            super(R.drawable.ic_shop_lists_edit, R.string.shop_lists_menu_edit, listAction);
            this.d = R.drawable.ic_shop_lists_edit;
            this.e = R.string.shop_lists_menu_edit;
            this.f = listAction;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: a, reason: from getter */
        public final ListAction getC() {
            return this.f;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: b, reason: from getter */
        public final int getF12488a() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: c, reason: from getter */
        public final int getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj;
            return this.d == edit.d && this.e == edit.e && this.f == edit.f;
        }

        public final int hashCode() {
            return this.f.hashCode() + b.a(this.e, Integer.hashCode(this.d) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbQ = YU.a.q(this.d, this.e, "Edit(iconResId=", ", titleResId=", ", action=");
            sbQ.append(this.f);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/MenuItem$RemoveAll;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItem;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveAll extends MenuItem {
        public final int d;
        public final int e;
        public final ListAction f;
        public final boolean g;

        /* JADX WARN: Illegal instructions before constructor call */
        public RemoveAll(boolean z) {
            ListAction listAction = ListAction.h;
            super(R.drawable.ic_shop_lists_remove_all, R.string.shop_lists_more_remove_all_items, listAction);
            this.d = R.drawable.ic_shop_lists_remove_all;
            this.e = R.string.shop_lists_more_remove_all_items;
            this.f = listAction;
            this.g = z;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: a, reason: from getter */
        public final ListAction getC() {
            return this.f;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: b, reason: from getter */
        public final int getF12488a() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.lists.ui.utils.MenuItem
        /* renamed from: c, reason: from getter */
        public final int getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveAll)) {
                return false;
            }
            RemoveAll removeAll = (RemoveAll) obj;
            return this.d == removeAll.d && this.e == removeAll.e && this.f == removeAll.f && this.g == removeAll.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + b.a(this.e, Integer.hashCode(this.d) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = YU.a.q(this.d, this.e, "RemoveAll(iconResId=", ", titleResId=", ", action=");
            sbQ.append(this.f);
            sbQ.append(", enabled=");
            sbQ.append(this.g);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    public MenuItem(int i, int i2, ListAction listAction) {
        this.f12488a = i;
        this.b = i2;
        this.c = listAction;
    }

    /* renamed from: a, reason: from getter */
    public ListAction getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public int getF12488a() {
        return this.f12488a;
    }

    /* renamed from: c, reason: from getter */
    public int getB() {
        return this.b;
    }
}
