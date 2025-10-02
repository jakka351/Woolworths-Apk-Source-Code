package au.com.woolworths.shop.onboarding.sdui.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ButtonAction", "Analytics", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OnboardingCtaFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f12529a;
    public final String b;
    public final ButtonStyle c;
    public final boolean d;
    public final ButtonAction e;
    public final String f;
    public final String g;
    public final Analytics h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragment$Analytics;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f12530a;

        public Analytics(String str) {
            this.f12530a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f12530a, ((Analytics) obj).f12530a);
        }

        public final int hashCode() {
            String str = this.f12530a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("Analytics(label=", this.f12530a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragment$ButtonAction;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f12531a;
        public final String b;
        public final String c;

        public ButtonAction(ActionType actionType, String str, String str2) {
            this.f12531a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return this.f12531a == buttonAction.f12531a && Intrinsics.c(this.b, buttonAction.b) && Intrinsics.c(this.c, buttonAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f12531a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("ButtonAction(type=", this.f12531a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    public OnboardingCtaFragment(String str, String str2, ButtonStyle buttonStyle, boolean z, ButtonAction buttonAction, String str3, String str4, Analytics analytics) {
        this.f12529a = str;
        this.b = str2;
        this.c = buttonStyle;
        this.d = z;
        this.e = buttonAction;
        this.f = str3;
        this.g = str4;
        this.h = analytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingCtaFragment)) {
            return false;
        }
        OnboardingCtaFragment onboardingCtaFragment = (OnboardingCtaFragment) obj;
        return Intrinsics.c(this.f12529a, onboardingCtaFragment.f12529a) && Intrinsics.c(this.b, onboardingCtaFragment.b) && this.c == onboardingCtaFragment.c && this.d == onboardingCtaFragment.d && Intrinsics.c(this.e, onboardingCtaFragment.e) && Intrinsics.c(this.f, onboardingCtaFragment.f) && Intrinsics.c(this.g, onboardingCtaFragment.g) && Intrinsics.c(this.h, onboardingCtaFragment.h);
    }

    public final int hashCode() {
        String str = this.f12529a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        ButtonStyle buttonStyle = this.c;
        int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.d);
        ButtonAction buttonAction = this.e;
        int iHashCode = (iE + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Analytics analytics = this.h;
        return iHashCode3 + (analytics != null ? analytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OnboardingCtaFragment(buttonId=", this.f12529a, ", label=", this.b, ", style=");
        sbV.append(this.c);
        sbV.append(", enabled=");
        sbV.append(this.d);
        sbV.append(", buttonAction=");
        sbV.append(this.e);
        sbV.append(", iconUrl=");
        sbV.append(this.f);
        sbV.append(", altText=");
        sbV.append(this.g);
        sbV.append(", analytics=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }
}
