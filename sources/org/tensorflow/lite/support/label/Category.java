package org.tensorflow.lite.support.label;

import YU.a;
import java.util.Objects;
import org.tensorflow.lite.annotations.UsedByReflection;

@UsedByReflection
/* loaded from: classes8.dex */
public final class Category {

    /* renamed from: a, reason: collision with root package name */
    public final int f26924a;
    public final String b;
    public final String c;
    public final float d;

    @UsedByReflection
    public Category(String str, float f) {
        this(str, "", f, -1);
    }

    @UsedByReflection
    public static Category create(String str, String str2, float f, int i) {
        return new Category(str, str2, f, i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Category) {
            Category category = (Category) obj;
            if (category.b.equals(this.b) && category.c.equals(this.c) && Math.abs(category.d - this.d) < 1.0E-6f && category.f26924a == this.f26924a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Float.valueOf(this.d), Integer.valueOf(this.f26924a));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<Category \"");
        sb.append(this.b);
        sb.append("\" (displayName=");
        sb.append(this.c);
        sb.append(" score=");
        sb.append(this.d);
        sb.append(" index=");
        return a.m(sb, this.f26924a, ")>");
    }

    public Category(String str, String str2, float f, int i) {
        this.b = str;
        this.c = str2;
        this.d = f;
        this.f26924a = i;
    }

    @UsedByReflection
    public static Category create(String str, String str2, float f) {
        return new Category(str, str2, f, -1);
    }
}
