package androidx.compose.material.pullrefresh;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.dynatrace.android.compose.pullrefresh.PullRefreshComposeCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PullRefreshStateKt {
    public static final PullRefreshState a(final boolean z, Function0 function0, Composer composer, int i) {
        PullRefreshComposeCallback pullRefreshComposeCallback = new PullRefreshComposeCallback(function0);
        float f = PullRefreshDefaults.f1381a;
        float f2 = PullRefreshDefaults.b;
        if (Float.compare(f, 0) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (objG == obj) {
            objG = a.i(composer.y(), composer);
        }
        CoroutineScope coroutineScope = (CoroutineScope) objG;
        MutableState mutableStateL = SnapshotStateKt.l(pullRefreshComposeCallback, composer);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Density density = (Density) composer.x(CompositionLocalsKt.h);
        floatRef.d = density.T1(f);
        floatRef2.d = density.T1(f2);
        boolean zN = composer.n(coroutineScope);
        Object objG2 = composer.G();
        if (zN || objG2 == obj) {
            objG2 = new PullRefreshState(coroutineScope, mutableStateL, floatRef2.d, floatRef.d);
            composer.A(objG2);
        }
        final PullRefreshState pullRefreshState = (PullRefreshState) objG2;
        boolean zI = composer.I(pullRefreshState) | ((((i & 14) ^ 6) > 4 && composer.p(z)) || (i & 6) == 4) | composer.q(floatRef.d) | composer.q(floatRef2.d);
        Object objG3 = composer.G();
        if (zI || objG3 == obj) {
            objG3 = new Function0<Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshStateKt$rememberPullRefreshState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    PullRefreshState pullRefreshState2 = pullRefreshState;
                    boolean zB = pullRefreshState2.b();
                    CoroutineScope coroutineScope2 = pullRefreshState2.f1383a;
                    MutableFloatState mutableFloatState = pullRefreshState2.h;
                    boolean z2 = z;
                    if (zB != z2) {
                        ((SnapshotMutableStateImpl) pullRefreshState2.d).setValue(Boolean.valueOf(z2));
                        SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) pullRefreshState2.f;
                        float fA = BitmapDescriptorFactory.HUE_RED;
                        snapshotMutableFloatStateImpl.p(BitmapDescriptorFactory.HUE_RED);
                        if (z2) {
                            fA = ((SnapshotMutableFloatStateImpl) mutableFloatState).a();
                        }
                        BuildersKt.c(coroutineScope2, null, null, new PullRefreshState$animateIndicatorTo$1(pullRefreshState2, fA, null), 3);
                    }
                    ((SnapshotMutableFloatStateImpl) pullRefreshState2.g).p(floatRef.d);
                    float f3 = floatRef2.d;
                    SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl2 = (SnapshotMutableFloatStateImpl) mutableFloatState;
                    if (snapshotMutableFloatStateImpl2.a() != f3) {
                        snapshotMutableFloatStateImpl2.p(f3);
                        if (pullRefreshState2.b()) {
                            BuildersKt.c(coroutineScope2, null, null, new PullRefreshState$animateIndicatorTo$1(pullRefreshState2, f3, null), 3);
                        }
                    }
                    return Unit.f24250a;
                }
            };
            composer.A(objG3);
        }
        composer.g((Function0) objG3);
        return pullRefreshState;
    }
}
