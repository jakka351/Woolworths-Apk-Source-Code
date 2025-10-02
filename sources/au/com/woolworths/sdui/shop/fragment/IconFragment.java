package au.com.woolworths.sdui.shop.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/IconFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "OnHostedIcon", "OnCoreIcon", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IconFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10074a;
    public final OnHostedIcon b;
    public final OnCoreIcon c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/IconFragment$OnCoreIcon;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f10075a;
        public final String b;

        public OnCoreIcon(String str, String str2) {
            this.f10075a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCoreIcon)) {
                return false;
            }
            OnCoreIcon onCoreIcon = (OnCoreIcon) obj;
            return Intrinsics.c(this.f10075a, onCoreIcon.f10075a) && Intrinsics.c(this.b, onCoreIcon.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10075a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnCoreIcon(__typename=", this.f10075a, ", coreIconName=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/IconFragment$OnHostedIcon;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f10076a;
        public final String b;

        public OnHostedIcon(String str, String str2) {
            this.f10076a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHostedIcon)) {
                return false;
            }
            OnHostedIcon onHostedIcon = (OnHostedIcon) obj;
            return Intrinsics.c(this.f10076a, onHostedIcon.f10076a) && Intrinsics.c(this.b, onHostedIcon.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10076a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnHostedIcon(__typename=", this.f10076a, ", url=", this.b, ")");
        }
    }

    public IconFragment(String __typename, OnHostedIcon onHostedIcon, OnCoreIcon onCoreIcon) {
        Intrinsics.h(__typename, "__typename");
        this.f10074a = __typename;
        this.b = onHostedIcon;
        this.c = onCoreIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconFragment)) {
            return false;
        }
        IconFragment iconFragment = (IconFragment) obj;
        return Intrinsics.c(this.f10074a, iconFragment.f10074a) && Intrinsics.c(this.b, iconFragment.b) && Intrinsics.c(this.c, iconFragment.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10074a.hashCode() * 31;
        OnHostedIcon onHostedIcon = this.b;
        int iHashCode2 = (iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.hashCode())) * 31;
        OnCoreIcon onCoreIcon = this.c;
        return iHashCode2 + (onCoreIcon != null ? onCoreIcon.hashCode() : 0);
    }

    public final String toString() {
        return "IconFragment(__typename=" + this.f10074a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
    }
}
