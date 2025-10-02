package au.com.woolworths.base.shopapp.modules.badge;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgeApiDataKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4620a;

        static {
            int[] iArr = new int[BadgeTypeApiData.values().length];
            try {
                iArr[BadgeTypeApiData.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeTypeApiData.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeTypeApiData.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeTypeApiData.NEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeTypeApiData.PRIMARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BadgeTypeApiData.REWARDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BadgeTypeApiData.SPECIAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BadgeTypeApiData.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BadgeTypeApiData.TEMPORARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BadgeTypeApiData.UNAVAILABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f4620a = iArr;
        }
    }

    public static final BadgeBrandLabelType a(BadgeTypeApiData badgeTypeApiData) {
        Intrinsics.h(badgeTypeApiData, "<this>");
        switch (WhenMappings.f4620a[badgeTypeApiData.ordinal()]) {
            case 1:
                return BadgeBrandLabelType.d;
            case 2:
                return BadgeBrandLabelType.f;
            case 3:
                return BadgeBrandLabelType.g;
            case 4:
                return BadgeBrandLabelType.h;
            case 5:
                return BadgeBrandLabelType.i;
            case 6:
                return BadgeBrandLabelType.j;
            case 7:
                return BadgeBrandLabelType.k;
            case 8:
                return BadgeBrandLabelType.e;
            case 9:
                return BadgeBrandLabelType.l;
            case 10:
                return BadgeBrandLabelType.m;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
