package com.tealium.core;

import android.app.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/JsonLoader;", "Lcom/tealium/core/Loader;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class JsonLoader implements Loader {
    public static final Companion b = new Companion();
    public static volatile JsonLoader c;

    /* renamed from: a, reason: collision with root package name */
    public final Application f19123a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/JsonLoader$Companion;", "", "Lcom/tealium/core/JsonLoader;", "instance", "Lcom/tealium/core/JsonLoader;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public JsonLoader(Application application) {
        Intrinsics.h(application, "application");
        this.f19123a = application;
    }

    @Override // com.tealium.core.Loader
    public final String a(String fileName) throws IOException {
        Intrinsics.h(fileName, "fileName");
        try {
            InputStream inputStreamOpen = this.f19123a.getAssets().open(fileName);
            Intrinsics.g(inputStreamOpen, "application.assets.open(fileName)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.f24671a), 8192);
            try {
                String strB = TextStreamsKt.b(bufferedReader);
                bufferedReader.close();
                return strB;
            } finally {
            }
        } catch (IOException unused) {
            Logger.f19124a.h("Tealium-1.6.0", "Asset not found (" + fileName + ")");
            return null;
        }
    }
}
