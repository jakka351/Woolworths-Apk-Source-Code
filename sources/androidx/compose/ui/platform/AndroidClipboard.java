package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboard;", "Landroidx/compose/ui/platform/Clipboard;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidClipboard implements Clipboard {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidClipboardManager f1936a;

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.f1936a = androidClipboardManager;
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public final ClipEntry a() {
        ClipData primaryClip = this.f1936a.f1937a.getPrimaryClip();
        if (primaryClip != null) {
            return new ClipEntry(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public final void b(ClipEntry clipEntry) {
        android.content.ClipboardManager clipboardManager = this.f1936a.f1937a;
        if (clipEntry == null) {
            Api28ClipboardManagerClipClear.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(clipEntry.getF1962a());
        }
    }

    public AndroidClipboard(@NotNull Context context) {
        this(new AndroidClipboardManager(context));
    }
}
