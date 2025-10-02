package au.com.woolworths.foundation.shared.instore.wifi;

import au.com.woolworths.foundation.shared.instore.wifi.config.OpenRoamingAppConfiguration;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shared/instore/wifi/InStoreWifiInteractor;", "", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface InStoreWifiInteractor {
    Object a(ContinuationImpl continuationImpl);

    String b();

    Object c(ContinuationImpl continuationImpl);

    boolean d();

    Object e(ContinuationImpl continuationImpl);

    Object f(DNASpacesBackgroundExceptionHandler dNASpacesBackgroundExceptionHandler, Continuation continuation);

    Flow g();

    void getVersion();

    Object h(ContinuationImpl continuationImpl);

    boolean i();

    OpenRoamingAppConfiguration j();

    Flow k();
}
