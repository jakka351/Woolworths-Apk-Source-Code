package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAssistHelperMethodsO;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/View;", "view", "", "a", "(Landroid/view/ViewStructure;Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AndroidComposeViewAssistHelperMethodsO {
    @DoNotInline
    @RequiresApi
    public final void a(@NotNull ViewStructure structure, @NotNull View view) {
        structure.setClassName(view.getAccessibilityClassName().toString());
    }
}
