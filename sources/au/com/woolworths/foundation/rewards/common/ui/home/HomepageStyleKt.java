package au.com.woolworths.foundation.rewards.common.ui.home;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import au.com.woolworths.feature.shop.bundles.ui.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HomepageStyleKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f8583a = new StaticProvidableCompositionLocal(new a(17));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[HomepageStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HomepageStyle homepageStyle = HomepageStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final float a(HomepageStyle homepageStyle) {
        int i;
        Intrinsics.h(homepageStyle, "<this>");
        int iOrdinal = homepageStyle.ordinal();
        if (iOrdinal == 0) {
            i = 2;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        return i;
    }
}
