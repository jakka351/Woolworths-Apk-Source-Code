package androidx.compose.ui.graphics.vector;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "ArcTo", "Close", "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PathNode {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1817a;
    public final boolean b;

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ArcTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public ArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(3);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.c, arcTo.c) == 0 && Float.compare(this.d, arcTo.d) == 0 && Float.compare(this.e, arcTo.e) == 0 && this.f == arcTo.f && this.g == arcTo.g && Float.compare(this.h, arcTo.h) == 0 && Float.compare(this.i, arcTo.i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.i) + a.b(this.h, b.e(b.e(a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f);
            sb.append(", isPositiveArc=");
            sb.append(this.g);
            sb.append(", arcStartX=");
            sb.append(this.h);
            sb.append(", arcStartY=");
            return a.r(sb, this.i, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close extends PathNode {
        public static final Close c = new Close(3);
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.c, curveTo.c) == 0 && Float.compare(this.d, curveTo.d) == 0 && Float.compare(this.e, curveTo.e) == 0 && Float.compare(this.f, curveTo.f) == 0 && Float.compare(this.g, curveTo.g) == 0 && Float.compare(this.h, curveTo.h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.h) + a.b(this.g, a.b(this.f, a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            sb.append(this.f);
            sb.append(", x3=");
            sb.append(this.g);
            sb.append(", y3=");
            return a.r(sb, this.h, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HorizontalTo extends PathNode {
        public final float c;

        public HorizontalTo(float f) {
            super(3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.c, ((HorizontalTo) obj).c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return a.r(new StringBuilder("HorizontalTo(x="), this.c, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LineTo extends PathNode {
        public final float c;
        public final float d;

        public LineTo(float f, float f2) {
            super(3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.c, lineTo.c) == 0 && Float.compare(this.d, lineTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return a.r(sb, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MoveTo extends PathNode {
        public final float c;
        public final float d;

        public MoveTo(float f, float f2) {
            super(3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.c, moveTo.c) == 0 && Float.compare(this.d, moveTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return a.r(sb, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class QuadTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(1);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.c, quadTo.c) == 0 && Float.compare(this.d, quadTo.d) == 0 && Float.compare(this.e, quadTo.e) == 0 && Float.compare(this.f, quadTo.f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return a.r(sb, this.f, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReflectiveCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.c, reflectiveCurveTo.c) == 0 && Float.compare(this.d, reflectiveCurveTo.d) == 0 && Float.compare(this.e, reflectiveCurveTo.e) == 0 && Float.compare(this.f, reflectiveCurveTo.f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return a.r(sb, this.f, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReflectiveQuadTo extends PathNode {
        public final float c;
        public final float d;

        public ReflectiveQuadTo(float f, float f2) {
            super(1);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.c, reflectiveQuadTo.c) == 0 && Float.compare(this.d, reflectiveQuadTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return a.r(sb, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeArcTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public RelativeArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(3);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.c, relativeArcTo.c) == 0 && Float.compare(this.d, relativeArcTo.d) == 0 && Float.compare(this.e, relativeArcTo.e) == 0 && this.f == relativeArcTo.f && this.g == relativeArcTo.g && Float.compare(this.h, relativeArcTo.h) == 0 && Float.compare(this.i, relativeArcTo.i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.i) + a.b(this.h, b.e(b.e(a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f);
            sb.append(", isPositiveArc=");
            sb.append(this.g);
            sb.append(", arcStartDx=");
            sb.append(this.h);
            sb.append(", arcStartDy=");
            return a.r(sb, this.i, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.c, relativeCurveTo.c) == 0 && Float.compare(this.d, relativeCurveTo.d) == 0 && Float.compare(this.e, relativeCurveTo.e) == 0 && Float.compare(this.f, relativeCurveTo.f) == 0 && Float.compare(this.g, relativeCurveTo.g) == 0 && Float.compare(this.h, relativeCurveTo.h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.h) + a.b(this.g, a.b(this.f, a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            sb.append(this.f);
            sb.append(", dx3=");
            sb.append(this.g);
            sb.append(", dy3=");
            return a.r(sb, this.h, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeHorizontalTo extends PathNode {
        public final float c;

        public RelativeHorizontalTo(float f) {
            super(3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.c, ((RelativeHorizontalTo) obj).c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return a.r(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeLineTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeLineTo(float f, float f2) {
            super(3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.c, relativeLineTo.c) == 0 && Float.compare(this.d, relativeLineTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return a.r(sb, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeMoveTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeMoveTo(float f, float f2) {
            super(3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.c, relativeMoveTo.c) == 0 && Float.compare(this.d, relativeMoveTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return a.r(sb, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeQuadTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(1);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.c, relativeQuadTo.c) == 0 && Float.compare(this.d, relativeQuadTo.d) == 0 && Float.compare(this.e, relativeQuadTo.e) == 0 && Float.compare(this.f, relativeQuadTo.f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return a.r(sb, this.f, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeReflectiveCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.c, relativeReflectiveCurveTo.c) == 0 && Float.compare(this.d, relativeReflectiveCurveTo.d) == 0 && Float.compare(this.e, relativeReflectiveCurveTo.e) == 0 && Float.compare(this.f, relativeReflectiveCurveTo.f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return a.r(sb, this.f, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeReflectiveQuadTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(1);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.c, relativeReflectiveQuadTo.c) == 0 && Float.compare(this.d, relativeReflectiveQuadTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return a.r(sb, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RelativeVerticalTo extends PathNode {
        public final float c;

        public RelativeVerticalTo(float f) {
            super(3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.c, ((RelativeVerticalTo) obj).c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return a.r(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VerticalTo extends PathNode {
        public final float c;

        public VerticalTo(float f) {
            super(3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.c, ((VerticalTo) obj).c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return a.r(new StringBuilder("VerticalTo(y="), this.c, ')');
        }
    }

    public PathNode(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        this.f1817a = z;
        this.b = z2;
    }
}
