package au.com.woolworths.feature.shop.homepage.presentation;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$1", f = "FlowExt.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowExtKt$throttleFirst$1 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$throttleFirst$1(Ref.ObjectRef objectRef, Continuation continuation) {
        super(3, continuation);
        this.p = objectRef;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowExtKt$throttleFirst$1 flowExtKt$throttleFirst$1 = new FlowExtKt$throttleFirst$1(this.p, (Continuation) obj3);
        Unit unit = Unit.f24250a;
        flowExtKt$throttleFirst$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((Job) this.p.d).cancel((CancellationException) null);
        return Unit.f24250a;
    }
}
