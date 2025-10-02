package androidx.camera.core.impl;

import androidx.camera.core.impl.StateObservable;

/* loaded from: classes2.dex */
final class AutoValue_StateObservable_ErrorWrapper extends StateObservable.ErrorWrapper {
    @Override // androidx.camera.core.impl.StateObservable.ErrorWrapper
    public final Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateObservable.ErrorWrapper)) {
            return false;
        }
        ((StateObservable.ErrorWrapper) obj).a();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + ((Object) null) + "}";
    }
}
