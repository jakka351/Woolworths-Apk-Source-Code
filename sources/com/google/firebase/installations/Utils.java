package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Utils {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static Utils d;

    /* renamed from: a, reason: collision with root package name */
    public final Clock f15617a;

    public Utils(SystemClock systemClock) {
        this.f15617a = systemClock;
    }

    public final boolean a(PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.a())) {
            return true;
        }
        return persistedInstallationEntry.b() + persistedInstallationEntry.g() < TimeUnit.MILLISECONDS.toSeconds(this.f15617a.currentTimeMillis()) + b;
    }
}
