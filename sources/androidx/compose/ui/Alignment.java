package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment;", "", "Companion", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Alignment {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final BiasAlignment f1719a = new BiasAlignment(-1.0f, -1.0f);
        public static final BiasAlignment b = new BiasAlignment(BitmapDescriptorFactory.HUE_RED, -1.0f);
        public static final BiasAlignment c = new BiasAlignment(1.0f, -1.0f);
        public static final BiasAlignment d = new BiasAlignment(-1.0f, BitmapDescriptorFactory.HUE_RED);
        public static final BiasAlignment e = new BiasAlignment(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        public static final BiasAlignment f = new BiasAlignment(1.0f, BitmapDescriptorFactory.HUE_RED);
        public static final BiasAlignment g = new BiasAlignment(-1.0f, 1.0f);
        public static final BiasAlignment h = new BiasAlignment(BitmapDescriptorFactory.HUE_RED, 1.0f);
        public static final BiasAlignment i = new BiasAlignment(1.0f, 1.0f);
        public static final BiasAlignment.Vertical j = new BiasAlignment.Vertical(-1.0f);
        public static final BiasAlignment.Vertical k = new BiasAlignment.Vertical(BitmapDescriptorFactory.HUE_RED);
        public static final BiasAlignment.Vertical l = new BiasAlignment.Vertical(1.0f);
        public static final BiasAlignment.Horizontal m = new BiasAlignment.Horizontal(-1.0f);
        public static final BiasAlignment.Horizontal n = new BiasAlignment.Horizontal(BitmapDescriptorFactory.HUE_RED);
        public static final BiasAlignment.Horizontal o = new BiasAlignment.Horizontal(1.0f);
    }

    @Stable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Horizontal {
        int a(int i, int i2, LayoutDirection layoutDirection);
    }

    @Stable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Vertical {
        int a(int i, int i2);
    }

    long a(long j, long j2, LayoutDirection layoutDirection);
}
