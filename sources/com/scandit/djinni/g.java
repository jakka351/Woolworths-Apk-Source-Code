package com.scandit.djinni;

import com.scandit.djinni.ResultOrError;
import com.snapchat.djinni.Outcome;
import java.util.Objects;

/* loaded from: classes6.dex */
public final /* synthetic */ class g implements ResultOrError.ResultHandler, ResultOrError.ErrorHandler, Outcome.ResultHandler, Outcome.ErrorHandler {
    public final /* synthetic */ int d;
    public final /* synthetic */ Class e;

    public /* synthetic */ g(Class cls, int i) {
        this.d = i;
        this.e = cls;
    }

    @Override // com.scandit.djinni.ResultOrError.ResultHandler, com.scandit.djinni.ResultOrError.ErrorHandler
    public Object apply(Object obj) {
        switch (this.d) {
            case 0:
                return ResultOrError.a(this.e, obj);
            default:
                return ResultOrError.b(this.e, obj);
        }
    }

    @Override // com.snapchat.djinni.Outcome.ResultHandler, com.snapchat.djinni.Outcome.ErrorHandler
    public Object apply() {
        switch (this.d) {
            case 2:
                return Integer.valueOf(Objects.hash(this.e, 1, null));
            default:
                return Integer.valueOf(Objects.hash(this.e, 0, null));
        }
    }
}
