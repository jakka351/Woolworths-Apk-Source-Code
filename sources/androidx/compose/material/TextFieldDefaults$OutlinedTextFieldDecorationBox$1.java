package androidx.compose.material;

import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextFieldDefaults$OutlinedTextFieldDecorationBox$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
            TextFieldDefaults.f1339a.a(false, false, null, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composer, 12582912, 96);
        } else {
            composer.j();
        }
        return Unit.f24250a;
    }
}
