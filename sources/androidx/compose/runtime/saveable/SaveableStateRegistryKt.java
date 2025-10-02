package androidx.compose.runtime.saveable;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaveableStateRegistryKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f1700a = new StaticProvidableCompositionLocal(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.h);

    public static final SaveableStateRegistry a(Map map, Function1 function1) {
        return new SaveableStateRegistryImpl(map, function1);
    }
}
