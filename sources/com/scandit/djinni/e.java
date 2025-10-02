package com.scandit.djinni;

import com.scandit.djinni.Future;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19010a = 0;
    public final /* synthetic */ Promise b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Future.FutureHandler futureHandler, Promise promise) {
        this.c = futureHandler;
        this.b = promise;
    }

    @Override // com.scandit.djinni.c
    public final void a(d dVar) {
        switch (this.f19010a) {
            case 0:
                Future.a((Future.FutureHandler) this.c, this.b, dVar);
                break;
            default:
                Future.a(this.b, (Future.FutureHandlerWithReturn) this.c, dVar);
                break;
        }
    }

    public /* synthetic */ e(Promise promise, Future.FutureHandlerWithReturn futureHandlerWithReturn) {
        this.b = promise;
        this.c = futureHandlerWithReturn;
    }
}
