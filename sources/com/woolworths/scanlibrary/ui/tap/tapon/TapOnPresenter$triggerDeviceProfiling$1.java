package com.woolworths.scanlibrary.ui.tap.tapon;

import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.ui.tap.tapon.TapOnPresenter$triggerDeviceProfiling$1", f = "TapOnPresenter.kt", l = {449}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class TapOnPresenter$triggerDeviceProfiling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TapOnPresenter q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapOnPresenter$triggerDeviceProfiling$1(TapOnPresenter tapOnPresenter, Continuation continuation) {
        super(2, continuation);
        this.q = tapOnPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TapOnPresenter$triggerDeviceProfiling$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TapOnPresenter$triggerDeviceProfiling$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        TapOnPresenter tapOnPresenter = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            String string = UUID.randomUUID().toString();
            Intrinsics.g(string, "toString(...)");
            DeviceFingerprintInteractor deviceFingerprintInteractor = tapOnPresenter.m;
            this.p = 1;
            obj = deviceFingerprintInteractor.b("scan_go", string, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        tapOnPresenter.u = (DeviceFingerprintInteractor.ProfileResult) obj;
        tapOnPresenter.h1();
        return Unit.f24250a;
    }
}
