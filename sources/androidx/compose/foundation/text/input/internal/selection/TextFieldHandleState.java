package androidx.compose.foundation.text.input.internal.selection;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextFieldHandleState {
    public static final TextFieldHandleState f = new TextFieldHandleState(false, 9205357640488583168L, BitmapDescriptorFactory.HUE_RED, ResolvedTextDirection.d, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1179a;
    public final long b;
    public final float c;
    public final ResolvedTextDirection d;
    public final boolean e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TextFieldHandleState(boolean z, long j, float f2, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        this.f1179a = z;
        this.b = j;
        this.c = f2;
        this.d = resolvedTextDirection;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.f1179a == textFieldHandleState.f1179a && Offset.c(this.b, textFieldHandleState.b) && Float.compare(this.c, textFieldHandleState.c) == 0 && this.d == textFieldHandleState.d && this.e == textFieldHandleState.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + a.b(this.c, b.b(Boolean.hashCode(this.f1179a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.f1179a);
        sb.append(", position=");
        sb.append((Object) Offset.j(this.b));
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(this.d);
        sb.append(", handlesCrossed=");
        return b.s(sb, this.e, ')');
    }
}
