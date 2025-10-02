package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.checkout.data.source.MutationErrorException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.PreferenceId;
import au.com.woolworths.shop.checkout.domain.model.PreferenceText;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
import au.com.woolworths.shop.checkout.ui.content.SnackBarErrorType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel$onUpdatePreferenceText$2", f = "CheckoutDetailsViewModel.kt", l = {196}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutDetailsViewModel$onUpdatePreferenceText$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutDetailsViewModel p;
    public PreferenceId q;
    public String r;
    public CheckoutDetailsViewModel s;
    public int t;
    public int u;
    public final /* synthetic */ CheckoutDetailsViewModel v;
    public final /* synthetic */ PreferenceId w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDetailsViewModel$onUpdatePreferenceText$2(CheckoutDetailsViewModel checkoutDetailsViewModel, PreferenceId preferenceId, String str, Continuation continuation) {
        super(2, continuation);
        this.v = checkoutDetailsViewModel;
        this.w = preferenceId;
        this.x = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutDetailsViewModel$onUpdatePreferenceText$2(this.v, this.w, this.x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDetailsViewModel$onUpdatePreferenceText$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CheckoutDetailsViewModel checkoutDetailsViewModel;
        PreferenceId preferenceId;
        CheckoutDetailsViewModel checkoutDetailsViewModel2;
        String str;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.u;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(obj);
            checkoutDetailsViewModel = this.v;
            MutableStateFlow mutableStateFlow = checkoutDetailsViewModel.j;
            Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).d;
            preferenceId = this.w;
            String str2 = this.x;
            if (checkout != null) {
                List list = checkout.b;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                for (Object objA : list) {
                    PreferenceText preferenceText = objA instanceof PreferenceText ? (PreferenceText) objA : null;
                    if ((preferenceText != null ? preferenceText.f10630a : null) == preferenceId) {
                        objA = PreferenceText.a((PreferenceText) objA, str2, null, null, 959);
                    }
                    arrayList.add(objA);
                }
                mutableStateFlow.setValue(CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) mutableStateFlow.getValue(), true, Checkout.a(checkout, arrayList, 1021), null, 246));
            }
            try {
                CheckoutContentInteractor checkoutContentInteractor = checkoutDetailsViewModel.o;
                this.p = checkoutDetailsViewModel;
                this.q = preferenceId;
                this.r = str2;
                this.s = checkoutDetailsViewModel;
                this.t = 1;
                this.u = 1;
                obj = checkoutContentInteractor.b(preferenceId, str2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = 1;
                str = str2;
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
            } catch (NoConnectivityException unused) {
                str = str2;
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                CheckoutDetailsViewModel.I6(checkoutDetailsViewModel2, checkoutDetailsViewModel2.j, preferenceId, str, new SnackBarErrorType.Network(3, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                str = str2;
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                CheckoutDetailsViewModel.I6(checkoutDetailsViewModel2, checkoutDetailsViewModel2.j, preferenceId, str, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            } catch (MutationErrorException e) {
                e = e;
                str = str2;
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                CheckoutDetailsViewModel.I6(checkoutDetailsViewModel2, checkoutDetailsViewModel2.j, preferenceId, str, new SnackBarErrorType.Server(e.d.b, null, null, 6));
                return Unit.f24250a;
            } catch (IllegalArgumentException e2) {
                e = e2;
                checkoutDetailsViewModel2 = checkoutDetailsViewModel;
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.t;
            checkoutDetailsViewModel = this.s;
            str = this.r;
            preferenceId = this.q;
            checkoutDetailsViewModel2 = this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused3) {
                CheckoutDetailsViewModel.I6(checkoutDetailsViewModel2, checkoutDetailsViewModel2.j, preferenceId, str, new SnackBarErrorType.Network(3, null));
                return Unit.f24250a;
            } catch (ServerErrorException unused4) {
                CheckoutDetailsViewModel.I6(checkoutDetailsViewModel2, checkoutDetailsViewModel2.j, preferenceId, str, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            } catch (MutationErrorException e3) {
                e = e3;
                CheckoutDetailsViewModel.I6(checkoutDetailsViewModel2, checkoutDetailsViewModel2.j, preferenceId, str, new SnackBarErrorType.Server(e.d.b, null, null, 6));
                return Unit.f24250a;
            } catch (IllegalArgumentException e4) {
                e = e4;
                Bark.Companion companion2 = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutDetailsViewModel2.B6(checkoutDetailsViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        }
        Checkout checkout2 = (Checkout) obj;
        if (i == 0) {
            z = false;
        }
        checkoutDetailsViewModel.y6(checkout2, z);
        return Unit.f24250a;
    }
}
