package androidx.compose.material3.carousel;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/material3/carousel/KeylineListScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class KeylinesKt$createLeftAlignedKeylineList$1 extends Lambda implements Function1<KeylineListScope, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeylineListScope keylineListScope = (KeylineListScope) obj;
        keylineListScope.a(BitmapDescriptorFactory.HUE_RED, true);
        for (int i = 0; i < 0; i++) {
            keylineListScope.a(BitmapDescriptorFactory.HUE_RED, false);
        }
        for (int i2 = 0; i2 < 0; i2++) {
            keylineListScope.a(BitmapDescriptorFactory.HUE_RED, false);
        }
        for (int i3 = 0; i3 < 0; i3++) {
            keylineListScope.a(BitmapDescriptorFactory.HUE_RED, false);
        }
        keylineListScope.a(BitmapDescriptorFactory.HUE_RED, true);
        return Unit.f24250a;
    }
}
