package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/FontWeightAdjustmentHelperApi31;", "", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontWeightAdjustmentHelperApi31 {

    /* renamed from: a, reason: collision with root package name */
    public static final FontWeightAdjustmentHelperApi31 f2101a = new FontWeightAdjustmentHelperApi31();

    @DoNotInline
    @RequiresApi
    public final int a(@NotNull Context context) {
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }
}
