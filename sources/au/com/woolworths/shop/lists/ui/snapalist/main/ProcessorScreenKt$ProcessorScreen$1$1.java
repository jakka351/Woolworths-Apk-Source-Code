package au.com.woolworths.shop.lists.ui.snapalist.main;

import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStatus;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorScreenKt$ProcessorScreen$1$1", f = "ProcessorScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProcessorScreenKt$ProcessorScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ProcessorContract.ViewState p;
    public final /* synthetic */ PermissionState q;
    public final /* synthetic */ ProcessorContract.Listener r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorScreenKt$ProcessorScreen$1$1(ProcessorContract.ViewState viewState, PermissionState permissionState, ProcessorContract.Listener listener, Continuation continuation) {
        super(2, continuation);
        this.p = viewState;
        this.q = permissionState;
        this.r = listener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProcessorScreenKt$ProcessorScreen$1$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProcessorScreenKt$ProcessorScreen$1$1 processorScreenKt$ProcessorScreen$1$1 = (ProcessorScreenKt$ProcessorScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        processorScreenKt$ProcessorScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (this.p.b) {
            PermissionState permissionState = this.q;
            PermissionStatus status = permissionState.getStatus();
            Intrinsics.h(status, "<this>");
            boolean zEquals = status.equals(PermissionStatus.Granted.f14367a);
            ProcessorContract.Listener listener = this.r;
            if (zEquals) {
                listener.P2();
            } else {
                permissionState.a();
            }
            listener.p2();
        }
        return Unit.f24250a;
    }
}
