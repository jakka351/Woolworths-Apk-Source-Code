package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.DensityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasureResultKt {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyStaggeredGridMeasureResult f1073a;

    static {
        int[] iArr = new int[0];
        f1073a = new LazyStaggeredGridMeasureResult(iArr, iArr, BitmapDescriptorFactory.HUE_RED, new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1

            /* renamed from: a, reason: collision with root package name */
            public final Map f1074a = EmptyMap.d;

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
            public final Map getF1074a() {
                return this.f1074a;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void q() {
            }
        }, BitmapDescriptorFactory.HUE_RED, false, false, false, new LazyStaggeredGridSlots(iArr, iArr), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.b(), 0, EmptyList.d, 0L, 0, 0, 0, 0, 0, CoroutineScopeKt.a(EmptyCoroutineContext.d));
    }
}
