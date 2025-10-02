package com.woolworths.scanlibrary.ui.scanner;

import com.woolworths.scanlibrary.ui.scanner.ScannerContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class ScannerActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((ScannerViewModel) this.receiver).i.f(ScannerContract.Action.OpenSettings.f21322a);
        return Unit.f24250a;
    }
}
