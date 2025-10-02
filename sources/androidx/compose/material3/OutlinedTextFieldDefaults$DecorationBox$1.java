package androidx.compose.material3;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OutlinedTextFieldDefaults$DecorationBox$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OutlinedTextFieldDefaults.f1468a.a(false, false, null, Modifier.Companion.d, null, ShapesKt.b(ShapeKeyTokens.f, composer), OutlinedTextFieldDefaults.e, OutlinedTextFieldDefaults.d, composer, 114822144, 0);
        }
        return Unit.f24250a;
    }
}
