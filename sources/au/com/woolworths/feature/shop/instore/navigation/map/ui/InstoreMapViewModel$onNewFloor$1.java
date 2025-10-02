package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$onNewFloor$1", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$onNewFloor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Floor p;
    public final /* synthetic */ InstoreMapViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$onNewFloor$1(Floor floor, InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = floor;
        this.q = instoreMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapViewModel$onNewFloor$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InstoreMapViewModel$onNewFloor$1 instoreMapViewModel$onNewFloor$1 = (InstoreMapViewModel$onNewFloor$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        instoreMapViewModel$onNewFloor$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Unit unit = Unit.f24250a;
        Floor floor = this.p;
        if (floor == null) {
            return unit;
        }
        InstoreMapViewModel instoreMapViewModel = this.q;
        if (instoreMapViewModel.x6()) {
            BuildersKt.c(ViewModelKt.a(instoreMapViewModel), null, null, new InstoreMapViewModel$fetchMapForFloor$1(floor, instoreMapViewModel, null), 3);
            return unit;
        }
        instoreMapViewModel.A6();
        return unit;
    }
}
