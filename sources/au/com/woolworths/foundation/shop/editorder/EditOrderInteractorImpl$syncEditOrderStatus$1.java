package au.com.woolworths.foundation.shop.editorder;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$syncEditOrderStatus$1", f = "EditOrderInteractorImpl.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EditOrderInteractorImpl$syncEditOrderStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MutableLiveData p;
    public int q;
    public final /* synthetic */ EditOrderInteractorImpl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderInteractorImpl$syncEditOrderStatus$1(EditOrderInteractorImpl editOrderInteractorImpl, Continuation continuation) {
        super(2, continuation);
        this.r = editOrderInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditOrderInteractorImpl$syncEditOrderStatus$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EditOrderInteractorImpl$syncEditOrderStatus$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EditOrderMode mode;
        MutableLiveData mutableLiveData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                EditOrderInteractorImpl editOrderInteractorImpl = this.r;
                MutableLiveData mutableLiveData2 = editOrderInteractorImpl.h;
                EditOrderRepository editOrderRepository = editOrderInteractorImpl.b;
                EditOrderStatus editOrderStatus = (EditOrderStatus) editOrderInteractorImpl.i.e();
                if (editOrderStatus == null || (mode = editOrderStatus.getMode()) == null) {
                    mode = EditOrderMode.NOT_EDITING;
                }
                this.p = mutableLiveData2;
                this.q = 1;
                obj = editOrderRepository.a(mode, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableLiveData = mutableLiveData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = this.p;
                ResultKt.b(obj);
            }
            mutableLiveData.j(obj);
        } catch (Exception e) {
            Timber.f27013a.p(e);
        }
        return Unit.f24250a;
    }
}
