package com.scandit.datacapture.core;

import android.content.Context;
import android.widget.Toast;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.init.LibraryLoaderInternal;
import com.scandit.datacapture.core.internal.sdk.init.LoadMethod;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J3 implements LibraryLoaderInternal {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18331a;
    private final boolean b;
    private final StringBuilder c;
    private final List d;
    private final File e;
    private final File f;
    private final String g;
    private final File h;
    private boolean i;
    private final LinkedHashMap j;

    public J3(Context context, boolean z) {
        Intrinsics.h(context, "context");
        this.f18331a = context;
        this.b = z;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        List listL0 = ArraysKt.l0(appAndroidEnvironment.getSupportedAbis());
        this.d = listL0;
        String strA = K3.a(context);
        File file = new File(strA);
        this.e = file;
        File file2 = new File(file, "lib");
        this.f = file2;
        this.g = file2.getAbsolutePath();
        File fileB = K3.b(context);
        this.h = fileB;
        String absolutePath = fileB.getAbsolutePath();
        this.j = new LinkedHashMap();
        a("----------------------------------------");
        a("Base data");
        a("\tarchs -> " + CollectionsKt.M(listL0, null, null, null, null, 63));
        a("\tinstaller info -> " + appAndroidEnvironment.getInstallerInfo(context));
        a(YU.a.A("\tinstallPath -> ", strA));
        a(YU.a.A("\textractionLibPath -> ", absolutePath));
        a("----------------------------------------");
        a("Installation dir content:");
        AbstractC0970b7.a(sb, file, 0).append('\n');
        a("----------------------------------------");
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoader
    public final String buildLogs() {
        String string = this.c.toString();
        Intrinsics.g(string, "logsBuffer.toString()");
        return string;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoader
    public final void clearLogs() {
        StringBuilder sb = this.c;
        Intrinsics.h(sb, "<this>");
        sb.setLength(0);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoader
    public final synchronized Map getLoadedLibs() {
        return this.j;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoaderInternal
    public final boolean getLoadingFailed() {
        return this.i;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoader
    public final synchronized boolean getWorkaroundApplied() {
        boolean z;
        Map loadedLibs = getLoadedLibs();
        if (!loadedLibs.isEmpty()) {
            Iterator it = ((LinkedHashMap) loadedLibs).entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() != LoadMethod.BY_SO_NAME) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoaderInternal
    public final synchronized boolean loadLibsIfNeeded(String... soLibNames) {
        boolean z;
        try {
            Intrinsics.h(soLibNames, "soLibNames");
            ArrayList arrayList = new ArrayList();
            for (String str : soLibNames) {
                if (!getLoadedLibs().containsKey(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            a("Requested loading of " + CollectionsKt.M(arrayList, null, null, null, null, 63));
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String soLibName = (String) it.next();
                    a("Loading " + soLibName);
                    a("\tTrying System.loadLibrary");
                    F3 f3 = new F3(this);
                    Intrinsics.h(soLibName, "soLibName");
                    try {
                        System.loadLibrary(soLibName);
                        f3.invoke("\t\tSystem.loadLibrary(" + soLibName + ") succeeded");
                        getLoadedLibs().put(soLibName, LoadMethod.BY_SO_NAME);
                    } catch (Throwable th) {
                        f3.invoke("\t\tSystem.loadLibrary(" + soLibName + ") failed with message: " + th.getMessage());
                        StringBuilder sb = new StringBuilder("lib");
                        sb.append(soLibName);
                        sb.append(".so");
                        String string = sb.toString();
                        a("\tTrying System.load with path \"" + this.g + "/<arch>/" + string + '\"');
                        if (!N3.a(this.f, string, this.d, new G3(this))) {
                            a("\tTrying to check for lib/<arch>/" + string + " in local apk file");
                            if (!L3.a(this.e, this.h, string, this.d, new I3(this))) {
                                a("\tTrying System.load with direct " + this.g + "/arm64 path");
                                if (!M3.a(this.f, string, new H3(this))) {
                                    z = false;
                                    break;
                                }
                                getLoadedLibs().put(soLibName, LoadMethod.FROM_DIRECT_ARM64_LIB_FOLDER);
                            } else {
                                getLoadedLibs().put(soLibName, LoadMethod.FROM_APK_EXTRACTION);
                            }
                        } else {
                            getLoadedLibs().put(soLibName, LoadMethod.FROM_LOCAL_LIB_FOLDER);
                        }
                    }
                }
            }
            z = true;
            a("Total elapsed time: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            if (!z) {
                this.i = true;
                if (!this.b) {
                    Context context = this.f18331a;
                    Toast.makeText(this.f18331a, context.getString(R.string.sc_try_reinstall, context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()), 0).show();
                    throw new UnsatisfiedLinkError("Failed to locate and load native libraries. It is likely that they have not been distributed correctly. To resolve this issue try deleting and reinstalling the app.\n" + buildLogs());
                }
            }
            a("----------------------------------------");
            return z;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        StringBuilder sb = this.c;
        sb.append(str);
        sb.append('\n');
    }
}
