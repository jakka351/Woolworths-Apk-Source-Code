package au.com.woolworths.feature.product.list.legacy.compose.productfinder;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.WindowInsetsControllerCompat;
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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductListScreenKt$ProductListScreen$1$1", f = "ProductListScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListScreenKt$ProductListScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ View p;
    public final /* synthetic */ long q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListScreenKt$ProductListScreen$1$1(View view, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.p = view;
        this.q = j;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListScreenKt$ProductListScreen$1$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProductListScreenKt$ProductListScreen$1$1 productListScreenKt$ProductListScreen$1$1 = (ProductListScreenKt$ProductListScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        productListScreenKt$ProductListScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Context context = this.p.getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        Window window = activity.getWindow();
        long j = this.q;
        window.setStatusBarColor(ColorKt.j(j));
        activity.getWindow().setNavigationBarColor(ColorKt.j(j));
        new WindowInsetsControllerCompat(activity.getWindow(), activity.getWindow().getDecorView()).e(!this.r);
        return Unit.f24250a;
    }
}
