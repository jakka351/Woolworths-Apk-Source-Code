package androidx.compose.ui.res;

import YU.a;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache;", "", "ImageVectorEntry", "Key", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageVectorCache {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2001a = new HashMap();

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageVectorEntry {

        /* renamed from: a, reason: collision with root package name */
        public final ImageVector f2002a;
        public final int b;

        public ImageVectorEntry(ImageVector imageVector, int i) {
            this.f2002a = imageVector;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            return Intrinsics.c(this.f2002a, imageVectorEntry.f2002a) && this.b == imageVectorEntry.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f2002a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.f2002a);
            sb.append(", configFlags=");
            return a.l(sb, this.b, ')');
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Key {

        /* renamed from: a, reason: collision with root package name */
        public final Resources.Theme f2003a;
        public final int b;

        public Key(int i, Resources.Theme theme) {
            this.f2003a = theme;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.c(this.f2003a, key.f2003a) && this.b == key.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f2003a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.f2003a);
            sb.append(", id=");
            return a.l(sb, this.b, ')');
        }
    }
}
