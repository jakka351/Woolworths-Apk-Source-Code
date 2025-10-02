package au.com.woolworths.android.onesite.modules.main;

import android.view.MenuItem;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.bottomnav.BottomNavAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.main.MainActivity;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Consumer, BottomNavigationView.OnNavigationItemSelectedListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
    public boolean a(MenuItem item) {
        Object next;
        MainActivity mainActivity = (MainActivity) this.e;
        MainContract.MainPage mainPage = MainActivity.R;
        Intrinsics.h(item, "item");
        boolean zU = mainActivity.getSupportFragmentManager().U();
        boolean z = !zU;
        if (zU) {
            return z;
        }
        MainContract.MainPage.Companion companion = MainContract.MainPage.d;
        int itemId = item.getItemId();
        companion.getClass();
        Iterator it = ((AbstractList) MainContract.MainPage.h).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MainContract.MainPage) next).b() == itemId) {
                break;
            }
        }
        MainContract.MainPage mainPage2 = (MainContract.MainPage) next;
        if (mainPage2 == null) {
            throw new IllegalArgumentException("Menu item id not recognised");
        }
        AnalyticsManager analyticsManagerO4 = mainActivity.O4();
        MainContract.MainPage mainPage3 = mainActivity.K;
        if (mainPage3 == null) {
            Intrinsics.p("currentPage");
            throw null;
        }
        String d = mainPage3.a().getD();
        MainContract.MainPage mainPage4 = mainActivity.K;
        if (mainPage4 == null) {
            Intrinsics.p("currentPage");
            throw null;
        }
        BottomNavAnalytics.BottomNav bottomNav = new BottomNavAnalytics.BottomNav(d, mainPage4.a().getE());
        final String strValueOf = String.valueOf(item.getTitle());
        final BottomNavAnalytics.BottomNav.Action action = bottomNav.h;
        action.getClass();
        analyticsManagerO4.g(new Event(action, strValueOf) { // from class: au.com.woolworths.analytics.supers.bottomnav.BottomNavAnalytics$BottomNav$Action$bottomNavTap$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4029a.g);
                spreadBuilder.a(new Pair("event.Category", "nav_bottom"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.y("event.Label", strValueOf, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "nav_bottom_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "nav_bottom_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        mainActivity.Z4(mainPage2);
        return z;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                MainContract.MainPage mainPage = MainActivity.R;
                ((MainActivity.AnonymousClass1) ((Function1) obj2)).invoke(obj);
                break;
            case 1:
            default:
                ((g) obj2).invoke(obj);
                break;
            case 2:
                ((g) obj2).invoke(obj);
                break;
            case 3:
                ((g) obj2).invoke(obj);
                break;
        }
    }
}
