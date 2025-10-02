package au.com.woolworths.feature.shop.shippingcalculator.data;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$setShippingInfo$1", f = "ShippingCalculatorDataStoreImpl.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ShippingCalculatorDataStoreImpl$setShippingInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Preferences>, Object> {
    public int p;
    public final /* synthetic */ ShippingCalculatorDataStoreImpl q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$setShippingInfo$1$1", f = "ShippingCalculatorDataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$setShippingInfo$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.q = str;
            this.r = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, this.r, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((MutablePreferences) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.p;
            ShippingCalculatorDataStoreImpl.Companion companion = ShippingCalculatorDataStoreImpl.c;
            companion.getClass();
            mutablePreferences.e(ShippingCalculatorDataStoreImpl.e, this.q);
            companion.getClass();
            mutablePreferences.e(ShippingCalculatorDataStoreImpl.f, this.r);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingCalculatorDataStoreImpl$setShippingInfo$1(ShippingCalculatorDataStoreImpl shippingCalculatorDataStoreImpl, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = shippingCalculatorDataStoreImpl;
        this.r = str;
        this.s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShippingCalculatorDataStoreImpl$setShippingInfo$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShippingCalculatorDataStoreImpl$setShippingInfo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        ShippingCalculatorDataStoreImpl shippingCalculatorDataStoreImpl = this.q;
        DataStore dataStoreF = shippingCalculatorDataStoreImpl.f(shippingCalculatorDataStoreImpl.f8104a);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, null);
        this.p = 1;
        Object objA = PreferencesKt.a(dataStoreF, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
