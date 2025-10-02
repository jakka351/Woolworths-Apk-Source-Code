package au.com.woolworths.feature.shop.ask.olive.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/analytics/AskOliveActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AskOliveActions implements Action {
    public static final AskOliveActions e;
    public static final AskOliveActions f;
    public static final AskOliveActions g;
    public static final AskOliveActions h;
    public static final /* synthetic */ AskOliveActions[] i;
    public static final /* synthetic */ EnumEntries j;
    public final AskOliveActions$screen$1 d = new AskOliveActions$screen$1();

    static {
        AskOliveActions askOliveActions = new AskOliveActions() { // from class: au.com.woolworths.feature.shop.ask.olive.analytics.AskOliveActions.LEAVE_CHAT_CONFIRMATION_DIALOG_LOADED
            public final Category k = Category.u;
            public final String l = "Confirm Leave Chat";

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
        e = askOliveActions;
        AskOliveActions askOliveActions2 = new AskOliveActions() { // from class: au.com.woolworths.feature.shop.ask.olive.analytics.AskOliveActions.CHAT_BACK_BUTTON_CLICK
            public final Category k = Category.m;
            public final String l = "Close";

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
        f = askOliveActions2;
        AskOliveActions askOliveActions3 = new AskOliveActions() { // from class: au.com.woolworths.feature.shop.ask.olive.analytics.AskOliveActions.CHAT_CONFIRMATION_DIALOG_CANCEL
            public final Category k = Category.m;
            public final String l = "Cancel - Leave Chat";

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
        g = askOliveActions3;
        AskOliveActions askOliveActions4 = new AskOliveActions() { // from class: au.com.woolworths.feature.shop.ask.olive.analytics.AskOliveActions.CHAT_CONFIRMATION_DIALOG_YES
            public final Category k = Category.m;
            public final String l = "Confirm - Leave Chat";

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
        h = askOliveActions4;
        AskOliveActions[] askOliveActionsArr = {askOliveActions, askOliveActions2, askOliveActions3, askOliveActions4};
        i = askOliveActionsArr;
        j = EnumEntriesKt.a(askOliveActionsArr);
    }

    public AskOliveActions(String str, int i2) {
    }

    public static AskOliveActions valueOf(String str) {
        return (AskOliveActions) Enum.valueOf(AskOliveActions.class, str);
    }

    public static AskOliveActions[] values() {
        return (AskOliveActions[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
