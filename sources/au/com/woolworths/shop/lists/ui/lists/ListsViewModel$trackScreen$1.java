package au.com.woolworths.shop.lists.ui.lists;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.ui.ListScreen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.ListsViewModel$trackScreen$1", f = "ListsViewModel.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ListsViewModel$trackScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public AnalyticsManager p;
    public ListScreen.Lists q;
    public TrackingMetadata.Companion r;
    public TrackableValue s;
    public int t;
    public final /* synthetic */ ListsViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListsViewModel$trackScreen$1(ListsViewModel listsViewModel, Continuation continuation) {
        super(2, continuation);
        this.u = listsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListsViewModel$trackScreen$1(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ListsViewModel$trackScreen$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsManager analyticsManager;
        ListScreen.Lists lists;
        TrackableValue trackableValue;
        TrackingMetadata.Companion companion;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.t;
        if (i == 0) {
            ResultKt.b(obj);
            ListsViewModel listsViewModel = this.u;
            analyticsManager = listsViewModel.e;
            ListScreen.Lists lists2 = new ListScreen.Lists(listsViewModel.h.a());
            TrackableValue trackableValue2 = TrackableValue.F0;
            ShoppingListInteractor shoppingListInteractor = listsViewModel.g;
            this.p = analyticsManager;
            this.q = lists2;
            TrackingMetadata.Companion companion2 = TrackingMetadata.f;
            this.r = companion2;
            this.s = trackableValue2;
            this.t = 1;
            obj = shoppingListInteractor.f12257a.c(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            lists = lists2;
            trackableValue = trackableValue2;
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trackableValue = this.s;
            companion = this.r;
            lists = this.q;
            analyticsManager = this.p;
            ResultKt.b(obj);
        }
        String strValueOf = String.valueOf(((Number) obj).intValue());
        companion.getClass();
        analyticsManager.e(lists, TrackingMetadata.Companion.a(trackableValue, strValueOf));
        return Unit.f24250a;
    }
}
