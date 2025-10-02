package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnchoredDraggableState<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f868a;
    public final MutatorMutex b;
    public final MutableState c;
    public final MutableState d;
    public final State e;
    public final MutableFloatState f;
    public final State g;
    public final MutableFloatState h;
    public final MutableState i;
    public final MutableState j;
    public final AnchoredDraggableState$anchoredDragScope$1 k;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Object, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public AnchoredDraggableState(Object obj) {
        this.f868a = AnchoredDraggableState$confirmValueChange$1.h;
        this.b = new MutatorMutex();
        this.c = SnapshotStateKt.f(obj);
        this.d = SnapshotStateKt.f(obj);
        this.e = SnapshotStateKt.d(new Function0<Object>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$targetValue$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objB;
                AnchoredDraggableState anchoredDraggableState = this.h;
                MutableFloatState mutableFloatState = anchoredDraggableState.f;
                Object d = ((SnapshotMutableStateImpl) anchoredDraggableState.i).getD();
                if (d != null) {
                    return d;
                }
                MutableState mutableState = anchoredDraggableState.c;
                return (Float.isNaN(((SnapshotMutableFloatStateImpl) mutableFloatState).a()) || (objB = anchoredDraggableState.a().b(((SnapshotMutableFloatStateImpl) mutableFloatState).a())) == null) ? ((SnapshotMutableStateImpl) mutableState).getD() : objB;
            }
        });
        this.f = PrimitiveSnapshotStateKt.a(Float.NaN);
        this.g = SnapshotStateKt.c(SnapshotStateKt.n(), new Function0<Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$progress$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnchoredDraggableState anchoredDraggableState = this.h;
                float fC = anchoredDraggableState.a().c(((SnapshotMutableStateImpl) anchoredDraggableState.d).getD());
                float fC2 = anchoredDraggableState.a().c(anchoredDraggableState.e.getD()) - fC;
                float fAbs = Math.abs(fC2);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    MutableFloatState mutableFloatState = anchoredDraggableState.f;
                    if (Float.isNaN(((SnapshotMutableFloatStateImpl) mutableFloatState).a())) {
                        InlineClassHelperKt.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                    }
                    float fA = (((SnapshotMutableFloatStateImpl) mutableFloatState).a() - fC) / fC2;
                    if (fA < 1.0E-6f) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else if (fA <= 0.999999f) {
                        f = fA;
                    }
                }
                return Float.valueOf(f);
            }
        });
        this.h = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
        this.i = SnapshotStateKt.f(null);
        Function1 function1 = AnchoredDraggableKt.f865a;
        this.j = SnapshotStateKt.f(new DefaultDraggableAnchors(new float[0]));
        this.k = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public final DraggableAnchors a() {
        return (DraggableAnchors) ((SnapshotMutableStateImpl) this.j).getD();
    }

    public AnchoredDraggableState(Object obj, int i) {
        this(obj);
        this.f868a = null;
    }
}
