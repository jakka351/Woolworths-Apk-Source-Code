package au.com.woolworths.feature.shop.shippingcalculator.data;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/data/ShippingCalculatorDataStoreImpl;", "Lau/com/woolworths/foundation/shop/shippingcalculator/data/ShippingCalculatorDataStore;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShippingCalculatorDataStoreImpl implements ShippingCalculatorDataStore {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8104a;
    public final PreferenceDataStoreSingletonDelegate b;
    public static final /* synthetic */ KProperty[] d = {Reflection.f24268a.i(new PropertyReference2Impl(ShippingCalculatorDataStoreImpl.class))};
    public static final Companion c = new Companion();
    public static final Preferences.Key e = PreferencesKeys.c("postcode_key");
    public static final Preferences.Key f = PreferencesKeys.c("suburb_key");

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/data/ShippingCalculatorDataStoreImpl$Companion;", "", "", "FILE_NAME", "Ljava/lang/String;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShippingCalculatorDataStoreImpl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f8104a = context;
        this.b = PreferenceDataStoreDelegateKt.a("shipping_calculator_data", new ReplaceFileCorruptionHandler(new a()), null, 12);
    }

    @Override // au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore
    public final Object a(Continuation continuation) {
        Object objA = PreferencesKt.a(f(this.f8104a), new ShippingCalculatorDataStoreImpl$clear$2(2, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    @Override // au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore
    public final String b() {
        return (String) BuildersKt.d(EmptyCoroutineContext.d, new ShippingCalculatorDataStoreImpl$getSuburb$1(this, null));
    }

    @Override // au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore
    public final Flow c() {
        final Flow d2 = f(this.f8104a).getD();
        return FlowKt.r(new Flow<Pair<? extends String, ? extends String>>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1$2", f = "ShippingCalculatorDataStoreImpl.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1$2$1 r0 = (au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1$2$1 r0 = new au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r7)
                        goto L50
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        kotlin.ResultKt.b(r7)
                        androidx.datastore.preferences.core.Preferences r6 = (androidx.datastore.preferences.core.Preferences) r6
                        kotlin.Pair r7 = new kotlin.Pair
                        androidx.datastore.preferences.core.Preferences$Key r2 = au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl.e
                        java.lang.Object r2 = r6.b(r2)
                        androidx.datastore.preferences.core.Preferences$Key r4 = au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl.f
                        java.lang.Object r6 = r6.b(r4)
                        r7.<init>(r2, r6)
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r5.d
                        java.lang.Object r6 = r6.emit(r7, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        kotlin.Unit r6 = kotlin.Unit.f24250a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl$getShippingInfoFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = d2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        });
    }

    @Override // au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore
    public final void d(String postcode, String suburb) throws Throwable {
        Intrinsics.h(postcode, "postcode");
        Intrinsics.h(suburb, "suburb");
        BuildersKt.d(EmptyCoroutineContext.d, new ShippingCalculatorDataStoreImpl$setShippingInfo$1(this, postcode, suburb, null));
    }

    @Override // au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore
    public final String e() {
        return (String) BuildersKt.d(EmptyCoroutineContext.d, new ShippingCalculatorDataStoreImpl$getPostcode$1(this, null));
    }

    public final DataStore f(Context context) {
        return (DataStore) this.b.getValue(context, d[0]);
    }
}
