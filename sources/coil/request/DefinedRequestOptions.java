package coil.request;

import coil.size.Precision;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/DefinedRequestOptions;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefinedRequestOptions {

    /* renamed from: a, reason: collision with root package name */
    public final SizeResolver f13015a;
    public final Scale b;
    public final Transition.Factory c;
    public final Precision d;

    public DefinedRequestOptions(SizeResolver sizeResolver, Scale scale, Transition.Factory factory, Precision precision) {
        this.f13015a = sizeResolver;
        this.b = scale;
        this.c = factory;
        this.d = precision;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefinedRequestOptions)) {
            return false;
        }
        DefinedRequestOptions definedRequestOptions = (DefinedRequestOptions) obj;
        return Intrinsics.c(this.f13015a, definedRequestOptions.f13015a) && this.b == definedRequestOptions.b && Intrinsics.c(this.c, definedRequestOptions.c) && this.d == definedRequestOptions.d;
    }

    public final int hashCode() {
        SizeResolver sizeResolver = this.f13015a;
        int iHashCode = (sizeResolver != null ? sizeResolver.hashCode() : 0) * 31;
        Scale scale = this.b;
        int iHashCode2 = (iHashCode + (scale != null ? scale.hashCode() : 0)) * 28629151;
        Transition.Factory factory = this.c;
        int iHashCode3 = (iHashCode2 + (factory != null ? factory.hashCode() : 0)) * 31;
        Precision precision = this.d;
        return (iHashCode3 + (precision != null ? precision.hashCode() : 0)) * 887503681;
    }
}
