package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/Updater;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "composer", "Landroidx/compose/runtime/Composer;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class Updater<T> {
    public static final void a(Composer composer, final Function1 function1) {
        if (composer.getO()) {
            composer.a(Unit.f24250a, new Function2<Object, Unit, Unit>(function1) { // from class: androidx.compose.runtime.Updater$init$1
                public final /* synthetic */ Lambda h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                    this.h = (Lambda) function1;
                }

                /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    this.h.invoke(obj);
                    return Unit.f24250a;
                }
            });
        }
    }

    public static final void b(Composer composer, Object obj, Function2 function2) {
        if (composer.getO() || !Intrinsics.c(composer.G(), obj)) {
            composer.A(obj);
            composer.a(obj, function2);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Updater) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Updater(composer=null)";
    }
}
