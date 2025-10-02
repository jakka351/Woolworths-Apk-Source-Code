package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$BasicTextFieldKt$lambda2$1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    public static final ComposableSingletons$BasicTextFieldKt$lambda2$1 h = new ComposableSingletons$BasicTextFieldKt$lambda2$1(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.I(function2) ? 4 : 2;
        }
        if (composer.z(iIntValue & 1, (iIntValue & 19) != 18)) {
            function2.invoke(composer, Integer.valueOf(iIntValue & 14));
        } else {
            composer.j();
        }
        return Unit.f24250a;
    }
}
