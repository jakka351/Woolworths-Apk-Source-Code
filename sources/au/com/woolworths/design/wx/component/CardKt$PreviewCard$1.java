package au.com.woolworths.design.wx.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CardKt$PreviewCard$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.design.wx.component.CardKt$PreviewCard$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: au.com.woolworths.design.wx.component.CardKt$PreviewCard$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00961 implements Function2<Composer, Integer, Unit> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    TextKt.b("Card content - null", PaddingKt.f(Modifier.Companion.d, 8), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).l, composer, 48, 0, 65532);
                }
                return Unit.f24250a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
            } else {
                CardKt.a(PaddingKt.f(SizeKt.q(Modifier.Companion.d, 120), 8), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-655039690, new C00961(), composer), composer, 1572870, 62);
            }
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(203833401, new AnonymousClass1(), composer), composer, 1572864, 63);
        }
        return Unit.f24250a;
    }
}
