package au.com.woolworths.feature.shop.myorders.editdriverinstruction.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/analytics/EditDriverInstructionsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EditDriverInstructionsActions implements Action {
    public static final EditDriverInstructionsActions e;
    public static final EditDriverInstructionsActions f;
    public static final EditDriverInstructionsActions g;
    public static final EditDriverInstructionsActions h;
    public static final /* synthetic */ EditDriverInstructionsActions[] i;
    public static final /* synthetic */ EnumEntries j;
    public final MyOrdersScreens d = MyOrdersScreens.h;

    static {
        EditDriverInstructionsActions editDriverInstructionsActions = new EditDriverInstructionsActions() { // from class: au.com.woolworths.feature.shop.myorders.editdriverinstruction.analytics.EditDriverInstructionsActions.CANCEL_DRIVER_INSTRUCTIONS_CLICK
            public final Category k = Category.m;
            public final String l = "Edit Driver Instruction - Cancel";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        e = editDriverInstructionsActions;
        EditDriverInstructionsActions editDriverInstructionsActions2 = new EditDriverInstructionsActions() { // from class: au.com.woolworths.feature.shop.myorders.editdriverinstruction.analytics.EditDriverInstructionsActions.EDIT_DRIVER_INSTRUCTIONS_NETWORK_ERROR
            public final Category k = Category.v;
            public final String l = "Edit Driver Instruction - Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        f = editDriverInstructionsActions2;
        EditDriverInstructionsActions editDriverInstructionsActions3 = new EditDriverInstructionsActions() { // from class: au.com.woolworths.feature.shop.myorders.editdriverinstruction.analytics.EditDriverInstructionsActions.EDIT_DRIVER_INSTRUCTIONS_SERVER_ERROR
            public final Category k = Category.v;
            public final String l = "Edit Driver Instruction - Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        g = editDriverInstructionsActions3;
        EditDriverInstructionsActions editDriverInstructionsActions4 = new EditDriverInstructionsActions() { // from class: au.com.woolworths.feature.shop.myorders.editdriverinstruction.analytics.EditDriverInstructionsActions.SAVE_DRIVER_INSTRUCTIONS_CLICK
            public final Category k = Category.m;
            public final String l = "Edit Driver Instruction - Save";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        h = editDriverInstructionsActions4;
        EditDriverInstructionsActions[] editDriverInstructionsActionsArr = {editDriverInstructionsActions, editDriverInstructionsActions2, editDriverInstructionsActions3, editDriverInstructionsActions4};
        i = editDriverInstructionsActionsArr;
        j = EnumEntriesKt.a(editDriverInstructionsActionsArr);
    }

    public EditDriverInstructionsActions(String str, int i2) {
    }

    public static EditDriverInstructionsActions valueOf(String str) {
        return (EditDriverInstructionsActions) Enum.valueOf(EditDriverInstructionsActions.class, str);
    }

    public static EditDriverInstructionsActions[] values() {
        return (EditDriverInstructionsActions[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
