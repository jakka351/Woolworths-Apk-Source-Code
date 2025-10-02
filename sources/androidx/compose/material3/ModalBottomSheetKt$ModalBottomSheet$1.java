package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ModalBottomSheetKt$ModalBottomSheet$1 extends Lambda implements Function2<Composer, Integer, WindowInsets> {
    public static final ModalBottomSheetKt$ModalBottomSheet$1 h = new ModalBottomSheetKt$ModalBottomSheet$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.o(58488196);
        BottomSheetDefaults bottomSheetDefaults = BottomSheetDefaults.f1401a;
        WindowInsets windowInsetsB = BottomSheetDefaults.b(composer);
        composer.l();
        return windowInsetsB;
    }
}
