package androidx.compose.ui.graphics.vector.compat;

import YU.a;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AndroidVectorParser {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f1838a;
    public int b = 0;
    public final PathParser c = new PathParser();

    public AndroidVectorParser(XmlResourceParser xmlResourceParser) {
        this.f1838a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (TypedArrayUtils.f(this.f1838a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return Intrinsics.c(this.f1838a, androidVectorParser.f1838a) && this.b == androidVectorParser.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f1838a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f1838a);
        sb.append(", config=");
        return a.l(sb, this.b, ')');
    }
}
