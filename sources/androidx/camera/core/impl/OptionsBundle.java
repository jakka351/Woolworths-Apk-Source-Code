package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class OptionsBundle implements Config {
    public static final androidx.browser.trusted.a H;
    public static final OptionsBundle I;
    public final TreeMap G;

    static {
        androidx.browser.trusted.a aVar = new androidx.browser.trusted.a(1);
        H = aVar;
        I = new OptionsBundle(new TreeMap(aVar));
    }

    public OptionsBundle(TreeMap treeMap) {
        this.G = treeMap;
    }

    public static OptionsBundle U(Config config) {
        if (OptionsBundle.class.equals(config.getClass())) {
            return (OptionsBundle) config;
        }
        TreeMap treeMap = new TreeMap(H);
        for (Config.Option option : config.f()) {
            Set<Config.OptionPriority> setB = config.b(option);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : setB) {
                arrayMap.put(optionPriority, config.e(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new OptionsBundle(treeMap);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object a(Config.Option option) {
        Map map = (Map) this.G.get(option);
        if (map != null) {
            return map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + option);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set b(Config.Option option) {
        Map map = (Map) this.G.get(option);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public final Object c(Config.Option option, Object obj) {
        try {
            return a(option);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean d(Config.Option option) {
        return this.G.containsKey(option);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object e(Config.Option option, Config.OptionPriority optionPriority) {
        Map map = (Map) this.G.get(option);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + option);
        }
        if (map.containsKey(optionPriority)) {
            return map.get(optionPriority);
        }
        throw new IllegalArgumentException("Option does not exist: " + option + " with priority=" + optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set f() {
        return Collections.unmodifiableSet(this.G.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public final void g(androidx.camera.camera2.interop.e eVar) {
        for (Map.Entry entry : this.G.tailMap(new AutoValue_Config_Option(Void.class, null, "camera2.captureRequest.option.")).entrySet()) {
            if (!((Config.Option) entry.getKey()).c().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            Config.Option option = (Config.Option) entry.getKey();
            CaptureRequestOptions.Builder builder = (CaptureRequestOptions.Builder) eVar.e;
            Config config = (Config) eVar.f;
            builder.f383a.X(option, config.h(option), config.a(option));
        }
    }

    @Override // androidx.camera.core.impl.Config
    public final Config.OptionPriority h(Config.Option option) {
        Map map = (Map) this.G.get(option);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + option);
    }
}
