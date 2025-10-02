package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.State;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsPageKt$RecipeDetailsPage$2$1", f = "RecipeDetailsPage.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipeDetailsPageKt$RecipeDetailsPage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Function0 p;
    public int q;
    public final /* synthetic */ State r;
    public final /* synthetic */ SnackbarHostState s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsPageKt$RecipeDetailsPage$2$1(State state, SnackbarHostState snackbarHostState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.r = state;
        this.s = snackbarHostState;
        this.t = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RecipeDetailsPageKt$RecipeDetailsPage$2$1(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecipeDetailsPageKt$RecipeDetailsPage$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            String str = ((RecipeDetailsContract.ViewState) this.r.getD()).d;
            if (str != null) {
                SnackbarDuration snackbarDuration = SnackbarDuration.d;
                Function0 function02 = this.t;
                this.p = function02;
                this.q = 1;
                if (SnackbarHostState.b(this.s, str, null, snackbarDuration, this, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                function0 = function02;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function0 = this.p;
        ResultKt.b(obj);
        function0.invoke();
        return Unit.f24250a;
    }
}
