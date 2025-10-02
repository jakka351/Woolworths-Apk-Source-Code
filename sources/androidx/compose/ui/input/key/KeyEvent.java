package androidx.compose.ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "nativeKeyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class KeyEvent {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.KeyEvent f1844a;

    public /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.f1844a = keyEvent;
    }

    public static final /* synthetic */ KeyEvent a(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: b, reason: from getter */
    public final /* synthetic */ android.view.KeyEvent getF1844a() {
        return this.f1844a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KeyEvent) {
            return Intrinsics.c(this.f1844a, ((KeyEvent) obj).f1844a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1844a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f1844a + ')';
    }
}
