package au.com.woolworths.shop.buyagain.ui.legacy;

import androidx.navigation.ui.AppBarConfiguration;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes4.dex */
public final class BuyAgainFragmentLegacy$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 implements AppBarConfiguration.OnNavigateUpListener, FunctionAdapter {
    @Override // androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener
    public final /* synthetic */ boolean a() {
        return Boolean.FALSE.booleanValue();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return BuyAgainFragmentLegacy$onViewCreated$lambda$9$lambda$7$$inlined$AppBarConfiguration$default$1.d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AppBarConfiguration.OnNavigateUpListener) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
