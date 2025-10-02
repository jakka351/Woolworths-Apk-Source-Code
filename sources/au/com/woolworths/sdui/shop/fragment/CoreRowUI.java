package au.com.woolworths.sdui.shop.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUI;", "Lcom/apollographql/apollo/api/Fragment$Data;", "LeadingAsset", "TrailingAsset", "OnHostedIcon", "OnCoreIcon", "OnHostedIcon1", "OnCoreIcon1", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreRowUI implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10044a;
    public final LeadingAsset b;
    public final String c;
    public final String d;
    public final TrailingAsset e;
    public final String f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$LeadingAsset;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f10045a;
        public final OnHostedIcon b;
        public final OnCoreIcon c;

        public LeadingAsset(String __typename, OnHostedIcon onHostedIcon, OnCoreIcon onCoreIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f10045a = __typename;
            this.b = onHostedIcon;
            this.c = onCoreIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset)) {
                return false;
            }
            LeadingAsset leadingAsset = (LeadingAsset) obj;
            return Intrinsics.c(this.f10045a, leadingAsset.f10045a) && Intrinsics.c(this.b, leadingAsset.b) && Intrinsics.c(this.c, leadingAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f10045a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.f10048a.hashCode())) * 31;
            OnCoreIcon onCoreIcon = this.c;
            return iHashCode2 + (onCoreIcon != null ? onCoreIcon.f10046a.hashCode() : 0);
        }

        public final String toString() {
            return "LeadingAsset(__typename=" + this.f10045a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$OnCoreIcon;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f10046a;

        public OnCoreIcon(String str) {
            this.f10046a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon) && Intrinsics.c(this.f10046a, ((OnCoreIcon) obj).f10046a);
        }

        public final int hashCode() {
            return this.f10046a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon(coreIconName=", this.f10046a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$OnCoreIcon1;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10047a;

        public OnCoreIcon1(String str) {
            this.f10047a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon1) && Intrinsics.c(this.f10047a, ((OnCoreIcon1) obj).f10047a);
        }

        public final int hashCode() {
            return this.f10047a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon1(coreIconName=", this.f10047a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$OnHostedIcon;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f10048a;

        public OnHostedIcon(String str) {
            this.f10048a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f10048a, ((OnHostedIcon) obj).f10048a);
        }

        public final int hashCode() {
            return this.f10048a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f10048a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$OnHostedIcon1;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10049a;

        public OnHostedIcon1(String str) {
            this.f10049a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon1) && Intrinsics.c(this.f10049a, ((OnHostedIcon1) obj).f10049a);
        }

        public final int hashCode() {
            return this.f10049a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon1(url=", this.f10049a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$TrailingAsset;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrailingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f10050a;
        public final OnHostedIcon1 b;
        public final OnCoreIcon1 c;

        public TrailingAsset(String __typename, OnHostedIcon1 onHostedIcon1, OnCoreIcon1 onCoreIcon1) {
            Intrinsics.h(__typename, "__typename");
            this.f10050a = __typename;
            this.b = onHostedIcon1;
            this.c = onCoreIcon1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrailingAsset)) {
                return false;
            }
            TrailingAsset trailingAsset = (TrailingAsset) obj;
            return Intrinsics.c(this.f10050a, trailingAsset.f10050a) && Intrinsics.c(this.b, trailingAsset.b) && Intrinsics.c(this.c, trailingAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f10050a.hashCode() * 31;
            OnHostedIcon1 onHostedIcon1 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon1 == null ? 0 : onHostedIcon1.f10049a.hashCode())) * 31;
            OnCoreIcon1 onCoreIcon1 = this.c;
            return iHashCode2 + (onCoreIcon1 != null ? onCoreIcon1.f10047a.hashCode() : 0);
        }

        public final String toString() {
            return "TrailingAsset(__typename=" + this.f10050a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    public CoreRowUI(String str, LeadingAsset leadingAsset, String str2, String str3, TrailingAsset trailingAsset, String str4) {
        this.f10044a = str;
        this.b = leadingAsset;
        this.c = str2;
        this.d = str3;
        this.e = trailingAsset;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreRowUI)) {
            return false;
        }
        CoreRowUI coreRowUI = (CoreRowUI) obj;
        return Intrinsics.c(this.f10044a, coreRowUI.f10044a) && Intrinsics.c(this.b, coreRowUI.b) && Intrinsics.c(this.c, coreRowUI.c) && Intrinsics.c(this.d, coreRowUI.d) && Intrinsics.c(this.e, coreRowUI.e) && Intrinsics.c(this.f, coreRowUI.f);
    }

    public final int hashCode() {
        String str = this.f10044a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LeadingAsset leadingAsset = this.b;
        int iHashCode2 = (iHashCode + (leadingAsset == null ? 0 : leadingAsset.hashCode())) * 31;
        String str2 = this.c;
        int iC = b.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        TrailingAsset trailingAsset = this.e;
        int iHashCode3 = (iC + (trailingAsset == null ? 0 : trailingAsset.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreRowUI(overlineText=");
        sb.append(this.f10044a);
        sb.append(", leadingAsset=");
        sb.append(this.b);
        sb.append(", description=");
        androidx.constraintlayout.core.state.a.B(sb, this.c, ", label=", this.d, ", trailingAsset=");
        sb.append(this.e);
        sb.append(", trailingText=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
