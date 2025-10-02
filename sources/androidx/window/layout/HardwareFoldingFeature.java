package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature;", "Landroidx/window/layout/FoldingFeature;", "Companion", "Type", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HardwareFoldingFeature implements FoldingFeature {

    /* renamed from: a, reason: collision with root package name */
    public final Bounds f3876a;
    public final Type b;
    public final FoldingFeature.State c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Companion;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type;", "", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Type {
        public static final Type b = new Type("FOLD");
        public static final Type c = new Type("HINGE");

        /* renamed from: a, reason: collision with root package name */
        public final String f3877a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type$Companion;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
        }

        public Type(String str) {
            this.f3877a = str;
        }

        /* renamed from: toString, reason: from getter */
        public final String getF3877a() {
            return this.f3877a;
        }
    }

    public HardwareFoldingFeature(Bounds bounds, Type type, FoldingFeature.State state) {
        this.f3876a = bounds;
        this.b = type;
        this.c = state;
        if (bounds.b() == 0 && bounds.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bounds.f3869a != 0 && bounds.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // androidx.window.layout.FoldingFeature
    public final boolean a() {
        Type type = Type.c;
        Type type2 = this.b;
        if (Intrinsics.c(type2, type)) {
            return true;
        }
        return Intrinsics.c(type2, Type.b) && Intrinsics.c(this.c, FoldingFeature.State.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HardwareFoldingFeature.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
        return Intrinsics.c(this.f3876a, hardwareFoldingFeature.f3876a) && Intrinsics.c(this.b, hardwareFoldingFeature.b) && Intrinsics.c(this.c, hardwareFoldingFeature.c);
    }

    @Override // androidx.window.layout.DisplayFeature
    public final Rect getBounds() {
        return this.f3876a.c();
    }

    @Override // androidx.window.layout.FoldingFeature
    public final FoldingFeature.Orientation getOrientation() {
        Bounds bounds = this.f3876a;
        return bounds.b() > bounds.a() ? FoldingFeature.Orientation.c : FoldingFeature.Orientation.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f3876a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HardwareFoldingFeature { " + this.f3876a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
