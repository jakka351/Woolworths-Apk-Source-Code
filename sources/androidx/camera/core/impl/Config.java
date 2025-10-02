package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import com.google.auto.value.AutoValue;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public interface Config {

    @AutoValue
    public static abstract class Option<T> {
        public static Option a(Class cls, String str) {
            return new AutoValue_Config_Option(cls, null, str);
        }

        public static Option b(String str, CaptureRequest.Key key) {
            return new AutoValue_Config_Option(Object.class, key, str);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class e();
    }

    public interface OptionMatcher {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OptionPriority {
        public static final OptionPriority d;
        public static final OptionPriority e;
        public static final OptionPriority f;
        public static final OptionPriority g;
        public static final /* synthetic */ OptionPriority[] h;

        static {
            OptionPriority optionPriority = new OptionPriority("ALWAYS_OVERRIDE", 0);
            d = optionPriority;
            OptionPriority optionPriority2 = new OptionPriority("HIGH_PRIORITY_REQUIRED", 1);
            e = optionPriority2;
            OptionPriority optionPriority3 = new OptionPriority("REQUIRED", 2);
            f = optionPriority3;
            OptionPriority optionPriority4 = new OptionPriority("OPTIONAL", 3);
            g = optionPriority4;
            h = new OptionPriority[]{optionPriority, optionPriority2, optionPriority3, optionPriority4};
        }

        public static OptionPriority valueOf(String str) {
            return (OptionPriority) Enum.valueOf(OptionPriority.class, str);
        }

        public static OptionPriority[] values() {
            return (OptionPriority[]) h.clone();
        }
    }

    static OptionsBundle R(Config config, Config config2) {
        if (config == null && config2 == null) {
            return OptionsBundle.I;
        }
        MutableOptionsBundle mutableOptionsBundleW = config2 != null ? MutableOptionsBundle.W(config2) : MutableOptionsBundle.V();
        if (config != null) {
            Iterator it = config.f().iterator();
            while (it.hasNext()) {
                t(mutableOptionsBundleW, config2, config, (Option) it.next());
            }
        }
        return OptionsBundle.U(mutableOptionsBundleW);
    }

    static void t(MutableOptionsBundle mutableOptionsBundle, Config config, Config config2, Option option) {
        if (!Objects.equals(option, ImageOutputConfig.p)) {
            mutableOptionsBundle.X(option, config2.h(option), config2.a(option));
            return;
        }
        ResolutionSelector resolutionSelectorA = (ResolutionSelector) config2.c(option, null);
        ResolutionSelector resolutionSelector = (ResolutionSelector) config.c(option, null);
        OptionPriority optionPriorityH = config2.h(option);
        if (resolutionSelectorA == null) {
            resolutionSelectorA = resolutionSelector;
        } else if (resolutionSelector != null) {
            ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
            builder.f565a = resolutionSelector.f564a;
            builder.b = resolutionSelector.b;
            builder.c = resolutionSelector.c;
            AspectRatioStrategy aspectRatioStrategy = resolutionSelectorA.f564a;
            if (aspectRatioStrategy != null) {
                builder.f565a = aspectRatioStrategy;
            }
            ResolutionStrategy resolutionStrategy = resolutionSelectorA.b;
            if (resolutionStrategy != null) {
                builder.b = resolutionStrategy;
            }
            ResolutionFilter resolutionFilter = resolutionSelectorA.c;
            if (resolutionFilter != null) {
                builder.c = resolutionFilter;
            }
            resolutionSelectorA = builder.a();
        }
        mutableOptionsBundle.X(option, optionPriorityH, resolutionSelectorA);
    }

    Object a(Option option);

    Set b(Option option);

    Object c(Option option, Object obj);

    boolean d(Option option);

    Object e(Option option, OptionPriority optionPriority);

    Set f();

    void g(androidx.camera.camera2.interop.e eVar);

    OptionPriority h(Option option);
}
