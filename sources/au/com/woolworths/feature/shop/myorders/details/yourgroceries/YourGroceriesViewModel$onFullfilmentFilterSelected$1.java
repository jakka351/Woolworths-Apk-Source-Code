package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesHeaderGroupItem;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$onFullfilmentFilterSelected$1", f = "YourGroceriesViewModel.kt", l = {167}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class YourGroceriesViewModel$onFullfilmentFilterSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public YourGroceriesContract.ViewState p;
    public Object q;
    public Object r;
    public int s;
    public final /* synthetic */ YourGroceriesViewModel t;
    public final /* synthetic */ YourGroceriesFilterGroupItem.YourGroceriesFilterItem u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourGroceriesViewModel$onFullfilmentFilterSelected$1(YourGroceriesViewModel yourGroceriesViewModel, YourGroceriesFilterGroupItem.YourGroceriesFilterItem yourGroceriesFilterItem, Continuation continuation) {
        super(2, continuation);
        this.t = yourGroceriesViewModel;
        this.u = yourGroceriesFilterItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YourGroceriesViewModel$onFullfilmentFilterSelected$1(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((YourGroceriesViewModel$onFullfilmentFilterSelected$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        YourGroceriesHeaderGroupItem yourGroceriesHeaderGroupItem;
        Object next;
        YourGroceriesContract.ViewState viewState;
        MutableStateFlow mutableStateFlow;
        YourGroceriesContract.ViewState viewState2;
        YourGroceriesViewModel yourGroceriesViewModel = this.t;
        MutableStateFlow mutableStateFlow2 = yourGroceriesViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            Iterator it = yourGroceriesViewModel.s6().b.iterator();
            while (true) {
                yourGroceriesHeaderGroupItem = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((YourGroceriesContract.YourGroceriesItem) next) instanceof YourGroceriesHeaderGroupItem) {
                    break;
                }
            }
            YourGroceriesHeaderGroupItem yourGroceriesHeaderGroupItem2 = next instanceof YourGroceriesHeaderGroupItem ? (YourGroceriesHeaderGroupItem) next : null;
            YourGroceriesFilterGroupItem.YourGroceriesFilterItem yourGroceriesFilterItem = this.u;
            if (yourGroceriesHeaderGroupItem2 != null) {
                YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem = yourGroceriesHeaderGroupItem2.f7706a;
                if (yourGroceriesFilterGroupItem != null) {
                    List<YourGroceriesFilterGroupItem.YourGroceriesFilterItem> list = yourGroceriesFilterGroupItem.f7703a;
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                    for (YourGroceriesFilterGroupItem.YourGroceriesFilterItem yourGroceriesFilterItem2 : list) {
                        arrayList.add(new YourGroceriesFilterGroupItem.YourGroceriesFilterItem(yourGroceriesFilterItem2.f7704a, yourGroceriesFilterItem2.b, yourGroceriesFilterItem2.f7704a.equals(yourGroceriesFilterItem.f7704a), yourGroceriesFilterItem2.d));
                    }
                    yourGroceriesHeaderGroupItem = new YourGroceriesHeaderGroupItem(new YourGroceriesFilterGroupItem(arrayList), yourGroceriesHeaderGroupItem2.b);
                } else {
                    yourGroceriesHeaderGroupItem = yourGroceriesHeaderGroupItem2;
                }
            }
            YourGroceriesContract.ViewState viewStateS6 = yourGroceriesViewModel.s6();
            mutableStateFlow2.setValue(new YourGroceriesContract.ViewState(true, YourGroceriesViewModel.p6(CollectionsKt.S(yourGroceriesHeaderGroupItem)), null, null, null, EmptyMap.d, 8));
            try {
                this.p = viewStateS6;
                this.q = mutableStateFlow2;
                this.r = mutableStateFlow2;
                this.s = 1;
                obj = yourGroceriesViewModel.q6(yourGroceriesFilterItem, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableStateFlow = mutableStateFlow2;
                viewState = viewStateS6;
            } catch (Exception unused) {
                viewState = viewStateS6;
                viewState2 = viewState;
                mutableStateFlow2.setValue(viewState2);
                return Unit.f24250a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = (MutableStateFlow) this.r;
            mutableStateFlow = (MutableStateFlow) this.q;
            viewState = this.p;
            try {
                ResultKt.b(obj);
            } catch (Exception unused2) {
                mutableStateFlow2 = mutableStateFlow;
                viewState2 = viewState;
                mutableStateFlow2.setValue(viewState2);
                return Unit.f24250a;
            }
        }
        viewState2 = (YourGroceriesContract.ViewState) obj;
        mutableStateFlow2.setValue(viewState2);
        return Unit.f24250a;
    }
}
