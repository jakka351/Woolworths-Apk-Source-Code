package androidx.compose.ui.platform;

import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/ViewConfiguration;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface ViewConfiguration {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default float a() {
        return 2.0f;
    }

    float b();

    default float c() {
        return 16.0f;
    }

    long d();

    long e();

    default long f() {
        float f = 48;
        return DpKt.a(f, f);
    }

    default float g() {
        return Float.MAX_VALUE;
    }
}
