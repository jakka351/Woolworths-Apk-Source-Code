package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.feature.shop.brandedshop.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt$BrandedShopSnackbar$2$1", f = "BrandedShopHome.kt", l = {259}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BrandedShopHomeKt$BrandedShopSnackbar$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SnackbarHostState q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandedShopHomeKt$BrandedShopSnackbar$2$1(SnackbarHostState snackbarHostState, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = snackbarHostState;
        this.r = str;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BrandedShopHomeKt$BrandedShopSnackbar$2$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BrandedShopHomeKt$BrandedShopSnackbar$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BrandedShopHomeKt$BrandedShopSnackbar$2$1 brandedShopHomeKt$BrandedShopSnackbar$2$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            brandedShopHomeKt$BrandedShopSnackbar$2$1 = this;
            if (SnackbarHostState.b(this.q, this.r, null, null, brandedShopHomeKt$BrandedShopSnackbar$2$1, 6) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            brandedShopHomeKt$BrandedShopSnackbar$2$1 = this;
        }
        brandedShopHomeKt$BrandedShopSnackbar$2$1.s.invoke(new UiEvent.OnSnackbarStateChanged(null));
        return Unit.f24250a;
    }
}
