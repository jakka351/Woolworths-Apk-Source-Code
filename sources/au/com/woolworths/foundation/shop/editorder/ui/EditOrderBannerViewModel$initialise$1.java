package au.com.woolworths.foundation.shop.editorder.ui;

import androidx.lifecycle.FlowLiveDataConversions;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatusKt;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerViewModel$initialise$1", f = "EditOrderBannerViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EditOrderBannerViewModel$initialise$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EditOrderBannerViewModel q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "data", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderStatus;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerViewModel$initialise$1$1", f = "EditOrderBannerViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerViewModel$initialise$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<EditOrderStatus, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ EditOrderBannerViewModel q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EditOrderBannerViewModel editOrderBannerViewModel, Continuation continuation) {
            super(2, continuation);
            this.q = editOrderBannerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((EditOrderStatus) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            EditOrderBannerViewModel editOrderBannerViewModel = this.q;
            MutableStateFlow mutableStateFlow = editOrderBannerViewModel.f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            EditOrderStatus editOrderStatus = (EditOrderStatus) this.p;
            if (EditOrderStatusKt.a(editOrderStatus)) {
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value2, new EditOrderBannerContract.ViewState(editOrderStatus)));
            } else {
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, new EditOrderBannerContract.ViewState(null)));
            }
            if (editOrderStatus != null && editOrderStatus.getMode() == EditOrderMode.NOT_EDITING && editOrderStatus.getMessage() != null && editOrderStatus.getMessage() != null) {
                editOrderBannerViewModel.h.k(new EditOrderBannerContract.Action.ShowCmoErrorPage(editOrderStatus.getMessage()));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderBannerViewModel$initialise$1(EditOrderBannerViewModel editOrderBannerViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = editOrderBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditOrderBannerViewModel$initialise$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EditOrderBannerViewModel$initialise$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EditOrderBannerViewModel editOrderBannerViewModel = this.q;
        EditOrderInteractor editOrderInteractor = editOrderBannerViewModel.e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            editOrderInteractor.D();
            Flow flowA = FlowLiveDataConversions.a(editOrderInteractor.m());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(editOrderBannerViewModel, null);
            this.p = 1;
            if (FlowKt.h(flowA, anonymousClass1, this) == coroutineSingletons) {
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
