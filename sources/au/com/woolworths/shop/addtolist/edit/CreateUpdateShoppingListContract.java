package au.com.woolworths.shop.addtolist.edit;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract;", "", "Actions", "ViewState", "ActivityMode", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CreateUpdateShoppingListContract {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions;", "", "ShowMaxListCountReachedErrorDialog", "FinishActivity", "ShowSnackbar", "Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions$FinishActivity;", "Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions$ShowMaxListCountReachedErrorDialog;", "Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions$ShowSnackbar;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions$FinishActivity;", "Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f10121a;
            public final String b;
            public final String c;

            public FinishActivity(boolean z, String str, String str2) {
                this.f10121a = z;
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FinishActivity)) {
                    return false;
                }
                FinishActivity finishActivity = (FinishActivity) obj;
                return this.f10121a == finishActivity.f10121a && Intrinsics.c(this.b, finishActivity.b) && Intrinsics.c(this.c, finishActivity.c);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f10121a) * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return a.o(au.com.woolworths.android.onesite.a.t("FinishActivity(success=", ", listId=", this.b, ", listTitle=", this.f10121a), this.c, ")");
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions$ShowMaxListCountReachedErrorDialog;", "Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMaxListCountReachedErrorDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f10122a;
            public final ResWithArgText b;

            public ShowMaxListCountReachedErrorDialog(ResText resText, ResWithArgText resWithArgText) {
                this.f10122a = resText;
                this.b = resWithArgText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowMaxListCountReachedErrorDialog)) {
                    return false;
                }
                ShowMaxListCountReachedErrorDialog showMaxListCountReachedErrorDialog = (ShowMaxListCountReachedErrorDialog) obj;
                return this.f10122a.equals(showMaxListCountReachedErrorDialog.f10122a) && this.b.equals(showMaxListCountReachedErrorDialog.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f10122a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowMaxListCountReachedErrorDialog(title=" + this.f10122a + ", message=" + this.b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f10123a;

            public ShowSnackbar(ResText resText) {
                this.f10123a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbar) && this.f10123a.equals(((ShowSnackbar) obj).f10123a);
            }

            public final int hashCode() {
                return this.f10123a.hashCode();
            }

            public final String toString() {
                return "ShowSnackbar(text=" + this.f10123a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$ActivityMode;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivityMode {
        public static final ActivityMode d;
        public static final ActivityMode e;
        public static final ActivityMode f;
        public static final /* synthetic */ ActivityMode[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            ActivityMode activityMode = new ActivityMode("CREATE", 0);
            d = activityMode;
            ActivityMode activityMode2 = new ActivityMode("DUPLICATE", 1);
            e = activityMode2;
            ActivityMode activityMode3 = new ActivityMode("UPDATE", 2);
            f = activityMode3;
            ActivityMode[] activityModeArr = {activityMode, activityMode2, activityMode3};
            g = activityModeArr;
            h = EnumEntriesKt.a(activityModeArr);
        }

        public static ActivityMode valueOf(String str) {
            return (ActivityMode) Enum.valueOf(ActivityMode.class, str);
        }

        public static ActivityMode[] values() {
            return (ActivityMode[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$ViewState;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ActivityMode f10124a;
        public final ShoppingList b;
        public final boolean c;
        public final boolean d;

        public ViewState(ActivityMode mode, ShoppingList shoppingList, boolean z, boolean z2) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(shoppingList, "shoppingList");
            this.f10124a = mode;
            this.b = shoppingList;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10124a == viewState.f10124a && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + b.e((this.b.hashCode() + (this.f10124a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(mode=");
            sb.append(this.f10124a);
            sb.append(", shoppingList=");
            sb.append(this.b);
            sb.append(", isLoading=");
            return au.com.woolworths.android.onesite.a.q(sb, this.c, ", isValid=", this.d, ")");
        }
    }
}
