package com.scandit.djinni;

import com.scandit.djinni.ResultOrError;

/* loaded from: classes6.dex */
final class b extends ResultOrError {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f19008a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj) {
        super(0);
        this.f19008a = obj;
    }

    @Override // com.scandit.djinni.ResultOrError
    public final Object match(ResultOrError.ResultHandler resultHandler, ResultOrError.ErrorHandler errorHandler) {
        return errorHandler.apply(this.f19008a);
    }
}
