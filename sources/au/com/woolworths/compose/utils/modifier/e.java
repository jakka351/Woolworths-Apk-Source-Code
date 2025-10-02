package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ e(int i, long j) {
        this.d = i;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrawScope drawBehind = (DrawScope) obj;
        Intrinsics.h(drawBehind, "$this$drawBehind");
        int i = this.d;
        long j = this.e;
        if (i < 2) {
            drawBehind.b1(j, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.h() >> 32))) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), drawBehind.T1(1), (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.h() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.h() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.h() & 4294967295L));
        float f = 1;
        drawBehind.b1(j, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32), drawBehind.T1(f), (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
        if (i % 2 == 0) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind.h() >> 32));
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawBehind.h() & 4294967295L));
            drawBehind.b1(j, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.h() >> 32))) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32), drawBehind.T1(f), (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
        }
        return Unit.f24250a;
    }
}
