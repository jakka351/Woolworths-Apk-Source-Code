package com.scandit.datacapture.core;

import android.media.Image;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K implements Z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f18334a;
    final /* synthetic */ N b;
    final /* synthetic */ InterfaceC0979c7 c;

    public K(Function1 function1, N n, InterfaceC0979c7 interfaceC0979c7) {
        this.f18334a = function1;
        this.b = n;
        this.c = interfaceC0979c7;
    }

    public final void a(InterfaceC1071n0 result) {
        Intrinsics.h(result, "result");
        if (result.equals(C1053l0.f18794a)) {
            this.f18334a.invoke(Boolean.FALSE);
            return;
        }
        if (result instanceof C1062m0) {
            if (this.b.k == null) {
                this.f18334a.invoke(Boolean.FALSE);
                return;
            }
            this.b.l = ((C1062m0) result).a();
            this.f18334a.invoke(Boolean.TRUE);
        }
    }

    public final void a(Image image) {
        Intrinsics.h(image, "image");
        long jB = ((C1024h7) this.c).b(image.getTimestamp());
        ((J6) this.b.g).a(image, new J(this.b));
        ((C0992e2) this.b.h).a(image, jB, this.b.b);
    }
}
