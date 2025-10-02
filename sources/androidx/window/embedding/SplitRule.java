package androidx.window.embedding;

import android.graphics.Rect;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.window.core.ExperimentalWindowApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/EmbeddingRule;", "Api30Impl", "LayoutDir", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SplitRule extends EmbeddingRule {

    @RequiresApi
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/SplitRule$Api30Impl;", "", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/graphics/Rect;", "a", "(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Api30Impl {
        @DoNotInline
        @NotNull
        public final Rect a(@NotNull WindowMetrics windowMetrics) {
            Intrinsics.h(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            Intrinsics.g(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/SplitRule$LayoutDir;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface LayoutDir {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof SplitRule);
    }

    public int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31;
    }
}
