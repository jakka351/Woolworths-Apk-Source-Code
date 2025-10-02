package au.com.woolworths.foundation.rewards.offers.ui;

import au.com.woolworths.foundation.rewards.offers.model.RewardsCalendarIcon;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsCalendarIconExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8625a;

        static {
            int[] iArr = new int[RewardsCalendarIcon.values().length];
            try {
                iArr[RewardsCalendarIcon.CALENDAR_1_ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_2_ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_3_ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_4_ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_5_ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_6_ACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_7_ACTIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_8_ACTIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_1_DISABLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_2_DISABLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_3_DISABLED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_4_DISABLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_5_DISABLED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_6_DISABLED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_7_DISABLED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_8_DISABLED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_CHECK_SUCCESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_CHECK_DISABLED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_CROSS_DISABLED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_DOTS_ACTIVE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[RewardsCalendarIcon.CALENDAR_CURRENT_ACTIVE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f8625a = iArr;
        }
    }

    public static final int a(RewardsCalendarIcon rewardsCalendarIcon) {
        switch (rewardsCalendarIcon == null ? -1 : WhenMappings.f8625a[rewardsCalendarIcon.ordinal()]) {
            case 1:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_1_active;
            case 2:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_2_active;
            case 3:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_3_active;
            case 4:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_4_active;
            case 5:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_5_active;
            case 6:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_6_active;
            case 7:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_7_active;
            case 8:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_8_active;
            case 9:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_1_disabled;
            case 10:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_2_disabled;
            case 11:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_3_disabled;
            case 12:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_4_disabled;
            case 13:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_5_disabled;
            case 14:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_6_disabled;
            case 15:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_7_disabled;
            case 16:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_8_disabled;
            case 17:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_check_success;
            case 18:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_check_disabled;
            case 19:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_cross_disabled;
            case 20:
            default:
                return com.woolworths.R.drawable.ic_rewards_offer_calendar_dots_active;
        }
    }
}
