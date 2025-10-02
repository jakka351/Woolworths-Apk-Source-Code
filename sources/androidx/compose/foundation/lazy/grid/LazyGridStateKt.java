package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.DensityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridStateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyGridMeasureResult f1027a;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$1

            /* renamed from: a, reason: collision with root package name */
            public final Map f1028a = EmptyMap.d;

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
            public final Map getF1028a() {
                return this.f1028a;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void q() {
            }
        };
        Orientation orientation = Orientation.d;
        f1027a = new LazyGridMeasureResult(null, 0, false, BitmapDescriptorFactory.HUE_RED, measureResult, BitmapDescriptorFactory.HUE_RED, false, CoroutineScopeKt.a(EmptyCoroutineContext.d), DensityKt.b(), 0, LazyGridStateKt$EmptyLazyGridLayoutInfo$2.h, EmptyList.d, 0, 0, 0, false, orientation, 0, 0);
    }

    public static final LazyGridState a(final int i, int i2, Composer composer) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = LazyGridState.w;
        boolean zR = composer.r(i) | composer.r(0);
        Object objG = composer.G();
        if (zR || objG == Composer.Companion.f1624a) {
            objG = new Function0<LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new LazyGridState(i, 0);
                }
            };
            composer.A(objG);
        }
        return (LazyGridState) RememberSaveableKt.c(objArr, saverKt$Saver$1, (Function0) objG, composer, 0, 4);
    }
}
