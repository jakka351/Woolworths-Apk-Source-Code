package au.com.woolworths.sdui.shop.actionablecard;

import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ActionableCardKt {
    public static final TrackingMetadata a(ActionableCard actionableCard) {
        Object next;
        Intrinsics.h(actionableCard, "<this>");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.q0, actionableCard.getLink());
        trackingMetadataA.b(TrackableValue.o0, actionableCard.getAltText());
        TealiumAnalytics analytics = actionableCard.getAnalytics();
        if (analytics != null) {
            for (Map.Entry<String, String> entry : analytics.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Iterator it = ((AbstractList) TrackableValue.a4).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((TrackableValue) next).d.equals(key)) {
                        break;
                    }
                }
                TrackableValue trackableValue = (TrackableValue) next;
                if (trackableValue != null) {
                    trackingMetadataA.b(trackableValue, value);
                }
            }
        }
        return trackingMetadataA;
    }
}
