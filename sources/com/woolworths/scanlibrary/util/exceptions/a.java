package com.woolworths.scanlibrary.util.exceptions;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ErrorHandlingDelegate e;

    public /* synthetic */ a(ErrorHandlingDelegate errorHandlingDelegate, int i) {
        this.d = i;
        this.e = errorHandlingDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.e.invoke();
                break;
            default:
                this.e.f.invoke();
                break;
        }
        return Unit.f24250a;
    }
}
