package au.com.woolworths.feature.shop.shippingcalculator.data;

import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$clear$2", f = "ShippingCalculatorDataStoreImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ShippingCalculatorDataStoreImpl$clear$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShippingCalculatorDataStoreImpl$clear$2 shippingCalculatorDataStoreImpl$clear$2 = new ShippingCalculatorDataStoreImpl$clear$2(2, continuation);
        shippingCalculatorDataStoreImpl$clear$2.p = obj;
        return shippingCalculatorDataStoreImpl$clear$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ShippingCalculatorDataStoreImpl$clear$2 shippingCalculatorDataStoreImpl$clear$2 = (ShippingCalculatorDataStoreImpl$clear$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        shippingCalculatorDataStoreImpl$clear$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.p;
        mutablePreferences.c();
        mutablePreferences.f2587a.clear();
        return Unit.f24250a;
    }
}
