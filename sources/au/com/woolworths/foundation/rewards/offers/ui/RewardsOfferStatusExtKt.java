package au.com.woolworths.foundation.rewards.offers.ui;

import android.content.Context;
import android.util.TypedValue;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsOfferStatusExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8626a;

        static {
            int[] iArr = new int[RewardsOfferStatus.values().length];
            try {
                iArr[RewardsOfferStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsOfferStatus.ACTIVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsOfferStatus.NOT_ACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardsOfferStatus.ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RewardsOfferStatus.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RewardsOfferStatus.MISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RewardsOfferStatus.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f8626a = iArr;
        }
    }

    public static final int a(RewardsOfferStatus rewardsOfferStatus) {
        Intrinsics.h(rewardsOfferStatus, "<this>");
        if (WhenMappings.f8626a[rewardsOfferStatus.ordinal()] == 2) {
            return com.woolworths.R.drawable.ic_pulse_animation;
        }
        return 0;
    }

    public static final int b(RewardsOfferStatus rewardsOfferStatus) {
        Intrinsics.h(rewardsOfferStatus, "<this>");
        if (WhenMappings.f8626a[rewardsOfferStatus.ordinal()] == 1) {
            return com.woolworths.R.drawable.ic_offer_status_pending;
        }
        return 0;
    }

    public static final int c(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true);
        int i = typedValue.resourceId;
        return i != 0 ? i : typedValue.data;
    }
}
