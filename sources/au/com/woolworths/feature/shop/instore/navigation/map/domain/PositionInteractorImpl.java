package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.feature.shop.instore.navigation.map.data.IpsCoordinateExtKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientHeading;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.services.PositioningService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.listeners.IPSPositioningListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSFloor;
import me.oriient.ipssdk.api.models.IPSHeading;
import me.oriient.ipssdk.api.models.IPSPosition;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.ips.IPSCore;
import me.oriient.ipssdk.ips.IPSPositioning;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositionInteractorImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositioningInteractor;", "PositioningListener", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PositionInteractorImpl implements PositioningInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7369a;
    public final MutableStateFlow b;
    public final MutableStateFlow c;
    public final MutableStateFlow d;
    public final MutableStateFlow e;
    public final MutableStateFlow f;
    public final MutableStateFlow g;
    public final SharedFlowImpl h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositionInteractorImpl$PositioningListener;", "Lme/oriient/ipssdk/api/listeners/IPSPositioningListener;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class PositioningListener implements IPSPositioningListener {
        public PositioningListener() {
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
        public final void onCalibrationGestureNeeded(boolean z) {
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
        public final void onCalibrationProgress(double d) {
            Timber.f27013a.b("Oriient onCalibrationProgress() called with: progress = " + d, new Object[0]);
            PositionInteractorImpl.this.g.setValue(Double.valueOf(d));
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSFailable
        public final void onError(IPSError ipsError) {
            Intrinsics.h(ipsError, "ipsError");
            ipsError.toString();
            Timber.f27013a.o("Oriient onError() called with: ipsError = " + ipsError, new Object[0]);
            PositionInteractorImpl.this.h.f(OriientErrorKt.a(ipsError));
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
        public final void onFloorChanged(IPSFloor ipsFloor) {
            Intrinsics.h(ipsFloor, "ipsFloor");
            Timber.f27013a.b("Oriient onFloorChanged() called with: ipsFloor = " + ipsFloor, new Object[0]);
            PositionInteractorImpl.this.e.setValue(Integer.valueOf(ipsFloor.getOrder()));
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
        public final void onPositionUpdate(IPSPosition ipsPosition) {
            Intrinsics.h(ipsPosition, "ipsPosition");
            Timber.f27013a.b("Oriient onPositionUpdate() called with: position = " + ipsPosition, new Object[0]);
            MutableStateFlow mutableStateFlow = PositionInteractorImpl.this.d;
            OriientMetersCoordinate oriientMetersCoordinateA = IpsCoordinateExtKt.a(ipsPosition);
            IPSHeading d = ipsPosition.getD();
            Intrinsics.g(d, "getHeading(...)");
            OriientHeading oriientHeading = new OriientHeading(d.getF26195a(), d.getB());
            IPSHeading e = ipsPosition.getE();
            Intrinsics.g(e, "getMainOrientation(...)");
            OriientHeading oriientHeading2 = new OriientHeading(e.getF26195a(), e.getB());
            double c = ipsPosition.getC();
            boolean z = ipsPosition.getL() >= IPSPositioning.getTestLockThreshold();
            double dA = RangesKt.a(ipsPosition.getL() * 100, 0.0d, 100.0d);
            String f = ipsPosition.getF();
            Intrinsics.g(f, "getFloorId(...)");
            mutableStateFlow.setValue(new OriientPosition(oriientMetersCoordinateA, oriientHeading, oriientHeading2, c, z, dA, f, ipsPosition.getB()));
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
        public final void onPositioningEngineStateChanged(int i) {
            PositioningInteractor.PositioningState positioningState;
            PositionInteractorImpl positionInteractorImpl = PositionInteractorImpl.this;
            Context context = positionInteractorImpl.f7369a;
            Timber.f27013a.b("Oriient onPositioningEngineStateChanged() called with: state = " + i + " " + Unit.f24250a, new Object[0]);
            MutableStateFlow mutableStateFlow = positionInteractorImpl.c;
            if (i == 0) {
                context.stopService(new Intent(context, (Class<?>) PositioningService.class));
                positioningState = PositioningInteractor.PositioningState.d;
            } else if (i == 1) {
                context.startService(new Intent(context, (Class<?>) PositioningService.class));
                positioningState = PositioningInteractor.PositioningState.e;
            } else if (i != 2) {
                positioningState = PositioningInteractor.PositioningState.d;
            } else {
                context.startService(new Intent(context, (Class<?>) PositioningService.class));
                positioningState = PositioningInteractor.PositioningState.f;
            }
            mutableStateFlow.setValue(positioningState);
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
        public final void onCalibrationGestureNeeded(boolean z, Integer num) {
            Timber.f27013a.b("Oriient onCalibrationGestureNeeded() called with: isCalibrationNeeded = " + z + ", reason = " + num, new Object[0]);
            PositionInteractorImpl.this.f.setValue(Boolean.valueOf(z));
        }
    }

    public PositionInteractorImpl(Context context, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        Intrinsics.h(context, "context");
        this.f7369a = context;
        List<Integer> missingSensors = IPSCore.getMissingSensors();
        Intrinsics.g(missingSensors, "getMissingSensors(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = missingSensors.iterator();
        while (true) {
            Sensor sensor = null;
            if (!it.hasNext()) {
                arrayList.isEmpty();
                this.b = StateFlowKt.a(null);
                this.c = StateFlowKt.a(PositioningInteractor.PositioningState.d);
                this.d = StateFlowKt.a(null);
                this.e = StateFlowKt.a(null);
                this.f = StateFlowKt.a(Boolean.FALSE);
                this.g = StateFlowKt.a(null);
                this.h = SharedFlowKt.a(0, 1, BufferOverflow.e);
                IPSPositioning.addPositioningListener(new PositioningListener());
                return;
            }
            Integer num = (Integer) it.next();
            Sensor.e.getClass();
            if (num != null && num.intValue() == 1) {
                sensor = Sensor.f;
            } else if (num != null && num.intValue() == 2) {
                sensor = Sensor.g;
            } else if (num != null && num.intValue() == 5) {
                sensor = Sensor.h;
            } else if (num != null && num.intValue() == 3) {
                sensor = Sensor.i;
            } else if (num != null && num.intValue() == 6) {
                sensor = Sensor.j;
            }
            if (sensor != null) {
                arrayList.add(sensor);
            }
        }
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final StateFlow a() {
        return this.b;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final void b(boolean z) {
        IPSPositioning.setAutomaticCalibrationEnabled(z);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final StateFlow c() {
        return this.c;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final Object d(final String str, final Integer num, Continuation continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        IPSPositioning.startPositioning(str, (Integer) null, (IPSStartingPosition) null, new IPSCompletionListener() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.domain.PositionInteractorImpl$startPositioning$2$1
            @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
            public final void onCompleted() {
                Timber.f27013a.b("Oriient startPositioning onCompleted() called", new Object[0]);
                PositionInteractorImpl positionInteractorImpl = this.f7371a;
                positionInteractorImpl.b.setValue(str);
                positionInteractorImpl.e.setValue(num);
                safeContinuation.resumeWith(new OriientResult.Success(Unit.f24250a));
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public final void onError(IPSError ipsError) {
                Intrinsics.h(ipsError, "ipsError");
                ipsError.toString();
                OriientError oriientErrorA = OriientErrorKt.a(ipsError);
                Timber.f27013a.o("Oriient startPositioning onError() called with: oriientError = " + oriientErrorA, new Object[0]);
                PositionInteractorImpl positionInteractorImpl = this.f7371a;
                positionInteractorImpl.b.setValue(null);
                positionInteractorImpl.e.setValue(null);
                positionInteractorImpl.h.f(oriientErrorA);
                safeContinuation.resumeWith(new OriientResult.Failure(oriientErrorA));
            }
        });
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final Object e(SuspendLambda suspendLambda) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(suspendLambda));
        IPSPositioning.stopPositioning(new IPSCompletionListener() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.domain.PositionInteractorImpl$stopPositioning$2$1
            @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
            public final void onCompleted() {
                Timber.f27013a.b("Oriient stopPositioning onCompleted() called", new Object[0]);
                PositionInteractorImpl positionInteractorImpl = this.f7372a;
                positionInteractorImpl.e.setValue(null);
                positionInteractorImpl.d.setValue(null);
                safeContinuation.resumeWith(new OriientResult.Success(Unit.f24250a));
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public final void onError(IPSError ipsError) {
                Intrinsics.h(ipsError, "ipsError");
                ipsError.toString();
                Timber.f27013a.o("Oriient stopPositioning onError() called with: ipsError = " + ipsError, new Object[0]);
                PositionInteractorImpl positionInteractorImpl = this.f7372a;
                positionInteractorImpl.e.setValue(null);
                positionInteractorImpl.d.setValue(null);
                safeContinuation.resumeWith(new OriientResult.Failure(OriientErrorKt.a(ipsError)));
            }
        });
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final StateFlow f() {
        return this.g;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final boolean g() {
        return IPSPositioning.isCalibrationGestureNeeded();
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final StateFlow getCurrentPosition() {
        return this.d;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    /* renamed from: getErrors, reason: from getter */
    public final SharedFlowImpl getH() {
        return this.h;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor
    public final StateFlow h() {
        return this.f;
    }
}
