package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1;
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
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.UserPositionMarkerKt$UserPositionMarker$2$1", f = "UserPositionMarker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class UserPositionMarkerKt$UserPositionMarker$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CoroutineScope p;
    public final /* synthetic */ InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1 q;
    public final /* synthetic */ MutableState r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.UserPositionMarkerKt$UserPositionMarker$2$1$1", f = "UserPositionMarker.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.UserPositionMarkerKt$UserPositionMarker$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1 q;
        public final /* synthetic */ MutableState r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1 instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.q = instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1;
            this.r = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final MutableState mutableState = this.r;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.UserPositionMarkerKt.UserPositionMarker.2.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        mutableState.setValue((UserPositionMarkerData) obj2);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (this.q.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPositionMarkerKt$UserPositionMarker$2$1(CoroutineScope coroutineScope, InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1 instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = coroutineScope;
        this.q = instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserPositionMarkerKt$UserPositionMarker$2$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        UserPositionMarkerKt$UserPositionMarker$2$1 userPositionMarkerKt$UserPositionMarker$2$1 = (UserPositionMarkerKt$UserPositionMarker$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        userPositionMarkerKt$UserPositionMarker$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        BuildersKt.c(this.p, null, null, new AnonymousClass1(this.q, this.r, null), 3);
        return Unit.f24250a;
    }
}
