package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/AlertIndicator;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AlertIndicator {

    /* renamed from: a, reason: collision with root package name */
    public final String f7178a;

    public AlertIndicator(String message) {
        AlertIndicatorType alertIndicatorType = AlertIndicatorType.d;
        Intrinsics.h(message, "message");
        this.f7178a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertIndicator)) {
            return false;
        }
        AlertIndicatorType alertIndicatorType = AlertIndicatorType.d;
        return Intrinsics.c(this.f7178a, ((AlertIndicator) obj).f7178a);
    }

    public final int hashCode() {
        return this.f7178a.hashCode() + (AlertIndicatorType.d.hashCode() * 31);
    }

    public final String toString() {
        return "AlertIndicator(indicatorType=" + AlertIndicatorType.d + ", message=" + this.f7178a + ")";
    }
}
