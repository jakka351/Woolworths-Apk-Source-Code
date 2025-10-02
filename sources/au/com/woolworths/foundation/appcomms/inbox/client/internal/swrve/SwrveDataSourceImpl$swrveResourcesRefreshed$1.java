package au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve;

import au.com.woolworths.feature.shop.delivery.address.a;
import com.swrve.sdk.SwrveSDKBase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl$swrveResourcesRefreshed$1", f = "SwrveDataSource.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SwrveDataSourceImpl$swrveResourcesRefreshed$1 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SwrveDataSourceImpl$swrveResourcesRefreshed$1 swrveDataSourceImpl$swrveResourcesRefreshed$1 = new SwrveDataSourceImpl$swrveResourcesRefreshed$1(2, continuation);
        swrveDataSourceImpl$swrveResourcesRefreshed$1.q = obj;
        return swrveDataSourceImpl$swrveResourcesRefreshed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SwrveDataSourceImpl$swrveResourcesRefreshed$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.q;
            a aVar = new a(producerScope, 18);
            SwrveSDKBase.a();
            SwrveSDKBase.f19075a.k(aVar);
            au.com.woolworths.feature.shop.bundles.ui.a aVar2 = new au.com.woolworths.feature.shop.bundles.ui.a(9);
            this.p = 1;
            if (ProduceKt.a(producerScope, aVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
