package au.com.woolworths.feature.shared.receipt.details;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetails;
import kotlin.Metadata;
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
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsViewModel$fetchEReceiptDetails$1", f = "EReceiptDetailsViewModel.kt", l = {51}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EReceiptDetailsViewModel$fetchEReceiptDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EReceiptDetailsViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EReceiptDetailsViewModel$fetchEReceiptDetails$1(EReceiptDetailsViewModel eReceiptDetailsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = eReceiptDetailsViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EReceiptDetailsViewModel$fetchEReceiptDetails$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EReceiptDetailsViewModel$fetchEReceiptDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EReceiptDetailsViewModel eReceiptDetailsViewModel = this.q;
        MutableLiveData mutableLiveData = eReceiptDetailsViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        String str = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                EReceiptDetailsInteractor eReceiptDetailsInteractor = eReceiptDetailsViewModel.e;
                this.p = 1;
                obj = eReceiptDetailsInteractor.f6553a.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            EReceiptDetailsViewModel.r6(eReceiptDetailsViewModel, eReceiptDetailsViewModel.h, false, false, (EReceiptDetails) obj, false, null, 26);
        } catch (NoConnectivityException unused) {
            EReceiptDetailsViewModel.r6(eReceiptDetailsViewModel, mutableLiveData, false, false, null, false, EReceiptDetailsFullPageErrorState.f, 8);
        } catch (ServerErrorException e) {
            ServerError serverErrorD = ExceptionExtKt.d(e.d, ServerErrorCode.h, ServerErrorCode.g, ServerErrorCode.f);
            if (serverErrorD != null) {
                String str2 = serverErrorD.b;
                EReceiptDetailsFullPageErrorState eReceiptDetailsFullPageErrorState = EReceiptDetailsFullPageErrorState.e;
                Intrinsics.e(str2);
                PlainText plainText = new PlainText(str2);
                eReceiptDetailsFullPageErrorState.getClass();
                eReceiptDetailsFullPageErrorState.d = plainText;
                EReceiptDetailsViewModel.r6(eReceiptDetailsViewModel, mutableLiveData, false, false, null, false, eReceiptDetailsFullPageErrorState, 10);
                Timber.Forest forest = Timber.f27013a;
                forest.s("EReceiptServerError");
                forest.e(str2 + " - id=" + str, new Object[0]);
            } else {
                EReceiptDetailsViewModel.r6(eReceiptDetailsViewModel, mutableLiveData, false, false, null, false, EReceiptDetailsFullPageErrorState.g, 8);
                Timber.Forest forest2 = Timber.f27013a;
                forest2.s("EReceiptServerError");
                forest2.e("Unknown - id=" + str, new Object[0]);
            }
        }
        return Unit.f24250a;
    }
}
