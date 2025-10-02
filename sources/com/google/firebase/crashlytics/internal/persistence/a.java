package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        Charset charset = CrashlyticsReportPersistence.e;
        return str.startsWith("event");
    }
}
