package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposerImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Utils_jvmKt {
    public static final void a(ComposerImpl composerImpl, Function2 function2) {
        Intrinsics.f(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        TypeIntrinsics.d(2, function2);
        function2.invoke(composerImpl, 1);
    }
}
