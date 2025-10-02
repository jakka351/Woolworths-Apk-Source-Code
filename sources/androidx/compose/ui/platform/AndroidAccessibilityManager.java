package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AccessibilityManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAccessibilityManager implements AccessibilityManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f1935a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager$Companion;", "", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public AndroidAccessibilityManager(@NotNull Context context) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f1935a = (android.view.accessibility.AccessibilityManager) systemService;
    }

    @Override // androidx.compose.ui.platform.AccessibilityManager
    public final long a(long j, boolean z) {
        if (j >= 2147483647L) {
            return j;
        }
        int i = z ? 7 : 3;
        int i2 = Build.VERSION.SDK_INT;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.f1935a;
        if (i2 >= 29) {
            int iA = Api29Impl.a(accessibilityManager, (int) j, i);
            if (iA != Integer.MAX_VALUE) {
                return iA;
            }
        } else if (!z || !accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
