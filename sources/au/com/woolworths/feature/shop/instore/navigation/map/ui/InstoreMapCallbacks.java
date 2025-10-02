package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientAppEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapCallbacks;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InstoreMapCallbacks {
    void a(OriientAppEvent oriientAppEvent);

    void b();

    void c(MapAnalyticsEvent mapAnalyticsEvent);

    void d();

    void e();

    void f(OriientError oriientError);

    void g();

    void h();

    void i(int i);

    void j(Floor floor);

    void k(InstoreMapErrorState instoreMapErrorState);

    void l();

    void m();

    void n();

    void o();

    void p();

    void q();
}
