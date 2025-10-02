package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ProgressStep;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProgressStep {

    /* renamed from: a, reason: collision with root package name */
    public final ProgressId f10633a;
    public final String b;
    public final String c;
    public final Text d;
    public final boolean e;

    public ProgressStep(ProgressId progressId, String index, String str, Text text, boolean z) {
        Intrinsics.h(index, "index");
        this.f10633a = progressId;
        this.b = index;
        this.c = str;
        this.d = text;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressStep)) {
            return false;
        }
        ProgressStep progressStep = (ProgressStep) obj;
        return this.f10633a == progressStep.f10633a && Intrinsics.c(this.b, progressStep.b) && Intrinsics.c(this.c, progressStep.c) && Intrinsics.c(this.d, progressStep.d) && this.e == progressStep.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + b.c(b.c(this.f10633a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressStep(id=");
        sb.append(this.f10633a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", iconContentDescription=");
        sb.append(this.d);
        sb.append(", isActive=");
        return a.k(")", sb, this.e);
    }
}
