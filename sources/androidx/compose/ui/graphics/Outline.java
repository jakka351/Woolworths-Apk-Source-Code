package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "", "Generic", "Rectangle", "Rounded", "Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Outline {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Generic extends Outline {

        /* renamed from: a, reason: collision with root package name */
        public final Path f1774a;

        public Generic(Path path) {
            this.f1774a = path;
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Rectangle extends Outline {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f1775a;

        public Rectangle(Rect rect) {
            this.f1775a = rect;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rectangle) {
                return Intrinsics.c(this.f1775a, ((Rectangle) obj).f1775a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f1775a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final class Rounded extends Outline {

        /* renamed from: a, reason: collision with root package name */
        public final RoundRect f1776a;
        public final AndroidPath b;

        public Rounded(RoundRect roundRect) {
            AndroidPath androidPathA;
            this.f1776a = roundRect;
            if (RoundRectKt.d(roundRect)) {
                androidPathA = null;
            } else {
                androidPathA = AndroidPath_androidKt.a();
                Path.k(androidPathA, roundRect);
            }
            this.b = androidPathA;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rounded) {
                return Intrinsics.c(this.f1776a, ((Rounded) obj).f1776a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f1776a.hashCode();
        }
    }
}
