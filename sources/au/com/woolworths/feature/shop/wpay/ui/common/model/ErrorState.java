package au.com.woolworths.feature.shop.wpay.ui.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState;", "", "FullScreen", "SnackBar", "Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState$FullScreen;", "Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState$SnackBar;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ErrorState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState$FullScreen;", "Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FullScreen implements ErrorState {

        /* renamed from: a, reason: collision with root package name */
        public static final FullScreen f8349a = new FullScreen();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState$SnackBar;", "Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SnackBar implements ErrorState {

        /* renamed from: a, reason: collision with root package name */
        public final int f8350a;

        public SnackBar(int i) {
            this.f8350a = i;
        }
    }

    default boolean a() {
        return this instanceof FullScreen;
    }

    default Integer b() {
        if (this instanceof SnackBar) {
            return Integer.valueOf(((SnackBar) this).f8350a);
        }
        return null;
    }
}
