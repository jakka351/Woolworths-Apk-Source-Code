package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;

@KeepForSdk
@WorkerThread
/* loaded from: classes6.dex */
public class ModelLoader {

    @KeepForSdk
    public interface ModelContentHandler {
    }

    @KeepForSdk
    public interface ModelLoadingLogger {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @KeepForSdk
    public static final class ModelLoadingState {
        public static final /* synthetic */ ModelLoadingState[] d = {new ModelLoadingState("NO_MODEL_LOADED", 0), new ModelLoadingState("REMOTE_MODEL_LOADED", 1), new ModelLoadingState("LOCAL_MODEL_LOADED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ModelLoadingState EF5;

        @NonNull
        public static ModelLoadingState[] values() {
            return (ModelLoadingState[]) d.clone();
        }
    }

    static {
        new GmsLogger("ModelLoader", "");
    }
}
