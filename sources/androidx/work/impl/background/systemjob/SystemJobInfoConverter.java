package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.SystemClock;

@RequiresApi
@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
class SystemJobInfoConverter {
    public static final String d = Logger.g("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f3956a;
    public final Clock b;
    public final boolean c;

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3957a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f3957a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3957a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3957a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3957a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3957a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SystemJobInfoConverter(Context context, SystemClock systemClock, boolean z) {
        this.b = systemClock;
        this.f3956a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }
}
