package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "Companion", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class FocusDirection {

    /* renamed from: a, reason: collision with root package name */
    public final int f1744a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ FocusDirection(int i) {
        this.f1744a = i;
    }

    public static final /* synthetic */ FocusDirection a(int i) {
        return new FocusDirection(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static String c(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    /* renamed from: d, reason: from getter */
    public final /* synthetic */ int getF1744a() {
        return this.f1744a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FocusDirection) {
            return this.f1744a == ((FocusDirection) obj).f1744a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1744a);
    }

    public final String toString() {
        return c(this.f1744a);
    }
}
