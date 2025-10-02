package org.commonmark.node;

import YU.a;
import androidx.camera.core.impl.b;
import java.util.Objects;

/* loaded from: classes8.dex */
public class SourceSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f26856a;
    public final int b;
    public final int c;
    public final int d;

    public SourceSpan(int i, int i2, int i3, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "lineIndex ", " must be >= 0"));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a.e(i2, "columnIndex ", " must be >= 0"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(a.e(i3, "inputIndex ", " must be >= 0"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(a.e(i4, "length ", " must be >= 0"));
        }
        this.f26856a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final SourceSpan a(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.e(i, "beginIndex ", " + must be >= 0"));
        }
        int i3 = this.d;
        if (i > i3) {
            throw new IndexOutOfBoundsException(b.i(i, i3, "beginIndex ", " must be <= length "));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(a.e(i2, "endIndex ", " + must be >= 0"));
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(b.i(i2, i3, "endIndex ", " must be <= length "));
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(b.i(i, i2, "beginIndex ", " must be <= endIndex "));
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new SourceSpan(this.f26856a, this.b + i, this.c + i, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SourceSpan sourceSpan = (SourceSpan) obj;
            if (this.f26856a == sourceSpan.f26856a && this.b == sourceSpan.b && this.c == sourceSpan.c && this.d == sourceSpan.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26856a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        return androidx.compose.ui.input.pointer.a.i(this.c, this.d, ", length=", "}", a.q(this.f26856a, this.b, "SourceSpan{line=", ", column=", ", input="));
    }
}
