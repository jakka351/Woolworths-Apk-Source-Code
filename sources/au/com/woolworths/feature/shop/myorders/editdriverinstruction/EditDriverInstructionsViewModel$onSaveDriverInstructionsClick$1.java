package au.com.woolworths.feature.shop.myorders.editdriverinstruction;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsContract;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.analytics.EditDriverInstructionsActions;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.models.EditDriverInstructionsReason;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.models.EditDriverInstructionsResponse;
import au.com.woolworths.shop.graphql.type.EditOrderDriverInstructionsInput;
import com.woolworths.R;
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
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel$onSaveDriverInstructionsClick$1", f = "EditDriverInstructionsViewModel.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EditDriverInstructionsViewModel$onSaveDriverInstructionsClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EditDriverInstructionsViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditDriverInstructionsViewModel$onSaveDriverInstructionsClick$1(EditDriverInstructionsViewModel editDriverInstructionsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = editDriverInstructionsViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditDriverInstructionsViewModel$onSaveDriverInstructionsClick$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EditDriverInstructionsViewModel$onSaveDriverInstructionsClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        EditDriverInstructionsViewModel editDriverInstructionsViewModel = this.q;
        AnalyticsManager analyticsManager = editDriverInstructionsViewModel.f;
        SharedFlowImpl sharedFlowImpl = editDriverInstructionsViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                EditDriverInstructionsInteractor editDriverInstructionsInteractor = editDriverInstructionsViewModel.e;
                EditDriverInstructionActivity.Extras extras = editDriverInstructionsViewModel.g;
                if (extras == null) {
                    Intrinsics.p("extras");
                    throw null;
                }
                int i2 = extras.d;
                String str = this.r;
                this.p = 1;
                obj = editDriverInstructionsInteractor.f7829a.a(new EditOrderDriverInstructionsInput(String.valueOf(i2), str), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            EditDriverInstructionsResponse editDriverInstructionsResponse = (EditDriverInstructionsResponse) obj;
            boolean z = editDriverInstructionsResponse.f7834a;
            String str2 = editDriverInstructionsResponse.c;
            if (z || editDriverInstructionsResponse.b == EditDriverInstructionsReason.d) {
                sharedFlowImpl.f(new EditDriverInstructionsContract.Actions.FinishWithMessage(EditDriverInstructionsViewModel.p6(editDriverInstructionsViewModel, editDriverInstructionsResponse)));
            } else {
                sharedFlowImpl.f(new EditDriverInstructionsContract.Actions.ShowSnackbar(str2 != null ? new PlainText(str2) : new ResText(R.string.edit_driver_instruction_server_error_message)));
                analyticsManager.c(EditDriverInstructionsActions.g);
            }
        } catch (NoConnectivityException unused) {
            sharedFlowImpl.f(new EditDriverInstructionsContract.Actions.ShowSnackbar(new ResText(R.string.edit_driver_instruction_network_error_message)));
            analyticsManager.c(EditDriverInstructionsActions.f);
        } catch (ServerErrorException unused2) {
            sharedFlowImpl.f(new EditDriverInstructionsContract.Actions.ShowSnackbar(new ResText(R.string.edit_driver_instruction_server_error_message)));
            analyticsManager.c(EditDriverInstructionsActions.g);
        }
        editDriverInstructionsViewModel.h.m(new EditDriverInstructionsContract.ViewState(StatefulButtonState.d));
        return Unit.f24250a;
    }
}
