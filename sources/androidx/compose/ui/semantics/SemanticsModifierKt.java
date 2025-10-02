package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsModifierKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f2017a = new AtomicInteger(0);

    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.x0(new ClearAndSetSemanticsElement(function1));
    }

    public static final Modifier b(Modifier modifier, boolean z, Function1 function1) {
        return modifier.x0(new AppendedSemanticsElement(function1, z));
    }
}
