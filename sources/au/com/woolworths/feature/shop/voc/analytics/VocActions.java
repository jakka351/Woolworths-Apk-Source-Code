package au.com.woolworths.feature.shop.voc.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/voc/analytics/VocActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class VocActions implements Action {
    public static final VocActions e;
    public static final VocActions f;
    public static final VocActions g;
    public static final VocActions h;
    public static final VocActions i;
    public static final VocActions j;
    public static final /* synthetic */ VocActions[] k;
    public static final /* synthetic */ EnumEntries l;
    public final Screen d = Screens.O;

    static {
        VocActions vocActions = new VocActions() { // from class: au.com.woolworths.feature.shop.voc.analytics.VocActions.DISMISS_NPS
            public final Category m = Category.m;
            public final String n = "Cancel NPS scale survey";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        e = vocActions;
        VocActions vocActions2 = new VocActions() { // from class: au.com.woolworths.feature.shop.voc.analytics.VocActions.DISMISS_STARS
            public final Category m = Category.m;
            public final String n = "Cancel 5 pointer survey";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        f = vocActions2;
        VocActions vocActions3 = new VocActions() { // from class: au.com.woolworths.feature.shop.voc.analytics.VocActions.IMPRESSION_FIVE_STAR
            public final Category m = Category.j0;
            public final String n = "5 pointer rating";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        g = vocActions3;
        VocActions vocActions4 = new VocActions() { // from class: au.com.woolworths.feature.shop.voc.analytics.VocActions.IMPRESSION_NPS
            public final Category m = Category.j0;
            public final String n = "NPS rating";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        h = vocActions4;
        VocActions vocActions5 = new VocActions() { // from class: au.com.woolworths.feature.shop.voc.analytics.VocActions.PICK_SCORE_NPS
            public final Category m = Category.m;
            public final String n = "NPS rating";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        i = vocActions5;
        VocActions vocActions6 = new VocActions() { // from class: au.com.woolworths.feature.shop.voc.analytics.VocActions.PICK_SCORE_STARS
            public final Category m = Category.m;
            public final String n = "5 pointer rating";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        j = vocActions6;
        VocActions[] vocActionsArr = {vocActions, vocActions2, vocActions3, vocActions4, vocActions5, vocActions6};
        k = vocActionsArr;
        l = EnumEntriesKt.a(vocActionsArr);
    }

    public VocActions(String str, int i2) {
    }

    public static VocActions valueOf(String str) {
        return (VocActions) Enum.valueOf(VocActions.class, str);
    }

    public static VocActions[] values() {
        return (VocActions[]) k.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action, au.com.woolworths.android.onesite.analytics.BaseAction
    public final HashMap l() {
        HashMap mapL = super.l();
        mapL.putAll(this.d.l());
        return mapL;
    }
}
