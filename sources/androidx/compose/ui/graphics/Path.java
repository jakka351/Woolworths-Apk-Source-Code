package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "Companion", "Direction", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface Path {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Direction {
        public static final /* synthetic */ Direction[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            Direction[] directionArr = {new Direction("CounterClockwise", 0), new Direction("Clockwise", 1)};
            d = directionArr;
            e = EnumEntriesKt.a(directionArr);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) d.clone();
        }
    }

    static /* synthetic */ void k(Path path, RoundRect roundRect) {
        Direction[] directionArr = Direction.d;
        path.j(roundRect);
    }

    static /* synthetic */ void r(Path path, Rect rect) {
        Direction[] directionArr = Direction.d;
        path.q(rect);
    }

    void a(float f, float f2);

    void b(float f, float f2);

    void c(float f, float f2, float f3, float f4, float f5, float f6);

    void close();

    void d(float f, float f2);

    void e(float f, float f2, float f3, float f4, float f5, float f6);

    void f(float f, float f2, float f3, float f4);

    void g(long j);

    Rect getBounds();

    default void h(float f, float f2, float f3, float f4) {
        f(f, f2, f3, f4);
    }

    int i();

    void j(RoundRect roundRect);

    boolean l();

    void m(float f, float f2, float f3, float f4);

    void n(int i);

    default void o() {
        reset();
    }

    default void p(float f, float f2, float f3, float f4) {
        m(f, f2, f3, f4);
    }

    void q(Rect rect);

    void reset();

    void s(float f, float f2);
}
