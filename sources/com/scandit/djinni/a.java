package com.scandit.djinni;

import com.scandit.djinni.ResultOrError;

/* loaded from: classes6.dex */
final class a extends ResultOrError {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f19007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj) {
        super(0);
        this.f19007a = obj;
    }

    @Override // com.scandit.djinni.ResultOrError
    public final Object match(ResultOrError.ResultHandler resultHandler, ResultOrError.ErrorHandler errorHandler) {
        return resultHandler.apply(this.f19007a);
    }
}
