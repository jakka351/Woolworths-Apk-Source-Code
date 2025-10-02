package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.ipssdk.realtime.ips.SdkNavigationPositioningProvider;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.navigation.common.models.NavigationPosition;

/* loaded from: classes8.dex */
public final class N4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25983a;
    public final /* synthetic */ Position b;
    public final /* synthetic */ SdkNavigationPositioningProvider c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(Position position, SdkNavigationPositioningProvider sdkNavigationPositioningProvider, Continuation continuation) {
        super(2, continuation);
        this.b = position;
        this.c = sdkNavigationPositioningProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new N4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new N4(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25983a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            Position position = this.b;
            if (position == null) {
                this.c.setCurrentPosition(null);
                return unit;
            }
            NavigationPosition navigationPosition$me_oriient_sdk_realtime = position.toNavigationPosition$me_oriient_sdk_realtime(SdkNavigationPositioningProvider.access$getTimeProvider(this.c).getTimeZoneGmt());
            this.c.setCurrentPosition(navigationPosition$me_oriient_sdk_realtime);
            MutableSharedFlow<NavigationPosition> positionUpdates = this.c.getPositionUpdates();
            this.f25983a = 1;
            if (positionUpdates.emit(navigationPosition$me_oriient_sdk_realtime, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
