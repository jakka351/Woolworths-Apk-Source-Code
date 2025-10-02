package com.woolworths.scanlibrary.data.source.local.persistent;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/data/source/local/persistent/ScanAndGoLaunchPersistent;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ScanAndGoLaunchPersistent {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f21162a;
    public final SharedPreferences b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/data/source/local/persistent/ScanAndGoLaunchPersistent$Companion;", "", "", "PREFS_USER_DATA", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ScanAndGoLaunchPersistent(SharedPreferences preferences, Gson gson) {
        Intrinsics.h(preferences, "preferences");
        this.f21162a = gson;
        this.b = preferences;
    }
}
