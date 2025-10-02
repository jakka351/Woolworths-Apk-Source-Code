package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BringIntoViewSpec {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f873a = Companion.f874a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f874a = new Companion();
        public static final SpringSpec b = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7);
        public static final BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1 c = new BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1();

        public static float a(float f, float f2, float f3) {
            float f4 = f2 + f;
            if ((f >= BitmapDescriptorFactory.HUE_RED && f4 <= f3) || (f < BitmapDescriptorFactory.HUE_RED && f4 > f3)) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float f5 = f4 - f3;
            return Math.abs(f) < Math.abs(f5) ? f : f5;
        }

        public static SpringSpec b() {
            return b;
        }
    }

    default float a(float f, float f2, float f3) {
        f873a.getClass();
        return Companion.a(f, f2, f3);
    }
}
