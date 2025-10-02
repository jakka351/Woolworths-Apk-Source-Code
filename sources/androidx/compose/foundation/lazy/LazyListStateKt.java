package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
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
/* loaded from: classes.dex */
public final class LazyListStateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyListMeasureResult f1002a = new LazyListMeasureResult(null, 0, false, BitmapDescriptorFactory.HUE_RED, new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1

        /* renamed from: a, reason: collision with root package name */
        public final Map f1003a = EmptyMap.d;

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
        public final Map getF1003a() {
            return this.f1003a;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public final void q() {
        }
    }, BitmapDescriptorFactory.HUE_RED, false, CoroutineScopeKt.a(EmptyCoroutineContext.d), DensityKt.b(), ConstraintsKt.b(0, 0, 15), EmptyList.d, 0, 0, 0, false, Orientation.d, 0, 0);

    public static final LazyListState a(final int i, int i2, int i3, Composer composer) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = LazyListState.w;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.r(i)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.r(0)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objG = composer.G();
        if (z3 || objG == Composer.Companion.f1624a) {
            objG = new Function0<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new LazyListState(i, 0);
                }
            };
            composer.A(objG);
        }
        return (LazyListState) RememberSaveableKt.c(objArr, saverKt$Saver$1, (Function0) objG, composer, 0, 4);
    }
}
