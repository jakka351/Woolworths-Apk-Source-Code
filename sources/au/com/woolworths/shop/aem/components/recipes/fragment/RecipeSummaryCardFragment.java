package au.com.woolworths.shop.aem.components.recipes.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "RecipePrepDuration", "RecipeCookDuration", "RecipeCostPerServe", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RecipeSummaryCardFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10200a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final Boolean f;
    public final RecipePrepDuration g;
    public final RecipeCookDuration h;
    public final RecipeCostPerServe i;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment$RecipeCookDuration;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecipeCookDuration {

        /* renamed from: a, reason: collision with root package name */
        public final String f10201a;
        public final String b;

        public RecipeCookDuration(String str, String str2) {
            this.f10201a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecipeCookDuration)) {
                return false;
            }
            RecipeCookDuration recipeCookDuration = (RecipeCookDuration) obj;
            return Intrinsics.c(this.f10201a, recipeCookDuration.f10201a) && Intrinsics.c(this.b, recipeCookDuration.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10201a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("RecipeCookDuration(duration=", this.f10201a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment$RecipeCostPerServe;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecipeCostPerServe {

        /* renamed from: a, reason: collision with root package name */
        public final double f10202a;

        public RecipeCostPerServe(double d) {
            this.f10202a = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecipeCostPerServe) && Double.compare(this.f10202a, ((RecipeCostPerServe) obj).f10202a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f10202a);
        }

        public final String toString() {
            return "RecipeCostPerServe(recipeCostPerServePrice=" + this.f10202a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment$RecipePrepDuration;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecipePrepDuration {

        /* renamed from: a, reason: collision with root package name */
        public final String f10203a;
        public final String b;

        public RecipePrepDuration(String str, String str2) {
            this.f10203a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecipePrepDuration)) {
                return false;
            }
            RecipePrepDuration recipePrepDuration = (RecipePrepDuration) obj;
            return Intrinsics.c(this.f10203a, recipePrepDuration.f10203a) && Intrinsics.c(this.b, recipePrepDuration.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10203a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("RecipePrepDuration(duration=", this.f10203a, ", altText=", this.b, ")");
        }
    }

    public RecipeSummaryCardFragment(String str, String str2, String str3, List list, String str4, Boolean bool, RecipePrepDuration recipePrepDuration, RecipeCookDuration recipeCookDuration, RecipeCostPerServe recipeCostPerServe) {
        this.f10200a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = bool;
        this.g = recipePrepDuration;
        this.h = recipeCookDuration;
        this.i = recipeCostPerServe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeSummaryCardFragment)) {
            return false;
        }
        RecipeSummaryCardFragment recipeSummaryCardFragment = (RecipeSummaryCardFragment) obj;
        return Intrinsics.c(this.f10200a, recipeSummaryCardFragment.f10200a) && Intrinsics.c(this.b, recipeSummaryCardFragment.b) && Intrinsics.c(this.c, recipeSummaryCardFragment.c) && Intrinsics.c(this.d, recipeSummaryCardFragment.d) && Intrinsics.c(this.e, recipeSummaryCardFragment.e) && Intrinsics.c(this.f, recipeSummaryCardFragment.f) && Intrinsics.c(this.g, recipeSummaryCardFragment.g) && Intrinsics.c(this.h, recipeSummaryCardFragment.h) && Intrinsics.c(this.i, recipeSummaryCardFragment.i);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f10200a.hashCode() * 31, 31, this.b), 31, this.c);
        List list = this.d;
        int iC2 = b.c((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
        Boolean bool = this.f;
        int iHashCode = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
        RecipePrepDuration recipePrepDuration = this.g;
        int iHashCode2 = (iHashCode + (recipePrepDuration == null ? 0 : recipePrepDuration.hashCode())) * 31;
        RecipeCookDuration recipeCookDuration = this.h;
        int iHashCode3 = (iHashCode2 + (recipeCookDuration == null ? 0 : recipeCookDuration.hashCode())) * 31;
        RecipeCostPerServe recipeCostPerServe = this.i;
        return iHashCode3 + (recipeCostPerServe != null ? Double.hashCode(recipeCostPerServe.f10202a) : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RecipeSummaryCardFragment(title=", this.f10200a, ", image=", this.b, ", id=");
        au.com.woolworths.android.onesite.a.B(sbV, this.c, ", tags=", this.d, ", sourceName=");
        au.com.woolworths.android.onesite.a.A(sbV, this.e, ", isVideoAvailable=", this.f, ", recipePrepDuration=");
        sbV.append(this.g);
        sbV.append(", recipeCookDuration=");
        sbV.append(this.h);
        sbV.append(", recipeCostPerServe=");
        sbV.append(this.i);
        sbV.append(")");
        return sbV.toString();
    }
}
