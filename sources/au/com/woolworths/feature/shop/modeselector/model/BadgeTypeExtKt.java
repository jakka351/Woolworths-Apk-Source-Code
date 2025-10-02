package au.com.woolworths.feature.shop.modeselector.model;

import au.com.woolworths.base.shopapp.modules.badge.BadgeTypeApiData;
import au.com.woolworths.shop.graphql.type.BadgeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mode-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgeTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BadgeType.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BadgeType.Companion companion = BadgeType.e;
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BadgeType.Companion companion2 = BadgeType.e;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BadgeType.Companion companion3 = BadgeType.e;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BadgeType.Companion companion4 = BadgeType.e;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                BadgeType.Companion companion5 = BadgeType.e;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BadgeType.Companion companion6 = BadgeType.e;
                iArr[0] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                BadgeType.Companion companion7 = BadgeType.e;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                BadgeType.Companion companion8 = BadgeType.e;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static final BadgeTypeApiData a(BadgeType badgeType) {
        Intrinsics.h(badgeType, "<this>");
        switch (badgeType.ordinal()) {
            case 0:
                return BadgeTypeApiData.SPECIAL;
            case 1:
                return BadgeTypeApiData.NEW;
            case 2:
                return BadgeTypeApiData.REWARDS;
            case 3:
                return BadgeTypeApiData.PRIMARY;
            case 4:
                return BadgeTypeApiData.INFO;
            case 5:
                return BadgeTypeApiData.ALWAYS;
            case 6:
                return BadgeTypeApiData.DISABLED;
            case 7:
                return BadgeTypeApiData.TEMPORARY;
            case 8:
                return BadgeTypeApiData.UNAVAILABLE;
            default:
                return BadgeTypeApiData.d;
        }
    }
}
