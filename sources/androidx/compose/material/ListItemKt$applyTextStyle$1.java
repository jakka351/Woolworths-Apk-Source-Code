package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ListItemKt$applyTextStyle$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
            final LineHeightStyle lineHeightStyle = null;
            final Function2 function2 = null;
            final TextStyle textStyle = null;
            CompositionLocalKt.a(ContentAlphaKt.f1260a.b(Float.valueOf(BitmapDescriptorFactory.HUE_RED)), ComposableLambdaKt.c(1665877604, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    int iIntValue2 = ((Number) obj4).intValue();
                    if (composer2.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        TextKt.a(TextStyle.a(textStyle, 0L, 0L, null, null, 0L, 0L, null, lineHeightStyle, 0, 15728639), function2, composer2, 0);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, 56);
        } else {
            composer.j();
        }
        return Unit.f24250a;
    }
}
