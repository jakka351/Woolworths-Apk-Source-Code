package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.Set;

/* loaded from: classes2.dex */
public interface ReadableConfig extends Config {
    @Override // androidx.camera.core.impl.Config
    default Object a(Config.Option option) {
        return getConfig().a(option);
    }

    @Override // androidx.camera.core.impl.Config
    default Set b(Config.Option option) {
        return getConfig().b(option);
    }

    @Override // androidx.camera.core.impl.Config
    default Object c(Config.Option option, Object obj) {
        return getConfig().c(option, obj);
    }

    @Override // androidx.camera.core.impl.Config
    default boolean d(Config.Option option) {
        return getConfig().d(option);
    }

    @Override // androidx.camera.core.impl.Config
    default Object e(Config.Option option, Config.OptionPriority optionPriority) {
        return getConfig().e(option, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    default Set f() {
        return getConfig().f();
    }

    @Override // androidx.camera.core.impl.Config
    default void g(androidx.camera.camera2.interop.e eVar) {
        getConfig().g(eVar);
    }

    Config getConfig();

    @Override // androidx.camera.core.impl.Config
    default Config.OptionPriority h(Config.Option option) {
        return getConfig().h(option);
    }
}
