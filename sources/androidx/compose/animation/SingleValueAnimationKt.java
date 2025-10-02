package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SingleValueAnimationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SpringSpec f732a = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7);

    public static final Animatable a(long j) {
        Color color = new Color(j);
        Function1 function1 = ColorVectorConverterKt.f719a;
        return new Animatable(color, (TwoWayConverter) ColorVectorConverterKt$ColorToVector$1.h.invoke(Color.f(j)), (Object) null, 12);
    }

    public static final State b(long j, FiniteAnimationSpec finiteAnimationSpec, String str, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = f732a;
        }
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zN = composer.n(Color.f(j));
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            Function1 function1 = ColorVectorConverterKt.f719a;
            objG = (TwoWayConverter) ColorVectorConverterKt$ColorToVector$1.h.invoke(Color.f(j));
            composer.A(objG);
        }
        return AnimateAsStateKt.c(new Color(j), (TwoWayConverter) objG, finiteAnimationSpec2, null, str2, null, composer, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
