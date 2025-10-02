package au.com.woolworths.android.onesite.navigation;

import android.content.Intent;
import au.com.woolworths.android.onesite.modules.common.Region;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityNavigatorKt {

    /* renamed from: a, reason: collision with root package name */
    public static Region f4556a = Region.i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ApplicationType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ApplicationType applicationType = ApplicationType.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final Intent a(AddressableActivity addressableActivity, ApplicationType applicationType) {
        String str;
        Intrinsics.h(addressableActivity, "addressableActivity");
        Intrinsics.h(applicationType, "applicationType");
        Intent intent = new Intent("android.intent.action.VIEW");
        int iOrdinal = applicationType.ordinal();
        if (iOrdinal == 0) {
            str = "com.woolworths.rewards";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal2 = f4556a.ordinal();
            if (iOrdinal2 == 0) {
                str = "com.woolworths";
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "nz.co.countdown.android.pickup";
            }
        }
        Intent className = intent.setClassName(str, addressableActivity.a());
        Intrinsics.g(className, "setClassName(...)");
        return className;
    }
}
