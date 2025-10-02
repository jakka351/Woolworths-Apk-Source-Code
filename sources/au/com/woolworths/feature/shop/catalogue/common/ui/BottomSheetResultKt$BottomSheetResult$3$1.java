package au.com.woolworths.feature.shop.catalogue.common.ui;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SnackbarResult;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.common.ui.BottomSheetResultKt$BottomSheetResult$3$1", f = "BottomSheetResult.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BottomSheetResultKt$BottomSheetResult$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SnackbarHostState q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ ListChangeEvent.AddToListSuccessEvent v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetResultKt$BottomSheetResult$3$1(SnackbarHostState snackbarHostState, String str, String str2, Function0 function0, Function1 function1, ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent, Continuation continuation) {
        super(2, continuation);
        this.q = snackbarHostState;
        this.r = str;
        this.s = str2;
        this.t = function0;
        this.u = function1;
        this.v = addToListSuccessEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomSheetResultKt$BottomSheetResult$3$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetResultKt$BottomSheetResult$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BottomSheetResultKt$BottomSheetResult$3$1 bottomSheetResultKt$BottomSheetResult$3$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            bottomSheetResultKt$BottomSheetResult$3$1 = this;
            obj = SnackbarHostState.b(this.q, this.r, this.s, null, bottomSheetResultKt$BottomSheetResult$3$1, 4);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            bottomSheetResultKt$BottomSheetResult$3$1 = this;
        }
        SnackbarResult snackbarResult = (SnackbarResult) obj;
        bottomSheetResultKt$BottomSheetResult$3$1.t.invoke();
        if (snackbarResult == SnackbarResult.e) {
            bottomSheetResultKt$BottomSheetResult$3$1.u.invoke(bottomSheetResultKt$BottomSheetResult$3$1.v.d);
        }
        return Unit.f24250a;
    }
}
