package com.woolworths.scanlibrary.ui.scanner;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.woolworths.scanlibrary.ui.scanner.ScannerContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.ui.scanner.ScannerActivity$observeAction$1", f = "ScannerActivity.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ScannerActivity$observeAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ScannerActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.woolworths.scanlibrary.ui.scanner.ScannerActivity$observeAction$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ScannerContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ScannerActivity scannerActivity = (ScannerActivity) this.d;
            int i = ScannerActivity.x;
            scannerActivity.getClass();
            if (!Intrinsics.c((ScannerContract.Action) obj, ScannerContract.Action.OpenSettings.f21322a)) {
                throw new NoWhenBranchMatchedException();
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            Uri uriFromParts = Uri.fromParts("package", scannerActivity.getPackageName(), null);
            Intrinsics.g(uriFromParts, "fromParts(...)");
            intent.setData(uriFromParts);
            scannerActivity.startActivity(intent);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerActivity$observeAction$1(ScannerActivity scannerActivity, Continuation continuation) {
        super(2, continuation);
        this.q = scannerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScannerActivity$observeAction$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScannerActivity$observeAction$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ScannerActivity scannerActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, scannerActivity, ScannerActivity.class, "handleActions", "handleActions(Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Action;)V", 4), FlowExtKt.a(((ScannerViewModel) scannerActivity.v.getD()).j, scannerActivity.getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
