package au.com.woolworths.shop.product.details.ui;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SnackbarResult;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
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
@DebugMetadata(c = "au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1", f = "ProductDetailsScreen.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProductDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductDetailsContract.Snackbar q;
    public final /* synthetic */ String r;
    public final /* synthetic */ SnackbarHostState s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1(ProductDetailsContract.Snackbar snackbar, String str, SnackbarHostState snackbarHostState, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = snackbar;
        this.r = str;
        this.s = snackbarHostState;
        this.t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ProductDetailsContract.Snackbar snackbar = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            snackbar.d.invoke(this.r);
            this.p = 1;
            obj = SnackbarHostState.b(this.s, this.r, this.t, null, this, 4);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (((SnackbarResult) obj) == SnackbarResult.e) {
            snackbar.c.invoke();
        }
        return Unit.f24250a;
    }
}
