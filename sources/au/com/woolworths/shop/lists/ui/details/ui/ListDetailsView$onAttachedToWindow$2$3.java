package au.com.woolworths.shop.lists.ui.details.ui;

import android.content.Context;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsContract;
import com.google.android.material.snackbar.Snackbar;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$onAttachedToWindow$2$3", f = "ListDetailsView.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ListDetailsView$onAttachedToWindow$2$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ListDetailsView q;
    public final /* synthetic */ LifecycleOwner r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$onAttachedToWindow$2$3$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ListDetailsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ListDetailsContract.Actions actions = (ListDetailsContract.Actions) obj;
            ListDetailsView listDetailsView = (ListDetailsView) this.d;
            int i = ListDetailsView.p;
            listDetailsView.getClass();
            if (!(actions instanceof ListDetailsContract.Actions.ShowSnackbar)) {
                throw new NoWhenBranchMatchedException();
            }
            ResText resText = ((ListDetailsContract.Actions.ShowSnackbar) actions).f12316a;
            Context context = listDetailsView.getContext();
            Intrinsics.g(context, "getContext(...)");
            CharSequence text = resText.getText(context);
            if (listDetailsView.canShowSnackbar) {
                Snackbar.j(null, listDetailsView.h.h, text, 0).l();
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListDetailsView$onAttachedToWindow$2$3(ListDetailsView listDetailsView, LifecycleOwner lifecycleOwner, Continuation continuation) {
        super(2, continuation);
        this.q = listDetailsView;
        this.r = lifecycleOwner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListDetailsView$onAttachedToWindow$2$3(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ListDetailsView$onAttachedToWindow$2$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ListDetailsView listDetailsView = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, listDetailsView, ListDetailsView.class, "handleActions", "handleActions(Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$Actions;)V", 4), FlowExtKt.a(listDetailsView.getViewModel().r, this.r.getD(), Lifecycle.State.h));
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
