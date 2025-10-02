package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class MutableOptionsBundle extends OptionsBundle implements MutableConfig {
    public static MutableOptionsBundle V() {
        return new MutableOptionsBundle(new TreeMap(OptionsBundle.H));
    }

    public static MutableOptionsBundle W(Config config) {
        TreeMap treeMap = new TreeMap(OptionsBundle.H);
        for (Config.Option option : config.f()) {
            Set<Config.OptionPriority> setB = config.b(option);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : setB) {
                arrayMap.put(optionPriority, config.e(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new MutableOptionsBundle(treeMap);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public final void G(Config.Option option, Object obj) {
        X(option, Config.OptionPriority.g, obj);
    }

    public final void X(Config.Option option, Config.OptionPriority optionPriority, Object obj) {
        Config.OptionPriority optionPriority2;
        TreeMap treeMap = this.G;
        Map map = (Map) treeMap.get(option);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(option, arrayMap);
            arrayMap.put(optionPriority, obj);
            return;
        }
        Config.OptionPriority optionPriority3 = (Config.OptionPriority) Collections.min(map.keySet());
        if (Objects.equals(map.get(optionPriority3), obj) || optionPriority3 != (optionPriority2 = Config.OptionPriority.f) || optionPriority != optionPriority2) {
            map.put(optionPriority, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + option.c() + ", existing value (" + optionPriority3 + ")=" + map.get(optionPriority3) + ", conflicting (" + optionPriority + ")=" + obj);
    }
}
