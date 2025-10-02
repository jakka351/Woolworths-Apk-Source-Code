package com.swrve.sdk;

import com.swrve.sdk.messaging.SwrveBaseCampaign;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/swrve/sdk/SwrveUtils;", "", "Companion", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwrveUtils {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/swrve/sdk/SwrveUtils$Companion;", "", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[SwrveBaseCampaign.SwrveTimezoneType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public static Date a(String isoDate, SwrveBaseCampaign.SwrveTimezoneType timezoneType) {
            Instant instant;
            Intrinsics.h(isoDate, "isoDate");
            Intrinsics.h(timezoneType, "timezoneType");
            int iOrdinal = timezoneType.ordinal();
            if (iOrdinal == 0) {
                instant = Instant.parse(isoDate);
                Intrinsics.g(instant, "parse(...)");
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                LocalDateTime localDateTime = LocalDateTime.parse(isoDate);
                instant = localDateTime.toInstant(ZoneId.systemDefault().getRules().getOffset(localDateTime));
                Intrinsics.e(instant);
            }
            Date dateFrom = Date.from(instant);
            Intrinsics.g(dateFrom, "from(...)");
            return dateFrom;
        }
    }
}
