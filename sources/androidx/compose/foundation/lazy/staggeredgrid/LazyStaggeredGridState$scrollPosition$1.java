package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, int[]> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iMin;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) this.receiver;
        int i = LazyStaggeredGridState.w;
        lazyStaggeredGridState.getClass();
        int[] iArr = new int[iIntValue2];
        ((LazyStaggeredGridMeasureResult) ((SnapshotMutableStateImpl) lazyStaggeredGridState.d).getD()).j.a(iIntValue);
        LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lazyStaggeredGridState.e;
        lazyStaggeredGridLaneInfo.c(iIntValue + iIntValue2);
        int iF = lazyStaggeredGridLaneInfo.f(iIntValue);
        if (iF == -2 || iF == -1) {
            iMin = 0;
        } else {
            if (iF < 0) {
                InlineClassHelperKt.a("Expected positive lane number, got " + iF + " instead.");
            }
            iMin = Math.min(iF, iIntValue2);
        }
        int i2 = iMin - 1;
        int iD = iIntValue;
        while (true) {
            if (-1 >= i2) {
                break;
            }
            iD = lazyStaggeredGridLaneInfo.d(iD, i2);
            iArr[i2] = iD;
            if (iD == -1) {
                ArraysKt.C(-1, i2, 2, iArr);
                break;
            }
            i2--;
        }
        iArr[iMin] = iIntValue;
        while (true) {
            iMin++;
            if (iMin >= iIntValue2) {
                return iArr;
            }
            iIntValue++;
            int length = lazyStaggeredGridLaneInfo.f1068a + lazyStaggeredGridLaneInfo.b.length;
            while (true) {
                if (iIntValue >= length) {
                    iIntValue = lazyStaggeredGridLaneInfo.f1068a + lazyStaggeredGridLaneInfo.b.length;
                    break;
                }
                if (lazyStaggeredGridLaneInfo.a(iIntValue, iMin)) {
                    break;
                }
                iIntValue++;
            }
            iArr[iMin] = iIntValue;
        }
    }
}
