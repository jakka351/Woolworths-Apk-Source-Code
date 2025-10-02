package com.woolworths.scanlibrary.ui.onboarding;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPagerAdapter;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPageTemplateData;", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter$BasePageState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OnBoardingPageTemplateData implements OnBoardingPagerAdapter.BasePageState {

    /* renamed from: a, reason: collision with root package name */
    public final int f21283a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final OnBoardingPagerAdapter.PageStateType h;
    public final OnBoardingPagerAdapter.PageStateType i;

    public OnBoardingPageTemplateData(int i, int i2, int i3, int i4, int i5) {
        OnBoardingPagerAdapter.PageStateType pageStateType = OnBoardingPagerAdapter.PageStateType.d;
        boolean z = (i5 & 32) == 0;
        boolean z2 = (i5 & 64) == 0;
        this.f21283a = R.color.sng_on_boarding_bg_color;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z;
        this.g = z2;
        this.h = pageStateType;
        this.i = pageStateType;
    }

    @Override // com.woolworths.scanlibrary.ui.onboarding.OnBoardingPagerAdapter.BasePageState
    /* renamed from: a, reason: from getter */
    public final OnBoardingPagerAdapter.PageStateType getI() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnBoardingPageTemplateData)) {
            return false;
        }
        OnBoardingPageTemplateData onBoardingPageTemplateData = (OnBoardingPageTemplateData) obj;
        return this.f21283a == onBoardingPageTemplateData.f21283a && this.b == onBoardingPageTemplateData.b && this.c == onBoardingPageTemplateData.c && this.d == onBoardingPageTemplateData.d && this.e == onBoardingPageTemplateData.e && this.f == onBoardingPageTemplateData.f && this.g == onBoardingPageTemplateData.g && this.h == onBoardingPageTemplateData.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + b.e(b.e(b.a(this.e, b.a(this.d, b.a(this.c, b.a(this.b, Integer.hashCode(this.f21283a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = YU.a.q(this.f21283a, this.b, "OnBoardingPageTemplateData(backgroundColorRes=", ", imageRes=", ", titleTextRes=");
        YU.a.w(this.c, this.d, ", bodyTextRes=", ", analyticText=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", showCta=");
        sbQ.append(this.f);
        sbQ.append(", showPaymentOptions=");
        sbQ.append(this.g);
        sbQ.append(", pageTemplate=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
