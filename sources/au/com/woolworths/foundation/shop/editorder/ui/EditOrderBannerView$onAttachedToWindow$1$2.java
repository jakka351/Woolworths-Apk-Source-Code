package au.com.woolworths.foundation.shop.editorder.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderConfirmation;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMessage;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerContract;
import com.woolworths.R;
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
@DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView$onAttachedToWindow$1$2", f = "EditOrderBannerView.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EditOrderBannerView$onAttachedToWindow$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EditOrderBannerView q;
    public final /* synthetic */ LifecycleOwner r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView$onAttachedToWindow$1$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<EditOrderBannerContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            EditOrderBannerContract.Action action = (EditOrderBannerContract.Action) obj;
            final EditOrderBannerView editOrderBannerView = (EditOrderBannerView) this.d;
            int i = EditOrderBannerView.i;
            editOrderBannerView.getClass();
            if (action instanceof EditOrderBannerContract.Action.ShowCmoErrorPage) {
                EditOrderMessage editOrderMessage = ((EditOrderBannerContract.Action.ShowCmoErrorPage) action).f8744a;
                editOrderBannerView.getContext().startActivity(ActivityNavigatorKt.a(Activities.EditOrderErrorActivity.f4471a, ApplicationType.e).putExtra("EXTRA_DATA", new Activities.EditOrderErrorActivity.Extras(editOrderMessage.getTitle(), editOrderMessage.getMessage(), editOrderMessage.getButtonTitle(), Screens.v)));
            } else if (action instanceof EditOrderBannerContract.Action.ShowDialog) {
                EditOrderConfirmation editOrderConfirmation = ((EditOrderBannerContract.Action.ShowDialog) action).f8745a;
                EditOrderEventHandler editOrderEventHandler = editOrderBannerView.h;
                if (editOrderEventHandler == null) {
                    Intrinsics.p("eventHandler");
                    throw null;
                }
                editOrderEventHandler.c6();
                final int i2 = 0;
                AlertDialog.Builder positiveButton = new AlertDialog.Builder(editOrderBannerView.getContext()).setTitle(editOrderConfirmation.getTitle()).setMessage(editOrderConfirmation.getMessage()).setPositiveButton(R.string.cmo_confirmation_confirm_button_label, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.foundation.shop.editorder.ui.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        switch (i2) {
                            case 0:
                                EditOrderBannerView.a(editOrderBannerView);
                                return;
                            default:
                                EditOrderEventHandler editOrderEventHandler2 = editOrderBannerView.h;
                                if (editOrderEventHandler2 != null) {
                                    editOrderEventHandler2.q0();
                                    return;
                                } else {
                                    Intrinsics.p("eventHandler");
                                    throw null;
                                }
                        }
                    }
                });
                final int i3 = 1;
                positiveButton.setNegativeButton(R.string.close_button, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.foundation.shop.editorder.ui.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i32) {
                        switch (i3) {
                            case 0:
                                EditOrderBannerView.a(editOrderBannerView);
                                return;
                            default:
                                EditOrderEventHandler editOrderEventHandler2 = editOrderBannerView.h;
                                if (editOrderEventHandler2 != null) {
                                    editOrderEventHandler2.q0();
                                    return;
                                } else {
                                    Intrinsics.p("eventHandler");
                                    throw null;
                                }
                        }
                    }
                }).show();
            } else if (action instanceof EditOrderBannerContract.Action.CancellationFailure) {
                EditOrderEventHandler editOrderEventHandler2 = editOrderBannerView.h;
                if (editOrderEventHandler2 == null) {
                    Intrinsics.p("eventHandler");
                    throw null;
                }
                editOrderEventHandler2.v3(((EditOrderBannerContract.Action.CancellationFailure) action).f8742a);
            } else {
                if (!(action instanceof EditOrderBannerContract.Action.CancellationSuccess)) {
                    throw new NoWhenBranchMatchedException();
                }
                EditOrderEventHandler editOrderEventHandler3 = editOrderBannerView.h;
                if (editOrderEventHandler3 == null) {
                    Intrinsics.p("eventHandler");
                    throw null;
                }
                editOrderEventHandler3.F3(((EditOrderBannerContract.Action.CancellationSuccess) action).f8743a);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderBannerView$onAttachedToWindow$1$2(EditOrderBannerView editOrderBannerView, LifecycleOwner lifecycleOwner, Continuation continuation) {
        super(2, continuation);
        this.q = editOrderBannerView;
        this.r = lifecycleOwner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditOrderBannerView$onAttachedToWindow$1$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EditOrderBannerView$onAttachedToWindow$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            EditOrderBannerView editOrderBannerView = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, editOrderBannerView, EditOrderBannerView.class, "handleAction", "handleAction(Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action;)V", 4), FlowExtKt.a(editOrderBannerView.getViewModel().i, this.r.getD(), Lifecycle.State.h));
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
