package coil3.intercept;

import coil3.EventListener;
import coil3.intercept.Interceptor;
import coil3.request.ImageRequest;
import coil3.size.Size;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/intercept/RealInterceptorChain;", "Lcoil3/intercept/Interceptor$Chain;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final ImageRequest f13110a;
    public final List b;
    public final int c;
    public final ImageRequest d;
    public final Size e;
    public final EventListener f;
    public final boolean g;

    public RealInterceptorChain(ImageRequest imageRequest, List list, int i, ImageRequest imageRequest2, Size size, EventListener eventListener, boolean z) {
        this.f13110a = imageRequest;
        this.b = list;
        this.c = i;
        this.d = imageRequest2;
        this.e = size;
        this.f = eventListener;
        this.g = z;
    }

    @Override // coil3.intercept.Interceptor.Chain
    /* renamed from: a, reason: from getter */
    public final ImageRequest getD() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.RealInterceptorChain.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
