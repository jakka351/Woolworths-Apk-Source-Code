package au.com.woolworths.shop.digipay.models;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/models/SubmittedInstrument;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubmittedInstrument {

    /* renamed from: a, reason: collision with root package name */
    public final String f10924a;
    public final String b;

    public SubmittedInstrument(String instrumentId, String instrumentStepUpToken) {
        Intrinsics.h(instrumentId, "instrumentId");
        Intrinsics.h(instrumentStepUpToken, "instrumentStepUpToken");
        this.f10924a = instrumentId;
        this.b = instrumentStepUpToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmittedInstrument)) {
            return false;
        }
        SubmittedInstrument submittedInstrument = (SubmittedInstrument) obj;
        return Intrinsics.c(this.f10924a, submittedInstrument.f10924a) && Intrinsics.c(this.b, submittedInstrument.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10924a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("SubmittedInstrument(instrumentId=", this.f10924a, ", instrumentStepUpToken=", this.b, ")");
    }
}
