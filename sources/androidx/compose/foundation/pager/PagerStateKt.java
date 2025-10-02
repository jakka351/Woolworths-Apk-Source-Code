package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.layout.MeasureResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PagerStateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1093a = 56;
    public static final PagerMeasureResult b = new PagerMeasureResult(0, 0, 0, Orientation.e, 0, 0, 0, SnapPosition.Start.f917a, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1

        /* renamed from: a, reason: collision with root package name */
        public final Map f1094a = EmptyMap.d;

        @Override // androidx.compose.ui.layout.MeasureResult
        /* renamed from: getHeight */
        public final int getB() {
            return 0;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        /* renamed from: getWidth */
        public final int getF1885a() {
            return 0;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        /* renamed from: o, reason: from getter */
        public final Map getF1094a() {
            return this.f1094a;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public final void q() {
        }
    }, CoroutineScopeKt.a(EmptyCoroutineContext.d));
    public static final PagerStateKt$UnitDensity$1 c = new PagerStateKt$UnitDensity$1();

    public static final PagerState a(int i, float f, Function0 function0) {
        return new DefaultPagerState(i, f, function0);
    }

    public static final long b(PagerLayoutInfo pagerLayoutInfo, int i) {
        long jD = (((i * (pagerLayoutInfo.getB() + pagerLayoutInfo.getC())) + pagerLayoutInfo.c()) + pagerLayoutInfo.getD()) - pagerLayoutInfo.getC();
        int iA = (int) (pagerLayoutInfo.getE() == Orientation.e ? pagerLayoutInfo.a() >> 32 : pagerLayoutInfo.a() & 4294967295L);
        long jC = jD - (iA - RangesKt.c(pagerLayoutInfo.getN().a(iA, pagerLayoutInfo.getB(), pagerLayoutInfo.c(), pagerLayoutInfo.getD(), i - 1, i), 0, iA));
        if (jC < 0) {
            return 0L;
        }
        return jC;
    }

    public static final PagerState c(final Function0 function0, Composer composer, int i, int i2) {
        final int i3 = 0;
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = DefaultPagerState.K;
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.r(0)) || (i & 6) == 4;
        int i4 = (i & 112) ^ 48;
        final float f = BitmapDescriptorFactory.HUE_RED;
        boolean z3 = z2 | ((i4 > 32 && composer.q(BitmapDescriptorFactory.HUE_RED)) || (i & 48) == 32);
        if ((((i & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !composer.n(function0)) && (i & KyberEngine.KyberPolyBytes) != 256) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object objG = composer.G();
        if (z4 || objG == Composer.Companion.f1624a) {
            objG = new Function0<DefaultPagerState>() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new DefaultPagerState(i3, f, function0);
                }
            };
            composer.A(objG);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.c(objArr, saverKt$Saver$1, (Function0) objG, composer, 0, 4);
        ((SnapshotMutableStateImpl) defaultPagerState.J).setValue(function0);
        return defaultPagerState;
    }
}
