package au.com.woolworths.shop.checkout.ui.timeselector;

import au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.checkout.data.source.MutationErrorException;
import au.com.woolworths.shop.checkout.domain.interactor.timeselector.ReserveTimeSlotInteractor;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import com.woolworths.R;
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
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel$onFooterClick$2", f = "TimeSelectorViewModel.kt", l = {265}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class TimeSelectorViewModel$onFooterClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TimeSelectorViewModel q;
    public final /* synthetic */ FulfilmentSlot r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSelectorViewModel$onFooterClick$2(TimeSelectorViewModel timeSelectorViewModel, FulfilmentSlot fulfilmentSlot, Continuation continuation) {
        super(2, continuation);
        this.q = timeSelectorViewModel;
        this.r = fulfilmentSlot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimeSelectorViewModel$onFooterClick$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TimeSelectorViewModel$onFooterClick$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        TimeSelectorViewModel timeSelectorViewModel = this.q;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    MutableStateFlow mutableStateFlow = timeSelectorViewModel.i;
                    mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, null, TimeSelectorContract.LoadingState.e, null, 111));
                    ReserveTimeSlotInteractor reserveTimeSlotInteractor = timeSelectorViewModel.f;
                    FulfilmentSlot fulfilmentSlot = this.r;
                    int i2 = fulfilmentSlot.f10671a;
                    String str = fulfilmentSlot.h;
                    this.p = 1;
                    if (reserveTimeSlotInteractor.f10553a.b(i2, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                timeSelectorViewModel.k.k(TimeSelectorContract.Actions.Finish.f10833a);
            } catch (NoConnectivityException unused) {
                timeSelectorViewModel.g.g(TimeSelectorAnalytics.WindowSelection.Action.j);
                timeSelectorViewModel.k.k(new TimeSelectorContract.Actions.ShowSnackBar(new ResText(R.string.checkout_time_selector_snackbar_no_connection)));
            } catch (ServerErrorException unused2) {
                timeSelectorViewModel.g.g(TimeSelectorAnalytics.WindowSelection.Action.i);
                timeSelectorViewModel.k.k(new TimeSelectorContract.Actions.ShowSnackBar(new ResText(R.string.checkout_time_selector_snackbar_unable_to_load)));
            } catch (MutationErrorException e) {
                timeSelectorViewModel.g.g(TimeSelectorAnalytics.WindowSelection.Action.i);
                BufferedChannel bufferedChannel = timeSelectorViewModel.k;
                String str2 = e.d.b;
                if (str2 == null) {
                    str2 = "";
                }
                bufferedChannel.k(new TimeSelectorContract.Actions.ShowSnackBar(new PlainText(str2)));
            }
            MutableStateFlow mutableStateFlow2 = timeSelectorViewModel.i;
            mutableStateFlow2.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow2.getValue(), null, null, null, TimeSelectorContract.LoadingState.f, null, 111));
            return Unit.f24250a;
        } catch (Throwable th) {
            MutableStateFlow mutableStateFlow3 = timeSelectorViewModel.i;
            mutableStateFlow3.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow3.getValue(), null, null, null, TimeSelectorContract.LoadingState.f, null, 111));
            throw th;
        }
    }
}
