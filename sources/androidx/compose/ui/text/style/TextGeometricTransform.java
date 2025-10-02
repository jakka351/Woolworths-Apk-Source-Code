package androidx.compose.ui.text.style;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextGeometricTransform {
    public static final TextGeometricTransform c = new TextGeometricTransform(1.0f, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a, reason: collision with root package name */
    public final float f2160a;
    public final float b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TextGeometricTransform(float f, float f2) {
        this.f2160a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.f2160a == textGeometricTransform.f2160a && this.b == textGeometricTransform.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f2160a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f2160a);
        sb.append(", skewX=");
        return a.r(sb, this.b, ')');
    }
}
