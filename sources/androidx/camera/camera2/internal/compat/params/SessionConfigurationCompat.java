package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class SessionConfigurationCompat {

    /* renamed from: a, reason: collision with root package name */
    public final SessionConfigurationCompatApi28Impl f321a;

    @RequiresApi
    public static final class SessionConfigurationCompatApi28Impl implements SessionConfigurationCompatImpl {

        /* renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f322a;
        public final List b;

        public SessionConfigurationCompatApi28Impl(ArrayList arrayList, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((OutputConfiguration) ((OutputConfigurationCompat) it.next()).f315a.g());
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList2, executor, stateCallback);
            this.f322a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList3 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration outputConfiguration : outputConfigurations) {
                arrayList3.add(outputConfiguration == null ? null : new OutputConfigurationCompat(Build.VERSION.SDK_INT >= 33 ? new OutputConfigurationCompatApi33Impl(outputConfiguration) : new OutputConfigurationCompatApi28Impl(new OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28(outputConfiguration))));
            }
            this.b = Collections.unmodifiableList(arrayList3);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SessionConfigurationCompatApi28Impl)) {
                return false;
            }
            return Objects.equals(this.f322a, ((SessionConfigurationCompatApi28Impl) obj).f322a);
        }

        public final int hashCode() {
            return this.f322a.hashCode();
        }
    }

    public static final class SessionConfigurationCompatBaseImpl implements SessionConfigurationCompatImpl {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SessionConfigurationCompatBaseImpl) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public interface SessionConfigurationCompatImpl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface SessionMode {
    }

    public SessionConfigurationCompat(ArrayList arrayList, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f321a = new SessionConfigurationCompatApi28Impl(arrayList, executor, stateCallback);
    }

    public final void a(InputConfigurationCompat inputConfigurationCompat) {
        this.f321a.f322a.setInputConfiguration(inputConfigurationCompat.f313a.f314a);
    }

    public final void b(CaptureRequest captureRequest) {
        this.f321a.f322a.setSessionParameters(captureRequest);
    }

    public final SessionConfiguration c() {
        return this.f321a.f322a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionConfigurationCompat)) {
            return false;
        }
        return this.f321a.equals(((SessionConfigurationCompat) obj).f321a);
    }

    public final int hashCode() {
        return this.f321a.f322a.hashCode();
    }
}
