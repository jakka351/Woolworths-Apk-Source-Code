package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes6.dex */
public interface ModelValidator {

    @KeepForSdk
    public static class ValidationResult {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @KeepForSdk
        public static final class ErrorCode {
            public static final /* synthetic */ ErrorCode[] d = {new ErrorCode("OK", 0), new ErrorCode("TFLITE_VERSION_INCOMPATIBLE", 1), new ErrorCode("MODEL_FORMAT_INVALID", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            ErrorCode EF5;

            @NonNull
            public static ErrorCode[] values() {
                return (ErrorCode[]) d.clone();
            }
        }
    }
}
