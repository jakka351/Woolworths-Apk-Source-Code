package au.com.woolworths.feature.shop.inbox;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/TransformContext;", "", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransformContext {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7286a;
    public final int b;

    public TransformContext(boolean z, int i) {
        this.f7286a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformContext)) {
            return false;
        }
        TransformContext transformContext = (TransformContext) obj;
        return this.f7286a == transformContext.f7286a && this.b == transformContext.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f7286a) * 31);
    }

    public final String toString() {
        return "TransformContext(isFirstTransform=" + this.f7286a + ", lastEmittedFlowIndex=" + this.b + ")";
    }
}
