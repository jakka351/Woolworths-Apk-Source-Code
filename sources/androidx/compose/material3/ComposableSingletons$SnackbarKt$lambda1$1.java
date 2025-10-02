package androidx.compose.material3;

import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$SnackbarKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SnackbarKt$lambda1$1 h = new ComposableSingletons$SnackbarKt$lambda1$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(CloseKt.a(), Strings_androidKt.a(composer, com.woolworths.R.string.m3c_snackbar_dismiss), null, 0L, composer, 0, 12);
        }
        return Unit.f24250a;
    }
}
