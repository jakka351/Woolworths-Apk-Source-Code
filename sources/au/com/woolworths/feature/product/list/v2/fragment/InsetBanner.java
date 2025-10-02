package au.com.woolworths.feature.product.list.v2.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/fragment/InsetBanner;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Action", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InsetBanner implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final InsetBannerDisplayType f5630a;
    public final String b;
    public final String c;
    public final String d;
    public final Action e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/fragment/InsetBanner$Action;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f5631a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f5631a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f5631a == action.f5631a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f5631a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f5631a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    public InsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
        this.f5630a = insetBannerDisplayType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetBanner)) {
            return false;
        }
        InsetBanner insetBanner = (InsetBanner) obj;
        return this.f5630a == insetBanner.f5630a && Intrinsics.c(this.b, insetBanner.b) && Intrinsics.c(this.c, insetBanner.c) && Intrinsics.c(this.d, insetBanner.d) && Intrinsics.c(this.e, insetBanner.e);
    }

    public final int hashCode() {
        int iC = b.c(this.f5630a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.e;
        return iHashCode2 + (action != null ? action.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbU = d.u("InsetBanner(displayType=", this.f5630a, ", message=", this.b, ", bannerTitle=");
        a.B(sbU, this.c, ", iconUrl=", this.d, ", action=");
        sbU.append(this.e);
        sbU.append(")");
        return sbU.toString();
    }
}
