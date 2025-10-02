package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSkeletonHeaderTile;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$fetchYourGroceries$1", f = "YourGroceriesViewModel.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class YourGroceriesViewModel$fetchYourGroceries$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object p;
    public Object q;
    public int r;
    public final /* synthetic */ YourGroceriesViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourGroceriesViewModel$fetchYourGroceries$1(YourGroceriesViewModel yourGroceriesViewModel, Continuation continuation) {
        super(2, continuation);
        this.s = yourGroceriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YourGroceriesViewModel$fetchYourGroceries$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((YourGroceriesViewModel$fetchYourGroceries$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        YourGroceriesContract.ViewState viewStateA;
        YourGroceriesViewModel yourGroceriesViewModel = this.s;
        MutableStateFlow mutableStateFlow2 = yourGroceriesViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        EmptyList emptyList = EmptyList.d;
        if (i == 0) {
            ResultKt.b(obj);
            mutableStateFlow2.setValue(YourGroceriesContract.ViewState.a(yourGroceriesViewModel.s6(), true, YourGroceriesViewModel.p6(CollectionsKt.Q(YourGroceriesSkeletonHeaderTile.f7708a)), null, null, 40));
            try {
                this.p = mutableStateFlow2;
                this.q = mutableStateFlow2;
                this.r = 1;
                obj = yourGroceriesViewModel.q6(null, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableStateFlow = mutableStateFlow2;
            } catch (NoConnectivityException unused) {
                viewStateA = YourGroceriesContract.ViewState.a(yourGroceriesViewModel.s6(), false, emptyList, YourGroceriesContract.ErrorState.e, null, 40);
                mutableStateFlow2.setValue(viewStateA);
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                viewStateA = YourGroceriesContract.ViewState.a(yourGroceriesViewModel.s6(), false, emptyList, YourGroceriesContract.ErrorState.d, null, 40);
                mutableStateFlow2.setValue(viewStateA);
                return Unit.f24250a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = (MutableStateFlow) this.q;
            mutableStateFlow = (MutableStateFlow) this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused3) {
                mutableStateFlow2 = mutableStateFlow;
                viewStateA = YourGroceriesContract.ViewState.a(yourGroceriesViewModel.s6(), false, emptyList, YourGroceriesContract.ErrorState.e, null, 40);
                mutableStateFlow2.setValue(viewStateA);
                return Unit.f24250a;
            } catch (ServerErrorException unused4) {
                mutableStateFlow2 = mutableStateFlow;
                viewStateA = YourGroceriesContract.ViewState.a(yourGroceriesViewModel.s6(), false, emptyList, YourGroceriesContract.ErrorState.d, null, 40);
                mutableStateFlow2.setValue(viewStateA);
                return Unit.f24250a;
            }
        }
        viewStateA = (YourGroceriesContract.ViewState) obj;
        mutableStateFlow2.setValue(viewStateA);
        return Unit.f24250a;
    }
}
