package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import android.content.Context;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.State;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerContract;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt$FoodTrackerPage$3$1", f = "FoodTrackerPage.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FoodTrackerPageKt$FoodTrackerPage$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public FoodTrackerEventListener p;
    public int q;
    public final /* synthetic */ State r;
    public final /* synthetic */ SnackbarHostState s;
    public final /* synthetic */ Context t;
    public final /* synthetic */ FoodTrackerEventListener u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodTrackerPageKt$FoodTrackerPage$3$1(State state, SnackbarHostState snackbarHostState, Context context, FoodTrackerEventListener foodTrackerEventListener, Continuation continuation) {
        super(2, continuation);
        this.r = state;
        this.s = snackbarHostState;
        this.t = context;
        this.u = foodTrackerEventListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoodTrackerPageKt$FoodTrackerPage$3$1(this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FoodTrackerPageKt$FoodTrackerPage$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FoodTrackerEventListener foodTrackerEventListener;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Text text = ((FoodTrackerContract.ViewState) this.r.getD()).f;
            if (text != null) {
                String string = text.getText(this.t).toString();
                SnackbarDuration snackbarDuration = SnackbarDuration.d;
                FoodTrackerEventListener foodTrackerEventListener2 = this.u;
                this.p = foodTrackerEventListener2;
                this.q = 1;
                if (SnackbarHostState.b(this.s, string, null, snackbarDuration, this, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                foodTrackerEventListener = foodTrackerEventListener2;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        foodTrackerEventListener = this.p;
        ResultKt.b(obj);
        foodTrackerEventListener.m5();
        return Unit.f24250a;
    }
}
