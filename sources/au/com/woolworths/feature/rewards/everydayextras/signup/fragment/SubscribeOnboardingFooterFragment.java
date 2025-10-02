package au.com.woolworths.feature.rewards.everydayextras.signup.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "FooterItem", "OnContentCta", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscribeOnboardingFooterFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f6200a;
    public final String b;
    public final ArrayList c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragment$FooterItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6201a;
        public final OnContentCta b;

        public FooterItem(String __typename, OnContentCta onContentCta) {
            Intrinsics.h(__typename, "__typename");
            this.f6201a = __typename;
            this.b = onContentCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterItem)) {
                return false;
            }
            FooterItem footerItem = (FooterItem) obj;
            return Intrinsics.c(this.f6201a, footerItem.f6201a) && Intrinsics.c(this.b, footerItem.b);
        }

        public final int hashCode() {
            int iHashCode = this.f6201a.hashCode() * 31;
            OnContentCta onContentCta = this.b;
            return iHashCode + (onContentCta == null ? 0 : onContentCta.hashCode());
        }

        public final String toString() {
            return "FooterItem(__typename=" + this.f6201a + ", onContentCta=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragment$OnContentCta;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnContentCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f6202a;
        public final String b;
        public final String c;

        public OnContentCta(String str, String str2, String str3) {
            this.f6202a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnContentCta)) {
                return false;
            }
            OnContentCta onContentCta = (OnContentCta) obj;
            return Intrinsics.c(this.f6202a, onContentCta.f6202a) && Intrinsics.c(this.b, onContentCta.b) && Intrinsics.c(this.c, onContentCta.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f6202a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("OnContentCta(__typename=", this.f6202a, ", label=", this.b, ", url="), this.c, ")");
        }
    }

    public SubscribeOnboardingFooterFragment(String str, String str2, ArrayList arrayList) {
        this.f6200a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeOnboardingFooterFragment)) {
            return false;
        }
        SubscribeOnboardingFooterFragment subscribeOnboardingFooterFragment = (SubscribeOnboardingFooterFragment) obj;
        return this.f6200a.equals(subscribeOnboardingFooterFragment.f6200a) && this.b.equals(subscribeOnboardingFooterFragment.b) && this.c.equals(subscribeOnboardingFooterFragment.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f6200a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return android.support.v4.media.session.a.q(")", a.v("SubscribeOnboardingFooterFragment(__typename=", this.f6200a, ", id=", this.b, ", footerItems="), this.c);
    }
}
