package androidx.compose.ui.platform;

import android.view.ActionMode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextToolbar implements TextToolbar {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f1954a;
    public ActionMode b;
    public final TextActionModeCallback c = new TextActionModeCallback(new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.h.b = null;
            return Unit.f24250a;
        }
    });
    public TextToolbarStatus d = TextToolbarStatus.e;

    public AndroidTextToolbar(AndroidComposeView androidComposeView) {
        this.f1954a = androidComposeView;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void a(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        TextActionModeCallback textActionModeCallback = this.c;
        textActionModeCallback.b = rect;
        textActionModeCallback.c = function0;
        textActionModeCallback.e = function03;
        textActionModeCallback.d = function02;
        textActionModeCallback.f = function04;
        textActionModeCallback.g = function05;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.d = TextToolbarStatus.d;
        this.b = TextToolbarHelperMethods.a(this.f1954a, new FloatingTextActionModeCallback(textActionModeCallback));
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void b() {
        this.d = TextToolbarStatus.e;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.b = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void c(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        a(rect, function0, function02, function03, function04, null);
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    /* renamed from: getStatus, reason: from getter */
    public final TextToolbarStatus getD() {
        return this.d;
    }
}
