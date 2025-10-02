package androidx.compose.ui.platform;

import android.graphics.Outline;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/OutlineVerificationHelper;", "", "Landroid/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Path;", com.salesforce.marketingcloud.config.a.j, "", "a", "(Landroid/graphics/Outline;Landroidx/compose/ui/graphics/Path;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OutlineVerificationHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final OutlineVerificationHelper f1977a = new OutlineVerificationHelper();

    @DoNotInline
    public final void a(@NotNull Outline outline, @NotNull Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((AndroidPath) path).f1761a);
    }
}
