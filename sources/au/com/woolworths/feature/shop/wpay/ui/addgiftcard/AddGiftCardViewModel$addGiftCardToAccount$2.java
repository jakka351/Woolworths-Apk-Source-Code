package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddGiftCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddGiftCardResponse;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContract;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardViewModel$addGiftCardToAccount$2", f = "AddGiftCardViewModel.kt", l = {56}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AddGiftCardViewModel$addGiftCardToAccount$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddGiftCardViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddGiftCardViewModel$addGiftCardToAccount$2(AddGiftCardViewModel addGiftCardViewModel, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = addGiftCardViewModel;
        this.r = str;
        this.s = str2;
        this.t = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddGiftCardViewModel$addGiftCardToAccount$2(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddGiftCardViewModel$addGiftCardToAccount$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        AddGiftCardResult unlinkedCard;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        boolean z = this.t;
        String str = this.s;
        String str2 = this.r;
        AddGiftCardViewModel addGiftCardViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            GetAddGiftCardInteractor getAddGiftCardInteractor = addGiftCardViewModel.f;
            this.p = 1;
            obj = getAddGiftCardInteractor.a(str2, str, z, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        PageResult pageResult = (PageResult) obj;
        if (pageResult instanceof PageResult.Success) {
            AddGiftCardResponse addGiftCardResponse = (AddGiftCardResponse) ((PageResult.Success) pageResult).f8285a;
            if (addGiftCardResponse.f8288a) {
                if (z) {
                    String str3 = addGiftCardResponse.b;
                    unlinkedCard = str3 != null ? new AddGiftCardResult.LinkedCard(str3) : AddGiftCardResult.None.f8342a;
                } else {
                    unlinkedCard = new AddGiftCardResult.UnlinkedCard(str2, str);
                }
                addGiftCardViewModel.i.k(new AddGiftCardContract.Action.Success(unlinkedCard));
            } else {
                addGiftCardViewModel.g.f8335a.g((Event) AddGiftCardAnalyticsTracker.a().g.d.getD());
                MutableStateFlow mutableStateFlow = addGiftCardViewModel.h;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value2, AddGiftCardContract.ViewState.a((AddGiftCardContract.ViewState) value2, addGiftCardResponse.c, false, false, 13)));
            }
        } else if (pageResult instanceof PageResult.Fail) {
            if (((PageResult.Fail) pageResult).f8284a instanceof NoConnectivityException) {
                addGiftCardViewModel.g.f8335a.g((Event) AddGiftCardAnalyticsTracker.a().g.b.getD());
                addGiftCardViewModel.i.k(AddGiftCardContract.Action.SnackBarConnectionError.f8337a);
            } else {
                addGiftCardViewModel.g.f8335a.g((Event) AddGiftCardAnalyticsTracker.a().g.c.getD());
                addGiftCardViewModel.i.k(AddGiftCardContract.Action.SnackBarServerError.f8338a);
            }
        } else if (!Intrinsics.c(pageResult, PageResult.Uninitialized.f8286a)) {
            throw new NoWhenBranchMatchedException();
        }
        MutableStateFlow mutableStateFlow2 = addGiftCardViewModel.h;
        do {
            value = mutableStateFlow2.getValue();
            LoadingState loadingState = LoadingState.d;
        } while (!mutableStateFlow2.d(value, AddGiftCardContract.ViewState.a((AddGiftCardContract.ViewState) value, null, false, false, 14)));
        return Unit.f24250a;
    }
}
