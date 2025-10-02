package com.woolworths.rewards.offers.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/IconAsset;", "Lcom/apollographql/apollo/api/Fragment$Data;", "OnLocalAsset", "OnHostedIcon", "OnCoreIcon", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class IconAsset implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f20886a;
    public final OnLocalAsset b;
    public final OnHostedIcon c;
    public final OnCoreIcon d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/IconAsset$OnCoreIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20887a;
        public final String b;

        public OnCoreIcon(String str, String str2) {
            this.f20887a = str;
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
            return Intrinsics.c(this.f20887a, onCoreIcon.f20887a) && Intrinsics.c(this.b, onCoreIcon.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20887a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("OnCoreIcon(coreIconName=", this.f20887a, ", coreWebIconName=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/IconAsset$OnHostedIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20888a;

        public OnHostedIcon(String str) {
            this.f20888a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f20888a, ((OnHostedIcon) obj).f20888a);
        }

        public final int hashCode() {
            return this.f20888a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f20888a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/IconAsset$OnLocalAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLocalAsset {

        /* renamed from: a, reason: collision with root package name */
        public final LocalAssetIconName f20889a;

        public OnLocalAsset(LocalAssetIconName localAssetIconName) {
            this.f20889a = localAssetIconName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLocalAsset) && this.f20889a == ((OnLocalAsset) obj).f20889a;
        }

        public final int hashCode() {
            return this.f20889a.hashCode();
        }

        public final String toString() {
            return "OnLocalAsset(iconName=" + this.f20889a + ")";
        }
    }

    public IconAsset(String __typename, OnLocalAsset onLocalAsset, OnHostedIcon onHostedIcon, OnCoreIcon onCoreIcon) {
        Intrinsics.h(__typename, "__typename");
        this.f20886a = __typename;
        this.b = onLocalAsset;
        this.c = onHostedIcon;
        this.d = onCoreIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconAsset)) {
            return false;
        }
        IconAsset iconAsset = (IconAsset) obj;
        return Intrinsics.c(this.f20886a, iconAsset.f20886a) && Intrinsics.c(this.b, iconAsset.b) && Intrinsics.c(this.c, iconAsset.c) && Intrinsics.c(this.d, iconAsset.d);
    }

    public final int hashCode() {
        int iHashCode = this.f20886a.hashCode() * 31;
        OnLocalAsset onLocalAsset = this.b;
        int iHashCode2 = (iHashCode + (onLocalAsset == null ? 0 : onLocalAsset.f20889a.hashCode())) * 31;
        OnHostedIcon onHostedIcon = this.c;
        int iHashCode3 = (iHashCode2 + (onHostedIcon == null ? 0 : onHostedIcon.f20888a.hashCode())) * 31;
        OnCoreIcon onCoreIcon = this.d;
        return iHashCode3 + (onCoreIcon != null ? onCoreIcon.hashCode() : 0);
    }

    public final String toString() {
        return "IconAsset(__typename=" + this.f20886a + ", onLocalAsset=" + this.b + ", onHostedIcon=" + this.c + ", onCoreIcon=" + this.d + ")";
    }
}
