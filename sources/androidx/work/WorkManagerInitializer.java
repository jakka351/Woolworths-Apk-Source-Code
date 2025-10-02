package androidx.work;

import android.content.Context;
import androidx.startup.Initializer;
import androidx.work.Configuration;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class WorkManagerInitializer implements Initializer<WorkManager> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3910a = Logger.g("WrkMgrInitializer");

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Logger.e().a(f3910a, "Initializing WorkManager with default configuration.");
        Configuration configuration = new Configuration(new Configuration.Builder());
        Intrinsics.h(context, "context");
        WorkManagerImpl.f(context, configuration);
        return WorkManager.Companion.a(context);
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
