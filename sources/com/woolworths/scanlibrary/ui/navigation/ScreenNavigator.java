package com.woolworths.scanlibrary.ui.navigation;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivity;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/navigation/ScreenNavigator;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ScreenNavigator {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f21278a;

    public ScreenNavigator(FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f21278a = featureToggleManager;
    }

    public final void a(Activity activity, String str) {
        if (this.f21278a.c(BaseShopAppFeature.U)) {
            int i = ScannerActivity.x;
            Intent intent = new Intent(activity, (Class<?>) ScannerActivity.class);
            intent.addFlags(67108864);
            activity.startActivityForResult(intent, 1000);
            return;
        }
        Pair[] pairArr = {new Pair("eanItemWeightRequired", str)};
        Intent intent2 = new Intent(activity, (Class<?>) ScannerActivityOld.class);
        intent2.addFlags(67108864);
        intent2.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
        activity.startActivityForResult(intent2, 1000);
        activity.overridePendingTransition(0, 0);
    }
}
