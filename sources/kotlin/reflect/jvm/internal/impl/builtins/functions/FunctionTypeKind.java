package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.camera.core.impl.b;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public abstract class FunctionTypeKind {

    /* renamed from: a, reason: collision with root package name */
    public final FqName f24318a;
    public final String b;

    public static final class Function extends FunctionTypeKind {
        public static final Function c = new Function("Function", StandardNames.l);
    }

    public static final class KFunction extends FunctionTypeKind {
        public static final KFunction c = new KFunction("KFunction", StandardNames.i);
    }

    public static final class KSuspendFunction extends FunctionTypeKind {
        public static final KSuspendFunction c = new KSuspendFunction("KSuspendFunction", StandardNames.i);
    }

    public static final class SuspendFunction extends FunctionTypeKind {
        public static final SuspendFunction c = new SuspendFunction("SuspendFunction", StandardNames.f);
    }

    public FunctionTypeKind(String str, FqName packageFqName) {
        Intrinsics.h(packageFqName, "packageFqName");
        this.f24318a = packageFqName;
        this.b = str;
    }

    public final Name a(int i) {
        return Name.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24318a);
        sb.append(JwtParser.SEPARATOR_CHAR);
        return b.r(sb, this.b, 'N');
    }
}
