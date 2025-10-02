package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CanFocusChecker implements FocusProperties {

    /* renamed from: a, reason: collision with root package name */
    public static final CanFocusChecker f1904a = new CanFocusChecker();
    public static Boolean b;

    public static boolean e() {
        return b != null;
    }

    public static void f() {
        b = null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final boolean c() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        InlineClassHelperKt.c("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }
}
