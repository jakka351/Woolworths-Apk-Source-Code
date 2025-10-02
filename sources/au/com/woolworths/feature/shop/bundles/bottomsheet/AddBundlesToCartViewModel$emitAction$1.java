package au.com.woolworths.feature.shop.bundles.bottomsheet;

import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesBottomSheetContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel$emitAction$1", f = "AddBundlesToCartViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddBundlesToCartViewModel$emitAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ AddBundlesToCartViewModel p;
    public final /* synthetic */ AddBundlesBottomSheetContract.Actions q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddBundlesToCartViewModel$emitAction$1(AddBundlesToCartViewModel addBundlesToCartViewModel, AddBundlesBottomSheetContract.Actions actions, Continuation continuation) {
        super(2, continuation);
        this.p = addBundlesToCartViewModel;
        this.q = actions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddBundlesToCartViewModel$emitAction$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AddBundlesToCartViewModel$emitAction$1 addBundlesToCartViewModel$emitAction$1 = (AddBundlesToCartViewModel$emitAction$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        addBundlesToCartViewModel$emitAction$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.l.k(this.q);
        return Unit.f24250a;
    }
}
