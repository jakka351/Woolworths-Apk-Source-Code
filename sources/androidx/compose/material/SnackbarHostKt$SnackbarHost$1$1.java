package androidx.compose.material;

import androidx.compose.ui.platform.AccessibilityManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SnackbarData q;
    public final /* synthetic */ AccessibilityManager r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, Continuation continuation) {
        super(2, continuation);
        this.q = snackbarData;
        this.r = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        SnackbarData snackbarData = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            if (snackbarData != null) {
                SnackbarDuration c = snackbarData.getC();
                boolean z = snackbarData.getB() != null;
                int iOrdinal = c.ordinal();
                if (iOrdinal == 0) {
                    jA = 4000;
                } else if (iOrdinal == 1) {
                    jA = 10000;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jA = Long.MAX_VALUE;
                }
                AccessibilityManager accessibilityManager = this.r;
                if (accessibilityManager != null) {
                    jA = accessibilityManager.a(jA, z);
                }
                this.p = 1;
                if (DelayKt.b(jA, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        snackbarData.dismiss();
        return Unit.f24250a;
    }
}
