package androidx.compose.ui.text;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Bullet implements AnnotatedString.Annotation {

    /* renamed from: a, reason: collision with root package name */
    public final Shape f2036a = CircleShape.f2040a;
    public final long b;
    public final long c;

    public Bullet(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    /* renamed from: a, reason: from getter */
    public final long getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final Shape getF2036a() {
        return this.f2036a;
    }

    /* renamed from: c, reason: from getter */
    public final long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Bullet)) {
            return false;
        }
        Bullet bullet = (Bullet) obj;
        Object obj2 = CircleShape.f2040a;
        if (!obj2.equals(obj2) || !TextUnit.a(this.b, bullet.b) || !TextUnit.a(this.c, bullet.c)) {
            return false;
        }
        Object obj3 = Fill.f1802a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        int iHashCode = CircleShape.f2040a.hashCode() * 31;
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        return Fill.f1802a.hashCode() + a.b(1.0f, b.b(b.b(iHashCode, 31, this.b), 961, this.c), 31);
    }

    public final String toString() {
        return "Bullet(shape=" + CircleShape.f2040a + ", size=" + ((Object) TextUnit.e(this.b)) + ", padding=" + ((Object) TextUnit.e(this.c)) + ", brush=null, alpha=1.0, drawStyle=" + Fill.f1802a + ')';
    }
}
