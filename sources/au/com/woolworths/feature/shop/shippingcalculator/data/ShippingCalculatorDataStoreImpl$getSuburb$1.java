package au.com.woolworths.feature.shop.shippingcalculator.data;

import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getSuburb$1", f = "ShippingCalculatorDataStoreImpl.kt", l = {38}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ShippingCalculatorDataStoreImpl$getSuburb$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public int p;
    public final /* synthetic */ ShippingCalculatorDataStoreImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingCalculatorDataStoreImpl$getSuburb$1(ShippingCalculatorDataStoreImpl shippingCalculatorDataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.q = shippingCalculatorDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShippingCalculatorDataStoreImpl$getSuburb$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShippingCalculatorDataStoreImpl$getSuburb$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShippingCalculatorDataStoreImpl shippingCalculatorDataStoreImpl = this.q;
            Flow d = shippingCalculatorDataStoreImpl.f(shippingCalculatorDataStoreImpl.f8104a).getD();
            this.p = 1;
            obj = FlowKt.y(d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Preferences preferences = (Preferences) obj;
        if (preferences == null) {
            return null;
        }
        ShippingCalculatorDataStoreImpl.c.getClass();
        return (String) preferences.b(ShippingCalculatorDataStoreImpl.f);
    }
}
