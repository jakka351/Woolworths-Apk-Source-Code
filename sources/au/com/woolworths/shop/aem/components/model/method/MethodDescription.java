package au.com.woolworths.shop.aem.components.model.method;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/method/MethodDescription;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MethodDescription {

    /* renamed from: a, reason: collision with root package name */
    public final String f10174a;
    public final String b;

    public MethodDescription(String str, String str2) {
        this.f10174a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MethodDescription)) {
            return false;
        }
        MethodDescription methodDescription = (MethodDescription) obj;
        return Intrinsics.c(this.f10174a, methodDescription.f10174a) && Intrinsics.c(this.b, methodDescription.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10174a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("MethodDescription(title=", this.f10174a, ", content=", this.b, ")");
    }
}
