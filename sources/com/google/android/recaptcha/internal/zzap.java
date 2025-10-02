package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzap {
    @NotNull
    public static final String zza(@NotNull ContentResolver contentResolver) {
        Cursor cursorQuery = contentResolver.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{nnlllnn.nnlllln.w007700770077www}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
            return "";
        }
        String strValueOf = String.valueOf(Long.parseLong(cursorQuery.getString(1)));
        cursorQuery.close();
        return strValueOf;
    }
}
