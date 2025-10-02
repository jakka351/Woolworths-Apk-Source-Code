package com.woolworths.shop.modeselector.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ButtonFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Analytics", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ButtonFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23348a;
    public final ButtonStyle b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Analytics h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ButtonFragment$Analytics;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23349a;

        public Analytics(String str) {
            this.f23349a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f23349a, ((Analytics) obj).f23349a);
        }

        public final int hashCode() {
            String str = this.f23349a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("Analytics(label=", this.f23349a, ")");
        }
    }

    public ButtonFragment(String str, ButtonStyle buttonStyle, boolean z, String str2, String str3, String str4, String str5, Analytics analytics) {
        this.f23348a = str;
        this.b = buttonStyle;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = analytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonFragment)) {
            return false;
        }
        ButtonFragment buttonFragment = (ButtonFragment) obj;
        return Intrinsics.c(this.f23348a, buttonFragment.f23348a) && this.b == buttonFragment.b && this.c == buttonFragment.c && Intrinsics.c(this.d, buttonFragment.d) && Intrinsics.c(this.e, buttonFragment.e) && Intrinsics.c(this.f, buttonFragment.f) && Intrinsics.c(this.g, buttonFragment.g) && Intrinsics.c(this.h, buttonFragment.h);
    }

    public final int hashCode() {
        int iHashCode = this.f23348a.hashCode() * 31;
        ButtonStyle buttonStyle = this.b;
        int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Analytics analytics = this.h;
        return iHashCode5 + (analytics != null ? analytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("ButtonFragment(label=", this.f23348a, ", style=", this.b, ", enabled=");
        au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
        androidx.constraintlayout.core.state.a.B(sbQ, this.e, ", iconUrl=", this.f, ", altText=");
        sbQ.append(this.g);
        sbQ.append(", analytics=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
