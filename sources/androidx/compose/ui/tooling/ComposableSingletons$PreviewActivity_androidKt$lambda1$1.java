package androidx.compose.ui.tooling;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$PreviewActivity_androidKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PreviewActivity_androidKt$lambda1$1 h = new ComposableSingletons$PreviewActivity_androidKt$lambda1$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
            TextKt.d(null, 0L, 0L, 0L, 0L, 0, false, 0, null, null, composer, 6);
        } else {
            composer.j();
        }
        return Unit.f24250a;
    }
}
