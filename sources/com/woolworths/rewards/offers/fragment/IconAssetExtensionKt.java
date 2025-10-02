package com.woolworths.rewards.offers.fragment;

import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import com.woolworths.rewards.offers.fragment.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconAssetExtensionKt {
    public static final au.com.woolworths.rewards.base.data.IconAsset a(IconAsset iconAsset) {
        LocalAssetIconName localAssetIconName;
        Intrinsics.h(iconAsset, "<this>");
        IconAsset.OnHostedIcon onHostedIcon = iconAsset.c;
        if (onHostedIcon != null) {
            return new IconAsset.HostedIcon(onHostedIcon.f20888a);
        }
        IconAsset.OnLocalAsset onLocalAsset = iconAsset.b;
        if (onLocalAsset == null) {
            IconAsset.OnCoreIcon onCoreIcon = iconAsset.d;
            if (onCoreIcon != null) {
                return new IconAsset.CoreIcon(onCoreIcon.f20887a);
            }
            return null;
        }
        au.com.woolworths.rewards.graphql.type.LocalAssetIconName localAssetIconName2 = onLocalAsset.f20889a;
        Intrinsics.h(localAssetIconName2, "<this>");
        switch (localAssetIconName2.ordinal()) {
            case 0:
                localAssetIconName = LocalAssetIconName.CART;
                break;
            case 1:
                localAssetIconName = LocalAssetIconName.ACCOUNT;
                break;
            case 2:
                localAssetIconName = LocalAssetIconName.TRUCK;
                break;
            case 3:
                localAssetIconName = LocalAssetIconName.SEARCH;
                break;
            case 4:
                localAssetIconName = LocalAssetIconName.INFO;
                break;
            case 5:
                localAssetIconName = LocalAssetIconName.REWARDS;
                break;
            case 6:
                localAssetIconName = LocalAssetIconName.FEEDBACK;
                break;
            case 7:
                localAssetIconName = LocalAssetIconName.CHEVRON_RIGHT;
                break;
            case 8:
                localAssetIconName = LocalAssetIconName.CHEVRON_RIGHT_SMALL;
                break;
            case 9:
                localAssetIconName = LocalAssetIconName.SUBSCRIBER;
                break;
            case 10:
                localAssetIconName = LocalAssetIconName.COPY;
                break;
            case 11:
                localAssetIconName = LocalAssetIconName.BASKET;
                break;
            case 12:
                localAssetIconName = LocalAssetIconName.ARROW;
                break;
            case 13:
                localAssetIconName = LocalAssetIconName.INVOICE;
                break;
            case 14:
                localAssetIconName = LocalAssetIconName.HELP;
                break;
            case 15:
                localAssetIconName = LocalAssetIconName.RETURNS;
                break;
            case 16:
                localAssetIconName = LocalAssetIconName.VISIBILITY_ON;
                break;
            case 17:
                localAssetIconName = LocalAssetIconName.RECEIPT;
                break;
            case 18:
                localAssetIconName = LocalAssetIconName.STORE_LOCATION;
                break;
            case 19:
                localAssetIconName = LocalAssetIconName.GREEN_TICK;
                break;
            case 20:
                localAssetIconName = LocalAssetIconName.ERROR;
                break;
            default:
                localAssetIconName = LocalAssetIconName.UNKNOWN;
                break;
        }
        return new IconAsset.LocalAsset(localAssetIconName);
    }
}
