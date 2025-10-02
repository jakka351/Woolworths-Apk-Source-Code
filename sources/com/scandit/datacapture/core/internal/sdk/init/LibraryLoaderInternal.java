package com.scandit.datacapture.core.internal.sdk.init;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.scandit.datacapture.core.J3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ!\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH&¢\u0006\u0002\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoader;", "loadingFailed", "", "getLoadingFailed", "()Z", "loadLibsIfNeeded", "soLibNames", "", "", "([Ljava/lang/String;)Z", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LibraryLoaderInternal extends LibraryLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f18710a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "getOrCreateInstance", "<set-?>", "b", "Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "getInstance$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "instance", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18710a = new Companion();
        private static /* synthetic */ J3 b;

        private Companion() {
        }

        @Nullable
        public final LibraryLoaderInternal getInstance$scandit_capture_core() {
            return b;
        }

        @NotNull
        public final synchronized LibraryLoaderInternal getOrCreateInstance(@NotNull Context context) {
            J3 j3;
            try {
                Intrinsics.h(context, "context");
                j3 = b;
                if (j3 == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.g(applicationContext, "context.applicationContext");
                    ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    Intrinsics.g(applicationInfo, "if (Build.VERSION.SDK_IN…      )\n                }");
                    Bundle bundle = applicationInfo.metaData;
                    j3 = new J3(applicationContext, bundle != null ? bundle.getBoolean("com.scandit.core.LoadingAllowedToFail", false) : false);
                    b = j3;
                }
            } catch (Throwable th) {
                throw th;
            }
            return j3;
        }
    }

    boolean getLoadingFailed();

    boolean loadLibsIfNeeded(@NotNull String... soLibNames);
}
