package androidx.compose.material;

import androidx.compose.material.internal.Icons;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExposedDropdownMenuDefaults$TrailingIcon$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
            composer.j();
            return Unit.f24250a;
        }
        if (Icons.Filled.f1379a == null) {
            ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, BERTags.FLAGS);
            int i = VectorKt.f1820a;
            SolidColor solidColor = new SolidColor(Color.b);
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.i(7.0f, 10.0f);
            pathBuilder.h(5.0f, 5.0f);
            pathBuilder.h(5.0f, -5.0f);
            pathBuilder.a();
            builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
            Icons.Filled.f1379a = builder.d();
        }
        throw null;
    }
}
