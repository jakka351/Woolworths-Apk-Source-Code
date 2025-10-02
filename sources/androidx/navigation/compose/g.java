package androidx.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return NavHostControllerKt__NavHostController_androidKt.a((Context) this.e);
            default:
                List list = (List) ((State) this.e).getD();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.c(((NavBackStackEntry) obj).e.d, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }
}
