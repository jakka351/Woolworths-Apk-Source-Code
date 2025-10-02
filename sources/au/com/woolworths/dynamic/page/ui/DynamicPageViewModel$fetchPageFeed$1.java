package au.com.woolworths.dynamic.page.ui;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.dynamic.page.data.DynamicPageErrorState;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.interactor.DynamicPageInteractorImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.dynamic.page.ui.DynamicPageViewModel$fetchPageFeed$1", f = "DynamicPageViewModel.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DynamicPageViewModel$fetchPageFeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ DynamicPageViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPageViewModel$fetchPageFeed$1(DynamicPageViewModel dynamicPageViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = dynamicPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicPageViewModel$fetchPageFeed$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicPageViewModel$fetchPageFeed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        DynamicPageViewModel dynamicPageViewModel = this.q;
        MutableStateFlow mutableStateFlow3 = dynamicPageViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    DynamicPageViewModel.r6(dynamicPageViewModel, dynamicPageViewModel.j, true, null, null, null, null, 30);
                    if (dynamicPageViewModel.g.z()) {
                        BuildersKt.c(ViewModelKt.a(dynamicPageViewModel), null, null, new DynamicPageViewModel$loadCartIcon$1(dynamicPageViewModel, null), 3);
                    }
                    DynamicPageInteractorImpl dynamicPageInteractorImpl = dynamicPageViewModel.f;
                    String str = dynamicPageViewModel.e;
                    List listA = dynamicPageViewModel.i.a();
                    List list = DynamicPageViewModel.n;
                    this.p = 1;
                    try {
                        obj = dynamicPageInteractorImpl.f5189a.a(str, listA, list, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (ServerErrorException unused) {
                        mutableStateFlow2 = mutableStateFlow3;
                        mutableStateFlow = mutableStateFlow2;
                        DynamicPageViewModel.r6(dynamicPageViewModel, mutableStateFlow, false, null, null, DynamicPageErrorState.e, null, 18);
                        return Unit.f24250a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                DynamicPageFeedData dynamicPageFeedData = (DynamicPageFeedData) obj;
                if (dynamicPageFeedData.b.isEmpty()) {
                    mutableStateFlow = mutableStateFlow3;
                    try {
                        DynamicPageViewModel.r6(dynamicPageViewModel, mutableStateFlow, false, null, null, DynamicPageErrorState.e, null, 18);
                        mutableStateFlow2 = mutableStateFlow;
                    } catch (NoConnectivityException unused2) {
                        mutableStateFlow2 = mutableStateFlow;
                        DynamicPageViewModel.r6(dynamicPageViewModel, mutableStateFlow2, false, null, null, DynamicPageErrorState.d, null, 18);
                        return Unit.f24250a;
                    } catch (ServerErrorException unused3) {
                        DynamicPageViewModel.r6(dynamicPageViewModel, mutableStateFlow, false, null, null, DynamicPageErrorState.e, null, 18);
                        return Unit.f24250a;
                    }
                } else {
                    mutableStateFlow2 = mutableStateFlow3;
                    try {
                        DynamicPageViewModel.r6(dynamicPageViewModel, dynamicPageViewModel.j, false, null, dynamicPageFeedData, null, null, 26);
                    } catch (NoConnectivityException unused4) {
                        DynamicPageViewModel.r6(dynamicPageViewModel, mutableStateFlow2, false, null, null, DynamicPageErrorState.d, null, 18);
                        return Unit.f24250a;
                    } catch (ServerErrorException unused5) {
                        mutableStateFlow = mutableStateFlow2;
                        DynamicPageViewModel.r6(dynamicPageViewModel, mutableStateFlow, false, null, null, DynamicPageErrorState.e, null, 18);
                        return Unit.f24250a;
                    }
                }
                dynamicPageViewModel.h.f(dynamicPageViewModel.q6());
            } catch (ServerErrorException unused6) {
                mutableStateFlow = mutableStateFlow3;
            }
        } catch (NoConnectivityException unused7) {
            mutableStateFlow2 = mutableStateFlow3;
        }
        return Unit.f24250a;
    }
}
