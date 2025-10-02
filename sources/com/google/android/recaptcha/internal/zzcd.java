package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.io.FilesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzcd {
    public zzcd(@NotNull Context context) {
    }

    @NotNull
    public static final byte[] zza(@NotNull File file) throws GeneralSecurityException, IOException {
        return FilesKt.d(file);
    }

    public static final void zzb(@NotNull File file, @NotNull byte[] bArr) throws GeneralSecurityException, IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        FilesKt.g(file, bArr);
    }
}
