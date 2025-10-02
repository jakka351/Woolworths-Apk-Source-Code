package au.com.woolworths.scanandgo.launcher;

import au.com.woolworths.scanandgo.launcher.errors.SngFetchErrorState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/scanandgo/launcher/ScanAndGoLauncherImpl;", "Lau/com/woolworths/scanandgo/launcher/ScanAndGoLauncher;", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScanAndGoLauncherImpl implements ScanAndGoLauncher {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SngFetchErrorState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SngFetchErrorState[] sngFetchErrorStateArr = SngFetchErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        throw null;
    }
}
