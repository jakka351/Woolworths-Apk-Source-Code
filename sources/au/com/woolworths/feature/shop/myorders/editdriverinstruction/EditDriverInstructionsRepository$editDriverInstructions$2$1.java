package au.com.woolworths.feature.shop.myorders.editdriverinstruction;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.models.EditDriverInstructionsReason;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.models.EditDriverInstructionsResponse;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.models.EditOrderDriverInstructionsReasonExtKt;
import au.com.woolworths.shop.graphql.type.EditOrderDriverInstructionsInput;
import au.com.woolworths.shop.graphql.type.EditOrderDriverInstructionsReason;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.woolworths.feature.shop.myorders.EditOrderDriverInstructionsMutation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/models/EditDriverInstructionsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsRepository$editDriverInstructions$2$1", f = "EditDriverInstructionsRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EditDriverInstructionsRepository$editDriverInstructions$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EditDriverInstructionsResponse>, Object> {
    public int p;
    public final /* synthetic */ EditDriverInstructionsRepository q;
    public final /* synthetic */ EditOrderDriverInstructionsInput r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditDriverInstructionsRepository$editDriverInstructions$2$1(EditDriverInstructionsRepository editDriverInstructionsRepository, EditOrderDriverInstructionsInput editOrderDriverInstructionsInput, Continuation continuation) {
        super(2, continuation);
        this.q = editDriverInstructionsRepository;
        this.r = editOrderDriverInstructionsInput;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditDriverInstructionsRepository$editDriverInstructions$2$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EditDriverInstructionsRepository$editDriverInstructions$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f7830a;
            EditOrderDriverInstructionsMutation editOrderDriverInstructionsMutation = new EditOrderDriverInstructionsMutation(this.r);
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, editOrderDriverInstructionsMutation);
            this.p = 1;
            obj = apolloCall.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        EditOrderDriverInstructionsMutation.EditOrderDriverInstructions editOrderDriverInstructions = ((EditOrderDriverInstructionsMutation.Data) ExceptionExtKt.k((ApolloResponse) obj)).f19856a;
        boolean z = editOrderDriverInstructions.f19857a;
        EditOrderDriverInstructionsReason editOrderDriverInstructionsReason = editOrderDriverInstructions.b;
        return new EditDriverInstructionsResponse(z, editOrderDriverInstructionsReason != null ? EditOrderDriverInstructionsReasonExtKt.WhenMappings.f7835a[editOrderDriverInstructionsReason.ordinal()] == 1 ? EditDriverInstructionsReason.d : EditDriverInstructionsReason.e : null, editOrderDriverInstructions.c);
    }
}
