package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "drawerSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DrawerKt$BottomDrawer$1$1$2$1 extends Lambda implements Function1<IntSize, Unit> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BottomDrawerValue.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomDrawerValue bottomDrawerValue = BottomDrawerValue.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BottomDrawerValue bottomDrawerValue2 = BottomDrawerValue.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final float f = (int) (((IntSize) obj).f2202a & 4294967295L);
        final float f2 = BitmapDescriptorFactory.HUE_RED;
        final boolean z = false;
        AnchoredDraggableKt.a(new Function1<DraggableAnchorsConfig<BottomDrawerValue>, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1$newAnchors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj2;
                BottomDrawerValue bottomDrawerValue = BottomDrawerValue.d;
                float f3 = f2;
                draggableAnchorsConfig.a(bottomDrawerValue, f3);
                float f4 = 0.5f * f3;
                float f5 = f;
                if (f5 > f4 || z) {
                    draggableAnchorsConfig.a(BottomDrawerValue.e, f4);
                }
                if (f5 > BitmapDescriptorFactory.HUE_RED) {
                    draggableAnchorsConfig.a(BottomDrawerValue.f, Math.max(BitmapDescriptorFactory.HUE_RED, f3 - f5));
                }
                return Unit.f24250a;
            }
        });
        throw null;
    }
}
