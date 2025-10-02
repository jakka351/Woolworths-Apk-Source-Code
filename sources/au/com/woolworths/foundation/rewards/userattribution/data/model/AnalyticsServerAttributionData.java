package au.com.woolworths.foundation.rewards.userattribution.data.model;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsServerAttributionData;", "", "AttributionProperty", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AnalyticsServerAttributionData {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsServerAttributionData$AttributionProperty;", "", "BoolAttributionProperty", "StringAttributionProperty", "Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsServerAttributionData$AttributionProperty$BoolAttributionProperty;", "Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsServerAttributionData$AttributionProperty$StringAttributionProperty;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AttributionProperty {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsServerAttributionData$AttributionProperty$BoolAttributionProperty;", "Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsServerAttributionData$AttributionProperty;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BoolAttributionProperty implements AttributionProperty {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BoolAttributionProperty) && Intrinsics.c(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return a.j("BoolAttributionProperty(key=", null, ", boolValue=", false, ")");
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsServerAttributionData$AttributionProperty$StringAttributionProperty;", "Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsServerAttributionData$AttributionProperty;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StringAttributionProperty implements AttributionProperty {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StringAttributionProperty) && Intrinsics.c(null, null) && Intrinsics.c(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return YU.a.j("StringAttributionProperty(key=", null, ", stringValue=", null, ")");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnalyticsServerAttributionData) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AnalyticsServerAttributionData(service=" + ((Object) null) + ", properties=" + ((Object) null) + ")";
    }
}
