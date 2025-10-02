package me.oriient.navigation.turnByTurn;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataModel.navigation.turnByTurn.TurnByTurnConfig;
import me.oriient.navigation.common.C1782x;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.common.InterfaceC1781w;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.turnByTurn.models.TurnAroundState;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g implements e {

    @NotNull
    private static final f Companion = new f();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26365a;
    public final Lazy b;
    public final Lazy c;
    public TurnAroundState d;
    public TurnAroundState e;
    public NavigationWaypoint f;
    public Long g;

    public g() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26365a = dependencyInjectionA.inject(reflectionFactory.b(InterfaceC1781w.class));
        this.b = DiKt.a().inject(reflectionFactory.b(TimeProvider.class));
        this.c = DiKt.a().inject(reflectionFactory.b(Logger.class));
    }

    public final TurnAroundState a(NavigationWaypoint navigationWaypoint, NavigationPosition navigationPosition, IndoorCoordinate indoorCoordinate, IndoorCoordinate indoorCoordinate2) {
        if (indoorCoordinate == null) {
            indoorCoordinate = navigationWaypoint.getCoordinate();
        }
        double dAngleBetweenVectorsFromPiToMinusPiDegrees = IndoorCoordinate.INSTANCE.angleBetweenVectorsFromPiToMinusPiDegrees(navigationPosition.getCoordinate(), new IndoorCoordinate(navigationPosition.getCoordinate().getX() + navigationPosition.getHeading().getX(), navigationPosition.getCoordinate().getY() + navigationPosition.getHeading().getY(), navigationPosition.getCoordinate().getZ()), indoorCoordinate2, indoorCoordinate);
        ((Logger) this.c.getD()).d("TurnAroundDetector", "angleDegrees = " + dAngleBetweenVectorsFromPiToMinusPiDegrees);
        double minTurnAroundEdgeValueDegrees = ((TurnByTurnConfig) ((C1782x) ((InterfaceC1781w) this.f26365a.getD())).b.getValue()).getMinTurnAroundEdgeValueDegrees();
        double maxTurnAroundEdgeValueDegrees = ((TurnByTurnConfig) ((C1782x) ((InterfaceC1781w) this.f26365a.getD())).b.getValue()).getMaxTurnAroundEdgeValueDegrees();
        if (minTurnAroundEdgeValueDegrees <= dAngleBetweenVectorsFromPiToMinusPiDegrees && dAngleBetweenVectorsFromPiToMinusPiDegrees <= maxTurnAroundEdgeValueDegrees) {
            return TurnAroundState.TURN_LEFT;
        }
        double d = -minTurnAroundEdgeValueDegrees;
        return (dAngleBetweenVectorsFromPiToMinusPiDegrees > d || (-maxTurnAroundEdgeValueDegrees) > dAngleBetweenVectorsFromPiToMinusPiDegrees) ? ((0.0d > dAngleBetweenVectorsFromPiToMinusPiDegrees || dAngleBetweenVectorsFromPiToMinusPiDegrees > minTurnAroundEdgeValueDegrees) && (d > dAngleBetweenVectorsFromPiToMinusPiDegrees || dAngleBetweenVectorsFromPiToMinusPiDegrees > 0.0d)) ? TurnAroundState.TURN_AROUND : TurnAroundState.NO_TURN_AROUND : TurnAroundState.TURN_RIGHT;
    }
}
