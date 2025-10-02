package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class InputConfigurationCompat {

    /* renamed from: a, reason: collision with root package name */
    public final InputConfigurationCompatApi23Impl f313a;

    @RequiresApi
    public static class InputConfigurationCompatApi23Impl implements InputConfigurationCompatImpl {

        /* renamed from: a, reason: collision with root package name */
        public final InputConfiguration f314a;

        public InputConfigurationCompatApi23Impl(Object obj) {
            this.f314a = (InputConfiguration) obj;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public final Object a() {
            return this.f314a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InputConfigurationCompatImpl)) {
                return false;
            }
            return Objects.equals(this.f314a, ((InputConfigurationCompatImpl) obj).a());
        }

        public final int hashCode() {
            return this.f314a.hashCode();
        }

        public final String toString() {
            return this.f314a.toString();
        }
    }

    @RequiresApi
    public static final class InputConfigurationCompatApi31Impl extends InputConfigurationCompatApi23Impl {
    }

    @VisibleForTesting
    public static final class InputConfigurationCompatBaseImpl implements InputConfigurationCompatImpl {
        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public final Object a() {
            return null;
        }

        public final boolean equals(Object obj) {
            return obj instanceof InputConfigurationCompatBaseImpl;
        }

        public final int hashCode() {
            return 29791;
        }

        public final String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", 0, 0, 0);
        }
    }

    public interface InputConfigurationCompatImpl {
        Object a();
    }

    public InputConfigurationCompat(InputConfigurationCompatApi23Impl inputConfigurationCompatApi23Impl) {
        this.f313a = inputConfigurationCompatApi23Impl;
    }

    public static InputConfigurationCompat a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new InputConfigurationCompat(new InputConfigurationCompatApi31Impl(obj)) : new InputConfigurationCompat(new InputConfigurationCompatApi23Impl(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InputConfigurationCompat)) {
            return false;
        }
        return this.f313a.equals(((InputConfigurationCompat) obj).f313a);
    }

    public final int hashCode() {
        return this.f313a.hashCode();
    }

    public final String toString() {
        return this.f313a.toString();
    }
}
