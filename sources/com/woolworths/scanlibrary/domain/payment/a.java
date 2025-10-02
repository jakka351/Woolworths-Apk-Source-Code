package com.woolworths.scanlibrary.domain.payment;

import com.woolworths.scanlibrary.util.exceptions.SessionExpired;
import io.reactivex.SingleEmitter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SingleEmitter e;

    public /* synthetic */ a(SingleEmitter singleEmitter, int i) {
        this.d = i;
        this.e = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                SingleEmitter singleEmitter = this.e;
                if (!singleEmitter.b()) {
                    singleEmitter.onError(new SessionExpired());
                }
                break;
            case 1:
                SingleEmitter singleEmitter2 = this.e;
                if (!singleEmitter2.b()) {
                    singleEmitter2.onError(new SessionExpired());
                }
                break;
            default:
                SingleEmitter singleEmitter3 = this.e;
                if (!singleEmitter3.b()) {
                    singleEmitter3.onError(new SessionExpired());
                }
                break;
        }
        return Unit.f24250a;
    }
}
