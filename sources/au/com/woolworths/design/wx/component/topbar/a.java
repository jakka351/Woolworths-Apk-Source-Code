package au.com.woolworths.design.wx.component.topbar;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LazyListState e;

    public /* synthetic */ a(LazyListState lazyListState, int i) {
        this.d = i;
        this.e = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        int f1015a;
        switch (this.d) {
            case 0:
                if (this.e.h() == 0) {
                    Dp dp = new Dp(r0.i());
                    Dp dp2 = new Dp(TopBarConstants.b);
                    if (dp.compareTo(dp2) > 0) {
                        dp = dp2;
                    }
                    f = dp.d;
                } else {
                    f = TopBarConstants.b;
                }
                break;
            case 3:
                LazyListState lazyListState = this.e;
                List listF = lazyListState.j().f();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
                    if (StringsKt.W(lazyListItemInfo.getL().toString(), "tab_header", false) || StringsKt.W(lazyListItemInfo.getL().toString(), "product_header", false)) {
                        arrayList.add(obj);
                    }
                }
                int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) it.next();
                    linkedHashMap.put(lazyListItemInfo2.getL(), Boolean.valueOf(lazyListItemInfo2.getF996a() <= lazyListState.h()));
                }
                break;
            case 4:
                LazyListState lazyListState2 = this.e;
                if (!lazyListState2.d()) {
                    LazyListState.k(lazyListState2);
                }
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                LazyListLayoutInfo lazyListLayoutInfoJ = this.e.j();
                List listF2 = lazyListLayoutInfoJ.f();
                if (listF2.isEmpty()) {
                    f1015a = -1;
                } else {
                    ArrayList arrayListJ0 = CollectionsKt.J0(listF2);
                    LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) CollectionsKt.O(arrayListJ0);
                    if (lazyListItemInfo3.getQ() + lazyListItemInfo3.getP() > lazyListLayoutInfoJ.getL() + lazyListLayoutInfoJ.getM() && arrayListJ0.size() > 1) {
                        arrayListJ0.remove(CollectionsKt.I(arrayListJ0));
                    }
                    f1015a = ((LazyListItemInfo) CollectionsKt.O(arrayListJ0)).getF996a();
                }
                break;
        }
        return Boolean.valueOf(this.e.h.a());
    }
}
