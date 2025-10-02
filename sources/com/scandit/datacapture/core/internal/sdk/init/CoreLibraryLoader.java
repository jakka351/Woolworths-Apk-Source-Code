package com.scandit.datacapture.core.internal.sdk.init;

import android.content.Context;
import com.scandit.datacapture.core.C0971c;
import com.scandit.datacapture.core.C1052l;
import com.scandit.datacapture.core.C1092p3;
import com.scandit.datacapture.core.C1153w1;
import com.scandit.datacapture.core.K1;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.internal.module.data.NativeDataDecodingFactory;
import com.scandit.datacapture.core.internal.module.device.NativeDeviceHolder;
import com.scandit.datacapture.core.internal.module.https.NativeHttps;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.ThreadCreatorImpl;
import com.scandit.datacapture.core.internal.sdk.localization.AndroidLocalizer;
import com.scandit.internal.sdk.bar.Filesystem;
import com.scandit.internal.sdk.bar.LocalizerHandler;
import com.scandit.internal.sdk.bar.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/CoreLibraryLoader;", "", "Landroid/content/Context;", "context", "", "ensureInitialized", "", "<set-?>", "a", "Z", "isInitialized$scandit_capture_core", "()Z", "isInitialized", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreLibraryLoader {

    @NotNull
    public static final CoreLibraryLoader INSTANCE = new CoreLibraryLoader();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static volatile boolean isInitialized;

    private CoreLibraryLoader() {
    }

    @JvmStatic
    public static final void ensureInitialized(@NotNull Context context) {
        Intrinsics.h(context, "context");
        if (LibraryLoaderInternal.INSTANCE.getOrCreateInstance(context).loadLibsIfNeeded("bar", "sdc-core")) {
            isInitialized = true;
            AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.g(applicationContext, "context.applicationContext");
            appAndroidEnvironment.setApplicationContext(applicationContext);
            ThreadFactory.setFactory(new ThreadCreatorImpl(context.getResources().getInteger(R.integer.scandit_thread_priority)));
            NativeDataDecodingFactory.setDataDecoding(new C1153w1());
            Filesystem.setInstance(new C0971c(context));
            LocalizerHandler.setDefaultLocalizer(new AndroidLocalizer(context));
            NativeHttps.setFactory(new C1092p3());
            NativeDeviceHolder.setCurrentDevice(new K1(new C1052l(context)));
        }
    }

    public final boolean isInitialized$scandit_capture_core() {
        return isInitialized;
    }
}
