package kotlin.jvm.internal;

import androidx.camera.core.impl.b;
import java.io.Serializable;
import kotlin.SinceKotlin;

@SinceKotlin
/* loaded from: classes.dex */
public class AdaptedFunctionReference implements FunctionBase, Serializable {
    public final Object d;
    public final Class e;
    public final String f;
    public final String g;
    public final boolean h = false;
    public final int i;
    public final int j;

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.d = obj;
        this.e = cls;
        this.f = str;
        this.g = str2;
        this.i = i;
        this.j = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.h == adaptedFunctionReference.h && this.i == adaptedFunctionReference.i && this.j == adaptedFunctionReference.j && Intrinsics.c(this.d, adaptedFunctionReference.d) && this.e.equals(adaptedFunctionReference.e) && this.f.equals(adaptedFunctionReference.f) && this.g.equals(adaptedFunctionReference.g);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: getArity */
    public final int getP() {
        return this.i;
    }

    public final int hashCode() {
        Object obj = this.d;
        return ((((b.c(b.c((this.e.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.f), 31, this.g) + (this.h ? 1231 : 1237)) * 31) + this.i) * 31) + this.j;
    }

    public final String toString() {
        return Reflection.f24268a.j(this);
    }
}
