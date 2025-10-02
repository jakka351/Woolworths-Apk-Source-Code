package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositioningInteractor;", "", "PositioningState", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PositioningInteractor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositioningInteractor$PositioningState;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PositioningState {
        public static final PositioningState d;
        public static final PositioningState e;
        public static final PositioningState f;
        public static final /* synthetic */ PositioningState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PositioningState positioningState = new PositioningState("IDLE", 0);
            d = positioningState;
            PositioningState positioningState2 = new PositioningState("CALIBRATING", 1);
            e = positioningState2;
            PositioningState positioningState3 = new PositioningState("POSITIONING", 2);
            f = positioningState3;
            PositioningState[] positioningStateArr = {positioningState, positioningState2, positioningState3};
            g = positioningStateArr;
            h = EnumEntriesKt.a(positioningStateArr);
        }

        public static PositioningState valueOf(String str) {
            return (PositioningState) Enum.valueOf(PositioningState.class, str);
        }

        public static PositioningState[] values() {
            return (PositioningState[]) g.clone();
        }
    }

    StateFlow a();

    void b(boolean z);

    StateFlow c();

    Object d(String str, Integer num, Continuation continuation);

    Object e(SuspendLambda suspendLambda);

    StateFlow f();

    boolean g();

    StateFlow getCurrentPosition();

    SharedFlowImpl getErrors();

    StateFlow h();
}
