package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FocusRequester {
    public static final FocusRequester b = new FocusRequester();
    public static final FocusRequester c = new FocusRequester();
    public static final FocusRequester d = new FocusRequester();

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f1749a = new MutableVector(new FocusRequesterModifierNode[16], 0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FocusRequesterFactory {
        }

        public static FocusRequester a() {
            return FocusRequester.c;
        }

        public static FocusRequester b() {
            return FocusRequester.b;
        }

        public static FocusRequester c() {
            return FocusRequester.d;
        }
    }

    public static void d(FocusRequester focusRequester) {
        focusRequester.getClass();
        focusRequester.a(new FocusRequester$requestFocus$1(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0044, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequester.a(kotlin.jvm.functions.Function1):boolean");
    }

    /* renamed from: b, reason: from getter */
    public final MutableVector getF1749a() {
        return this.f1749a;
    }

    public final void c() {
        a(new FocusRequester$requestFocus$1(1));
    }
}
