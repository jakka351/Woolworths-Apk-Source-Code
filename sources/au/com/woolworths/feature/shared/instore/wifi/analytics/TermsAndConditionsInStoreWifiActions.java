package au.com.woolworths.feature.shared.instore.wifi.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/TermsAndConditionsInStoreWifiActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TermsAndConditionsInStoreWifiActions implements Action {
    public static final TermsAndConditionsInStoreWifiActions e;
    public static final TermsAndConditionsInStoreWifiActions f;
    public static final TermsAndConditionsInStoreWifiActions g;
    public static final TermsAndConditionsInStoreWifiActions h;
    public static final TermsAndConditionsInStoreWifiActions i;
    public static final TermsAndConditionsInStoreWifiActions j;
    public static final TermsAndConditionsInStoreWifiActions k;
    public static final /* synthetic */ TermsAndConditionsInStoreWifiActions[] l;
    public static final /* synthetic */ EnumEntries m;
    public final Screen d = WifiScreens.f;

    static {
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions = new TermsAndConditionsInStoreWifiActions() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions.TOGGLE_ACCEPT_TERMS_AND_CONDITION_CLICK_ON
            public final Category n = Category.m;
            public final String o = "Terms & Conditions and Privacy Policy - On";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        e = termsAndConditionsInStoreWifiActions;
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions2 = new TermsAndConditionsInStoreWifiActions() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions.TOGGLE_ACCEPT_TERMS_AND_CONDITION_CLICK_OFF
            public final Category n = Category.m;
            public final String o = "Terms & Conditions and Privacy Policy - Off";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        f = termsAndConditionsInStoreWifiActions2;
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions3 = new TermsAndConditionsInStoreWifiActions() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions.TERMS_AND_CONDITIONS_LINK_CLICK
            public final Category n = Category.D;
            public final String o = "terms & conditions";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        g = termsAndConditionsInStoreWifiActions3;
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions4 = new TermsAndConditionsInStoreWifiActions() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions.WEBSITE_LINK_CLICK
            public final Category n = Category.D;
            public final String o = "website";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions5 = new TermsAndConditionsInStoreWifiActions() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions.PRIVACY_POLICY_LINK_CLICK
            public final Category n = Category.D;
            public final String o = "privacy policy";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        h = termsAndConditionsInStoreWifiActions5;
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions6 = new TermsAndConditionsInStoreWifiActions() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions.COLLECTION_NOTICE_LINK_CLICK
            public final Category n = Category.D;
            public final String o = "collection notice";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        i = termsAndConditionsInStoreWifiActions6;
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions7 = new TermsAndConditionsInStoreWifiActions() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions.CONTINUE_CLICK
            public final Category n = Category.m;
            public final String o = "Continue";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        j = termsAndConditionsInStoreWifiActions7;
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions8 = new TermsAndConditionsInStoreWifiActions() { // from class: au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions.SETUP_COMPLETE_ERROR_IMPRESSION
            public final Category n = Category.v;
            public final String o = "Something went wrong. Please try again.";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        k = termsAndConditionsInStoreWifiActions8;
        TermsAndConditionsInStoreWifiActions[] termsAndConditionsInStoreWifiActionsArr = {termsAndConditionsInStoreWifiActions, termsAndConditionsInStoreWifiActions2, termsAndConditionsInStoreWifiActions3, termsAndConditionsInStoreWifiActions4, termsAndConditionsInStoreWifiActions5, termsAndConditionsInStoreWifiActions6, termsAndConditionsInStoreWifiActions7, termsAndConditionsInStoreWifiActions8};
        l = termsAndConditionsInStoreWifiActionsArr;
        m = EnumEntriesKt.a(termsAndConditionsInStoreWifiActionsArr);
    }

    public TermsAndConditionsInStoreWifiActions(String str, int i2) {
    }

    public static TermsAndConditionsInStoreWifiActions valueOf(String str) {
        return (TermsAndConditionsInStoreWifiActions) Enum.valueOf(TermsAndConditionsInStoreWifiActions.class, str);
    }

    public static TermsAndConditionsInStoreWifiActions[] values() {
        return (TermsAndConditionsInStoreWifiActions[]) l.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
