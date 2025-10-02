package com.scandit.djinni;

import com.scandit.djinni.ResultOrError;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements ResultOrError.ResultHandler, ResultOrError.ErrorHandler {
    public final /* synthetic */ int d;
    public final /* synthetic */ ResultOrError e;

    public /* synthetic */ f(ResultOrError resultOrError, int i) {
        this.d = i;
        this.e = resultOrError;
    }

    @Override // com.scandit.djinni.ResultOrError.ResultHandler, com.scandit.djinni.ResultOrError.ErrorHandler
    public final Object apply(Object obj) {
        switch (this.d) {
            case 0:
                return ResultOrError.a(this.e, obj);
            default:
                return ResultOrError.b(this.e, obj);
        }
    }
}
