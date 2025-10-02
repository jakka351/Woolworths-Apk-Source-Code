package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import androidx.camera.core.impl.Quirk;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements Quirk {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f331a;

    static {
        HashSet hashSet = new HashSet();
        f331a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
