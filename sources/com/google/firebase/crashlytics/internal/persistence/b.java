package com.google.firebase.crashlytics.internal.persistence;

import com.scandit.datacapture.core.L3;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15389a;

    public /* synthetic */ b(int i) {
        this.f15389a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f15389a) {
            case 0:
                Charset charset = CrashlyticsReportPersistence.e;
                return str.startsWith("event") && !str.endsWith("_");
            default:
                return L3.a(file, str);
        }
    }
}
