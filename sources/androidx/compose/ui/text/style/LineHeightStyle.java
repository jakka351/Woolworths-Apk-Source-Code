package androidx.compose.ui.text.style;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "Alignment", "Companion", "Mode", "Trim", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LineHeightStyle {
    public static final LineHeightStyle c = new LineHeightStyle(Alignment.c, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f2153a;
    public final int b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "Companion", "topRatio", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class Alignment {
        public static final float b;
        public static final float c;
        public static final float d;

        /* renamed from: a, reason: collision with root package name */
        public final float f2154a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            a(BitmapDescriptorFactory.HUE_RED);
            a(0.5f);
            b = 0.5f;
            a(-1.0f);
            c = -1.0f;
            a(1.0f);
            d = 1.0f;
        }

        public static void a(float f) {
            if ((BitmapDescriptorFactory.HUE_RED > f || f > 1.0f) && f != -1.0f) {
                InlineClassHelperKt.c("topRatio should be in [0..1] range or -1");
            }
        }

        public static String b(float f) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == b) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == c) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == d) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Alignment) {
                return Float.compare(this.f2154a, ((Alignment) obj).f2154a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f2154a);
        }

        public final String toString() {
            return b(this.f2154a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Mode {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            return obj instanceof Mode;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Mode(value=0)";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Trim {

        /* renamed from: a, reason: collision with root package name */
        public final int f2155a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "", "FlagTrimBottom", "I", "FlagTrimTop", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Trim) {
                return this.f2155a == ((Trim) obj).f2155a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f2155a);
        }

        public final String toString() {
            int i = this.f2155a;
            return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    public LineHeightStyle(float f, int i) {
        this.f2153a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        float f = lineHeightStyle.f2153a;
        float f2 = Alignment.b;
        return Float.compare(this.f2153a, f) == 0 && this.b == lineHeightStyle.b;
    }

    public final int hashCode() {
        float f = Alignment.b;
        return Integer.hashCode(0) + b.a(this.b, Float.hashCode(this.f2153a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) Alignment.b(this.f2153a));
        sb.append(", trim=");
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
