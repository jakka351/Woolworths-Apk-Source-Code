package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public interface CameraConfig extends ReadableConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final Config.Option f472a = new AutoValue_Config_Option(UseCaseConfigFactory.class, null, "camerax.core.camera.useCaseConfigFactory");
    public static final Config.Option b;
    public static final Config.Option c;
    public static final Config.Option d;
    public static final Config.Option e;

    public interface Builder<B> {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequiredRule {
    }

    static {
        new AutoValue_Config_Option(Identifier.class, null, "camerax.core.camera.compatibilityId");
        b = new AutoValue_Config_Option(Integer.class, null, "camerax.core.camera.useCaseCombinationRequiredRule");
        c = new AutoValue_Config_Option(SessionProcessor.class, null, "camerax.core.camera.SessionProcessor");
        new AutoValue_Config_Option(Boolean.class, null, "camerax.core.camera.isZslDisabled");
        d = new AutoValue_Config_Option(Boolean.class, null, "camerax.core.camera.isPostviewSupported");
        e = new AutoValue_Config_Option(Boolean.class, null, "camerax.core.camera.isCaptureProcessProgressSupported");
    }

    Identifier C();

    default int I() {
        return ((Integer) c(b, 0)).intValue();
    }

    default SessionProcessor K() {
        return (SessionProcessor) c(c, null);
    }

    default void T() {
        ((Boolean) c(e, Boolean.FALSE)).getClass();
    }

    default UseCaseConfigFactory i() {
        return (UseCaseConfigFactory) c(f472a, UseCaseConfigFactory.f507a);
    }

    default void y() {
        ((Boolean) c(d, Boolean.FALSE)).getClass();
    }
}
