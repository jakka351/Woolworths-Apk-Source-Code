package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/internal/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroidx/compose/runtime/State;", "", "Api33Impl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/internal/Listener$Api33Impl;", "", "Landroid/view/accessibility/AccessibilityManager;", "am", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "(Landroid/view/accessibility/AccessibilityManager;Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;)V", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull AccessibilityManager am, @NotNull AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.addAccessibilityServicesStateChangeListener(listener);
        }

        @JvmStatic
        @DoNotInline
        public static final void b(@NotNull AccessibilityManager am, @NotNull AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.removeAccessibilityServicesStateChangeListener(listener);
        }
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        throw null;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        throw null;
    }
}
