package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ProgressStepData;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProgressStepData {

    /* renamed from: a, reason: collision with root package name */
    public final ProgressId f10634a;
    public final String b;
    public final String c;

    public ProgressStepData(ProgressId progressId, String str, String str2) {
        this.f10634a = progressId;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressStepData)) {
            return false;
        }
        ProgressStepData progressStepData = (ProgressStepData) obj;
        return this.f10634a == progressStepData.f10634a && Intrinsics.c(this.b, progressStepData.b) && Intrinsics.c(this.c, progressStepData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f10634a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressStepData(id=");
        sb.append(this.f10634a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", title=");
        return a.o(sb, this.c, ")");
    }
}
