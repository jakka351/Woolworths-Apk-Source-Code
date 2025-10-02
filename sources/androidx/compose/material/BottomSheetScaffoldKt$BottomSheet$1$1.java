package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/compose/material/DraggableAnchors;", "Landroidx/compose/material/BottomSheetValue;", "sheetSize", "Landroidx/compose/ui/unit/IntSize;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "invoke-GpV2Q24", "(JJ)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$BottomSheet$1$1 extends Lambda implements Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BottomSheetValue>, ? extends BottomSheetValue>> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BottomSheetValue.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomSheetValue bottomSheetValue = BottomSheetValue.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((IntSize) obj).f2202a;
        final int iG = Constraints.g(((Constraints) obj2).f2197a);
        final float f = (int) (j & 4294967295L);
        final float f2 = BitmapDescriptorFactory.HUE_RED;
        AnchoredDraggableKt.a(new Function1<DraggableAnchorsConfig<BottomSheetValue>, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj3;
                BottomSheetValue bottomSheetValue = BottomSheetValue.d;
                float f3 = iG;
                float f4 = f2;
                draggableAnchorsConfig.a(bottomSheetValue, f3 - f4);
                float f5 = f;
                if (f5 > BitmapDescriptorFactory.HUE_RED && f5 != f4) {
                    draggableAnchorsConfig.a(BottomSheetValue.e, f3 - f5);
                }
                return Unit.f24250a;
            }
        });
        throw null;
    }
}
