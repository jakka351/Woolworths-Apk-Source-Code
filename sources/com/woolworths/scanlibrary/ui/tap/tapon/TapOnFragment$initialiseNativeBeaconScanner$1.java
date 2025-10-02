package com.woolworths.scanlibrary.ui.tap.tapon;

import androidx.fragment.app.FragmentActivity;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract;
import com.woolworths.scanlibrary.util.beacon.Beacon;
import com.woolworths.scanlibrary.util.beacon.BeaconListener;
import com.woolworths.scanlibrary.util.beacon.BeaconScannerError;
import com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/woolworths/scanlibrary/ui/tap/tapon/TapOnFragment$initialiseNativeBeaconScanner$1", "Lcom/woolworths/scanlibrary/util/beacon/BeaconListener;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapOnFragment$initialiseNativeBeaconScanner$1 implements BeaconListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnFragment f21356a;

    public TapOnFragment$initialiseNativeBeaconScanner$1(TapOnFragment tapOnFragment) {
        this.f21356a = tapOnFragment;
    }

    public final void a(List beacons) {
        Intrinsics.h(beacons, "beacons");
        if (beacons.isEmpty()) {
            return;
        }
        TapOnFragment tapOnFragment = this.f21356a;
        ((BlueCatsBeaconScanner) tapOnFragment.i2()).e();
        String str = tapOnFragment.l;
        if (str == null) {
            Intrinsics.p("mockBeaconId");
            throw null;
        }
        if (StringsKt.D(str)) {
            ((TapOnContract.Presenter) tapOnFragment.Q1()).w0();
        }
        Beacon beacon = (Beacon) beacons.get(0);
        if (tapOnFragment.q) {
            tapOnFragment.x.set(true);
            FragmentActivity activity = tapOnFragment.getActivity();
            if (activity != null) {
                AppCompatActivityExtKt.h(activity);
            }
            ((TapOnContract.Presenter) tapOnFragment.Q1()).a0();
            ((TapOnContract.Presenter) tapOnFragment.Q1()).Y();
            ((TapOnContract.Presenter) tapOnFragment.Q1()).b0(beacon.f21361a);
        }
    }

    public final void b(BeaconScannerError beaconScannerError) {
        Timber.f27013a.h("Native beacon scanning error: " + beaconScannerError, new Object[0]);
    }
}
