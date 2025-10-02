package au.com.woolworths.android.onesite.network;

import com.apollographql.apollo.ast.GQLArgument;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4579a;

    public /* synthetic */ a(int i) {
        this.f4579a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f4579a) {
            case 0:
                GQLArgument obj2 = (GQLArgument) obj;
                Intrinsics.h(obj2, "obj");
                return obj2.getF13537a();
            case 1:
                return ((AnnotatedMethod) obj).i();
            case 2:
                ((DynamicScheme) obj).getClass();
                return null;
            case 3:
                ((DynamicScheme) obj).getClass();
                throw null;
            case 4:
                ((DynamicScheme) obj).getClass();
                return null;
            case 5:
                ((DynamicScheme) obj).getClass();
                throw null;
            case 6:
                ((DynamicScheme) obj).getClass();
                return null;
            case 7:
                throw null;
            case 8:
                ((DynamicScheme) obj).getClass();
                return null;
            case 9:
                throw null;
            case 10:
                ((DynamicScheme) obj).getClass();
                return null;
            case 11:
                throw null;
            case 12:
                ((DynamicScheme) obj).getClass();
                return null;
            case 13:
                throw null;
            case 14:
                ((DynamicScheme) obj).getClass();
                return null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                ((DynamicScheme) obj).getClass();
                return null;
            case 18:
                throw null;
            case 19:
                throw null;
            case 20:
                ((DynamicScheme) obj).getClass();
                return null;
            case 21:
                ((DynamicScheme) obj).getClass();
                throw null;
            case 22:
                ((DynamicScheme) obj).getClass();
                return null;
            case 23:
                throw null;
            case 24:
                ((DynamicScheme) obj).getClass();
                return null;
            case 25:
                ((DynamicScheme) obj).getClass();
                return null;
            case 26:
                throw null;
            case 27:
                ((DynamicScheme) obj).getClass();
                return null;
            case 28:
                throw null;
            default:
                return new DynamicColor("background", new a(22), new a(23), true, null, null, null);
        }
    }
}
