package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentScale {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentScale$Companion$Crop$1 f1880a = new ContentScale$Companion$Crop$1();
        public static final ContentScale$Companion$Fit$1 b = new ContentScale$Companion$Fit$1();
        public static final ContentScale$Companion$FillHeight$1 c = new ContentScale$Companion$FillHeight$1();
        public static final ContentScale$Companion$FillWidth$1 d = new ContentScale$Companion$FillWidth$1();
        public static final ContentScale$Companion$Inside$1 e = new ContentScale$Companion$Inside$1();
        public static final FixedScale f = new FixedScale();
        public static final ContentScale$Companion$FillBounds$1 g = new ContentScale$Companion$FillBounds$1();
    }

    long a(long j, long j2);
}
