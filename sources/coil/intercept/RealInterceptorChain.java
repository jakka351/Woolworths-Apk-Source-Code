package coil.intercept;

import android.content.Context;
import coil.EventListener;
import coil.intercept.Interceptor;
import coil.request.ImageRequest;
import coil.request.NullRequestData;
import coil.size.Size;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/intercept/RealInterceptorChain;", "Lcoil/intercept/Interceptor$Chain;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final ImageRequest f12998a;
    public final List b;
    public final int c;
    public final ImageRequest d;
    public final Size e;
    public final EventListener f;
    public final boolean g;

    public RealInterceptorChain(ImageRequest imageRequest, List list, int i, ImageRequest imageRequest2, Size size, EventListener eventListener, boolean z) {
        this.f12998a = imageRequest;
        this.b = list;
        this.c = i;
        this.d = imageRequest2;
        this.e = size;
        this.f = eventListener;
        this.g = z;
    }

    @Override // coil.intercept.Interceptor.Chain
    /* renamed from: a, reason: from getter */
    public final ImageRequest getD() {
        return this.d;
    }

    public final void b(ImageRequest imageRequest, Interceptor interceptor) {
        Context context = imageRequest.f13017a;
        ImageRequest imageRequest2 = this.f12998a;
        if (context != imageRequest2.f13017a) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (imageRequest.b == NullRequestData.f13019a) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (imageRequest.c != imageRequest2.c) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (imageRequest.u != imageRequest2.u) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's lifecycle.").toString());
        }
        if (imageRequest.v == imageRequest2.v) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(coil.request.ImageRequest r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof coil.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r14
            coil.intercept.RealInterceptorChain$proceed$1 r0 = (coil.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            coil.intercept.RealInterceptorChain$proceed$1 r0 = new coil.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            coil.intercept.Interceptor r13 = r0.q
            coil.intercept.RealInterceptorChain r0 = r0.p
            kotlin.ResultKt.b(r14)
            goto L70
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            kotlin.ResultKt.b(r14)
            java.util.List r14 = r12.b
            int r2 = r12.c
            if (r2 <= 0) goto L47
            int r4 = r2 + (-1)
            java.lang.Object r4 = r14.get(r4)
            coil.intercept.Interceptor r4 = (coil.intercept.Interceptor) r4
            r12.b(r13, r4)
        L47:
            java.lang.Object r14 = r14.get(r2)
            coil.intercept.Interceptor r14 = (coil.intercept.Interceptor) r14
            int r7 = r2 + 1
            coil.intercept.RealInterceptorChain r4 = new coil.intercept.RealInterceptorChain
            coil.EventListener r10 = r12.f
            boolean r11 = r12.g
            coil.request.ImageRequest r5 = r12.f12998a
            java.util.List r6 = r12.b
            coil.size.Size r9 = r12.e
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.p = r12
            r0.q = r14
            r0.t = r3
            java.lang.Object r13 = r14.a(r4, r0)
            if (r13 != r1) goto L6c
            return r1
        L6c:
            r0 = r14
            r14 = r13
            r13 = r0
            r0 = r12
        L70:
            coil.request.ImageResult r14 = (coil.request.ImageResult) r14
            coil.request.ImageRequest r1 = r14.getB()
            r0.b(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.RealInterceptorChain.c(coil.request.ImageRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
