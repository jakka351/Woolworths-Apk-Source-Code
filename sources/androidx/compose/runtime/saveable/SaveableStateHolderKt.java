package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaveableStateHolderKt {
    public static final SaveableStateHolder a(Composer composer) {
        composer.o(-796079677);
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.c(new Object[0], SaveableStateHolderImpl.e, SaveableStateHolderKt$rememberSaveableStateHolder$1.h, composer, 3072, 4);
        saveableStateHolderImpl.c = (SaveableStateRegistry) composer.x(SaveableStateRegistryKt.f1700a);
        composer.l();
        return saveableStateHolderImpl;
    }
}
