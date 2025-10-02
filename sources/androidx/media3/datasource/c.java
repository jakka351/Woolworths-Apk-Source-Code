package androidx.media3.datasource;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.window.SurfaceSyncGroup;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ Class C() {
        return AdSelectionManager.class;
    }

    public static /* bridge */ /* synthetic */ AdId a(Object obj) {
        return (AdId) obj;
    }

    public static /* bridge */ /* synthetic */ AdIdManager c(Object obj) {
        return (AdIdManager) obj;
    }

    public static /* synthetic */ AdSelectionConfig.Builder d() {
        return new AdSelectionConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ AdSelectionManager l(Object obj) {
        return (AdSelectionManager) obj;
    }

    public static /* bridge */ /* synthetic */ AdSelectionOutcome m(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    public static /* synthetic */ SurfaceSyncGroup n() {
        return new SurfaceSyncGroup("exo-sync-b-334901521");
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return AdIdManager.class;
    }

    public static /* bridge */ /* synthetic */ void x(Object obj) {
    }
}
